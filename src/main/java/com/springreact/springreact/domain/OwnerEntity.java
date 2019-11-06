package com.springreact.springreact.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Data;

@Entity(name = "owner")
@Data
public class OwnerEntity {
  /**
   * Properties of the owner.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long owerid;
  private String firstname, lastname;


  @ManyToMany(cascade = CascadeType.MERGE)
  @JoinTable(name = "car_owner", joinColumns = {@JoinColumn(name = "ownerid")},
      inverseJoinColumns = {@JoinColumn(name = "id")})
  private Set<CarEntity> cars = new HashSet<CarEntity>(0);

  public Set<CarEntity> getCars(){
    return cars;
  }
  
  public void setCars(Set<CarEntity> cars) {
    this.cars = cars;
  }
  
  public OwnerEntity(String firstname, String lastname) {
    super();
    setFirstname(firstname);
    setLastname(lastname);
  }
}
/**
 * @Notes bellow are left for @author GIGA-Money review, and will be removed for develop branch
 *        merge.
 */
/**
 * cascade defines how cascading affects the entities. the attribute all means that if the owner is
 * deleted the cars linked to that owner are deleted as well. the mapped by owner,, tesll us that
 * the car class has the owner field, which is the foreign key for this relationship.
 * 
 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner") private List<CarEntity> cars;
 */
/**
 * Set and get for cars of the owner. these are created by Project Lombok and are left in as
 * references for @author GIGA-Money review.
 * 
 * public List<CarEntity> getCars() { return cars; }
 */
/**
 * 
 * @param cars
 * 
 *        public void setCars(List<CarEntity> cars) { this.cars = cars; }
 */
