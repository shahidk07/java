public class SwitchExample {

    public static void main(String[] args) {

        //switch statement in place of many if-else

            String day="sosn";

            switch (day) {
                case "Monday","Tuesday","Wednesday","Thursday","Friday"->System.out.println("It's a weekday");
                case "Saturday","Sunday"->System.out.println("It's a week-end");
                default ->System.out.println(day + "is not a day");
            }
    }
}