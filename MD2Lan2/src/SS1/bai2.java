package SS1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();


        String result = readNumber(number);
        System.out.println("Kết quả: " + result);
    }

    public static String readNumber(int number) {
        if (number < 10 && number >= 0) {
            // Đọc các số có một chữ số
            switch (number) {
                case 0:
                    return "zero";
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
            }
        } else if (number < 20 && number >= 10) {

            switch (number) {
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
            }
        } else if (number < 100 && number >= 20) {

            int tens = number / 10;
            int ones = number % 10;

            String tensString = "";
            switch (tens) {
                case 2:
                    tensString = "twenty";
                    break;
                case 3:
                    tensString = "thirty";
                    break;
                case 4:
                    tensString = "forty";
                    break;
                case 5:
                    tensString = "fifty";
                    break;
                case 6:
                    tensString = "sixty";
                    break;
                case 7:
                    tensString = "seventy";
                    break;
                case 8:
                    tensString = "eighty";
                    break;
                case 9:
                    tensString = "ninety";
                    break;
            }

            String onesString = "";
            switch (ones) {
                case 1:
                    onesString = "one";
                    break;
                case 2:
                    onesString = "two";
                    break;
                case 3:
                    onesString = "three";
                    break;
                case 4:
                    onesString = "four";
                    break;
                case 5:
                    onesString = "five";
                    break;
                case 6:
                    onesString = "six";
                    break;
                case 7:
                    onesString = "seven";
                    break;
                case 8:
                    onesString = "eight";
                    break;
                case 9:
                    onesString = "nine";
                    break;
            }

            return tensString + " " + onesString;
        } else if (number < 1000 && number >= 100) {

            int hundreds = number / 100;
            int remainder = number % 100;

            String hundredsString = readNumber(hundreds) + " hundred";
            String remainderString = readNumber(remainder);

            if (remainder == 0) {
                return hundredsString;
            } else {
                return hundredsString + " and " + remainderString;
            }
        }

        return "out of ability";
    }
}
