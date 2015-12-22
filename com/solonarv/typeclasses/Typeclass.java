package com.solonarv.typeclasses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.solonarv.adts.Type;
import com.solonarv.adts.Pair;

public abstract class Typeclass {
	
	private static final Set<Typeclass> classes = new HashSet<>();
	
	public final String name;
	
	public Typeclass(String name){
		this.instances = new HashMap<>();
		this.name = name;
		classes.add(this);
	}
	
	private Map<Type[], Instance> instances;
	
	public Instance getInstance(Type... types){
		return instances.get(new Pair<>(this, types));
	}
}