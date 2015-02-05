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
package com.rockagen.gnext.exception;


import com.rockagen.gnext.enums.ErrorType;

/**
 * Register exception
 * @author ra
 * @since JDK1.8
 */
public class RegisterException extends SystemException {

    private final static ErrorType ERROR_TYPE=ErrorType.REG0001;

    
    public RegisterException(ErrorType msg, Throwable t) {
        super(msg, t);
    }

    public RegisterException(ErrorType msg) {
        super(msg);
    }
    
    public RegisterException(){
        super(ERROR_TYPE);
    }
}
