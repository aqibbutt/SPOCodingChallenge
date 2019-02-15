package com.one.task;

import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.one.model.WorkflowStructure;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculationAPITest {

  public final static String REQUEST_URI = "http://localhost:8080/solution";

  @Test
  public void optimalSolutionTest() {

    List<Integer> rooms = new ArrayList<Integer>();
    rooms.add(24);
    rooms.add(28);
    RestTemplate restTemplate = new RestTemplate();

    List<String> emps = restTemplate.postForObject(REQUEST_URI, new WorkflowStructure(rooms, 11, 6), new ArrayList<String>().getClass());

    assertNotEquals(emps.size(), 0);
  }

}
