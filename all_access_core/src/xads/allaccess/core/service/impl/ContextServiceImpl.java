package xads.allaccess.core.service.impl;

import java.util.logging.Logger;

import xads.allaccess.core.service.ContextService;

public class ContextServiceImpl implements ContextService {

	@Override
	public Object getEvent(Object event) throws Exception {
		Logger.getAnonymousLogger().info("get event called");
		return null;
	}

	@Override
	public Object getPreviewMetadata(Object event) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
