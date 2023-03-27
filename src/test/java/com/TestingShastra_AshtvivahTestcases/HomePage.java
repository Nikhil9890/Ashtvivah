package com.TestingShastra_AshtvivahTestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestingShastraLogic.KeyWord;
import com.TestingShastra_utils.FileUtils;
import com.TestingShastraLogic.Testbase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Listeners(com.TestingShastra.listeners.ListenerClass.class)
public class HomePage extends Testbase {
	//@Test
	public void verifyHomePageTitle() {
		KeyWord.launchUrl(FileUtils.getappurl("Ecommerce"));
		String element="//div[@class='_2fX4J']";
		KeyWord.presenceofelement(By.xpath(element));
		System.out.println("HomePage Open");
	}

	@Test
	public void clickonlinkthenopenandswitchtonewtab() {
		KeyWord.launchUrl(FileUtils.getappurl("Ecommerce"));
		driver.findElement(By.xpath("//div/a/img[@class='_12dJy']")).click();
//		By ele=By.xpath("//span[@aria-hidden=\"true\"and contains(text(),'google_logo Play')]");
//		KeyWord.presenceofelement(ele); //error line
		System.out.println(driver.getTitle());
		String parent=driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
}
