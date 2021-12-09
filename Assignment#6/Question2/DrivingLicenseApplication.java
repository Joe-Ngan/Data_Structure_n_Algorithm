package Question2;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) throws Exception {
        Scanner text = new Scanner(System.in);

        System.out.println("Please Enter Applicant Birth year in format YYYY");
        String strYear = text.nextLine();  // Read user input
        int year = Integer.parseInt(strYear);

        System.out.println("Please Enter Applicant Birth month in format MM");
        String strMonth = text.nextLine();  // Read user input
        int month = Integer.parseInt(strMonth);

        System.out.println("Please Enter Applicant Birth date in format DD");
        String strDate = text.nextLine();  // Read user input
        int day = Integer.parseInt(strDate);

        Date now = new Date();
        Date birth = new GregorianCalendar(year, month, day).getTime();

        try{
            int difference = (int) (ChronoUnit.DAYS.between( birth.toInstant(), now.toInstant()));
            int age = difference/365;
            if (age < 16) {
                throw new Exception("The age of the applicant is " + age + " which is too early to apply for a driving license");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
