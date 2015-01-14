/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rockagen.gnext.service;

import com.rockagen.gnext.po.AuthUser;



/**
 * AuthUser Service interface
 * 
 * @author RA
 */
public interface AuthUserServ  extends QueryObjectGenericServ<AuthUser, Long>{

	
	/**
	 * Change the password
	 * @param po
	 */
	void passwd(final Long id,final String oldPass,final String newPass);
	
	
	/**
	 * Load by user account
	 * 
	 * @param account
	 *            primary key
	 * @return AuthUser
	 */
	AuthUser load(final String account);
	
	
}
