package stack;
class mystack {
  int top;
  int capacity;
  int []arr;

  public mystack(int cap){
    capacity=cap;
    top=-1;
    arr=new int[capacity];
  }
  public void push(int x){
    if(top==capacity-1){
      System.out.println("stack overflow");
       return;
    }
    arr[++top]=x;
  }
  public int pop(){
    if(top==-1){
      System.out.println("stack underflow");
      return -1;
    }
    return arr[top--];
  }
  public boolean isEmpty(){
    return top==-1;
  }
  public int peek(){
    if(top==-1){
      System.out.println("stack is empty");
      return -1;
    }
    return arr[top];
  }
  public boolean isfull(){
    return top==capacity-1;
  }

}
public class Main{
  public static void main(String[] args){
    mystack st=new mystack(4);
    st.push(1);
    st.push(3);
    st.push(7);
    st.push(9);

    System.out.println("Is stack empty"+(st.isEmpty()?"yes" : "no"));
    System.out.println("Is stack empty"+(st.isfull()?"yes" : "no"));
    System.out.println("popped"+st.pop());
    System.out.println("top elemnent"+st.peek());
  }
}
