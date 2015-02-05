/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rockagen.gnext.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/**
 * Hibernate4 GenericDao Support interface
 * 
 * @author RA
 * @see GenericDao
 */
public interface Hibernate4GenericDao<E, PK extends Serializable> extends
		GenericDao<E, PK> {

	/**
	 * Criteria Query
	 * 
	 * @param dcriteria
	 *            DetachedCriteria
	 * @param start
	 * @param count
	 * @return list
	 */
	List<?> queryByCriteria(final DetachedCriteria dcriteria,
			final int start, final int count);

	/**
	 * Criteria Query
	 * 
	 * @param dcriteria
	 *            DetachedCriteria
	 * @return list
	 */
	List<?> queryByCriteria(final DetachedCriteria dcriteria);
}
