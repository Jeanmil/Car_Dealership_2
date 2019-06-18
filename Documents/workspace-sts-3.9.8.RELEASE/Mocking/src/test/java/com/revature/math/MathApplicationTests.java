package com.revature.math;
import static org.mockito.Mockito.when;

import  org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTests {
	
	@Mock
	private Calculator calc;
	
	@InjectMocks
	private MathApplication ma = new MathApplication();
	
		#Test
		public void meanTestOne() {
			when(calc.add(5,  10)).thenReturn(15d);
			
		
	}

}
