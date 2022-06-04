package com.example.myapplication.request;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class BoardRequestdetail extends StringRequest {
    //서버 URl 설정
    final static private String URL = "http://121.127.86.101:90/imgdownload01.php";
    private Map<String,String> map;

    public BoardRequestdetail(String no,Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("NO",no);
    }

    //서버에서 요청하는 파라미터 전송
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
