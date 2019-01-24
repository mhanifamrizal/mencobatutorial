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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import testing.exception.NoSuchmencoba2Exception;

import testing.model.mencoba2;

/**
 * The persistence interface for the mencoba2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sukri
 * @see testing.service.persistence.impl.mencoba2PersistenceImpl
 * @see mencoba2Util
 * @generated
 */
@ProviderType
public interface mencoba2Persistence extends BasePersistence<mencoba2> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link mencoba2Util} to access the mencoba2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mencoba2s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencoba2s
	*/
	public java.util.List<mencoba2> findByUuid(String uuid);

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
	public java.util.List<mencoba2> findByUuid(String uuid, int start, int end);

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
	public java.util.List<mencoba2> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator);

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
	public java.util.List<mencoba2> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public mencoba2 findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception;

	/**
	* Returns the first mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public mencoba2 fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator);

	/**
	* Returns the last mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public mencoba2 findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception;

	/**
	* Returns the last mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public mencoba2 fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator);

	/**
	* Returns the mencoba2s before and after the current mencoba2 in the ordered set where uuid = &#63;.
	*
	* @param guestbookId the primary key of the current mencoba2
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public mencoba2[] findByUuid_PrevAndNext(long guestbookId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception;

	/**
	* Removes all the mencoba2s where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of mencoba2s where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencoba2s
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the mencoba2 where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencoba2Exception} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public mencoba2 findByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2Exception;

	/**
	* Returns the mencoba2 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public mencoba2 fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the mencoba2 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public mencoba2 fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the mencoba2 where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencoba2 that was removed
	*/
	public mencoba2 removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2Exception;

	/**
	* Returns the number of mencoba2s where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencoba2s
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the mencoba2s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching mencoba2s
	*/
	public java.util.List<mencoba2> findByGroupId(long groupId);

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
	public java.util.List<mencoba2> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<mencoba2> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator);

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
	public java.util.List<mencoba2> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public mencoba2 findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception;

	/**
	* Returns the first mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public mencoba2 fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator);

	/**
	* Returns the last mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2
	* @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	*/
	public mencoba2 findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception;

	/**
	* Returns the last mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	*/
	public mencoba2 fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator);

	/**
	* Returns the mencoba2s before and after the current mencoba2 in the ordered set where groupId = &#63;.
	*
	* @param guestbookId the primary key of the current mencoba2
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public mencoba2[] findByGroupId_PrevAndNext(long guestbookId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception;

	/**
	* Removes all the mencoba2s where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of mencoba2s where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching mencoba2s
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the mencoba2 in the entity cache if it is enabled.
	*
	* @param mencoba2 the mencoba2
	*/
	public void cacheResult(mencoba2 mencoba2);

	/**
	* Caches the mencoba2s in the entity cache if it is enabled.
	*
	* @param mencoba2s the mencoba2s
	*/
	public void cacheResult(java.util.List<mencoba2> mencoba2s);

	/**
	* Creates a new mencoba2 with the primary key. Does not add the mencoba2 to the database.
	*
	* @param guestbookId the primary key for the new mencoba2
	* @return the new mencoba2
	*/
	public mencoba2 create(long guestbookId);

	/**
	* Removes the mencoba2 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2 that was removed
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public mencoba2 remove(long guestbookId) throws NoSuchmencoba2Exception;

	public mencoba2 updateImpl(mencoba2 mencoba2);

	/**
	* Returns the mencoba2 with the primary key or throws a {@link NoSuchmencoba2Exception} if it could not be found.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2
	* @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	*/
	public mencoba2 findByPrimaryKey(long guestbookId)
		throws NoSuchmencoba2Exception;

	/**
	* Returns the mencoba2 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestbookId the primary key of the mencoba2
	* @return the mencoba2, or <code>null</code> if a mencoba2 with the primary key could not be found
	*/
	public mencoba2 fetchByPrimaryKey(long guestbookId);

	@Override
	public java.util.Map<java.io.Serializable, mencoba2> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the mencoba2s.
	*
	* @return the mencoba2s
	*/
	public java.util.List<mencoba2> findAll();

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
	public java.util.List<mencoba2> findAll(int start, int end);

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
	public java.util.List<mencoba2> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator);

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
	public java.util.List<mencoba2> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the mencoba2s from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of mencoba2s.
	*
	* @return the number of mencoba2s
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}