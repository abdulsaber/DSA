public class twoStack {
    int a[];
    int top1, top2;

    public twoStack(int size){
        a  = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int data) throws Exception{
        if(top1+1 < top2){
            top1++;
            a[top1] = data;
        }else{
            throw new Exception("Stack-1 is full");
        }
    }

    void push2(int data) throws Exception{
        if(top1+1 < top2){
            top2--;
            a[top2] = data;
        }else{
            throw new Exception("Stack-2 is full");
        }
    }

    int pop1() throws Exception{
        if(top1 > -1){
            int temp = a[top1];
            top1--;
            return temp;
        }else {
            throw new Exception("Stack-1 is empty");
        }
    }

    int pop2() throws Exception{
        if(top2 < a.length){
            int temp = a[top2];
            top2++;
            return temp;
        }else {
            throw new Exception("Stack-2 is empty");
        }
    }
}
