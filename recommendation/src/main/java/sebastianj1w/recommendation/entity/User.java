package sebastianj1w.recommendation.entity;

public class User {
    private long id;
    private long c1;
    private long c2;
    private long c3;
    private long c4;
    private long c5;

    public User (long id, long c1,long c2,long c3,long c4,long c5) {
        this.id = id;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getC1() {
        return c1;
    }

    public void setC1(long c1) {
        this.c1 = c1;
    }

    public long getC2() {
        return c2;
    }

    public void setC2(long c2) {
        this.c2 = c2;
    }

    public long getC3() {
        return c3;
    }

    public void setC3(long c3) {
        this.c3 = c3;
    }

    public long getC4() {
        return c4;
    }

    public void setC4(long c4) {
        this.c4 = c4;
    }

    public long getC5() {
        return c5;
    }

    public void setC5(long c5) {
        this.c5 = c5;
    }
}
