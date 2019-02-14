/*******************************************************************************

 MINT MEDIA INTERACTIVE Software Systems GmbH
 Fraunhoferstrasse 13, D-24118 Kiel, Germany
 (c) 1998-2019 by MINT. All rights reserved.

 Author       : $Author$
 Last CheckIn : $Date$
 Revision     : $Revision$

*******************************************************************************/
package com.one.model;

/**
 * @author butt Feb 12, 2019
 *
 *         This class is the structure of employee including Seniors and Juniors
 */
public class Employee {

  private int senior;
  private int junior;

  public Employee() {
    this.senior = 0;
    this.junior = 0;
  }

  public Employee(int senior, int junior) {

    this.senior = senior;
    this.junior = junior;
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
