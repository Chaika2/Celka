/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rTA;
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfz_3
extends rTA {
    public rfz_3(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> rfz_3.id_class(schema));
    }

    protected static TypeTemplate id_class(Schema schema) {
        return DSL.optionalFields((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        map.remove("minecraft:illager_beast");
        rfz_3.id_class(schema, map, "minecraft:ravager");
        return map;
    }
}

