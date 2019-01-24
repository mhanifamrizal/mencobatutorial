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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import testing.exception.NoSuchmencoba2Exception;

import testing.model.impl.mencoba2Impl;
import testing.model.impl.mencoba2ModelImpl;

import testing.model.mencoba2;

import testing.service.persistence.mencoba2Persistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the mencoba2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sukri
 * @see mencoba2Persistence
 * @see testing.service.persistence.mencoba2Util
 * @generated
 */
@ProviderType
public class mencoba2PersistenceImpl extends BasePersistenceImpl<mencoba2>
	implements mencoba2Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link mencoba2Util} to access the mencoba2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = mencoba2Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, mencoba2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, mencoba2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, mencoba2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, mencoba2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			mencoba2ModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the mencoba2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mencoba2s
	 */
	@Override
	public List<mencoba2> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencoba2> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<mencoba2> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencoba2> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<mencoba2> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencoba2> orderByComparator, boolean retrieveFromCache) {
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

		List<mencoba2> list = null;

		if (retrieveFromCache) {
			list = (List<mencoba2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencoba2 mencoba2 : list) {
					if (!Objects.equals(uuid, mencoba2.getUuid())) {
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

			query.append(_SQL_SELECT_MENCOBA2_WHERE);

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
				query.append(mencoba2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<mencoba2>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencoba2>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first mencoba2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2
	 * @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 findByUuid_First(String uuid,
		OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = fetchByUuid_First(uuid, orderByComparator);

		if (mencoba2 != null) {
			return mencoba2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencoba2Exception(msg.toString());
	}

	/**
	 * Returns the first mencoba2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 fetchByUuid_First(String uuid,
		OrderByComparator<mencoba2> orderByComparator) {
		List<mencoba2> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mencoba2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2
	 * @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 findByUuid_Last(String uuid,
		OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = fetchByUuid_Last(uuid, orderByComparator);

		if (mencoba2 != null) {
			return mencoba2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencoba2Exception(msg.toString());
	}

	/**
	 * Returns the last mencoba2 in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 fetchByUuid_Last(String uuid,
		OrderByComparator<mencoba2> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<mencoba2> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencoba2[] findByUuid_PrevAndNext(long guestbookId, String uuid,
		OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = findByPrimaryKey(guestbookId);

		Session session = null;

		try {
			session = openSession();

			mencoba2[] array = new mencoba2Impl[3];

			array[0] = getByUuid_PrevAndNext(session, mencoba2, uuid,
					orderByComparator, true);

			array[1] = mencoba2;

			array[2] = getByUuid_PrevAndNext(session, mencoba2, uuid,
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

	protected mencoba2 getByUuid_PrevAndNext(Session session,
		mencoba2 mencoba2, String uuid,
		OrderByComparator<mencoba2> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MENCOBA2_WHERE);

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
			query.append(mencoba2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(mencoba2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencoba2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencoba2s where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (mencoba2 mencoba2 : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(mencoba2);
		}
	}

	/**
	 * Returns the number of mencoba2s where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mencoba2s
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MENCOBA2_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "mencoba2.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "mencoba2.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(mencoba2.uuid IS NULL OR mencoba2.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, mencoba2Impl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			mencoba2ModelImpl.UUID_COLUMN_BITMASK |
			mencoba2ModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the mencoba2 where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencoba2Exception} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencoba2
	 * @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 findByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = fetchByUUID_G(uuid, groupId);

		if (mencoba2 == null) {
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

			throw new NoSuchmencoba2Exception(msg.toString());
		}

		return mencoba2;
	}

	/**
	 * Returns the mencoba2 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mencoba2 where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof mencoba2) {
			mencoba2 mencoba2 = (mencoba2)result;

			if (!Objects.equals(uuid, mencoba2.getUuid()) ||
					(groupId != mencoba2.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MENCOBA2_WHERE);

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

				List<mencoba2> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					mencoba2 mencoba2 = list.get(0);

					result = mencoba2;

					cacheResult(mencoba2);
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
			return (mencoba2)result;
		}
	}

	/**
	 * Removes the mencoba2 where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mencoba2 that was removed
	 */
	@Override
	public mencoba2 removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = findByUUID_G(uuid, groupId);

		return remove(mencoba2);
	}

	/**
	 * Returns the number of mencoba2s where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mencoba2s
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBA2_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "mencoba2.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "mencoba2.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(mencoba2.uuid IS NULL OR mencoba2.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "mencoba2.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, mencoba2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, mencoba2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			mencoba2ModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mencoba2s where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching mencoba2s
	 */
	@Override
	public List<mencoba2> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencoba2> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<mencoba2> findByGroupId(long groupId, int start, int end,
		OrderByComparator<mencoba2> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<mencoba2> findByGroupId(long groupId, int start, int end,
		OrderByComparator<mencoba2> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<mencoba2> list = null;

		if (retrieveFromCache) {
			list = (List<mencoba2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencoba2 mencoba2 : list) {
					if ((groupId != mencoba2.getGroupId())) {
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

			query.append(_SQL_SELECT_MENCOBA2_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencoba2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<mencoba2>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencoba2>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first mencoba2 in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2
	 * @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 findByGroupId_First(long groupId,
		OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = fetchByGroupId_First(groupId, orderByComparator);

		if (mencoba2 != null) {
			return mencoba2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchmencoba2Exception(msg.toString());
	}

	/**
	 * Returns the first mencoba2 in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 fetchByGroupId_First(long groupId,
		OrderByComparator<mencoba2> orderByComparator) {
		List<mencoba2> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mencoba2 in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2
	 * @throws NoSuchmencoba2Exception if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 findByGroupId_Last(long groupId,
		OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = fetchByGroupId_Last(groupId, orderByComparator);

		if (mencoba2 != null) {
			return mencoba2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchmencoba2Exception(msg.toString());
	}

	/**
	 * Returns the last mencoba2 in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencoba2, or <code>null</code> if a matching mencoba2 could not be found
	 */
	@Override
	public mencoba2 fetchByGroupId_Last(long groupId,
		OrderByComparator<mencoba2> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<mencoba2> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencoba2[] findByGroupId_PrevAndNext(long guestbookId, long groupId,
		OrderByComparator<mencoba2> orderByComparator)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = findByPrimaryKey(guestbookId);

		Session session = null;

		try {
			session = openSession();

			mencoba2[] array = new mencoba2Impl[3];

			array[0] = getByGroupId_PrevAndNext(session, mencoba2, groupId,
					orderByComparator, true);

			array[1] = mencoba2;

			array[2] = getByGroupId_PrevAndNext(session, mencoba2, groupId,
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

	protected mencoba2 getByGroupId_PrevAndNext(Session session,
		mencoba2 mencoba2, long groupId,
		OrderByComparator<mencoba2> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MENCOBA2_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(mencoba2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencoba2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencoba2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencoba2s where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (mencoba2 mencoba2 : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(mencoba2);
		}
	}

	/**
	 * Returns the number of mencoba2s where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching mencoba2s
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MENCOBA2_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "mencoba2.groupId = ?";

	public mencoba2PersistenceImpl() {
		setModelClass(mencoba2.class);

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
	 * Caches the mencoba2 in the entity cache if it is enabled.
	 *
	 * @param mencoba2 the mencoba2
	 */
	@Override
	public void cacheResult(mencoba2 mencoba2) {
		entityCache.putResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2Impl.class, mencoba2.getPrimaryKey(), mencoba2);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { mencoba2.getUuid(), mencoba2.getGroupId() }, mencoba2);

		mencoba2.resetOriginalValues();
	}

	/**
	 * Caches the mencoba2s in the entity cache if it is enabled.
	 *
	 * @param mencoba2s the mencoba2s
	 */
	@Override
	public void cacheResult(List<mencoba2> mencoba2s) {
		for (mencoba2 mencoba2 : mencoba2s) {
			if (entityCache.getResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
						mencoba2Impl.class, mencoba2.getPrimaryKey()) == null) {
				cacheResult(mencoba2);
			}
			else {
				mencoba2.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mencoba2s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(mencoba2Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mencoba2.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(mencoba2 mencoba2) {
		entityCache.removeResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2Impl.class, mencoba2.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((mencoba2ModelImpl)mencoba2, true);
	}

	@Override
	public void clearCache(List<mencoba2> mencoba2s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (mencoba2 mencoba2 : mencoba2s) {
			entityCache.removeResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
				mencoba2Impl.class, mencoba2.getPrimaryKey());

			clearUniqueFindersCache((mencoba2ModelImpl)mencoba2, true);
		}
	}

	protected void cacheUniqueFindersCache(mencoba2ModelImpl mencoba2ModelImpl) {
		Object[] args = new Object[] {
				mencoba2ModelImpl.getUuid(), mencoba2ModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			mencoba2ModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		mencoba2ModelImpl mencoba2ModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					mencoba2ModelImpl.getUuid(), mencoba2ModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((mencoba2ModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					mencoba2ModelImpl.getOriginalUuid(),
					mencoba2ModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new mencoba2 with the primary key. Does not add the mencoba2 to the database.
	 *
	 * @param guestbookId the primary key for the new mencoba2
	 * @return the new mencoba2
	 */
	@Override
	public mencoba2 create(long guestbookId) {
		mencoba2 mencoba2 = new mencoba2Impl();

		mencoba2.setNew(true);
		mencoba2.setPrimaryKey(guestbookId);

		String uuid = PortalUUIDUtil.generate();

		mencoba2.setUuid(uuid);

		return mencoba2;
	}

	/**
	 * Removes the mencoba2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestbookId the primary key of the mencoba2
	 * @return the mencoba2 that was removed
	 * @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	 */
	@Override
	public mencoba2 remove(long guestbookId) throws NoSuchmencoba2Exception {
		return remove((Serializable)guestbookId);
	}

	/**
	 * Removes the mencoba2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mencoba2
	 * @return the mencoba2 that was removed
	 * @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	 */
	@Override
	public mencoba2 remove(Serializable primaryKey)
		throws NoSuchmencoba2Exception {
		Session session = null;

		try {
			session = openSession();

			mencoba2 mencoba2 = (mencoba2)session.get(mencoba2Impl.class,
					primaryKey);

			if (mencoba2 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmencoba2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mencoba2);
		}
		catch (NoSuchmencoba2Exception nsee) {
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
	protected mencoba2 removeImpl(mencoba2 mencoba2) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mencoba2)) {
				mencoba2 = (mencoba2)session.get(mencoba2Impl.class,
						mencoba2.getPrimaryKeyObj());
			}

			if (mencoba2 != null) {
				session.delete(mencoba2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mencoba2 != null) {
			clearCache(mencoba2);
		}

		return mencoba2;
	}

	@Override
	public mencoba2 updateImpl(mencoba2 mencoba2) {
		boolean isNew = mencoba2.isNew();

		if (!(mencoba2 instanceof mencoba2ModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(mencoba2.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(mencoba2);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in mencoba2 proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom mencoba2 implementation " +
				mencoba2.getClass());
		}

		mencoba2ModelImpl mencoba2ModelImpl = (mencoba2ModelImpl)mencoba2;

		if (Validator.isNull(mencoba2.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			mencoba2.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (mencoba2.isNew()) {
				session.save(mencoba2);

				mencoba2.setNew(false);
			}
			else {
				mencoba2 = (mencoba2)session.merge(mencoba2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!mencoba2ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { mencoba2ModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] { mencoba2ModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((mencoba2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { mencoba2ModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { mencoba2ModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((mencoba2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencoba2ModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { mencoba2ModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		entityCache.putResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
			mencoba2Impl.class, mencoba2.getPrimaryKey(), mencoba2, false);

		clearUniqueFindersCache(mencoba2ModelImpl, false);
		cacheUniqueFindersCache(mencoba2ModelImpl);

		mencoba2.resetOriginalValues();

		return mencoba2;
	}

	/**
	 * Returns the mencoba2 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencoba2
	 * @return the mencoba2
	 * @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	 */
	@Override
	public mencoba2 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmencoba2Exception {
		mencoba2 mencoba2 = fetchByPrimaryKey(primaryKey);

		if (mencoba2 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmencoba2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mencoba2;
	}

	/**
	 * Returns the mencoba2 with the primary key or throws a {@link NoSuchmencoba2Exception} if it could not be found.
	 *
	 * @param guestbookId the primary key of the mencoba2
	 * @return the mencoba2
	 * @throws NoSuchmencoba2Exception if a mencoba2 with the primary key could not be found
	 */
	@Override
	public mencoba2 findByPrimaryKey(long guestbookId)
		throws NoSuchmencoba2Exception {
		return findByPrimaryKey((Serializable)guestbookId);
	}

	/**
	 * Returns the mencoba2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencoba2
	 * @return the mencoba2, or <code>null</code> if a mencoba2 with the primary key could not be found
	 */
	@Override
	public mencoba2 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
				mencoba2Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		mencoba2 mencoba2 = (mencoba2)serializable;

		if (mencoba2 == null) {
			Session session = null;

			try {
				session = openSession();

				mencoba2 = (mencoba2)session.get(mencoba2Impl.class, primaryKey);

				if (mencoba2 != null) {
					cacheResult(mencoba2);
				}
				else {
					entityCache.putResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
						mencoba2Impl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
					mencoba2Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mencoba2;
	}

	/**
	 * Returns the mencoba2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param guestbookId the primary key of the mencoba2
	 * @return the mencoba2, or <code>null</code> if a mencoba2 with the primary key could not be found
	 */
	@Override
	public mencoba2 fetchByPrimaryKey(long guestbookId) {
		return fetchByPrimaryKey((Serializable)guestbookId);
	}

	@Override
	public Map<Serializable, mencoba2> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, mencoba2> map = new HashMap<Serializable, mencoba2>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			mencoba2 mencoba2 = fetchByPrimaryKey(primaryKey);

			if (mencoba2 != null) {
				map.put(primaryKey, mencoba2);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
					mencoba2Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (mencoba2)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MENCOBA2_WHERE_PKS_IN);

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

			for (mencoba2 mencoba2 : (List<mencoba2>)q.list()) {
				map.put(mencoba2.getPrimaryKeyObj(), mencoba2);

				cacheResult(mencoba2);

				uncachedPrimaryKeys.remove(mencoba2.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(mencoba2ModelImpl.ENTITY_CACHE_ENABLED,
					mencoba2Impl.class, primaryKey, nullModel);
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
	 * Returns all the mencoba2s.
	 *
	 * @return the mencoba2s
	 */
	@Override
	public List<mencoba2> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencoba2> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<mencoba2> findAll(int start, int end,
		OrderByComparator<mencoba2> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<mencoba2> findAll(int start, int end,
		OrderByComparator<mencoba2> orderByComparator, boolean retrieveFromCache) {
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

		List<mencoba2> list = null;

		if (retrieveFromCache) {
			list = (List<mencoba2>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MENCOBA2);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MENCOBA2;

				if (pagination) {
					sql = sql.concat(mencoba2ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<mencoba2>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencoba2>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the mencoba2s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (mencoba2 mencoba2 : findAll()) {
			remove(mencoba2);
		}
	}

	/**
	 * Returns the number of mencoba2s.
	 *
	 * @return the number of mencoba2s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MENCOBA2);

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
		return mencoba2ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mencoba2 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(mencoba2Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_MENCOBA2 = "SELECT mencoba2 FROM mencoba2 mencoba2";
	private static final String _SQL_SELECT_MENCOBA2_WHERE_PKS_IN = "SELECT mencoba2 FROM mencoba2 mencoba2 WHERE guestbookId IN (";
	private static final String _SQL_SELECT_MENCOBA2_WHERE = "SELECT mencoba2 FROM mencoba2 mencoba2 WHERE ";
	private static final String _SQL_COUNT_MENCOBA2 = "SELECT COUNT(mencoba2) FROM mencoba2 mencoba2";
	private static final String _SQL_COUNT_MENCOBA2_WHERE = "SELECT COUNT(mencoba2) FROM mencoba2 mencoba2 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mencoba2.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No mencoba2 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No mencoba2 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(mencoba2PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}