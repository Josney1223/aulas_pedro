import No.No;

public class Programa{

    public static void main(String args[]){        
        No head = new No(null, "1");  
        No n1 = new No(head, "2");
        No n2 = new No(head, "3");
        No n3 = new No(head, "4");
        
        head.setProx(n1, head);        
        head.setProx(n2, head);
        head.setProx(n3, head);
        head.printThis("3", head);  
        head.printThis("3", head);                     
    }
}