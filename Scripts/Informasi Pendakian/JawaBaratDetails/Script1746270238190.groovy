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

Mobile.tap(findTestObject('Informasi Pendakian/JAWABARAT_tabBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Cikuray/pendakianGnCikurayBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Cikuray/jalurCikurayBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Cikuray/jalurCikurayBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Ciremai/pendakianGnCiremaiBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Ciremai/jalurApuyBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Ciremai/jalurApuyBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Ciremai/jalurLinggarjatiBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Ciremai/jalurLinggarjatiBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Ciremai/jalurPalutunganBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Ciremai/jalurPalutunganBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Gede/pendakianGnGedeBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Gede/jalurGunungPutriBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Gede/jalurGunungPutriBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Gede/jalurCibodasBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Gede/jalurCibodasBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Guntur/pendakianGnGunturBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Guntur/jalurCititisBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Guntur/jalurCititisBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Malabar/pendakianGnMalabarBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Malabar/jalurMalabarBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Malabar/jalurMalabarBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Pangrango/pendakianGnPangrangoBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Pangrango/jalurCibodasBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Pangrango/jalurCibodasBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Papandayan/pendakianGnPapandayanBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Papandayan/jalurPapandayanBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Papandayan/jalurPapandayanBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Patuha/pendakianGnPatuhaBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Patuha/jalurPatuhaBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Barat/Patuha/jalurPatuhaBtn'), 0)

Mobile.pressBack()

Mobile.closeApplication()

