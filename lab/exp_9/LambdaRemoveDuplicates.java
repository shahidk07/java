import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface RemoveDuplicates {
    List<Integer> apply(List<Integer> list);
}

public class LambdaRemoveDuplicates {

    public static void main(String[] args) {

        RemoveDuplicates rd = list ->
                list.stream()
                    .distinct()
                    .collect(Collectors.toList());

        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        System.out.println("Original: " + nums);
        System.out.println("Unique: " + rd.apply(nums));
    }
}