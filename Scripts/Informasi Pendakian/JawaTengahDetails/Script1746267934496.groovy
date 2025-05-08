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

Mobile.tap(findTestObject('Informasi Pendakian/JAWATENGAH_tabBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Andong/pendakianGnAndongBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Andong/jalurBaratBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Andong/jalurBaratBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Andong/jalurSelatanBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Andong/jalurSelatanBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Andong/jalurUtaraBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Andong/jalurUtaraBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Lawu/pendakianGnLawuBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Lawu/jalurCemoroKandangBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Lawu/jalurCemoroKandangBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Lawu/jalurCemoroSewuBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Lawu/jalurCemoroSewuBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merapi/pendakianGnMerapiBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merapi/jalurSeloBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merapi/jalurSeloBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/pendakianGnMerbabuBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurSuwantingBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurSuwantingBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurWekasBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurWekasBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurKopengBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurKopengBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurSeloBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Merbabu/jalurSeloBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Prau/pendakianGnPrauBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Prau/jalurDiengBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Prau/jalurDiengBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Prau/jalurPatakBantengBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Prau/jalurPatakBantengBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Prau/jalurWatesBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Prau/jalurWatesBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Rogojembangan/pendakianGnRogojembanganBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Rogojembangan/jalurRogojembanganBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Rogojembangan/jalurRogojembanganBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Sindoro/pendakianGnSindoroBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Sindoro/jalurSigedangBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Sindoro/jalurSigedangBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Sindoro/jalurKledungBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Sindoro/jalurKledungBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/pendakianGnSlametBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurKaliguaBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurKaliguaBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurKaliwadasBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurKaliwadasBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurBambanganBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurBambanganBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurGuciBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurGuciBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurBaturadenBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Jawa Tengah/Slamet/jalurBaturadenBtn'), 0)

Mobile.pressBack()

Mobile.closeApplication()

