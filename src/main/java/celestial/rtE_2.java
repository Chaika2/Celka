/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.rTC;
import celestial.rgB_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rpY_2;
import celestial.rwe_3;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;

public class rtE_2
extends DataFix {
    public rtE_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic) {
        return dynamic.update("pages", dynamic2 -> (Dynamic)DataFixUtils.orElse((Optional)dynamic2.asStreamOpt().map(stream -> stream.map(dynamic -> {
            if (!dynamic.asString().result().isPresent()) {
                return dynamic;
            }
            String string = dynamic.asString("");
            rgP_2 rgP_22 = null;
            if (!"null".equals(string) && !StringUtils.isEmpty((CharSequence)string)) {
                if (string.charAt(0) == '\"' && string.charAt(string.length() - 1) == '\"' || string.charAt(0) == '{' && string.charAt(string.length() - 1) == '}') {
                    try {
                        rgP_22 = rpY_2.id_class(rwe_3.id_class, string, rgP_2.class, true);
                        if (rgP_22 == null) {
                            rgP_22 = rgN_2.id_byte;
                        }
                    }
                    catch (JsonParseException jsonParseException) {
                        // empty catch block
                    }
                    if (rgP_22 == null) {
                        try {
                            rgP_22 = rgB_2.id_class(string);
                        }
                        catch (JsonParseException jsonParseException) {
                            // empty catch block
                        }
                    }
                    if (rgP_22 == null) {
                        try {
                            rgP_22 = rgB_2.id_break(string);
                        }
                        catch (JsonParseException jsonParseException) {
                            // empty catch block
                        }
                    }
                    if (rgP_22 == null) {
                        rgP_22 = new rgN_2(string);
                    }
                } else {
                    rgP_22 = new rgN_2(string);
                }
            } else {
                rgP_22 = rgN_2.id_byte;
            }
            return dynamic.createString(rgB_2.id_class(rgP_22));
        })).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)).result(), (Object)dynamic.emptyList()));
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_native);
        OpticFinder opticFinder = type.findField("tag");
        return this.fixTypeEverywhereTyped("ItemWrittenBookPagesStrictJsonFix", type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), this::id_class)));
    }
}

