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

package gdt.dmp.highmaps.client.plotOptions;

import gdt.dmp.highmaps.client.Chart;
import gdt.dmp.highmaps.client.Series;

/**
 * Represents the general plot options available for all scatter type series, which can be set either generically
 * on the chart via the {@link Chart#setScatterPlotOptions(ScatterPlotOptions)} )} method or directly on a
 * series via the {@link Series#setPlotOptions(PlotOptions)} method.
 * <p/>
 * Note that these options are only needed if you want to specifically control the general options
 * for all scatter type series in the entire chart.  If you instead want to control the options for all
 * series in the chart (not just those of a scatter type), then you can use the {@link SeriesPlotOptions}
 * class instead.  Or, if you want to control the plot options for just one series (and not all scatter type
 * series in the chart), use the {@link gdt.dmp.highmaps.client.Series#setPlotOptions(PlotOptions)} method.
 *
 * @author squinn@moxiegroup.com (Shawn Quinn)
 * @since 1.0.0
 */
public class ScatterPlotOptions extends PlotOptions<ScatterPlotOptions> {

    // TODO:

}

