require 'appium_lib'
# class Base Screen
class BaseScreen
  def self.identificator(element_name, &block)
    define_method(element_name.to_s, *block)
  end

  class << self
    alias value :identificator
    alias action :identificator
    alias trait :identificator
  end

  def wait_for_element(type, identificator)
    time = 10
    manage.timeouts.implicit_wait = (time)
    @driver.find_element(type, identificator).displayed?
  rescue StandardError
    raise 'Elemento não localizado'
  end

  def wait_for_element_visible(type, identificator)
    time = 10
    manage.timeouts.implicit_wait = (time) 
    @driver.find_element(type, identificator).visible?
  rescue StandardError
    raise 'Elemento não localizado'
  end
end
