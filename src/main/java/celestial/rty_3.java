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

public class rty_3
extends rwW_2 {
    public rty_3(Schema schema, boolean bl) {
        super(schema, bl, "EntityItemFrameDirectionFix", rTC.id_int, "minecraft:item_frame");
    }

    private static byte id_class(byte by) {
        switch (by) {
            case 0: {
                return 3;
            }
            case 1: {
                return 4;
            }
            default: {
                return 2;
            }
            case 3: 
        }
        return 5;
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic) {
        return dynamic.set("Facing", dynamic.createByte(rty_3.id_class(dynamic.get("Facing").asByte((byte)0))));
    }
}

