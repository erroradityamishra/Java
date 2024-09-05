class A {
    int a;
    public void setdata() {
        a = 100;
    }
    public void getdata() {
        System.out.println(a);
    }
}

class B extends A {
    int b;
    public void setdata1() {
        b = 200;
    }
    public void getdata1() {
        System.out.println(b);
    }
}

class C extends B {
    int c;
    public void setdata2() {
        c = 300;
    }
    public void getdata2() {
        System.out.println(c);
    }
}

class Test {
    public static void main(String[] args) {
        C o = new C();  // Correct object initialization
        o.setdata();
        o.getdata();
        o.setdata1();
        o.getdata1();
        o.setdata2();
        o.getdata2();
    }
}


// OUTPUT:
// 100
// 200
// 300
