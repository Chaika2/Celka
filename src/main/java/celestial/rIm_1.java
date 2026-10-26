/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Random;

public class rIm_1
extends rwW_2 {
    private static final Random id_class = new Random();

    public rIm_1(Schema schema, boolean bl) {
        super(schema, bl, "EntityZombieVillagerTypeFix", rTC.id_int, "Zombie");
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic) {
        if (dynamic.get("IsVillager").asBoolean(false)) {
            if (!dynamic.get("ZombieType").result().isPresent()) {
                int n = this.id_class(dynamic.get("VillagerProfession").asInt(-1));
                if (n == -1) {
                    n = this.id_class(id_class.nextInt(6));
                }
                dynamic = dynamic.set("ZombieType", dynamic.createInt(n));
            }
            dynamic = dynamic.remove("IsVillager");
        }
        return dynamic;
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }

    private int id_class(int n) {
        return n >= 0 && n < 6 ? n : -1;
    }
}

