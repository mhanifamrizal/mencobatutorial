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

package testing.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import testing.exception.GuestbookNameException;
import testing.service.base.mencoba2LocalServiceBaseImpl;

/**
 * The implementation of the mencoba2 local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link testing.service.mencoba2LocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sukri
 * @see mencoba2LocalServiceBaseImpl
 * @see testing.service.mencoba2LocalServiceUtil
 */
public class mencoba2LocalServiceImpl extends mencoba2LocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link testing.service.mencoba2LocalServiceUtil} to access the mencoba2 local service.
	 */
	public Mencoba2 addGuestbook(
	    long userId, String name, ServiceContext serviceContext)
	    throws PortalException {

	    long groupId = serviceContext.getScopeGroupId();

	    User user = userLocalService.getUserById(userId);

	    Date now = new Date();

	    validate(name);

	    long guestbookId = counterLocalService.increment();

	    Mencoba2 guestbook = mencoba2Persistence.create(guestbookId);

	    guestbook.setUuid(serviceContext.getUuid());
	    guestbook.setUserId(userId);
	    guestbook.setGroupId(groupId);
	    guestbook.setCompanyId(user.getCompanyId());
	    guestbook.setUserName(user.getFullName());
	    guestbook.setCreateDate(serviceContext.getCreateDate(now));
	    guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
	    guestbook.setName(name);
	    guestbook.setExpandoBridgeAttributes(serviceContext);

	    mencoba2Persistence.update(guestbook);

	    return guestbook;

	}
	
	public List<Mencoba2> getGuestbooks(long groupId) {

	    return mencoba2Persistence.findByGroupId(groupId);
	}

	public List<Mencoba2> getGuestbooks(long groupId, int start, int end, 
	    OrderByComparator<Mencoba2> obc) {

	    return mencoba2Persistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Mencoba2> getGuestbooks(long groupId, int start, int end) {

	    return mencoba2Persistence.findByGroupId(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) {

	    return mencoba2Persistence.countByGroupId(groupId);
	}
	
	protected void validate(String name) throws PortalException {
	    if (Validator.isNull(name)) {
	        throw new GuestbookNameException();
	    }
	}
}

