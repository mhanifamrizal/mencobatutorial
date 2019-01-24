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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for mencoba2. This utility wraps
 * {@link testing.service.impl.mencoba2LocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author sukri
 * @see mencoba2LocalService
 * @see testing.service.base.mencoba2LocalServiceBaseImpl
 * @see testing.service.impl.mencoba2LocalServiceImpl
 * @generated
 */
@ProviderType
public class mencoba2LocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link testing.service.impl.mencoba2LocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static Mencoba2 addGuestbook(long userId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addGuestbook(userId, name, serviceContext);
	}

	/**
	* Adds the mencoba2 to the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was added
	*/
	public static testing.model.mencoba2 addmencoba2(
		testing.model.mencoba2 mencoba2) {
		return getService().addmencoba2(mencoba2);
	}

	/**
	* Creates a new mencoba2 with the primary key. Does not add the mencoba2 to the database.
	*
	* @param guestbookId the primary key for the new mencoba2
	* @return the new mencoba2
	*/
	public static testing.model.mencoba2 createmencoba2(long guestbookId) {
		return getService().createmencoba2(guestbookId);
	}

	/**
	* Deletes the mencoba2 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2 that was removed
	* @throws PortalException if a mencoba2 with the primary key could not be found
	*/
	public static testing.model.mencoba2 deletemencoba2(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletemencoba2(guestbookId);
	}

	/**
	* Deletes the mencoba2 from the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was removed
	*/
	public static testing.model.mencoba2 deletemencoba2(
		testing.model.mencoba2 mencoba2) {
		return getService().deletemencoba2(mencoba2);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static testing.model.mencoba2 fetchmencoba2(long guestbookId) {
		return getService().fetchmencoba2(guestbookId);
	}

	/**
	* Returns the mencoba2 matching the UUID and group.
	*
	* @param uuid the mencoba2's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public static testing.model.mencoba2 fetchmencoba2ByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchmencoba2ByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<Mencoba2> getGuestbooks(long groupId) {
		return getService().getGuestbooks(groupId);
	}

	public static java.util.List<Mencoba2> getGuestbooks(long groupId,
		int start, int end) {
		return getService().getGuestbooks(groupId, start, end);
	}

	public static java.util.List<Mencoba2> getGuestbooks(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Mencoba2> obc) {
		return getService().getGuestbooks(groupId, start, end, obc);
	}

	public static int getGuestbooksCount(long groupId) {
		return getService().getGuestbooksCount(groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the mencoba2 with the primary key.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2
	* @throws PortalException if a mencoba2 with the primary key could not be found
	*/
	public static testing.model.mencoba2 getmencoba2(long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getmencoba2(guestbookId);
	}

	/**
	* Returns the mencoba2 matching the UUID and group.
	*
	* @param uuid the mencoba2's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2
	* @throws PortalException if a matching mencoba2 could not be found
	*/
	public static testing.model.mencoba2 getmencoba2ByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getmencoba2ByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<testing.model.mencoba2> getmencoba2s(
		int start, int end) {
		return getService().getmencoba2s(start, end);
	}

	/**
	* Returns the number of mencoba2s.
	*
	* @return the number of mencoba2s
	*/
	public static int getmencoba2sCount() {
		return getService().getmencoba2sCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the mencoba2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencoba2 the mencoba2
	* @return the mencoba2 that was updated
	*/
	public static testing.model.mencoba2 updatemencoba2(
		testing.model.mencoba2 mencoba2) {
		return getService().updatemencoba2(mencoba2);
	}

	public static mencoba2LocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencoba2LocalService, mencoba2LocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencoba2LocalService.class);

		ServiceTracker<mencoba2LocalService, mencoba2LocalService> serviceTracker =
			new ServiceTracker<mencoba2LocalService, mencoba2LocalService>(bundle.getBundleContext(),
				mencoba2LocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}