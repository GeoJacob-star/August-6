package org.lang;

public class LanguageInfo extends StateDetails {
  private void tamilLanguage() {
	System.out.println("Tamil language students : 2500");
}
  private void englishLanguage() {
	System.out.println("English language students : 1000");
}
 
  public static void main(String[] args) {
	  LanguageInfo l = new LanguageInfo();
	  l.tamilLanguage();
	  l.englishLanguage();
	  l.hindiLanguage();
	  l.southIndia();
	  l.northIndia();
}
}
