

    @Aluno
Feature: Cadastrar Aluno
    Para que sendo um usuário cadastrado
    possa cadastrar Aluno
 
    Scenario Outline: Cadastrar aluno

        Given que estou logado no app
        When que informo os campos <codigo> e <aluno>
        And clico na opção salvar
        Then  visualizo <msg>  de cadastro realizado com sucesso


        Examples:
            | codigo  | aluno                      | msg                        |
            | "0123 " | "eduardo moises da Silva " | "Dados salvos com sucesso" |

    Scenario Outline:Cadastrar aluno dados aleatorios

        Given que estou logado no app
        When que informo os campos codigo e aluno
        And clico na opção salvar
        Then  visualizo <msg>  de cadastro realizado com sucesso

        Examples:
            | msg             |
            | "Dados salvos com sucesso" |

    Scenario Outline: Validar campo Codigo
        Given que estou logado no app
        When não informo campo <codigo>
        And  clico na opção salvar
        Then visualizo a <mensagem>

        Examples:
            | codigo  | mensagem                           |
            | "     " | "Os campos devem ser preenchidos!" |

    Scenario Outline: Validar campo Aluno
        Given que estou logado no app
        When não informo campo <aluno>
        And  clico na opção salvar
        Then visualizo a <mensagem>

        Examples:
            | aluno   | mensagem                           |
            | "     " | "Os campos devem ser preenchidos!" |


    Scenario: Validar botão cancelar
        Given que estou logado no app
        When que informo os campos codigo e aluno
        And seleciono opção cancelar
        Then   campos ficam vazios



    Scenario Outline: Validar codigo duplicado

        Given que estou logado no app
        When que informo os campos <codigo> e <aluno> ja cadastrado
        And clico na opção salvar
        Then  visualizo <mensagem> informando que codigo cadastrado


        Examples:
            | codigo  | aluno   | mensagem                              |
            | "98839" | "Igor " | "Já existe um aluno com este código!" |

    Scenario: Validar botão Logout
        Given que estou logado no app
        And seleciono opção Logout
        Then  visualizo tela inicial app




# Scenario Outline: Validar Nome duplicado
#     Given que estou logado no app
#     When que informo os campos <codigo> e <aluno>
#     And clico na opção salvar
#     Then  visualizo <msg> informando que Nome cadastrado


#         Exemples:
#         | codigo  | aluno                      |
#         | "0123 " | "eduardo moises da Silva " | "Dados salvos com sucesso" |
