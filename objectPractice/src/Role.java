import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"风流倜傥", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "闭月羞花", "亭亭玉立", "身材姣好", "相貌丑陋", "惨不忍睹"};

    //attack攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为爪锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，垂向%s双腿",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"

    };
    //    injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {

    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "惨不忍睹";
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义一个方法用于攻击别人
    public void attack(Role role) {

        //计算造成的伤害1~20
        Random r = new Random();

        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        int hurt = r.nextInt(20) + 1;
        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做验证如果为负数了，就修改为0；
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        System.out.printf(KungFu, this.getName(), role.getName());
        System.out.println();
        //受伤描述
        if (remainBlood >= 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood >= 80 && remainBlood < 90) {
            System.out.printf(injureds_desc[1], role.getName());

        } else if (remainBlood >= 70 && remainBlood < 80) {
            System.out.printf(injureds_desc[2], role.getName());

        } else if (remainBlood >= 60 && remainBlood < 70) {
            System.out.printf(injureds_desc[3], role.getName());

        } else if (remainBlood >= 40 && remainBlood < 60) {
            System.out.printf(injureds_desc[4], role.getName());

        } else if (remainBlood >= 20 && remainBlood < 40) {
            System.out.printf(injureds_desc[5], role.getName());

        } else if (remainBlood >= 10 && remainBlood < 20) {
            System.out.printf(injureds_desc[6], role.getName());

        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("颜值为：" + getFace());
    }
}