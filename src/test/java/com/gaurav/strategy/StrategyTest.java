/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: StrategyTest
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

import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyTest {
    @Test(expected = Test.None.class)
    public void testStrategy() {
        int a = 10;
        int b = 20;

        Context context = new Context();
        System.out.println("ADD");
        context.setStrategy(new ConcreteStrategyAdd());
        System.out.println(context.executeStrategy(a,b));

        System.out.println("SUBSTRACT");
        context.setStrategy(new ConcreteStrategySubtract());
        System.out.println(context.executeStrategy(a,b));

        System.out.println("Multiply");
        context.setStrategy(new ConcreteStrategyMultiply());
        System.out.println(context.executeStrategy(a,b));
    }
}