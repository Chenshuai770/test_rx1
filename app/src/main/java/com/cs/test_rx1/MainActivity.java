package com.cs.test_rx1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {


    private CycleView cycleview;
    private List<CycleModel> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        cycleview = (CycleView) findViewById(R.id.cycleview);
        mData=new ArrayList<>();

        // 初始化数据源
        mData = new ArrayList<>();
        // 添加数据源
        CycleModel cycleModel = new CycleModel("1","http://g.hiphotos.baidu.com/imgad/pic/item/f603918fa0ec08fa9f0b7dd85eee3d6d55fbda42.jpg");
        mData.add(cycleModel);
        cycleModel = new CycleModel(
                "http://g.hiphotos.baidu.com/imgad/pic/item/4a36acaf2edda3cc6a22d65f06e93901203f928e.jpg");
        mData.add(cycleModel);
        cycleModel = new CycleModel(
                "http://g.hiphotos.baidu.com/imgad/pic/item/023b5bb5c9ea15cec0e68e76b1003af33a87b241.jpg");

        mData.add(cycleModel);
        cycleModel = new CycleModel(
                "http://g.hiphotos.baidu.com/imgad/pic/item/023b5bb5c9ea15cec0e68e76b1003af33a87b241.jpg");

        mData.add(cycleModel);
        cycleModel = new CycleModel(
                "http://g.hiphotos.baidu.com/imgad/pic/item/023b5bb5c9ea15cec0e68e76b1003af33a87b241.jpg");

        mData.add(cycleModel);
        // 设置显示方式（居中,内边距离下24dp）
        cycleview.setAlignParentRight(20,20);
        // 设置为有轮播功能
        cycleview.setIsHasWheel(true);

        //cycleview.setCycle(false); 这一步设计的就很不错了,首页轮播图就可以设置了

        // 设置数据源并设置监听
        cycleview.setData(mData, new CycleView.CycleViewListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "这是第" + position + "个图",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }



}
