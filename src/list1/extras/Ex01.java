package list1.extras;

public class Ex01 {
    public static void a() {
        for(int i=1;i<=3;i++) {
            for(int j=1;j<=3;j++) {
                for(int k=1;k<=3;k++) {
                    System.out.printf("%d, %d, %d\n", i, j, k);
                }
            }
        }
        
        System.out.println("=====");
    }

    public static void b() {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++) {
                for(int k=1;k<=4;k++) {
                    for(int l=1;l<=4;l++) {
                        System.out.printf("%d, %d, %d, %d\n", i, j, k, l);
                    }
                }
            }
        }

        System.out.println("=====");
    }

    public static void c() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                for(int k=1;k<=5;k++) {
                    for(int l=1;l<=5;l++) {
                        for(int m=1;m<=5;m++) {
                            System.out.printf("%d, %d, %d, %d, %d\n", i, j, k, l, m);
                        }
                    }
                }
            }
        }
    }

    public static void d() {
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=6;j++) {
                for(int k=1;k<=6;k++) {
                    for(int l=1;l<=6;l++) {
                        for(int m=1;m<=6;m++) {
                            for(int n=1;n<=6;n++) {
                                System.out.printf("%d, %d, %d, %d, %d, %d\n", i, j, k, l, m, n);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void e() {
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=7;j++) {
                for(int k=1;k<=7;k++) {
                    for(int l=1;l<=7;l++) {
                        for(int m=1;m<=7;m++) {
                            for(int n=1;n<=7;n++) {
                                for (int o=1;o<=7;o++) {
                                    System.out.printf("%d, %d, %d, %d, %d, %d, %d\n", i, j, k, l, m, n, o);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
    }
}
