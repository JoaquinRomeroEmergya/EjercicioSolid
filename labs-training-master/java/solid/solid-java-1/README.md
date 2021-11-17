# :alembic: [LT](https://github.com/Emergya/labs-training): Solid Java

Remember: Do **not** change Tests Suites.

## SRP - Single Responsibility Principle

- **Exercise 00: cars and managers**
	- Refactor `CarManager` to not build up too much responsibility.
		- You should keep the same methods in `CarManager`.
		- `CarManager` can has properties, but not those that hold car data.

## OCP - Open-Closed Principle

- **Exercise 00: the magic machine**
	- Refactor the necessary files to allow the usage of every IngredientPackage, **without** adding a new `instanceof` check in `MagicMachine`.

## LSP - Liskov Substitution Principle

- **Exercise 00: flying ostriches**
	- Refactor the exercise's hierarchy to not break this principle. 

## ISP - Interface Segregation Principle

- **Exercise 00: the coffee shop**
	- Make the necessary changes and additions to fulfill this principle. 
	- Rules:
		- ExpressoCoffe should be only produced by PremiumCoffeeMachines.
		- No risen exceptions are allowed.

## DIP - Dependency Inversion Principle

- **Exercise 00: buttons, lamps and fans**
	- `Button` class should accepts both `Lamp` and `Fan` classes.
