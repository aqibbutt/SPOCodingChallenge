package com.one.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.one.model.Employee;
import com.one.model.WorkflowStructure;
import com.one.service.CalculatorService;

@SpringBootApplication
public class SPOStart {

  public static void main(String[] args) {
    SpringApplication.run(SPOStart.class, args);
    //    WorkflowStructure
    List<Integer> list = new ArrayList<Integer>();
    list.add(24);
    list.add(28);

    CalculatorService service = new CalculatorService();
    List<Employee> emps = service.optimalSolution(new WorkflowStructure(list, 11, 6));
    for (Employee emp : emps)
      System.out.println("   Juniors : " + emp.getJunior() + "   Senior : " + emp.getSenior());
  }

}
