/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rtS_2;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class rtB_2
extends DataFix {
    private static <T> Dynamic<T> id_byte(Dynamic<T> dynamic) {
        dynamic = rtB_2.id_class(dynamic, "CA");
        return rtB_2.id_class(dynamic, "CB");
    }

    public rtB_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static <T> Dynamic<T> id_class(Dynamic<T> dynamic, String string) {
        return dynamic.get(string).asNumber().result().isPresent() ? dynamic.set(string, rtS_2.id_break(dynamic.get(string).asInt(0) << 4)) : dynamic;
    }

    private static Stream<? extends Dynamic<?>> id_class(Stream<? extends Dynamic<?>> stream) {
        return stream.map(dynamic -> {
            String string = dynamic.get("id").asString("");
            if ("ViF".equals(string)) {
                return rtB_2.id_byte(dynamic);
            }
            return "ViDF".equals(string) ? rtB_2.id_protected(dynamic) : dynamic;
        });
    }

    private <T> Dynamic<T> id_class(Dynamic<T> dynamic) {
        return dynamic.update("Children", rtB_2::id_break);
    }

    private static <T> Dynamic<T> id_break(Dynamic<T> dynamic) {
        return dynamic.asStreamOpt().map(rtB_2::id_class).map(arg_0 -> dynamic.createList(arg_0)).result().orElse(dynamic);
    }

    private static <T> Dynamic<T> id_protected(Dynamic<T> dynamic) {
        dynamic = rtB_2.id_class(dynamic, "CA");
        dynamic = rtB_2.id_class(dynamic, "CB");
        dynamic = rtB_2.id_class(dynamic, "CC");
        return rtB_2.id_class(dynamic, "CD");
    }

    public TypeRewriteRule makeRule() {
        return this.writeFixAndRead("SavedDataVillageCropFix", this.getInputSchema().getType(rTC.id_this), this.getOutputSchema().getType(rTC.id_this), this::id_class);
    }
}

