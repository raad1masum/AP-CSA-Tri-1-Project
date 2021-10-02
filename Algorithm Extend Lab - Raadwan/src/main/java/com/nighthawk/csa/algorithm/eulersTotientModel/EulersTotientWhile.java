package com.nighthawk.csa.algorithm.eulersTotientModel;

public class EulersTotientWhile extends _EulersTotient {
    public EulersTotientWhile() {
        super();
    }
    public EulersTotientWhile(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using While
    */
    @Override
    protected void init() {
        super.name = "While";
        // longer and more error prone "while" syntax is often best performer in this small scale test
        long limit = super.size;
        long[] f = new long[]{0, 1};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[0] + f[1]};
        }
    }

    /*
    Class method "main" with purpose of testing EulersTotientWhile
     */
    public static void main(String[] args) {
        _EulersTotient eulers = new EulersTotientWhile();
        eulers.print();
    }
}
