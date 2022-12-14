
public class Stack<V> {
	private int max_ele;
    private V  [] stack;
    private int top;
    
    
    //COSTRUTTORE STACK CON OVERLOADING
    public Stack(int n)
    {
        stack = (V[]) new Object[n];
        top=-1;
        max_ele = n;
    }
    
    public void stack_push(V dato)
    {
        stack[++top]=dato;
    }
    
    public boolean stack_empty()
    {
        return top == -1;
    }
    
    public boolean stack_full()
    {
        return top == max_ele-1;
    }
    
    
    public V stack_pop()
    {
  
        return stack[top--];
    }
    
    public V stack_peek()
    {
        return stack[top];
    }
   
    public void print_stack()
    {
        while(!stack_empty())
        {
            System.out.print(stack_pop());
            System.out.print(" ");
        }
        System.out.println();
        
        System.out.println("FINE STACK");
    }
    
}

