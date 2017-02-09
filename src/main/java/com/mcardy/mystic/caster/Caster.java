package com.mcardy.mystic.caster;

import java.util.UUID;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import com.mcardy.mystic.caster.knowledge.Knowledge;

public interface Caster {

	public void connect();
	public void disconnect();
	
	public LivingEntity getTargetLiving();
	
	public Knowledge getKnowledge();
	public Player getPlayer();
	public UUID getUUID();
	
	public void regenerate();
	public void update();
	
}
