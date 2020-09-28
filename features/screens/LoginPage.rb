# Classe referente a tela de login
class LoginPage
    attr_accessor :driver
  
    def initialize
      @home_screen = 'Test'
      @email_field = 'email'
      @pw_field = 'senha' 
      @login_btn = 'entrar'
      @login_error_msg = 'lognFail'
    end
  
    def assert_welcome_screen
        wait { @driver.find_element(id: @home_screen) }.text
    end
  
    def fill_email_field
        wait { @driver.find_element(id: @email_field) }.send_keys(CREDENCIAIS[:LOGINN_USER][:EMAIL])
    end
  
    def fill_pw_field
        wait { @driver.find_element(id: @pw_field) }.send_keys(CREDENCIAIS[:LOGINN_USER][:SENHA])
    end
  
    def login_button
        wait { @driver.find_element(id: @login_btn) }.click
    end

    def assert_login_error_msg
        wait { @driver.find_element(id: @login_error_msg) }.text
    end
  end
  