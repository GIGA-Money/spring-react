package com.springreact.springreact.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class OwnerEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long owerid;
  private String firstname, lastname;
  /**
   * cascade defines how cascading affects the entities. the attribute all means that if the owner
   * is deleted the cars linked to that owner are deleted as well. the mapped by owner,, tesll us
   * that the car class has the owner field, which is the foreign key for this relationship.
   */
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
  private List<CarEntity> cars;

  /**
   * set and get for cars of the owner
   */
  public List<CarEntity> getCars() {
    return cars;
  }

  public void setCars(List<CarEntity> cars) {
    this.cars = cars;
  }

  public OwnerEntity() {}

  public OwnerEntity(String firstname, String lastname) {
    super();
    setFirstname(firstname);
    setLastname(lastname);
  }
}
