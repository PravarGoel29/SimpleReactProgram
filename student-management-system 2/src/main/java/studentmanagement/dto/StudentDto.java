package studentmanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    @NotEmpty(message="First name should not be empty")
    private String firstName;
    @NotEmpty(message="Last name should not be empty")
    private String lastName;
    @NotEmpty(message="Email should not be empty")
    @Email
    private String email;
	public StudentDto(Object id2, Object firstName2, Object lastName2, String email2) {
		// TODO Auto-generated constructor stub
	}
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	public void setId(Long studentId) {
		this.id = studentId;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

    // getter/setter methods
}
