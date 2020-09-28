# language: pt

Funcionalidade: Login

Cenário: Login com sucesso
    Dado que o usuario esta na home do aplicativo
    Quando preencher as credencias corretamente
    E clicar no botao Entrar
    Então visualiza a tela de cadastro

Cenário: Login com dados em branco
    Dado que o usuario esta na home do aplicativo
    Quando clicar no botao Entrar
    Então visualiza a mensagem de erro do aplicativo


Cenário: Realizar logout com sucesso
    Dado que o usuario esta logado no aplicativo
    Quando tocar no botao de logout
    Entao visualiza a home do aplicativo

Cenário: Cadastrar aluno
    Dado que o usuario esta logado no aplicativo
    Entao realizar cadastro de um novo aluno
