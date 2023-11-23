package festivalAssignment;

import java.time.LocalDate;

public class Diwali extends FestivalDate{
    int i=0;
    int startYear=2023;
    public void cal(){

        for(LocalDate temp = fdate; temp.getYear()<=todate.getYear(); temp=temp.plusDays(354)){
            if((temp.getYear()-startYear)%3==0 ){
              temp.plusDays(29);
            }
            this.arrdate[i++]=temp;

        }
    }
}
