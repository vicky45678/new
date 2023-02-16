package Using_java8_program;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Removing_duplicate_using_stream_api2 {

    public static void main(String[] args) {

        Integer[] arr=new Integer[]{1,3,5,1,3,6,7,};

        List<Integer> list= Arrays.asList(arr);
        Set<Integer> Setlist=list.stream().collect(Collectors.toSet());
        System.out.println(Setlist);
    }
}
