/*Digital root is the recursive sum of all the digits in a number.
Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.*/


    public class DigitalRoot {
        public static int digital_root(int n) {
            int i = n;
            if (i< 9) {
                return i;
            } else {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                return digital_root(sum);
            }
        }
    }

