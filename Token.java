package Entities;

import java.util.concurrent.atomic.AtomicInteger;

class Token implements Comparable<Token> {
    private static AtomicInteger counter = new AtomicInteger(1);
    private int tokenNumber;
    private Customer customer;
    private long timestamp;

    public Token(Customer customer) {
        this.tokenNumber = counter.getAndIncrement();
        this.customer = customer;
        this.timestamp = System.currentTimeMillis();
    }

    public int getTokenNumber() {
        return tokenNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int compareTo(Token other) {
        if (this.customer.isVIP() && !other.customer.isVIP()) {
            return -1; 
        } else if (!this.customer.isVIP() && other.customer.isVIP()) {
            return 1; 
        } else {
            return Long.compare(this.timestamp, other.timestamp); 
        }
    }
}
