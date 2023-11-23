package festivalAssignment;

import java.time.LocalDate;

public class Ramzan extends FestivalDate{
    int i=0;

    public void cal(){
    for(LocalDate temp=fdate; temp.getYear()<=todate.getYear();temp=temp.plusDays(354)){

        this.arrdate[i++]=temp;

    }
    }

 }
