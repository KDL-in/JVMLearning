public class TestInvokeDy {
    public static void main(String[] args) {
        // invokespecial 因为调用的就是该类的构造方法
        FuncIn a = new FuncInImpl();
        // invokedynamic，声明类型，但实际上不知道具体值的类型
        FuncIn b = () -> {
            System.out.println("lambda impl");
        };
        // invokespecial ??
        FuncIn c = new FuncIn() {
            @Override
            public void fun() {
                System.out.println("匿名");
            }
        };
        a.fun();
        b.fun();
    }
}

class FuncInImpl implements FuncIn {

    @Override
    public void fun() {
        System.out.println("impl");
    }
}

interface FuncIn{
    void fun();
}

