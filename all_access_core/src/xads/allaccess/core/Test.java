package xads.allaccess.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xads.allaccess.core.delegate.AllAccessDelegator;
import xads.allaccess.core.lookup.AllAccessServiceLocator;
import xads.allaccess.core.service.AdminService;

public class Test {

	public static void main(String[] args) {
		
		AllAccessDelegator.initialize(ServiceType.adminService).addEvent(); 
		AllAccessDelegator.initialize(ServiceType.contextService).getEvent();
	}

}
