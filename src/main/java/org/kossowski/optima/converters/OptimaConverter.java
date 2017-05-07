package org.kossowski.optima.converters;

public interface OptimaConverter {
	
	public Enum<?> toOptima( String s );
	
	public Enum<?> fromOptima( String s );

}
