/*
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/**
 *
 * <P>This document describes the architecture of JAX-WS 2.0 runtime. JAX-WS is
 * the aggregating component of what is called the integrated Stack
 * (I-Stack). The I-Stack consists of JAX-WS, JAX-B, StAX, SAAJ and Fast
 * Infoset. JAX-B is the databinding component of the stack. StAX is the
 * Streaming XML parser used by the stack. SAAJ is used for its
 * attachment support with SOAP messages and to allow handler developers
 * to gain access to the SOAP message via a standard interface. Fast
 * Infoset is a binary encoding of XML that can improve performance.</P>
 * <P>The remainder of this document will describe the JAX-WS runtime
 * architecture from the client and server perspectives.</P>
 *
 * <p>
 * <dl>
 *  <dt>{@link com.sun.xml.internal.ws.server Server}
 *  <dd>
 *    The server side portion of the JAX-WS runtime.
 *
 *  <dt>{@link com.sun.xml.internal.ws.client Client}
 *  <dd>
 *    The client side portion of the JAX-WS runtime.
 *
 * </dl>
 *
 * @ArchitectureDocument
 **/
package com.sun.xml.internal.ws;

//import javax.xml.ws.Binding;
