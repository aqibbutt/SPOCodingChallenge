package com.one.task.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.model.Employee;
import com.one.model.WorkflowStructure;
import com.one.service.CalculatorService;

@RestController
public class CalculationController {

  /**
   *
   */
  private static final String GET_OPTIMAL_SOLUTION = "/solution";
  private static final String GET_SPO_OPTIMAL_SOLUTION = "/sposolution";
  CalculatorService calculator = new CalculatorService();

  @PostMapping(GET_OPTIMAL_SOLUTION)
  public List<Employee> getOptimalSolution(@RequestBody WorkflowStructure emp) {

    System.out.println(calculator.optimalSolution(emp)
        .get(0));
    return calculator.optimalSolution(emp);
    //    return emp;
  }

  @PostMapping(GET_SPO_OPTIMAL_SOLUTION)
  public List<Employee> getSPOOptimalSolution(@RequestBody WorkflowStructure emp) {

    System.out.println(calculator.optimalSolution(emp)
        .get(0));
    return calculator.optimalSPOSolution(emp);
    //    return emp;
  }
}
