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

package edu.utah.ece.async.sboldesigner.sbol.editor.event;

import org.sbolstandard.core2.ComponentDefinition;

import edu.utah.ece.async.sboldesigner.sbol.editor.SBOLDesign;

/**
 * 
 * @author Evren Sirin
 */
public class FocusOutEvent {
	private final SBOLDesign design;
	private final ComponentDefinition component;

	public FocusOutEvent(SBOLDesign design, ComponentDefinition component) {
		this.design = design;
		this.component = component;
	}

	public SBOLDesign getDesign() {
		return design;
	}
	
	public ComponentDefinition getComponent() {
		return component;
	}
}
