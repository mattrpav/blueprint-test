/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mediadriver.osgi.blueprint.test;

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/**
 * A class resolver for loading classes in a loosly coupled manner to cater for different platforms such
 * as standalone, web container, j2ee container and OSGi platforms.
 */
public interface ClassResolver {

   
    /**
     * Loads the given resource as a stream
     *
     * @param uri the uri of the resource
     * @return as a stream
     */
    InputStream loadResourceAsStream(String uri);

    /**
     * Loads the given resource as a URL
     *
     * @param uri the uri of the resource
     * @return as a URL
     */
    URL loadResourceAsURL(String uri);

    /**
     * Loads the given resources as a URL from the current bundle/classloader
     *
     * @param uri the uri of the resource
     * @return the URLs found on the classpath
     */
    Enumeration<URL> loadResourcesAsURL(String uri);

    /**
     * Loads the given resources as a URL from all bundles/classloaders
     *
     * @param uri the uri of the resource
     * @return the URLs found on the classpath
     */
    Enumeration<URL> loadAllResourcesAsURL(String uri);
}