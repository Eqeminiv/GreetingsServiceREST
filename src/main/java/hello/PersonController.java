package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    final String ticket = "e550d817-534c-4140-bb76-4395f83cac08";
    @RequestMapping("/{userId}/getPerson")
    public Person getPerson(@PathVariable("userId") int user,
                            @RequestParam(value="token", required = true) String token)
    {
        if(ticket.equals(token)) {
            for (Person p : Person.personList) {
                if (p.getId() == user) {
                    return p;
                }
            }
            return null;
        }
        else
        {
            System.out.println("Invalid token");
            return null;
        }

    }

    @RequestMapping("/getAllPersons")
    public List<Person> getAllPersons()
    {
        return Person.personList;
    }



}
