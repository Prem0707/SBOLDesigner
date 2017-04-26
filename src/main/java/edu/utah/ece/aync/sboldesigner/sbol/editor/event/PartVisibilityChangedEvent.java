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

package edu.utah.ece.aync.sboldesigner.sbol.editor.event;

import edu.utah.ece.aync.sboldesigner.sbol.editor.Part;

/**
 * 
 * @author Evren Sirin
 */
public class PartVisibilityChangedEvent {
	private final Part part;
	private final boolean isVisible;

	public PartVisibilityChangedEvent(Part part, boolean isVisible) {
		super();
		this.part = part;
		this.isVisible = isVisible;
	}

	public Part getPart() {
		return part;
	}

	public boolean isVisible() {
		return isVisible;
	}
}