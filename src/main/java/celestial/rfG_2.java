/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rIl_1;
import celestial.rTA;
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rfG_2
extends rTA {
    public rfG_2(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> rIl_1.id_class(schema));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        rfG_2.id_class(schema, map, "minecraft:turtle");
        rfG_2.id_class(schema, map, "minecraft:cod_mob");
        rfG_2.id_class(schema, map, "minecraft:tropical_fish");
        rfG_2.id_class(schema, map, "minecraft:salmon_mob");
        rfG_2.id_class(schema, map, "minecraft:puffer_fish");
        rfG_2.id_class(schema, map, "minecraft:phantom");
        rfG_2.id_class(schema, map, "minecraft:dolphin");
        rfG_2.id_class(schema, map, "minecraft:drowned");
        schema.register(map, "minecraft:trident", string -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)rTC.id_volatile.in(schema)));
        return map;
    }
}

