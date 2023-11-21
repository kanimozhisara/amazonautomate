package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	

	public static void quit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}

}
