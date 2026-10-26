/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.rHu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.ryJ_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import java.util.function.Supplier;

public abstract class JI<E extends ryO_2>
extends dB_2 {
    protected final Supplier<ryW_2<? extends E>> id_volatile;

    protected JI(Jq_1 jq_1, Supplier<ryW_2<? extends E>> supplier) {
        super(jq_1);
        this.id_volatile = supplier;
    }

    public abstract ryJ_2<? extends rHu_1> id_class(xc_3 var1, rYB var2, rfH_2 var3, boolean var4);
}

