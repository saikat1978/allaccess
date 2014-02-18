package a.b.c.service;

public interface AdminService {
	public Object getEvent(Object event) throws Exception;
	public Object addEvent(Object event) throws Exception;
	public Object updateEvent(Object event) throws Exception;
	public void deleteEvent(Object event) throws Exception;
	public Object addRelatedEvents(Object event) throws Exception;
	public Object updateRelatedEvents(Object event) throws Exception;
	public void deleteRelatedEvents(Object event) throws Exception;
	public Object getRelatedEvents(Object event) throws Exception;
}
