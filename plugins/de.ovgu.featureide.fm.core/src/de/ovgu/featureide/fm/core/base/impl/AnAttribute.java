/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2017  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */
package de.ovgu.featureide.fm.core.base.impl;

/**
 * TODO description
 * 
 * @author "Werner Jan"
 */
public class AnAttribute {
	
	public enum Types {
		STRING, INT, DOUBLE, LONG, BOOLEAN, FLOAT 
	}


	protected String name;
	protected String value;
	protected String unit;
	protected boolean recursive;
	protected boolean configurable;
	protected Types type;
	
	public  AnAttribute() {
		type = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	

	public void setRecursive(boolean recursive) {
		this.recursive = recursive;
	
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void setType(String type) {
		if (type == null) {
			this.type = null;
		} else {
			switch (type.toUpperCase()) {
				case "STRING":
					this.type = Types.STRING;
					break;
				case "INT":
					this.type = Types.INT;
					break;
				case "DOUBLE":
					this.type = Types.DOUBLE;
					break;
				case "LONG":
					this.type = Types.LONG;
					break;
				case "BOOLEAN":
					this.type = Types.BOOLEAN;
					break;
				case "FLOAT":
					this.type = Types.FLOAT;
					break;
				default: this.type = null;			
				}
		}
	}

	public void setConfigurable(boolean configurable) {
		this.configurable = configurable;
		
	}

	public String getName() {
		return name;	
	}
	
	public boolean getRecursive() {
		return recursive;	
	}
	
	public boolean getConfigurable() {
		return configurable;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public Types getType() {
		return type;
	}
	
	public String getValue() {
		return value;
	}

	public String toString() {
		return (getName());
	}
}