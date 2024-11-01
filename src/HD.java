public class HD extends SubscriptionDecorator { //HD class
    public HD(Subscription subcription) {
        super(subcription);
    }

    public String getDescription() {
        return subscription.getDescription() + ", HD Streaming";
    }

    public double getCost() {
        return subscription.getCost() + 2.99;
    }

}

