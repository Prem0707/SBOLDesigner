/*
 * Copyright (c) 2012 - 2015, Clark & Parsia, LLC. <http://www.clarkparsia.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clarkparsia.sbol.editor.dialog;

import java.util.List;

import org.sbolstandard.core2.ComponentDefinition;

import com.clarkparsia.swing.AbstractListTableModel;

class ComponentDefinitionTableModel extends AbstractListTableModel<ComponentDefinition> {
	private static final String[] COLUMNS = { "Display Id", "Name", "Version", "Description" };
	private static final double[] WIDTHS = { 0.2, 0.2, 0.1, 0.5 };

	public ComponentDefinitionTableModel(List<ComponentDefinition> CDs) {
		super(CDs, COLUMNS, WIDTHS);
	}

	public Object getField(ComponentDefinition CD, int col) {
		switch (col) {
		case 0:
			return CD.getDisplayId();
		case 1:
			return CD.getName();
		case 2:
			return CD.getVersion();
		case 3:
			return CD.getDescription();
		default:
			throw new IndexOutOfBoundsException();
		}
	}
}