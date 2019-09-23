# Adapter and Facade Pattern

# 1. Adapter Pattern
Convert the interface of class into another interface the clients expects.

1. Class Adapter

Class extends more than 1 class (can't applied in java)

2. Object Adapter
Class implements interface and do action clients expects.

For now, I'll explain about Object Adapter in Adapter Pattern

We have interface "Duck"
```
public interface Duck {
    void quack();

    void fly();
}
```
Duck implement in class MalardDuck and we will add adapter for Turkey who have different method
```
public interface Turkey {
    void gobble();

    void fly();
}
```

Below is MalardDuck implements behavior of Duck

```
public class MalardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quackkkkk");
    }

    @Override
    public void fly() {
        System.out.println("Malard duck flying");
    }
}
```

We create TurkeyAdapter
```
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
```

Now, we create implementation
```
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble.. Gobble..");
    }

    @Override
    public void fly() {
        System.out.println("turkey flyingggg");
    }
}
```

Now, we test it
```
public static void main(String[] args) {
	    // write your code here
        MalardDuck malardDuck = new MalardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);


        malardDuck.fly();
        turkeyAdapter.fly();


    }
```

# 2. Facade Pattern

Provide unified interface to a set interfaces in subsystem. Facade define higher level interface to make easier to use

```
public class Lights {
    public void on(){
        System.out.println("turnOff");
    }

    public void off(){
        System.out.println("turnOff");
    }

    public void dim(int count){
        System.out.println("dim"+count);
    }
}
```

```
public class Projector {
    public void on(){
        System.out.println("on");
    }

    public void off(){
        System.out.println("off");
    }

    public void wideScreen(boolean wideScreen){
        System.out.println("display "+ (wideScreen?"wide screen":"normal") );
    }
}
```

```
public class RoomFacade {
    private Projector projector;

    private Lights lights;

    public RoomFacade(Projector projector, Lights lights) {
        this.projector = projector;
        this.lights = lights;
    }

    public void displayProjector(boolean wideScreen){
        projector.on();
        projector.wideScreen(wideScreen);
    }

    public void dimLighning(int dim){
        lights.on();
        lights.dim(dim);
    }
}
```

```
public static void main(String[] args){
	Projector projector = new Projector();
	Lights lights = new Lights();

	RoomFacade roomFacade = new RoomFacade(projector, lights);

	roomFacade.dimLighning(10);
	roomFacade.displayProjector(true);
}
```
