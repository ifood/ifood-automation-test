Entao(/^visualiza a tela de cadastro$/) do
    @cp = CadastroPage.new
    expect(@cp.assert_register_screen).to eql('Salvar')
end

Quando(/^tocar no botao de logout$/) do
    @cp = CadastroPage.new
    @cp.logout_button
end

Entao(/^visualiza a home do aplicativo$/) do
    @lp = LoginPage.new
    expect(@lp.assert_welcome_screen).to eql('Test')
end

Entao(/^realizar cadastro de um novo aluno$/) do
    @cp = CadastroPage.new
    @cp.insert_code
    @cp.insert_name
    @cp.save_button
end
