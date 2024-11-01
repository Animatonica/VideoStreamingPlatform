public class StreamingPlatform { //Singleton StreamingPlatform
    private static StreamingPlatform instance;

    private StreamingPlatform() {} //constructor private

    public static StreamingPlatform getInstance() {
        if (instance == null) {
            instance = new StreamingPlatform();
        }
        return instance;
    }

    public void subscribe(Subscription subscription) {
        System.out.println("Subscription Plan: " + subscription.getDescription());
        System.out.println("Total Cost: $" + subscription.getCost());
    }









}
