package it.unisannio.security.DoApp.generators.semivalidgenerator;


import android.net.Uri;

import org.apache.commons.lang3.RandomStringUtils;

import it.unisannio.security.DoApp.model.IntentDataInfo;
import it.unisannio.security.DoApp.model.MalIntent;

public class GenericPathPrefixPortURIGenerator {

    public static MalIntent getSemivalidSchemeHostPortPathPrefixURIMalIntent(IntentDataInfo datafield) {

        MalIntent mal = new MalIntent(datafield);
        String scheme = datafield.scheme;
        String host = datafield.host;
        String port = datafield.port;
        String semiValidPathPrefix = datafield.pathPrefix +"/"+ RandomStringUtils.random(10);
        mal.setData(Uri.parse(scheme + "://" + host + ":" + port + "/" + semiValidPathPrefix));
        return mal;
    }
}