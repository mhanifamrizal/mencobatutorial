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

package testing.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link testing.service.http.mencoba2ServiceSoap}.
 *
 * @author sukri
 * @see testing.service.http.mencoba2ServiceSoap
 * @generated
 */
@ProviderType
public class mencoba2Soap implements Serializable {
	public static mencoba2Soap toSoapModel(mencoba2 model) {
		mencoba2Soap soapModel = new mencoba2Soap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGuestbookId(model.getGuestbookId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static mencoba2Soap[] toSoapModels(mencoba2[] models) {
		mencoba2Soap[] soapModels = new mencoba2Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static mencoba2Soap[][] toSoapModels(mencoba2[][] models) {
		mencoba2Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new mencoba2Soap[models.length][models[0].length];
		}
		else {
			soapModels = new mencoba2Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static mencoba2Soap[] toSoapModels(List<mencoba2> models) {
		List<mencoba2Soap> soapModels = new ArrayList<mencoba2Soap>(models.size());

		for (mencoba2 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new mencoba2Soap[soapModels.size()]);
	}

	public mencoba2Soap() {
	}

	public long getPrimaryKey() {
		return _guestbookId;
	}

	public void setPrimaryKey(long pk) {
		setGuestbookId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getGuestbookId() {
		return _guestbookId;
	}

	public void setGuestbookId(long guestbookId) {
		_guestbookId = guestbookId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private String _uuid;
	private long _guestbookId;
	private long _groupId;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;
}