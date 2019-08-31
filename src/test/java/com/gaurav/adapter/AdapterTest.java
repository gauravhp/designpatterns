/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: AdapterTest
 * GitHub profile: https://github.com/gauravhp
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.gaurav.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {

    @Test
    public void getSquareAdapterRadius(){
        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter a = new SquarePegAdapter(squarePeg);
        assertTrue(a.getRadius() == 5*Math.sqrt(2)/2);
    }

    @Test
    public void fits() {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        assertTrue(roundHole.fits(roundPeg));

        SquarePeg small = new SquarePeg(2);
        SquarePeg large = new SquarePeg(10);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(small);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(large);

        assertTrue(roundHole.fits(smallAdapter));
        assertFalse(roundHole.fits(largeAdapter));
    }
}