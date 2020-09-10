package OCA.packegea;

import OCA.packegeb.ClassB;
import OCA.packegeb.Parent;

public class Main extends Parent {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        //System.out.println(classA.privateA);
        System.out.println(classA.packegeA);
        System.out.println(classA.protectedA);
        System.out.println(classA.publicA);
        System.out.println();

        ClassB classB = new ClassB();
//        System.out.println(classB.privateB);
//        System.out.println(classB.packegeB);
//        System.out.println(classB.protectedB);
        System.out.println(classB.publicB);
        System.out.println();

        Main parent = new Main();
//        System.out.println(parent.privateP);
//        System.out.println(parent.packegeP);
        System.out.println(parent.protectedP);
        System.out.println(parent.publicP);
        System.out.println();
    }
    }
