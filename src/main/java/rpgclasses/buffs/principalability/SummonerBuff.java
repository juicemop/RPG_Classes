package rpgclasses.buffs.principalability;

import necesse.engine.modifiers.ModifierValue;
import necesse.entity.mobs.buffs.BuffModifiers;
import rpgclasses.buffs.SimpleClassBuff;

public class SummonerBuff extends SimpleClassBuff {
    public SummonerBuff() {
        super(
                new ModifierValue<>(BuffModifiers.MANA_REGEN, 1F)
        );
    }
}
