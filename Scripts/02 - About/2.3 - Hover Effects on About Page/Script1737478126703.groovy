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

WebUI.navigateToUrl('http://webapps.platotrain.com/webfeatures/Home/About')

WebUI.scrollToElement(findTestObject('Object Repository/Page_About - WebFeatures/div_Innovative Design            Explore cu_5e50c7'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_About - WebFeatures/div_Innovative Design            Explore cu_5e50c7'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_About - WebFeatures/div_Customizable Components            Brow_1ff84f'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_About - WebFeatures/div_Customizable Components            Brow_1ff84f'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_About - WebFeatures/div_Interactive Elements            Engage _080147'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_About - WebFeatures/div_Interactive Elements            Engage _080147'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_About - WebFeatures/div_Secure  Reliable            All feature_9c8428'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_About - WebFeatures/div_Secure  Reliable            All feature_9c8428'))

