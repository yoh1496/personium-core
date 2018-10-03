/**
 * personium.io
 * Modifications copyright 2018 FUJITSU LIMITED
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
 * --------------------------------------------------
 * This code is based on Remove.java of wink-webdav, and some modifications
 * for personium.io are applied by us.
 * --------------------------------------------------
 * The copyright and the license text of the original code is as follows:
 */
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2008.12.04 at 02:20:17 PM IST
//

package org.apache.wink.webdav.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The <code>remove</code> XML element per the WebDAV specification [RFC 4918]
 *
 * <pre>
 *    Name:       remove
 *    Namespace:  DAV:
 *    Purpose:    Lists the DAV properties to be removed from a resource.
 *    Description: Remove instructs that the properties specified in prop
 *    should be removed.  Specifying the removal of a property that does
 *    not exist is not an error.  All the XML elements in a prop XML
 *    element inside of a remove XML element MUST be empty, as only the
 *    names of properties to be removed are required.
 *
 *    &lt;!ELEMENT remove (prop) &gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"prop"})
@XmlRootElement(namespace = "DAV:", name = "remove")
public class Remove {

    @XmlElement(namespace = "DAV:", name = "prop", required = true)
    protected Prop prop;

    /**
     * Gets the value of the prop property.
     *
     * @return possible object is {@link Prop }
     */
    public Prop getProp() {
        return prop;
    }

    /**
     * Sets the value of the prop property.
     *
     * @param value allowed object is {@link Prop }
     */
    public void setProp(Prop value) {
        this.prop = value;
    }

}
