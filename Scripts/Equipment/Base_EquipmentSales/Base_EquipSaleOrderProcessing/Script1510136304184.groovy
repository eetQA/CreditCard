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

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EquipSalesOrder_SendForApproval'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Equipment/EquipSalesOrder_Process/EquipSalesOrder_Status'), 'Pending for Approval')

WebUI.click(findTestObject('Equipment/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EquipSalesOrder_Action_Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Equipment/EquipSalesOrder_Process/EquipSalesOrder_Status'), 'Approved')

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EquipSaleOrder_Action_GeneratePO'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EquipSaleOrder_CreatePO'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EquipSalesOrder_PO_ok'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/ESO_PO_Close'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.click(findTestObject('Equipment/EquipmentSalesAgreementHeader/EquipSalesOrder_SalesOrderLine'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/ESO_LineMMT_SelectFirstRecord'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/ESO_Line_Action'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/ESO_Line_LinkedPO'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_MMT_OpenFirstRecord'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Action'), 20)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Action'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Action_SendForApproval'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Status'), 'Pending for Approval')

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Action'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Action_Approve'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Status'), 'Approved')

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Print'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Finalprint'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_ContinuePrint'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Print_Device'), 20)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Print_Device'))

WebUI.setText(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Print_Device'), 'D')

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_PrintDevice_Ok'))

WebUI.delay(5)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_tab'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Print_Close'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Action'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Action_Reciepts'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Receipt_Save'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Reciept_Action'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Receipt_action_RecieptLines'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_ReceiptsLines_New'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_ReceiptLines_SelectLine'))

WebUI.click(findTestObject('Equipment/EquipSalesOrder_Process/EPO_Receipt_SelectLine_SaveNclose'))

