package week1.day3;

public class edgeBrowser {
	 public static void main (String [] args)
	 {
		Browser obj = new Browser();
		obj.loadUrl();
		String launchBrowser = obj.launchBrowser("Chrome");
		
		System.out.println(launchBrowser);
		
		
	 }

}
