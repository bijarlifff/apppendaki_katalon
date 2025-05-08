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

Mobile.tap(findTestObject('Informasi Pendakian/LUARJAWA_tabBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Agung/pendakianGnAgungBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Agung/jalurPuraBesakihBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Agung/jalurPuraBesakihBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Agung/jalurPasarAgungBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Agung/jalurPasarAgungBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Jaya Wijaya/pendakianGnJayaWijayaBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Jaya Wijaya/jalurJayaWijayaBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Jaya Wijaya/jalurJayaWijayaBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Kerinci/pendakianGnKerinciBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Kerinci/jalurKersikTuoBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Kerinci/jalurKersikTuoBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Latimojong/pendakianGnLatimojongBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Latimojong/jalurKaranganBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Latimojong/jalurKaranganBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Rinjani/pendakianGnRinjaniBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Rinjani/jalurSenaruBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Rinjani/jalurSenaruBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Rinjani/jalurSembalunBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Rinjani/jalurSembalunBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Rinjani/jalurToreanBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Rinjani/jalurToreanBtn'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Tambora/pendakianGnTamboraBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Tambora/jalurPancasilaBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Tambora/jalurPancasilaBtn'), 0)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Tambora/jalurDoroNgancaBtn'), 0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Informasi Pendakian/Luar Jawa/Tambora/jalurDoroNgancaBtn'), 0)

Mobile.pressBack()

Mobile.closeApplication()

