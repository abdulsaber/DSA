public class bubbleSort_LL {
    public static void main(String[] args) {
        Node list = new Node(10);
        Node list2 = new Node(10);
        Node list3 = new Node(200);
        Node list4 = new Node(30);
        Node list5 = new Node(10);
        
        Node head = list;
        list.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;

        head = bubbleSort(head);

        printLL(head);
    }
    public static void printLL(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}

    static Node bubbleSort(Node head){
        if(head == null) return head;
        
        int n = length(head);

        for(int i = 0; i < n; i++){
            Node temp = head;
            Node temp1 = temp.next;
            for(int j = 0; j < n-i-1; j++){
                if(temp.data > temp1.data){
                    int var = temp.data;
                    temp.data = temp1.data;
                    temp1.data = var;
                }
                temp = temp1;
                temp1 = temp1.next;
            }
        }
        Node sorted = head;
        return sorted;
    }
    
    static int length(Node head){
        Node temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
