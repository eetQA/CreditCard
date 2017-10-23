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

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_Action'))

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'))

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption')) == 
true) {
    WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'))
}

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose'), 
    10) == true) {
    WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose'))
}

WebUI.delay(3)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_ContinueInvoiceOption'))

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_PaymentGateway'), 'PUBL')

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'), 'Visa Card')

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'), '4012000033330026')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_Process'))

