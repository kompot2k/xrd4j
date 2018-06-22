/**
 * The MIT License
 * Copyright © 2018 Nordic Institute for Interoperability Solutions (NIIS)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package fi.vrk.xrd4j.server.serializer;

import fi.vrk.xrd4j.common.message.ServiceRequest;
import fi.vrk.xrd4j.common.message.ServiceResponse;

import javax.xml.soap.SOAPMessage;

/**
 * This class defines an interface for serializing ServiceResponse objects
 * to SOAPMessage objects.
 *
 * @author Petteri Kivimäki
 */
@FunctionalInterface
public interface ServiceResponseSerializer {

    /**
     * Serializes the given ServiceResponse object to SOAPMessage object.
     * @param response ServiceResponse to be serialized
     * @param request ServiceRequest that initiated the service call
     * @return SOAPMessage representing the given ServiceRequest
     */
    SOAPMessage serialize(ServiceResponse response, ServiceRequest request);
}
