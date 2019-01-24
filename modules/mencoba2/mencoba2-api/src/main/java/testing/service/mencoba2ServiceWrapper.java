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
 * Provides a wrapper for {@link mencoba2Service}.
 *
 * @author sukri
 * @see mencoba2Service
 * @generated
 */
@ProviderType
public class mencoba2ServiceWrapper implements mencoba2Service,
	ServiceWrapper<mencoba2Service> {
	public mencoba2ServiceWrapper(mencoba2Service mencoba2Service) {
		_mencoba2Service = mencoba2Service;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _mencoba2Service.getOSGiServiceIdentifier();
	}

	@Override
	public mencoba2Service getWrappedService() {
		return _mencoba2Service;
	}

	@Override
	public void setWrappedService(mencoba2Service mencoba2Service) {
		_mencoba2Service = mencoba2Service;
	}

	private mencoba2Service _mencoba2Service;
}