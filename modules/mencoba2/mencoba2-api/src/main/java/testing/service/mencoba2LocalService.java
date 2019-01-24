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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import testing.model.mencoba2;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for mencoba2. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author sukri
 * @see mencoba2LocalServiceUtil
 * @see testing.service.base.mencoba2LocalServiceBaseImpl
 * @see testing.service.impl.mencoba2LocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface mencoba2LocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link mencoba2LocalServiceUtil} to access the mencoba2 local service. Add custom service methods to {@link testing.service.impl.mencoba2LocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Mencoba2 addGuestbook(long userId, String name,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Adds the mencoba2 to the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public mencoba2 addmencoba2(mencoba2 mencoba2);

	/**
	* Creates a new mencoba2 with the primary key. Does not add the mencoba2 to the database.
	*
	* @param guestbookId the primary key for the new mencoba2
	* @return the new mencoba2
	*/
	@Transactional(enabled = false)
	public mencoba2 createmencoba2(long guestbookId);

	/**
	* Deletes the mencoba2 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2 that was removed
	* @throws PortalException if a mencoba2 with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public mencoba2 deletemencoba2(long guestbookId) throws PortalException;

	/**
	* Deletes the mencoba2 from the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public mencoba2 deletemencoba2(mencoba2 mencoba2);

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public mencoba2 fetchmencoba2(long guestbookId);

	/**
	* Returns the mencoba2 matching the UUID and group.
	*
	* @param uuid the mencoba2's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public mencoba2 fetchmencoba2ByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Mencoba2> getGuestbooks(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Mencoba2> getGuestbooks(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Mencoba2> getGuestbooks(long groupId, int start, int end,
		OrderByComparator<Mencoba2> obc);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getGuestbooksCount(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the mencoba2 with the primary key.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2
	* @throws PortalException if a mencoba2 with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public mencoba2 getmencoba2(long guestbookId) throws PortalException;

	/**
	* Returns the mencoba2 matching the UUID and group.
	*
	* @param uuid the mencoba2's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2
	* @throws PortalException if a matching mencoba2 could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public mencoba2 getmencoba2ByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the mencoba2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @return the range of mencoba2s
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<mencoba2> getmencoba2s(int start, int end);

	/**
	* Returns the number of mencoba2s.
	*
	* @return the number of mencoba2s
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getmencoba2sCount();

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
	* Updates the mencoba2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public mencoba2 updatemencoba2(mencoba2 mencoba2);
}