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

    if (structure.getRooms()
        .size() >= 100)
      return null;
    for (int room : structure.getRooms()) {
      if (room > 100)
        return null;
    }

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

  public List<Employee> optimalSPOSolution(WorkflowStructure structure) {

    if (structure.getRooms()
        .size() >= 100)
      return null;
    for (int room : structure.getRooms()) {
      if (room > 100)
        return null;
    }

    List<Employee> list = new ArrayList<Employee>();

    int noOfSeniors = structure.getSenior();
    int noOfJuniors = structure.getJunior();
    int alotSeniors = 0;
    int alotJuniors = 0;

    for (int room : structure.getRooms()) {
      if (room / noOfSeniors == 0) {
        alotSeniors = 1;
        alotJuniors = 0;
      }
      else if (room % noOfSeniors > percentageCalculation(10, noOfSeniors) && room % noOfSeniors < percentageCalculation(70, noOfSeniors)) {
        alotSeniors = room / noOfSeniors;
        alotJuniors = 1;
      }
      else if (room % noOfSeniors <= percentageCalculation(10, noOfSeniors)) {
        alotSeniors = (room / noOfSeniors) - 1;
        alotJuniors = 2;
      }
      else {
        alotSeniors = (room / noOfSeniors) + 1;
        alotJuniors = 0;
      }

      if (alotSeniors < noOfSeniors && alotJuniors < noOfJuniors) {
        list.add(new Employee(alotSeniors, alotJuniors));
      }
      else {
        System.out.println("Not enough resources");
      }
    }
    return list;

  }

  public int percentageCalculation(int percent, int noOfSeniors) {
    return (percent * noOfSeniors) / 100;
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
