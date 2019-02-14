
package com.one.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author butt Feb 12, 2019
 *
 *         This class takes information of rooms and available Senior and junior cleaners
 */
public class WorkflowStructure {

  private List<Integer> rooms;
  private int senior;
  private int junior;

  public WorkflowStructure() {
    this.rooms = new ArrayList<Integer>();
    this.senior = 0;
    this.junior = 0;
  }

  public WorkflowStructure(List<Integer> rooms, int senior, int junior) {
    super();
    this.rooms = rooms;
    this.senior = senior;
    this.junior = junior;
  }

  public List<Integer> getRooms() {
    return rooms;
  }

  public void setRooms(List<Integer> rooms) {
    this.rooms = rooms;
  }

  public int getSenior() {
    return senior;
  }

  public void setSenior(int senior) {
    this.senior = senior;
  }

  public int getJunior() {
    return junior;
  }

  public void setJunior(int junior) {
    this.junior = junior;
  }

}
