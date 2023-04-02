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

WebUI.navigateToUrl('http://52.207.92.183:8113/')

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/a_LOGIN'))

WebUI.setText(findTestObject('Object Repository/Page_RAMEN RESTAURANT/input_LOGIN_username'), 'abc')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_RAMEN RESTAURANT/input_LOGIN_password'), '8ylGA/40/qI=')

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_Home page/a_MAIN DISK'))

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/button_'))

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/button_'))

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/span_DRINKS'))

WebUI.verifyElementText(findTestObject('Page_RAMEN RESTAURANT/span_DRINKS'), drinks)

WebUI.click(findTestObject('Page_RAMEN RESTAURANT/span_APPETIZER'))

WebUI.verifyElementText(findTestObject('Page_RAMEN RESTAURANT/span_APPETIZER'), appetizer)

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/button_'))

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/button_'))

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/span_DESSERTS'))

WebUI.verifyElementText(findTestObject('Page_RAMEN RESTAURANT/span_DESSERTS'), desserts)

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/button_'))

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/span_APPETIZER'))

WebUI.click(findTestObject('Object Repository/Page_RAMEN RESTAURANT/button_'))

WebUI.closeBrowser()

