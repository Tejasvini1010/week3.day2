package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	public static void main(String[] args) {
		String[] company = {"Google","Microsoft","TestLeaf","Maverick"};
		int length = company.length;
		System.out.println("The size of array is "+length);
		List<String> companyList = new ArrayList<String>(Arrays.asList(company));
		Collections.sort(companyList);
		Collections.reverse(companyList);
		System.out.println(companyList);
		
	}
}
