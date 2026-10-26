/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rIG
extends DataFix {
    private final String id_class;
    private final String id_break;
    private final String id_byte;

    public rIG(Schema schema, boolean bl, String string, String string2, String string3) {
        super(schema, bl);
        this.id_class = string;
        this.id_break = string2;
        this.id_byte = string3;
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.id_class, this.getInputSchema().getType(rTC.id_throws), typed -> typed.update(DSL.remainderFinder(), dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.get(this.id_break).result().map(dynamic2 -> dynamic.set(this.id_byte, dynamic2).remove(this.id_break)), (Object)dynamic)));
    }
}

