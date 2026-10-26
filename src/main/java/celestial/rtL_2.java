/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rtT_2;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class rtL_2
extends rtT_2 {
    public rtL_2(Schema schema, boolean bl) {
        super("EntityElderGuardianSplitFix", schema, bl);
    }

    @Override
    protected Pair<String, Dynamic<?>> id_class(String string, Dynamic<?> dynamic) {
        return Pair.of((Object)(Objects.equals(string, "Guardian") && dynamic.get("Elder").asBoolean(false) ? "ElderGuardian" : string), dynamic);
    }
}

