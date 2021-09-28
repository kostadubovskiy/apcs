public class Time {
    public static void main(String[] args){
        int hour = 22;
        int minute = 11;
        int second = 10;
        System.out.print("Current time in seconds of the day: ");
        System.out.println(second * 1 + minute * 60 + hour * 60 * 60);
        System.out.print("Current time in seconds of the day remaining: ");
        System.out.println(24 * 60 * 60 - (second * 1 + minute * 60 + hour * 60 * 60));
        System.out.print("Current time in seconds of the day as percentage: ");
        System.out.print((float)(second * 1 + minute * 60 + hour * 60 * 60)/(24 * 60 * 60) * 100);
        System.out.println("%");
        int hourB = 22;
        int minuteB = 16;
        int secondB = 10;
        System.out.print("Time spent in seconds on this ... wonderful ... exercise: ");
        System.out.print((float)hourB * 60 * 60 + minuteB * 60 + secondB - (hour * 60 * 60 + minute * 60 + second));
    }
}
