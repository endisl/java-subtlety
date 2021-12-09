
//Q/1
//\u000d System.out.println("comment executed");

//Q/2
String s = "ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5
System.out.println(s);

//Q3/
int i = 10++11--12++13--14++15
System.out.println(i); 

//Q4/
String one = "Random";
String two = "Random";
if(one == two)
  System.out.println("one == two");
else
  System.out.println("one != two");

//Q5/
interface IFruit
{
  public String TYPE = "Apple";
}
class Fruit implements IFruit{}
public class Test
{
  psvm
    System.out.println(Fruit.TYPE);
}

//Q6/
class IFruit
{
  protected static String TYPE = "Apple";
}
class Fruit extends IFruit{}
public class Test
{
  psvm
    System.out.println(Fruit.Name);
}

////Q7/
public class Test
{
  psvm {
    final class Constants { public static String name = "PI"; }
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Constants.Name); }
    });
    thread.start();
  }  
}

//Q8/
public class Test
{
  psvm {
    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 == i2);
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);
  }
}

//Q9/
System.out.println(Math.min(Double.MIN_VALUE, 0.0d);

////Q10/
long longWithL = 1000 * 60 * 60 * 24 * 365L;
long longWithoutL = 1000 * 60 * 60 * 24 * 365;
System.out.println(longWithL);
System.out.println(longWithoutL);

//Q11/
public class Test
{
  static int a = 1111;
  static{
    a = a-- - --a;
  }
  {a = a++ + ++a;} 
  psvm {   
    System.out.println(a);
  }
}

/*Top 11 Tricky Java Coding Interview Questions | Java Programming | TalentSprint
https://www.youtube.com/watch?v=FB6RsHx7S6A*/