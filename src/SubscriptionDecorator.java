public abstract class SubscriptionDecorator implements Subscription { //Subscription Decorator
    protected Subscription subscription;

    public SubscriptionDecorator(Subscription subscription) {
        this.subscription = subscription;
    }

    public String getDescription() {
        return subscription.getDescription();
    }

    public double getCost() {
        return subscription.getCost();
    }

}