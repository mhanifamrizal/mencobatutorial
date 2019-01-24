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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the mencoba2Entry service. Represents a row in the &quot;S_mencoba2Entry&quot; database table, with each column mapped to a property of this class.
 *
 * @author sukri
 * @see mencoba2EntryModel
 * @see testing.model.impl.mencoba2EntryImpl
 * @see testing.model.impl.mencoba2EntryModelImpl
 * @generated
 */
@ImplementationClassName("testing.model.impl.mencoba2EntryImpl")
@ProviderType
public interface mencoba2Entry extends mencoba2EntryModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link testing.model.impl.mencoba2EntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<mencoba2Entry, Long> ENTRY_ID_ACCESSOR = new Accessor<mencoba2Entry, Long>() {
			@Override
			public Long get(mencoba2Entry mencoba2Entry) {
				return mencoba2Entry.getEntryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<mencoba2Entry> getTypeClass() {
				return mencoba2Entry.class;
			}
		};
}