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

import testing.service.mencobatutorialEntryServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link mencobatutorialEntryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link testing.model.mencobatutorialEntrySoap}.
 * If the method in the service utility returns a
 * {@link testing.model.mencobatutorialEntry}, that is translated to a
 * {@link testing.model.mencobatutorialEntrySoap}. Methods that SOAP cannot
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
 * @author Sukri
 * @see mencobatutorialEntryServiceHttp
 * @see testing.model.mencobatutorialEntrySoap
 * @see mencobatutorialEntryServiceUtil
 * @generated
 */
@ProviderType
public class mencobatutorialEntryServiceSoap {
	public static testing.model.mencobatutorialEntrySoap addEntry(long userId,
		long guestbookId, String name, String email, String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			testing.model.mencobatutorialEntry returnValue = mencobatutorialEntryServiceUtil.addEntry(userId,
					guestbookId, name, email, message, serviceContext);

			return testing.model.mencobatutorialEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialEntrySoap deleteEntry(
		long entryId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			testing.model.mencobatutorialEntry returnValue = mencobatutorialEntryServiceUtil.deleteEntry(entryId,
					serviceContext);

			return testing.model.mencobatutorialEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialEntrySoap[] getEntries(
		long groupId, long guestbookId) throws RemoteException {
		try {
			java.util.List<testing.model.mencobatutorialEntry> returnValue = mencobatutorialEntryServiceUtil.getEntries(groupId,
					guestbookId);

			return testing.model.mencobatutorialEntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialEntrySoap[] getEntries(
		long groupId, long guestbookId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<testing.model.mencobatutorialEntry> returnValue = mencobatutorialEntryServiceUtil.getEntries(groupId,
					guestbookId, start, end);

			return testing.model.mencobatutorialEntrySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getEntriesCount(long groupId, long guestbookId)
		throws RemoteException {
		try {
			int returnValue = mencobatutorialEntryServiceUtil.getEntriesCount(groupId,
					guestbookId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialEntrySoap updateEntry(
		long userId, long guestbookId, long entryId, String name, String email,
		String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			testing.model.mencobatutorialEntry returnValue = mencobatutorialEntryServiceUtil.updateEntry(userId,
					guestbookId, entryId, name, email, message, serviceContext);

			return testing.model.mencobatutorialEntrySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(mencobatutorialEntryServiceSoap.class);
}