// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxTemplate
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxTemplateMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxTemplate";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TemplateID("TemplateID"),
		Name("Name"),
		Description("Description"),
		DocumentType("DocumentType"),
		CSVSeparator("CSVSeparator"),
		DateTimePresentation("DateTimePresentation"),
		CustomeDateFormat("CustomeDateFormat"),
		MxTemplate_CustomExcel("XLSReport.MxTemplate_CustomExcel"),
		MxTemplate_InputObject("XLSReport.MxTemplate_InputObject");

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

	public MxTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxTemplate"));
	}

	protected MxTemplate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxTemplateMendixObject)
	{
		if (mxTemplateMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxTemplate", mxTemplateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxTemplate");

		this.mxTemplateMendixObject = mxTemplateMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxTemplate.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static xlsreport.proxies.MxTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxTemplate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxTemplate(context, mendixObject);
	}

	public static xlsreport.proxies.MxTemplate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxTemplate.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxTemplate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxTemplate> result = new java.util.ArrayList<xlsreport.proxies.MxTemplate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxTemplate" + xpathConstraint))
			result.add(xlsreport.proxies.MxTemplate.initialize(context, obj));
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
	 * @return value of TemplateID
	 */
	public final java.lang.Long getTemplateID()
	{
		return getTemplateID(getContext());
	}

	/**
	 * @param context
	 * @return value of TemplateID
	 */
	public final java.lang.Long getTemplateID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TemplateID.toString());
	}

	/**
	 * Set value of TemplateID
	 * @param templateid
	 */
	public final void setTemplateID(java.lang.Long templateid)
	{
		setTemplateID(getContext(), templateid);
	}

	/**
	 * Set value of TemplateID
	 * @param context
	 * @param templateid
	 */
	public final void setTemplateID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long templateid)
	{
		getMendixObject().setValue(context, MemberNames.TemplateID.toString(), templateid);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * Set value of DocumentType
	 * @param documenttype
	 */
	public final xlsreport.proxies.DocumentType getDocumentType()
	{
		return getDocumentType(getContext());
	}

	/**
	 * @param context
	 * @return value of DocumentType
	 */
	public final xlsreport.proxies.DocumentType getDocumentType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DocumentType.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.DocumentType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DocumentType
	 * @param documenttype
	 */
	public final void setDocumentType(xlsreport.proxies.DocumentType documenttype)
	{
		setDocumentType(getContext(), documenttype);
	}

	/**
	 * Set value of DocumentType
	 * @param context
	 * @param documenttype
	 */
	public final void setDocumentType(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.DocumentType documenttype)
	{
		if (documenttype != null)
			getMendixObject().setValue(context, MemberNames.DocumentType.toString(), documenttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.DocumentType.toString(), null);
	}

	/**
	 * Set value of CSVSeparator
	 * @param csvseparator
	 */
	public final xlsreport.proxies.CSVSeparator getCSVSeparator()
	{
		return getCSVSeparator(getContext());
	}

	/**
	 * @param context
	 * @return value of CSVSeparator
	 */
	public final xlsreport.proxies.CSVSeparator getCSVSeparator(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.CSVSeparator.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.CSVSeparator.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of CSVSeparator
	 * @param csvseparator
	 */
	public final void setCSVSeparator(xlsreport.proxies.CSVSeparator csvseparator)
	{
		setCSVSeparator(getContext(), csvseparator);
	}

	/**
	 * Set value of CSVSeparator
	 * @param context
	 * @param csvseparator
	 */
	public final void setCSVSeparator(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.CSVSeparator csvseparator)
	{
		if (csvseparator != null)
			getMendixObject().setValue(context, MemberNames.CSVSeparator.toString(), csvseparator.toString());
		else
			getMendixObject().setValue(context, MemberNames.CSVSeparator.toString(), null);
	}

	/**
	 * Set value of DateTimePresentation
	 * @param datetimepresentation
	 */
	public final xlsreport.proxies.DateTimePresentation getDateTimePresentation()
	{
		return getDateTimePresentation(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimePresentation
	 */
	public final xlsreport.proxies.DateTimePresentation getDateTimePresentation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DateTimePresentation.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.DateTimePresentation.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DateTimePresentation
	 * @param datetimepresentation
	 */
	public final void setDateTimePresentation(xlsreport.proxies.DateTimePresentation datetimepresentation)
	{
		setDateTimePresentation(getContext(), datetimepresentation);
	}

	/**
	 * Set value of DateTimePresentation
	 * @param context
	 * @param datetimepresentation
	 */
	public final void setDateTimePresentation(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.DateTimePresentation datetimepresentation)
	{
		if (datetimepresentation != null)
			getMendixObject().setValue(context, MemberNames.DateTimePresentation.toString(), datetimepresentation.toString());
		else
			getMendixObject().setValue(context, MemberNames.DateTimePresentation.toString(), null);
	}

	/**
	 * @return value of CustomeDateFormat
	 */
	public final java.lang.String getCustomeDateFormat()
	{
		return getCustomeDateFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomeDateFormat
	 */
	public final java.lang.String getCustomeDateFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CustomeDateFormat.toString());
	}

	/**
	 * Set value of CustomeDateFormat
	 * @param customedateformat
	 */
	public final void setCustomeDateFormat(java.lang.String customedateformat)
	{
		setCustomeDateFormat(getContext(), customedateformat);
	}

	/**
	 * Set value of CustomeDateFormat
	 * @param context
	 * @param customedateformat
	 */
	public final void setCustomeDateFormat(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String customedateformat)
	{
		getMendixObject().setValue(context, MemberNames.CustomeDateFormat.toString(), customedateformat);
	}

	/**
	 * @return value of MxTemplate_CustomExcel
	 */
	public final xlsreport.proxies.CustomExcel getMxTemplate_CustomExcel() throws com.mendix.core.CoreException
	{
		return getMxTemplate_CustomExcel(getContext());
	}

	/**
	 * @param context
	 * @return value of MxTemplate_CustomExcel
	 */
	public final xlsreport.proxies.CustomExcel getMxTemplate_CustomExcel(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.CustomExcel result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxTemplate_CustomExcel.toString());
		if (identifier != null)
			result = xlsreport.proxies.CustomExcel.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxTemplate_CustomExcel
	 * @param mxtemplate_customexcel
	 */
	public final void setMxTemplate_CustomExcel(xlsreport.proxies.CustomExcel mxtemplate_customexcel)
	{
		setMxTemplate_CustomExcel(getContext(), mxtemplate_customexcel);
	}

	/**
	 * Set value of MxTemplate_CustomExcel
	 * @param context
	 * @param mxtemplate_customexcel
	 */
	public final void setMxTemplate_CustomExcel(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.CustomExcel mxtemplate_customexcel)
	{
		if (mxtemplate_customexcel == null)
			getMendixObject().setValue(context, MemberNames.MxTemplate_CustomExcel.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxTemplate_CustomExcel.toString(), mxtemplate_customexcel.getMendixObject().getId());
	}

	/**
	 * @return value of MxTemplate_InputObject
	 */
	public final mxmodelreflection.proxies.MxObjectType getMxTemplate_InputObject() throws com.mendix.core.CoreException
	{
		return getMxTemplate_InputObject(getContext());
	}

	/**
	 * @param context
	 * @return value of MxTemplate_InputObject
	 */
	public final mxmodelreflection.proxies.MxObjectType getMxTemplate_InputObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxTemplate_InputObject.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxTemplate_InputObject
	 * @param mxtemplate_inputobject
	 */
	public final void setMxTemplate_InputObject(mxmodelreflection.proxies.MxObjectType mxtemplate_inputobject)
	{
		setMxTemplate_InputObject(getContext(), mxtemplate_inputobject);
	}

	/**
	 * Set value of MxTemplate_InputObject
	 * @param context
	 * @param mxtemplate_inputobject
	 */
	public final void setMxTemplate_InputObject(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectType mxtemplate_inputobject)
	{
		if (mxtemplate_inputobject == null)
			getMendixObject().setValue(context, MemberNames.MxTemplate_InputObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxTemplate_InputObject.toString(), mxtemplate_inputobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxTemplateMendixObject;
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
			final xlsreport.proxies.MxTemplate that = (xlsreport.proxies.MxTemplate) obj;
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
		return "XLSReport.MxTemplate";
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