class Stack {

    private int array[];
    private int top;
    private int capacity;

    Stack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        array[++top] = x;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("UnderFlow");
            System.exit(1);
        }
        System.out.println("Removing " + peek());
        return array[top--];
    }

    public int peek() {
        if (!isEmpty())
            return array[top];
        else
            System.exit(1);
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

}



