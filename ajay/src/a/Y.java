package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Y {
	public static void main(String[] args) {
//		ArrayList<Payment> list = new ArrayList<>();
		Payment p1 = new Payment(1, 100d, "PhonePay");
		Payment p2 = new Payment(2, 150d, "GPay");
		Payment p3 = new Payment(3, 200d, "NetBank");
		Payment p4 = new Payment(4, 240d, "PhonePay");
		Payment p5 = new Payment(5, 400d, "GPay");
		
		ArrayList<Payment> list = new ArrayList<>( Arrays.asList(p1,p2,p3,p4,p5));
		
//		System.out.println(list);
		
		Y y = new Y();
		Set<String> set = y.getType(list);
//		System.out.println(set);
		
		Map<String, Double> map = y.getPays(list);
//		System.out.println(map);
		
		y.getRankValue(list, 1);
		String str = "abcadhbdta";
		Map<String,Long> m = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new,Collectors.counting()));
		System.out.println(m);
	}
	// distinct type
	public Set<String> getType(ArrayList<Payment> list){
//		Set<String> types = new HashSet<String>();
		return list.stream().map(p -> p.getType()).collect(Collectors.toSet());
	}
	
	public Map<String, Double> getPays (ArrayList<Payment> list){
//		Map<String,Long> map = list.stream().map(p -> p.getType()).collect(Collectors.groupingBy(s -> s,LinkedHashMap::new,Collectors.counting()));
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(Payment::getType,Collectors.summingDouble(Payment::getAmount)));
		return map;
	}
	
	Comparator<Payment> comp = (p1, p2) -> {
		return p2.getAmount().compareTo(p1.getAmount());
	};
	
	public String getRankValue(ArrayList<Payment> list,int rank) {
		TreeSet<Payment> set = new TreeSet<Payment>(comp);
//		Collections.sort(list,comp);
		
		Payment l = list.stream().sorted((o1,o2)->o2.getAmount().compareTo(o1.getAmount())).collect(Collectors.toList()).get(rank-1);
		
//		for(Payment p:l) {
		System.out.println(l.getAmount());
//		}
		return null;
	} 
	
}