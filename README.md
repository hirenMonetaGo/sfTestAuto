# sfTestAuto
Requirements:-
1.jdk 8
2.Browser
3.Driver

* firefox browser version above 56 --geckdriver
        Download geckodriver from below link v0.26.0
        https://github.com/mozilla/geckodriver/releases

* internetexplorer
        webDriver
        https://selenium-release.storage.googleapis.com/index.html
        
 * chrome
        webdriver
        https://chromedriver.chromium.org/downloads
        
------------------------------------------------------------------------------------------------------------------
change geckodrivers path in FirefoxDrv.java
        System.setProperty("webdriver.gecko.driver", "/home/hiren/Desktop/eclipseSpace/repo_sfTestAuto/geckodriver");
        TO
        System.setProperty("webdriver.gecko.driver", "Your geckodriver path");
        
--------------------------------------------------------------------------------------------------------------------

For runnig java file.

javac -cp ".:./lib/*" FirefoxDrv.java 
java -cp ".:./lib/*" FirefoxDrv
*********************************************************************************************************************
