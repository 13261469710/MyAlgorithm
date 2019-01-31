package test.test.com.myalgorithm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private TextView sortInsertTextView;// 插入排序
//    private TextView sortSelectTextView;//选择排序



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

    /**
     * 初始化视图
     */
    private void initView(){
        sortInsertTextView = (TextView) findViewById(R.id.sort_insert);
//        sortSelectTextView = (TextView) findViewById(R.id.sort_select);
        sortInsertTextView.setOnClickListener(this);
//        sortSelectTextView.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.sort_insert){
            int array[]=  {3,1,5,2,9,8,4,6,7};
//            array = sortInsert(array);

            array = heerSort(array);


            String tempString = "";
            for(int i=0;i<array.length;i++){
                tempString = new StringBuffer(tempString).append((String.valueOf(array[i]))).toString();
            }
            sortInsertTextView.setText(tempString);




        }
//        else if(id == R.id.sort_select){
//            sortSelect();
//        }
    }


    /**
     * 等待排序的数组
     * @param array 3,1,5,2,9,8,4,6,7
     * @return  123456789
     */
    private int[] sortInsert(int[] array){
        for (int i=1;i<array.length;i++){//注意这里i不是等于0而是从等于1开始的，也就是从数组的第二个数据开始
            int tempData = array[i];//临时数据
            int j;
            for(j = i-1;j >= 0 && tempData < array[j];j--){//这里的i-1 则代表前一个数据。临时数据要比前一个数据要小
                array[j+1] = array[j];//用前一个数据替换当前数据，将前一个数据的值给前一个数据的下一个数据？
            }
            array[j + 1] = tempData;//将临时数据的值给前一个数剧的下一个数据？

        }
        return array;//排序后的数组
    }

    /**
     * 选择排序
     */
    private void sortSelect(){

    }


    /**
     * 希尔排序
     */
    private int[] heerSort(int[] data){
        int d = data.length/2;//长度的一半？
        while(true){//???
            for(int i=0;i<d;i++){
                for(int j=i;j+d<data.length;j+=d){
                    int temp;//临时数据
                    if(data[j]>data[j+d]){
                        temp = data[j];
                        data[j] = data[j+d];
                        data[j+d] = temp;
                    }
                }
            }
            if(d == 1){
                break;//跳出while循环，返回排序完成的结果
            }
            d--;
        }
        return data;
    }







    /**
     * 假如有一根3000米的绳子，每天剪去一半的长度，请问需要花费几天的时间，绳子的长度会短于5米
     * @param totalLen 绳子的总长度
     */
    public static void calculationRope(int totalLen){
        System.out.println("绳子的总长度是："+totalLen);
        int day = 0;
        while(totalLen >= 5){//当绳子的长度一直长于5米的时候，循环继续，否则如果长度短语5米终止循环
            day ++;//日期逐天增加
            totalLen = totalLen/2;//绳子的长度减去一半
            System.out.println("绳子的长度随着每天的增加而减半："+totalLen);
        }
        System.out.println("花费"+day+"天的时间，绳子的长度会短语5米");
    }



}
