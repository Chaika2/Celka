/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.rTC;
import celestial.rgB_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rpY_2;
import celestial.rwW_2;
import celestial.rwa_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import org.apache.commons.lang3.StringUtils;

public class rwe_3
extends rwW_2 {
    public static final Gson id_class = new GsonBuilder().registerTypeAdapter(rgP_2.class, (Object)new rwa_3()).create();

    public rwe_3(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntitySignTextStrictJsonFix", rTC.id_extends, "Sign");
    }

    private Dynamic<?> id_class(Dynamic<?> dynamic, String string) {
        String string2 = dynamic.get(string).asString("");
        rgP_2 rgP_22 = null;
        if (!"null".equals(string2) && !StringUtils.isEmpty((CharSequence)string2)) {
            if (string2.charAt(0) == '\"' && string2.charAt(string2.length() - 1) == '\"' || string2.charAt(0) == '{' && string2.charAt(string2.length() - 1) == '}') {
                try {
                    rgP_22 = rpY_2.id_class(id_class, string2, rgP_2.class, true);
                    if (rgP_22 == null) {
                        rgP_22 = rgN_2.id_byte;
                    }
                }
                catch (JsonParseException jsonParseException) {
                    // empty catch block
                }
                if (rgP_22 == null) {
                    try {
                        rgP_22 = rgB_2.id_class(string2);
                    }
                    catch (JsonParseException jsonParseException) {
                        // empty catch block
                    }
                }
                if (rgP_22 == null) {
                    try {
                        rgP_22 = rgB_2.id_break(string2);
                    }
                    catch (JsonParseException jsonParseException) {
                        // empty catch block
                    }
                }
                if (rgP_22 == null) {
                    rgP_22 = new rgN_2(string2);
                }
            } else {
                rgP_22 = new rgN_2(string2);
            }
        } else {
            rgP_22 = rgN_2.id_byte;
        }
        return dynamic.set(string, dynamic.createString(rgB_2.id_class(rgP_22)));
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            dynamic = this.id_class((Dynamic<?>)dynamic, "Text1");
            dynamic = this.id_class((Dynamic<?>)dynamic, "Text2");
            dynamic = this.id_class((Dynamic<?>)dynamic, "Text3");
            return this.id_class((Dynamic<?>)dynamic, "Text4");
        });
    }
}

