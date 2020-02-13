/*Shubha 1-Aug-2019 */

package DevOps.Devops;
import org.apache.log4j.Logger;
import org.apache.xerces.impl.dv.util.Base64;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Testbase.Testbase;



public class AppTest extends Testbase
{
	Logger logs = Logger.getLogger("devpinoyLogger");	

	@Test(priority = 1)
	public void logintoapp() throws Throwable 
	{
		
		
		App ap=new App();
		ap.test();
	}
}



