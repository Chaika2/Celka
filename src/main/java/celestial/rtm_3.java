/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTA;
import celestial.rTC;
import celestial.rgB_2;
import celestial.rgN_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class rtm_3
extends DataFix {
    public rtm_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public static Dynamic<?> id_class(Dynamic<?> dynamic) {
        String string = dynamic.get("CustomName").asString("");
        return string.isEmpty() ? dynamic.remove("CustomName") : dynamic.set("CustomName", dynamic.createString(rgB_2.id_class(new rgN_2(string))));
    }

    public TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", rTA.id_class());
        return this.fixTypeEverywhereTyped("EntityCustomNameToComponentFix", this.getInputSchema().getType(rTC.id_int), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            Optional optional = typed.getOptional(opticFinder);
            return optional.isPresent() && Objects.equals(optional.get(), "minecraft:commandblock_minecart") ? dynamic : rtm_3.id_class(dynamic);
        }));
    }
}

