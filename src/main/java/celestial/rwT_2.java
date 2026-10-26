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

import celestial.rTA;
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;

public class rwT_2
extends DataFix {
    private final String id_class;
    private final Function<String, String> id_break;

    public rwT_2(Schema schema, boolean bl, String string, Function<String, String> function) {
        super(schema, bl);
        this.id_class = string;
        this.id_break = function;
    }

    protected TypeRewriteRule makeRule() {
        Type type = DSL.named((String)rTC.id_return.typeName(), rTA.id_class());
        if (!Objects.equals(type, this.getInputSchema().getType(rTC.id_return))) {
            throw new IllegalStateException("Recipe type is not what was expected.");
        }
        return this.fixTypeEverywhere(this.id_class, type, dynamicOps -> pair -> pair.mapSecond(this.id_break));
    }
}

