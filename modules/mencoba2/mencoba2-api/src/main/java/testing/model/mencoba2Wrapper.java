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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link mencoba2}.
 * </p>
 *
 * @author sukri
 * @see mencoba2
 * @generated
 */
@ProviderType
public class mencoba2Wrapper implements mencoba2, ModelWrapper<mencoba2> {
	public mencoba2Wrapper(mencoba2 mencoba2) {
		_mencoba2 = mencoba2;
	}

	@Override
	public Class<?> getModelClass() {
		return mencoba2.class;
	}

	@Override
	public String getModelClassName() {
		return mencoba2.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("guestbookId", getGuestbookId());
		attributes.put("groupId", getGroupId());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public Object clone() {
		return new mencoba2Wrapper((mencoba2)_mencoba2.clone());
	}

	@Override
	public int compareTo(testing.model.mencoba2 mencoba2) {
		return _mencoba2.compareTo(mencoba2);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _mencoba2.getExpandoBridge();
	}

	/**
	* Returns the group ID of this mencoba2.
	*
	* @return the group ID of this mencoba2
	*/
	@Override
	public long getGroupId() {
		return _mencoba2.getGroupId();
	}

	/**
	* Returns the guestbook ID of this mencoba2.
	*
	* @return the guestbook ID of this mencoba2
	*/
	@Override
	public long getGuestbookId() {
		return _mencoba2.getGuestbookId();
	}

	/**
	* Returns the name of this mencoba2.
	*
	* @return the name of this mencoba2
	*/
	@Override
	public String getName() {
		return _mencoba2.getName();
	}

	/**
	* Returns the primary key of this mencoba2.
	*
	* @return the primary key of this mencoba2
	*/
	@Override
	public long getPrimaryKey() {
		return _mencoba2.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mencoba2.getPrimaryKeyObj();
	}

	/**
	* Returns the status of this mencoba2.
	*
	* @return the status of this mencoba2
	*/
	@Override
	public int getStatus() {
		return _mencoba2.getStatus();
	}

	/**
	* Returns the status by user ID of this mencoba2.
	*
	* @return the status by user ID of this mencoba2
	*/
	@Override
	public long getStatusByUserId() {
		return _mencoba2.getStatusByUserId();
	}

	/**
	* Returns the status by user name of this mencoba2.
	*
	* @return the status by user name of this mencoba2
	*/
	@Override
	public String getStatusByUserName() {
		return _mencoba2.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this mencoba2.
	*
	* @return the status by user uuid of this mencoba2
	*/
	@Override
	public String getStatusByUserUuid() {
		return _mencoba2.getStatusByUserUuid();
	}

	/**
	* Returns the status date of this mencoba2.
	*
	* @return the status date of this mencoba2
	*/
	@Override
	public Date getStatusDate() {
		return _mencoba2.getStatusDate();
	}

	/**
	* Returns the uuid of this mencoba2.
	*
	* @return the uuid of this mencoba2
	*/
	@Override
	public String getUuid() {
		return _mencoba2.getUuid();
	}

	@Override
	public int hashCode() {
		return _mencoba2.hashCode();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is approved.
	*
	* @return <code>true</code> if this mencoba2 is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _mencoba2.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _mencoba2.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is denied.
	*
	* @return <code>true</code> if this mencoba2 is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _mencoba2.isDenied();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is a draft.
	*
	* @return <code>true</code> if this mencoba2 is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _mencoba2.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _mencoba2.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is expired.
	*
	* @return <code>true</code> if this mencoba2 is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _mencoba2.isExpired();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is inactive.
	*
	* @return <code>true</code> if this mencoba2 is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _mencoba2.isInactive();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is incomplete.
	*
	* @return <code>true</code> if this mencoba2 is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _mencoba2.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _mencoba2.isNew();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is pending.
	*
	* @return <code>true</code> if this mencoba2 is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _mencoba2.isPending();
	}

	/**
	* Returns <code>true</code> if this mencoba2 is scheduled.
	*
	* @return <code>true</code> if this mencoba2 is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _mencoba2.isScheduled();
	}

	@Override
	public void persist() {
		_mencoba2.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mencoba2.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_mencoba2.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_mencoba2.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_mencoba2.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this mencoba2.
	*
	* @param groupId the group ID of this mencoba2
	*/
	@Override
	public void setGroupId(long groupId) {
		_mencoba2.setGroupId(groupId);
	}

	/**
	* Sets the guestbook ID of this mencoba2.
	*
	* @param guestbookId the guestbook ID of this mencoba2
	*/
	@Override
	public void setGuestbookId(long guestbookId) {
		_mencoba2.setGuestbookId(guestbookId);
	}

	/**
	* Sets the name of this mencoba2.
	*
	* @param name the name of this mencoba2
	*/
	@Override
	public void setName(String name) {
		_mencoba2.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_mencoba2.setNew(n);
	}

	/**
	* Sets the primary key of this mencoba2.
	*
	* @param primaryKey the primary key of this mencoba2
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mencoba2.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_mencoba2.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this mencoba2.
	*
	* @param status the status of this mencoba2
	*/
	@Override
	public void setStatus(int status) {
		_mencoba2.setStatus(status);
	}

	/**
	* Sets the status by user ID of this mencoba2.
	*
	* @param statusByUserId the status by user ID of this mencoba2
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_mencoba2.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this mencoba2.
	*
	* @param statusByUserName the status by user name of this mencoba2
	*/
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_mencoba2.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this mencoba2.
	*
	* @param statusByUserUuid the status by user uuid of this mencoba2
	*/
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_mencoba2.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this mencoba2.
	*
	* @param statusDate the status date of this mencoba2
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_mencoba2.setStatusDate(statusDate);
	}

	/**
	* Sets the uuid of this mencoba2.
	*
	* @param uuid the uuid of this mencoba2
	*/
	@Override
	public void setUuid(String uuid) {
		_mencoba2.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<testing.model.mencoba2> toCacheModel() {
		return _mencoba2.toCacheModel();
	}

	@Override
	public testing.model.mencoba2 toEscapedModel() {
		return new mencoba2Wrapper(_mencoba2.toEscapedModel());
	}

	@Override
	public String toString() {
		return _mencoba2.toString();
	}

	@Override
	public testing.model.mencoba2 toUnescapedModel() {
		return new mencoba2Wrapper(_mencoba2.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _mencoba2.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mencoba2Wrapper)) {
			return false;
		}

		mencoba2Wrapper mencoba2Wrapper = (mencoba2Wrapper)obj;

		if (Objects.equals(_mencoba2, mencoba2Wrapper._mencoba2)) {
			return true;
		}

		return false;
	}

	@Override
	public mencoba2 getWrappedModel() {
		return _mencoba2;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _mencoba2.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _mencoba2.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_mencoba2.resetOriginalValues();
	}

	private final mencoba2 _mencoba2;
}