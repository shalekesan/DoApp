package it.unisannio.security.DoApp.generators.semivalidgenerator;


import android.net.Uri;

import org.apache.commons.lang3.RandomStringUtils;

import it.unisannio.security.DoApp.model.IntentDataInfo;
import it.unisannio.security.DoApp.model.MalIntent;

public class GenericSemivalidHostURIGenerator
{
    public static MalIntent getSemivalidSchemeURIMalIntent(IntentDataInfo datafield){

        MalIntent mal = new MalIntent(datafield);
        String scheme = datafield.scheme;
        String semivalidHost = datafield.host + RandomStringUtils.random(10);
        mal.setData(Uri.parse(scheme+ "://" + semivalidHost));
        return mal;
    }
}
