public class LeapYear2 {
    public static void main (String[] args){
int year = 2116;
System.out.println("Year:" + year);
boolean czyPrzystepny;
if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
    czyPrzystepny = true;
} else {
    czyPrzystepny = false;
}
        System.out.println("Czy rok jest przystepny:" + czyPrzystepny);

    }
}
