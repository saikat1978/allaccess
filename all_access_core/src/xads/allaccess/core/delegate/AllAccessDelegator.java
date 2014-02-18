package xads.allaccess.core.delegate;

import xads.allaccess.core.ServiceType;
import xads.allaccess.core.lookup.AllAccessServiceLocator;
import xads.allaccess.core.service.AdminService;
import xads.allaccess.core.service.AllAccessService;
import xads.allaccess.core.service.ContextService;
import xads.allaccess.core.service.impl.ContextServiceImpl;

public class AllAccessDelegator {

	
	private AllAccessService allAccessService;
	
	private static String serviceType;
	
	private AllAccessDelegator(String serviceType) {
		this.serviceType = serviceType;
		allAccessService = AllAccessServiceLocator.getInstance().getService(serviceType);
	}

	private AllAccessDelegator() {}
	
	public static AllAccessDelegator initialize(ServiceType serviceType) {
		return new AllAccessDelegator(serviceType.name());
	}
	
	public void getEvent() {
		ContextService service = (ContextService) allAccessService;
		try {
			service.getEvent(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addEvent() {
		AdminService service = (AdminService) allAccessService;
		try {
			service.addEvent(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
