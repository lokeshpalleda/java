interface A
{
    void show();
    void display();
}
class B implements A
{
    public void show()
    {
        System.out.println("show method");
    }
    public void display()
    {
        System.out.println("display method");
    }
    public static void main(String []args)
    {
        B obj=new B();
        obj.show();
        obj.display();
    }
}
