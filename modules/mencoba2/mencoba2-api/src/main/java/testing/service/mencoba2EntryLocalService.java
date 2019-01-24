/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package testing.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import testing.model.mencoba2Entry;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for mencoba2Entry. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author sukri
 * @see mencoba2EntryLocalServiceUtil
 * @see testing.service.base.mencoba2EntryLocalServiceBaseImpl
 * @see testing.service.impl.mencoba2EntryLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface mencoba2EntryLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link mencoba2EntryLocalServiceUtil} to access the mencoba2 entry local service. Add custom service methods to {@link testing.service.impl.mencoba2EntryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the mencoba2 entry to the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2Entry the mencoba2 entry
	* @return the mencoba2 entry that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public mencoba2Entry addmencoba2Entry(mencoba2Entry mencoba2Entry);

	/**
	* Creates a new mencoba2 entry with the primary key. Does not add the mencoba2 entry to the database.
	*
	* @param entryId the primary key for the new mencoba2 entry
	* @return the new mencoba2 entry
	*/
	@Transactional(enabled = false)
	public mencoba2Entry createmencoba2Entry(long entryId);

	/**
	* Deletes the mencoba2 entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry that was removed
	* @throws PortalException if a mencoba2 entry with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public mencoba2Entry deletemencoba2Entry(long entryId)
		throws PortalException;

	/**
	* Deletes the mencoba2 entry from the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2Entry the mencoba2 entry
	* @return the mencoba2 entry that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public mencoba2Entry deletemencoba2Entry(mencoba2Entry mencoba2Entry);

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public mencoba2Entry fetchmencoba2Entry(long entryId);

	/**
	* Returns the mencoba2 entry matching the UUID and group.
	*
	* @param uuid the mencoba2 entry's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public mencoba2Entry fetchmencoba2EntryByUuidAndGroupId(String uuid,
		long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns a range of all the mencoba2 entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @return the range of mencoba2 entries
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<mencoba2Entry> getmencoba2Entries(int start, int end);

	/**
	* Returns all the mencoba2 entries matching the UUID and company.
	*
	* @param uuid the UUID of the mencoba2 entries
	* @param companyId the primary key of the company
	* @return the matching mencoba2 entries, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<mencoba2Entry> getmencoba2EntriesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	* Returns a range of mencoba2 entries matching the UUID and company.
	*
	* @param uuid the UUID of the mencoba2 entries
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching mencoba2 entries, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<mencoba2Entry> getmencoba2EntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator);

	/**
	* Returns the number of mencoba2 entries.
	*
	* @return the number of mencoba2 entries
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getmencoba2EntriesCount();

	/**
	* Returns the mencoba2 entry with the primary key.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry
	* @throws PortalException if a mencoba2 entry with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public mencoba2Entry getmencoba2Entry(long entryId)
		throws PortalException;

	/**
	* Returns the mencoba2 entry matching the UUID and group.
	*
	* @param uuid the mencoba2 entry's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2 entry
	* @throws PortalException if a matching mencoba2 entry could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public mencoba2Entry getmencoba2EntryByUuidAndGroupId(String uuid,
		long groupId) throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the mencoba2 entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencoba2Entry the mencoba2 entry
	* @return the mencoba2 entry that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public mencoba2Entry updatemencoba2Entry(mencoba2Entry mencoba2Entry);
}