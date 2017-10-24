import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Actions'))

WebUI.delay(3)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Costing'))

WebUI.delay(5)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.RepriceWarning'))

WebUI.delay(3)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.CostingProcessCont'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.InvoiceCont'))

WebUI.delay(15)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Enter CC No'))

WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Enter CC No'), '6035180003002223')

WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Enter CC No'), Keys.chord(Keys.TAB))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.DefaultBPAddress'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.CVV2'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.CVV2'), '865')

WebUI.delay(3)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Process'))

WebUI.delay(13)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PrintOK'))

WebUI.delay(10)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PrintDevice'))

WebUI.delay(5)

