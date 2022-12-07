package test;

class Student {

    private int no;
    private String name;
    private int age;
    private int java;
    private int c;
    private int sql;
    private int sum;
    private int avg;

    public void setNo(int no) {
        this.no = no;
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getSql() {
        return sql;
    }

    public void setSql(int sql) {
        this.sql = sql;
    }

    public int getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = this.java + this.c + this.sql;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = this.sum / 3;
    }

    public String toString() {
        /*String msg="\t"+this.no+"\t"+this.name+"\t"+this.age+"\t"+this.java+"\t"
                +this.c+"\t"+this.sql+"\t"+this.sum+"\t"+this.avg;*/
        return "\t" + this.no + "\t" + this.name + "\t" + this.age + "\t" + this.java + "\t"
                + this.c + "\t" + this.sql + "\t" + this.sum + "\t" + this.avg;
    }
}
