


 class Sample
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }

}


public class Main
{
public static void main(String args[])
{
    Sample sa=new Sample();
    sa.setName("john snow");
    sa.setAge(24);
    
    System.out.println("Name is "+sa.getName());
    System.out.println("Age is "+sa.getAge());
}
}
