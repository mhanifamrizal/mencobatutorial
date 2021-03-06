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

package testing.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import testing.model.mencoba2;

import testing.service.mencoba2Service;

import testing.service.persistence.mencoba2EntryPersistence;
import testing.service.persistence.mencoba2Persistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the mencoba2 remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link testing.service.impl.mencoba2ServiceImpl}.
 * </p>
 *
 * @author sukri
 * @see testing.service.impl.mencoba2ServiceImpl
 * @see testing.service.mencoba2ServiceUtil
 * @generated
 */
public abstract class mencoba2ServiceBaseImpl extends BaseServiceImpl
	implements mencoba2Service, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link testing.service.mencoba2ServiceUtil} to access the mencoba2 remote service.
	 */

	/**
	 * Returns the mencoba2 local service.
	 *
	 * @return the mencoba2 local service
	 */
	public testing.service.mencoba2LocalService getmencoba2LocalService() {
		return mencoba2LocalService;
	}

	/**
	 * Sets the mencoba2 local service.
	 *
	 * @param mencoba2LocalService the mencoba2 local service
	 */
	public void setmencoba2LocalService(
		testing.service.mencoba2LocalService mencoba2LocalService) {
		this.mencoba2LocalService = mencoba2LocalService;
	}

	/**
	 * Returns the mencoba2 remote service.
	 *
	 * @return the mencoba2 remote service
	 */
	public mencoba2Service getmencoba2Service() {
		return mencoba2Service;
	}

	/**
	 * Sets the mencoba2 remote service.
	 *
	 * @param mencoba2Service the mencoba2 remote service
	 */
	public void setmencoba2Service(mencoba2Service mencoba2Service) {
		this.mencoba2Service = mencoba2Service;
	}

	/**
	 * Returns the mencoba2 persistence.
	 *
	 * @return the mencoba2 persistence
	 */
	public mencoba2Persistence getmencoba2Persistence() {
		return mencoba2Persistence;
	}

	/**
	 * Sets the mencoba2 persistence.
	 *
	 * @param mencoba2Persistence the mencoba2 persistence
	 */
	public void setmencoba2Persistence(mencoba2Persistence mencoba2Persistence) {
		this.mencoba2Persistence = mencoba2Persistence;
	}

	/**
	 * Returns the mencoba2 entry local service.
	 *
	 * @return the mencoba2 entry local service
	 */
	public testing.service.mencoba2EntryLocalService getmencoba2EntryLocalService() {
		return mencoba2EntryLocalService;
	}

	/**
	 * Sets the mencoba2 entry local service.
	 *
	 * @param mencoba2EntryLocalService the mencoba2 entry local service
	 */
	public void setmencoba2EntryLocalService(
		testing.service.mencoba2EntryLocalService mencoba2EntryLocalService) {
		this.mencoba2EntryLocalService = mencoba2EntryLocalService;
	}

	/**
	 * Returns the mencoba2 entry remote service.
	 *
	 * @return the mencoba2 entry remote service
	 */
	public testing.service.mencoba2EntryService getmencoba2EntryService() {
		return mencoba2EntryService;
	}

	/**
	 * Sets the mencoba2 entry remote service.
	 *
	 * @param mencoba2EntryService the mencoba2 entry remote service
	 */
	public void setmencoba2EntryService(
		testing.service.mencoba2EntryService mencoba2EntryService) {
		this.mencoba2EntryService = mencoba2EntryService;
	}

	/**
	 * Returns the mencoba2 entry persistence.
	 *
	 * @return the mencoba2 entry persistence
	 */
	public mencoba2EntryPersistence getmencoba2EntryPersistence() {
		return mencoba2EntryPersistence;
	}

	/**
	 * Sets the mencoba2 entry persistence.
	 *
	 * @param mencoba2EntryPersistence the mencoba2 entry persistence
	 */
	public void setmencoba2EntryPersistence(
		mencoba2EntryPersistence mencoba2EntryPersistence) {
		this.mencoba2EntryPersistence = mencoba2EntryPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return mencoba2Service.class.getName();
	}

	protected Class<?> getModelClass() {
		return mencoba2.class;
	}

	protected String getModelClassName() {
		return mencoba2.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = mencoba2Persistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = testing.service.mencoba2LocalService.class)
	protected testing.service.mencoba2LocalService mencoba2LocalService;
	@BeanReference(type = mencoba2Service.class)
	protected mencoba2Service mencoba2Service;
	@BeanReference(type = mencoba2Persistence.class)
	protected mencoba2Persistence mencoba2Persistence;
	@BeanReference(type = testing.service.mencoba2EntryLocalService.class)
	protected testing.service.mencoba2EntryLocalService mencoba2EntryLocalService;
	@BeanReference(type = testing.service.mencoba2EntryService.class)
	protected testing.service.mencoba2EntryService mencoba2EntryService;
	@BeanReference(type = mencoba2EntryPersistence.class)
	protected mencoba2EntryPersistence mencoba2EntryPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}