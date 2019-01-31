package test.test.com.myalgorithm;

/**
 * Created by peizhiyou on 2018-11-20.
 */
public class MainMethod {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String []arg){
        //假如有一根3000米的绳子，每天剪去一般的长度，请问需要花费几天的时间，绳子的长度会短于5米.@param totalLen 绳子的总长度
//        MainActivity.calculationRope(10000);
        int data[]= null;
        int unorderedData[] = {9,0,1,8,6,3,2,5,7,4};//无序数据

        //冒泡排序
        data = bubbling(unorderedData);

        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0;i<data.length;i++){
            stringBuffer.append(data[i]);
        }
        System.out.print("冒泡排序后的结果："+stringBuffer.toString());
    }


    /**
     *冒泡排序
     * @param data 未排序的数组 如2 9 1 6 4 7
     * @return 排序完成的数组     1 2 4 6 7 9
     */
    public static int[] bubbling(int data[]){



//        int dataLen = data.length;//数组的长度
//
//        for(int i=dataLen-1;i>0;i--){//比较多少轮？？
//
////            System.out.println("i = " + i);
//
//            for(int j = 0 ; j < i ; j++ ){//每一轮比较多少次
//
//                System.out.println("j = " + j);
//
//                if(data[j] > data[j+1]){
//                    //位置置换模块
////                    swap(data[j],data[j+1]);
//                    int temp =data[j];
//                    data[j]= data[j+1];
//                    data[j+1] = temp;
//
//                }
//
//            }
//
//        }


        int arrayData[]={1,3,9,2,4,8,7,6,5,0};

        int arrayLength= arrayData.length;

        for(int i=arrayLength-1;i>0;i--){

            for(int j=0;j<i;j++){

                if(arrayData[j]>arrayData[j+1]){

                    int temp = arrayData[j+1];

                    arrayData[j+1] = arrayData[j];

                    arrayData[j] = temp;

                }

            }

        }

        data = arrayData;







        return data;
    }

    /**
     *
     * @param a a位置的数据
     * @param b b位置的数据
     */
    private static void swap(int a,int b){
        System.out.println("位置互换的数据是：" + a +"和" + b);
        int temp = a;//将a 的值给一个临时变量
        a = b;//用b的值替换a的值
        b = temp;//用临时变量替换b的值
    }








}
