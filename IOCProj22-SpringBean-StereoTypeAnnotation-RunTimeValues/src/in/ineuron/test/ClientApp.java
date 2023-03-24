package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.target.Flipkart;

public class ClientApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"in/ineuron/cfg/applicationContext.xml");

		Flipkart flipkart = applicationContext.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart.shopping(new String[] { "fossil", "puma", "iphone" },
				new float[] { 35000.5f, 56000.0f, 75000.35f }));

		applicationContext.close();
	}
}

//Output:
//	BlueDart.class file is loading...
//	BlueDart object is instantiated...
//
//
//	Flipkart.class file is loading...
//	Flipkart object is created...
//	FirstFlight.class file is loading...
//	FirstFlight object is created...
//	Flipkart.shopping()
//	in.ineuron.comp.FirstFlight
//	Date object details :: Fri Mar 31 17:37:18 IST 2023
//	URL value is :: https://www.flipkart.com
//	Discount amount is :: 30
//
//	Windows 10
//	C:/Users/Attraya/Downloads/eclipse-jee-2022-12-R-win32-x86_64/eclipse//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.5.v20221102-0933/jre/bin/server;C:/Users/Attraya/Downloads/eclipse-jee-2022-12-R-win32-x86_64/eclipse//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.5.v20221102-0933/jre/bin;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\Attraya\AppData\Local\Microsoft\WindowsApps;C:\Users\Attraya\Downloads\mongosh-1.6.0-win32-x64\mongosh-1.6.0-win32-x64\bin;C:\Users\Attraya\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\Attraya\AppData\Local\GitHubDesktop\bin;C:\Users\Attraya\Downloads\eclipse-jee-2022-12-R-win32-x86_64\eclipse;
//	[fossil, puma, iphone]are purchase having prices [35000.5, 56000.0, 75000.35] with the bill amount :: 166000.84---> FirstFlight courier will deliver with the order id :: 121 order products