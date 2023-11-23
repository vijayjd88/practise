package festivalAssignment;

import day2.Read;

import java.time.LocalDate;

public abstract  class FestivalDate implements IFestival {

    LocalDate fdate,todate;
    LocalDate [] arrdate;

    public FestivalDate() {
        arrdate=new LocalDate[15];
    }

    public FestivalDate(int size) {
        arrdate=new LocalDate[size];
    }

    public FestivalDate(LocalDate fdate, LocalDate todate) {
        this.fdate = fdate;
        this.todate = todate;
        arrdate=new LocalDate[(todate.getYear()-fdate.getYear())+1];
    }

    @Override
    public void display() {
        System.out.println("The dates are : ");
        for (LocalDate x: arrdate){
            System.out.println(x);
        }
    }

    @Override
    public void readData() {

        System.out.println("Enter from date and to date ( YYYY-MM-DD)");
        System.out.println("From date : ");
        this.fdate=LocalDate.parse(Read.sc.next());
        System.out.println("To date : ");
        this.todate=LocalDate.parse(Read.sc.next());
    }


}
