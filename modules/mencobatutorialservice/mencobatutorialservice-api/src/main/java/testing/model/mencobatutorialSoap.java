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
 * This class is used by SOAP remote services, specifically {@link testing.service.http.mencobatutorialServiceSoap}.
 *
 * @author Sukri
 * @see testing.service.http.mencobatutorialServiceSoap
 * @generated
 */
@ProviderType
public class mencobatutorialSoap implements Serializable {
	public static mencobatutorialSoap toSoapModel(mencobatutorial model) {
		mencobatutorialSoap soapModel = new mencobatutorialSoap();

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

	public static mencobatutorialSoap[] toSoapModels(mencobatutorial[] models) {
		mencobatutorialSoap[] soapModels = new mencobatutorialSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static mencobatutorialSoap[][] toSoapModels(
		mencobatutorial[][] models) {
		mencobatutorialSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new mencobatutorialSoap[models.length][models[0].length];
		}
		else {
			soapModels = new mencobatutorialSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static mencobatutorialSoap[] toSoapModels(
		List<mencobatutorial> models) {
		List<mencobatutorialSoap> soapModels = new ArrayList<mencobatutorialSoap>(models.size());

		for (mencobatutorial model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new mencobatutorialSoap[soapModels.size()]);
	}

	public mencobatutorialSoap() {
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