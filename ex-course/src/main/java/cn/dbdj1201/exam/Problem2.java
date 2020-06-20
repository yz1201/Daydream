package cn.dbdj1201.exam;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author yz1201
 * @date 2020-06-19 13:28
 **/
@Slf4j(topic = "c.Problem2")
public class Problem2 {
    public static void main(String[] args) throws IOException {

        /*
         * 生成10个1-100之间的随机数，并存放到一个数组中：
         * (1)   把数组中大于等于10的数字放到一个list集合中
         * (2)   把数组中小于10的数字放到一个map集合中，索引作为key,元素作为value。
         * (3)   判断map集合中是否存在元素，如果没有元素则在控制台提示；
         *       如果有则使用字符输出流将map集合中的元素（key值和value值之间用':'间隔）的写入文件，元素和元素之间一定要换行。
         */
        //创建长度为10的数组。
        int[] arr = new int[10];
        //创建随机数对象
        Random r = new Random();
        //创建泛型为Integer的ArrayList集合，
        // 创建键和值都是Integer的map集合，
        // 创建字符输出流，文件是根目录下的number.txt。
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("number.txt")));
        //遍历数组。
        for (int i = 0; i < arr.length; i++) {
            //为数组的每个元素赋上（1~100）的随机数。
            arr[i] = r.nextInt(100) + 1;
            //对数组中的元素判断，如果大于等于10存到List集合，如果小于10存入map集合，将这数的索引作为key,这个数作为value。
//            ________________1______________________
            if (arr[i] >= 10)
                list.add(arr[i]);
            else
                map.put(i, arr[i]);
        }
        //判断map集合是否存在元素，如果没有元素则在控制台提示："数组中没有符合条件的元素存入map集合！"
        //如果有，则使用字符输出流将map集合中的元素（key值和value值之前用':'间隔）的写入文件，元素和元素之间一定要换行。
//        ________________2______________________
        if (map.isEmpty())
            System.out.println("数组中没有符合条件的元素存入map集合");
        else {
            map.keySet().forEach(i -> {
                try {
                    bw.write(String.valueOf(i));
                    bw.write(":");
                    bw.write(String.valueOf(map.get(i)));
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        //关流
        bw.close();
    }
}
