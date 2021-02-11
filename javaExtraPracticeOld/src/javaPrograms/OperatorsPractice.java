package javaPrograms;

public class OperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 100;
        int b = 300;
        int c = 150;
        
        double d1 = 25.2525;
        double d2 = 5.2525;
        
        
        ++a; // value in a is now 101
        int x = ++a; // value in a is 102 which is assigned to x
        System.out.println(++a);//103, as before this a had 102
        System.out.println(x);//102
        System.out.println(--b);//299
        System.out.println(++a);//104
        System.out.println(--b);//298
        System.out.println(++x);//103
        
        int sum = a+b+c;
        System.out.println(sum);// java can add multiple numbers
        
        System.out.println(b-c);
        System.out.println(b*a);
        System.out.println(b/c);//As b has 298, 298/150 = 1
        double d3 = d1/d2;
        System.out.println(d3);
        // checking <, <= relational operators
        System.out.println(d3<d1);
        boolean bool = d3>d2;
        System.out.println(bool);
        double d4 = 2.555;
        double d5 = 2.555;
        System.out.println("d4 equals to d5 :" +(d5==d4));//true
        System.out.println("d4 not equals to d5 :"+(d5!=d4));//false
        String s1 = "adfg1234";
        String s2 = "ADFG1234";
        System.out.println(s1==s2);
        double d6 = 4.55;
        System.out.println(d5==d6);
        d6=d5;
        System.out.println(d5);
        System.out.println(d6);
        int n1 = 151;
        int n2 = 108;
        int n3 = 18;
        int n4 = 201;
        int n5 = 18;
        int smallNo;
        if (n1<=n2)
        {
        	smallNo = n1;
        }
        else 
        {
        	smallNo = n2;
        }
        if (smallNo>n3)
        {
        	smallNo = n3;
        }
        if (smallNo>n4)
        {
        	smallNo = n4;
        }
        if (smallNo > n5)
        {
        	smallNo = n5;
        }
        System.out.println("Smallest No is :"+smallNo);
	}

}
