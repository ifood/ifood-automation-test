

@login
Feature: Login

   Para que sendo um usuário cadastrado
   Posso me autenticar pela tela de login

   Scenario Outline: Usuário logado

      Given  que acesso a tela de login
      When  e informo os campos <login> e <senha>
      And clico na opção entrar
      Then  posso ver a tela inicial do app

      Examples:
         | login             | senha    |
         | "teste@teste.com" | "123456" |

   Scenario Outline: Login Inválido

      Given  que acesso a tela de login
      When  e informo os campos <login> e <senha>
      And clico na opção entrar
      Then devo ver <mensagem>

      Examples:
         | login            | senha    | mensagem            |
         | "teste@edu.com " | "123456" | "Erro no login! :(" |


   Scenario Outline: Senha Inválido
      Given  que acesso a tela de login
      When  e informo os campos <login> e <senha>
      And clico na opção entrar
      Then devo ver <mensagem>

      Examples:
         | login            | senha   | mensagem           |
         | "teste@teste.com " | "12346" | "Erro no login! :("|


   Scenario Outline: Login e Senha em branco

      Given  que acesso a tela de login
      When  e informo os campos <login> e <senha>
      And clico na opção entrar
      Then devo ver <mensagem>

      Examples:
         | login | senha | mensagem           |
         | "   " | " "   | "Erro no login! :(" |