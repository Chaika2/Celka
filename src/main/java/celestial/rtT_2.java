/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rtq_3;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public abstract class rtT_2
extends rtq_3 {
    public rtT_2(String string, Schema schema, boolean bl) {
        super(string, schema, bl);
    }

    @Override
    protected Pair<String, Typed<?>> id_class(String string, Typed<?> typed) {
        Pair<String, Dynamic<?>> pair = this.id_class(string, (Dynamic)typed.getOrCreate(DSL.remainderFinder()));
        return Pair.of((Object)((String)pair.getFirst()), (Object)typed.set(DSL.remainderFinder(), (Object)((Dynamic)pair.getSecond())));
    }

    protected abstract Pair<String, Dynamic<?>> id_class(String var1, Dynamic<?> var2);
}

