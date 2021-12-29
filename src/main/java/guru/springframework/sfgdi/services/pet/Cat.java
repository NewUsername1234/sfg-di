package guru.springframework.sfgdi.services.pet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Service("petService")
@Profile({"cat", "default"})
public class Cat implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
