/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rgB_2;
import celestial.rgN_2;
import celestial.rgn_3;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class rtv_3
extends DataFix {
    public rtv_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private Dynamic<?> id_class(Dynamic<?> dynamic) {
        Optional optional = dynamic.get("display").result();
        if (optional.isPresent()) {
            Dynamic dynamic2 = (Dynamic)optional.get();
            Optional optional2 = dynamic2.get("Name").asString().result();
            if (optional2.isPresent()) {
                dynamic2 = dynamic2.set("Name", dynamic2.createString(rgB_2.id_class(new rgN_2((String)optional2.get()))));
            } else {
                Optional optional3 = dynamic2.get("LocName").asString().result();
                if (optional3.isPresent()) {
                    dynamic2 = dynamic2.set("Name", dynamic2.createString(rgB_2.id_class(new rgn_3((String)optional3.get()))));
                    dynamic2 = dynamic2.remove("LocName");
                }
            }
            return dynamic.set("display", dynamic2);
        }
        return dynamic;
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_native);
        OpticFinder opticFinder = type.findField("tag");
        return this.fixTypeEverywhereTyped("ItemCustomNameToComponentFix", type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), this::id_class)));
    }
}

