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
import celestial.rte_3;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.Function;

public abstract class rtU_2
extends DataFix {
    private final String id_class;

    public rtU_2(Schema schema, String string) {
        super(schema, false);
        this.id_class = string;
    }

    public static DataFix id_class(Schema schema, String string, Function<String, String> function) {
        return new rte_3(schema, string, function);
    }

    protected abstract String id_class(String var1);

    public TypeRewriteRule makeRule() {
        Type type = DSL.named((String)rTC.id_continue.typeName(), rTA.id_class());
        if (!Objects.equals(this.getInputSchema().getType(rTC.id_continue), type)) {
            throw new IllegalStateException("item name type is not what was expected.");
        }
        return this.fixTypeEverywhere(this.id_class, type, dynamicOps -> pair -> pair.mapSecond(this::id_class));
    }
}

