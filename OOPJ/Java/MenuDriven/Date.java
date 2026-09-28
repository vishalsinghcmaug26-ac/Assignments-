public class Date {
    private int day;
    private int month;
    private int year;

    Date(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public void addYear(int y){
        year+=y;
    }
    public void addMonth(int m){
        month++;
        if(month>12){
            month=1;
            year++;
        }
    }
    public void addDay(int days) {
    while (days > 0) {
        int maxDays;

        if (month == 2) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                maxDays = 29;
            else
                maxDays = 28;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            maxDays = 30;
        else
            maxDays = 31;

        day++;
        days--;

        if (day > maxDays) {
            day = 1;
            month++;

            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }
    }
    public void display(){
        System.out.println(day+"/"+month+"/"+year);
    }
}   


