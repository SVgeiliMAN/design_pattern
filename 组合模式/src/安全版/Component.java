package 安全版;

public abstract class Component {
    String type;

    public Component(String type) {
        this.type = type;
    }

  public abstract void operation();
  public abstract void add(Component component);
  public abstract void remove(Component component);
  public abstract Component getChild(int index);

}
