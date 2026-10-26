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
import celestial.rtS_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;

public class rTe_1
extends DataFix {
    public rTe_1(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_new);
        Type type2 = this.getOutputSchema().getType(rTC.id_new);
        Type type3 = DSL.named((String)rTC.id_new.typeName(), (Type)DSL.or((Type)DSL.intType(), rTA.id_class()));
        Type type4 = DSL.named((String)rTC.id_new.typeName(), rTA.id_class());
        if (Objects.equals(type, type3) && Objects.equals(type2, type4)) {
            return this.fixTypeEverywhere("BlockNameFlatteningFix", type3, type4, dynamicOps -> pair -> pair.mapSecond(either -> (String)either.map(rtS_2::id_class, string -> rtS_2.id_class(rTA.id_class(string)))));
        }
        throw new IllegalStateException("Expected and actual types don't match.");
    }
}

