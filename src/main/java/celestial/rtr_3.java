/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  org.apache.commons.lang3.math.NumberUtils
 */
package celestial;

import celestial.rTC;
import celestial.rtS_2;
import celestial.rts_3;
import com.google.common.base.Splitter;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.math.NumberUtils;

public class rtr_3
extends DataFix {
    private static final Splitter id_class = Splitter.on((char)';').limit(5);
    private static final Splitter id_break = Splitter.on((char)',');
    private static final Splitter id_byte = Splitter.on((char)'x').limit(2);
    private static final Splitter id_protected = Splitter.on((char)'*').limit(2);
    private static final Splitter id_throws = Splitter.on((char)':').limit(3);

    public rtr_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private Dynamic<?> id_class(Dynamic<?> dynamic2) {
        return dynamic2.get("generatorName").asString("").equalsIgnoreCase("flat") ? dynamic2.update("generatorOptions", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(this::id_class).map(string -> dynamic.createString(string)).result(), (Object)dynamic)) : dynamic2;
    }

    public String id_class(String string2) {
        String string3;
        int n;
        if (string2.isEmpty()) {
            return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
        }
        Iterator iterator = id_class.split((CharSequence)string2).iterator();
        String string4 = (String)iterator.next();
        if (iterator.hasNext()) {
            n = NumberUtils.toInt((String)string4, (int)0);
            string3 = (String)iterator.next();
        } else {
            n = 0;
            string3 = string4;
        }
        if (n >= 0 && n <= 3) {
            StringBuilder stringBuilder = new StringBuilder();
            Splitter splitter = n < 3 ? id_byte : id_protected;
            stringBuilder.append(StreamSupport.stream(id_break.split((CharSequence)string3).spliterator(), false).map(string -> {
                String string2;
                int n2;
                List list = splitter.splitToList((CharSequence)string);
                if (list.size() == 2) {
                    n2 = NumberUtils.toInt((String)((String)list.get(0)));
                    string2 = (String)list.get(1);
                } else {
                    n2 = 1;
                    string2 = (String)list.get(0);
                }
                List list2 = id_throws.splitToList((CharSequence)string2);
                int n3 = ((String)list2.get(0)).equals("minecraft") ? 1 : 0;
                String string3 = (String)list2.get(n3);
                int n4 = n == 3 ? rts_3.id_class("minecraft:" + string3) : NumberUtils.toInt((String)string3, (int)0);
                int n5 = n3 + 1;
                int n6 = list2.size() > n5 ? NumberUtils.toInt((String)((String)list2.get(n5)), (int)0) : 0;
                return (String)(n2 == 1 ? "" : n2 + "*") + rtS_2.id_break(n4 << 4 | n6).get("Name").asString("");
            }).collect(Collectors.joining(",")));
            while (iterator.hasNext()) {
                stringBuilder.append(';').append((String)iterator.next());
            }
            return stringBuilder.toString();
        }
        return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelFlatGeneratorInfoFix", this.getInputSchema().getType(rTC.id_class), typed -> typed.update(DSL.remainderFinder(), this::id_class));
    }
}

