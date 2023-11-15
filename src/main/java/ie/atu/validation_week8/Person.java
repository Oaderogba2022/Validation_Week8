package ie.atu.validation_week8;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotBlank(message ="Name cannot be blank")
    @Size(min =2, max =50, message = "Name must be between 2 and 50 characters" )
    private String name;
    @NotBlank(message ="Title cannot be blank")
    private String title;

    @Min(value=0, message ="EmployeeId must be greater than or equal to 0")
    private int employeeId;

    @Min(value=0, message ="Age must be greater than or equal to 0")
    private int age;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message ="Position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be left blank")
    private String department;


}
