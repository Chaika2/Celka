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

public class rTI
extends rwW_2 {
    public rTI(Schema schema, boolean bl) {
        super(schema, bl, "EntityArmorStandSilentFix", rTC.id_int, "ArmorStand");
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic) {
        return dynamic.get("Silent").asBoolean(false) && !dynamic.get("Marker").asBoolean(false) ? dynamic.remove("Silent") : dynamic;
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }
}

