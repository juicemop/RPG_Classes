package rpgclasses.buffs.principalability;

import necesse.engine.modifiers.ModifierValue;
import necesse.entity.mobs.buffs.BuffModifiers;
import rpgclasses.buffs.SimpleClassBuff;

public class ApprenticeBuff extends SimpleClassBuff {
    public ApprenticeBuff() {
        super(
                new ModifierValue<>(BuffModifiers.MAGIC_DAMAGE, 2F),
                new ModifierValue<>(BuffModifiers.MAX_MANA, 1F),
                new ModifierValue<>(BuffModifiers.MANA_REGEN, 1F),
                new ModifierValue<>(BuffModifiers.ATTACK_MOVEMENT_MOD, 0F)
        );
    }
}
