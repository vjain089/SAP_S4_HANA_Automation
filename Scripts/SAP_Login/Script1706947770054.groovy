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

//WebUI.navigateToUrl('https://my304870.s4hana.ondemand.com/ui?sap-language=EN&help-mixedLanguages=false#ProductTrialOffer-displayTrialCenter&/s4hana_us/tours')
WebUI.navigateToUrl('https://cloudtrials.cfapps.eu10-004.hana.ondemand.com/public/access-trial/87b8bf62-d009-4758-96ae-15bbf539d560?t=S4HANA_CLOUD')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_SAP Trial Sign In/input_Email or User Name_j_username'), 'vjainkatalon@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_SAP Trial Log On/div_Continue'))

WebUI.delay(10)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAP Universal ID/input_com_password'), 'icP23tTPdjsOed6Z/XwIKg==')

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_Sign in'))

WebUI.delay(10)

not_run: WebUI.click(findTestObject('Page_Trial Center/span_UT'))

WebUI.takeScreenshotAsCheckpoint('test')

