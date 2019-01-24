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

package testing.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import testing.model.mencoba2Entry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing mencoba2Entry in entity cache.
 *
 * @author sukri
 * @see mencoba2Entry
 * @generated
 */
@ProviderType
public class mencoba2EntryCacheModel implements CacheModel<mencoba2Entry>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mencoba2EntryCacheModel)) {
			return false;
		}

		mencoba2EntryCacheModel mencoba2EntryCacheModel = (mencoba2EntryCacheModel)obj;

		if (entryId == mencoba2EntryCacheModel.entryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, entryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", message=");
		sb.append(message);
		sb.append(", guestbookId=");
		sb.append(guestbookId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public mencoba2Entry toEntityModel() {
		mencoba2EntryImpl mencoba2EntryImpl = new mencoba2EntryImpl();

		if (uuid == null) {
			mencoba2EntryImpl.setUuid("");
		}
		else {
			mencoba2EntryImpl.setUuid(uuid);
		}

		mencoba2EntryImpl.setEntryId(entryId);
		mencoba2EntryImpl.setGroupId(groupId);
		mencoba2EntryImpl.setCompanyId(companyId);
		mencoba2EntryImpl.setUserId(userId);

		if (userName == null) {
			mencoba2EntryImpl.setUserName("");
		}
		else {
			mencoba2EntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			mencoba2EntryImpl.setCreateDate(null);
		}
		else {
			mencoba2EntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			mencoba2EntryImpl.setModifiedDate(null);
		}
		else {
			mencoba2EntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		mencoba2EntryImpl.setStatus(status);
		mencoba2EntryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			mencoba2EntryImpl.setStatusByUserName("");
		}
		else {
			mencoba2EntryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			mencoba2EntryImpl.setStatusDate(null);
		}
		else {
			mencoba2EntryImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			mencoba2EntryImpl.setName("");
		}
		else {
			mencoba2EntryImpl.setName(name);
		}

		if (email == null) {
			mencoba2EntryImpl.setEmail("");
		}
		else {
			mencoba2EntryImpl.setEmail(email);
		}

		if (message == null) {
			mencoba2EntryImpl.setMessage("");
		}
		else {
			mencoba2EntryImpl.setMessage(message);
		}

		mencoba2EntryImpl.setGuestbookId(guestbookId);

		mencoba2EntryImpl.resetOriginalValues();

		return mencoba2EntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		entryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		message = objectInput.readUTF();

		guestbookId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(entryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}

		objectOutput.writeLong(guestbookId);
	}

	public String uuid;
	public long entryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String email;
	public String message;
	public long guestbookId;
}