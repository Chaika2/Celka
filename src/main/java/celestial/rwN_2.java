/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
package celestial;

import celestial.rTC;
import celestial.rnr_3;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;

public class rwN_2
extends DataFix {
    public rwN_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static rnr_3 id_class(String string) {
        return string.equals("health") ? rnr_3.HEARTS : rnr_3.INTEGER;
    }

    protected TypeRewriteRule makeRule() {
        Type type = DSL.named((String)rTC.id_else.typeName(), (Type)DSL.remainderType());
        if (!Objects.equals(type, this.getInputSchema().getType(rTC.id_else))) {
            throw new IllegalStateException("Objective type is not what was expected.");
        }
        return this.fixTypeEverywhere("ObjectiveRenderTypeFix", type, dynamicOps -> pair -> pair.mapSecond(dynamic -> {
            Optional optional = dynamic.get("RenderType").asString().result();
            if (!optional.isPresent()) {
                String string = dynamic.get("CriteriaName").asString("");
                rnr_3 rnr_32 = rwN_2.id_class(string);
                return dynamic.set("RenderType", dynamic.createString(rnr_32.id_class()));
            }
            return dynamic;
        }));
    }
}

