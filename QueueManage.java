package Entities;

import java.util.PriorityQueue;

class QueueManage{
    private PriorityQueue<Token> queue;

    public QueueManage() {
        queue = new PriorityQueue<>();
    }

    public void addCustomer(Customer customer) {
        Token token = new Token(customer);
        queue.add(token);
        System.out.println("Token generated: " + token.getTokenNumber() + " for " + customer.getName());
    }

    public Token serveNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in the queue.");
            return null;
        }
        return queue.poll();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("\nCurrent Queue:");
        for (Token token : queue) {
            System.out.println("Token " + token.getTokenNumber() + " - " + token.getCustomer().getName() + 
                               " (VIP: " + token.getCustomer().isVIP() + ")");
        }
    }
}
