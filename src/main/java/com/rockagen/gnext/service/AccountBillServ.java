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
package com.rockagen.gnext.service;


import com.rockagen.gnext.po.AccountBill;

import java.util.List;

/**
 * Account bill Service interface
 *
 * @author ra
 * @since JDK1.8
 */
public interface AccountBillServ extends QueryObjectGenericServ<AccountBill, Long> {

    /**
     * Load by account id
     *
     * @param accountId account id
     * @return AccountBill list
     */
    List<AccountBill> loadListByAccount(long accountId);
}
