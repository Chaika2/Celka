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

public class rwi_3
extends rtT_2 {
    public rwi_3(Schema schema, boolean bl) {
        super("EntitySkeletonSplitFix", schema, bl);
    }

    @Override
    protected Pair<String, Dynamic<?>> id_class(String string, Dynamic<?> dynamic) {
        if (Objects.equals(string, "Skeleton")) {
            int n = dynamic.get("SkeletonType").asInt(0);
            if (n == 1) {
                string = "WitherSkeleton";
            } else if (n == 2) {
                string = "Stray";
            }
        }
        return Pair.of((Object)string, dynamic);
    }
}

