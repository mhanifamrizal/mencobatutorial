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

import testing.service.mencobatutorialServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link mencobatutorialServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link testing.model.mencobatutorialSoap}.
 * If the method in the service utility returns a
 * {@link testing.model.mencobatutorial}, that is translated to a
 * {@link testing.model.mencobatutorialSoap}. Methods that SOAP cannot
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
 * @see mencobatutorialServiceHttp
 * @see testing.model.mencobatutorialSoap
 * @see mencobatutorialServiceUtil
 * @generated
 */
@ProviderType
public class mencobatutorialServiceSoap {
	public static testing.model.mencobatutorialSoap addGuestbook(long userId,
		String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			testing.model.mencobatutorial returnValue = mencobatutorialServiceUtil.addGuestbook(userId,
					name, serviceContext);

			return testing.model.mencobatutorialSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialSoap deleteGuestbook(
		long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			testing.model.mencobatutorial returnValue = mencobatutorialServiceUtil.deleteGuestbook(guestbookId,
					serviceContext);

			return testing.model.mencobatutorialSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialSoap[] getGuestbooks(
		long groupId) throws RemoteException {
		try {
			java.util.List<testing.model.mencobatutorial> returnValue = mencobatutorialServiceUtil.getGuestbooks(groupId);

			return testing.model.mencobatutorialSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialSoap[] getGuestbooks(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<testing.model.mencobatutorial> returnValue = mencobatutorialServiceUtil.getGuestbooks(groupId,
					start, end);

			return testing.model.mencobatutorialSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getmencobatutorialCount(long groupId)
		throws RemoteException {
		try {
			int returnValue = mencobatutorialServiceUtil.getmencobatutorialCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static testing.model.mencobatutorialSoap updateGuestbook(
		long userId, long guestbookId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			testing.model.mencobatutorial returnValue = mencobatutorialServiceUtil.updateGuestbook(userId,
					guestbookId, name, serviceContext);

			return testing.model.mencobatutorialSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(mencobatutorialServiceSoap.class);
}