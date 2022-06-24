public class TowerOfHanoi {
    static void Hanoi(int n,char from,char to,char aux){
        if (n==0) return;

        Hanoi(n-1, from, aux, to);
        System.out.println("moving "+n+" from "+ from+" to "+ to);
        Hanoi(n-1, aux, to, from);


    }
    public static void main(String[] args) {
        Hanoi(3, 'A', 'B', 'C');
        
    }

    
}