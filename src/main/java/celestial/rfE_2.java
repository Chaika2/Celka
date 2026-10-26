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

public class rfE_2
extends rTA {
    public rfE_2(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, rTC.id_byte, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_package.in(schema)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_extends.in(schema)), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)rTC.id_new.in(schema))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Palette", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_volatile.in(schema)))), (String)"Structures", (TypeTemplate)DSL.optionalFields((String)"Starts", (TypeTemplate)DSL.compoundList((TypeTemplate)rTC.id_this.in(schema))))));
        schema.registerType(false, rTC.id_this, () -> DSL.optionalFields((String)"Children", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"CA", (TypeTemplate)rTC.id_volatile.in(schema), (String)"CB", (TypeTemplate)rTC.id_volatile.in(schema), (String)"CC", (TypeTemplate)rTC.id_volatile.in(schema), (String)"CD", (TypeTemplate)rTC.id_volatile.in(schema))), (String)"biome", (TypeTemplate)rTC.id_public.in(schema)));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        map.put("DUMMY", DSL::remainder);
        return map;
    }
}

