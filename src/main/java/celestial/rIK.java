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

public class rIK
extends Schema {
    public rIK(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, rTC.id_return, () -> DSL.constType(rTA.id_class()));
        schema.registerType(false, rTC.id_break, () -> DSL.optionalFields((String)"RootVehicle", (TypeTemplate)DSL.optionalFields((String)"Entity", (TypeTemplate)rTC.id_package.in(schema)), (String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema)), (TypeTemplate)DSL.optionalFields((String)"ShoulderEntityLeft", (TypeTemplate)rTC.id_package.in(schema), (String)"ShoulderEntityRight", (TypeTemplate)rTC.id_package.in(schema), (String)"recipeBook", (TypeTemplate)DSL.optionalFields((String)"recipes", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_return.in(schema)), (String)"toBeDisplayed", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_return.in(schema))))));
        schema.registerType(false, rTC.id_protected, () -> DSL.compoundList((TypeTemplate)DSL.list((TypeTemplate)rTC.id_native.in(schema))));
    }
}

