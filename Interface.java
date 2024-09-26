//single as well as mulunterface

interface Animal
{
void sound();
}
class Dog implements Animal {
public void sound()
{
  System.out.println("dog barks");
}
}
class Cat implements Animal {
public void sound()
{
System.out.println("cat sound");
}
}
public class Ab
{
public static void main(String[] args)
{
Animal dog=new Dog();
Animal cat=new Cat();
dog.sound();
cat.sound();
}
}
