package steams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoClassWithStreams {

	public static void main(String[] args) {

		List<Integer> listOfInteger = new ArrayList<>(Arrays.asList(22,33,44,55,66));
		System.out.println("listOfInteger "+ listOfInteger);
        int sum = listOfInteger.stream().filter((i->i>20)).filter((i->i<60)).mapToInt(d->d).sum();
        System.out.println(" Sum "+ sum);
        
        int sum1 = listOfInteger.stream().filter((i->i>20 && i<60)).mapToInt(d->d).sum();
        System.out.println(" Sum "+ sum1);

        
        List<String> listOfString = new ArrayList<String>(Arrays.asList("dd","ram","apple"));
        System.out.println("listOfString "+ listOfString);
		List<String> resultString = listOfString.stream().sorted(Collections.reverseOrder()).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("resultString "+resultString);
		
		List<String> resultStringWithoutMap = listOfString.stream().filter(s->s.length() > 2).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("resultStringWithoutMap "+resultStringWithoutMap);

	}

}
