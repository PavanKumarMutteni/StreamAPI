import java.util.*;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>arr=Arrays.asList(1,5,6,4,1,3,7,8,0,10,11);
		
		System.out.println("Array Contents");
		arr.stream().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		System.out.println("Array size is");
		System.out.println(arr.stream().count());
		
		System.out.println("Elements greater than 5 in the Array");
		arr.stream().filter(i->i>5).forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		System.out.println("Elements less than 5 in the Array");
		arr.stream().filter(i->i<5).forEach(i->System.out.print(i+" "));
		
		System.out.println("Square of the elements");
		arr.stream().forEach(i->System.out.print(i*i+" "));
		System.out.println();
		
		
		System.out.println("Printing elements equal to 1");
		arr.stream().filter(i->i.equals(1)).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		System.out.println("Printing Distinct Elements");
		arr.stream().distinct().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		System.out.println("Print only first 5 elements");
		arr.stream().limit(5).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		System.out.println("Max Element in the array ");
		Integer ans=arr.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(ans);
		
		System.out.println("Min element in array");
		Integer min=arr.stream().reduce(0,(a,b)->a>b?b:a);
		System.out.println(min);
		
		System.out.println("max Element in the array");
		System.out.println(arr.stream().max(Integer::compare).get());
		
		System.out.println("min Element in the array");
		System.out.println(arr.stream().min(Integer::compare).get());
		
		System.out.println("Sum of elements in array");
		Integer sum=arr.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		System.out.println("Cube of the elements in the array");
		arr.stream().map(i->i*i*i).forEach(i->System.out.print(i+" "));
		
		
		
		
		
		
		

	}

}
