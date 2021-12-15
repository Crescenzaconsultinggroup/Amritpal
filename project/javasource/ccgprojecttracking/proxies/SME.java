// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ccgprojecttracking.proxies;

public class SME
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sMEMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CCGProjectTracking.SME";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SME("SME");

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

	public SME(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CCGProjectTracking.SME"));
	}

	protected SME(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sMEMendixObject)
	{
		if (sMEMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CCGProjectTracking.SME", sMEMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CCGProjectTracking.SME");

		this.sMEMendixObject = sMEMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SME.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ccgprojecttracking.proxies.SME initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ccgprojecttracking.proxies.SME.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ccgprojecttracking.proxies.SME initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ccgprojecttracking.proxies.SME(context, mendixObject);
	}

	public static ccgprojecttracking.proxies.SME load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ccgprojecttracking.proxies.SME.initialize(context, mendixObject);
	}

	public static java.util.List<ccgprojecttracking.proxies.SME> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ccgprojecttracking.proxies.SME> result = new java.util.ArrayList<ccgprojecttracking.proxies.SME>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CCGProjectTracking.SME" + xpathConstraint))
			result.add(ccgprojecttracking.proxies.SME.initialize(context, obj));
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
	 * @return value of SME
	 */
	public final java.lang.String getSME()
	{
		return getSME(getContext());
	}

	/**
	 * @param context
	 * @return value of SME
	 */
	public final java.lang.String getSME(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SME.toString());
	}

	/**
	 * Set value of SME
	 * @param sme
	 */
	public final void setSME(java.lang.String sme)
	{
		setSME(getContext(), sme);
	}

	/**
	 * Set value of SME
	 * @param context
	 * @param sme
	 */
	public final void setSME(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sme)
	{
		getMendixObject().setValue(context, MemberNames.SME.toString(), sme);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sMEMendixObject;
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
			final ccgprojecttracking.proxies.SME that = (ccgprojecttracking.proxies.SME) obj;
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
		return "CCGProjectTracking.SME";
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
