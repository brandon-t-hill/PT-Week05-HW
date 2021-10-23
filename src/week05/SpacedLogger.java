package week05;

public class SpacedLogger implements Logger{
  public void Log(String l) {
    for (int i = 0; i < l.length(); i++) {
      System.out.print(l.charAt(i) + " ");
    }
    System.out.println();
  }
  public void Error(String e) {
    System.out.print("ERROR:");
    for (int i = 0; i < e.length(); i++) {
      System.out.print(e.charAt(i) + " ");
    }
    System.out.println();
  }
}