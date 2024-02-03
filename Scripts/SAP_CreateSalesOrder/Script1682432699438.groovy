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

WebUI.enableSmartWait()

WebUI.click(findTestObject('Page_Manage Sales Orders/button_Leave Tour'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Home/span_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Trial Center/input_All_search'), 'Manage Sales Order')

WebUI.click(findTestObject('Object Repository/Page_Trial Center/b_Manage Sales Order'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/span_Create'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/div_Create Sales Order VA01'))

WebUI.setText(findTestObject('Object Repository/Page_Create Sales Documents/input_O_InputField'), 'OR')

WebUI.click(findTestObject('Object Repository/Page_Create Sales Documents/div_ContinueEmphasized'))

WebUI.setText(findTestObject('Object Repository/Page_Create Standard Order Overview/input_S_InputField'), '17100007')

WebUI.setText(findTestObject('Object Repository/Page_Create Standard Order Overview/input_C_InputField'), 'TEST')

WebUI.click(findTestObject('Object Repository/Page_Create Standard Order Overview/div_Standard OrderNet ValueSold-to PartyShi_75e7b7'))

WebUI.setText(findTestObject('Object Repository/Page_Create Standard Order Overview/input_P_InputField'), '0004')

WebUI.setText(findTestObject('Object Repository/Page_Create Standard Order Overview/input_I_InputField'), 'EXW')

WebUI.sendKeys(findTestObject('Page_Create Standard Order Overview/input_I_InputField_1'), Keys.chord('Palo Alto', Keys.ENTER))

WebUI.sendKeys(findTestObject('Page_Create Standard Order Overview/input_Overall Status_InputField'), Keys.chord('MZ-FG-26XR1', 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Create Standard Order Overview/input_Overall Status_InputField_1'), 
    Keys.chord('10', Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create Standard Order Overview/div_Save'))

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Page_Create Standard Order Overview/span_SuccessMessage'), 0) == true) {
    GlobalVariable.Sales_Order = WebUI.getText(findTestObject('Page_Create Standard Order Overview/span_SuccessMessage')).substring(
        15, 21)

    print(GlobalVariable.Sales_Order)
}

WebUI.click(findTestObject('Object Repository/Page_SAP/div_Exit'))

