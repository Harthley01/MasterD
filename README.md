# MasterD

<h1>Nome dos integrantes e suas respectivas funções</h1>
<ul>
  <li>Harthley Fernandes Teixeira Gomes -  Função -  Realizar Projeto Java e Devops tools</li>
  <li>João Vito Santiago da Silva - Função -  Realizar DataBase e Projeto Java</li>
  <li>Guilherme Costa Batista - Função - Realizar IOT, IA e Compliance Quality</li>
  <li>Lucas Felix Vassiliades - Fução - Realizar Mobile</li>
  <li>Michael Bombo Leon - Função - Realizar .net (C#)</li>
</ul>

<h1>Como faço para rodar o meu Projeto?</h1>

<p>Abrir o IntelliJ IDEA: Se você já tem o IntelliJ instalado, abra-o. Se não, você pode baixá-lo e instalá-lo a partir do site oficial da JetBrains.

Abrir o projeto: No IntelliJ IDEA, clique em "File" (Arquivo) no menu superior e depois em "Open" (Abrir). Navegue até a pasta onde seu projeto Java está localizado e selecione a pasta do projeto.

Configurar o SDK: O IntelliJ irá pedir para configurar o SDK (kit de desenvolvimento de software) se ainda não estiver configurado. Selecione a versão do Java que você deseja usar para compilar e executar o projeto. Se o SDK não estiver instalado, você pode baixá-lo e instalá-lo através do IntelliJ.

Executar o projeto: Após abrir o projeto, localize o arquivo principal do seu programa Java (geralmente tem um método main). Clique com o botão direito do mouse neste arquivo e escolha a opção "Run" (Executar) ou "Debug" (Depurar) para executar o projeto.

Visualizar resultados: Depois de executar o projeto, você deve ver os resultados da execução no console do IntelliJ IDEA.</p>

<h1>Diagrama</h1> 
<img src="Documentacao/diagrama.png">

<h1>Link do vídeo Pitch</h1>
<p>https://youtu.be/faVvlJgejws?si=c5igOGIwzMorJecz</p>

<h1>End points</h1>
<p>
    
     async function createEndereco(endereco, cep, complemento) {
      let url = http://localhost/enderecos;

      let headers = {
        'Content-Type': 'application/json',
    };

      let body = {
        endereco,
        cep,
        complemento,
    };

      let response = await fetch(url, {
        method: 'POST',
        headers: headers,
        body: JSON.stringify(body),
    });
      console.log(response.status)
    };

</p>

<p>  
    
    async function getEnderecoById(id) {
      let url = http://localhost/enderecos/${id};

      let response = await fetch(url, {
        method: 'GET',
    });
      console.log(response.status)
    };

</p>

<p>
  
    async function createLogin(email, senha, repetirSenha, repetirEmail) {
      let url = http://localhost/api/login/create;

      let headers = {
        'Content-Type': 'application/json',
    };

      let body = {
        email,
        senha,
        repetirSenha,
        repetirEmail,
    };

      let response = await fetch(url, {
        method: 'POST',
        headers: headers,
        body: JSON.stringify(body),
    });
      console.log(response.status)
    };

</p>

<p>
  
    async function getLoginById(id) {
      let url = http://localhost/api/login/${id};

      let response = await fetch(url, {
        method: 'GET',
    });
      console.log(response.status)
    };

 </p>

 <p>
   
    async function createFinanceiro(rendaMensal, fonteRenda, tipoEmprego, infoContaBancaria, historicoEmprestimo, historicoPagamento) {
      let url = http://localhost/financeiros;

      let headers = {
        'Content-Type': 'application/json',
    };

      let body = {
        rendaMensal,
        fonteRenda,
        tipoEmprego,
        infoContaBancaria,
        historicoEmprestimo,
        historicoPagamento,
    };

      let response = await fetch(url, {
        method: 'POST',
        headers: headers,
        body: JSON.stringify(body),
    });
      console.log(response.status)
    };

  </p>

  <p>  
      
    async function getFinanceiroById(id) {
      let url = http://localhost/financeiros/${id};

      let response = await fetch(url, {
        method: 'GET',
    });
      console.log(response.status)
    };

  </p>

  <p>
    
    async function createCadastro(nome, sobrenome, sexo, cpf, celular, dataNascimento, email) {
      let url = http://localhost/cadastros;

      let headers = {
        'Content-Type': 'application/json',
    };

      let body = {
        nome,
        sobrenome,
        sexo,
        cpf,
        celular,
        dataNascimento,
        email,
    };

      let response = await fetch(url, {
        method: 'POST',
        headers: headers,
        body: JSON.stringify(body),
    });
      console.log(response.status)
    };

  </p>

  <p>
    
    async function getCadastroById(id) {
      let url = http://localhost/cadastros/${id};

      let response = await fetch(url, {
        method: 'GET',
    });
      console.log(response.status)
    };

</p>

