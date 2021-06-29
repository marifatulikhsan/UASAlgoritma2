package Queue;
public class Antrian {
    private int ukuran;
    private long[] antrian;
    private int belakang;
    private int JumItem;
    private int depan;
    
    public Antrian (int s){
        ukuran = s;
        antrian = new long[ukuran];
        depan = 0;
        belakang = -1;
        JumItem = 0;
    }
    public void enQueue(long j){
        if (!isFull()){
            antrian[++belakang] = j;
            JumItem++;
        }
    }
    public long deQueue(){
        long temp = antrian[0];
        if (!isEmpty()){
            for (int i=0; i<JumItem; i++)
                antrian [i] = antrian[i+1];
            JumItem--;
            belakang--;
        }
        return temp;
    }
    public long peekDepan(){
        return antrian[depan];
    }
    public boolean isEmpty(){
        return(JumItem==0);
    }
    public boolean isFull(){
        return(belakang==ukuran-1);
    }
    public int ukuran(){
        return JumItem;
    }
    public void print(){
        for (int i=0;i<JumItem; i++)
        System.out.print(antrian[i]+" ");
        System.out.println("");
    }
}

