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

package testing.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import testing.model.mencoba2;

import java.util.List;

/**
 * The persistence utility for the mencoba2 service. This utility wraps {@link testing.service.persistence.impl.mencoba2PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sukri
 * @see mencoba2Persistence
 * @see testing.service.persistence.impl.mencoba2PersistenceImpl
 * @generated
 */
@ProviderType
public class mencoba2Util {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(mencoba2 mencoba2) {
		getPersistence().clearCache(mencoba2);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<mencoba2> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<mencoba2> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<mencoba2> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static mencoba2 update(mencoba2 mencoba2) {
		return getPersistence().update(mencoba2);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static mencoba2 update(mencoba2 mencoba2,
		ServiceContext serviceContext) {
		return getPersistence().update(mencoba2, serviceContext);
	}

	/**
	* Returns all the mencoba2s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencoba2s
	*/
	public static List<mencoba2> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the mencoba2s where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @return the range of matching mencoba2s
	*/
	public static List<mencoba2> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the mencoba2s where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencoba2s
	*/
	public static List<mencoba2> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencoba2s where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencoba2s
	*/
	public static List<mencoba2> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencoba2> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public static mencoba2 findByUuid_First(String uuid,
		OrderByComparator<mencoba2> orderByComparator)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public static mencoba2 fetchByUuid_First(String uuid,
		OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public static mencoba2 findByUuid_Last(String uuid,
		OrderByComparator<mencoba2> orderByComparator)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public static mencoba2 fetchByUuid_Last(String uuid,
		OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the mencoba2s before and after the current mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param guestbookId the primary key of the current mencoba2
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public static mencoba2[] findByUuid_PrevAndNext(long guestbookId,
		String uuid, OrderByComparator<mencoba2> orderByComparator)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence()
				   .findByUuid_PrevAndNext(guestbookId, uuid, orderByComparator);
	}

	/**
	* Removes all the mencoba2s where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of mencoba2s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencoba2s
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the mencoba2 where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencoba2Exception} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public static mencoba2 findByUUID_G(String uuid, long groupId)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencoba2 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public static mencoba2 fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencoba2 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public static mencoba2 fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the mencoba2 where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencoba2 that was removed
	*/
	public static mencoba2 removeByUUID_G(String uuid, long groupId)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of mencoba2s where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencoba2s
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the mencoba2s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching mencoba2s
	*/
	public static List<mencoba2> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the mencoba2s where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @return the range of matching mencoba2s
	*/
	public static List<mencoba2> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the mencoba2s where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencoba2s
	*/
	public static List<mencoba2> findByGroupId(long groupId, int start,
		int end, OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencoba2s where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencoba2s
	*/
	public static List<mencoba2> findByGroupId(long groupId, int start,
		int end, OrderByComparator<mencoba2> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public static mencoba2 findByGroupId_First(long groupId,
		OrderByComparator<mencoba2> orderByComparator)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public static mencoba2 fetchByGroupId_First(long groupId,
		OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public static mencoba2 findByGroupId_Last(long groupId,
		OrderByComparator<mencoba2> orderByComparator)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public static mencoba2 fetchByGroupId_Last(long groupId,
		OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the mencoba2s before and after the current mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param guestbookId the primary key of the current mencoba2
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public static mencoba2[] findByGroupId_PrevAndNext(long guestbookId,
		long groupId, OrderByComparator<mencoba2> orderByComparator)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence()
				   .findByGroupId_PrevAndNext(guestbookId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the mencoba2s where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of mencoba2s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching mencoba2s
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the mencoba2 in the entity cache if it is enabled.
	*
	* @param mencoba2 the mencoba2
	*/
	public static void cacheResult(mencoba2 mencoba2) {
		getPersistence().cacheResult(mencoba2);
	}

	/**
	* Caches the mencoba2s in the entity cache if it is enabled.
	*
	* @param mencoba2s the mencoba2s
	*/
	public static void cacheResult(List<mencoba2> mencoba2s) {
		getPersistence().cacheResult(mencoba2s);
	}

	/**
	* Creates a new mencoba2 with the primary key. Does not add the mencoba2 to the database.
	*
	* @param guestbookId the primary key for the new mencoba2
	* @return the new mencoba2
	*/
	public static mencoba2 create(long guestbookId) {
		return getPersistence().create(guestbookId);
	}

	/**
	* Removes the mencoba2 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2 that was removed
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public static mencoba2 remove(long guestbookId)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().remove(guestbookId);
	}

	public static mencoba2 updateImpl(mencoba2 mencoba2) {
		return getPersistence().updateImpl(mencoba2);
	}

	/**
	* Returns the mencoba2 with the primary key or throws a {@link NoSuchmencoba2Exception} if it could not be found.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public static mencoba2 findByPrimaryKey(long guestbookId)
		throws testing.exception.NoSuchmencoba2Exception {
		return getPersistence().findByPrimaryKey(guestbookId);
	}

	/**
	* Returns the mencoba2 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2, or <code>null</code> if a mencoba2 with the primary key could not be found
	*/
	public static mencoba2 fetchByPrimaryKey(long guestbookId) {
		return getPersistence().fetchByPrimaryKey(guestbookId);
	}

	public static java.util.Map<java.io.Serializable, mencoba2> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the mencoba2s.
	*
	* @return the mencoba2s
	*/
	public static List<mencoba2> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mencoba2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @return the range of mencoba2s
	*/
	public static List<mencoba2> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mencoba2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mencoba2s
	*/
	public static List<mencoba2> findAll(int start, int end,
		OrderByComparator<mencoba2> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencoba2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2s
	* @param end the upper bound of the range of mencoba2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of mencoba2s
	*/
	public static List<mencoba2> findAll(int start, int end,
		OrderByComparator<mencoba2> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the mencoba2s from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mencoba2s.
	*
	* @return the number of mencoba2s
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static mencoba2Persistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencoba2Persistence, mencoba2Persistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencoba2Persistence.class);

		ServiceTracker<mencoba2Persistence, mencoba2Persistence> serviceTracker = new ServiceTracker<mencoba2Persistence, mencoba2Persistence>(bundle.getBundleContext(),
				mencoba2Persistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}