package Strategy;

import Factory.ConcreteCourse;

public class Context {
	   private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(ConcreteCourse course){
	      return strategy.calculateGrade(course);
	   }
	}

