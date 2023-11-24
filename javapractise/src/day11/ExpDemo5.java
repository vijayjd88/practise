package day11;

import day2.Read;

import java.time.LocalDate;

public class ExpDemo5 {

    public static void main(String[] args) {
        String date;
        System.out.println("Enter the date to be checked");
        date = Read.sc.nextLine();
        String error = "";
        try {
            if (date.length() != 10) {
                error = " Invalid date length";
            }
            else if (Integer.parseInt(date.substring(0, 4)) < 0) error = "Invalid year";
            else if (Integer.parseInt(date.substring(0,4))>2023) error = "You are not yet born";
            else if (date.charAt(4)!='-'&& date.charAt(7)!='-') error = " Invalid date format";
            else if (Integer.parseInt(date.substring(5, 7)) < 0 || Integer.parseInt(date.substring(5, 7)) >12) error = "Invalid month";
            if (!error.equals("")) throw new InvalidDateEntry(error);
            System.out.println( "Your age is " +(LocalDate.now().getYear() -LocalDate.parse(date).getYear()));
        }
        catch(InvalidDateEntry e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
