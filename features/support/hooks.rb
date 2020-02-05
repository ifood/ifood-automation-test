Before do
  @driver.start_driver
  @driver.manage.timeouts.implicit_wait = 200
end

After do
  @driver.driver_quit
end
