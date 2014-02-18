package xads.allaccess.core.service;

public interface ContextService extends AllAccessService {
	public Object getEvent(Object event) throws Exception;
	public Object getPreviewMetadata(Object event) throws Exception;
}
