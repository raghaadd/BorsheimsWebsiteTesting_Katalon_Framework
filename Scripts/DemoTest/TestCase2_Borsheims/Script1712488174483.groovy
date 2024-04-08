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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.borsheims.com/')

WebUI.click(findTestObject('Object Repository/Page_Borsheims Shop Luxury Jewelry, Watches_f55dd5/a_Account'))

WebUI.click(findTestObject('Object Repository/Page_Borsheims Customer Log In/a_Register'))


assert !done.contains("X") : 'Assertion failed: User already Registered.'


WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Sign-In Information_Customer_LoginEmail'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Email Address_Customer_Password'), 
    password)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/label_Confirm Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Password_Customer_VerifyPassword'), 
    confirmPassword)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/label_First Name'))

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_same as billing_Customer_ShipFirstName'), 
    firstName)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/label_Last Name'))

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_First Name_Customer_ShipLastName'), 
    lastName)

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Last Name_Customer_ShipEmail'), emailAdd)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/label_Phone Number'))

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Email Address_Customer_ShipPhone'), 
    phoneNo)

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Phone Number_Customer_ShipFax'), 
    faxNo)

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Fax Number_Customer_ShipCompany'), 
    company)

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Company_Customer_ShipAddress1'), 
    address)

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Address 2_Customer_ShipCity'), city)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/label_StateProvince'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Borsheims Create An Account/select_Outside USAlaskaAlabamaArkansasArizo_43b191'), 
    state, true)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/label_Other StateProvince'))

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/label_ZipPostal Code'))

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_StateProvince_Customer_ShipState'), 
    otherState)

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Other StateProvince_Customer_ShipZip'), 
    zipCode)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Create An Account/input_Country_button button-block button-sq_710b96'))

WebUI.delay(3)



def customerNameDisplay = WebUI.getText(findTestObject('Object Repository/Page_Borsheims Update Account Information/p_Hello user100. Your new account has been _8e8e0d'))

println("Customer Name Display: $customerNameDisplay")

assert customerNameDisplay.contains(firstName) : 'Assertion failed: user name is not found in the text.'

WebUI.click(findTestObject('Object Repository/Page_Borsheims Update Account Information/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Borsheims My Account/a_Log Out'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Shop Luxury Jewelry, Watches_f55dd5/a_Account'))

WebUI.setText(findTestObject('Object Repository/Page_Borsheims Customer Log In/input_Email Address_Customer_LoginEmail'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Borsheims Customer Log In/input_Password_Customer_Password'), 
    password)

WebUI.click(findTestObject('Object Repository/Page_Borsheims Customer Log In/input_Password_button button-square button-_a781a7'))

WebUI.delay(3)

WebUI.closeBrowser()

