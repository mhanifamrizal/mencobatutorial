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

package testing.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import testing.service.mencoba2EntryServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link mencoba2EntryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link testing.model.mencoba2EntrySoap}.
 * If the method in the service utility returns a
 * {@link testing.model.mencoba2Entry}, that is translated to a
 * {@link testing.model.mencoba2EntrySoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author sukri
 * @see mencoba2EntryServiceHttp
 * @see testing.model.mencoba2EntrySoap
 * @see mencoba2EntryServiceUtil
 * @generated
 */
@ProviderType
public class mencoba2EntryServiceSoap {
	public static Mencoba2Entry addEntry(long userId, long guestbookId,
		String name, String email, String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Mencoba2Entry returnValue = mencoba2EntryServiceUtil.addEntry(userId,
					guestbookId, name, email, message, serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Mencoba2Entry updateEntry(long userId, long guestbookId,
		long entryId, String name, String email, String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Mencoba2Entry returnValue = mencoba2EntryServiceUtil.updateEntry(userId,
					guestbookId, entryId, name, email, message, serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Mencoba2Entry deleteEntry(long entryId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Mencoba2Entry returnValue = mencoba2EntryServiceUtil.deleteEntry(entryId,
					serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Mencoba2EntrySoap[] getEntries(long groupId, long guestbookId)
		throws RemoteException {
		try {
			java.util.List<Mencoba2Entry> returnValue = mencoba2EntryServiceUtil.getEntries(groupId,
					guestbookId);

			return Mencoba2EntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Mencoba2EntrySoap[] getEntries(long groupId,
		long guestbookId, int start, int end) throws RemoteException {
		try {
			java.util.List<Mencoba2Entry> returnValue = mencoba2EntryServiceUtil.getEntries(groupId,
					guestbookId, start, end);

			return Mencoba2EntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Mencoba2EntrySoap[] getEntries(long groupId,
		long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entry> obc)
		throws RemoteException {
		try {
			java.util.List<Mencoba2Entry> returnValue = mencoba2EntryServiceUtil.getEntries(groupId,
					guestbookId, start, end, obc);

			return Mencoba2EntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getEntriesCount(long groupId, long guestbookId)
		throws RemoteException {
		try {
			int returnValue = mencoba2EntryServiceUtil.getEntriesCount(groupId,
					guestbookId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(mencoba2EntryServiceSoap.class);
}