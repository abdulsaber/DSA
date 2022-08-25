public class addTwoNo {
    
    public Node addTwoNumbers(Node r1, Node r2){
        
        Node head = null, tail = null;
        int carry = 0;
        while(r1 != null || r2 != null || carry == 1) {
			int sum = carry;
			if(r1 != null) {
				sum += r1.data;
				r1 = r1.next;
			}
			if(r2 != null) {
				sum += r2.data;
				r2 = r2.next;
			}
			
			int digit = sum % 10;
			carry = sum / 10;
			
			Node newNode = new Node(digit);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
		}
		return head;
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}