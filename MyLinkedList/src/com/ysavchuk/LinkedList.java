package com.ysavchuk;

public class LinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = null, tail = null;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(10);
        linkedList.addNode(20);
        linkedList.addNode(30);
        linkedList.addNode(40);
        linkedList.printLinkedList();
        linkedList.addNodeAtStart(50);
        linkedList.printLinkedList();
        linkedList.removeNode();
        linkedList.printLinkedList();
        linkedList.removeNodeAtCertainIndex(3);
        linkedList.printLinkedList();
    }

    public void addNode(int val) {
        if (head == null) {
            Node temp = new Node(val);
            head = temp;
            tail = temp;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
    } // добавление элемента в конце текущего списка

    public void addNodeAtStart(int val) {
        if (head == null) {
            Node temp = new Node(val);
            head = temp;
            tail = temp;
        } else {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        } //добавление элемента в начале текущего списка
    }

    public void addNodeAtCertainIndex(int val, int index) {
        Node temp = head;
        int count = 0;
        while (temp !=null && ++count !=index)
            temp = temp.next;
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
    } //добавление элемента в определенном месте

    public  void removeNode() {
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    } //перемещает последний элемент и обновляет значение конечного элемента

    public void removeNodeAtStart() {
        head = head.next;
    } //перемещает первый элемент и обновляет начальное значение

    public void removeNodeAtCertainIndex(int index) {
        Node temp = head;
        int count = 0;
        while(temp != null && ++count != index)
            temp = temp.next;
        temp.val = temp.next.val;
        temp.next = temp.next.next;
    } // сдвигает элемент в определенной позиции

    public boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == target)
                return true;
        }
        return false; //проверка элемента уществует он в массиве или нет
    }

    public int searchAndReturnIndex(int target) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if(temp.val == target) return count;
        }
        return -1;
    } //поиск элемента с указанным индексом., возврат значения индекса

    public void printLinkedList() {
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.print(" " +temp.val);
            temp = temp.next;
        } //печать всего массива
    }
}
