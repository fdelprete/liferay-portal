/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.SystemEvent;

/**
 * The persistence interface for the system event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SystemEventPersistenceImpl
 * @see SystemEventUtil
 * @generated
 */
@ProviderType
public interface SystemEventPersistence extends BasePersistence<SystemEvent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SystemEventUtil} to access the system event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the system events where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the system events where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @return the range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the system events where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system events before and after the current system event in the ordered set where groupId = &#63;.
	*
	* @param systemEventId the primary key of the current system event
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a system event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent[] findByGroupId_PrevAndNext(
		long systemEventId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the system events where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of system events where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the system events where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @return the matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_S(
		long groupId, long systemEventSetKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the system events where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @return the range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_S(
		long groupId, long systemEventSetKey, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the system events where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_S(
		long groupId, long systemEventSetKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByG_S_First(long groupId,
		long systemEventSetKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByG_S_First(long groupId,
		long systemEventSetKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByG_S_Last(long groupId,
		long systemEventSetKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByG_S_Last(long groupId,
		long systemEventSetKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system events before and after the current system event in the ordered set where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* @param systemEventId the primary key of the current system event
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a system event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent[] findByG_S_PrevAndNext(
		long systemEventId, long groupId, long systemEventSetKey,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the system events where groupId = &#63; and systemEventSetKey = &#63; from the database.
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, long systemEventSetKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of system events where groupId = &#63; and systemEventSetKey = &#63;.
	*
	* @param groupId the group ID
	* @param systemEventSetKey the system event set key
	* @return the number of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, long systemEventSetKey)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_C_C(
		long groupId, long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @return the range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_C_C(
		long groupId, long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_C_C(
		long groupId, long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByG_C_C_First(
		long groupId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByG_C_C_First(
		long groupId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByG_C_C_Last(long groupId,
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByG_C_C_Last(
		long groupId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system events before and after the current system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* @param systemEventId the primary key of the current system event
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a system event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent[] findByG_C_C_PrevAndNext(
		long systemEventId, long groupId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_C_C(long groupId, long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of system events where groupId = &#63; and classNameId = &#63; and classPK = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the number of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_C_C(long groupId, long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @return the matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_C_C_T(
		long groupId, long classNameId, long classPK, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @return the range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_C_C_T(
		long groupId, long classNameId, long classPK, int type, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findByG_C_C_T(
		long groupId, long classNameId, long classPK, int type, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByG_C_C_T_First(
		long groupId, long classNameId, long classPK, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByG_C_C_T_First(
		long groupId, long classNameId, long classPK, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByG_C_C_T_Last(
		long groupId, long classNameId, long classPK, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching system event, or <code>null</code> if a matching system event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByG_C_C_T_Last(
		long groupId, long classNameId, long classPK, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system events before and after the current system event in the ordered set where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* @param systemEventId the primary key of the current system event
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a system event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent[] findByG_C_C_T_PrevAndNext(
		long systemEventId, long groupId, long classNameId, long classPK,
		int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the system events where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63; from the database.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_C_C_T(long groupId, long classNameId, long classPK,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of system events where groupId = &#63; and classNameId = &#63; and classPK = &#63; and type = &#63;.
	*
	* @param groupId the group ID
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param type the type
	* @return the number of matching system events
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_C_C_T(long groupId, long classNameId, long classPK,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the system event in the entity cache if it is enabled.
	*
	* @param systemEvent the system event
	*/
	public void cacheResult(com.liferay.portal.model.SystemEvent systemEvent);

	/**
	* Caches the system events in the entity cache if it is enabled.
	*
	* @param systemEvents the system events
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.model.SystemEvent> systemEvents);

	/**
	* Creates a new system event with the primary key. Does not add the system event to the database.
	*
	* @param systemEventId the primary key for the new system event
	* @return the new system event
	*/
	public com.liferay.portal.model.SystemEvent create(long systemEventId);

	/**
	* Removes the system event with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param systemEventId the primary key of the system event
	* @return the system event that was removed
	* @throws com.liferay.portal.NoSuchSystemEventException if a system event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent remove(long systemEventId)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.SystemEvent updateImpl(
		com.liferay.portal.model.SystemEvent systemEvent)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system event with the primary key or throws a {@link com.liferay.portal.NoSuchSystemEventException} if it could not be found.
	*
	* @param systemEventId the primary key of the system event
	* @return the system event
	* @throws com.liferay.portal.NoSuchSystemEventException if a system event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent findByPrimaryKey(
		long systemEventId)
		throws com.liferay.portal.NoSuchSystemEventException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system event with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param systemEventId the primary key of the system event
	* @return the system event, or <code>null</code> if a system event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.SystemEvent fetchByPrimaryKey(
		long systemEventId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the system events.
	*
	* @return the system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the system events.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @return the range of system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the system events.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.SystemEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of system events
	* @param end the upper bound of the range of system events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of system events
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.SystemEvent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the system events from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of system events.
	*
	* @return the number of system events
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}