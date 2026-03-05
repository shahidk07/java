public class GenericArrayCompareAgain {

    public static <T> boolean sameElementsInOrder(T[] a, T[] b) {

        if (a == null || b == null) return a == b;
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] != null) return false;
            } else if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Character[] c1 = {'J', 'A', 'V', 'A'};
        Character[] c2 = {'J', 'A', 'V', 'A'};

        System.out.println(sameElementsInOrder(c1, c2));
    }
}