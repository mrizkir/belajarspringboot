package id.ac.sttindonesia.belajarspringboot;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "user")
public class UserEntity
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, unique = true, name="username")
  private String userName;

  @Column(nullable = false, length=15)
  private String password;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false, name = "first_name")
  private String firstName;

  @Column(nullable = false, name = "last_name")
  private String lastName;

  @Column(nullable = false)
  private String role;

  public Integer getId()
  {
    return this.id;
  }
  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getUserName()
  {
    return this.userName;
  }
  public void setUserName(String userName)
  {
    this.userName = userName;
  }

  public String getPassword()
  {
    return this.password;
  }
  public void setPassword(String password)
  {
    this.password = password;
  }

  public String getEmail()
  {
    return this.email;
  }
  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getFirstName()
  {
    return this.firstName;
  }
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return this.lastName;
  }
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getRole()
  {
    return this.role;
  }
  public void setRole(String role)
  {
    this.role = role;
  }
}
