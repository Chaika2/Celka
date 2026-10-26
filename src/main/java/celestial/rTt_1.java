/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class rTt_1
extends DataFix {
    private final String id_class;
    private final Function<String, String> id_break;

    public rTt_1(Schema schema, boolean bl, String string, Function<String, String> function) {
        super(schema, bl);
        this.id_class = string;
        this.id_break = function;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.id_class, this.getInputSchema().getType(rTC.id_implements), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.updateMapValues(pair -> {
            String string = ((Dynamic)pair.getFirst()).asString("");
            return pair.mapFirst(dynamic2 -> dynamic.createString(this.id_break.apply(string)));
        })));
    }
}

