public class OfflineDownload extends SubscriptionDecorator { //Offline Download class
    public OfflineDownload(Subscription subscription) {
        super(subscription);
    }

    public String getDescription() {
        return subscription.getDescription() + ", Offline Download";
    }

    public double getCost() {
        return subscription.getCost() + 7.99;
    }
}