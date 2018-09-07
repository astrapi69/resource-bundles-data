/**
 * The MIT License
 *
 * Copyright (C) 2007 - 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.db.resource.bundles.service.api;

import de.alpharogroup.db.resource.bundles.domain.Language;
import de.alpharogroup.service.domain.DomainService;

/**
 * The domain service interface {@link LanguageService}
 */
public interface LanguageService extends DomainService<Integer, Language>
{

	/**
	 * Find the {@link Language} object from the name baseName and iso639Dash1.
	 *
	 * @param name
	 *            the name
	 * @param iso639Dash1
	 *            the specific code for the representation for the name of language
	 * 
	 * @return the found {@link Language} object or null if not.
	 */
	Language find(final String name, final String iso639Dash1);

	/**
	 * Find the {@link Language} object from the specific code of the language
	 *
	 * @param iso639Dash1
	 *            the specific code for the representation for the name of language
	 * @return the found {@link Language} object or null if not.
	 */
	Language findByIso639Dash1(final String iso639Dash1);

	/**
	 * Find the {@link Language} object from the name of the language
	 *
	 * @param name
	 *            the name of the language
	 * @return the found {@link Language} object or null if not.
	 */
	Language findByName(final String name);

}