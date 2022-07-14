import java.util.*;

class Program {
  // Feel free to add new properties and methods to the class.
  static class MinMaxStack {
    int capacity=1000;
    int [] array=new int[capacity];
    int top_pointer=-1;
    public void expand(){
      int[] newarray=new int[2*capacity];
      capacity=2*capacity; 
      for(int i=0;i<array.length;i++){
        newarray[i]=array[i];
      }
      array=newarray;
      }
    public boolean isEmpty(){
      return top_pointer==-1;
    }
    public int peek() {
      // Write your code here.
      if(isEmpty()){
       return -1;
    } else {
            return array[top_pointer]; }
     
    }

    public int pop(){
      // Write your code here.
      if(isEmpty()){
       return -1;
      } else {
         int temp=array[top_pointer];
          array[top_pointer]=0;
          top_pointer--;
          return temp;
        
        }
    }

    public void push(Integer number) {
      // Write your code here
      if(top_pointer==capacity-1) expand();
      else {
        array[++top_pointer]=number;
      }
    }

    public int getMin(){
      // Write your code here.
      if(isEmpty()) return -1;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<=top_pointer;i++){
        if(array[i]<=min) min=array[i];
      }
      
      
    return min;
    }

    public int getMax(){
      // Write your code here
      if(isEmpty()) return -1;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<=top_pointer;i++){
        if(array[i]>=max) max=array[i];
      }      return max;
         }
  }
}
