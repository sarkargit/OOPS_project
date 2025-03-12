package Entities;

class ServiceDesk {
    private QueueManage queueManage;

    public ServiceDesk(QueueManage queueManager) {
        this.queueManage = queueManager;
    }

    public void callNextCustomer() {
        Token next = queueManage.serveNextCustomer();
        if (next != null) {
            System.out.println("Now serving: Token " + next.getTokenNumber() + " - " + next.getCustomer().getName());
        }
    }
}

