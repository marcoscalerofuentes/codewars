package codewars;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int updown = 0;
    int leftright = 0;
    int count = 0;
    for (int i = 0; i < walk.length; i++) {
      if (walk[i] == 'n') {
        updown++;
      }
      if (walk[i] == 's') {
        updown--;
      }
      if (walk[i] == 'w') {
        leftright++;
      }
      if (walk[i] == 'e') {
        leftright--;
      }
      count++;
    }
    if (count == 10 && leftright == 0 && updown == 0) {
      return true;
    } else {
      return false;
    }
  }

}
