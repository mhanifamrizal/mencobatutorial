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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link mencoba2EntryService}.
 *
 * @author sukri
 * @see mencoba2EntryService
 * @generated
 */
@ProviderType
public class mencoba2EntryServiceWrapper implements mencoba2EntryService,
	ServiceWrapper<mencoba2EntryService> {
	public mencoba2EntryServiceWrapper(
		mencoba2EntryService mencoba2EntryService) {
		_mencoba2EntryService = mencoba2EntryService;
	}

	@Override
	public Mencoba2Entry addEntry(long userId, long guestbookId, String name,
		String email, String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2EntryService.addEntry(userId, guestbookId, name, email,
			message, serviceContext);
	}

	@Override
	public Mencoba2Entry deleteEntry(long entryId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2EntryService.deleteEntry(entryId, serviceContext);
	}

	@Override
	public java.util.List<Mencoba2Entry> getEntries(long groupId,
		long guestbookId) {
		return _mencoba2EntryService.getEntries(groupId, guestbookId);
	}

	@Override
	public java.util.List<Mencoba2Entry> getEntries(long groupId,
		long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mencoba2EntryService.getEntries(groupId, guestbookId, start, end);
	}

	@Override
	public java.util.List<Mencoba2Entry> getEntries(long groupId,
		long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entry> obc) {
		return _mencoba2EntryService.getEntries(groupId, guestbookId, start,
			end, obc);
	}

	@Override
	public int getEntriesCount(long groupId, long guestbookId) {
		return _mencoba2EntryService.getEntriesCount(groupId, guestbookId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _mencoba2EntryService.getOSGiServiceIdentifier();
	}

	@Override
	public Mencoba2Entry updateEntry(long userId, long guestbookId,
		long entryId, String name, String email, String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mencoba2EntryService.updateEntry(userId, guestbookId, entryId,
			name, email, message, serviceContext);
	}

	@Override
	public mencoba2EntryService getWrappedService() {
		return _mencoba2EntryService;
	}

	@Override
	public void setWrappedService(mencoba2EntryService mencoba2EntryService) {
		_mencoba2EntryService = mencoba2EntryService;
	}

	private mencoba2EntryService _mencoba2EntryService;
}