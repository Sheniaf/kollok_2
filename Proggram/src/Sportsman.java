public class Sportsman {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void ChangeActivity(){
        if(activity instanceof Sleep)
            setActivity(new Breakfast());
        else if (activity instanceof Breakfast)
            setActivity(new Workout());
        else if (activity instanceof Workout)
            setActivity(new Lunch());
        else if (activity instanceof Lunch)
            setActivity(new Hobby());
        else if (activity instanceof Hobby)
            setActivity(new Dinner());
        else if (activity instanceof Dinner)
            setActivity(new Sleep());
    }

    public void JustDoIt(){
        activity.JustDoIt();
    }
}
