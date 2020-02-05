require 'faker'
# class app screen
class AppScreen < BaseScreen

    # Declare todos os elementos da tela
    identificator(:initial_screen)                 { 'Test' }
    identificator(:email_field)                    { 'email' }
    identificator(:password_field)                 { 'senha' }
    identificator(:btn_login)                      { 'entrar' } 
    identificator(:btn_save)                       { 'salvar' }
    identificator(:btn_logout)                     { 'logout' }
    identificator(:login_fail)                     { 'lognFail' }
    identificator(:field_id)                       { 'RNE__Input__text-input' }
    identificator(:field_infos)                    { 'XCUIElementTypeTextField' } 
    identificator(:success_student)                { 'Salvo Dados salvos!' }
    identificator(:fail_student)                   { 'Os campos devem ser preenchidos!' } 


    def expected_initial_screen
        wait_for_element_visible(:id, initial_screen)
    end

    def insert_email
        @user = CREDENTIALS['valid_user'.to_sym]
        id(email_field).click
        id(email_field).send_keys(@user[:email])
    end

    def insert_password
        id(password_field).click
        id(password_field).send_keys(@user[:password])
    end

    def insert_credentials
        insert_email
        insert_password
    end

    def validate_credentials
        wait_for_element_visible(:id, initial_screen)
        id(btn_login).click
    end

    def login_success 
        insert_credentials
        validate_credentials  
    end

    def expected_screen_registration
        wait_for_element_visible(:id, btn_logout)
    end

    def insert_invalid_password
        @user = CREDENTIALS['invalid_user'.to_sym]
        id(password_field).click
        id(password_field).send_keys(@user[:password])
    end

    def insert_invalid_credentials
        insert_email
        insert_invalid_password
    end

    def login_failed
        insert_invalid_credentials
        validate_credentials
    end

    def expected_login_fail
        wait_for_element_visible(:id, login_fail)
    end

    def insert_code
        @code_student = Faker::Number.between(from: 1, to: 99999)
        wait_for_element_visible(:id, field_id)
        id(field_id).click
        find_elements(:class, field_infos)[0].send_keys(@code_student)
    end

    def insert_student
        @name_student = Faker::Name.name
        find_elements(:class, field_infos)[1].send_keys(@name_student)
    end

    def save_student
        id(btn_save).click
    end

    def insert_success_student
        insert_code
        insert_student 
        save_student
    end

    def expected_student_registered
        wait_for_element_visible(:id, success_student)
    end

    def insert_invalid_student
        insert_student 
        save_student
    end

    def expected_fail_student_register
        wait_for_element_visible(:id, fail_student)     
    end
    
end