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
import celestial.rTi_1;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class rTa_1
extends DataFix {
    private final String id_class;

    public rTa_1(Schema schema, String string) {
        super(schema, false);
        this.id_class = string;
    }

    public static DataFix id_class(Schema schema, String string, Function<String, String> function) {
        return new rTi_1(schema, string, function);
    }

    protected abstract String id_class(String var1);

    public TypeRewriteRule makeRule() {
        Type type;
        Type type2 = this.getInputSchema().getType(rTC.id_new);
        if (!Objects.equals(type2, type = DSL.named((String)rTC.id_new.typeName(), rTA.id_class()))) {
            throw new IllegalStateException("block type is not what was expected.");
        }
        TypeRewriteRule typeRewriteRule = this.fixTypeEverywhere(this.id_class + " for block", type, dynamicOps -> pair -> pair.mapSecond(this::id_class));
        TypeRewriteRule typeRewriteRule2 = this.fixTypeEverywhereTyped(this.id_class + " for block_state", this.getInputSchema().getType(rTC.id_volatile), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            Optional optional = dynamic.get("Name").asString().result();
            return optional.isPresent() ? dynamic.set("Name", dynamic.createString(this.id_class((String)optional.get()))) : dynamic;
        }));
        return TypeRewriteRule.seq((TypeRewriteRule)typeRewriteRule, (TypeRewriteRule)typeRewriteRule2);
    }
}

