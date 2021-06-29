package Stack;
public class mainStack {
    public static void main(String[] args) {
        var newStack = new stackClass(10);
        //NIM = 20090007
        newStack.push(07); 
        newStack.print();
        newStack.push(30);
        newStack.print();
        long bacaTop = newStack.peek();
        System.out.println("nilai teratas = "+bacaTop);
        System.out.println("Nama saya adalah = Marifatul Ikhsan");
        long bacahapus = newStack.pop();
        System.out.print("");
        System.out.println("nilai yang dihapus = "+ bacahapus );
        newStack.print();
        System.out.println(" ");
        newStack.push(40);
        newStack.print();
        newStack.push(50);
        newStack.print();
    } 
}

