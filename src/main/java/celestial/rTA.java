/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Const$PrimitiveType
 *  com.mojang.serialization.codecs.PrimitiveCodec
 */
package celestial;

import celestial.rTn_1;
import celestial.rqO_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class rTA
extends Schema {
    public static final PrimitiveCodec<String> id_class = new rTn_1();
    private static final Type<String> id_break = new Const.PrimitiveType(id_class);

    public rTA(int n, Schema schema) {
        super(n, schema);
    }

    public static String id_class(String string) {
        rqO_2 rqO_22 = rqO_2.id_break(string);
        return rqO_22 != null ? rqO_22.toString() : string;
    }

    public static Type<String> id_class() {
        return id_break;
    }

    public Type<?> getChoiceType(DSL.TypeReference typeReference, String string) {
        return super.getChoiceType(typeReference, rTA.id_class(string));
    }
}

