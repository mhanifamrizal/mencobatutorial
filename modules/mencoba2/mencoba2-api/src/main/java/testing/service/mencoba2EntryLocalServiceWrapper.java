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
 * Provides a wrapper for {@link mencoba2EntryLocalService}.
 *
 * @author sukri
 * @see mencoba2EntryLocalService
 * @generated
 */
@ProviderType
public class mencoba2EntryLocalServiceWrapper
	implements mencoba2EntryLocalService,
		ServiceWrapper<mencoba2EntryLocalService> {
	public mencoba2EntryLocalServiceWrapper(
		mencoba2EntryLocalService mencoba2EntryLocalService) {
		_mencoba2EntryLocalService = mencoba2EntryLocalService;
	}

	/**
	* Adds the mencoba2 entry to the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2Entry the mencoba2 entry
	* @return the mencoba2 entry that was added
	*/
	@Override
	public testing.model.mencoba2Entry addmencoba2Entry(
		testing.model.mencoba2Entry mencoba2Entry) {
		return _mencoba2EntryLocalService.addmencoba2Entry(mencoba2Entry);
	}

	/**
	* Creates a new mencoba2 entry with the primary key. Does not add the mencoba2 entry to the database.
	*
	* @param entryId the primary key for the new mencoba2 entry
	* @return the new mencoba2 entry
	*/
	@Override
	public testing.model.mencoba2Entry createmencoba2Entry(long entryId) {
		return _mencoba2EntryLocalService.createmencoba2Entry(entryId);
	}

	/**
	* Deletes the mencoba2 entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry that was removed
	* @throws PortalException if a mencoba2 entry with the primary key could not be found
	*/
	@Override
	public testing.model.mencoba2Entry deletemencoba2Entry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2EntryLocalService.deletemencoba2Entry(entryId);
	}

	/**
	* Deletes the mencoba2 entry from the database. Also notifies the appropriate model listeners.
	*
	* @param mencoba2Entry the mencoba2 entry
	* @return the mencoba2 entry that was removed
	*/
	@Override
	public testing.model.mencoba2Entry deletemencoba2Entry(
		testing.model.mencoba2Entry mencoba2Entry) {
		return _mencoba2EntryLocalService.deletemencoba2Entry(mencoba2Entry);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2EntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mencoba2EntryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _mencoba2EntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _mencoba2EntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _mencoba2EntryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _mencoba2EntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _mencoba2EntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public testing.model.mencoba2Entry fetchmencoba2Entry(long entryId) {
		return _mencoba2EntryLocalService.fetchmencoba2Entry(entryId);
	}

	/**
	* Returns the mencoba2 entry matching the UUID and group.
	*
	* @param uuid the mencoba2 entry's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2 entry, or <code>null</code> if a matching mencoba2 entry could not be found
	*/
	@Override
	public testing.model.mencoba2Entry fetchmencoba2EntryByUuidAndGroupId(
		String uuid, long groupId) {
		return _mencoba2EntryLocalService.fetchmencoba2EntryByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _mencoba2EntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _mencoba2EntryLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _mencoba2EntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns a range of all the mencoba2 entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link testing.model.impl.mencoba2EntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @return the range of mencoba2 entries
	*/
	@Override
	public java.util.List<testing.model.mencoba2Entry> getmencoba2Entries(
		int start, int end) {
		return _mencoba2EntryLocalService.getmencoba2Entries(start, end);
	}

	/**
	* Returns all the mencoba2 entries matching the UUID and company.
	*
	* @param uuid the UUID of the mencoba2 entries
	* @param companyId the primary key of the company
	* @return the matching mencoba2 entries, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<testing.model.mencoba2Entry> getmencoba2EntriesByUuidAndCompanyId(
		String uuid, long companyId) {
		return _mencoba2EntryLocalService.getmencoba2EntriesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of mencoba2 entries matching the UUID and company.
	*
	* @param uuid the UUID of the mencoba2 entries
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of mencoba2 entries
	* @param end the upper bound of the range of mencoba2 entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching mencoba2 entries, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<testing.model.mencoba2Entry> getmencoba2EntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<testing.model.mencoba2Entry> orderByComparator) {
		return _mencoba2EntryLocalService.getmencoba2EntriesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of mencoba2 entries.
	*
	* @return the number of mencoba2 entries
	*/
	@Override
	public int getmencoba2EntriesCount() {
		return _mencoba2EntryLocalService.getmencoba2EntriesCount();
	}

	/**
	* Returns the mencoba2 entry with the primary key.
	*
	* @param entryId the primary key of the mencoba2 entry
	* @return the mencoba2 entry
	* @throws PortalException if a mencoba2 entry with the primary key could not be found
	*/
	@Override
	public testing.model.mencoba2Entry getmencoba2Entry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2EntryLocalService.getmencoba2Entry(entryId);
	}

	/**
	* Returns the mencoba2 entry matching the UUID and group.
	*
	* @param uuid the mencoba2 entry's UUID
	* @param groupId the primary key of the group
	* @return the matching mencoba2 entry
	* @throws PortalException if a matching mencoba2 entry could not be found
	*/
	@Override
	public testing.model.mencoba2Entry getmencoba2EntryByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2EntryLocalService.getmencoba2EntryByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _mencoba2EntryLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mencoba2EntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the mencoba2 entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencoba2Entry the mencoba2 entry
	* @return the mencoba2 entry that was updated
	*/
	@Override
	public testing.model.mencoba2Entry updatemencoba2Entry(
		testing.model.mencoba2Entry mencoba2Entry) {
		return _mencoba2EntryLocalService.updatemencoba2Entry(mencoba2Entry);
	}

	@Override
	public mencoba2EntryLocalService getWrappedService() {
		return _mencoba2EntryLocalService;
	}

	@Override
	public void setWrappedService(
		mencoba2EntryLocalService mencoba2EntryLocalService) {
		_mencoba2EntryLocalService = mencoba2EntryLocalService;
	}

	private mencoba2EntryLocalService _mencoba2EntryLocalService;
}