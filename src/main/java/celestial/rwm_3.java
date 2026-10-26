/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class rwm_3
extends DataFix {
    public rwm_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private double id_class(String string) {
        try {
            double d = 0.9 * Double.parseDouble(string) + 0.1;
            return d / 2.0;
        }
        catch (NumberFormatException numberFormatException) {
            return 0.5;
        }
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsAddTextBackgroundFix", this.getInputSchema().getType(rTC.id_throws), typed -> typed.update(DSL.remainderFinder(), dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.get("chatOpacity").asString().map(string -> dynamic.set("textBackgroundOpacity", dynamic.createDouble(this.id_class((String)string)))).result(), (Object)dynamic)));
    }
}

