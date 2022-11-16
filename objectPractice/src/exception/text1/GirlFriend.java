package exception.text1;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        int leg = name.length();
        if (leg >= 3 && leg <= 10) {
            this.name = name;
        } else {
            throw new RuntimeException();
        }

    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        if (age >= 18 && age <= 40) {
            this.age = age;
        } else {
            throw new RuntimeException();
        }

    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
