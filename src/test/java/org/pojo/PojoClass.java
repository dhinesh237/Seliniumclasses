package org.pojo;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	// non para meterized const
	public PojoClass() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAc;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstNameTxtBox;
	
	@FindBy(name="lastname")
	private WebElement secondNameTxtBox;
	
	@FindBy(name="reg_email__")
	private WebElement phnorEmailTxtBox;
	
	@FindBy(name="reg_passwd__")
	private WebElement newPasswrd;
	
	@FindBy(name="email")
	private WebElement emailbox;
	
	@FindBy(id="pass")
	private WebElement passwrdbox;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	

	public WebElement getEmailbox() {
		return emailbox;
	}

	public WebElement getPasswrdbox() {
		return passwrdbox;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getCreateNewAc() {
		return createNewAc;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}

	public WebElement getPhnorEmailTxtBox() {
		return phnorEmailTxtBox;
	}

	public WebElement getNewPasswrd() {
		return newPasswrd;
	}

	
	

}
