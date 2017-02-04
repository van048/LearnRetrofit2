package cn.ben.learnretrofit2;

import cn.ben.learnretrofit2.data.remote.RetrofitClient;
import cn.ben.learnretrofit2.data.remote.SOService;

class ApiUtils {

    private static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}