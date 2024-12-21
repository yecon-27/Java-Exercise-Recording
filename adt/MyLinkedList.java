package com.ava.adt;

class MyLinkedList<E> {
    private Node<E> head, tail;
    private int size = 0;

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    public MyLinkedList() {
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0) {
            Node<E> newNode = new Node<>(e);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            if (current.next.next == null) {
                tail = current.next;
            }
        }
        size++;
    }
    public void addNode(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        add(e);
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            removedNode = previous.next;
            previous.next = removedNode.next;
            if (previous.next == null) {
                tail = previous;
            }
        }
        size--;
        return removedNode.element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }
    
    public void display() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            } else {
                result.append("]");
            }
        }
        return result.toString();
    }
}