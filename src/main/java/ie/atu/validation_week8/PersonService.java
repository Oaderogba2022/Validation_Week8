package ie.atu.validation_week8;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public void savePerson(Person person){
        System.out.println("person saved: " +person);
    }

    public Person getPersonEmployeeId(String employeeId){
        return new Person();
    }
}
