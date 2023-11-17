package day4.assignment;

public class FigtoWord {
    public static String getWords(long amt){

        String [] units = {" ", " one ", "two ", "three ", "four ", " five ", " six ", " seven ",
                "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", " fourteen ",
                " fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};

        String [] tens= { " ", " ten ", " twenty ", " thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
        String [] hundreds= {" crores ", " lacs ", "thousands ", "hundreds ", " only "};
        long [] val = {10000000L, 100000L, 1000L, 100L, 1L };
        String words = " ";
        for(int i=0;i<val.length;i++){
            int n1= (int) (amt/val[i]);
            amt=amt % val[i];
            if(n1>0){
                if(n1>19){
                    words= words + tens[n1/10] + units[n1%10] + hundreds[i];
                }
                else{
                    words=words+units[n1]+ hundreds[i];
                }
            }
        }
        return words;
    }
}
