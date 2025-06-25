package rpgclasses.buffs.principalability;

import aphorea.registry.AphModifiers;
import necesse.engine.modifiers.ModifierValue;
import necesse.entity.mobs.buffs.BuffModifiers;
import rpgclasses.buffs.SimpleClassBuff;

public class PaladinBuff extends SimpleClassBuff {
    public PaladinBuff() {
        super(
                new ModifierValue<>(BuffModifiers.ARMOR, 0.5F),
                new ModifierValue<>(AphModifiers.MAGIC_HEALING_RECEIVED, 0.5F),
                new ModifierValue<>(AphModifiers.MAGIC_HEALING, 1F),
                new ModifierValue<>(BuffModifiers.MAX_HEALTH, 1F),
                new ModifierValue<>(BuffModifiers.HEALTH_REGEN, 1F),
                new ModifierValue<>(BuffModifiers.COMBAT_HEALTH_REGEN, 1F)
        );
    }
}
