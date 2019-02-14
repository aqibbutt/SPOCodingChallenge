package com.one.service;

import java.util.ArrayList;
import java.util.List;

import com.one.model.Employee;
import com.one.model.WorkflowStructure;

/**
 * @author butt Feb 12, 2019
 *
 *         This contains logic of allotment of Employees
 */
public class CalculatorService {

  public List<Employee> optimalSolution(WorkflowStructure structure) {

    List<Employee> list = new ArrayList<Employee>();
    int noOfSeniors = structure.getSenior();
    int noOfJuniors = structure.getJunior();

    for (int room : structure.getRooms()) {
      int noOfSeniorAlloted = getOptimalNoOfSeniors(noOfSeniors, room);
      //if no of seniors are not enough no more services for remaining
      // rooms will be provided
      if (noOfSeniorAlloted == 0) {
        System.out.println("Not Enough resources");
        return list;
      }

      int noOfJuniorAlloted = getOptimalNoOfJuniors(noOfJuniors, noOfSeniorAlloted, room);
      list.add(new Employee(noOfSeniorAlloted, noOfJuniorAlloted));

    }
    return list;

  }

  public CalculatorService() {
  }

  /**
   * @param noOfSenors no of Seniors available
   * @param rooms size of room
   *
   *          calculate no of seniors
   *
   * @return return no of senior
   */
  private int getOptimalNoOfSeniors(int noOfSenors, int rooms) {
    if (noOfSenors < 1) {
      return 0;
    }
    if (rooms > 9) {
      return rooms / 10;
    }
    else {
      return 1;
    }
  }

  /**
   * @param noOfSenors no of Junior available
   * @param rooms size of room
   *
   *          calculate no of Juniors
   *
   * @return return no of Junior
   */
  private int getOptimalNoOfJuniors(int noOfJuniors, int noOfSeniors, int rooms) {
    if (rooms < 9) {
      return 0;//senior is already alloted so no need of Junior for small room
    }
    return Math.round((rooms - (noOfSeniors * 10)) / 5);

  }
}
