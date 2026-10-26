/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rnO_2;
import celestial.rnX_2;
import celestial.rnh_3;
import java.util.Collection;

public abstract class rnM_2 {
    public abstract rVi_1 id_class(rgP_2 var1, rnO_2[] var2);

    public abstract String id_class();

    public boolean id_class(rnM_2 rnM_22) {
        if (rnM_22 == null) {
            return false;
        }
        return this == rnM_22;
    }

    public abstract rnX_2 id_finally();

    public abstract boolean id_catch();

    public abstract rnh_3 id_extends();

    public abstract Collection<String> id_case();

    public abstract rnX_2 id_implements();

    public abstract boolean id_private();

    public abstract rgF_2 id_volatile();
}

