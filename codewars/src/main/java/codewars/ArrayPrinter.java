package codewars;


public class ArrayPrinter {
 
public static void main(String[] args) {
  Object[] array = new Object[] { 2, 4, 5, 2 };
  System.out.println(printArray(array));
}
  public static String printArray(Object[] array) {
    String exit = "";
    for (int i = 0; i < array.length; i++) {
      exit += array[i].toString();
        if (i != array.length-1) {
        exit += ",";}
    }
    return exit;
  }
}