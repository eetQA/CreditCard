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

WebUI.click(findTestObject('Equipment/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.click(findTestObject('Equipment/EquipmentSalesAgreementHeader/EquipSalesOrder_SalesOrderLine'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipSalesOrderLines/EquipSaleOrderLine_New'), 20)

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSaleOrderLine_New'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_Model'), 20)

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_Model'))

WebUI.setText(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_Model'), '1032')

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrderLine_Supplier'))

WebUI.setText(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrderLine_Supplier'), 'M00000182')

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_Price'))

WebUI.setText(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_Price'), '10')

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSaleOrder_Save'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_taxok'), 20)

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_taxok'))

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSalesOrder_ImportNOoption'))

WebUI.click(findTestObject('Equipment/EquipSalesOrderLines/EquipSaleOrder_SavenClose'))

WebUI.click(findTestObject('Equipment/EquipmentSalesAgreementHeader/EquipSalesOrder_MMTsavenClose'))

