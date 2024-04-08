import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


MyKeyword myKeyword = new MyKeyword()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.borsheims.com/')

WebUI.click(findTestObject('Object Repository/Page_Borsheims Shop Luxury Jewelry, Watches_f55dd5/a_Account'))

WebUI.click(findTestObject('Object Repository/Page_Borsheims Customer Log In/h1_Customer Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Customer Log In/input_Email Address_Customer_LoginEmail'), 
    'test@testqa2024.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Borsheims Customer Log In/input_Password_Customer_Password'), 
    't5ZplbsdaekaZru/tLui7Q==')

WebUI.click(findTestObject('Object Repository/Page_Borsheims Customer Log In/input_Password_button button-square button-_a781a7'))

//String brandName = myKeyword.randomBrandName()
String brandName="Hobo"

WebUI.setText(findTestObject('Object Repository/Page_Borsheims My Account/input_Search_Search'), brandName)

WebUI.sendKeys(findTestObject('Object Repository/Page_Borsheims My Account/input_Search_Search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Hobo Bags, Wallets, Purses  Handbags  _81ac8c/div_Home Gift BrandsHobo InternationalHobo _26aa2d'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Hobo Bags, Wallets, Purses  Handbags  _81ac8c/h1_Hobo International'))

def customerLoginText = WebUI.getText(findTestObject('Object Repository/Page_Hobo Bags, Wallets, Purses  Handbags  _81ac8c/h1_Hobo International'))

println("Text before clicking: $customerLoginText")

assert customerLoginText.contains(brandName) : "Assertion failed: '$brandName' is not found in the text."

WebUI.click(findTestObject('Object Repository/Page_Hobo Bags, Wallets, Purses  Handbags  _81ac8c/img_main-image image-b95-ed4-042'))




//if(brandName=="Hobo") {
//	WebUI.click(findTestObject('Object Repository/Page_Hobo Bags, Wallets, Purses  Handbags  Borsheims/div_type--card card-b95-b21-8c3'))
//}else if(brandName=="Baccarat") {
//	WebUI.click(findTestObject('Object Repository/Page_Baccarat Glassware, Stemware, Vases, Frames  Figurines  Borsheims/div_type--card card-8ec-5f0-530'))
//}else {
//	WebUI.click(findTestObject('Object Repository/Page_Vhernier Jewelry  Borsheims/div_type--card card-955-6b0-e58'))
//}


WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_HOBO Joni Large Shoulder Bag, Cognac  _9b8c8a/button_Add to Bag'))

WebUI.click(findTestObject('Object Repository/Page_HOBO Joni Large Shoulder Bag, Cognac  _9b8c8a/img_My Account_main-logo'))

WebUI.click(findTestObject('Object Repository/Page_Borsheims Shop Luxury Jewelry, Watches_f55dd5/span_My Account_icon-svg-bag'))

WebUI.click(findTestObject('Object Repository/Page_Borsheims Shop Luxury Jewelry, Watches_f55dd5/a_Checkout'))

def productName=WebUI.getText(findTestObject('Object Repository/Page_Borsheims Your Bag/h4_HOBO Joni Large Shoulder Bag, Cognac'))
println("*******************************");
println("Product Name: "+productName);
def productPrice=WebUI.getText(findTestObject('Object Repository/Page_Borsheims Your Bag/p_328.00'))
println("Product Price: "+productPrice);
def productTotalPrice=WebUI.getText(findTestObject('Object Repository/Page_Borsheims Your Bag/p_328.00'))
println("Product Total Price: "+productTotalPrice);


WebUI.closeBrowser()

