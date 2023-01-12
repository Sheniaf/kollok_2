public class Day {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Sportsman sportsman = new Sportsman();
        sportsman.setActivity(activity);
        for(int i = 0; i < 7; i++){
            sportsman.JustDoIt();
            sportsman.ChangeActivity();
        }
    }
}
