package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestCLass {
	public static void main(String[] args) {
		Integer i = IntStream.rangeClosed(0, 10).filter(n -> n%2==0).sum();
//		System.out.println(i);
		
		List<String> list = Arrays.asList("Maria", "Sandra", "Micheal", "Mango", "Banana","Grapes");
		
		List<String> mList = list.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());
		Map<Boolean,List<String>> ll = list.stream().collect(Collectors.partitioningBy(s -> s.startsWith("M")));
//		System.out.println(ll);
		
//		String::toLowerCase
		
		Collections.unmodifiableList(list);
		
		
		//FeignClient
		
//		@PAtch- partial update
		
		
		
		
		
		
	}
}
