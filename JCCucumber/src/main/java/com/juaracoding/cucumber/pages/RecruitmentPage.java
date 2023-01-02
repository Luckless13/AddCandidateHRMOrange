package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class RecruitmentPage {
	   private WebDriver driver;

	    public RecruitmentPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
	    WebElement btnRecruitment;
	    
	    @FindBy(xpath = "//button[normalize-space()='Add']")
	    WebElement btnAdd;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")
	    WebElement Fname;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input")
	    WebElement Mname;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")
	    WebElement Lname;
	    
	    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
	    WebElement selectvacancy;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
	    WebElement email;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
	    WebElement number;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input")
	    WebElement keywords;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")
	    WebElement notes;
	    
	    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	    WebElement checkboxdata;
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement btnSimpan;
	    
	    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
	    WebElement success;
	    
	    public void clickBtnRecruitment(){
	        btnRecruitment.click();
	    }

		public void clickBtnadd() {
			btnAdd.click();
		}

		public void InputFname(String Fname) {
			 this.Fname.sendKeys(Fname);
		}

		public void InputMname(String Mname) {
			this.Mname.sendKeys(Mname);
		}

		public void InputLname(String Lname) {
			this.Lname.sendKeys(Lname);
		}

		public void selectVacancy(int index) throws InterruptedException {
			Thread.sleep(1000);
	        Select selectedVacancy = new Select(selectvacancy);  
			selectedVacancy.selectByIndex(index);
		}

		public void InputEmail(String email) {
			this.email.sendKeys(email);
		}

		public void InputNumber(String number) {
			this.number.sendKeys(number);
		}

		public void InputKeywords(String keywords) {
			this.keywords.sendKeys(keywords);	
		}

		public void InputNotes(String notes) {
			this.notes.sendKeys(notes);
		}

		public void clickCheckboxData() {
			checkboxdata.click();
		}

		public void clickSimpan() {
			btnSimpan.click();
		}

		public String getTxtSuccess() {
			return success.getText();
		}
		
	    
}
