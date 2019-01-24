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

import testing.exception.NoSuchmencobatutorialException;

import testing.model.impl.mencobatutorialImpl;
import testing.model.impl.mencobatutorialModelImpl;

import testing.model.mencobatutorial;

import testing.service.persistence.mencobatutorialPersistence;

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
 * The persistence implementation for the mencobatutorial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sukri
 * @see mencobatutorialPersistence
 * @see testing.service.persistence.mencobatutorialUtil
 * @generated
 */
@ProviderType
public class mencobatutorialPersistenceImpl extends BasePersistenceImpl<mencobatutorial>
	implements mencobatutorialPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link mencobatutorialUtil} to access the mencobatutorial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = mencobatutorialImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			mencobatutorialModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the mencobatutorials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mencobatutorials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @return the range of matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mencobatutorials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mencobatutorials where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByUuid(String uuid, int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator,
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

		List<mencobatutorial> list = null;

		if (retrieveFromCache) {
			list = (List<mencobatutorial>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencobatutorial mencobatutorial : list) {
					if (!Objects.equals(uuid, mencobatutorial.getUuid())) {
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

			query.append(_SQL_SELECT_MENCOBATUTORIAL_WHERE);

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
				query.append(mencobatutorialModelImpl.ORDER_BY_JPQL);
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
					list = (List<mencobatutorial>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencobatutorial>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first mencobatutorial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial
	 * @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial findByUuid_First(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = fetchByUuid_First(uuid,
				orderByComparator);

		if (mencobatutorial != null) {
			return mencobatutorial;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencobatutorialException(msg.toString());
	}

	/**
	 * Returns the first mencobatutorial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial fetchByUuid_First(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator) {
		List<mencobatutorial> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mencobatutorial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial
	 * @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial findByUuid_Last(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = fetchByUuid_Last(uuid,
				orderByComparator);

		if (mencobatutorial != null) {
			return mencobatutorial;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencobatutorialException(msg.toString());
	}

	/**
	 * Returns the last mencobatutorial in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial fetchByUuid_Last(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<mencobatutorial> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mencobatutorials before and after the current mencobatutorial in the ordered set where uuid = &#63;.
	 *
	 * @param guestbookId the primary key of the current mencobatutorial
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mencobatutorial
	 * @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial[] findByUuid_PrevAndNext(long guestbookId,
		String uuid, OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = findByPrimaryKey(guestbookId);

		Session session = null;

		try {
			session = openSession();

			mencobatutorial[] array = new mencobatutorialImpl[3];

			array[0] = getByUuid_PrevAndNext(session, mencobatutorial, uuid,
					orderByComparator, true);

			array[1] = mencobatutorial;

			array[2] = getByUuid_PrevAndNext(session, mencobatutorial, uuid,
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

	protected mencobatutorial getByUuid_PrevAndNext(Session session,
		mencobatutorial mencobatutorial, String uuid,
		OrderByComparator<mencobatutorial> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MENCOBATUTORIAL_WHERE);

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
			query.append(mencobatutorialModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(mencobatutorial);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencobatutorial> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencobatutorials where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (mencobatutorial mencobatutorial : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(mencobatutorial);
		}
	}

	/**
	 * Returns the number of mencobatutorials where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mencobatutorials
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MENCOBATUTORIAL_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "mencobatutorial.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "mencobatutorial.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(mencobatutorial.uuid IS NULL OR mencobatutorial.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			mencobatutorialModelImpl.UUID_COLUMN_BITMASK |
			mencobatutorialModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencobatutorialException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencobatutorial
	 * @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial findByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = fetchByUUID_G(uuid, groupId);

		if (mencobatutorial == null) {
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

			throw new NoSuchmencobatutorialException(msg.toString());
		}

		return mencobatutorial;
	}

	/**
	 * Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof mencobatutorial) {
			mencobatutorial mencobatutorial = (mencobatutorial)result;

			if (!Objects.equals(uuid, mencobatutorial.getUuid()) ||
					(groupId != mencobatutorial.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MENCOBATUTORIAL_WHERE);

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

				List<mencobatutorial> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					mencobatutorial mencobatutorial = list.get(0);

					result = mencobatutorial;

					cacheResult(mencobatutorial);
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
			return (mencobatutorial)result;
		}
	}

	/**
	 * Removes the mencobatutorial where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mencobatutorial that was removed
	 */
	@Override
	public mencobatutorial removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = findByUUID_G(uuid, groupId);

		return remove(mencobatutorial);
	}

	/**
	 * Returns the number of mencobatutorials where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mencobatutorials
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBATUTORIAL_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "mencobatutorial.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "mencobatutorial.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(mencobatutorial.uuid IS NULL OR mencobatutorial.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "mencobatutorial.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			mencobatutorialModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mencobatutorials where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mencobatutorials where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @return the range of matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mencobatutorials where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByGroupId(long groupId, int start,
		int end, OrderByComparator<mencobatutorial> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mencobatutorials where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findByGroupId(long groupId, int start,
		int end, OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache) {
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

		List<mencobatutorial> list = null;

		if (retrieveFromCache) {
			list = (List<mencobatutorial>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencobatutorial mencobatutorial : list) {
					if ((groupId != mencobatutorial.getGroupId())) {
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

			query.append(_SQL_SELECT_MENCOBATUTORIAL_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencobatutorialModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<mencobatutorial>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencobatutorial>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first mencobatutorial in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial
	 * @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial findByGroupId_First(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = fetchByGroupId_First(groupId,
				orderByComparator);

		if (mencobatutorial != null) {
			return mencobatutorial;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchmencobatutorialException(msg.toString());
	}

	/**
	 * Returns the first mencobatutorial in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial fetchByGroupId_First(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator) {
		List<mencobatutorial> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mencobatutorial in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial
	 * @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial findByGroupId_Last(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (mencobatutorial != null) {
			return mencobatutorial;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchmencobatutorialException(msg.toString());
	}

	/**
	 * Returns the last mencobatutorial in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial fetchByGroupId_Last(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<mencobatutorial> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mencobatutorials before and after the current mencobatutorial in the ordered set where groupId = &#63;.
	 *
	 * @param guestbookId the primary key of the current mencobatutorial
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mencobatutorial
	 * @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial[] findByGroupId_PrevAndNext(long guestbookId,
		long groupId, OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = findByPrimaryKey(guestbookId);

		Session session = null;

		try {
			session = openSession();

			mencobatutorial[] array = new mencobatutorialImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, mencobatutorial,
					groupId, orderByComparator, true);

			array[1] = mencobatutorial;

			array[2] = getByGroupId_PrevAndNext(session, mencobatutorial,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected mencobatutorial getByGroupId_PrevAndNext(Session session,
		mencobatutorial mencobatutorial, long groupId,
		OrderByComparator<mencobatutorial> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MENCOBATUTORIAL_WHERE);

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
			query.append(mencobatutorialModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencobatutorial);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencobatutorial> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencobatutorials where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (mencobatutorial mencobatutorial : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(mencobatutorial);
		}
	}

	/**
	 * Returns the number of mencobatutorials where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching mencobatutorials
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MENCOBATUTORIAL_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "mencobatutorial.groupId = ?";

	public mencobatutorialPersistenceImpl() {
		setModelClass(mencobatutorial.class);

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
	 * Caches the mencobatutorial in the entity cache if it is enabled.
	 *
	 * @param mencobatutorial the mencobatutorial
	 */
	@Override
	public void cacheResult(mencobatutorial mencobatutorial) {
		entityCache.putResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialImpl.class, mencobatutorial.getPrimaryKey(),
			mencobatutorial);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { mencobatutorial.getUuid(), mencobatutorial.getGroupId() },
			mencobatutorial);

		mencobatutorial.resetOriginalValues();
	}

	/**
	 * Caches the mencobatutorials in the entity cache if it is enabled.
	 *
	 * @param mencobatutorials the mencobatutorials
	 */
	@Override
	public void cacheResult(List<mencobatutorial> mencobatutorials) {
		for (mencobatutorial mencobatutorial : mencobatutorials) {
			if (entityCache.getResult(
						mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
						mencobatutorialImpl.class,
						mencobatutorial.getPrimaryKey()) == null) {
				cacheResult(mencobatutorial);
			}
			else {
				mencobatutorial.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mencobatutorials.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(mencobatutorialImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mencobatutorial.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(mencobatutorial mencobatutorial) {
		entityCache.removeResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialImpl.class, mencobatutorial.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((mencobatutorialModelImpl)mencobatutorial, true);
	}

	@Override
	public void clearCache(List<mencobatutorial> mencobatutorials) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (mencobatutorial mencobatutorial : mencobatutorials) {
			entityCache.removeResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
				mencobatutorialImpl.class, mencobatutorial.getPrimaryKey());

			clearUniqueFindersCache((mencobatutorialModelImpl)mencobatutorial,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		mencobatutorialModelImpl mencobatutorialModelImpl) {
		Object[] args = new Object[] {
				mencobatutorialModelImpl.getUuid(),
				mencobatutorialModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			mencobatutorialModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		mencobatutorialModelImpl mencobatutorialModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					mencobatutorialModelImpl.getUuid(),
					mencobatutorialModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((mencobatutorialModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					mencobatutorialModelImpl.getOriginalUuid(),
					mencobatutorialModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new mencobatutorial with the primary key. Does not add the mencobatutorial to the database.
	 *
	 * @param guestbookId the primary key for the new mencobatutorial
	 * @return the new mencobatutorial
	 */
	@Override
	public mencobatutorial create(long guestbookId) {
		mencobatutorial mencobatutorial = new mencobatutorialImpl();

		mencobatutorial.setNew(true);
		mencobatutorial.setPrimaryKey(guestbookId);

		String uuid = PortalUUIDUtil.generate();

		mencobatutorial.setUuid(uuid);

		return mencobatutorial;
	}

	/**
	 * Removes the mencobatutorial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestbookId the primary key of the mencobatutorial
	 * @return the mencobatutorial that was removed
	 * @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial remove(long guestbookId)
		throws NoSuchmencobatutorialException {
		return remove((Serializable)guestbookId);
	}

	/**
	 * Removes the mencobatutorial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mencobatutorial
	 * @return the mencobatutorial that was removed
	 * @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial remove(Serializable primaryKey)
		throws NoSuchmencobatutorialException {
		Session session = null;

		try {
			session = openSession();

			mencobatutorial mencobatutorial = (mencobatutorial)session.get(mencobatutorialImpl.class,
					primaryKey);

			if (mencobatutorial == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmencobatutorialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mencobatutorial);
		}
		catch (NoSuchmencobatutorialException nsee) {
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
	protected mencobatutorial removeImpl(mencobatutorial mencobatutorial) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mencobatutorial)) {
				mencobatutorial = (mencobatutorial)session.get(mencobatutorialImpl.class,
						mencobatutorial.getPrimaryKeyObj());
			}

			if (mencobatutorial != null) {
				session.delete(mencobatutorial);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mencobatutorial != null) {
			clearCache(mencobatutorial);
		}

		return mencobatutorial;
	}

	@Override
	public mencobatutorial updateImpl(mencobatutorial mencobatutorial) {
		boolean isNew = mencobatutorial.isNew();

		if (!(mencobatutorial instanceof mencobatutorialModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(mencobatutorial.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(mencobatutorial);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in mencobatutorial proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom mencobatutorial implementation " +
				mencobatutorial.getClass());
		}

		mencobatutorialModelImpl mencobatutorialModelImpl = (mencobatutorialModelImpl)mencobatutorial;

		if (Validator.isNull(mencobatutorial.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			mencobatutorial.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (mencobatutorial.isNew()) {
				session.save(mencobatutorial);

				mencobatutorial.setNew(false);
			}
			else {
				mencobatutorial = (mencobatutorial)session.merge(mencobatutorial);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!mencobatutorialModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { mencobatutorialModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] { mencobatutorialModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((mencobatutorialModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencobatutorialModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { mencobatutorialModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((mencobatutorialModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencobatutorialModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { mencobatutorialModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		entityCache.putResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialImpl.class, mencobatutorial.getPrimaryKey(),
			mencobatutorial, false);

		clearUniqueFindersCache(mencobatutorialModelImpl, false);
		cacheUniqueFindersCache(mencobatutorialModelImpl);

		mencobatutorial.resetOriginalValues();

		return mencobatutorial;
	}

	/**
	 * Returns the mencobatutorial with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencobatutorial
	 * @return the mencobatutorial
	 * @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmencobatutorialException {
		mencobatutorial mencobatutorial = fetchByPrimaryKey(primaryKey);

		if (mencobatutorial == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmencobatutorialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mencobatutorial;
	}

	/**
	 * Returns the mencobatutorial with the primary key or throws a {@link NoSuchmencobatutorialException} if it could not be found.
	 *
	 * @param guestbookId the primary key of the mencobatutorial
	 * @return the mencobatutorial
	 * @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial findByPrimaryKey(long guestbookId)
		throws NoSuchmencobatutorialException {
		return findByPrimaryKey((Serializable)guestbookId);
	}

	/**
	 * Returns the mencobatutorial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencobatutorial
	 * @return the mencobatutorial, or <code>null</code> if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
				mencobatutorialImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		mencobatutorial mencobatutorial = (mencobatutorial)serializable;

		if (mencobatutorial == null) {
			Session session = null;

			try {
				session = openSession();

				mencobatutorial = (mencobatutorial)session.get(mencobatutorialImpl.class,
						primaryKey);

				if (mencobatutorial != null) {
					cacheResult(mencobatutorial);
				}
				else {
					entityCache.putResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
						mencobatutorialImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
					mencobatutorialImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mencobatutorial;
	}

	/**
	 * Returns the mencobatutorial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param guestbookId the primary key of the mencobatutorial
	 * @return the mencobatutorial, or <code>null</code> if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial fetchByPrimaryKey(long guestbookId) {
		return fetchByPrimaryKey((Serializable)guestbookId);
	}

	@Override
	public Map<Serializable, mencobatutorial> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, mencobatutorial> map = new HashMap<Serializable, mencobatutorial>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			mencobatutorial mencobatutorial = fetchByPrimaryKey(primaryKey);

			if (mencobatutorial != null) {
				map.put(primaryKey, mencobatutorial);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
					mencobatutorialImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (mencobatutorial)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MENCOBATUTORIAL_WHERE_PKS_IN);

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

			for (mencobatutorial mencobatutorial : (List<mencobatutorial>)q.list()) {
				map.put(mencobatutorial.getPrimaryKeyObj(), mencobatutorial);

				cacheResult(mencobatutorial);

				uncachedPrimaryKeys.remove(mencobatutorial.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(mencobatutorialModelImpl.ENTITY_CACHE_ENABLED,
					mencobatutorialImpl.class, primaryKey, nullModel);
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
	 * Returns all the mencobatutorials.
	 *
	 * @return the mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mencobatutorials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @return the range of mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mencobatutorials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findAll(int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mencobatutorials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of mencobatutorials
	 */
	@Override
	public List<mencobatutorial> findAll(int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator,
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

		List<mencobatutorial> list = null;

		if (retrieveFromCache) {
			list = (List<mencobatutorial>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MENCOBATUTORIAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MENCOBATUTORIAL;

				if (pagination) {
					sql = sql.concat(mencobatutorialModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<mencobatutorial>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencobatutorial>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the mencobatutorials from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (mencobatutorial mencobatutorial : findAll()) {
			remove(mencobatutorial);
		}
	}

	/**
	 * Returns the number of mencobatutorials.
	 *
	 * @return the number of mencobatutorials
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MENCOBATUTORIAL);

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
		return mencobatutorialModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mencobatutorial persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(mencobatutorialImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_MENCOBATUTORIAL = "SELECT mencobatutorial FROM mencobatutorial mencobatutorial";
	private static final String _SQL_SELECT_MENCOBATUTORIAL_WHERE_PKS_IN = "SELECT mencobatutorial FROM mencobatutorial mencobatutorial WHERE guestbookId IN (";
	private static final String _SQL_SELECT_MENCOBATUTORIAL_WHERE = "SELECT mencobatutorial FROM mencobatutorial mencobatutorial WHERE ";
	private static final String _SQL_COUNT_MENCOBATUTORIAL = "SELECT COUNT(mencobatutorial) FROM mencobatutorial mencobatutorial";
	private static final String _SQL_COUNT_MENCOBATUTORIAL_WHERE = "SELECT COUNT(mencobatutorial) FROM mencobatutorial mencobatutorial WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mencobatutorial.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No mencobatutorial exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No mencobatutorial exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(mencobatutorialPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}