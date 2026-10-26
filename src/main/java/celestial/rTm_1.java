/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rtm_3;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class rTm_1
extends rwW_2 {
    public rTm_1(Schema schema, boolean bl, String string, DSL.TypeReference typeReference, String string2) {
        super(schema, bl, string, typeReference, string2);
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), rtm_3::id_class);
    }
}

