/*
 * Copyright 2017 NAVER Corp.
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

package com.navercorp.pinpoint.plugin.hikaricp;

import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

/**
 * @author Taejin Koo
 */
public final class HikariCpConstants {

    public static final String SCOPE = "HIKARICP_SCOPE";
    public static final String SCOPE_DEPRECATED = "DEPRECATED_HIKARICP_SCOPE";

    public static final ServiceType SERVICE_TYPE = ServiceTypeFactory.of(6060, "HIKARICP");

    public static final String ACCESSOR_DATASOURCE_MONITOR = "com.navercorp.pinpoint.plugin.hikaricp.DataSourceMonitorAccessor";

    public static final String INTERCEPTOR_BASIC = "com.navercorp.pinpoint.bootstrap.interceptor.BasicMethodInterceptor";

    public static final String INTERCEPTOR_CONSTRUCTOR = "com.navercorp.pinpoint.plugin.hikaricp.interceptor.DataSourceConstructorInterceptor";
    public static final String INTERCEPTOR_CLOSE = "com.navercorp.pinpoint.plugin.hikaricp.interceptor.DataSourceCloseInterceptor";

    public static final String INTERCEPTOR_GET_CONNECTION = "com.navercorp.pinpoint.plugin.hikaricp.interceptor.DataSourceGetConnectionInterceptor";
    public static final String INTERCEPTOR_CLOSE_CONNECTION = "com.navercorp.pinpoint.plugin.hikaricp.interceptor.DataSourceCloseConnectionInterceptor";

}
