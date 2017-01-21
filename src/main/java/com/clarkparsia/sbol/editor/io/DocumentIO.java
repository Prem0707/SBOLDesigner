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

package com.clarkparsia.sbol.editor.io;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.sbolstandard.core2.SBOLConversionException;
import org.sbolstandard.core2.SBOLDocument;
import org.sbolstandard.core2.SBOLValidationException;

/**
 * 
 * @author Evren Sirin
 */
public interface DocumentIO {
	public SBOLDocument read() throws SBOLValidationException, IOException, SBOLConversionException;

	public void write(SBOLDocument document)
			throws SBOLValidationException, FileNotFoundException, SBOLConversionException, IOException;
}
