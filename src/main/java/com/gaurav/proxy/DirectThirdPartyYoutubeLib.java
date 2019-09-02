/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: DirectThirdPartyYoutubeLib
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

package com.gaurav.proxy;
/*
 The concrete implementation of a service connector. Methods
 of this class can request information from YouTube. The speed
 of the request depends on a user's internet connection as
 well as YouTube's. The application will slow down if a lot of
 requests are fired at the same time, even if they all request
 the same information.
*/
public class DirectThirdPartyYoutubeLib implements ThirdPartyYoutubeLib {
    public String listVideos() {
        return "Listing videos by requesting YouTube";
    }

    public String getVideoInfo() {
        return "Video Info from YouTube";
    }

    public void downloadVideo() {
        System.out.println("Download videos from YouTube");
    }
}
