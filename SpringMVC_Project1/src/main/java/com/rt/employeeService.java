package com.rt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class employeeService {
	
        @Autowired
         employeeDao ed;
        
         public boolean register(Employee e) {
        	
        	
        	 
        	 return ed.register(e);
		

		}
         
         
         
         

//		***********************************Update**************************************
         
         public boolean update(Employee e) {
        	 
     		return ed.update(e);
     	}
//**************************************delete***************************************
         
		public Employee delete(int id) {
			return ed.delete(id);
		
		}
//		****************************************select****************************

		public Employee select(int id) {
			return ed.select(id);
		
		}
		
		
//		*************************************selectAll**************************************
		
		public List <Employee> selectAll() {
			
			return ed.selectAll();
		
		}	
		
		
		
}
