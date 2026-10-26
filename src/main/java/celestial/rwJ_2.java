/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
package celestial;

import celestial.rTC;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Map;
import java.util.Optional;

public class rwJ_2
extends DataFix {
    public rwJ_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_private);
        OpticFinder opticFinder = type.findField("data");
        return this.fixTypeEverywhereTyped("Map id fix", type, typed -> {
            Optional optional = typed.getOptionalTyped(opticFinder);
            return optional.isPresent() ? typed : typed.update(DSL.remainderFinder(), dynamic -> dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("data"), (Object)dynamic)));
        });
    }
}

