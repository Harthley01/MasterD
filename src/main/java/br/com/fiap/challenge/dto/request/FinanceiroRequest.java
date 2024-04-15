package br.com.fiap.challenge.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FinanceiroRequest {

    @NotNull(message = "O atributo rendaMensal é obrigatório")
    private double rendaMensal;

    @NotBlank(message = "O atributo fonteRenda é obrigatório")
    @NotNull(message = "O atributo fonteRenda é obrigatório")
    private String fonteRenda;

    @NotBlank(message = "O atributo tipoEmprego é obrigatório")
    @NotNull(message = "O atributo tipoEmprego é obrigatório")
    private String tipoEmprego;

    private String infoContaBancaria;

    private String historicoEmprestimo;

    private String historicoPagamento;

    public double getRendaMensal() {
        return rendaMensal;
    }

    public String getFonteRenda() {
        return fonteRenda;
    }

    public String getTipoEmprego() {
        return tipoEmprego;
    }

    public String getInfoContaBancaria() {
        return infoContaBancaria;
    }

    public String getHistoricoEmprestimo() {
        return historicoEmprestimo;
    }

    public String getHistoricoPagamento() {
        return historicoPagamento;
    }
}
