class MyLinkedList {

    Node root;
    int size;
    public MyLinkedList() {
    
    }
    
    public int get(int index) {
        if(index < 0 || index > size-1) {
            return -1;
        }
        int count = 0;
        Node temp = root;
        while(count != index) {
            count++;
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = root;
        root = newNode;
        size++; 
    }
    
    public void addAtTail(int val) {
        if(root == null) {
            addAtHead(val);
            return;
        }
        Node temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
            return;
        }else {   
            int count = 1;
            Node newNode = new Node(val);
            Node temp = root;
            while(count < index) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        if(index == 0) {
            root = root.next;
            size--;
        } else if(index == size-1) {
            if(root.next == null) {
                root = null;
                size--;
                return;
            }
            Node temp = root;   
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        } else {
            Node temp = root;
            int count = 0;
            while(count < index-1) {
                temp = temp.next;
                count++;
            } 
            temp.next = temp.next.next;
            size--;
        }

    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    } 
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */