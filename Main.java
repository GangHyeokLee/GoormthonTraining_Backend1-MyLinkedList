package GoormProject7_Linked_List;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> test = new MyLinkedList<>();
        test.add(1);
        test.add(2);
        test.add(3);

        System.out.println(test);

        System.out.println(test.get(2));

        System.out.println(test.delete(1));

        test.forEach(System.out::print);

        System.out.println();

        System.out.println("-------------------------------------");

        // Queue

        MyLinkedList<Integer> queue = new MyLinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);


        queue.forEach(System.out::print);

        System.out.println();

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        queue.forEach(System.out::print);
        System.out.println();

        queue.add(6);
        queue.add(7);
        queue.add(8);

        queue.forEach(System.out::print);
        System.out.println();

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        queue.forEach(System.out::print);
        System.out.println();

        System.out.println("-------------------------------------");

        MyLinkedList<Integer> stack = new MyLinkedList<>(
                Arrays.asList(1, 2, 3, 4)
        );

        stack.add(5);

        stack.forEach(System.out::print);

        System.out.println();

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        stack.forEach(System.out::print);
        System.out.println();

        stack.add(6);
        stack.add(7);
        stack.add(8);

        stack.forEach(System.out::print);
        System.out.println();

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());


        stack.forEach(System.out::print);
    }
}


