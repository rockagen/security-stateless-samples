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
package com.rockagen.gnext.service.spring;

import com.rockagen.gnext.po.AuthGroup;
import com.rockagen.gnext.service.AuthGroupServ;
import org.springframework.stereotype.Service;

/**
 * Implementation of the <code>AuthGroupServ</code> interface
 * @author RA
 */
@Service("authGroupServ")
public class AuthGroupServImpl extends QueryObjectGenericServImpl<AuthGroup, Long> implements AuthGroupServ {
}
