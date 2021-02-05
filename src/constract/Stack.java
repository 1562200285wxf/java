package constract;

//下压堆栈
public class Stack<Item> {
    private Node first;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first.item == null;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public void pop(){
        Node oldNode = first.next;
        first =oldNode;
    }

}
