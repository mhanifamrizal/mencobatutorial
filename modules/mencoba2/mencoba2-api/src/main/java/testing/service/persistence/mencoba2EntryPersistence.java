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

import testing.exception.NoSuchmencoba2EntryException;

import testing.model.mencoba2Entry;

/**
 * The persistence interface for the mencoba2 entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sukri
 * @see testing.service.persistence.impl.mencoba2EntryPersistenceImpl
 * @see mencoba2EntryUtil
 * @generated
 */
@ProviderType
public interface mencoba2EntryPersistence extends BasePersistence<mencoba2Entry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link mencoba2EntryUtil} to access the mencoba2 entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mencoba2 entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencoba2 entries
	*/
	public java.util.List<mencoba2Entry> findByUuid(String uuid);

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
	public java.util.List<mencoba2Entry> findByUuid(String uuid, int start,
		int end);

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
	public java.util.List<mencoba2Entry> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

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
	public java.util.List<mencoba2Entry> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

	/**
	* Returns the mencoba2 entries before and after the current mencoba2 entry in the ordered set where uuid = &#63;.
	*
	* @param entryId the primary key of the current mencoba2 entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public mencoba2Entry[] findByUuid_PrevAndNext(long entryId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Removes all the mencoba2 entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of mencoba2 entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencoba2 entries
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencoba2EntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry findByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the mencoba2 entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencoba2 entry that was removed
	*/
	public mencoba2Entry removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the number of mencoba2 entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencoba2 entries
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the mencoba2 entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mencoba2 entries
	*/
	public java.util.List<mencoba2Entry> findByUuid_C(String uuid,
		long companyId);

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
	public java.util.List<mencoba2Entry> findByUuid_C(String uuid,
		long companyId, int start, int end);

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
	public java.util.List<mencoba2Entry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

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
	public java.util.List<mencoba2Entry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the first mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the last mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

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
	public mencoba2Entry[] findByUuid_C_PrevAndNext(long entryId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Removes all the mencoba2 entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of mencoba2 entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mencoba2 entries
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the matching mencoba2 entries
	*/
	public java.util.List<mencoba2Entry> findByG_G(long groupId,
		long guestbookId);

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
	public java.util.List<mencoba2Entry> findByG_G(long groupId,
		long guestbookId, int start, int end);

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
	public java.util.List<mencoba2Entry> findByG_G(long groupId,
		long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

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
	public java.util.List<mencoba2Entry> findByG_G(long groupId,
		long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry findByG_G_First(long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the first mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByG_G_First(long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

	/**
	* Returns the last mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry findByG_G_Last(long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the last mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	public mencoba2Entry fetchByG_G_Last(long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

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
	public mencoba2Entry[] findByG_G_PrevAndNext(long entryId, long groupId,
		long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException;

	/**
	* Removes all the mencoba2 entries where groupId = &#63; and guestbookId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	*/
	public void removeByG_G(long groupId, long guestbookId);

	/**
	* Returns the number of mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the number of matching mencoba2 entries
	*/
	public int countByG_G(long groupId, long guestbookId);

	/**
	* Caches the mencoba2 entry in the entity cache if it is enabled.
	*
	* @param mencoba2Entry the mencoba2 entry
	*/
	public void cacheResult(mencoba2Entry mencoba2Entry);

	/**
	* Caches the mencoba2 entries in the entity cache if it is enabled.
	*
	* @param mencoba2Entries the mencoba2 entries
	*/
	public void cacheResult(java.util.List<mencoba2Entry> mencoba2Entries);

	/**
	* Creates a new mencoba2 entry with the primary key. Does not add the mencoba2 entry to the database.
	*
	* @param entryId the primary key for the new mencoba2 entry
	* @return the new mencoba2 entry
	*/
	public mencoba2Entry create(long entryId);

	/**
	* Removes the mencoba2 entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry that was removed
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public mencoba2Entry remove(long entryId)
		throws NoSuchmencoba2EntryException;

	public mencoba2Entry updateImpl(mencoba2Entry mencoba2Entry);

	/**
	* Returns the mencoba2 entry with the primary key or throws a {@link NoSuchmencoba2EntryException} if it could not be found.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry
	* @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	*/
	public mencoba2Entry findByPrimaryKey(long entryId)
		throws NoSuchmencoba2EntryException;

	/**
	* Returns the mencoba2 entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry, or <code>null</code> if a mencoba2 entry with the primary key could not be found
	*/
	public mencoba2Entry fetchByPrimaryKey(long entryId);

	@Override
	public java.util.Map<java.io.Serializable, mencoba2Entry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the mencoba2 entries.
	*
	* @return the mencoba2 entries
	*/
	public java.util.List<mencoba2Entry> findAll();

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
	public java.util.List<mencoba2Entry> findAll(int start, int end);

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
	public java.util.List<mencoba2Entry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator);

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
	public java.util.List<mencoba2Entry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the mencoba2 entries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of mencoba2 entries.
	*
	* @return the number of mencoba2 entries
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}