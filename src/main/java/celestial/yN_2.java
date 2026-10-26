/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 */
package celestial;

import celestial.Hv_1;
import celestial.QY;
import celestial.gm_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rrGp_1;
import celestial.rrGq_1;
import celestial.rrGy_1;
import celestial.yQ_2;
import celestial.ym_3;
import com.google.common.primitives.Doubles;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class yN_2
implements Comparable<yN_2> {
    protected final double id_class;
    protected final AtomicBoolean id_break = new AtomicBoolean(false);
    protected Map<rfH_2, rrGq_1> id_byte;

    public yN_2(yQ_2 yQ_22, rfj_3 rfj_32, double d) {
        this.id_class = d;
        this.id_byte = rfj_32 == null ? Collections.emptyMap() : rrGy_1.id_class((gm_3)QY.id_instanceof().id_class[56], rfj_32);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((yN_2)object);
    }

    public int id_class(yN_2 yN_22) {
        return Doubles.compare((double)this.id_class, (double)yN_22.id_class);
    }

    public rrGq_1 id_class(rfH_2 rfH_22) {
        return this.id_byte.getOrDefault(rfH_22, rrGp_1.id_class);
    }

    public abstract CompletableFuture<ym_3> id_class(Hv_1 var1);

    public abstract void id_class();
}

