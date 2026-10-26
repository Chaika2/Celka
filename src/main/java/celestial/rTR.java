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
import java.util.Map;
import java.util.Objects;

public class rTR
extends DataFix {
    private final String id_class;
    private final Map<String, String> id_break;

    public rTR(Schema schema, boolean bl, String string, Map<String, String> map) {
        super(schema, bl);
        this.id_break = map;
        this.id_class = string;
    }

    protected TypeRewriteRule makeRule() {
        Type type = DSL.named((String)rTC.id_public.typeName(), rTA.id_class());
        if (!Objects.equals(type, this.getInputSchema().getType(rTC.id_public))) {
            throw new IllegalStateException("Biome type is not what was expected.");
        }
        return this.fixTypeEverywhere(this.id_class, type, dynamicOps -> pair -> pair.mapSecond(string -> this.id_break.getOrDefault(string, (String)string)));
    }
}

