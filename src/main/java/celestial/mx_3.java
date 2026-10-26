/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHS;
import celestial.rdb_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.ue_3;
import java.util.Set;

public class mx_3
extends ue_3 {
    private static final rgP_2 id_implements = new rgn_3("gui.recipebook.toggleRecipes.smokable");

    @Override
    protected rgP_2 id_throws() {
        return id_implements;
    }

    @Override
    protected Set<rdb_3> id_protected() {
        return rHS.id_protected().keySet();
    }
}

