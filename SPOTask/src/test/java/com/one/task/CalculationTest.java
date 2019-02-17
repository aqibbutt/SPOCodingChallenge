package com.one.task;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.one.model.Employee;
import com.one.model.WorkflowStructure;
import com.one.service.CalculatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculationTest {

  @Test
  public void optimalSolutionTest() {
    List<Integer> rooms = new ArrayList<Integer>();
    rooms.add(24);
    rooms.add(28);

    CalculatorService service = new CalculatorService();
    List<Employee> emps = service.optimalSolution(new WorkflowStructure(rooms, 11, 6));
    for (Employee emp : emps)
      System.out.println("   Juniors : " + emp.getJunior() + "   Senior : " + emp.getSenior());
    assertEquals(emps.get(0)
        .getJunior(), 0);
    assertEquals(emps.get(1)
        .getJunior(), 1);
    assertEquals(emps.get(0)
        .getSenior(), 2);
    assertEquals(emps.get(1)
        .getSenior(), 2);

    for (Employee emp : emps)
      System.out.println("   Juniors : " + emp.getJunior() + "   Senior : " + emp.getSenior());
  }

  @Test
  public void optimalSPOSolutionTest() {
    List<Integer> rooms = new ArrayList<Integer>();
    rooms.add(24);
    rooms.add(28);

    CalculatorService service = new CalculatorService();
    List<Employee> emps = service.optimalSPOSolution(new WorkflowStructure(rooms, 11, 6));
    for (Employee emp : emps)
      System.out.println("   Juniors : " + emp.getJunior() + "   Senior : " + emp.getSenior());
    assertEquals(emps.get(0)
        .getJunior(), 1);
    assertEquals(emps.get(1)
        .getJunior(), 1);
    assertEquals(emps.get(0)
        .getSenior(), 2);
    assertEquals(emps.get(1)
        .getSenior(), 2);

    for (Employee emp : emps)
      System.out.println("   Juniors : " + emp.getJunior() + "   Senior : " + emp.getSenior());
  }
}
