package 安全版;

public class Leaf extends Component {

    public Leaf(String type) {
        super(type);
    }

    @Override
    public void operation() {
        System.out.println(type);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }
}
