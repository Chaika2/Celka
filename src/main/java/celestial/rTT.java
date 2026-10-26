/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 */
package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;

public class rTT
extends DataFix {
    private final String id_class;
    private final DSL.TypeReference id_break;

    public rTT(Schema schema, String string, DSL.TypeReference typeReference) {
        super(schema, true);
        this.id_class = string;
        this.id_break = typeReference;
    }

    protected final <K> TypeRewriteRule id_class(String string, TaggedChoice.TaggedChoiceType<K> taggedChoiceType, TaggedChoice.TaggedChoiceType<?> taggedChoiceType2) {
        if (taggedChoiceType.getKeyType() != taggedChoiceType2.getKeyType()) {
            throw new IllegalStateException("Could not inject: key type is not the same");
        }
        return this.fixTypeEverywhere(string, (Type)taggedChoiceType, (Type)taggedChoiceType2, dynamicOps -> pair -> {
            if (!taggedChoiceType2.hasType(pair.getFirst())) {
                throw new IllegalArgumentException(String.format("Unknown type %s in %s ", pair.getFirst(), this.id_break));
            }
            return pair;
        });
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(this.id_break);
        TaggedChoice.TaggedChoiceType taggedChoiceType2 = this.getOutputSchema().findChoiceType(this.id_break);
        return this.id_class(this.id_class, taggedChoiceType, taggedChoiceType2);
    }
}

