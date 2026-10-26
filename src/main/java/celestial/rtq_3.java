/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;

public abstract class rtq_3
extends DataFix {
    protected final String id_class;

    public rtq_3(String string, Schema schema, boolean bl) {
        super(schema, bl);
        this.id_class = string;
    }

    protected abstract Pair<String, Typed<?>> id_class(String var1, Typed<?> var2);

    private <A> Typed<A> id_class(Object object, DynamicOps<?> dynamicOps, Type<A> type) {
        return new Typed(type, dynamicOps, object);
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(rTC.id_int);
        TaggedChoice.TaggedChoiceType taggedChoiceType2 = this.getOutputSchema().findChoiceType(rTC.id_int);
        return this.fixTypeEverywhere(this.id_class, (Type)taggedChoiceType, (Type)taggedChoiceType2, dynamicOps -> pair -> {
            String string = (String)pair.getFirst();
            Type type = (Type)taggedChoiceType.types().get(string);
            Pair<String, Typed<?>> pair2 = this.id_class(string, this.id_class(pair.getSecond(), (DynamicOps<?>)dynamicOps, (Type)type));
            Type type2 = (Type)taggedChoiceType2.types().get(pair2.getFirst());
            if (!type2.equals((Object)((Typed)pair2.getSecond()).getType(), true, true)) {
                throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", type2, ((Typed)pair2.getSecond()).getType()));
            }
            return Pair.of((Object)((String)pair2.getFirst()), (Object)((Typed)pair2.getSecond()).getValue());
        });
    }
}

