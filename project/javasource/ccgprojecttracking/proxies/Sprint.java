// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ccgprojecttracking.proxies;

public class Sprint
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sprintMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CCGProjectTracking.Sprint";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		sprint_ID("sprint_ID"),
		Sprint_Percent("Sprint_Percent"),
		Sprint_StartDate("Sprint_StartDate"),
		Sprint_EndDate("Sprint_EndDate"),
		Sprint_Status("Sprint_Status"),
		Sprint_Task("CCGProjectTracking.Sprint_Task"),
		Sprint_ProjectDetails("CCGProjectTracking.Sprint_ProjectDetails");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Sprint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CCGProjectTracking.Sprint"));
	}

	protected Sprint(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sprintMendixObject)
	{
		if (sprintMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CCGProjectTracking.Sprint", sprintMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CCGProjectTracking.Sprint");

		this.sprintMendixObject = sprintMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Sprint.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ccgprojecttracking.proxies.Sprint initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ccgprojecttracking.proxies.Sprint.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ccgprojecttracking.proxies.Sprint initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ccgprojecttracking.proxies.Sprint(context, mendixObject);
	}

	public static ccgprojecttracking.proxies.Sprint load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ccgprojecttracking.proxies.Sprint.initialize(context, mendixObject);
	}

	public static java.util.List<ccgprojecttracking.proxies.Sprint> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ccgprojecttracking.proxies.Sprint> result = new java.util.ArrayList<ccgprojecttracking.proxies.Sprint>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CCGProjectTracking.Sprint" + xpathConstraint))
			result.add(ccgprojecttracking.proxies.Sprint.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of sprint_ID
	 */
	public final java.lang.String getsprint_ID()
	{
		return getsprint_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of sprint_ID
	 */
	public final java.lang.String getsprint_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.sprint_ID.toString());
	}

	/**
	 * Set value of sprint_ID
	 * @param sprint_id
	 */
	public final void setsprint_ID(java.lang.String sprint_id)
	{
		setsprint_ID(getContext(), sprint_id);
	}

	/**
	 * Set value of sprint_ID
	 * @param context
	 * @param sprint_id
	 */
	public final void setsprint_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sprint_id)
	{
		getMendixObject().setValue(context, MemberNames.sprint_ID.toString(), sprint_id);
	}

	/**
	 * Set value of Sprint_Percent
	 * @param sprint_percent
	 */
	public final ccgprojecttracking.proxies.Sp_percent getSprint_Percent()
	{
		return getSprint_Percent(getContext());
	}

	/**
	 * @param context
	 * @return value of Sprint_Percent
	 */
	public final ccgprojecttracking.proxies.Sp_percent getSprint_Percent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Sprint_Percent.toString());
		if (obj == null)
			return null;

		return ccgprojecttracking.proxies.Sp_percent.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Sprint_Percent
	 * @param sprint_percent
	 */
	public final void setSprint_Percent(ccgprojecttracking.proxies.Sp_percent sprint_percent)
	{
		setSprint_Percent(getContext(), sprint_percent);
	}

	/**
	 * Set value of Sprint_Percent
	 * @param context
	 * @param sprint_percent
	 */
	public final void setSprint_Percent(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.Sp_percent sprint_percent)
	{
		if (sprint_percent != null)
			getMendixObject().setValue(context, MemberNames.Sprint_Percent.toString(), sprint_percent.toString());
		else
			getMendixObject().setValue(context, MemberNames.Sprint_Percent.toString(), null);
	}

	/**
	 * @return value of Sprint_StartDate
	 */
	public final java.util.Date getSprint_StartDate()
	{
		return getSprint_StartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Sprint_StartDate
	 */
	public final java.util.Date getSprint_StartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Sprint_StartDate.toString());
	}

	/**
	 * Set value of Sprint_StartDate
	 * @param sprint_startdate
	 */
	public final void setSprint_StartDate(java.util.Date sprint_startdate)
	{
		setSprint_StartDate(getContext(), sprint_startdate);
	}

	/**
	 * Set value of Sprint_StartDate
	 * @param context
	 * @param sprint_startdate
	 */
	public final void setSprint_StartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date sprint_startdate)
	{
		getMendixObject().setValue(context, MemberNames.Sprint_StartDate.toString(), sprint_startdate);
	}

	/**
	 * @return value of Sprint_EndDate
	 */
	public final java.util.Date getSprint_EndDate()
	{
		return getSprint_EndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Sprint_EndDate
	 */
	public final java.util.Date getSprint_EndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Sprint_EndDate.toString());
	}

	/**
	 * Set value of Sprint_EndDate
	 * @param sprint_enddate
	 */
	public final void setSprint_EndDate(java.util.Date sprint_enddate)
	{
		setSprint_EndDate(getContext(), sprint_enddate);
	}

	/**
	 * Set value of Sprint_EndDate
	 * @param context
	 * @param sprint_enddate
	 */
	public final void setSprint_EndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date sprint_enddate)
	{
		getMendixObject().setValue(context, MemberNames.Sprint_EndDate.toString(), sprint_enddate);
	}

	/**
	 * Set value of Sprint_Status
	 * @param sprint_status
	 */
	public final ccgprojecttracking.proxies.SS getSprint_Status()
	{
		return getSprint_Status(getContext());
	}

	/**
	 * @param context
	 * @return value of Sprint_Status
	 */
	public final ccgprojecttracking.proxies.SS getSprint_Status(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Sprint_Status.toString());
		if (obj == null)
			return null;

		return ccgprojecttracking.proxies.SS.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Sprint_Status
	 * @param sprint_status
	 */
	public final void setSprint_Status(ccgprojecttracking.proxies.SS sprint_status)
	{
		setSprint_Status(getContext(), sprint_status);
	}

	/**
	 * Set value of Sprint_Status
	 * @param context
	 * @param sprint_status
	 */
	public final void setSprint_Status(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.SS sprint_status)
	{
		if (sprint_status != null)
			getMendixObject().setValue(context, MemberNames.Sprint_Status.toString(), sprint_status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Sprint_Status.toString(), null);
	}

	/**
	 * @return value of Sprint_Task
	 */
	public final ccgprojecttracking.proxies.Task getSprint_Task() throws com.mendix.core.CoreException
	{
		return getSprint_Task(getContext());
	}

	/**
	 * @param context
	 * @return value of Sprint_Task
	 */
	public final ccgprojecttracking.proxies.Task getSprint_Task(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ccgprojecttracking.proxies.Task result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Sprint_Task.toString());
		if (identifier != null)
			result = ccgprojecttracking.proxies.Task.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Sprint_Task
	 * @param sprint_task
	 */
	public final void setSprint_Task(ccgprojecttracking.proxies.Task sprint_task)
	{
		setSprint_Task(getContext(), sprint_task);
	}

	/**
	 * Set value of Sprint_Task
	 * @param context
	 * @param sprint_task
	 */
	public final void setSprint_Task(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.Task sprint_task)
	{
		if (sprint_task == null)
			getMendixObject().setValue(context, MemberNames.Sprint_Task.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Sprint_Task.toString(), sprint_task.getMendixObject().getId());
	}

	/**
	 * @return value of Sprint_ProjectDetails
	 */
	public final ccgprojecttracking.proxies.ProjectDetails getSprint_ProjectDetails() throws com.mendix.core.CoreException
	{
		return getSprint_ProjectDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Sprint_ProjectDetails
	 */
	public final ccgprojecttracking.proxies.ProjectDetails getSprint_ProjectDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ccgprojecttracking.proxies.ProjectDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Sprint_ProjectDetails.toString());
		if (identifier != null)
			result = ccgprojecttracking.proxies.ProjectDetails.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Sprint_ProjectDetails
	 * @param sprint_projectdetails
	 */
	public final void setSprint_ProjectDetails(ccgprojecttracking.proxies.ProjectDetails sprint_projectdetails)
	{
		setSprint_ProjectDetails(getContext(), sprint_projectdetails);
	}

	/**
	 * Set value of Sprint_ProjectDetails
	 * @param context
	 * @param sprint_projectdetails
	 */
	public final void setSprint_ProjectDetails(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.ProjectDetails sprint_projectdetails)
	{
		if (sprint_projectdetails == null)
			getMendixObject().setValue(context, MemberNames.Sprint_ProjectDetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Sprint_ProjectDetails.toString(), sprint_projectdetails.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sprintMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final ccgprojecttracking.proxies.Sprint that = (ccgprojecttracking.proxies.Sprint) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "CCGProjectTracking.Sprint";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}