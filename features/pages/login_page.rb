class Pagelogin
  def informarlogin
    @driver.find_element(:accessibility_id, "email")
  end

  def informarSenha
    @driver.find_element(:accessibility_id, "senha")
  end

  def selecionarEntrar
    @driver.find_element(:xpath, "//android.view.ViewGroup[@content-desc=\"entrar\"]/android.view.ViewGroup")
  end

  def informarCodigo
    @driver.find_element(:accessibility_id, "codigo")
  end
end
