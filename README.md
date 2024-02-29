# Inheritages-Interfaces

This repository contains several Java projects demonstrating inheritance and interfaces.

#### AGD Products
The AGD Products package includes classes representing household appliances. The `SprzętAGD` interface defines methods common to all appliances. The `SprzętDomowy` class showcases the usage of this interface by creating instances of `Lodowka` (refrigerator) and `Pralka` (washing machine) and invoking their methods.

#### Animals
The Animals package contains classes representing animals. The `Zwierzę` interface defines a method for providing information about an animal. The `Ssak` class implements this interface and serves as a base class for specific types of mammals, such as `Pies` (dog) and `Kot` (cat). The `Zoo` class demonstrates the creation of instances of `Pies` and `Kot` and calling their methods.

#### Objętość brył
The Objętość brył package comprises classes for calculating the volume of geometric shapes. The `Zadanie` abstract class defines methods for inputting data, performing calculations, and displaying results. The `ObjetoscProstopadloscianu` and `ObjetoscWalca` classes extend `Zadanie` to calculate the volume of a cuboid and cylinder, respectively.

#### Orchestra
The Orchestra package features classes representing musical instruments. The `Instrument` interface defines a method for playing an instrument. The `Flute`, `Trombone`, `Guitar`, and `GuitarElectric` classes implement this interface to represent different instruments.

#### TV_sample
The TV_sample package includes classes for managing TV products. The `Towar` abstract class defines a method for calculating discounts. The `Telewizor` class represents a generic TV, while `TelewizorSamsung` extends it to represent Samsung TVs with additional features.

#### Uczelnia
The Uczelnia package contains classes representing university students. The `Uzytkownik` class defines basic information and age input methods. The `Student` class extends `Uzytkownik` to represent students with additional attributes such as student ID, field of study, and GPA. The `ObslugaStudenta` class demonstrates the creation of student instances and calling their methods.

Feel free to explore each project for more details and examples of inheritance and interface implementation. Contributions and feedback are welcome!
