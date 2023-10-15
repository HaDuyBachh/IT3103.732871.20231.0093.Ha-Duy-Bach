/* Ha Duy Bach 20210093*/

import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int daysInMonth = 0;
        boolean InputCheck = false;
		//        checkYear

        while (!InputCheck) {
            System.out.print("Nhập năm (năm phải là ố không âm > 1000 và nhỏ hơn 10000): ");
            year = input.nextInt();

            if (year >= 1000&&year<10000) {
            	InputCheck = true;
            } else {
                System.out.println("Giá trị không hợp lệ");
            }
        }

        InputCheck = false;

        while (!InputCheck) {
            System.out.print("Nhập tháng (Month, Abbreviation, In 3 letters, In Numbe): ");
            String monthInput = input.next();

            switch (monthInput) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    month = 1;
                    InputCheck = true;
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    month = 2;
                    InputCheck = true;
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    month = 3;
                    InputCheck = true;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    month = 4;
                    InputCheck = true;
                    break;
                case "may":
                case "5":
                    month = 5;
                    InputCheck = true;
                    break;
                case "june":
                case "jun":
                case "6":
                    month = 6;
                    InputCheck = true;
                    break;
                case "july":
                case "jul":
                case "7":
                    month = 7;
                    InputCheck = true;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    month = 8;
                    InputCheck = true;
                    break;
                case "september":
                case "sep.":
                case "sep":
                case "9":
                    month = 9;
                    InputCheck = true;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    month = 10;
                    InputCheck = true;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    month = 11;
                    InputCheck = true;
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    month = 12;
                    InputCheck = true;
                    break;
                default:
                    System.out.println("Invalid month. Please enter a valid month.");
            }
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            // Leap year
            int[] daysInLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            daysInMonth = daysInLeapYear[month];
        } else {
            // Common year
            int[] daysInCommonYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            daysInMonth = daysInCommonYear[month];
        }

        System.out.println("Có " + daysInMonth + " ngày trong tháng: " + month + "/" + year);
        input.close();
    }
}