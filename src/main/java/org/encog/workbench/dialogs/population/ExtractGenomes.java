/*
 * Encog(tm) Workbench v2.6 
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2010 Heaton Research, Inc.
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
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.workbench.dialogs.population;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import org.encog.neural.data.NeuralDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.workbench.dialogs.common.ComboBoxField;
import org.encog.workbench.dialogs.common.EncogPropertiesDialog;
import org.encog.workbench.dialogs.common.IntegerField;
import org.encog.workbench.dialogs.common.TextField;

public class ExtractGenomes extends EncogPropertiesDialog {
		
	private final IntegerField genomesToExtract;
	private final TextField prefix;
	
	public ExtractGenomes(Frame owner, int populationSize) {
		super(owner);

		setTitle("Extract Top Genomes");
		setSize(400,200);
		setLocation(200,200);
		
		addProperty(this.genomesToExtract = new IntegerField("genomes to extract", "Genomes to Extract", true, 0 , populationSize));
		addProperty(this.prefix = new TextField("prefix","Neural Network Prefix",true));
		
		render();
		this.prefix.setValue("network-");
		this.genomesToExtract.setValue(1);
	}
	
	public IntegerField getGenomesToExtract() {
		return genomesToExtract;
	}

	public TextField getPrefix() {
		return prefix;
	}
}
