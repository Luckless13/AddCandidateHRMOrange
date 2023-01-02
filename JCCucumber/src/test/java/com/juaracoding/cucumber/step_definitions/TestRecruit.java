package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRecruit {
	WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruit() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    @When("click menu recruitment")
    public void click_menu_recruitment() {
    	recruitmentPage.clickBtnRecruitment();
        extentTest.log(LogStatus.PASS, "User click button recruitment");
    }

    @When("click add")
    public void click_add() {
    	recruitmentPage.clickBtnadd();
        extentTest.log(LogStatus.PASS, "User click button add");
    }

    @When("isi first name")
    public void isi_first_name() {
    	recruitmentPage.InputFname("Ray");
        extentTest.log(LogStatus.PASS, "User enter first name");
    }

    @When("isi middle name")
    public void isi_middle_name() {
    	recruitmentPage.InputMname("Ray");
        extentTest.log(LogStatus.PASS, "User enter middle name");
    }

    @When("isi last name")
    public void isi_last_name() {
    	recruitmentPage.InputLname("Ray");
        extentTest.log(LogStatus.PASS, "User enter last name");
    }

//    @When("select vacancy")
//    public void select_vacancy() throws InterruptedException {
//        recruitmentPage.selectVacancy(5);
//        extentTest.log(LogStatus.PASS, "User select vacancy");
//    }

    @When("isi email")
    public void isi_email() {
    	recruitmentPage.InputEmail("ray@mail.com");
        extentTest.log(LogStatus.PASS, "User enter E-mail");
    }

    @When("isi contact number")
    public void isi_contact_number() {
    	recruitmentPage.InputNumber("0123456789");
        extentTest.log(LogStatus.PASS, "User enter contact number");
    }

    @When("isi keywords")
    public void isi_keywords() {
    	recruitmentPage.InputKeywords("Keywords");
        extentTest.log(LogStatus.PASS, "User enter keywords");
    }

    @When("isi notes")
    public void isi_notes() {
    	recruitmentPage.InputNotes("Recommended");
        extentTest.log(LogStatus.PASS, "User enter notes");
    }

    @When("checklist data button")
    public void checklist_data_button() {
    	recruitmentPage.clickCheckboxData();
        extentTest.log(LogStatus.PASS, "User checklist Consent to keep data");
    }

    @When("Click simpan")
    public void click_simpan() {
    	recruitmentPage.clickSimpan();
        extentTest.log(LogStatus.PASS, "User click button simpan");
    }

    @Then("add candidate success")
    public void add_candidate_success() {
    	AssertJUnit.assertEquals(recruitmentPage.getTxtSuccess(), "Application Stage");
    	Assert.assertTrue(recruitmentPage.getTxtSuccess().contains("Application Stage"));
    	extentTest.log(LogStatus.PASS, "Berhasil Add Candidate");
    }
    
}
