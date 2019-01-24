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
 * The extended model interface for the mencoba2 service. Represents a row in the &quot;S_mencoba2&quot; database table, with each column mapped to a property of this class.
 *
 * @author sukri
 * @see mencoba2Model
 * @see testing.model.impl.mencoba2Impl
 * @see testing.model.impl.mencoba2ModelImpl
 * @generated
 */
@ImplementationClassName("testing.model.impl.mencoba2Impl")
@ProviderType
public interface mencoba2 extends mencoba2Model, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link testing.model.impl.mencoba2Impl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<mencoba2, Long> GUESTBOOK_ID_ACCESSOR = new Accessor<mencoba2, Long>() {
			@Override
			public Long get(mencoba2 mencoba2) {
				return mencoba2.getGuestbookId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<mencoba2> getTypeClass() {
				return mencoba2.class;
			}
		};
}