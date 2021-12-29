package guru.springframework.sfgdi.services.greeting.i18n;

import guru.springframework.sfgdi.services.greeting.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class Spanish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
