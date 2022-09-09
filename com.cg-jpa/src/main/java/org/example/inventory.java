package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory")
public class inventory {
    private String itemname;
    @Id
    private int itemid;


    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    @Override
    public String toString() {
        return "inventory{" +
                "itemname='" + itemname + '\'' +
                ", itemid=" + itemid +
                '}';
    }
}
