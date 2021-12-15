// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ccgprojecttracking.proxies;

public class Employee
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject employeeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CCGProjectTracking.Employee";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EMP_ID("EMP_ID"),
		EMP_GID("EMP_GID"),
		EMP_Name("EMP_Name"),
		Emp_Email_ID("Emp_Email_ID"),
		EMP_Address("EMP_Address"),
		EMP_Mobile_No("EMP_Mobile_No"),
		Employee_Status("Employee_Status"),
		EMP_DOB("EMP_DOB"),
		EMP_JoiningDate("EMP_JoiningDate"),
		Domain("Domain"),
		Emp_Skills("Emp_Skills"),
		Employee_ProjectDept("CCGProjectTracking.Employee_ProjectDept"),
		Employee_ProjectDetails("CCGProjectTracking.Employee_ProjectDetails"),
		Employee_EventDetails("CCGProjectTracking.Employee_EventDetails"),
		Employee_Designation("CCGProjectTracking.Employee_Designation");

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

	public Employee(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CCGProjectTracking.Employee"));
	}

	protected Employee(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject employeeMendixObject)
	{
		if (employeeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CCGProjectTracking.Employee", employeeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CCGProjectTracking.Employee");

		this.employeeMendixObject = employeeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Employee.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ccgprojecttracking.proxies.Employee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ccgprojecttracking.proxies.Employee.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ccgprojecttracking.proxies.Employee initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ccgprojecttracking.proxies.Employee(context, mendixObject);
	}

	public static ccgprojecttracking.proxies.Employee load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ccgprojecttracking.proxies.Employee.initialize(context, mendixObject);
	}

	public static java.util.List<ccgprojecttracking.proxies.Employee> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ccgprojecttracking.proxies.Employee> result = new java.util.ArrayList<ccgprojecttracking.proxies.Employee>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CCGProjectTracking.Employee" + xpathConstraint))
			result.add(ccgprojecttracking.proxies.Employee.initialize(context, obj));
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
	 * @return value of EMP_ID
	 */
	public final java.lang.String getEMP_ID()
	{
		return getEMP_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of EMP_ID
	 */
	public final java.lang.String getEMP_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EMP_ID.toString());
	}

	/**
	 * Set value of EMP_ID
	 * @param emp_id
	 */
	public final void setEMP_ID(java.lang.String emp_id)
	{
		setEMP_ID(getContext(), emp_id);
	}

	/**
	 * Set value of EMP_ID
	 * @param context
	 * @param emp_id
	 */
	public final void setEMP_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emp_id)
	{
		getMendixObject().setValue(context, MemberNames.EMP_ID.toString(), emp_id);
	}

	/**
	 * @return value of EMP_GID
	 */
	public final java.lang.String getEMP_GID()
	{
		return getEMP_GID(getContext());
	}

	/**
	 * @param context
	 * @return value of EMP_GID
	 */
	public final java.lang.String getEMP_GID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EMP_GID.toString());
	}

	/**
	 * Set value of EMP_GID
	 * @param emp_gid
	 */
	public final void setEMP_GID(java.lang.String emp_gid)
	{
		setEMP_GID(getContext(), emp_gid);
	}

	/**
	 * Set value of EMP_GID
	 * @param context
	 * @param emp_gid
	 */
	public final void setEMP_GID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emp_gid)
	{
		getMendixObject().setValue(context, MemberNames.EMP_GID.toString(), emp_gid);
	}

	/**
	 * @return value of EMP_Name
	 */
	public final java.lang.String getEMP_Name()
	{
		return getEMP_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of EMP_Name
	 */
	public final java.lang.String getEMP_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EMP_Name.toString());
	}

	/**
	 * Set value of EMP_Name
	 * @param emp_name
	 */
	public final void setEMP_Name(java.lang.String emp_name)
	{
		setEMP_Name(getContext(), emp_name);
	}

	/**
	 * Set value of EMP_Name
	 * @param context
	 * @param emp_name
	 */
	public final void setEMP_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emp_name)
	{
		getMendixObject().setValue(context, MemberNames.EMP_Name.toString(), emp_name);
	}

	/**
	 * @return value of Emp_Email_ID
	 */
	public final java.lang.String getEmp_Email_ID()
	{
		return getEmp_Email_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of Emp_Email_ID
	 */
	public final java.lang.String getEmp_Email_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Emp_Email_ID.toString());
	}

	/**
	 * Set value of Emp_Email_ID
	 * @param emp_email_id
	 */
	public final void setEmp_Email_ID(java.lang.String emp_email_id)
	{
		setEmp_Email_ID(getContext(), emp_email_id);
	}

	/**
	 * Set value of Emp_Email_ID
	 * @param context
	 * @param emp_email_id
	 */
	public final void setEmp_Email_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emp_email_id)
	{
		getMendixObject().setValue(context, MemberNames.Emp_Email_ID.toString(), emp_email_id);
	}

	/**
	 * @return value of EMP_Address
	 */
	public final java.lang.String getEMP_Address()
	{
		return getEMP_Address(getContext());
	}

	/**
	 * @param context
	 * @return value of EMP_Address
	 */
	public final java.lang.String getEMP_Address(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EMP_Address.toString());
	}

	/**
	 * Set value of EMP_Address
	 * @param emp_address
	 */
	public final void setEMP_Address(java.lang.String emp_address)
	{
		setEMP_Address(getContext(), emp_address);
	}

	/**
	 * Set value of EMP_Address
	 * @param context
	 * @param emp_address
	 */
	public final void setEMP_Address(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emp_address)
	{
		getMendixObject().setValue(context, MemberNames.EMP_Address.toString(), emp_address);
	}

	/**
	 * @return value of EMP_Mobile_No
	 */
	public final java.lang.String getEMP_Mobile_No()
	{
		return getEMP_Mobile_No(getContext());
	}

	/**
	 * @param context
	 * @return value of EMP_Mobile_No
	 */
	public final java.lang.String getEMP_Mobile_No(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EMP_Mobile_No.toString());
	}

	/**
	 * Set value of EMP_Mobile_No
	 * @param emp_mobile_no
	 */
	public final void setEMP_Mobile_No(java.lang.String emp_mobile_no)
	{
		setEMP_Mobile_No(getContext(), emp_mobile_no);
	}

	/**
	 * Set value of EMP_Mobile_No
	 * @param context
	 * @param emp_mobile_no
	 */
	public final void setEMP_Mobile_No(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emp_mobile_no)
	{
		getMendixObject().setValue(context, MemberNames.EMP_Mobile_No.toString(), emp_mobile_no);
	}

	/**
	 * Set value of Employee_Status
	 * @param employee_status
	 */
	public final ccgprojecttracking.proxies.STATUS getEmployee_Status()
	{
		return getEmployee_Status(getContext());
	}

	/**
	 * @param context
	 * @return value of Employee_Status
	 */
	public final ccgprojecttracking.proxies.STATUS getEmployee_Status(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Employee_Status.toString());
		if (obj == null)
			return null;

		return ccgprojecttracking.proxies.STATUS.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Employee_Status
	 * @param employee_status
	 */
	public final void setEmployee_Status(ccgprojecttracking.proxies.STATUS employee_status)
	{
		setEmployee_Status(getContext(), employee_status);
	}

	/**
	 * Set value of Employee_Status
	 * @param context
	 * @param employee_status
	 */
	public final void setEmployee_Status(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.STATUS employee_status)
	{
		if (employee_status != null)
			getMendixObject().setValue(context, MemberNames.Employee_Status.toString(), employee_status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Employee_Status.toString(), null);
	}

	/**
	 * @return value of EMP_DOB
	 */
	public final java.util.Date getEMP_DOB()
	{
		return getEMP_DOB(getContext());
	}

	/**
	 * @param context
	 * @return value of EMP_DOB
	 */
	public final java.util.Date getEMP_DOB(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EMP_DOB.toString());
	}

	/**
	 * Set value of EMP_DOB
	 * @param emp_dob
	 */
	public final void setEMP_DOB(java.util.Date emp_dob)
	{
		setEMP_DOB(getContext(), emp_dob);
	}

	/**
	 * Set value of EMP_DOB
	 * @param context
	 * @param emp_dob
	 */
	public final void setEMP_DOB(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date emp_dob)
	{
		getMendixObject().setValue(context, MemberNames.EMP_DOB.toString(), emp_dob);
	}

	/**
	 * @return value of EMP_JoiningDate
	 */
	public final java.util.Date getEMP_JoiningDate()
	{
		return getEMP_JoiningDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EMP_JoiningDate
	 */
	public final java.util.Date getEMP_JoiningDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EMP_JoiningDate.toString());
	}

	/**
	 * Set value of EMP_JoiningDate
	 * @param emp_joiningdate
	 */
	public final void setEMP_JoiningDate(java.util.Date emp_joiningdate)
	{
		setEMP_JoiningDate(getContext(), emp_joiningdate);
	}

	/**
	 * Set value of EMP_JoiningDate
	 * @param context
	 * @param emp_joiningdate
	 */
	public final void setEMP_JoiningDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date emp_joiningdate)
	{
		getMendixObject().setValue(context, MemberNames.EMP_JoiningDate.toString(), emp_joiningdate);
	}

	/**
	 * @return value of Domain
	 */
	public final java.lang.String getDomain()
	{
		return getDomain(getContext());
	}

	/**
	 * @param context
	 * @return value of Domain
	 */
	public final java.lang.String getDomain(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Domain.toString());
	}

	/**
	 * Set value of Domain
	 * @param domain
	 */
	public final void setDomain(java.lang.String domain)
	{
		setDomain(getContext(), domain);
	}

	/**
	 * Set value of Domain
	 * @param context
	 * @param domain
	 */
	public final void setDomain(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String domain)
	{
		getMendixObject().setValue(context, MemberNames.Domain.toString(), domain);
	}

	/**
	 * @return value of Emp_Skills
	 */
	public final java.lang.String getEmp_Skills()
	{
		return getEmp_Skills(getContext());
	}

	/**
	 * @param context
	 * @return value of Emp_Skills
	 */
	public final java.lang.String getEmp_Skills(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Emp_Skills.toString());
	}

	/**
	 * Set value of Emp_Skills
	 * @param emp_skills
	 */
	public final void setEmp_Skills(java.lang.String emp_skills)
	{
		setEmp_Skills(getContext(), emp_skills);
	}

	/**
	 * Set value of Emp_Skills
	 * @param context
	 * @param emp_skills
	 */
	public final void setEmp_Skills(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emp_skills)
	{
		getMendixObject().setValue(context, MemberNames.Emp_Skills.toString(), emp_skills);
	}

	/**
	 * @return value of Employee_ProjectDept
	 */
	public final ccgprojecttracking.proxies.ProjectDept getEmployee_ProjectDept() throws com.mendix.core.CoreException
	{
		return getEmployee_ProjectDept(getContext());
	}

	/**
	 * @param context
	 * @return value of Employee_ProjectDept
	 */
	public final ccgprojecttracking.proxies.ProjectDept getEmployee_ProjectDept(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ccgprojecttracking.proxies.ProjectDept result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Employee_ProjectDept.toString());
		if (identifier != null)
			result = ccgprojecttracking.proxies.ProjectDept.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Employee_ProjectDept
	 * @param employee_projectdept
	 */
	public final void setEmployee_ProjectDept(ccgprojecttracking.proxies.ProjectDept employee_projectdept)
	{
		setEmployee_ProjectDept(getContext(), employee_projectdept);
	}

	/**
	 * Set value of Employee_ProjectDept
	 * @param context
	 * @param employee_projectdept
	 */
	public final void setEmployee_ProjectDept(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.ProjectDept employee_projectdept)
	{
		if (employee_projectdept == null)
			getMendixObject().setValue(context, MemberNames.Employee_ProjectDept.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Employee_ProjectDept.toString(), employee_projectdept.getMendixObject().getId());
	}

	/**
	 * @return value of Employee_ProjectDetails
	 */
	public final ccgprojecttracking.proxies.ProjectDetails getEmployee_ProjectDetails() throws com.mendix.core.CoreException
	{
		return getEmployee_ProjectDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Employee_ProjectDetails
	 */
	public final ccgprojecttracking.proxies.ProjectDetails getEmployee_ProjectDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ccgprojecttracking.proxies.ProjectDetails result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Employee_ProjectDetails.toString());
		if (identifier != null)
			result = ccgprojecttracking.proxies.ProjectDetails.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Employee_ProjectDetails
	 * @param employee_projectdetails
	 */
	public final void setEmployee_ProjectDetails(ccgprojecttracking.proxies.ProjectDetails employee_projectdetails)
	{
		setEmployee_ProjectDetails(getContext(), employee_projectdetails);
	}

	/**
	 * Set value of Employee_ProjectDetails
	 * @param context
	 * @param employee_projectdetails
	 */
	public final void setEmployee_ProjectDetails(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.ProjectDetails employee_projectdetails)
	{
		if (employee_projectdetails == null)
			getMendixObject().setValue(context, MemberNames.Employee_ProjectDetails.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Employee_ProjectDetails.toString(), employee_projectdetails.getMendixObject().getId());
	}

	/**
	 * @return value of Employee_EventDetails
	 */
	public final java.util.List<ccgprojecttracking.proxies.EventDetails> getEmployee_EventDetails() throws com.mendix.core.CoreException
	{
		return getEmployee_EventDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of Employee_EventDetails
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<ccgprojecttracking.proxies.EventDetails> getEmployee_EventDetails(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<ccgprojecttracking.proxies.EventDetails> result = new java.util.ArrayList<ccgprojecttracking.proxies.EventDetails>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Employee_EventDetails.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(ccgprojecttracking.proxies.EventDetails.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Employee_EventDetails
	 * @param employee_eventdetails
	 */
	public final void setEmployee_EventDetails(java.util.List<ccgprojecttracking.proxies.EventDetails> employee_eventdetails)
	{
		setEmployee_EventDetails(getContext(), employee_eventdetails);
	}

	/**
	 * Set value of Employee_EventDetails
	 * @param context
	 * @param employee_eventdetails
	 */
	public final void setEmployee_EventDetails(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<ccgprojecttracking.proxies.EventDetails> employee_eventdetails)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (ccgprojecttracking.proxies.EventDetails proxyObject : employee_eventdetails)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Employee_EventDetails.toString(), identifiers);
	}

	/**
	 * @return value of Employee_Designation
	 */
	public final ccgprojecttracking.proxies.Designation getEmployee_Designation() throws com.mendix.core.CoreException
	{
		return getEmployee_Designation(getContext());
	}

	/**
	 * @param context
	 * @return value of Employee_Designation
	 */
	public final ccgprojecttracking.proxies.Designation getEmployee_Designation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		ccgprojecttracking.proxies.Designation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Employee_Designation.toString());
		if (identifier != null)
			result = ccgprojecttracking.proxies.Designation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Employee_Designation
	 * @param employee_designation
	 */
	public final void setEmployee_Designation(ccgprojecttracking.proxies.Designation employee_designation)
	{
		setEmployee_Designation(getContext(), employee_designation);
	}

	/**
	 * Set value of Employee_Designation
	 * @param context
	 * @param employee_designation
	 */
	public final void setEmployee_Designation(com.mendix.systemwideinterfaces.core.IContext context, ccgprojecttracking.proxies.Designation employee_designation)
	{
		if (employee_designation == null)
			getMendixObject().setValue(context, MemberNames.Employee_Designation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Employee_Designation.toString(), employee_designation.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return employeeMendixObject;
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
			final ccgprojecttracking.proxies.Employee that = (ccgprojecttracking.proxies.Employee) obj;
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
		return "CCGProjectTracking.Employee";
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
