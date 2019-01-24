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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link mencoba2Entry}.
 * </p>
 *
 * @author sukri
 * @see mencoba2Entry
 * @generated
 */
@ProviderType
public class mencoba2EntryWrapper implements mencoba2Entry,
	ModelWrapper<mencoba2Entry> {
	public mencoba2EntryWrapper(mencoba2Entry mencoba2Entry) {
		_mencoba2Entry = mencoba2Entry;
	}

	@Override
	public Class<?> getModelClass() {
		return mencoba2Entry.class;
	}

	@Override
	public String getModelClassName() {
		return mencoba2Entry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());
		attributes.put("guestbookId", getGuestbookId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
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

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}
	}

	@Override
	public Object clone() {
		return new mencoba2EntryWrapper((mencoba2Entry)_mencoba2Entry.clone());
	}

	@Override
	public int compareTo(testing.model.mencoba2Entry mencoba2Entry) {
		return _mencoba2Entry.compareTo(mencoba2Entry);
	}

	/**
	* Returns the company ID of this mencoba2 entry.
	*
	* @return the company ID of this mencoba2 entry
	*/
	@Override
	public long getCompanyId() {
		return _mencoba2Entry.getCompanyId();
	}

	/**
	* Returns the create date of this mencoba2 entry.
	*
	* @return the create date of this mencoba2 entry
	*/
	@Override
	public Date getCreateDate() {
		return _mencoba2Entry.getCreateDate();
	}

	/**
	* Returns the email of this mencoba2 entry.
	*
	* @return the email of this mencoba2 entry
	*/
	@Override
	public String getEmail() {
		return _mencoba2Entry.getEmail();
	}

	/**
	* Returns the entry ID of this mencoba2 entry.
	*
	* @return the entry ID of this mencoba2 entry
	*/
	@Override
	public long getEntryId() {
		return _mencoba2Entry.getEntryId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _mencoba2Entry.getExpandoBridge();
	}

	/**
	* Returns the group ID of this mencoba2 entry.
	*
	* @return the group ID of this mencoba2 entry
	*/
	@Override
	public long getGroupId() {
		return _mencoba2Entry.getGroupId();
	}

	/**
	* Returns the guestbook ID of this mencoba2 entry.
	*
	* @return the guestbook ID of this mencoba2 entry
	*/
	@Override
	public long getGuestbookId() {
		return _mencoba2Entry.getGuestbookId();
	}

	/**
	* Returns the message of this mencoba2 entry.
	*
	* @return the message of this mencoba2 entry
	*/
	@Override
	public String getMessage() {
		return _mencoba2Entry.getMessage();
	}

	/**
	* Returns the modified date of this mencoba2 entry.
	*
	* @return the modified date of this mencoba2 entry
	*/
	@Override
	public Date getModifiedDate() {
		return _mencoba2Entry.getModifiedDate();
	}

	/**
	* Returns the name of this mencoba2 entry.
	*
	* @return the name of this mencoba2 entry
	*/
	@Override
	public String getName() {
		return _mencoba2Entry.getName();
	}

	/**
	* Returns the primary key of this mencoba2 entry.
	*
	* @return the primary key of this mencoba2 entry
	*/
	@Override
	public long getPrimaryKey() {
		return _mencoba2Entry.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mencoba2Entry.getPrimaryKeyObj();
	}

	/**
	* Returns the status of this mencoba2 entry.
	*
	* @return the status of this mencoba2 entry
	*/
	@Override
	public int getStatus() {
		return _mencoba2Entry.getStatus();
	}

	/**
	* Returns the status by user ID of this mencoba2 entry.
	*
	* @return the status by user ID of this mencoba2 entry
	*/
	@Override
	public long getStatusByUserId() {
		return _mencoba2Entry.getStatusByUserId();
	}

	/**
	* Returns the status by user name of this mencoba2 entry.
	*
	* @return the status by user name of this mencoba2 entry
	*/
	@Override
	public String getStatusByUserName() {
		return _mencoba2Entry.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this mencoba2 entry.
	*
	* @return the status by user uuid of this mencoba2 entry
	*/
	@Override
	public String getStatusByUserUuid() {
		return _mencoba2Entry.getStatusByUserUuid();
	}

	/**
	* Returns the status date of this mencoba2 entry.
	*
	* @return the status date of this mencoba2 entry
	*/
	@Override
	public Date getStatusDate() {
		return _mencoba2Entry.getStatusDate();
	}

	/**
	* Returns the user ID of this mencoba2 entry.
	*
	* @return the user ID of this mencoba2 entry
	*/
	@Override
	public long getUserId() {
		return _mencoba2Entry.getUserId();
	}

	/**
	* Returns the user name of this mencoba2 entry.
	*
	* @return the user name of this mencoba2 entry
	*/
	@Override
	public String getUserName() {
		return _mencoba2Entry.getUserName();
	}

	/**
	* Returns the user uuid of this mencoba2 entry.
	*
	* @return the user uuid of this mencoba2 entry
	*/
	@Override
	public String getUserUuid() {
		return _mencoba2Entry.getUserUuid();
	}

	/**
	* Returns the uuid of this mencoba2 entry.
	*
	* @return the uuid of this mencoba2 entry
	*/
	@Override
	public String getUuid() {
		return _mencoba2Entry.getUuid();
	}

	@Override
	public int hashCode() {
		return _mencoba2Entry.hashCode();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is approved.
	*
	* @return <code>true</code> if this mencoba2 entry is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _mencoba2Entry.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _mencoba2Entry.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is denied.
	*
	* @return <code>true</code> if this mencoba2 entry is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _mencoba2Entry.isDenied();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is a draft.
	*
	* @return <code>true</code> if this mencoba2 entry is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _mencoba2Entry.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _mencoba2Entry.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is expired.
	*
	* @return <code>true</code> if this mencoba2 entry is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _mencoba2Entry.isExpired();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is inactive.
	*
	* @return <code>true</code> if this mencoba2 entry is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _mencoba2Entry.isInactive();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is incomplete.
	*
	* @return <code>true</code> if this mencoba2 entry is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _mencoba2Entry.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _mencoba2Entry.isNew();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is pending.
	*
	* @return <code>true</code> if this mencoba2 entry is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _mencoba2Entry.isPending();
	}

	/**
	* Returns <code>true</code> if this mencoba2 entry is scheduled.
	*
	* @return <code>true</code> if this mencoba2 entry is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _mencoba2Entry.isScheduled();
	}

	@Override
	public void persist() {
		_mencoba2Entry.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mencoba2Entry.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this mencoba2 entry.
	*
	* @param companyId the company ID of this mencoba2 entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_mencoba2Entry.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this mencoba2 entry.
	*
	* @param createDate the create date of this mencoba2 entry
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_mencoba2Entry.setCreateDate(createDate);
	}

	/**
	* Sets the email of this mencoba2 entry.
	*
	* @param email the email of this mencoba2 entry
	*/
	@Override
	public void setEmail(String email) {
		_mencoba2Entry.setEmail(email);
	}

	/**
	* Sets the entry ID of this mencoba2 entry.
	*
	* @param entryId the entry ID of this mencoba2 entry
	*/
	@Override
	public void setEntryId(long entryId) {
		_mencoba2Entry.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_mencoba2Entry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_mencoba2Entry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_mencoba2Entry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this mencoba2 entry.
	*
	* @param groupId the group ID of this mencoba2 entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_mencoba2Entry.setGroupId(groupId);
	}

	/**
	* Sets the guestbook ID of this mencoba2 entry.
	*
	* @param guestbookId the guestbook ID of this mencoba2 entry
	*/
	@Override
	public void setGuestbookId(long guestbookId) {
		_mencoba2Entry.setGuestbookId(guestbookId);
	}

	/**
	* Sets the message of this mencoba2 entry.
	*
	* @param message the message of this mencoba2 entry
	*/
	@Override
	public void setMessage(String message) {
		_mencoba2Entry.setMessage(message);
	}

	/**
	* Sets the modified date of this mencoba2 entry.
	*
	* @param modifiedDate the modified date of this mencoba2 entry
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_mencoba2Entry.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this mencoba2 entry.
	*
	* @param name the name of this mencoba2 entry
	*/
	@Override
	public void setName(String name) {
		_mencoba2Entry.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_mencoba2Entry.setNew(n);
	}

	/**
	* Sets the primary key of this mencoba2 entry.
	*
	* @param primaryKey the primary key of this mencoba2 entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mencoba2Entry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_mencoba2Entry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this mencoba2 entry.
	*
	* @param status the status of this mencoba2 entry
	*/
	@Override
	public void setStatus(int status) {
		_mencoba2Entry.setStatus(status);
	}

	/**
	* Sets the status by user ID of this mencoba2 entry.
	*
	* @param statusByUserId the status by user ID of this mencoba2 entry
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_mencoba2Entry.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this mencoba2 entry.
	*
	* @param statusByUserName the status by user name of this mencoba2 entry
	*/
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_mencoba2Entry.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this mencoba2 entry.
	*
	* @param statusByUserUuid the status by user uuid of this mencoba2 entry
	*/
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_mencoba2Entry.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this mencoba2 entry.
	*
	* @param statusDate the status date of this mencoba2 entry
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_mencoba2Entry.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this mencoba2 entry.
	*
	* @param userId the user ID of this mencoba2 entry
	*/
	@Override
	public void setUserId(long userId) {
		_mencoba2Entry.setUserId(userId);
	}

	/**
	* Sets the user name of this mencoba2 entry.
	*
	* @param userName the user name of this mencoba2 entry
	*/
	@Override
	public void setUserName(String userName) {
		_mencoba2Entry.setUserName(userName);
	}

	/**
	* Sets the user uuid of this mencoba2 entry.
	*
	* @param userUuid the user uuid of this mencoba2 entry
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_mencoba2Entry.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this mencoba2 entry.
	*
	* @param uuid the uuid of this mencoba2 entry
	*/
	@Override
	public void setUuid(String uuid) {
		_mencoba2Entry.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<testing.model.mencoba2Entry> toCacheModel() {
		return _mencoba2Entry.toCacheModel();
	}

	@Override
	public testing.model.mencoba2Entry toEscapedModel() {
		return new mencoba2EntryWrapper(_mencoba2Entry.toEscapedModel());
	}

	@Override
	public String toString() {
		return _mencoba2Entry.toString();
	}

	@Override
	public testing.model.mencoba2Entry toUnescapedModel() {
		return new mencoba2EntryWrapper(_mencoba2Entry.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _mencoba2Entry.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mencoba2EntryWrapper)) {
			return false;
		}

		mencoba2EntryWrapper mencoba2EntryWrapper = (mencoba2EntryWrapper)obj;

		if (Objects.equals(_mencoba2Entry, mencoba2EntryWrapper._mencoba2Entry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _mencoba2Entry.getStagedModelType();
	}

	@Override
	public mencoba2Entry getWrappedModel() {
		return _mencoba2Entry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _mencoba2Entry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _mencoba2Entry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_mencoba2Entry.resetOriginalValues();
	}

	private final mencoba2Entry _mencoba2Entry;
}