

//do not use @Component here
public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyUpdate() {
        return "Swim 100 meters";
    }
}
