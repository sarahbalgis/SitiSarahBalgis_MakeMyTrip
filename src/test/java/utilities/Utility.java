package utilities;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

    WebDriverWait wait;

    public static void hardWait(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e){}
    }



}
