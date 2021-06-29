package rest.test;

import com.restbusters.rest.client.RestClientHelper;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

/**
 * @author smatsaylo on 6/29/21
 * @project rest-test
 */
public class RestApiTest {

    private static final Logger logger =
            LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private OkHttpClient okHttpClient = RestClientHelper.getInstance().buildBasicAuthClient("test", "Test");

    @BeforeClass(alwaysRun = true)
    private void setUp(){
        logger.info("In setup");
    }

    @Test
    private void restTest(){
        logger.info("Rest Api Test");
    }

    @AfterClass(alwaysRun = true)
    private void tearDown(){
        logger.info("In tear down");
    }
}
