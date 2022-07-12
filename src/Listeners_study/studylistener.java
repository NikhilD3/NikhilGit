package Listeners_study;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_study.listener.class)
public class studylistener {
  @Test
  public void mymethod() 
  {
	  
  }
}
