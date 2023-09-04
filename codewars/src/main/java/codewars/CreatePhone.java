//Write a function that accepts an array of 10 integers (between 0 and 9), 
//that returns a string of those numbers in the form of a phone number. "(123) 456-7890"

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String phone = "(";
    for (int i = 0; i < numbers.length; i++) {
      if (i <= 2) {
        phone += numbers[i];
      }
      if (i == 2) {
        phone += ") ";
      }
      if (i > 2 && i <= 5) {
        phone += numbers[i];
      }
      if (i == 5) {
        phone += "-";
      }
      if (i > 5) {
        phone += numbers[i];
      }
    }
    return phone;
  }
}