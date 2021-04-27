/**
 * @author shkstart
 * @create 2020 下午 8:40
 */

/*
理解输出结果，需要熟悉类加载顺序。
1. 加载阶段
2. 链接阶段，验证，准备（静态初始化），解析
3. 执行类加载方法<clinit>
    - 子类的<clinit>执行前，父类的<clinit>会先执行
* */
public class ClinitTest1 {
    static class Father{
        public static int A = 1;
        static{
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        //加载Father类，其次加载Son类。
        System.out.println(Son.B);//2
    }
}
