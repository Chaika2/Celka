/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rqO_2;
import celestial.rwW_2;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class rwF_2
extends rwW_2 {
    private static final Map<String, String> id_class = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put("donkeykong", "donkey_kong");
        hashMap.put("burningskull", "burning_skull");
        hashMap.put("skullandroses", "skull_and_roses");
    });

    public rwF_2(Schema schema, boolean bl) {
        super(schema, bl, "EntityPaintingMotiveFix", rTC.id_int, "minecraft:painting");
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic) {
        Optional optional = dynamic.get("Motive").asString().result();
        if (optional.isPresent()) {
            String string = ((String)optional.get()).toLowerCase(Locale.ROOT);
            return dynamic.set("Motive", dynamic.createString(new rqO_2(id_class.getOrDefault(string, string)).toString()));
        }
        return dynamic;
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }
}

