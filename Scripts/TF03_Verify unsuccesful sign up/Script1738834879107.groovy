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

WebUI.navigateToUrl('https://demo-store.katalon.com/')

WebUI.click(findTestObject('Object Repository/Page_Zack Market/path'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Zack Market/input_Full name_fullname'), 'Truong Le Vinh Phuc')

WebUI.setText(findTestObject('Object Repository/Page_Zack Market/input_Email_email'), Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Zack Market/input_Verify password_verifyPassword'), 'O2B8DWahcyUGmREwD1MpFA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Zack Market/input_Password_password'), 'O2B8DWahcyUGmREwD1MpFA==')

WebUI.click(findTestObject('Object Repository/Page_Zack Market/input_at least one upper case_button_btn__1gz9J'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/div_at least one upper case'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Zack Market/div_at least one upper case'), 0)

WebUI.closeBrowser()

