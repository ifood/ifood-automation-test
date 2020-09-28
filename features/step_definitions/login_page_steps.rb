Dado(/^que o usuario esta na home do aplicativo$/) do
    @lp = LoginPage.new
    expect(@lp.home_screen).to eql('Test')
end

Quando(/^preencher as credencias corretamente$/) do
    @lp = LoginPage.new
    @lp.fill_email_field
    @lp.fill_pw_field
end

Quando(/^clicar no botao Entrar$/) do
    @lp = LoginPage.new
    @lp.login_button
end

Entao(/^visualiza a mensagem de erro do aplicativo$/) do
    @lp = LoginPage.new
    @lp.assert_login_error_msg
end

