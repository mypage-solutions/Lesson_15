![GitHub code size in bytes](https://img.shields.io/github/languages/count/mypage-solutions/Lesson_15)
![GitHub top language](https://img.shields.io/github/languages/top/mypage-solutions/Lesson_15)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/mypage-solutions/Lesson_15)
![GitHub last commit](https://img.shields.io/github/last-commit/mypage-solutions/Lesson_15)

# Homework #15 

## Table of Contents

- [General Info](#general-information)
- [Technologies Used](#technologies-used)
- [Project Status](#project-status)
- [Contact](#contact)

## General Information

Homework contains topics:
1. Declare class IntArrayList that implements IntList interface.
2. Implement methods for adding and removing an element at a specific position in an Array.

```java
public interface IntList {
    void add(int value);

    int get(int index);

    void set(int index, int value);

    int size();

    int[] toArray();

    void add(int index, int value);

    void remove(int index);
}
```

### Interfaces in JAVA. 
Interface is a blueprint for a class, ensures the class implements it provides all the services an interface promised to provide to the outside world. 
It is introduced in java for mainly achieving three concepts. For example, are the interface between you and the electrical wiring on the other side of its plastic casing. You press the "power" button to turn the television on and off.
In its most common form, an interface is a group of related methods with empty bodies. A bicycle's behavior, if specified as an interface, might appear as follows:

```java
interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
```

To implement this interface, the name of your class would change (to a particular brand of bicycle, for example, such as ACMEBicycle), 
and you'd use the implements keyword in the class declaration:

```java
class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
```

Implementing an interface allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.

#### Difference between Interface and Abstract class.
<p align="center">
  <img src="https://github.com/mypage-solutions/Images/blob/main/Images/interface-vs-abstract-class-in-java.jpg" />
</p>

## Technologies Used

<p>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/java-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/intellij-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/git-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
<img src="https://github.com/mypage-solutions/Images/blob/main/Images/devicon/github-original.svg" width="35" height="35" /><span>&nbsp;&nbsp;</span>
</p>
  
## Project Status

Project is: _complete_.

## Contact

<p align="center">
<a href="https://twitter.com/Michael22878035"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/twitter-fill.png" /></a>
<a href="mailto:m_musienko@outlook.com"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/mail-fill.png" /></a>
<a href="https://www.linkedin.com/in/mykhailo-musiienko-80849880/"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/linkedin-box-fill.png" /></a>
<a href="https://t.me/Mykhailo_Musiienko"><img src="https://github.com/mypage-solutions/Images/blob/main/Images/icons/telegram-fill.png" /></a>
</p>
