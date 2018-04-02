package com.belatrixsf.customers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {

  @Id
  @SequenceGenerator(name = "seqGen", initialValue = 3) //Inicia en 3 para precargar data de prueba.
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
  private Integer id;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String email;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
