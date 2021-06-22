import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class vcyu {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,2,3,4,5,6,7,8,9);
        list.stream()
                .filter( integer -> integer%2==0 )
                .forEach( System.out::println );
    }
}
