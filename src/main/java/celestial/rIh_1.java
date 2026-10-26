/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rIx_1;
import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;

public class rIh_1
extends rIx_1 {
    public rIh_1(Schema schema, boolean bl) {
        super("EntityTippedArrowFix", schema, bl);
    }

    @Override
    protected String id_class(String string) {
        return Objects.equals(string, "TippedArrow") ? "Arrow" : string;
    }
}

