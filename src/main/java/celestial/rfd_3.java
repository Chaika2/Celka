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

public class rfd_3
extends rTA {
    public rfd_3(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        rfd_3.id_class(schema, map, "minecraft:barrel");
        rfd_3.id_class(schema, map, "minecraft:smoker");
        rfd_3.id_class(schema, map, "minecraft:blast_furnace");
        schema.register(map, "minecraft:lectern", string -> DSL.optionalFields((String)"Book", (TypeTemplate)rTC.id_native.in(schema)));
        schema.registerSimple(map, "minecraft:bell");
        return map;
    }
}

