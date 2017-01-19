package it.unisannio.security.DoApp.generators.semivalidgenerator;

import android.net.Uri;

import org.apache.commons.lang3.RandomStringUtils;

import it.unisannio.security.DoApp.model.IntentDataInfo;
import it.unisannio.security.DoApp.model.MalIntent;


public class GenericPathPatternURIGenerator {
    public static MalIntent getSemivalidSchemeHostPortPathPatternURIMalIntent(IntentDataInfo datafield){

        MalIntent mal = new MalIntent(datafield);
        String scheme = datafield.scheme;
        String host = datafield.host;
        String pathPattern = datafield.pathPattern;
        String semivalidPathPattern = pathPattern + "/" + RandomStringUtils.randomAlphanumeric(10);

        if (pathPattern.charAt(0) != '/')
            mal.setData(Uri.parse(scheme + "://" + host + ":" + "/" + semivalidPathPattern));
        else
            mal.setData(Uri.parse(scheme + "://" + host + ":" + semivalidPathPattern));

        return mal;
    }
}
