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

import testing.model.mencoba2Entry;

import testing.service.mencoba2EntryLocalServiceUtil;

/**
 * The extended model base implementation for the mencoba2Entry service. Represents a row in the &quot;S_mencoba2Entry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link mencoba2EntryImpl}.
 * </p>
 *
 * @author sukri
 * @see mencoba2EntryImpl
 * @see mencoba2Entry
 * @generated
 */
@ProviderType
public abstract class mencoba2EntryBaseImpl extends mencoba2EntryModelImpl
	implements mencoba2Entry {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mencoba2 entry model instance should use the {@link mencoba2Entry} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			mencoba2EntryLocalServiceUtil.addmencoba2Entry(this);
		}
		else {
			mencoba2EntryLocalServiceUtil.updatemencoba2Entry(this);
		}
	}
}