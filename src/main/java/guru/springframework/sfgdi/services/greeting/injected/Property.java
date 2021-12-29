package guru.springframework.sfgdi.services.greeting.injected;

import guru.springframework.sfgdi.services.greeting.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Service
public class Property implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
