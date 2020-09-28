Dado(/^que o usuario esta logado no aplicativo$/) do
    steps '
        E que o usuario esta na home do aplicativo
        E preencher as credencias corretamente
        E clicar no botao Entrar
        E visualiza a tela de cadastro
    '
  end