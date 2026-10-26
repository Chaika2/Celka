/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 */
package celestial;

import celestial.rTA;
import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.Objects;

public abstract class rIx_1
extends DataFix {
    private final String id_class;

    public rIx_1(String string, Schema schema, boolean bl) {
        super(schema, bl);
        this.id_class = string;
    }

    protected abstract String id_class(String var1);

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(rTC.id_int);
        TaggedChoice.TaggedChoiceType taggedChoiceType2 = this.getOutputSchema().findChoiceType(rTC.id_int);
        Type type = DSL.named((String)rTC.id_final.typeName(), rTA.id_class());
        if (!Objects.equals(this.getOutputSchema().getType(rTC.id_final), type)) {
            throw new IllegalStateException("Entity name type is not what was expected.");
        }
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhere(this.id_class, (Type)taggedChoiceType, (Type)taggedChoiceType2, dynamicOps -> pair -> pair.mapFirst(string -> {
            String string2 = this.id_class((String)string);
            Type type = (Type)taggedChoiceType.types().get(string);
            Type type2 = (Type)taggedChoiceType2.types().get(string2);
            if (!type2.equals((Object)type, true, true)) {
                throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", type2, type));
            }
            return string2;
        })), (TypeRewriteRule)this.fixTypeEverywhere(this.id_class + " for entity name", type, dynamicOps -> pair -> pair.mapSecond(this::id_class)));
    }
}

