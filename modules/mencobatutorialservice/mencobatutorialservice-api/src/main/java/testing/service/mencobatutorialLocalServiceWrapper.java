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
 * Provides a wrapper for {@link mencobatutorialLocalService}.
 *
 * @author Sukri
 * @see mencobatutorialLocalService
 * @generated
 */
@ProviderType
public class mencobatutorialLocalServiceWrapper
	implements mencobatutorialLocalService,
		ServiceWrapper<mencobatutorialLocalService> {
	public mencobatutorialLocalServiceWrapper(
		mencobatutorialLocalService mencobatutorialLocalService) {
		_mencobatutorialLocalService = mencobatutorialLocalService;
	}

	@Override
	public testing.model.mencobatutorial addGuestbook(long userId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencobatutorialLocalService.addGuestbook(userId, name,
			serviceContext);
	}

	/**
	* Adds the mencobatutorial to the database. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorial the mencobatutorial
	* @return the mencobatutorial that was added
	*/
	@Override
	public testing.model.mencobatutorial addmencobatutorial(
		testing.model.mencobatutorial mencobatutorial) {
		return _mencobatutorialLocalService.addmencobatutorial(mencobatutorial);
	}

	/**
	* Creates a new mencobatutorial with the primary key. Does not add the mencobatutorial to the database.
	*
	* @param guestbookId the primary key for the new mencobatutorial
	* @return the new mencobatutorial
	*/
	@Override
	public testing.model.mencobatutorial createmencobatutorial(long guestbookId) {
		return _mencobatutorialLocalService.createmencobatutorial(guestbookId);
	}

	@Override
	public testing.model.mencobatutorial deleteGuestbook(long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mencobatutorialLocalService.deleteGuestbook(guestbookId,
			serviceContext);
	}

	/**
	* Deletes the mencobatutorial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial that was removed
	* @throws PortalException if a mencobatutorial with the primary key could not be found
	*/
	@Override
	public testing.model.mencobatutorial deletemencobatutorial(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencobatutorialLocalService.deletemencobatutorial(guestbookId);
	}

	/**
	* Deletes the mencobatutorial from the database. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorial the mencobatutorial
	* @return the mencobatutorial that was removed
	*/
	@Override
	public testing.model.mencobatutorial deletemencobatutorial(
		testing.model.mencobatutorial mencobatutorial) {
		return _mencobatutorialLocalService.deletemencobatutorial(mencobatutorial);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencobatutorialLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mencobatutorialLocalService.dynamicQuery();
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
		return _mencobatutorialLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mencobatutorialLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mencobatutorialLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _mencobatutorialLocalService.dynamicQueryCount(dynamicQuery);
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
		return _mencobatutorialLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public testing.model.mencobatutorial fetchmencobatutorial(long guestbookId) {
		return _mencobatutorialLocalService.fetchmencobatutorial(guestbookId);
	}

	/**
	* Returns the mencobatutorial matching the UUID and group.
	*
	* @param uuid the mencobatutorial's UUID
	* @param groupId the primary key of the group
	* @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	@Override
	public testing.model.mencobatutorial fetchmencobatutorialByUuidAndGroupId(
		String uuid, long groupId) {
		return _mencobatutorialLocalService.fetchmencobatutorialByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _mencobatutorialLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<testing.model.mencobatutorial> getGuestbooks(
		long groupId) {
		return _mencobatutorialLocalService.getGuestbooks(groupId);
	}

	@Override
	public java.util.List<testing.model.mencobatutorial> getGuestbooks(
		long groupId, int start, int end) {
		return _mencobatutorialLocalService.getGuestbooks(groupId, start, end);
	}

	@Override
	public java.util.List<testing.model.mencobatutorial> getGuestbooks(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<testing.model.mencobatutorial> obc) {
		return _mencobatutorialLocalService.getGuestbooks(groupId, start, end,
			obc);
	}

	@Override
	public int getGuestbooksCount(long groupId) {
		return _mencobatutorialLocalService.getGuestbooksCount(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _mencobatutorialLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the mencobatutorial with the primary key.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial
	* @throws PortalException if a mencobatutorial with the primary key could not be found
	*/
	@Override
	public testing.model.mencobatutorial getmencobatutorial(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencobatutorialLocalService.getmencobatutorial(guestbookId);
	}

	/**
	* Returns the mencobatutorial matching the UUID and group.
	*
	* @param uuid the mencobatutorial's UUID
	* @param groupId the primary key of the group
	* @return the matching mencobatutorial
	* @throws PortalException if a matching mencobatutorial could not be found
	*/
	@Override
	public testing.model.mencobatutorial getmencobatutorialByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencobatutorialLocalService.getmencobatutorialByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the mencobatutorials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @return the range of mencobatutorials
	*/
	@Override
	public java.util.List<testing.model.mencobatutorial> getmencobatutorials(
		int start, int end) {
		return _mencobatutorialLocalService.getmencobatutorials(start, end);
	}

	/**
	* Returns the number of mencobatutorials.
	*
	* @return the number of mencobatutorials
	*/
	@Override
	public int getmencobatutorialsCount() {
		return _mencobatutorialLocalService.getmencobatutorialsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _mencobatutorialLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencobatutorialLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public testing.model.mencobatutorial updateGuestbook(long userId,
		long guestbookId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mencobatutorialLocalService.updateGuestbook(userId,
			guestbookId, name, serviceContext);
	}

	/**
	* Updates the mencobatutorial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorial the mencobatutorial
	* @return the mencobatutorial that was updated
	*/
	@Override
	public testing.model.mencobatutorial updatemencobatutorial(
		testing.model.mencobatutorial mencobatutorial) {
		return _mencobatutorialLocalService.updatemencobatutorial(mencobatutorial);
	}

	@Override
	public mencobatutorialLocalService getWrappedService() {
		return _mencobatutorialLocalService;
	}

	@Override
	public void setWrappedService(
		mencobatutorialLocalService mencobatutorialLocalService) {
		_mencobatutorialLocalService = mencobatutorialLocalService;
	}

	private mencobatutorialLocalService _mencobatutorialLocalService;
}