/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class rtz_3
extends DataFix {
    public rtz_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_byte);
        Type type2 = type.findFieldType("Level");
        OpticFinder opticFinder = DSL.fieldFinder((String)"Level", (Type)type2);
        return this.fixTypeEverywhereTyped("ChunkStatusFix", type, this.getOutputSchema().getType(rTC.id_byte), typed2 -> typed2.updateTyped(opticFinder, typed -> {
            Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
            String string = dynamic.get("Status").asString("empty");
            if (Objects.equals(string, "postprocessed")) {
                dynamic = dynamic.set("Status", dynamic.createString("fullchunk"));
            }
            return typed.set(DSL.remainderFinder(), (Object)dynamic);
        }));
    }
}

