package 安全版;

public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Composite composite1= new Composite("树枝1");
        Composite composite2= new Composite("树枝2");
        Leaf leaf1 = new Leaf("叶子1");
        Leaf leaf2 = new Leaf("叶子2");
        Leaf leaf3 = new Leaf("叶子3");
        Leaf leaf4 = new Leaf("叶子4");
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite2.add(leaf3);
        composite2.add(leaf4);


    }
}
