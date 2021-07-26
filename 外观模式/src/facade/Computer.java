package facade;

import children.Cpu;
import children.Disk;
import children.Memory;

public class Computer {
    Cpu cpu;
    Memory memory;
    Disk disk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();

    }

    public void start(){
       cpu.start();
       memory.start();
       disk.start();
    }
}
