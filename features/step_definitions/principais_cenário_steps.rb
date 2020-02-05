Dado("que esteja na tela de login da aplicação") do
    @screen = AppScreen.new
    @screen.expected_initial_screen
    end
  
  Quando("digitar credenciais e validar") do
    @screen.login_success
  end
  
  Então("deve ser exibida tela de cadastro de aluno") do
    @screen.expected_screen_registration
  end

  Quando("tentar logar com credenciais inválidas") do
    @screen.login_failed
  end
  
  Então("deve ser exibida mensagem de login com erro") do
    @screen.expected_login_fail
  end

  Dado("que esteja na tela de cadastro de aluno") do
    steps %{
        Quando digitar credenciais e validar
        Então deve ser exibida tela de cadastro de aluno
      }
  end

  Quando("salvar após digitar código e aluno") do
    @screen.insert_success_student
  end
  
  Então("novo aluno deve ser cadastrado") do
    @screen.expected_student_registered
  end

  Quando("tentar cadastrar aluno incorretamente") do
    @screen.insert_invalid_student
  end
  
  Então("deve exibir mensagem de erro ao cadastrar") do
    @screen.expected_fail_student_register
  end