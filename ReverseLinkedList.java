public class ReverseLinkedList {

    public static LinkedList.Node reverse(LinkedList mylist){

        LinkedList.Node head = mylist.head;

        if(head==null) return null;
        if(head.next==null) return head;

        LinkedList.Node current = mylist.head;
        LinkedList.Node nextNode = current.next;
        LinkedList.Node temp = null;
        current.next = null;
//        1 2 3 4 5
        while (current!=null ){

            if (nextNode.next !=null){
                temp = nextNode.next;
            }
            nextNode.next = current;

            if (temp!=null){
                current = nextNode;
                nextNode = temp;
                temp = null;
            }else {
                current = null;
            }
        }

        mylist.head = nextNode;
        return head;
    }

    public static void main(String[] args) {
        LinkedList mylist = new LinkedList(1);
        mylist.append(2);
        mylist.append(3);
        mylist.append(4);
        mylist.append(5);

        reverse(mylist);
        mylist.printList();
    }
}
