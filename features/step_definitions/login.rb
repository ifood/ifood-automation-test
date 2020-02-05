

Given("que acesso a tela de login") do
  @mob = Pagelogin.new
  @mob.informarlogin.click
end

When("e informo os campos {string} e {string}") do |login, senha|
  @mob.informarlogin.send_keys(login)
  @driver.hide_keyboard
  @mob.informarSenha.send_keys(senha)
end

When("clico na opção entrar") do
  @mob.selecionarEntrar.click
end

Then("posso ver a tela inicial do app") do
  contemCodigo = find_element(:accessibility_id, "codigo").displayed?
end

Then("devo ver {string}") do |mensagem|
  msg = find_element(:accessibility_id, "lognFail")
  expect(msg.text).to eql mensagem
end
