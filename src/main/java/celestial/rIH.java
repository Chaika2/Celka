/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 */
package celestial;

import celestial.rIn_1;
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class rIH
extends Schema {
    public rIH(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, rTC.id_native, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)rTC.id_continue.in(schema), (String)"tag", (TypeTemplate)DSL.optionalFields((String)"EntityTag", (TypeTemplate)rTC.id_package.in(schema), (String)"BlockEntityTag", (TypeTemplate)rTC.id_extends.in(schema), (String)"CanDestroy", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)), (String)"CanPlaceOn", (TypeTemplate)DSL.list((TypeTemplate)rTC.id_new.in(schema)))), (Hook.HookFunction)rIn_1.id_class, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
    }
}

