package Using_java8_program;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Removing_duplicate_using_stream_api {

    public static void main(String[] args) {

        Integer[] arr= new Integer[]{1,1,2,2,3,3};

        List<Integer> list= Arrays.asList(arr);
        Set<Integer> setlist = list.stream().collect(Collectors.toSet());
        System.out.println(setlist);
    }


}
