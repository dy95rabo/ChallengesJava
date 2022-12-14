public class Clock {
    public static void main(String[] args) {
        int hour = 0, minute = 0, second = 0;
        while (hour < 24) {
            System.out.println(hour + ":" + minute + ":" + second);
            second++;
            if (minute >= 60) {
                hour++;
                minute = 0;
            }
            if (second >= 60) {
                minute++;
                second = 0;
            }
        }
    }
}
