package 安全版;

import java.util.ArrayList;


public class Composite extends Component {
    String type;

    public Composite(String type) {
        super(type);
    }

    ArrayList arrayList;
    @Override
    public void operation() {
        System.out.println(type);
    }

    @Override
    public void add(Component component) {
        arrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        arrayList.remove(component);
    }

    @Override
    public Component getChild(int index) {
        Component component =(Component) arrayList.get(index);
        return component;
    }
}
