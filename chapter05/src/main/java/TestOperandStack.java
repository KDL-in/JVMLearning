public class TestOperandStack {
    public static void main(String[] args) {
        new TestOperandStack().add();
    }

    public int getSum() {
        int i = 5;
        int j = 3;
        int k = i + j;
        return k;
    }

    public void testGetSum() {
        int j = 10;
        int i = getSum();
    }

    public void inc() {
        int i = 1;
        int j = ++i;
        int k = i++;
    }

    public void add(){
        //第1类问题：
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //第2类问题：
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        //第3类问题：
        int i7 = 10;
        i7 = i7++;
        System.out.println(i7);
        int i8 = 10;
        i8 = ++i8;

        //第4类问题：
        int i9 = 10;
        int i10 = i9++ + ++i9;
        System.out.println(i10);
    }
}
