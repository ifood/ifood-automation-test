Given("que estou logado no app") do
  @mob = Pagelogin.new
  @mob.informarlogin.send_keys("teste@teste.com")
  @mob.informarSenha.send_keys("123456")
  @mob.selecionarEntrar.click
end

When("que informo os campos {string} e {string}") do |codigo, aluno|
  @mob = Cadastraraluno.new
  @mob.informarCodigo.send_keys(codigo)
  @mob.informarAluno.send_keys(aluno)
end

When("clico na opção salvar") do
  @mob = Cadastraraluno.new
  @mob.selecionarSalvar.click
end

Then("visualizo {string}  de cadastro realizado com sucesso") do |msg|
  msg = find_element(:xpath, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.TextView[2]").displayed
end

When("que informo os campos codigo e aluno") do
  @mob = Cadastraraluno.new
  $codigo = @mob.informarCodigo.send_keys(Faker::Number.number(digits: 6))
  $aluno = @mob.informarAluno.send_keys(Faker::Name.name)
end

When("não informo campo {string}") do |codigo|
  @mob = Cadastraraluno.new
  @mob.informarCodigo.click
  @mob.informarAluno.send_keys(Faker::Name.name)
end

Then("visualizo a {string}") do |mensagem|
  msg = find_element(:id, "android:id/alertTitle")
  expect(msg.text).to eql mensagem
end

When("que informo os campos {string} e {string} ja cadastrado") do |codigo, aluno|
  @mob = Cadastraraluno.new
  @mob.informarCodigo.send_keys(codigo)
  @mob.informarAluno.send_keys(aluno)
end

Then("visualizo {string} informando que codigo cadastrado") do |mensagem|
  msg = find_element(:accessibility_id, "haveCode")
  expect(msg.text).to eql mensagem
end

When("seleciono opção cancelar") do
  @mob = Cadastraraluno.new
  @mob.selecionarCancelar.click
end

Then("campos ficam vazios") do
  @mob = Cadastraraluno.new
end

Given("seleciono opção Logout") do
@mob = Cadastraraluno.new
@mob.selecionarLogout.click
end

Then("visualizo tela inicial app") do
 @mob = Pagelogin.new
 @mob.informarlogin.displayed
end