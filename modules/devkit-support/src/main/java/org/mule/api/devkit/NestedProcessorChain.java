/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.api.devkit;

import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;

/***
 * Deprecated since Mule 3.6.0. Please use {@link org.mule.extensions.spi.NestedProcessorChain}
 * instead. This class will be removed in Mule 4
 */
@Deprecated
public class NestedProcessorChain extends org.mule.extensions.spi.NestedProcessorChain
{

    public NestedProcessorChain(MuleEvent event, MuleContext muleContext, MessageProcessor chain)
    {
        super(event, muleContext, chain);
    }
}
