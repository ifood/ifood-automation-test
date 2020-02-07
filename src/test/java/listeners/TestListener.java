package listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.RunSetup;


/**
 *
 * By Ramses Almeida
 **/
public class TestListener extends RunSetup implements ITestListener {

    private final Logger log = LogManager.getLogger(this.getClass());


    @Override
    public void onTestStart(ITestResult result) {
        log.info("Iniciando " + result.getTestClass() + result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Teste bem sucedido " + result.getTestName() + result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
         log.error(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.debug("Teste não executado " + result.getTestName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        log.error(result);
    }

    @Override
    public void onStart(ITestContext context) {
        log.info("Iniciando testes " + context.getSuite().getName());

    }

    @Override
    public void onFinish(ITestContext context) {
        log.info("Testes finalizados " + context.getSuite().getName());
    }
}
