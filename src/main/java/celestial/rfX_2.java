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

public class rfX_2
extends rTA {
    public rfX_2(int n, Schema schema) {
        super(n, schema);
    }

    protected static void id_class(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> rIl_1.id_class(schema));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        rfX_2.id_class(schema, map, "minecraft:panda");
        schema.register(map, "minecraft:pillager", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (TypeTemplate)rIl_1.id_class(schema)));
        return map;
    }
}

