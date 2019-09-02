/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: DataSourceDecorator
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

package com.gaurav.decorator;
/*
 The base decorator class follows the same interface as the
 other components. The primary purpose of this class is to
 define the wrapping interface for all concrete decorators.
 The default implementation of the wrapping code might include
 a field for storing a wrapped component and the means to
 initialize it.
*/
public class DataSourceDecorator implements DataSource {
    protected DataSource wrapee;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrapee = dataSource;
    }

    /*
     The base decorator simply delegates all work to the
     wrapped component. Extra behaviors can be added in
     concrete decorators.
    */
    public void writeData(String data) throws Exception {
        wrapee.writeData(data);
    }

    /*
     Concrete decorators may call the parent implementation of
     the operation instead of calling the wrapped object
     directly. This approach simplifies extension of decorator
     classes.
    */
    public String readData() throws Exception {
        return wrapee.readData();
    }
}
