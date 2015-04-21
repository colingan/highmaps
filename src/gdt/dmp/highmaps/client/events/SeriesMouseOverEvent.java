/*
 * Copyright 2011 Moxie Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gdt.dmp.highmaps.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Provides access to the raw information provided by Highcharts when a series mouse over event
 * occurs.  This class should  not be instantiated directly, but instead you should
 * create a {@link SeriesMouseOverEventHandler} and register it via the
 * {@link gdt.dmp.highmaps.client.plotOptions.SeriesPlotOptions#setSeriesMouseOverEventHandler(SeriesMouseOverEventHandler)}
 * method in order to access series mouse over events.
 *
 * @author squinn@moxiegroup.com (Shawn Quinn)
 * @since 1.1.0
 */
public class SeriesMouseOverEvent extends SeriesEvent {

    /**
     * This constructor is intended for internal use only.  You should not create mouse over events
     * directly, but instead should register a {@link SeriesMouseOverEventHandler}.
     *
     * @param event The native javascript object containing the details of the original event that was fired.
     * @param series The native javascript object that represents the series instance that the event was triggered on.
     */
    public SeriesMouseOverEvent(JavaScriptObject event, JavaScriptObject series) {
        super(event, series);
    }

}