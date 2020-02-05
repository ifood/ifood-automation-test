
class Cadastraraluno
  def informarCodigo
    @driver.find_element(:accessibility_id, "codigo")
  end

  def informarAluno
    @driver.find_element(:accessibility_id, "aluno")
  end

  def selecionarSalvar
    @driver.find_element(:xpath, "//android.view.ViewGroup[@content-desc=\"salvar\"]/android.view.ViewGroup/android.widget.TextView")
  end

  def selecionarLogout
    @driver.find_element(:xpath, "//android.view.ViewGroup[@content-desc=\"logout\"]/android.widget.TextView")
  end

  def selecionarCancelar
    @driver.find_element(:xpath, "//android.view.ViewGroup[@content-desc=\"cancelar\"]/android.view.ViewGroup")
  end
end
