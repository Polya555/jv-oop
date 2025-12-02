package core.basesyntax;

import task.Machine;

public class MainApp {
    public static void main(String[] args) {
        Machine[] machines = new Machine[3];

        for (Machine m : machines) {
            m.doWork();
            m.stopWork();
        }
    }

}
