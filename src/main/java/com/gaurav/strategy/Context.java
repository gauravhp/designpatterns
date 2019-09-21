/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: Context
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

package com.gaurav.strategy;

// The context defines the interface of interest to clients.
public class Context {

    /*
     The context maintains a reference to one of the strategy
     objects. The context doesn't know the concrete class of a
     strategy. It should work with all strategies via the
     strategy interface.
    */
    private Strategy strategy;

    /*
     Usually the context accepts a strategy through the
     constructor, and also provides a setter so that the
     strategy can be switched at runtime.
    */

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    /*
     The context delegates some work to the strategy object
     instead of implementing multiple versions of the
     algorithm on its own.
    */

    public int executeStrategy(int a, int b){
        return strategy.execute(a,b);
    }
}
