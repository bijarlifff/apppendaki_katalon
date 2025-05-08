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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\asus\\Desktop\\Course QA\\Katalon\\appPendaki\\APK\\app-pendaki.apk', false)

Mobile.tap(findTestObject('menuBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/informasiPendakianBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Argopuro/pendakianGnArgopuroBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Argopuro/jalurBaderanBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Argopuro/jalurBaderanBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Argopuro/jalurBremiBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Argopuro/jalurBremiBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/pendakianGunungArjunoBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurCangarBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurCangarBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurLawangBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurLawangBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurPurwosariBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurPurwosariBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurTretesBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Arjuno/jalurTretesBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Baluran/pendakianGnBaluranBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Baluran/jalurWonorejoBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Baluran/jalurWonorejoBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Bromo/pendakianGnBromoBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Bromo/jalurBromoBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Bromo/jalurBromoBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Butak/pendakianGnButakBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Butak/jalurSirahKencongBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Butak/jalurSirahKencongBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Butak/jalurPrinciDauBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Butak/jalurPrinciDauBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Ijen/pendakianGnIjen'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Ijen/jalurIjenBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Ijen/jalurIjenBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Kawi/pendakianGnKawiBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Kawi/jalurKawiBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Kawi/jalurKawiBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Kelud/pendakianGnKeludBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Kelud/jalurTulungrejoBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Timur/Kelud/jalurTulungrejoBtn'), 0)

Mobile.pressBack()

Mobile.closeApplication()

