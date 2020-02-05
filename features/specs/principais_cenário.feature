# language: pt
Funcionalidade: Principais Cenários Teste IFood
Eu como QA quero realizar o desafio do IFood

Contexto:
    Dado que esteja na tela de login da aplicação

@ios    
Cenário: Realizar login com sucesso
    Quando digitar credenciais e validar
    Então deve ser exibida tela de cadastro de aluno

@ios
Cenário: Mensagem de erro ao realizar o login
    Quando tentar logar com credenciais inválidas 
    Então deve ser exibida mensagem de login com erro

@ios
Cenário: Cadastrar novo Aluno
    Dado que esteja na tela de cadastro de aluno
    Quando salvar após digitar código e aluno
    Então novo aluno deve ser cadastrado

@ios
Cenário: Mensagem de erro ao tentar cadastrar aluno incorretamente
    Dado que esteja na tela de cadastro de aluno
    Quando tentar cadastrar aluno incorretamente
    Então deve exibir mensagem de erro ao cadastrar

