package movieshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cart<T> {
	
	private static final Logger logger = LogManager.getLogger(Cart.class);

	
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node<T> removedNode;

        if (index == 0) { // Remove head
            removedNode = head;
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = current.next;
            current.next = current.next.next;
        }

        size--;
        return removedNode.data;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
        	logger.info(current.data);
            current = current.next;
        }
    }

    public void processAllTransactions() {
        Node<T> current = head;
        while (current != null) {
            if (current.data instanceof Transaction) {
                ((Transaction) current.data).processTranscation();
            }
            current = current.next;
        }
    }
}

