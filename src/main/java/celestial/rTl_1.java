/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class rTl_1
extends DataFix {
    private final String id_class;
    private final DSL.TypeReference id_break;

    public rTl_1(Schema schema, String string, DSL.TypeReference typeReference) {
        super(schema, true);
        this.id_class = string;
        this.id_break = typeReference;
    }

    protected TypeRewriteRule makeRule() {
        return this.writeAndRead(this.id_class, this.getInputSchema().getType(this.id_break), this.getOutputSchema().getType(this.id_break));
    }
}

