/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi.internal.config;

import com.ibm.websphere.ras.Tr;
import com.ibm.websphere.ras.TraceComponent;

/**
 * An abstract class that overrides some methods related to the cdiEmptyBeansXMLExplicitBeanArchive property.
 * emptyBeansXMLExplicitBeanArchive is only supported on CDI 4.0 and above so this implementation outputs a warning
 * if it is set. This implementation of the emptyBeansXMLExplicitBeanArchive() method should never be called.
 */
public abstract class CDI12AggregatedConfiguration extends AggregatedConfiguration {
    private static final TraceComponent tc = Tr.register(CDI12AggregatedConfiguration.class);

    @Override
    public void setCdiConfig(Boolean enableImplicitBeanArchives, Boolean emptyBeansXMLExplicitBeanArchive) {
        if (tc.isWarningEnabled() && emptyBeansXMLExplicitBeanArchive != null) {
            //CWOWB1016W: The emptyBeansXMLExplicitBeanArchive attribute of the cdi configuration element is supported only on CDI 4.0 or newer. This attribute is ignored.
            Tr.warning(tc, "cdiEmptyBeansXMLExplicitBeanArchive.ignored.CWOWB1016W");
        }
        super.setCdiConfig(enableImplicitBeanArchives, null);
    }

    @Override
    public boolean emptyBeansXMLExplicitBeanArchive() {
        throw new UnsupportedOperationException();
    }
}
