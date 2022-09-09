package org.example;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

public interface inventoryDAOinter {
    public void addinventory(inventory i);
    public void deleteinventory(int i);
    public inventory findinventory(int i);

}

/*@OneToMany(mappedBy = "inventory",cascade = CascadeType.ALL,orphanRemoval = true)

@ManyToMany
@JoinTable(name="inventory",joinColumns = @JoinColumn(name="itemid"),
        inverseJoinColumns = @JoinColumn(name="empid"));
@ManyToOne
@JoinColumn(name="itemid")

@ManytoMany
@JoinTable
(name="table1",
joincoloumns=@JoinColoumn(""id").
inverseJOinColoumns=@JoinColoumn(
 */
