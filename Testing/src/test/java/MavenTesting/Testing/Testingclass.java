package MavenTesting.Testing;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import com.excel.utility.Xls_Reader;
@SuppressWarnings("unused")
public class Testingclass {
	
	//this is testing classsssssssssss
	//this change is done for git
	 
	WebDriver driver;
//TEST CASES OF A SHOPPING SITE
	
    @Test
	public void TestCase1() throws Exception {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sania.ahmad\\ownCloud\\Automation trainees\\DATA\\Registrationshopping.xlsx");
		int rowCount = reader.getRowCount("Sheet1"); // get row count
		
		
		int rowNum = 2;

		String EmailAddress = reader.getCellData("Sheet1", "Email Address", rowNum); //Email Address
		System.out.println("The firstname is :" + EmailAddress);
		
		String Password=reader.getCellData("Sheet1", "Password", rowNum); //Password
		System.out.println("The firstname is :" + Password);
		
				System.out.println("The Password is :" + Password);
				
				String Address=reader.getCellData("Sheet1", "Address", rowNum); //Address
				System.out.println("The address is :" +Address);
				
				String Mobile=reader.getCellData("Sheet1", "Mobile", rowNum); //Mobile number
				System.out.println("The mobile is :" +Mobile);
				
				String FirstName=reader.getCellData("Sheet1", "First Name", rowNum); //firstname
				System.out.println("The firstname is :" + FirstName);
				
				String LasttName=reader.getCellData("Sheet1", "Last Name", rowNum); //lasttname
				System.out.println("The lastname is :" + LasttName);
	
				// fetching all test fields
				
		        driver.findElement(By.xpath("//*[@id='FormField_1']")).sendKeys(EmailAddress); //Email Address
			     Thread.sleep(2000);
    
	            driver.findElement(By.xpath("//*[@id='FormField_2']")).sendKeys(Password);  //Password
			     Thread.sleep(2000);
			     
                driver.findElement(By.xpath("//*[@id='FormField_8']")).sendKeys(Address); //Address
			     Thread.sleep(2000);
			     
			     
			     Select phone = new Select(driver.findElement(By.className("custom_mobile_code")));
					phone.selectByVisibleText("305");
			    Thread.sleep(4000);
					 
					 
			    driver.findElement(By.xpath("//input[@class='custom_mobile_number number_field']")).sendKeys(Mobile); //Phone Number
			    Thread.sleep(2000);
			  
				 
			    driver.findElement(By.xpath(" //*[@id='FormField_4']")).sendKeys(FirstName); //first name
			    Thread.sleep(2000);
		
			
			
			    driver.findElement(By.xpath(" //*[@id='FormField_5']")).sendKeys(LasttName); //Last name
			    Thread.sleep(2000);
			
			   Select City = new Select(driver.findElement(By.id("FormField_12"))); //Select city
			   City.selectByVisibleText("Lahore");
	           Thread.sleep(4000);
	       
	         Select Country = new Select(driver.findElement(By.id("FormField_11"))); //Select city
		     Country.selectByVisibleText("Pakistan");
	         Thread.sleep(4000);
	         
	         driver.findElement(By.xpath("//input[@type='submit' and@value='CREATE ACCOUNT']")).click();//Last name
			    Thread.sleep(4000);
	       
			
			 // Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String actual1= driver.switchTo().alert().getText();		
		        		
		        // Displaying alert message		
		        System.out.println(actual1);	
		        Thread.sleep(5000);
		        		
		        // Accepting alert		
		        alert.accept();	
				System.out.println("Actual Result is: " +actual1); // print actual result
				reader.setCellData("Sheet1", "Actual Result", rowNum, actual1);
				String act = reader.getCellData("Sheet1", "Actual Result", rowNum);
				String expected = reader.getCellData("Sheet1", "Expected Result", rowNum);
				System.out.println("Expected Result is: " + expected); // print expected result
				System.out.println("This is Test Case: " + (rowNum - 1));
			   //Assert.assertEquals(expected, act);
				Thread.sleep(2000);
				String pass = "pass";
				String fail = "fail";
				if (expected.equals(act)) {
					reader.setCellData("Sheet1", "Status", rowNum, pass);
					System.out.println("The test is " + pass);
				} 
				else {
					reader.setCellData("Sheet1", "Status", rowNum, fail);
					System.out.println("The test is " + fail);

				}
   }
	
  
    @Test
	public void TestCase2() throws Exception {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sania.ahmad\\ownCloud\\Automation trainees\\DATA\\Registrationshopping.xlsx");
		int rowCount = reader.getRowCount("Sheet1"); // get row count
		
		
		int rowNum = 3;

		String EmailAddress = reader.getCellData("Sheet1", "Email Address", rowNum); //Email Address
		System.out.println("The firstname is :" + EmailAddress);
		
		String Password=reader.getCellData("Sheet1", "Password", rowNum); //Password
		System.out.println("The firstname is :" + Password);
		
				System.out.println("The Password is :" + Password);
				
				String Address=reader.getCellData("Sheet1", "Address", rowNum); //Address
				System.out.println("The address is :" +Address);
				
				String Mobile=reader.getCellData("Sheet1", "Mobile", rowNum); //Mobile number
				System.out.println("The mobile is :" +Mobile);
				
				String FirstName=reader.getCellData("Sheet1", "First Name", rowNum); //firstname
				System.out.println("The firstname is :" + FirstName);
				
				String LasttName=reader.getCellData("Sheet1", "Last Name", rowNum); //firstname
				System.out.println("The lastname is :" + LasttName);
	
				// fetching all test fields
				
		        driver.findElement(By.xpath("//*[@id='FormField_1']")).sendKeys(EmailAddress); //Email Address
			     Thread.sleep(2000);
    
	            driver.findElement(By.xpath("//*[@id='FormField_2']")).sendKeys(Password);  //Password
			     Thread.sleep(2000);
			     
                driver.findElement(By.xpath("//*[@id='FormField_8']")).sendKeys(Address); //Address
			     Thread.sleep(2000);
			     
			     
			     Select phone = new Select(driver.findElement(By.className("custom_mobile_code")));
					phone.selectByVisibleText("305");
			    Thread.sleep(4000);
					 
					 
			    driver.findElement(By.xpath("//input[@class='custom_mobile_number number_field']")).sendKeys(Mobile); //Phone Number
			    Thread.sleep(2000);
			  
				 
			    driver.findElement(By.xpath(" //*[@id='FormField_4']")).sendKeys(FirstName); //first name
			    Thread.sleep(2000);
		
			
			
			    driver.findElement(By.xpath(" //*[@id='FormField_5']")).sendKeys(LasttName); //Last name
			    Thread.sleep(2000);
			
			   Select City = new Select(driver.findElement(By.id("FormField_12"))); //Select city
			   City.selectByVisibleText("Lahore");
	           Thread.sleep(4000);
	       
	         Select Country = new Select(driver.findElement(By.id("FormField_11"))); //Select city
		     Country.selectByVisibleText("Pakistan");
	         Thread.sleep(4000);
	         
	         driver.findElement(By.xpath("//input[@type='submit' and@value='CREATE ACCOUNT']")).click();//Last name
			    Thread.sleep(4000);
	       
			
			 // Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String actual1= driver.switchTo().alert().getText();		
		        		
		        // Displaying alert message		
		        System.out.println(actual1);	
		        Thread.sleep(5000);
		        		
		        // Accepting alert		
		        alert.accept();	
				System.out.println("Actual Result is: " +actual1); // print actual result
				reader.setCellData("Sheet1", "Actual Result", rowNum, actual1);
				String act = reader.getCellData("Sheet1", "Actual Result", rowNum);
				String expected = reader.getCellData("Sheet1", "Expected Result", rowNum);
				System.out.println("Expected Result is: " + expected); // print expected result
				System.out.println("This is Test Case: " + (rowNum - 1));
			   //Assert.assertEquals(expected, act);
				Thread.sleep(2000);
				String pass = "pass";
				String fail = "fail";
				if (expected.equals(act)) {
					reader.setCellData("Sheet1", "Status", rowNum, pass);
					System.out.println("The test is " + pass);
				} 
				else {
					reader.setCellData("Sheet1", "Status", rowNum, fail);
					System.out.println("The test is " + fail);

				}
   }
	
    
    
    
  
    
    
    @Test
   	public void TestCase3() throws Exception {
   		Xls_Reader reader = new Xls_Reader("C:\\Users\\sania.ahmad\\ownCloud\\Automation trainees\\DATA\\Registrationshopping.xlsx");
   		int rowCount = reader.getRowCount("Sheet1"); // get row count
   		
   		
   		int rowNum = 4;

   		String EmailAddress = reader.getCellData("Sheet1", "Email Address", rowNum); //Email Address
   		System.out.println("The firstname is :" + EmailAddress);
   		
   		String Password=reader.getCellData("Sheet1", "Password", rowNum); //Password
   		System.out.println("The password is :" + Password);
   		
   				System.out.println("The Password is :" + Password);
   				
   				String Address=reader.getCellData("Sheet1", "Address", rowNum); //Address
   				System.out.println("The address is :" +Address);
   				
   				String Mobile=reader.getCellData("Sheet1", "Mobile", rowNum); //Mobile number
   				System.out.println("The mobile is :" +Mobile);
   				
   				String FirstName=reader.getCellData("Sheet1", "First Name", rowNum); //firstname
   				System.out.println("The firstname is :" + FirstName);
   				
   				String LasttName=reader.getCellData("Sheet1", "Last Name", rowNum); //Lasttname
   				System.out.println("The lastname is :" + LasttName);
   	
   				// fetching all test fields
   				
   		        driver.findElement(By.xpath("//*[@id='FormField_1']")).sendKeys(EmailAddress); //Email Address
   			     Thread.sleep(2000);
       
   	            driver.findElement(By.xpath("//*[@id='FormField_2']")).sendKeys(Password);  //Password
   			     Thread.sleep(2000);
   			     
                   driver.findElement(By.xpath("//*[@id='FormField_8']")).sendKeys(Address); //Address
   			     Thread.sleep(2000);
   			     
   			     
   			     Select phone = new Select(driver.findElement(By.className("custom_mobile_code")));
   					phone.selectByVisibleText("305");
   			    Thread.sleep(4000);
   					 
   					 
   			    driver.findElement(By.xpath("//input[@class='custom_mobile_number number_field']")).sendKeys(Mobile); //Phone Number
   			    Thread.sleep(2000);
   			  
   				 
   			    driver.findElement(By.xpath(" //*[@id='FormField_4']")).sendKeys(FirstName); //first name
   			    Thread.sleep(2000);
   		
   			
   			
   			    driver.findElement(By.xpath(" //*[@id='FormField_5']")).sendKeys(LasttName); //Last name
   			    Thread.sleep(2000);
   			
   			   Select City = new Select(driver.findElement(By.id("FormField_12"))); //Select city
   			   City.selectByVisibleText("Lahore");
   	           Thread.sleep(4000);
   	       
   	         Select Country = new Select(driver.findElement(By.id("FormField_11"))); //Select city
   		     Country.selectByVisibleText("Pakistan");
   	         Thread.sleep(4000);
   	         
   	         driver.findElement(By.xpath("//input[@type='submit' and@value='CREATE ACCOUNT']")).click();//Last name
   			    Thread.sleep(4000);
   			
   		        WebElement actual= driver.findElement(By.xpath("//div[@class='font12 dpd welcgus']"));//Address
  			    String act1=actual.getText(); 
   		        Thread.sleep(2000);
		        System.out.println("actual is"+act1);
   				reader.setCellData("Sheet1", "Actual Result", rowNum, act1);
   				String act = reader.getCellData("Sheet1", "Actual Result", rowNum);
   				String expected = reader.getCellData("Sheet1", "Expected Result", rowNum);
   				System.out.println("Expected Result is: " + expected); // print expected result
   				System.out.println("This is Test Case: " + (rowNum - 1));
   			   //Assert.assertEquals(expected, act);
   				Thread.sleep(2000);
   				String pass = "pass";
   				String fail = "fail";
   				if (expected.equals(act)) {
   					reader.setCellData("Sheet1", "Status", rowNum, pass);
   					System.out.println("The test is " + pass);
   				} 
   				else {
   					reader.setCellData("Sheet1", "Status", rowNum, fail);
   					System.out.println("The test is " + fail);

   				}
      }
   	
   
      
    @Test
   	public void TestCase4() throws Exception {
   		Xls_Reader reader = new Xls_Reader("C:\\Users\\sania.ahmad\\ownCloud\\Automation trainees\\DATA\\Registrationshopping.xlsx");
   		int rowCount = reader.getRowCount("Sheet1"); // get row count
   		
   		
   		int rowNum = 5;

   		String EmailAddress = reader.getCellData("Sheet1", "Email Address", rowNum); //Email Address
   		System.out.println("The firstname is :" + EmailAddress);
   		
   		String Password=reader.getCellData("Sheet1", "Password", rowNum); //Password
   		System.out.println("The password is :" + Password);
   		
   				System.out.println("The Password is :" + Password);
   				
   				String Address=reader.getCellData("Sheet1", "Address", rowNum); //Address
   				System.out.println("The address is :" +Address);
   				
   				String Mobile=reader.getCellData("Sheet1", "Mobile", rowNum); //Mobile number
   				System.out.println("The mobile is :" +Mobile);
   				
   				String FirstName=reader.getCellData("Sheet1", "First Name", rowNum); //firstname
   				System.out.println("The firstname is :" + FirstName);
   				
   				String LasttName=reader.getCellData("Sheet1", "Last Name", rowNum); //Lasttname
   				System.out.println("The lastname is :" + LasttName);
   	
   				// fetching all test fields
   				
   		        driver.findElement(By.xpath("//*[@id='FormField_1']")).sendKeys(EmailAddress); //Email Address
   			     Thread.sleep(2000);
       
   	            driver.findElement(By.xpath("//*[@id='FormField_2']")).sendKeys(Password);  //Password
   			     Thread.sleep(2000);
   			     
                   driver.findElement(By.xpath("//*[@id='FormField_8']")).sendKeys(Address); //Address
   			     Thread.sleep(2000);
   			     
   			     
   			     Select phone = new Select(driver.findElement(By.className("custom_mobile_code")));
   					phone.selectByVisibleText("305");
   			    Thread.sleep(4000);
   					 
   					 
   			    driver.findElement(By.xpath("//input[@class='custom_mobile_number number_field']")).sendKeys(Mobile); //Phone Number
   			    Thread.sleep(2000);
   			  
   				 
   			    driver.findElement(By.xpath(" //*[@id='FormField_4']")).sendKeys(FirstName); //first name
   			    Thread.sleep(2000);
   		
   			
   			
   			    driver.findElement(By.xpath(" //*[@id='FormField_5']")).sendKeys(LasttName); //Last name
   			    Thread.sleep(2000);
   			
   			   Select City = new Select(driver.findElement(By.id("FormField_12"))); //Select city
   			   City.selectByVisibleText("Lahore");
   	           Thread.sleep(4000);
   	       
   	         Select Country = new Select(driver.findElement(By.id("FormField_11"))); //Select city
   		     Country.selectByVisibleText("Pakistan");
   	         Thread.sleep(4000);
   	         
   	         driver.findElement(By.xpath("//input[@type='submit' and @value='CREATE ACCOUNT']")).click();//Last name
   			    Thread.sleep(4000);
   		
   			 WebElement username = driver.findElement(By.name("FormField[1][2]"));    
   			String validationMessage = username.getAttribute("Please fill out this field.");
   			boolean required = Boolean.parseBoolean(username.getAttribute("required"));
   
 			  
            Boolean actual=required;
 	          System.out.println("actual is "+actual);
               if(actual==required) {
	           
	            String act="Please fill out this field.";

 			
 	reader.setCellData("Sheet1", "Actual Result", rowNum, act);
 
 			String	 actualresult = reader.getCellData("Sheet1", "Actual Result", rowNum);
 			String expectedresult = reader.getCellData("Sheet1", "Expected Result", rowNum);
 				System.out.println("Expected Result is: " + expectedresult); // print expected result
 				System.out.println("This is Test Case: " + (rowNum - 1));
 			   //Assert.assertEquals(expected, act);
 			Thread.sleep(2000);
 				String pass = "pass";
 				String fail = "fail";
 				if (expectedresult.equals(actualresult)) {
 					reader.setCellData("Sheet1", "Status", rowNum, pass);
 					System.out.println("The test is " + pass);
 				} 
 				else {
 					reader.setCellData("Sheet1", "Status", rowNum, fail);
 					System.out.println("The test is " + fail);

 				} 	}
    }
  
 
  @Test
 	public void TestCase5() throws Exception {
 		Xls_Reader reader = new Xls_Reader("C:\\Users\\sania.ahmad\\ownCloud\\Automation trainees\\DATA\\Registrationshopping.xlsx");
 		int rowCount = reader.getRowCount("Sheet1"); // get row count
 		
 		
 		int rowNum = 6;

 		String EmailAddress = reader.getCellData("Sheet1", "Email Address", rowNum); //Email Address
 		System.out.println("The firstname is :" + EmailAddress);
 		
 		String Password=reader.getCellData("Sheet1", "Password", rowNum); //Password
 		System.out.println("The password is :" + Password);
 		
 				System.out.println("The Password is :" + Password);
 				
 				String Address=reader.getCellData("Sheet1", "Address", rowNum); //Address
 				System.out.println("The address is :" +Address);
 				
 				String Mobile=reader.getCellData("Sheet1", "Mobile", rowNum); //Mobile number
 				System.out.println("The mobile is :" +Mobile);
 				
 				String FirstName=reader.getCellData("Sheet1", "First Name", rowNum); //firstname
 				System.out.println("The firstname is :" + FirstName);
 				
 				String LasttName=reader.getCellData("Sheet1", "Last Name", rowNum); //Lasttname
 				System.out.println("The lastname is :" + LasttName);
 	
 				// fetching all test fields
 				
 		        driver.findElement(By.xpath("//*[@id='FormField_1']")).sendKeys(EmailAddress); //Email Address
 			     Thread.sleep(2000);
     
 	            driver.findElement(By.xpath("//*[@id='FormField_2']")).sendKeys(Password);  //Password
 			     Thread.sleep(2000);
 			     
                driver.findElement(By.xpath("//*[@id='FormField_8']")).sendKeys(Address); //Address
 			     Thread.sleep(2000);
 			     
 			     
 			    Select phone = new Select(driver.findElement(By.className("custom_mobile_code")));
 				phone.selectByVisibleText("305");
 			    Thread.sleep(4000);
 					 
 					 
 			    driver.findElement(By.xpath("//input[@class='custom_mobile_number number_field']")).sendKeys(Mobile); //Phone Number
 			    Thread.sleep(2000);
 			  
 				 
 			    driver.findElement(By.xpath(" //*[@id='FormField_4']")).sendKeys(FirstName); //first name
 			    Thread.sleep(2000);
 		
 			
 			
 			    driver.findElement(By.xpath(" //*[@id='FormField_5']")).sendKeys(LasttName); //Last name
 			    Thread.sleep(2000);
 			
 			   Select City = new Select(driver.findElement(By.id("FormField_12"))); //Select city
 			   City.selectByVisibleText("Lahore");
 	           Thread.sleep(4000);
 	       
 	         Select Country = new Select(driver.findElement(By.id("FormField_11"))); //Select city
 		     Country.selectByVisibleText("Pakistan");
 	         Thread.sleep(4000);
 	         
 	         driver.findElement(By.xpath("//input[@type='submit' and @value='CREATE ACCOUNT']")).click();//Last name
 			    Thread.sleep(4000);
 		
 			 WebElement username = driver.findElement(By.name("FormField[2][8]"));    
 			String validationMessage = username.getAttribute("Please fill out this field.");
 			boolean required = Boolean.parseBoolean(username.getAttribute("required"));
 			   // System.out.println(required);
 	        //Boolean expected=true;
            Boolean actual=required;
 	          System.out.println("actual is "+actual);
               if(actual==required) {
	            //String exp="";
	            String act="Please fill out this field.";

 			
 	reader.setCellData("Sheet1", "Actual Result", rowNum, act);
 	//reader.setCellData("Sheet1", "Expected Result", rowNum, exp);
 			String	 actualresult = reader.getCellData("Sheet1", "Actual Result", rowNum);
 			String expectedresult = reader.getCellData("Sheet1", "Expected Result", rowNum);
 				System.out.println("Expected Result is: " + expectedresult); // print expected result
 				System.out.println("This is Test Case: " + (rowNum - 1));
 			   //Assert.assertEquals(expected, act);
 			Thread.sleep(2000);
 				String pass = "pass";
 				String fail = "fail";
 				if (expectedresult.equals(actualresult)) {
 					reader.setCellData("Sheet1", "Status", rowNum, pass);
 					System.out.println("The test is " + pass);
 				} 
 				else {
 					reader.setCellData("Sheet1", "Status", rowNum, fail);
 					System.out.println("The test is " + fail);

 				} 
 				}
               }
  
  
               @Test
            	public void TestCase6() throws Exception {
            		Xls_Reader reader = new Xls_Reader("C:\\Users\\sania.ahmad\\ownCloud\\Automation trainees\\DATA\\Registrationshopping.xlsx");
            		int rowCount = reader.getRowCount("Sheet1"); // get row count
            		
            		
            		int rowNum = 7;

            		String EmailAddress = reader.getCellData("Sheet1", "Email Address", rowNum); //Email Address
            		System.out.println("The firstname is :" + EmailAddress);
            		
            		String Password=reader.getCellData("Sheet1", "Password", rowNum); //Password
            		System.out.println("The password is :" + Password);
            		
            				System.out.println("The Password is :" + Password);
            				
            				String Address=reader.getCellData("Sheet1", "Address", rowNum); //Address
            				System.out.println("The address is :" +Address);
            				
            				String Mobile=reader.getCellData("Sheet1", "Mobile", rowNum); //Mobile number
            				System.out.println("The mobile is :" +Mobile);
            				
            				String FirstName=reader.getCellData("Sheet1", "First Name", rowNum); //firstname
            				System.out.println("The firstname is :" + FirstName);
            				
            				String LasttName=reader.getCellData("Sheet1", "Last Name", rowNum); //Lasttname
            				System.out.println("The lastname is :" + LasttName);
            	
            				// fetching all test fields
            				
            		        driver.findElement(By.xpath("//*[@id='FormField_1']")).sendKeys(EmailAddress); //Email Address
            			     Thread.sleep(2000);
                
            	            driver.findElement(By.xpath("//*[@id='FormField_2']")).sendKeys(Password);  //Password
            			     Thread.sleep(2000);
            			     
                           driver.findElement(By.xpath("//*[@id='FormField_8']")).sendKeys(Address); //Address
            			     Thread.sleep(2000);
            			     
            			     
            			    Select phone = new Select(driver.findElement(By.className("custom_mobile_code")));
            				phone.selectByVisibleText("305");
            			    Thread.sleep(4000);
            					 
            					 
            			    driver.findElement(By.xpath("//input[@class='custom_mobile_number number_field']")).sendKeys(Mobile); //Phone Number
            			    Thread.sleep(2000);
            			  
            				 
            			    driver.findElement(By.xpath(" //*[@id='FormField_4']")).sendKeys(FirstName); //first name
            			    Thread.sleep(2000);
            		
            			
            			
            			    driver.findElement(By.xpath(" //*[@id='FormField_5']")).sendKeys(LasttName); //Last name
            			    Thread.sleep(2000);
            			
            			   Select City = new Select(driver.findElement(By.id("FormField_12"))); //Select city
            			   City.selectByVisibleText("Lahore");
            	           Thread.sleep(4000);
            	       
            	         Select Country = new Select(driver.findElement(By.id("FormField_11"))); //Select city
            		     Country.selectByVisibleText("Pakistan");
            	         Thread.sleep(4000);
            	         
            	         driver.findElement(By.xpath("//input[@type='submit' and @value='CREATE ACCOUNT']")).click();//Last name
            			    Thread.sleep(4000);
            		
            			 WebElement username = driver.findElement(By.name("FormField[2][8]"));    
            			String validationMessage = username.getAttribute("Please fill out this field.");
            			boolean required = Boolean.parseBoolean(username.getAttribute("required"));
            			   // System.out.println(required);
            	        //Boolean expected=true;
                       Boolean actual=required;
            	          System.out.println("actual is "+actual);
                          if(actual==required) {
           	            //String exp="";
           	            String act="Please fill out this field.";

            			
            	reader.setCellData("Sheet1", "Actual Result", rowNum, act);
            	//reader.setCellData("Sheet1", "Expected Result", rowNum, exp);
            			String	 actualresult = reader.getCellData("Sheet1", "Actual Result", rowNum);
            			String expectedresult = reader.getCellData("Sheet1", "Expected Result", rowNum);
            				System.out.println("Expected Result is: " + expectedresult); // print expected result
            				System.out.println("This is Test Case: " + (rowNum - 1));
            			   //Assert.assertEquals(expected, act);
            			Thread.sleep(2000);
            				String pass = "pass";
            				String fail = "fail";
            				if (expectedresult.equals(actualresult)) {
            					reader.setCellData("Sheet1", "Status", rowNum, pass);
            					System.out.println("The test is " + pass);
            				} 
            				else {
            					reader.setCellData("Sheet1", "Status", rowNum, fail);
            					System.out.println("The test is " + fail);

            				} 	}
               }
             
  

                          @Test
                       	public void TestCase7() throws Exception {
                       		Xls_Reader reader = new Xls_Reader("C:\\Users\\sania.ahmad\\ownCloud\\Automation trainees\\DATA\\Registrationshopping.xlsx");
                       		int rowCount = reader.getRowCount("Sheet1"); // get row count
                       		
                       		
                       		int rowNum = 8;

                       		String EmailAddress = reader.getCellData("Sheet1", "Email Address", rowNum); //Email Address
                       		System.out.println("The firstname is :" + EmailAddress);
                       		
                       		String Password=reader.getCellData("Sheet1", "Password", rowNum); //Password
                       		System.out.println("The password is :" + Password);
                       		
                       				System.out.println("The Password is :" + Password);
                       				
                       				String Address=reader.getCellData("Sheet1", "Address", rowNum); //Address
                       				System.out.println("The address is :" +Address);
                       				
                       				String Mobile=reader.getCellData("Sheet1", "Mobile", rowNum); //Mobile number
                       				System.out.println("The mobile is :" +Mobile);
                       				
                       				String FirstName=reader.getCellData("Sheet1", "First Name", rowNum); //firstname
                       				System.out.println("The firstname is :" + FirstName);
                       				
                       				String LasttName=reader.getCellData("Sheet1", "Last Name", rowNum); //Lasttname
                       				System.out.println("The lastname is :" + LasttName);
                       	
                       				// fetching all test fields
                       				
                       		        driver.findElement(By.xpath("//*[@id='FormField_1']")).sendKeys(EmailAddress); //Email Address
                       			     Thread.sleep(2000);
                           
                       	            driver.findElement(By.xpath("//*[@id='FormField_2']")).sendKeys(Password);  //Password
                       			     Thread.sleep(2000);
                       			     
                                      driver.findElement(By.xpath("//*[@id='FormField_8']")).sendKeys(Address); //Address
                       			     Thread.sleep(2000);
                       			     
                       			     
                       			    Select phone = new Select(driver.findElement(By.className("custom_mobile_code")));
                       				phone.selectByVisibleText("305");
                       			    Thread.sleep(4000);
                       					 
                       					 
                       			    driver.findElement(By.xpath("//input[@class='custom_mobile_number number_field']")).sendKeys(Mobile); //Phone Number
                       			    Thread.sleep(2000);
                       			  
                       				 
                       			    driver.findElement(By.xpath(" //*[@id='FormField_4']")).sendKeys(FirstName); //first name
                       			    Thread.sleep(2000);
                       		
                       			
                       			
                       			    driver.findElement(By.xpath(" //*[@id='FormField_5']")).sendKeys(LasttName); //Last name
                       			    Thread.sleep(2000);
                       			
                       			   Select City = new Select(driver.findElement(By.id("FormField_12"))); //Select city
                       			   City.selectByVisibleText("Lahore");
                       	           Thread.sleep(4000);
                       	       
                       	         Select Country = new Select(driver.findElement(By.id("FormField_11"))); //Select city
                       		     Country.selectByVisibleText("Pakistan");
                       	         Thread.sleep(4000);
                       	         
                       	         driver.findElement(By.xpath("//input[@type='submit' and @value='CREATE ACCOUNT']")).click();//Last name
                       			    Thread.sleep(4000);
                       		
                       			 WebElement username = driver.findElement(By.name("FormField[2][8]"));    
                       			String validationMessage = username.getAttribute("Please fill out this field.");
                       			boolean required = Boolean.parseBoolean(username.getAttribute("required"));
                       			   // System.out.println(required);
                       	        //Boolean expected=true;
                                  Boolean actual=required;
                       	          System.out.println("actual is "+actual);
                                     if(actual==required) {
                      	            //String exp="";
                      	            String act="Please fill out this field.";

                       			
                       	reader.setCellData("Sheet1", "Actual Result", rowNum, act);
                       	//reader.setCellData("Sheet1", "Expected Result", rowNum, exp);
                       			String	 actualresult = reader.getCellData("Sheet1", "Actual Result", rowNum);
                       			String expectedresult = reader.getCellData("Sheet1", "Expected Result", rowNum);
                       				System.out.println("Expected Result is: " + expectedresult); // print expected result
                       				System.out.println("This is Test Case: " + (rowNum - 1));
                       			   //Assert.assertEquals(expected, act);
                       			Thread.sleep(2000);
                       				String pass = "pass";
                       				String fail = "fail";
                       				if (expectedresult.equals(actualresult)) {
                       					reader.setCellData("Sheet1", "Status", rowNum, pass);
                       					System.out.println("The test is " + pass);
                       				} 
                       				else {
                       					reader.setCellData("Sheet1", "Status", rowNum, fail);
                       					System.out.println("The test is " + fail);

                       				} 	}
  
  
  
 }
	  

  @BeforeMethod
  public void beforeMethod() throws Exception {
	// browser invoke
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
		driver.manage().window().maximize();
         driver.get("https://homeshopping.pk/");

         driver.findElement(By.xpath("//a[text()='Your Account']")).click();
         driver.findElement(By.xpath("  //a[text()='Start here']")).click();
     
         
         
			Thread.sleep(6000);
  }


@AfterMethod
public void afterMethod() {
  driver.close();
}

}
