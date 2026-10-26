/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rRo_1;
import celestial.rTX;
import celestial.rTh_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roF_2;
import celestial.roH_2;
import celestial.roL_2;
import celestial.roQ_2;
import celestial.rol_3;
import celestial.rqR_2;
import celestial.rrEv_1;
import celestial.rrEx_1;
import celestial.rrse_3;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrEZ
extends rrse_3
implements AutoCloseable {
    private static final Logger id_class = LogManager.getLogger();
    private final rTh_1<Runnable> id_break;
    private final ObjectList<Pair<rrEv_1, Runnable>> id_byte = new ObjectArrayList();
    private final rrEx_1 id_protected;
    private final rTX<roL_2<Runnable>> id_throws;
    private volatile int id_case = 5;
    private final AtomicBoolean id_catch = new AtomicBoolean();

    private void id_byte() {
        int n;
        int n2 = Math.min(this.id_byte.size(), this.id_case);
        ObjectListIterator objectListIterator = this.id_byte.iterator();
        for (n = 0; objectListIterator.hasNext() && n < n2; ++n) {
            Pair pair = (Pair)objectListIterator.next();
            if (pair.getFirst() != rrEv_1.PRE_UPDATE) continue;
            ((Runnable)pair.getSecond()).run();
        }
        objectListIterator.back(n);
        super.id_class(Integer.MAX_VALUE, true, true);
        for (int i = 0; objectListIterator.hasNext() && i < n2; ++i) {
            Pair pair = (Pair)objectListIterator.next();
            if (pair.getFirst() == rrEv_1.POST_UPDATE) {
                ((Runnable)pair.getSecond()).run();
            }
            objectListIterator.remove();
        }
    }

    public rrEZ(rol_3 rol_32, rrEx_1 rrEx_12, boolean bl, rTh_1<Runnable> rTh_12, rTX<roL_2<Runnable>> rTX2) {
        super(rol_32, true, bl);
        this.id_protected = rrEx_12;
        this.id_throws = rTX2;
        this.id_break = rTh_12;
    }

    @Override
    public void id_class(rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_int();
        this.id_class(rfH_22.b_() >> 4, rfH_22.d_() >> 4, rrEv_1.POST_UPDATE, rqR_2.id_class(() -> super.id_class(rfH_23), () -> "checkBlock " + rfH_23));
    }

    protected void id_class(rfj_3 rfj_32) {
        this.id_class(rfj_32.id_break, rfj_32.id_byte, () -> 0, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> {
            int n;
            super.id_break(rfj_32, false);
            super.id_class(rfj_32, false);
            for (n = -1; n < 17; ++n) {
                super.id_class(rRo_1.BLOCK, rjh_3.id_class(rfj_32, n), null, true);
                super.id_class(rRo_1.SKY, rjh_3.id_class(rfj_32, n), null, true);
            }
            for (n = 0; n < 16; ++n) {
                super.id_class(rjh_3.id_class(rfj_32, n), true);
            }
        }, () -> "updateChunkStatus " + rfj_32 + " true"));
    }

    @Override
    public int id_class(int n, boolean bl, boolean bl2) {
        throw rqR_2.id_byte(new UnsupportedOperationException("Ran authomatically on a different thread!"));
    }

    @Override
    public void id_class(rfH_2 rfH_22, int n) {
        throw rqR_2.id_byte(new UnsupportedOperationException("Ran authomatically on a different thread!"));
    }

    @Override
    public void id_class(rfj_3 rfj_32, boolean bl) {
        this.id_class(rfj_32.id_break, rfj_32.id_byte, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> super.id_class(rfj_32, bl), () -> "enableLight " + rfj_32 + " " + bl));
    }

    public CompletableFuture<roC_2> id_class(roC_2 roC_22, boolean bl) {
        rfj_3 rfj_32 = roC_22.id_private();
        roC_22.id_protected(false);
        this.id_class(rfj_32.id_break, rfj_32.id_byte, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> {
            roQ_2[] roQ_2Array = roC_22.id_byte();
            for (int i = 0; i < 16; ++i) {
                roQ_2 roQ_22 = roQ_2Array[i];
                if (roQ_2.id_class(roQ_22)) continue;
                super.id_class(rjh_3.id_class(rfj_32, i), false);
            }
            super.id_class(rfj_32, true);
            if (!bl) {
                roC_22.id_package().forEach(rfH_22 -> super.id_class((rfH_2)rfH_22, roC_22.id_catch((rfH_2)rfH_22)));
            }
            this.id_protected.id_protected(rfj_32);
        }, () -> "lightChunk " + rfj_32 + " " + bl));
        return CompletableFuture.supplyAsync(() -> {
            roC_22.id_protected(true);
            super.id_break(rfj_32, false);
            return roC_22;
        }, runnable -> this.id_class(rfj_32.id_break, rfj_32.id_byte, rrEv_1.POST_UPDATE, runnable));
    }

    private void id_class(int n, int n2, rrEv_1 rrEv_12, Runnable runnable) {
        this.id_class(n, n2, this.id_protected.id_byte(rfj_3.id_class(n, n2)), rrEv_12, runnable);
    }

    private void id_class(int n, int n2, IntSupplier intSupplier, rrEv_1 rrEv_12, Runnable runnable) {
        this.id_throws.id_class(roF_2.id_class(() -> {
            this.id_byte.add((Object)Pair.of((Object)((Object)rrEv_12), (Object)runnable));
            if (this.id_byte.size() >= this.id_case) {
                this.id_byte();
            }
        }, rfj_3.id_class(n, n2), intSupplier));
    }

    @Override
    public void id_class(rRo_1 rRo_12, rjh_3 rjh_32, roH_2 roH_22, boolean bl) {
        this.id_class(rjh_32.id_break(), rjh_32.id_protected(), () -> 0, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> super.id_class(rRo_12, rjh_32, roH_22, bl), () -> "queueData " + rjh_32));
    }

    public void id_class(int n) {
        this.id_case = n;
    }

    @Override
    public void id_class(rjh_3 rjh_32, boolean bl) {
        this.id_class(rjh_32.id_break(), rjh_32.id_protected(), () -> 0, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> super.id_class(rjh_32, bl), () -> "updateSectionStatus " + rjh_32 + " " + bl));
    }

    @Override
    public void close() {
    }

    @Override
    public void id_break(rfj_3 rfj_32, boolean bl) {
        this.id_class(rfj_32.id_break, rfj_32.id_byte, () -> 0, rrEv_1.PRE_UPDATE, rqR_2.id_class(() -> super.id_break(rfj_32, bl), () -> "retainData " + rfj_32));
    }

    public void id_break() {
        if ((!this.id_byte.isEmpty() || super.id_class()) && this.id_catch.compareAndSet(false, true)) {
            this.id_break.id_class(() -> {
                this.id_byte();
                this.id_catch.set(false);
            });
        }
    }
}

