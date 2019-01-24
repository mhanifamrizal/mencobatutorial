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

import testing.model.mencoba2Entry;

import java.util.List;

/**
 * The persistence utility for the mencoba2 entry service. This utility wraps {@link testing.service.persistence.impl.mencoba2EntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sukri
 * @see mencoba2EntryPersistence
 * @see testing.service.persistence.impl.mencoba2EntryPersistenceImpl
 * @generated
 */
@ProviderType
public class mencoba2EntryUtil {
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
	public static void clearCache(mencoba2Entry mencoba2Entry) {
		getPersistence().clearCache(mencoba2Entry);
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
	public static List<mencoba2Entry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<mencoba2Entry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<mencoba2Entry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static mencoba2Entry update(mencoba2Entry mencoba2Entry) {
		return getPersistence().update(mencoba2Entry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static mencoba2Entry update(mencoba2Entry mencoba2Entry,
		ServiceContext serviceContext) {
		return getPersistence().update(mencoba2Entry, serviceContext);
	}

	/**
	* Returns all the mencoba2 entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the mencoba2 entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @return the range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry findByUuid_First(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByUuid_First(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry findByUuid_Last(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByUuid_Last(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the mencoba2 entries before and after the current mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param entryId the primary key of the current mencoba2 entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public static mencoba2Entry[] findByUuid_PrevAndNext(long entryId,
		String uuid, OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence()
				   .findByUuid_PrevAndNext(entryId, uuid, orderByComparator);
	}

	/**
	* Removes all the mencoba2 entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of mencoba2 entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencoba2 entries
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencoba2EntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry findByUUID_G(String uuid, long groupId)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the mencoba2 entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencoba2 entry that was removed
	*/
	public static mencoba2Entry removeByUUID_G(String uuid, long groupId)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of mencoba2 entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencoba2 entries
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the mencoba2 entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the mencoba2 entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @return the range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByUuid_C_First(String uuid,
		long companyId, OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the mencoba2 entries before and after the current mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param entryId the primary key of the current mencoba2 entry
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public static mencoba2Entry[] findByUuid_C_PrevAndNext(long entryId,
		String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(entryId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the mencoba2 entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of mencoba2 entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mencoba2 entries
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByG_G(long groupId, long guestbookId) {
		return getPersistence().findByG_G(groupId, guestbookId);
	}

	/**
	* Returns a range of all the mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @return the range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByG_G(long groupId, long guestbookId,
		int start, int end) {
		return getPersistence().findByG_G(groupId, guestbookId, start, end);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByG_G(long groupId, long guestbookId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence()
				   .findByG_G(groupId, guestbookId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencoba2 entries
	*/
	public static List<mencoba2Entry> findByG_G(long groupId, long guestbookId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_G(groupId, guestbookId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry findByG_G_First(long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence()
				   .findByG_G_First(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the first mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByG_G_First(long groupId,
		long guestbookId, OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence()
				   .fetchByG_G_First(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the last mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry findByG_G_Last(long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence()
				   .findByG_G_Last(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the last mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public static mencoba2Entry fetchByG_G_Last(long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence()
				   .fetchByG_G_Last(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the mencoba2 entries before and after the current mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param entryId the primary key of the current mencoba2 entry
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public static mencoba2Entry[] findByG_G_PrevAndNext(long entryId,
		long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence()
				   .findByG_G_PrevAndNext(entryId, groupId, guestbookId,
			orderByComparator);
	}

	/**
	* Removes all the mencoba2 entries where groupId = &#63; and guestbookId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	*/
	public static void removeByG_G(long groupId, long guestbookId) {
		getPersistence().removeByG_G(groupId, guestbookId);
	}

	/**
	* Returns the number of mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the number of matching mencoba2 entries
	*/
	public static int countByG_G(long groupId, long guestbookId) {
		return getPersistence().countByG_G(groupId, guestbookId);
	}

	/**
	* Caches the mencoba2 entry in the entity cache if it is enabled.
	*
	* @param mencoba2Entry the mencoba2 entry
	*/
	public static void cacheResult(mencoba2Entry mencoba2Entry) {
		getPersistence().cacheResult(mencoba2Entry);
	}

	/**
	* Caches the mencoba2 entries in the entity cache if it is enabled.
	*
	* @param mencoba2Entries the mencoba2 entries
	*/
	public static void cacheResult(List<mencoba2Entry> mencoba2Entries) {
		getPersistence().cacheResult(mencoba2Entries);
	}

	/**
	* Creates a new mencoba2 entry with the primary key. Does not add the mencoba2 entry to the database.
	*
	* @param entryId the primary key for the new mencoba2 entry
	* @return the new mencoba2 entry
	*/
	public static mencoba2Entry create(long entryId) {
		return getPersistence().create(entryId);
	}

	/**
	* Removes the mencoba2 entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry that was removed
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public static mencoba2Entry remove(long entryId)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence().remove(entryId);
	}

	public static mencoba2Entry updateImpl(mencoba2Entry mencoba2Entry) {
		return getPersistence().updateImpl(mencoba2Entry);
	}

	/**
	* Returns the mencoba2 entry with the primary key or throws a {@link NoSuchmencoba2EntryException} if it could not be found.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public static mencoba2Entry findByPrimaryKey(long entryId)
		throws testing.exception.NoSuchmencoba2EntryException {
		return getPersistence().findByPrimaryKey(entryId);
	}

	/**
	* Returns the mencoba2 entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry, or <code>null</code> if a mencoba2 entry with the primary key could not be found
	*/
	public static mencoba2Entry fetchByPrimaryKey(long entryId) {
		return getPersistence().fetchByPrimaryKey(entryId);
	}

	public static java.util.Map<java.io.Serializable, mencoba2Entry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the mencoba2 entries.
	*
	* @return the mencoba2 entries
	*/
	public static List<mencoba2Entry> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mencoba2 entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @return the range of mencoba2 entries
	*/
	public static List<mencoba2Entry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mencoba2 entries
	*/
	public static List<mencoba2Entry> findAll(int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencoba2 entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of mencoba2 entries
	*/
	public static List<mencoba2Entry> findAll(int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the mencoba2 entries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mencoba2 entries.
	*
	* @return the number of mencoba2 entries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static mencoba2EntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencoba2EntryPersistence, mencoba2EntryPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencoba2EntryPersistence.class);

		ServiceTracker<mencoba2EntryPersistence, mencoba2EntryPersistence> serviceTracker =
			new ServiceTracker<mencoba2EntryPersistence, mencoba2EntryPersistence>(bundle.getBundleContext(),
				mencoba2EntryPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}