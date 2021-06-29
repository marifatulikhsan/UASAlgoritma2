package Stack;
public class stackClass {
    public int ukuran;
    public long[] tumpukan;
    public int top;
   
    public stackClass(int data){
    ukuran = data;
    tumpukan =  new long[ukuran];
    top = -1;
    }
 
    public void push(long data){
        tumpukan[++top] = data;
    }
    
    public long pop(){
        return tumpukan[top--];
    }
    
    public long peek(){
        return tumpukan[top];
    }
    
    public boolean isEmpty(){
        return (top == ukuran-1);
    }
    
    public boolean isFull(){
        return (top == ukuran-1);
    }
    
    public void print(){
        int i = top;
        while (i>=0){
            System.out.print(tumpukan[i]+" ");
            i--;
        }
        System.out.println(" ");
    }
}

