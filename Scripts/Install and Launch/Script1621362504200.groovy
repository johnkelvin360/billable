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

Mobile.startApplication('C:\\Users\\John Kelvin\\Desktop\\app-arm64-v8a-release.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (3)'), 'https://csvdemomockappp.bundlewallet.com/invoice/parse', 
    0)

Mobile.tap(findTestObject('Object Repository/android.view.View - Continue (1)'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/android.view.View - Continue (2)'), 0, 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - httpscsvdemomockappp.bundlewallet.cominvoiceparse'), 
    0)

Mobile.hideKeyboard()

Mobile.pressBack()

Mobile.closeApplication()

