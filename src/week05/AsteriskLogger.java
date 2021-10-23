package week05;

public class AsteriskLogger implements Logger{

  public void Log(String l) {
    System.out.println("***" + l + "***");
  }

  public void Error(String e) {
    String err = "***Error: ***";
    int width = e.length() + err.length();
    for (int i = 0; i < 3; i++) {
      if (i == 0 || i == 2) {
        for (int j = 0; j < width; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      else {
        System.out.println("***ERROR: " + e + "***" );
      }
    }
  }
}