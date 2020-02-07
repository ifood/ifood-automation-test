package listeners;

import io.appium.java_client.events.api.general.AppiumWebDriverEventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class AppiumDriverListener implements AppiumWebDriverEventListener {

    private static final Logger log = LogManager.getLogger(AppiumDriverListener.class);

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver) {

        log.debug("Estado que está " + element.toString());


    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver) {

        log.debug("Estado que retorna " + element.toString());



    }

    @Override
    public void beforeAlertAccept(WebDriver driver) {
        /*
         * Em alertas, ao colocar o source, pode mostrar a estrutura do alert (ou app com tudo)
         * log.debug("Analise para aceite do alert " + driver.getPageSource());
         */


    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

        /*
         * Em alertas, ao colocar o source, pode mostrar a estrutura do alert (ou app com tudo)
         * log.debug("Alerta aceito " + driver.getPageSource());
         */

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

        /*
         *
         * log.debug("Alerta recusado " + driver.getPageSource());
         */

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {
        /*
         *
         * log.debug("Analise para a rescusa do alert ");// + driver.getPageSource());
         */


    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {

        log.debug("Antes da navegação ", url);



    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {

        log.debug("Depois da navegação ", url);



    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        /*
         *
         * log.debug("Antes de retornar a pagina: ");//, driver.getPageSource());
         */


    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        /*
         *
         * log.debug("Depois de retornar a pagina: ");//, driver.getPageSource());
         */


    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        /*
         *
         * log.debug("Antes de seguir a pagina: ");//, driver.getPageSource());
         */


    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        /*
         *
         * log.debug("Depois de seguir a pagina: ");//, driver.getPageSource());
         */


    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
        /*
         *
         * log.debug("Antes de atualizar a pagina: ");//, driver.getPageSource());
         */


    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
        /*
         *
         * log.debug("Depois de atualizar a pagina: ");//, driver.getPageSource());
         */

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        log.debug("Buscando por elemento " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        log.debug("Elemento encontrado " + by.toString());
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {

        log.info("Clicando no elemento " + element.toString());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        log.info("Cique efetuado no elemento " + element.toString());
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        log.info("Informando valor " + Arrays.toString(keysToSend) + " no elemento " + element.toString());
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        log.info(Arrays.toString(keysToSend) + " foi informado no elemento " + element.toString());
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {

        log.info("Executando script: " + script);

    }

    @Override
    public void afterScript(String script, WebDriver driver) {
        log.info("Resultado do script: " + script);

    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
        log.info("Antes de alterar a tela " + windowName);

    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {
        log.info("Depois de alterar a tela " + windowName);

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {

        log.throwing(throwable);
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

/*    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

        log.info("texto capturado " + text);

    }*/


}
