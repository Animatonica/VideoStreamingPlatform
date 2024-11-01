//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Main
public class Main {
    public static void main(String[] args) {
        StreamingPlatform platform = StreamingPlatform.getInstance();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Subscription subscription = new BasicSubscription();
        subscription = new HD(subscription);
        subscription = new AdFree(subscription);
        subscription = new OfflineDownload(subscription);

        platform.subscribe(subscription); //Expecting "Basic Subscription, HD Streaming, Ad Free, Offline Download" with calculated cost.
    }
}