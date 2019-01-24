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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link mencoba2LocalService}.
 *
 * @author sukri
 * @see mencoba2LocalService
 * @generated
 */
@ProviderType
public class mencoba2LocalServiceWrapper implements mencoba2LocalService,
	ServiceWrapper<mencoba2LocalService> {
	public mencoba2LocalServiceWrapper(
		mencoba2LocalService mencoba2LocalService) {
		_mencoba2LocalService = mencoba2LocalService;
	}

	@Override
	public Mencoba2 addGuestbook(long userId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2LocalService.addGuestbook(userId, name, serviceContext);
	}

	/**
	* Adds the mencoba2 to the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was added
	*/
	@Override
	public testing.model.mencoba2 addmencoba2(testing.model.mencoba2 mencoba2) {
		return _mencoba2LocalService.addmencoba2(mencoba2);
	}

	/**
	* Creates a new mencoba2 with the primary key. Does not add the mencoba2 to the database.
	*
	* @param guestbookId the primary key for the new mencoba2
	* @return the new mencoba2
	*/
	@Override
	public testing.model.mencoba2 createmencoba2(long guestbookId) {
		return _mencoba2LocalService.createmencoba2(guestbookId);
	}

	/**
	* Deletes the mencoba2 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2 that was removed
	* @throws PortalException if a mencoba2 with the primary key could not be found
	*/
	@Override
	public testing.model.mencoba2 deletemencoba2(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2LocalService.deletemencoba2(guestbookId);
	}

	/**
	* Deletes the mencoba2 from the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was removed
	*/
	@Override
	public testing.model.mencoba2 deletemencoba2(
		testing.model.mencoba2 mencoba2) {
		return _mencoba2LocalService.deletemencoba2(mencoba2);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mencoba2LocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _mencoba2LocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _mencoba2LocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _mencoba2LocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _mencoba2LocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _mencoba2LocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public testing.model.mencoba2 fetchmencoba2(long guestbookId) {
		return _mencoba2LocalService.fetchmencoba2(guestbookId);
	}

	/**
	* Returns the mencoba2 matching the UUID and group.
	*
	* @param uuid the mencoba2's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	@Override
	public testing.model.mencoba2 fetchmencoba2ByUuidAndGroupId(String uuid,
		long groupId) {
		return _mencoba2LocalService.fetchmencoba2ByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _mencoba2LocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<Mencoba2> getGuestbooks(long groupId) {
		return _mencoba2LocalService.getGuestbooks(groupId);
	}

	@Override
	public java.util.List<Mencoba2> getGuestbooks(long groupId, int start,
		int end) {
		return _mencoba2LocalService.getGuestbooks(groupId, start, end);
	}

	@Override
	public java.util.List<Mencoba2> getGuestbooks(long groupId, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator<Mencoba2> obc) {
		return _mencoba2LocalService.getGuestbooks(groupId, start, end, obc);
	}

	@Override
	public int getGuestbooksCount(long groupId) {
		return _mencoba2LocalService.getGuestbooksCount(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _mencoba2LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the mencoba2 with the primary key.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2
	* @throws PortalException if a mencoba2 with the primary key could not be found
	*/
	@Override
	public testing.model.mencoba2 getmencoba2(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2LocalService.getmencoba2(guestbookId);
	}

	/**
	* Returns the mencoba2 matching the UUID and group.
	*
	* @param uuid the mencoba2's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2
	* @throws PortalException if a matching mencoba2 could not be found
	*/
	@Override
	public testing.model.mencoba2 getmencoba2ByUuidAndGroupId(String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2LocalService.getmencoba2ByUuidAndGroupId(uuid, groupId);
	}

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
	@Override
	public java.util.List<testing.model.mencoba2> getmencoba2s(int start,
		int end) {
		return _mencoba2LocalService.getmencoba2s(start, end);
	}

	/**
	* Returns the number of mencoba2s.
	*
	* @return the number of mencoba2s
	*/
	@Override
	public int getmencoba2sCount() {
		return _mencoba2LocalService.getmencoba2sCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _mencoba2LocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the mencoba2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was updated
	*/
	@Override
	public testing.model.mencoba2 updatemencoba2(
		testing.model.mencoba2 mencoba2) {
		return _mencoba2LocalService.updatemencoba2(mencoba2);
	}

	@Override
	public mencoba2LocalService getWrappedService() {
		return _mencoba2LocalService;
	}

	@Override
	public void setWrappedService(mencoba2LocalService mencoba2LocalService) {
		_mencoba2LocalService = mencoba2LocalService;
	}

	private mencoba2LocalService _mencoba2LocalService;
}