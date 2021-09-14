package week3.day2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String company = "Paypal India";
		company = company.toLowerCase();
		company=company.replaceAll("\\s", "");
		System.out.println(company);
		char[] companyArray = company.toCharArray();
		System.out.println(companyArray);

		Set<Character> companySet = new TreeSet<Character>();
		Set<Character> dupCompanySet = new TreeSet<Character>();
		
		for (int i = 0; i < companyArray.length; i++) {
			if ((companySet.add(companyArray[i])) == false)
				dupCompanySet.add(companyArray[i]);
		}
		System.out.println("The given string: " + company);
		System.out.println("After removing the duplicated characters:");
		for (Character ch : companySet) {
			System.out.print(ch + " ");	
		}
		System.out.println();
		System.out.println("The duplicated characters are:");
		for (Character character : dupCompanySet) {
			System.out.print(character + " ");
		}
		}
}
