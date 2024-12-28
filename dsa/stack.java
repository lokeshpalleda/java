import java.util.*;
public class Stack
{
    public int[] stack;
    public int top;
    public int capa;
    public Stack(int size)
    {
        stack=new int[size];
        top=-1;
        capa=size;
    }

public Boolean isfull(){
        return top==capa-1;
}
public Boolean isempty(){
    return top==-1;
}
public void push(int data)
{
    if(isfull())
    {
        System.out.println("Stack overflow");
        return;
    }
    stack[++top]=data;
    System.out.println("data is"+data);
}
public int pop()
{
    if(isempty()){
        System.out.println("Stack underflow");
        return -1;
    }
    return stack[top--];
}
public int peek()
{
    return stack[top];
}
public void display()
{
    if(isempty()){
        System.out.println("Stack underflow");
        return ;
    }
    
        for(int i=top;i>=0;i--)
        {
        System.out.println(stack[i]);
        }
    
}
  public static void main(String[] args){
        Stack stack=new Stack(5);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
    }
}
