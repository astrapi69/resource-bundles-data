/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
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
package de.alpharogroup.db.resource.bundles.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import de.alpharogroup.db.entity.name.unique.ExtraLargeUNameBaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity class for saving in database applications with the corresponding {@link BundleNames}.
 */
@Entity
@Table(name = "bundle_applications")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BundleApplications extends ExtraLargeUNameBaseEntity<Integer> implements Cloneable
{

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** The bundle names of this application. */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "bundle_application_bundlenames", joinColumns = {
			@JoinColumn(name = "application_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "bundlenames_id", referencedColumnName = "id") })
	private Set<BundleNames> bundleNames = new HashSet<>();

	/** The default locale of this bundle application. */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "default_locale_id", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_BUNDLE_APPLICATIONS_DEFAULT_LOCALE_ID"))
	private LanguageLocales defaultLocale;

	/**
	 * Instantiates a new {@link BundleApplications} entity object.
	 *
	 * @param name
	 *            the name
	 * @param bundleNames
	 *            the bundle names
	 * @param defaultLocale
	 *            the default locale
	 */
	@Builder
	BundleApplications(final String name, final Set<BundleNames> bundleNames,
		final LanguageLocales defaultLocale)
	{
		super(name);
		this.bundleNames = bundleNames;
		this.defaultLocale = defaultLocale;
	}
}
