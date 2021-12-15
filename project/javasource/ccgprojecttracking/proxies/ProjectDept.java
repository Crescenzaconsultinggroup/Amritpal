// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ccgprojecttracking.proxies;

public class ProjectDept
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject projectDeptMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CCGProjectTracking.ProjectDept";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Dept_ID("Dept_ID"),
		Dept_Name("Dept_Name"),
		Dept_Lead("Dept_Lead");

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

	public ProjectDept(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CCGProjectTracking.ProjectDept"));
	}

	protected ProjectDept(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject projectDeptMendixObject)
	{
		if (projectDeptMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CCGProjectTracking.ProjectDept", projectDeptMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CCGProjectTracking.ProjectDept");

		this.projectDeptMendixObject = projectDeptMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProjectDept.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ccgprojecttracking.proxies.ProjectDept initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ccgprojecttracking.proxies.ProjectDept.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ccgprojecttracking.proxies.ProjectDept initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ccgprojecttracking.proxies.ProjectDept(context, mendixObject);
	}

	public static ccgprojecttracking.proxies.ProjectDept load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ccgprojecttracking.proxies.ProjectDept.initialize(context, mendixObject);
	}

	public static java.util.List<ccgprojecttracking.proxies.ProjectDept> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ccgprojecttracking.proxies.ProjectDept> result = new java.util.ArrayList<ccgprojecttracking.proxies.ProjectDept>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CCGProjectTracking.ProjectDept" + xpathConstraint))
			result.add(ccgprojecttracking.proxies.ProjectDept.initialize(context, obj));
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
	 * @return value of Dept_ID
	 */
	public final java.lang.String getDept_ID()
	{
		return getDept_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of Dept_ID
	 */
	public final java.lang.String getDept_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Dept_ID.toString());
	}

	/**
	 * Set value of Dept_ID
	 * @param dept_id
	 */
	public final void setDept_ID(java.lang.String dept_id)
	{
		setDept_ID(getContext(), dept_id);
	}

	/**
	 * Set value of Dept_ID
	 * @param context
	 * @param dept_id
	 */
	public final void setDept_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dept_id)
	{
		getMendixObject().setValue(context, MemberNames.Dept_ID.toString(), dept_id);
	}

	/**
	 * @return value of Dept_Name
	 */
	public final java.lang.String getDept_Name()
	{
		return getDept_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Dept_Name
	 */
	public final java.lang.String getDept_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Dept_Name.toString());
	}

	/**
	 * Set value of Dept_Name
	 * @param dept_name
	 */
	public final void setDept_Name(java.lang.String dept_name)
	{
		setDept_Name(getContext(), dept_name);
	}

	/**
	 * Set value of Dept_Name
	 * @param context
	 * @param dept_name
	 */
	public final void setDept_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dept_name)
	{
		getMendixObject().setValue(context, MemberNames.Dept_Name.toString(), dept_name);
	}

	/**
	 * @return value of Dept_Lead
	 */
	public final java.lang.String getDept_Lead()
	{
		return getDept_Lead(getContext());
	}

	/**
	 * @param context
	 * @return value of Dept_Lead
	 */
	public final java.lang.String getDept_Lead(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Dept_Lead.toString());
	}

	/**
	 * Set value of Dept_Lead
	 * @param dept_lead
	 */
	public final void setDept_Lead(java.lang.String dept_lead)
	{
		setDept_Lead(getContext(), dept_lead);
	}

	/**
	 * Set value of Dept_Lead
	 * @param context
	 * @param dept_lead
	 */
	public final void setDept_Lead(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dept_lead)
	{
		getMendixObject().setValue(context, MemberNames.Dept_Lead.toString(), dept_lead);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return projectDeptMendixObject;
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
			final ccgprojecttracking.proxies.ProjectDept that = (ccgprojecttracking.proxies.ProjectDept) obj;
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
		return "CCGProjectTracking.ProjectDept";
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