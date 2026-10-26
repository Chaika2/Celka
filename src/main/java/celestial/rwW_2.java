/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public abstract class rwW_2
extends DataFix {
    private final String id_class;
    private final String id_break;
    private final DSL.TypeReference id_byte;

    public rwW_2(Schema schema, boolean bl, String string, DSL.TypeReference typeReference, String string2) {
        super(schema, bl);
        this.id_class = string;
        this.id_byte = typeReference;
        this.id_break = string2;
    }

    protected abstract Typed<?> id_class(Typed<?> var1);

    public TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.namedChoice((String)this.id_break, (Type)this.getInputSchema().getChoiceType(this.id_byte, this.id_break));
        return this.fixTypeEverywhereTyped(this.id_class, this.getInputSchema().getType(this.id_byte), this.getOutputSchema().getType(this.id_byte), typed -> typed.updateTyped(opticFinder, this.getOutputSchema().getChoiceType(this.id_byte, this.id_break), this::id_class));
    }
}

