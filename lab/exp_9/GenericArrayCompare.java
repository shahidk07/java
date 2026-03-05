public class GenericArrayCompare {

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
        Integer[] x = {1, 2, 3};
        Integer[] y = {1, 2, 3};
        Integer[] z = {1, 3, 2};

        System.out.println("x vs y: " + sameElementsInOrder(x, y));
        System.out.println("x vs z: " + sameElementsInOrder(x, z));

        String[] s1 = {"A", "B"};
        String[] s2 = {"A", "B"};

        System.out.println("s1 vs s2: " + sameElementsInOrder(s1, s2));
    }
}