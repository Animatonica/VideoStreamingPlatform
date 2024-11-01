public class BasicSubscription implements Subscription { //BasicSubscription class
        public String getDescription() {
            return "Basic Subscription";
        }

        public double getCost() {
            return 10.00; //Base price for a basic subscription
        }

}
