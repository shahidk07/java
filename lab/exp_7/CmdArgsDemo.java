public class CmdArgsDemo {
    public static void main(String[] args) {

        if (args.length < 2)
            throw new RuntimeException("Two numbers required");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a / b);
    }
}