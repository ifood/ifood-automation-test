require 'faker'

# Classe referente a tela de cadastro
class CadastroPage
    attr_accessor :driver
  
    def initialize
      @save_button = 'salvar'
      @cancel_button = 'cancelar'
      @logout_button = 'logout' 
      @code_field = 'codigo'
      @aluno_field = 'aluno'
    end
  
    def assert_register_screen
        wait { @driver.find_element(id: @save_button) }.text
    end

    def logout_button
        wait { @driver.find_element(id: @logout_button) }.click
    end

    def insert_code
      wait { @driver.find_element(id: @code_field) }.send_keys(Faker::Number.number(digits: 3))
    end

    def insert_name
      wait { @driver.find_element(id: @code_field) }.send_keys(Faker::Name.name)
    end

    def save_button
      wait { @driver.find_element(id: @save_button) }.click
    end
  end
  