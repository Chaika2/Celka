/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rIk_1;
import celestial.rTC;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import java.util.Optional;

public class rIv_1
extends rwW_2 {
    public rIv_1(Schema schema, boolean bl) {
        super(schema, bl, "Zombie Villager XP rebuild", rTC.id_int, "minecraft:zombie_villager");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            Optional optional = dynamic.get("Xp").asNumber().result();
            if (!optional.isPresent()) {
                int n = dynamic.get("VillagerData").get("level").asInt(1);
                return dynamic.set("Xp", dynamic.createInt(rIk_1.id_class(n)));
            }
            return dynamic;
        });
    }
}

