package com.example.myapplication;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BufferedReader bufferedReader;
    private List<Bean> beans;
    private Button mBt;
    private ImageView mIv;
    private TextView mTv;
    private List<List<Bean>> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        AssetManager assets = getAssets();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String line = null;
            bufferedReader = new BufferedReader(new InputStreamReader(assets.open("appkey.txt"), "GBK"));
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(stringBuffer.toString());
            lists = new ArrayList<>();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject data = jsonObject.getJSONObject("data");
            Iterator<String> keys = data.keys();
            while (keys.hasNext()) {
                JSONArray jsonArray = data.getJSONArray(keys.next());
                beans = new ArrayList<>();
                for (int i = 0; i < jsonArray.length(); i++) {
                    Bean bean = new Bean();
                    JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                    String s = jsonObject1.optString("awayGround");
                    bean.setAwayGround(s);
                    beans.add(bean);
                }
                lists.add(beans);
            }
            StringBuffer stringBuffer1 = new StringBuffer();
            for (int i = 0; i < lists.size(); i++) {
                List<Bean> abs = lists.get(i);
                for (int j = 0; j < abs.size(); j++) {
                    stringBuffer1.append(abs.get(j).getAwayGround()+"\n");
                }

            }
            mTv.setText(stringBuffer1.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void initView() {
        mBt = findViewById(R.id.bt);
        mBt.setOnClickListener(this);
        mIv = findViewById(R.id.iv);
        mTv = findViewById(R.id.tv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bt:
                break;
        }
    }
}
