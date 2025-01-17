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
package com.ibm.ws.cdi12.test.war;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import componenttest.app.FATServlet;
import componenttest.custom.junit.runner.Mode;
import componenttest.custom.junit.runner.Mode.TestMode;

import org.junit.Test;

import com.ibm.ws.cdi12.test.common.lib.two.Parent;

@WebServlet("/")
public class CrossInjectionServlet extends FATServlet {
	
    @Inject Parent parent;

    @Test
    @Mode(TestMode.FULL)
    public void testCrossInjectionBetweenLibraries() {
        assertEquals(parent.getMessage(), "from injected bean");
    }
}

