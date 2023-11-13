package BasicsOfJava;


// class Main 
// {
//     public static void test (String str)
//     {
//         int check = 4;
//         if (check == str.length ())
//         {
//             System.out.print (str.charAt (check -= 1) + ", ");
//         }
//         else
//         {
//         System.out.print (str.charAt (0) + ", ");
//         }
//     }
//     public static void main(String[] args)
//     {
//         test("four");
//         test("tee");
//         test("to");
//     }
// }
class Payload
{
    private int weight;
    public Payload (int w)
    {
        weight = w;
    }
    
    public void setWeight (int w)
    {
        weight = w;
    }
    
    public String toString ()
    {
        return Integer.toString (weight);
    }
}
class Test{
       public static void main(String[] args){
               int x = 3, y = 4;
               switch (x + 3) {
                   case 6:
                       y = 0;
                   case 7:
                       y = 1;
                   default:
                       y += 1;
               }
               System.out.println(y);
       }
}
class Alpha
{
    public void foo (String ... args)
    {
        System.out.println ("Alpha:foo");
    } 

    public void bar (String a)
    {
        System.out.println ("Alpha:bar");
    } 
} 
class Beta extends Alpha
{
    public void foo (String args)
    {
        System.out.println ("Beta:foo");
    } 
    
    public void bar (String a)
    {
        System.out.println ("Beta:bar");
    } 

    public static void main (String[]args)
    {
        Alpha a = new Beta ();
        Beta b = (Beta) a;
        a.foo ("test");
        b.foo ("test");
        a.bar ("test");
        b.bar ("test");
    } 
}


class Plant
{
    private String name;

    public Plant (String name)
    {
        this.name = name;
    }
  
    public String getName ()
    {
        return name;
    }
}

class Tree extends Plant
{
    public void growFruit ()
    {
    } 
    
    public void dropLeaves ()
    {
    } 
}

class Main 
{
	private static String func(String str)
	{
		System.out.print(str+" ");
		return str;
	}
	static String m=func("1");
	{
		m=func("2");
	}
	static
	{
		m=func("3");
	}
	public static void main(String[] args)
	{
		Object obj=new Main();
	}
}