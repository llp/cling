/*
 * Copyright (C) 2013 4th Line GmbH, Switzerland
 *
 * The contents of this file are subject to the terms of either the GNU
 * Lesser General Public License Version 2 or later ("LGPL") or the
 * Common Development and Distribution License Version 1 or later
 * ("CDDL") (collectively, the "License"). You may not use this file
 * except in compliance with the License. See LICENSE.txt for more
 * information.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

package org.fourthline.cling.model.types;

/**
 * @author Christian Bauer
 */
public class CustomDatatype extends AbstractDatatype<String> {

    private String name;

    public CustomDatatype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String valueOf(String s) throws InvalidValueException {
        if (s.equals("")) return null;
        return s;
    }

    @Override
    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + getName() + "'";
    }
}