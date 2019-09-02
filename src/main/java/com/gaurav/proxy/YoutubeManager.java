/*
 * Copyright (c) 2019. Gaurav Parmar
 *
 * Project: designpatterns
 * Class: YoutubeManager
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

public class YoutubeManager {
    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(){
        String info = service.getVideoInfo();
        System.out.println(info);
    }

    public void renderListPanel(){
        String videoList = service.listVideos();
        System.out.println(videoList);
    }

    public void downloadVideos(){
        service.downloadVideo();
    }

    public void invalidateCache(){
        if(service.getClass() == CachedThirdPartyYoutubeLib.class){
            ((CachedThirdPartyYoutubeLib)service).invalidateCache();
        }
    }
}
