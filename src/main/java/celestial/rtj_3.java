/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rTp_1;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rtj_3
extends rwW_2 {
    public rtj_3(Schema schema, String string) {
        super(schema, false, "Gossip for for " + string, rTC.id_int, string);
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("Gossips", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(dynamic -> rTp_1.id_byte(dynamic, "Target", "Target").orElse((Dynamic<?>)dynamic))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic)));
    }
}

