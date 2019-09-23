# Adapter and Facade Pattern

# Adapter Pattern
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
