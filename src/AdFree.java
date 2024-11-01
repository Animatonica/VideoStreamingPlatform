public class AdFree extends SubscriptionDecorator { //Ad Free class
    public AdFree(Subscription subscription) {
        super(subscription);
    }

    public String getDescription() {
        return subscription.getDescription() + ", Ad Free";
    }

    public double getCost() {
        return subscription.getCost() + 4.99;
    }

}