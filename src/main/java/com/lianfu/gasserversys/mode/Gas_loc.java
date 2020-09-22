package com.lianfu.gasserversys.mode;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Gas_loc {


  private  int parent_id;
  private  int city_id;
  private  String name;

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gas_loc{" +
                "parent_id=" + parent_id +
                ", city_id=" + city_id +
                ", name='" + name + '\'' +
                '}';
    }
}
