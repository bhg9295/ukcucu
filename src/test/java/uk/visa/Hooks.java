package uk.visa;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import uk.visa.propertyreader.PropertyReader;
import uk.visa.utility.Utility;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }


    @After
    public void tearDown(){
       closeBrowser();
    }

}
