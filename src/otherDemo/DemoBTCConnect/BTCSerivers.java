package otherDemo.DemoBTCConnect;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Base64;

public class BTCSerivers {
    private static String RPCURL = "http://127.0.0.1:8332";
    private static String RPCUSER = "user";
    private static String RPCPWD = "pwd";

    public static String getJsonStr(String method, Object... params) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("jsonrpc", "2.0");
        jsonObject.put("method", method);
        jsonObject.put("id", System.currentTimeMillis());
        if (params != null) {
            jsonObject.put("params", params);
        }
        return jsonObject.toJSONString();
    }

    public static String excute(String jsonStr) {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(RPCURL);
        post.addHeader("Encoding", "UTF-8");
        post.addHeader("Connect-Type", "application/json");
        String authorStr = Base64.getEncoder().encodeToString((RPCUSER + ":" + RPCPWD).getBytes());
        post.addHeader("Authorization", "Basic " + authorStr);
        try {
            HttpEntity httpEntity = new StringEntity(jsonStr);
            post.setEntity(httpEntity);
            CloseableHttpResponse resp = client.execute(post);
            int code = resp.getStatusLine().getStatusCode();
            if (code == HttpStatus.SC_OK) {
                String respStr = EntityUtils.toString(resp.getEntity());
                return respStr;
            } else return "请求遇到错误：错误码为：" + code;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        String blockcount = getJsonStr("getblockcount");
        String result = excute(blockcount);
        System.out.println(result);
    }
}

