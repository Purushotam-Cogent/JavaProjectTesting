package com.testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;  
import org.junit.Test;  

  
import static org.junit.Assert.*;  
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;  
 
public class TestList {  
  
    @Test  
    public void testList_ReturnsSingle_value() {  
  
        HashMap mocklist = mock(HashMap.class);  
                           when(mocklist.size()).thenReturn(1);  
  
        assertEquals(1, mocklist.size());  
        assertEquals(1, mocklist.size());  
          
                          System.out.println( mocklist.size());  
        System.out.println(mocklist);  
    }  
 } 