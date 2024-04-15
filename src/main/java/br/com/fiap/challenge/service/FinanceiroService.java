package br.com.fiap.challenge.service;

import br.com.fiap.challenge.dto.request.FinanceiroRequest;
import br.com.fiap.challenge.dto.response.FinanceiroResponse;
import br.com.fiap.challenge.entity.Financeiro;
import br.com.fiap.challenge.repository.FinanceiroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class FinanceiroService {

    private final FinanceiroRepository financeiroRepository;

    public FinanceiroResponse createFinanceiro(FinanceiroRequest request) {
        Financeiro financeiro = mapFinanceiroRequestToEntity(request);
        financeiro = financeiroRepository.save(financeiro);
        return mapFinanceiroToResponse(financeiro);
    }

    public FinanceiroResponse getFinanceiroById(Long id) {
        Financeiro financeiro = financeiroRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Financeiro não encontrado"));
        return mapFinanceiroToResponse(financeiro);
    }

    private Financeiro mapFinanceiroRequestToEntity(FinanceiroRequest request) {
        return Financeiro.builder()
                .rendaMensal(request.getRendaMensal())
                .fonteRenda(request.getFonteRenda())
                .tipoEmprego(request.getTipoEmprego())
                .infoContaBancaria(request.getInfoContaBancaria())
                .historicoEmprestimo(request.getHistoricoEmprestimo())
                .historicoPagamento(request.getHistoricoPagamento())
                .build();
    }

    private FinanceiroResponse mapFinanceiroToResponse(Financeiro financeiro) {
        return new FinanceiroResponse(
                financeiro.getId(),
                financeiro.getRendaMensal(),
                financeiro.getFonteRenda(),
                financeiro.getTipoEmprego(),
                financeiro.getInfoContaBancaria(),
                financeiro.getHistoricoEmprestimo(),
                financeiro.getHistoricoPagamento()
        );
    }
}
