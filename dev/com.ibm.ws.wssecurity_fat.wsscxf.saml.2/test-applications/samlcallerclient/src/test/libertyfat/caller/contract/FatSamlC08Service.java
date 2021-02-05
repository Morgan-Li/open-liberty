/*******************************************************************************
 * Copyright (c) 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package test.libertyfat.caller.contract;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2015-09-08T11:23:15.414-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "FatSamlC08Service", 
                  wsdlLocation = "../../samlcallertoken/resources/WEB-INF/samlcallertoken.wsdl",
                  targetNamespace = "http://caller.libertyfat.test/contract") 
public class FatSamlC08Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://caller.libertyfat.test/contract", "FatSamlC08Service");
    public final static QName SamlCallerToken08 = new QName("http://caller.libertyfat.test/contract", "SamlCallerToken08");
    static {
        URL url = FatSamlC08Service.class.getResource("../../samlcallertoken/resources/WEB-INF/samlcallertoken.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(FatSamlC08Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "../../samlcallertoken/resources/WEB-INF/samlcallertoken.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public FatSamlC08Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FatSamlC08Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FatSamlC08Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FatSamlC08Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FatSamlC08Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FatSamlC08Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns FVTVersionSamlC
     */
    @WebEndpoint(name = "SamlCallerToken08")
    public FVTVersionSamlC getSamlCallerToken08() {
        return super.getPort(SamlCallerToken08, FVTVersionSamlC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FVTVersionSamlC
     */
    @WebEndpoint(name = "SamlCallerToken08")
    public FVTVersionSamlC getSamlCallerToken08(WebServiceFeature... features) {
        return super.getPort(SamlCallerToken08, FVTVersionSamlC.class, features);
    }

}