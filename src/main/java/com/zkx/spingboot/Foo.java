package com.zkx.spingboot;

import com.sun.deploy.util.ArrayUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Foo {
    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean(MyConfig.class));
        System.out.println(context.getBean("zkx"));
        System.out.println(context.getBean(JeepFactoryBean.class));
        System.out.println(context.getBean("&createJeepFactory"));
        System.out.println(context.getBean("createJeepFactory"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println("==============asdjlisadlo===============");
        context.close();*/

        System.out.println("abc".toCharArray());
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        for(int i=0;i<array.length;i++){
            for(int j=1;i<array.length;j++){
                
            }
        }


        return 0;
    }
}
