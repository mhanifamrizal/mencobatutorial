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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import testing.exception.GuestbookNameException;
import testing.model.mencobatutorial;
import testing.model.mencobatutorialEntry;
import testing.service.base.mencobatutorialLocalServiceBaseImpl;

/**
 * The implementation of the mencobatutorial local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link testing.service.mencobatutorialLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sukri
 * @see mencobatutorialLocalServiceBaseImpl
 * @see testing.service.mencobatutorialLocalServiceUtil
 */
public class mencobatutorialLocalServiceImpl
	extends mencobatutorialLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link testing.service.mencobatutorialLocalServiceUtil} to access the mencobatutorial local service.
	 */
	
	public mencobatutorial updateGuestbook(long userId, long guestbookId,
		    String name, ServiceContext serviceContext) throws PortalException,
		                SystemException {

		        Date now = new Date();

		        validate(name);

		        mencobatutorial guestbook = getmencobatutorial(guestbookId);

		        User user = userLocalService.getUser(userId);

		        //guestbook.setUserId(userId);
		        //guestbook.setUserName(user.getFullName());
		        //guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		        guestbook.setName(name);
		        guestbook.setExpandoBridgeAttributes(serviceContext);

		        mencobatutorialPersistence.update(guestbook);
		        
		        return guestbook;
		}
	
	public mencobatutorial deleteGuestbook(long guestbookId,
	            ServiceContext serviceContext) throws PortalException,
	            SystemException {
	
	    mencobatutorial guestbook = getmencobatutorial(guestbookId);
	
	    List<mencobatutorialEntry> entries = mencobatutorialEntryLocalService.getEntries(
	                    serviceContext.getScopeGroupId(), guestbookId);
	
	    for (mencobatutorialEntry entry : entries) {
	            mencobatutorialEntryLocalService.deletemencobatutorialEntry(entry.getEntryId());
	    }
	
	    guestbook = deletemencobatutorial(guestbook);
	    
	    
	    return guestbook;
	}
	
	
	public mencobatutorial addGuestbook(
		    long userId, String name, ServiceContext serviceContext)
		    throws PortalException {

		    long groupId = serviceContext.getScopeGroupId();

		    User user = userLocalService.getUserById(userId);

		    Date now = new Date();

		    validate(name);

		    long guestbookId = counterLocalService.increment();

		    mencobatutorial guestbook = mencobatutorialPersistence.create(guestbookId);

		    guestbook.setUuid(serviceContext.getUuid());
		    //guestbook.setUserId(userId);
		    guestbook.setGroupId(groupId);
		    //guestbook.setCompanyId(user.getCompanyId());
		    //guestbook.setUserName(user.getFullName());
		    //guestbook.setCreateDate(serviceContext.getCreateDate(now));
		    //guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		    guestbook.setName(name);
		    guestbook.setExpandoBridgeAttributes(serviceContext);

		    mencobatutorialPersistence.update(guestbook);
		    
		    return guestbook;
		}

	public List<mencobatutorial> getGuestbooks(long groupId) {

	    return mencobatutorialPersistence.findByGroupId(groupId);
	}

	public List<mencobatutorial> getGuestbooks(long groupId, int start, int end, 
	    OrderByComparator<mencobatutorial> obc) {

	    return mencobatutorialPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<mencobatutorial> getGuestbooks(long groupId, int start, int end) {

	    return mencobatutorialPersistence.findByGroupId(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) {

	    return mencobatutorialPersistence.countByGroupId(groupId);
	}
	
	protected void validate(String name) throws PortalException {
	    if (Validator.isNull(name)) {
	        throw new GuestbookNameException();
	    }
	}
}

