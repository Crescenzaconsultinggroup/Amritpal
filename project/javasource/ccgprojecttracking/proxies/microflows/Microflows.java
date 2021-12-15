// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ccgprojecttracking.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the CCGProjectTracking module
	public static java.lang.String aCT_ProjectDetails_Enhancement(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		return (java.lang.String) Core.microflowCall("CCGProjectTracking.ACT_ProjectDetails_Enhancement").withParams(params).execute(context);
	}
	public static void aCT_ProjectDetails_Revision(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.ACT_ProjectDetails_Revision").withParams(params).execute(context);
	}
	public static void aCT_ProjectDetails_Sprint(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.ACT_ProjectDetails_Sprint").withParams(params).execute(context);
	}
	public static void aCT_ProjectDetails_Validate(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.ACT_ProjectDetails_Validate").withParams(params).execute(context);
	}
	public static ccgprojecttracking.proxies.Task aCT_Total_No_Of_task_completion(IContext context, ccgprojecttracking.proxies.Task _task)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Task", _task == null ? null : _task.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("CCGProjectTracking.ACT_Total_No_Of_task_completion").withParams(params).execute(context);
		return result == null ? null : ccgprojecttracking.proxies.Task.initialize(context, result);
	}
	public static void capacity(IContext context, ccgprojecttracking.proxies.Capacity _capacity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Capacity", _capacity == null ? null : _capacity.getMendixObject());
		Core.microflowCall("CCGProjectTracking.Capacity").withParams(params).execute(context);
	}
	public static void checkTaskStatus_Close(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.checkTaskStatus_Close").withParams(params).execute(context);
	}
	public static void dATmf(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.DATmf").withParams(params).execute(context);
	}
	public static void exampleMf(IContext context, ccgprojecttracking.proxies.Sprint _task)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Task", _task == null ? null : _task.getMendixObject());
		Core.microflowCall("CCGProjectTracking.ExampleMf").withParams(params).execute(context);
	}
	public static void masterDataMF(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("CCGProjectTracking.MasterDataMF").withParams(params).execute(context);
	}
	public static java.util.List<ccgprojecttracking.proxies.Task> mF_ClosedTaskList(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("CCGProjectTracking.MF_ClosedTaskList").withParams(params).execute(context);
		java.util.List<ccgprojecttracking.proxies.Task> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(ccgprojecttracking.proxies.Task.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<ccgprojecttracking.proxies.Task> mF_OpenTaskList(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("CCGProjectTracking.MF_OpenTaskList").withParams(params).execute(context);
		java.util.List<ccgprojecttracking.proxies.Task> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(ccgprojecttracking.proxies.Task.initialize(context, obj));
		}
		return result;
	}
	public static void microflow_eventEndDate(IContext context, ccgprojecttracking.proxies.EventDetails _eventDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EventDetails", _eventDetails == null ? null : _eventDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.Microflow_eventEndDate").withParams(params).execute(context);
	}
	public static void microflow_eventStatus(IContext context, ccgprojecttracking.proxies.EventDetails _eventDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EventDetails", _eventDetails == null ? null : _eventDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.Microflow_eventStatus").withParams(params).execute(context);
	}
	public static void newprojectMf_2(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.NewprojectMf_2").withParams(params).execute(context);
	}
	public static void project_ID_MF(IContext context, ccgprojecttracking.proxies.ProjectDetails _projectDetails)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ProjectDetails", _projectDetails == null ? null : _projectDetails.getMendixObject());
		Core.microflowCall("CCGProjectTracking.Project_ID_MF").withParams(params).execute(context);
	}
	public static void sprint_Increment_Mf(IContext context, ccgprojecttracking.proxies.Sprint _sprint)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Sprint", _sprint == null ? null : _sprint.getMendixObject());
		Core.microflowCall("CCGProjectTracking.Sprint_Increment_Mf").withParams(params).execute(context);
	}
	public static void taskIDMF(IContext context, ccgprojecttracking.proxies.Task _task)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Task", _task == null ? null : _task.getMendixObject());
		Core.microflowCall("CCGProjectTracking.TaskIDMF").withParams(params).execute(context);
	}
	public static void taskStatusChange(IContext context, ccgprojecttracking.proxies.Task _task)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Task", _task == null ? null : _task.getMendixObject());
		Core.microflowCall("CCGProjectTracking.TaskStatusChange").withParams(params).execute(context);
	}
}