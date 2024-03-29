package com.MagentoLuna;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties props =new Properties();
    public Base(){
        try {
            String environment= System.getProperty("env","local");
            File file;
            if("local".equalsIgnoreCase(environment)){
            file=new File("src/main/java/com/MagentoLuna/Properties/local_config.Properties");
        } else if ("prod".equalsIgnoreCase(environment)) {
            file=new File("src/main/java/com/MagentoLuna/Properties/prod_config.Properties");
            }else throw new RuntimeException("environment n'est pas pris en charge !");

            FileInputStream fis = new FileInputStream(file);
            props.load(fis);

            }catch (IOException e){
            e.printStackTrace();
        }
        }
        public static WebDriver luncher(){
        String Browser= System.getProperty("Browser","Firefox");
        switch (Browser){
            case "Chrome"->{
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
            }
            case "Firefox"->{
                driver=new FirefoxDriver();

            }
            case "Edge"->{
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }}
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(props.getProperty("url"));
            return driver;
        }
        }

