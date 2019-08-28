
package archway.dc;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;




@Entity
public class record {

  //variables
  private @Id @GeneratedValue long id;

  private String firstName;
  private String lastName;
  private String email;
  private long ssNum;
  private String dob;



  //Constructors
  public record(String firstName, String lastName, String email, long ssNum, String dob){

    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.ssNum = ssNum;
    this.dob = dob;
  }

  private record(){}

  //helper functions
  @Override
  public boolean equals(Object o) {

    if(this == o){
      return true;
    }

    if(o == null || getClass() != o.getClass()){
      return false;
    }

    return true;

  }

  @Override
  public String toString(){
    return "{" + "ssNum=" + ssNum + '\'' + ", firstName='" + firstName + '\'' +", lastName='" + lastName + '\'' +", email='" + email + '\'' +", dob='" + dob + '\'' +'}';
  }



  //getters & setters



  public String getfirstName() {
    return firstName;
  }

  public void setfirstName(String firstName){
    this.firstName = firstName;
  }

  public String getlastName() {
    return lastName;
  }

  public void setlastName(String lastName){
    this.firstName = lastName;
  }

  public long getssNum() {
    return ssNum;
  }

  public void setssNum(long ssNum){
    this.ssNum = ssNum;
  }

  public String getemail(){
    return email;
  }

  public void setemail(String email){
    this.email = email;
  }

  public String getDOB(){
    return dob;
  }

  public void setDOB(String dob){
    this.dob = dob;
  }



//close class
}
