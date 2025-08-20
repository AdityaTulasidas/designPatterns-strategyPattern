// Command Pattern Example from Head First Design Patterns

interface Command {
    void execute();
}

class Light {
    public void on() {
        System.out.println("Light is ON");
    }
    public void off() {
        System.out.println("Light is OFF");
    }
}

class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}

class RemoteControl {
    Command slot;
    public void setCommand(Command command) {
        slot = command;
    }
    public void pressButton() {
        slot.execute();
    }
}

public class CommandPatternDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
    }
}

