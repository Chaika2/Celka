/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jY_2;
import celestial.jl_3;
import celestial.rAL;
import celestial.rRN;
import celestial.rqO_2;
import java.io.IOException;

public class jt_3
extends jY_2<int[]> {
    private static final rqO_2 id_class = new rqO_2("textures/colormap/foliage.png");

    protected int[] id_class(rAL rAL2) {
        try {
            return jl_3.id_class(rAL2, id_class);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Failed to load foliage color texture", iOException);
        }
    }

    @Override
    protected void id_class(int[] nArray, rAL rAL2) {
        rRN.id_class(nArray);
    }

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }
}

