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

WebUI.setText(findTestObject('Object Repository/Page_Manage Sales Orders/input_Sales Order_cus.sd.salesorders.manage_6cf20f'), 
    GlobalVariable.Sales_Order)

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/div_Sales OrderContains 1 token183427Sold-t_9beef2'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/bdi_Go'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Manage Sales Orders/div_183427'), GlobalVariable.Sales_Order)

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/a_183427'))

WebUI.click(findTestObject('Object Repository/Page_Manage Sales Orders/td_USD_sapMListTblNavCol sapMTblLastVisibleCell_1'))

WebUI.click(findTestObject('Object Repository/Page_Display Sales Order - VA03/div_Change'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Change Standard Order 183427 Overview/span_Order_Quantity'))

WebUI.setText(findTestObject('Object Repository/Page_Create Standard Order Overview/input_Overall Status_InputField_1'), 
    Keys.chord('5', Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Create Standard Order Overview/div_Save'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_SAP/span_Standard Order 183427 has been saved'), ('Standard Order ' + GlobalVariable.Sales_Order) + 
    ' has been saved.')

WebUI.click(findTestObject('Object Repository/Page_SAP/div_ExitHelp'))

WebUI.click(findTestObject('Page_Home/span_UT'))

WebUI.click(findTestObject('Object Repository/Page_Trial Center/div_Sign Out'))

WebUI.click(findTestObject('Object Repository/Page_Trial Center/bdi_OK'))

WebUI.delay(5)

WebUI.closeBrowser()

