import java.util.ArrayList;
import java.util.List;

public class foooo {
    public static void main(String[] args) {
        int[] nums = {6,2,4,4,5};
        System.out.println(foo( nums,8 ));
    }

    public static List<List<Integer>> foo(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if (arr[i] + arr[j] == target) {
                    List<Integer> sum = new ArrayList<>();
                    sum.add( arr[i] );
                    sum.add( arr[j] );
                    result.add( sum );
                }
            }
        }
        return result;
    }

}
