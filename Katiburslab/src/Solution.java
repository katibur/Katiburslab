
public class Solution {
	public static void main(String[] args){
        Adder a=new Adder();
        System.out.println("My superclass is: "+a.getClass().getSuperclass().getName());	
        System.out.println(a.add(22,20)+" "+a.add(10,3)+" "+a.add(15,5));
     }
}
