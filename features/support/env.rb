require "appium_lib"
require "appium_console"
require "rspec"
require "pry"
require "faraday"
require "nokogiri"
require "faker"
require "webdrivers"


caps = Appium.load_appium_txt file: File.expand_path("appium.txt", __dir__), verbose: true
Appium::Driver.new(caps, true)
Appium.promote_appium_methods Object
