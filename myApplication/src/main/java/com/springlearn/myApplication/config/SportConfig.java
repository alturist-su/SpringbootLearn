port org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //the bean id defaults to the method name
    //for custom bean id:
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
