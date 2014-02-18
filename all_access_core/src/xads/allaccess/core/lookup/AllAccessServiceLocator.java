package xads.allaccess.core.lookup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xads.allaccess.core.service.AllAccessService;

public class AllAccessServiceLocator {
	
	private static final String CONFIG_FILE_LOC = "xads/allaccess/core/config/allaccess-core.xml";
	private static ClassPathXmlApplicationContext ctx;
	
	private static AllAccessServiceLocator me;
	
	static {
		ctx = new ClassPathXmlApplicationContext(CONFIG_FILE_LOC);
	}
	
	private AllAccessServiceLocator() {}
	
	public static synchronized AllAccessServiceLocator getInstance() {
		if (me == null) {
			me = new AllAccessServiceLocator();
		}
		return me;
	}

	public AllAccessService getService(String serviceType) {
		return (AllAccessService) ctx.getBean(serviceType);
	}
}
