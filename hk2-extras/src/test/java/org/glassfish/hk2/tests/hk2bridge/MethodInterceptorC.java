/*
 * Copyright (c) 2016, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.hk2.tests.hk2bridge;

import org.aopalliance.intercept.MethodInterceptor;
import org.glassfish.hk2.extras.interception.Interceptor;
import org.jvnet.hk2.annotations.ContractsProvided;
import org.jvnet.hk2.annotations.Service;

/**
 * @author jwells
 *
 */
@Service @Interceptor @ContractsProvided({MethodInterceptorC.class, MethodInterceptor.class})
@Binder
public class MethodInterceptorC extends BaseMethodInterceptor {
    public static final String C_INTERCEPTOR_ID = "C Interceptor";

    /* (non-Javadoc)
     * @see org.glassfish.hk2.tests.hk2bridge.BaseMethodInterceptor#getIdentifier()
     */
    @Override
    public String getIdentifier() {
        return C_INTERCEPTOR_ID;
    }
}
