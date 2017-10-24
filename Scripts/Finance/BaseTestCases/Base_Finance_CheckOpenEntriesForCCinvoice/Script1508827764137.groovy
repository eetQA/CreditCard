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

WebUI.callTestCase(findTestCase('Common/Base_Common_OpenSession'), [('SessionID') : 'tfacr2520m000'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Finance/BaseTestCases/Finance_OpenEntriesAction'))

WebUI.click(findTestObject('Finance/BaseTestCases/Finance_OpenEntries_FullyPaidOption'))

WebUI.setText(findTestObject('Finance/BaseTestCases/Finance_OpenEntries_InvoiceNumber1'), 'ARI')

WebUI.setText(findTestObject('Finance/BaseTestCases/Finance_OpenEntries_InvoiceNumber2'), '10000424')

WebUI.click(findTestObject('Finance/BaseTestCases/div'))

WebUI.click(findTestObject('Finance/BaseTestCases/Finance_OpenEntries_Balance'))

WebUI.click(findTestObject('Finance/BaseTestCases/div'))

WebUI.click(findTestObject('Finance/BaseTestCases/label_0.00'))

WebUI.click(findTestObject('Finance/BaseTestCases/div'))

WebUI.setText(findTestObject('Finance/BaseTestCases/Finance_OpenEntries_InvoiceNumber1'), '')

WebUI.setText(findTestObject('Finance/BaseTestCases/Finance_OpenEntries_InvoiceNumber2'), '')

WebUI.setText(findTestObject('Finance/BaseTestCases/input_tfacr2520m000-0-grid-1-t (2)'), 'M00000010 (ARI/10000424)')

WebUI.click(findTestObject('Finance/BaseTestCases/div'))

WebUI.click(findTestObject('Finance/BaseTestCases/label_80.00'))

WebUI.closeBrowser()

