@FunctionalInterface
interface IsEmpty {
    boolean check(String s);
}

public class LambdaCheckEmptyString {

    public static void main(String[] args) {

        IsEmpty emptyCheck = s -> (s == null) || s.isEmpty();

        System.out.println(emptyCheck.check(""));
        System.out.println(emptyCheck.check("Java"));
        System.out.println(emptyCheck.check(null));
    }
}