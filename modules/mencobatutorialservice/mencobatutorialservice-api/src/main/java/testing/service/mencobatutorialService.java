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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import testing.model.mencobatutorial;

import java.util.List;

/**
 * Provides the remote service interface for mencobatutorial. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Sukri
 * @see mencobatutorialServiceUtil
 * @see testing.service.base.mencobatutorialServiceBaseImpl
 * @see testing.service.impl.mencobatutorialServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=s", "json.web.service.context.path=mencobatutorial"}, service = mencobatutorialService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface mencobatutorialService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link mencobatutorialServiceUtil} to access the mencobatutorial remote service. Add custom service methods to {@link testing.service.impl.mencobatutorialServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public mencobatutorial addGuestbook(long userId, String name,
		ServiceContext serviceContext) throws SystemException, PortalException;

	public mencobatutorial deleteGuestbook(long guestbookId,
		ServiceContext serviceContext) throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<mencobatutorial> getGuestbooks(long groupId)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<mencobatutorial> getGuestbooks(long groupId, int start, int end)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getmencobatutorialCount(long groupId) throws SystemException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	public mencobatutorial updateGuestbook(long userId, long guestbookId,
		String name, ServiceContext serviceContext)
		throws PortalException, SystemException;
}