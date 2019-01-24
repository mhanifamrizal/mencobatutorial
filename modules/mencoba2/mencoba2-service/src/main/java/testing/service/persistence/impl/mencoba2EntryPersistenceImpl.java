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

package testing.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import testing.exception.NoSuchmencoba2EntryException;

import testing.model.impl.mencoba2EntryImpl;
import testing.model.impl.mencoba2EntryModelImpl;

import testing.model.mencoba2Entry;

import testing.service.persistence.mencoba2EntryPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the mencoba2 entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sukri
 * @see mencoba2EntryPersistence
 * @see testing.service.persistence.mencoba2EntryUtil
 * @generated
 */
@ProviderType
public class mencoba2EntryPersistenceImpl extends BasePersistenceImpl<mencoba2Entry>
	implements mencoba2EntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link mencoba2EntryUtil} to access the mencoba2 entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = mencoba2EntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid", new String[] { String.class.getName() },
			mencoba2EntryModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the mencoba2 entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mencoba2 entries
	 */
	@Override
	public List<mencoba2Entry> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencoba2Entry> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<mencoba2Entry> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<mencoba2Entry> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<mencoba2Entry> list = null;

		if (retrieveFromCache) {
			list = (List<mencoba2Entry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencoba2Entry mencoba2Entry : list) {
					if (!Objects.equals(uuid, mencoba2Entry.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencoba2EntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first mencoba2 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2 entry
	 * @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry findByUuid_First(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByUuid_First(uuid, orderByComparator);

		if (mencoba2Entry != null) {
			return mencoba2Entry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencoba2EntryException(msg.toString());
	}

	/**
	 * Returns the first mencoba2 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByUuid_First(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		List<mencoba2Entry> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mencoba2 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2 entry
	 * @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry findByUuid_Last(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByUuid_Last(uuid, orderByComparator);

		if (mencoba2Entry != null) {
			return mencoba2Entry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencoba2EntryException(msg.toString());
	}

	/**
	 * Returns the last mencoba2 entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByUuid_Last(String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<mencoba2Entry> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencoba2Entry[] findByUuid_PrevAndNext(long entryId, String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			mencoba2Entry[] array = new mencoba2EntryImpl[3];

			array[0] = getByUuid_PrevAndNext(session, mencoba2Entry, uuid,
					orderByComparator, true);

			array[1] = mencoba2Entry;

			array[2] = getByUuid_PrevAndNext(session, mencoba2Entry, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected mencoba2Entry getByUuid_PrevAndNext(Session session,
		mencoba2Entry mencoba2Entry, String uuid,
		OrderByComparator<mencoba2Entry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(mencoba2EntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencoba2Entry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencoba2Entry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencoba2 entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (mencoba2Entry mencoba2Entry : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(mencoba2Entry);
		}
	}

	/**
	 * Returns the number of mencoba2 entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mencoba2 entries
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MENCOBA2ENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "mencoba2Entry.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "mencoba2Entry.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(mencoba2Entry.uuid IS NULL OR mencoba2Entry.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			mencoba2EntryModelImpl.UUID_COLUMN_BITMASK |
			mencoba2EntryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencoba2EntryException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencoba2 entry
	 * @throws NoSuchmencoba2EntryException if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry findByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByUUID_G(uuid, groupId);

		if (mencoba2Entry == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchmencoba2EntryException(msg.toString());
		}

		return mencoba2Entry;
	}

	/**
	 * Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mencoba2 entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof mencoba2Entry) {
			mencoba2Entry mencoba2Entry = (mencoba2Entry)result;

			if (!Objects.equals(uuid, mencoba2Entry.getUuid()) ||
					(groupId != mencoba2Entry.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<mencoba2Entry> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					mencoba2Entry mencoba2Entry = list.get(0);

					result = mencoba2Entry;

					cacheResult(mencoba2Entry);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (mencoba2Entry)result;
		}
	}

	/**
	 * Removes the mencoba2 entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mencoba2 entry that was removed
	 */
	@Override
	public mencoba2Entry removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = findByUUID_G(uuid, groupId);

		return remove(mencoba2Entry);
	}

	/**
	 * Returns the number of mencoba2 entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mencoba2 entries
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBA2ENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "mencoba2Entry.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "mencoba2Entry.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(mencoba2Entry.uuid IS NULL OR mencoba2Entry.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "mencoba2Entry.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			mencoba2EntryModelImpl.UUID_COLUMN_BITMASK |
			mencoba2EntryModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mencoba2 entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mencoba2 entries
	 */
	@Override
	public List<mencoba2Entry> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencoba2Entry> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<mencoba2Entry> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<mencoba2Entry> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<mencoba2Entry> list = null;

		if (retrieveFromCache) {
			list = (List<mencoba2Entry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencoba2Entry mencoba2Entry : list) {
					if (!Objects.equals(uuid, mencoba2Entry.getUuid()) ||
							(companyId != mencoba2Entry.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencoba2EntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public mencoba2Entry findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (mencoba2Entry != null) {
			return mencoba2Entry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchmencoba2EntryException(msg.toString());
	}

	/**
	 * Returns the first mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		List<mencoba2Entry> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencoba2Entry findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (mencoba2Entry != null) {
			return mencoba2Entry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchmencoba2EntryException(msg.toString());
	}

	/**
	 * Returns the last mencoba2 entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<mencoba2Entry> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencoba2Entry[] findByUuid_C_PrevAndNext(long entryId, String uuid,
		long companyId, OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			mencoba2Entry[] array = new mencoba2EntryImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, mencoba2Entry, uuid,
					companyId, orderByComparator, true);

			array[1] = mencoba2Entry;

			array[2] = getByUuid_C_PrevAndNext(session, mencoba2Entry, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected mencoba2Entry getByUuid_C_PrevAndNext(Session session,
		mencoba2Entry mencoba2Entry, String uuid, long companyId,
		OrderByComparator<mencoba2Entry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(mencoba2EntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencoba2Entry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencoba2Entry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencoba2 entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (mencoba2Entry mencoba2Entry : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(mencoba2Entry);
		}
	}

	/**
	 * Returns the number of mencoba2 entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mencoba2 entries
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBA2ENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "mencoba2Entry.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "mencoba2Entry.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(mencoba2Entry.uuid IS NULL OR mencoba2Entry.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "mencoba2Entry.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED,
			mencoba2EntryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByG_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			mencoba2EntryModelImpl.GROUPID_COLUMN_BITMASK |
			mencoba2EntryModelImpl.GUESTBOOKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_G = new FinderPath(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @return the matching mencoba2 entries
	 */
	@Override
	public List<mencoba2Entry> findByG_G(long groupId, long guestbookId) {
		return findByG_G(groupId, guestbookId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencoba2Entry> findByG_G(long groupId, long guestbookId,
		int start, int end) {
		return findByG_G(groupId, guestbookId, start, end, null);
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
	@Override
	public List<mencoba2Entry> findByG_G(long groupId, long guestbookId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator) {
		return findByG_G(groupId, guestbookId, start, end, orderByComparator,
			true);
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
	@Override
	public List<mencoba2Entry> findByG_G(long groupId, long guestbookId,
		int start, int end, OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G;
			finderArgs = new Object[] { groupId, guestbookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G;
			finderArgs = new Object[] {
					groupId, guestbookId,
					
					start, end, orderByComparator
				};
		}

		List<mencoba2Entry> list = null;

		if (retrieveFromCache) {
			list = (List<mencoba2Entry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencoba2Entry mencoba2Entry : list) {
					if ((groupId != mencoba2Entry.getGroupId()) ||
							(guestbookId != mencoba2Entry.getGuestbookId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE);

			query.append(_FINDER_COLUMN_G_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencoba2EntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(guestbookId);

				if (!pagination) {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public mencoba2Entry findByG_G_First(long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByG_G_First(groupId, guestbookId,
				orderByComparator);

		if (mencoba2Entry != null) {
			return mencoba2Entry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", guestbookId=");
		msg.append(guestbookId);

		msg.append("}");

		throw new NoSuchmencoba2EntryException(msg.toString());
	}

	/**
	 * Returns the first mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByG_G_First(long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		List<mencoba2Entry> list = findByG_G(groupId, guestbookId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencoba2Entry findByG_G_Last(long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByG_G_Last(groupId, guestbookId,
				orderByComparator);

		if (mencoba2Entry != null) {
			return mencoba2Entry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", guestbookId=");
		msg.append(guestbookId);

		msg.append("}");

		throw new NoSuchmencoba2EntryException(msg.toString());
	}

	/**
	 * Returns the last mencoba2 entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	 */
	@Override
	public mencoba2Entry fetchByG_G_Last(long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		int count = countByG_G(groupId, guestbookId);

		if (count == 0) {
			return null;
		}

		List<mencoba2Entry> list = findByG_G(groupId, guestbookId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencoba2Entry[] findByG_G_PrevAndNext(long entryId, long groupId,
		long guestbookId, OrderByComparator<mencoba2Entry> orderByComparator)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			mencoba2Entry[] array = new mencoba2EntryImpl[3];

			array[0] = getByG_G_PrevAndNext(session, mencoba2Entry, groupId,
					guestbookId, orderByComparator, true);

			array[1] = mencoba2Entry;

			array[2] = getByG_G_PrevAndNext(session, mencoba2Entry, groupId,
					guestbookId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected mencoba2Entry getByG_G_PrevAndNext(Session session,
		mencoba2Entry mencoba2Entry, long groupId, long guestbookId,
		OrderByComparator<mencoba2Entry> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE);

		query.append(_FINDER_COLUMN_G_G_GROUPID_2);

		query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(mencoba2EntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(guestbookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencoba2Entry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencoba2Entry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencoba2 entries where groupId = &#63; and guestbookId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 */
	@Override
	public void removeByG_G(long groupId, long guestbookId) {
		for (mencoba2Entry mencoba2Entry : findByG_G(groupId, guestbookId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(mencoba2Entry);
		}
	}

	/**
	 * Returns the number of mencoba2 entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @return the number of matching mencoba2 entries
	 */
	@Override
	public int countByG_G(long groupId, long guestbookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_G;

		Object[] finderArgs = new Object[] { groupId, guestbookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBA2ENTRY_WHERE);

			query.append(_FINDER_COLUMN_G_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(guestbookId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_G_GROUPID_2 = "mencoba2Entry.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_G_GUESTBOOKID_2 = "mencoba2Entry.guestbookId = ?";

	public mencoba2EntryPersistenceImpl() {
		setModelClass(mencoba2Entry.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the mencoba2 entry in the entity cache if it is enabled.
	 *
	 * @param mencoba2Entry the mencoba2 entry
	 */
	@Override
	public void cacheResult(mencoba2Entry mencoba2Entry) {
		entityCache.putResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryImpl.class, mencoba2Entry.getPrimaryKey(),
			mencoba2Entry);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { mencoba2Entry.getUuid(), mencoba2Entry.getGroupId() },
			mencoba2Entry);

		mencoba2Entry.resetOriginalValues();
	}

	/**
	 * Caches the mencoba2 entries in the entity cache if it is enabled.
	 *
	 * @param mencoba2Entries the mencoba2 entries
	 */
	@Override
	public void cacheResult(List<mencoba2Entry> mencoba2Entries) {
		for (mencoba2Entry mencoba2Entry : mencoba2Entries) {
			if (entityCache.getResult(
						mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
						mencoba2EntryImpl.class, mencoba2Entry.getPrimaryKey()) == null) {
				cacheResult(mencoba2Entry);
			}
			else {
				mencoba2Entry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mencoba2 entries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(mencoba2EntryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mencoba2 entry.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(mencoba2Entry mencoba2Entry) {
		entityCache.removeResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryImpl.class, mencoba2Entry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((mencoba2EntryModelImpl)mencoba2Entry, true);
	}

	@Override
	public void clearCache(List<mencoba2Entry> mencoba2Entries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (mencoba2Entry mencoba2Entry : mencoba2Entries) {
			entityCache.removeResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
				mencoba2EntryImpl.class, mencoba2Entry.getPrimaryKey());

			clearUniqueFindersCache((mencoba2EntryModelImpl)mencoba2Entry, true);
		}
	}

	protected void cacheUniqueFindersCache(
		mencoba2EntryModelImpl mencoba2EntryModelImpl) {
		Object[] args = new Object[] {
				mencoba2EntryModelImpl.getUuid(),
				mencoba2EntryModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			mencoba2EntryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		mencoba2EntryModelImpl mencoba2EntryModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					mencoba2EntryModelImpl.getUuid(),
					mencoba2EntryModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((mencoba2EntryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					mencoba2EntryModelImpl.getOriginalUuid(),
					mencoba2EntryModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new mencoba2 entry with the primary key. Does not add the mencoba2 entry to the database.
	 *
	 * @param entryId the primary key for the new mencoba2 entry
	 * @return the new mencoba2 entry
	 */
	@Override
	public mencoba2Entry create(long entryId) {
		mencoba2Entry mencoba2Entry = new mencoba2EntryImpl();

		mencoba2Entry.setNew(true);
		mencoba2Entry.setPrimaryKey(entryId);

		String uuid = PortalUUIDUtil.generate();

		mencoba2Entry.setUuid(uuid);

		mencoba2Entry.setCompanyId(companyProvider.getCompanyId());

		return mencoba2Entry;
	}

	/**
	 * Removes the mencoba2 entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the mencoba2 entry
	 * @return the mencoba2 entry that was removed
	 * @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	 */
	@Override
	public mencoba2Entry remove(long entryId)
		throws NoSuchmencoba2EntryException {
		return remove((Serializable)entryId);
	}

	/**
	 * Removes the mencoba2 entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mencoba2 entry
	 * @return the mencoba2 entry that was removed
	 * @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	 */
	@Override
	public mencoba2Entry remove(Serializable primaryKey)
		throws NoSuchmencoba2EntryException {
		Session session = null;

		try {
			session = openSession();

			mencoba2Entry mencoba2Entry = (mencoba2Entry)session.get(mencoba2EntryImpl.class,
					primaryKey);

			if (mencoba2Entry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmencoba2EntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mencoba2Entry);
		}
		catch (NoSuchmencoba2EntryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected mencoba2Entry removeImpl(mencoba2Entry mencoba2Entry) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mencoba2Entry)) {
				mencoba2Entry = (mencoba2Entry)session.get(mencoba2EntryImpl.class,
						mencoba2Entry.getPrimaryKeyObj());
			}

			if (mencoba2Entry != null) {
				session.delete(mencoba2Entry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mencoba2Entry != null) {
			clearCache(mencoba2Entry);
		}

		return mencoba2Entry;
	}

	@Override
	public mencoba2Entry updateImpl(mencoba2Entry mencoba2Entry) {
		boolean isNew = mencoba2Entry.isNew();

		if (!(mencoba2Entry instanceof mencoba2EntryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(mencoba2Entry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(mencoba2Entry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in mencoba2Entry proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom mencoba2Entry implementation " +
				mencoba2Entry.getClass());
		}

		mencoba2EntryModelImpl mencoba2EntryModelImpl = (mencoba2EntryModelImpl)mencoba2Entry;

		if (Validator.isNull(mencoba2Entry.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			mencoba2Entry.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (mencoba2Entry.getCreateDate() == null)) {
			if (serviceContext == null) {
				mencoba2Entry.setCreateDate(now);
			}
			else {
				mencoba2Entry.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!mencoba2EntryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				mencoba2Entry.setModifiedDate(now);
			}
			else {
				mencoba2Entry.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (mencoba2Entry.isNew()) {
				session.save(mencoba2Entry);

				mencoba2Entry.setNew(false);
			}
			else {
				mencoba2Entry = (mencoba2Entry)session.merge(mencoba2Entry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!mencoba2EntryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { mencoba2EntryModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					mencoba2EntryModelImpl.getUuid(),
					mencoba2EntryModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] {
					mencoba2EntryModelImpl.getGroupId(),
					mencoba2EntryModelImpl.getGuestbookId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((mencoba2EntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencoba2EntryModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { mencoba2EntryModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((mencoba2EntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencoba2EntryModelImpl.getOriginalUuid(),
						mencoba2EntryModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						mencoba2EntryModelImpl.getUuid(),
						mencoba2EntryModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((mencoba2EntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencoba2EntryModelImpl.getOriginalGroupId(),
						mencoba2EntryModelImpl.getOriginalGuestbookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
					args);

				args = new Object[] {
						mencoba2EntryModelImpl.getGroupId(),
						mencoba2EntryModelImpl.getGuestbookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
					args);
			}
		}

		entityCache.putResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2EntryImpl.class, mencoba2Entry.getPrimaryKey(),
			mencoba2Entry, false);

		clearUniqueFindersCache(mencoba2EntryModelImpl, false);
		cacheUniqueFindersCache(mencoba2EntryModelImpl);

		mencoba2Entry.resetOriginalValues();

		return mencoba2Entry;
	}

	/**
	 * Returns the mencoba2 entry with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencoba2 entry
	 * @return the mencoba2 entry
	 * @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	 */
	@Override
	public mencoba2Entry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmencoba2EntryException {
		mencoba2Entry mencoba2Entry = fetchByPrimaryKey(primaryKey);

		if (mencoba2Entry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmencoba2EntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mencoba2Entry;
	}

	/**
	 * Returns the mencoba2 entry with the primary key or throws a {@link NoSuchmencoba2EntryException} if it could not be found.
	 *
	 * @param entryId the primary key of the mencoba2 entry
	 * @return the mencoba2 entry
	 * @throws NoSuchmencoba2EntryException if a mencoba2 entry with the primary key could not be found
	 */
	@Override
	public mencoba2Entry findByPrimaryKey(long entryId)
		throws NoSuchmencoba2EntryException {
		return findByPrimaryKey((Serializable)entryId);
	}

	/**
	 * Returns the mencoba2 entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencoba2 entry
	 * @return the mencoba2 entry, or <code>null</code> if a mencoba2 entry with the primary key could not be found
	 */
	@Override
	public mencoba2Entry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
				mencoba2EntryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		mencoba2Entry mencoba2Entry = (mencoba2Entry)serializable;

		if (mencoba2Entry == null) {
			Session session = null;

			try {
				session = openSession();

				mencoba2Entry = (mencoba2Entry)session.get(mencoba2EntryImpl.class,
						primaryKey);

				if (mencoba2Entry != null) {
					cacheResult(mencoba2Entry);
				}
				else {
					entityCache.putResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
						mencoba2EntryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
					mencoba2EntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mencoba2Entry;
	}

	/**
	 * Returns the mencoba2 entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the mencoba2 entry
	 * @return the mencoba2 entry, or <code>null</code> if a mencoba2 entry with the primary key could not be found
	 */
	@Override
	public mencoba2Entry fetchByPrimaryKey(long entryId) {
		return fetchByPrimaryKey((Serializable)entryId);
	}

	@Override
	public Map<Serializable, mencoba2Entry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, mencoba2Entry> map = new HashMap<Serializable, mencoba2Entry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			mencoba2Entry mencoba2Entry = fetchByPrimaryKey(primaryKey);

			if (mencoba2Entry != null) {
				map.put(primaryKey, mencoba2Entry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
					mencoba2EntryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (mencoba2Entry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MENCOBA2ENTRY_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (mencoba2Entry mencoba2Entry : (List<mencoba2Entry>)q.list()) {
				map.put(mencoba2Entry.getPrimaryKeyObj(), mencoba2Entry);

				cacheResult(mencoba2Entry);

				uncachedPrimaryKeys.remove(mencoba2Entry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(mencoba2EntryModelImpl.ENTITY_CACHE_ENABLED,
					mencoba2EntryImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the mencoba2 entries.
	 *
	 * @return the mencoba2 entries
	 */
	@Override
	public List<mencoba2Entry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencoba2Entry> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<mencoba2Entry> findAll(int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<mencoba2Entry> findAll(int start, int end,
		OrderByComparator<mencoba2Entry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<mencoba2Entry> list = null;

		if (retrieveFromCache) {
			list = (List<mencoba2Entry>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MENCOBA2ENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MENCOBA2ENTRY;

				if (pagination) {
					sql = sql.concat(mencoba2EntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencoba2Entry>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the mencoba2 entries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (mencoba2Entry mencoba2Entry : findAll()) {
			remove(mencoba2Entry);
		}
	}

	/**
	 * Returns the number of mencoba2 entries.
	 *
	 * @return the number of mencoba2 entries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MENCOBA2ENTRY);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return mencoba2EntryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mencoba2 entry persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(mencoba2EntryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_MENCOBA2ENTRY = "SELECT mencoba2Entry FROM mencoba2Entry mencoba2Entry";
	private static final String _SQL_SELECT_MENCOBA2ENTRY_WHERE_PKS_IN = "SELECT mencoba2Entry FROM mencoba2Entry mencoba2Entry WHERE entryId IN (";
	private static final String _SQL_SELECT_MENCOBA2ENTRY_WHERE = "SELECT mencoba2Entry FROM mencoba2Entry mencoba2Entry WHERE ";
	private static final String _SQL_COUNT_MENCOBA2ENTRY = "SELECT COUNT(mencoba2Entry) FROM mencoba2Entry mencoba2Entry";
	private static final String _SQL_COUNT_MENCOBA2ENTRY_WHERE = "SELECT COUNT(mencoba2Entry) FROM mencoba2Entry mencoba2Entry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mencoba2Entry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No mencoba2Entry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No mencoba2Entry exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(mencoba2EntryPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}