/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: CachedThirdPartyYoutubeLib
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
 To save some bandwidth, we can cache request results and keep
 them for some time. But it may be impossible to put such code
 directly into the service class. For example, it could have
 been provided as part of a third party library and/or defined
 as `final`. That's why we put the caching code into a new
 proxy class which implements the same interface as the // service class. It delegates to the service object only when
 the real requests have to be sent. 
*/


public class CachedThirdPartyYoutubeLib implements ThirdPartyYoutubeLib {

    private com.gaurav.proxy.ThirdPartyYoutubeLib service;
    private String listCache;
    private String videoCache;
    private boolean needReset = false;

    public CachedThirdPartyYoutubeLib(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void invalidateCache(){
        needReset=true;
    }

    public String listVideos() {
        if(needReset || (listCache != null && !listCache.isEmpty())){
            return service.listVideos();
        }
        return "Listing videos from CACHE";
    }

    public String getVideoInfo() {
        if(needReset || (videoCache != null && !videoCache.isEmpty())){
            return service.getVideoInfo();
        }
        return "Video Info from CACHE";
    }

    public void downloadVideo() {
        if(needReset){
            service.downloadVideo();
            return;
        }
        System.out.println("Download videos from CACHE");
    }
}
