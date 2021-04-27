/**
 * @author shkstart
 * @create 2020 下午 6:01
 */
/*
理解输出结果，需要熟悉类加载顺序。
1. 加载阶段
2. 链接阶段，验证，准备（静态初始化），解析
3. 执行类加载方法<clinit>
    - 自动收集静态赋值和静态代码快合并，顺序执行
* */
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);
        //System.out.println(number);//报错：非法的前向引用。
    }

    private static int number = 10;  //linking之prepare: number = 0 --> initial: 20 --> 10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }
}
