/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rwC_2;
import com.mojang.datafixers.schemas.Schema;

public class rwV_2
extends rwC_2 {
    public rwV_2(Schema schema) {
        super(schema, false);
    }

    @Override
    protected String id_class(String string) {
        return string.equals("minecraft:bee_hive") ? "minecraft:beehive" : string;
    }
}

