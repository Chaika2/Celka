/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AO;
import celestial.rfj_3;
import celestial.roJ_2;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class Ah_1 {
    public final AtomicReferenceArray<roJ_2> id_break;
    public final int id_byte;
    private final int id_protected;
    public volatile int id_throws;
    public volatile int id_case;
    public int id_catch;
    public final /* synthetic */ AO id_class;

    public int id_byte() {
        return this.id_byte;
    }

    public Ah_1(AO aO, int n) {
        this.id_class = aO;
        this.id_byte = n;
        this.id_protected = n * 2 + 1;
        this.id_break = new AtomicReferenceArray(this.id_protected * this.id_protected);
    }

    public void id_class(Ah_1 ah_1) {
        this.id_throws = ah_1.id_class();
        this.id_case = ah_1.id_break();
        AtomicReferenceArray<roJ_2> atomicReferenceArray = ah_1.id_protected();
        for (int i = 0; i < atomicReferenceArray.length(); ++i) {
            roJ_2 roJ_22 = atomicReferenceArray.get(i);
            if (roJ_22 == null) continue;
            rfj_3 rfj_32 = roJ_22.id_private();
            if (!this.id_break(rfj_32.id_break, rfj_32.id_byte)) continue;
            int n = this.id_class(rfj_32.id_break, rfj_32.id_byte);
            if (this.id_break.get(n) != null) {
                throw new IllegalStateException("Doing this would mutate the client's REAL loaded chunks?!");
            }
            this.id_class(n, roJ_22);
        }
    }

    public int id_class() {
        return this.id_throws;
    }

    protected roJ_2 id_class(int n) {
        return this.id_break.get(n);
    }

    public int id_class(int n, int n2) {
        return Math.floorMod(n2, this.id_protected) * this.id_protected + Math.floorMod(n, this.id_protected);
    }

    protected roJ_2 id_class(int n, roJ_2 roJ_22, roJ_2 roJ_23) {
        if (this.id_break.compareAndSet(n, roJ_22, roJ_23) && roJ_23 == null) {
            --this.id_catch;
        }
        this.id_class.id_throws.id_class(roJ_22);
        return roJ_22;
    }

    protected void id_class(int n, roJ_2 roJ_22) {
        roJ_2 roJ_23 = this.id_break.getAndSet(n, roJ_22);
        if (roJ_23 != null) {
            --this.id_catch;
            this.id_class.id_throws.id_class(roJ_23);
        }
        if (roJ_22 != null) {
            ++this.id_catch;
        }
    }

    public boolean id_break(int n, int n2) {
        return Math.abs(n - this.id_throws) <= this.id_byte && Math.abs(n2 - this.id_case) <= this.id_byte;
    }

    public int id_break() {
        return this.id_case;
    }

    public AtomicReferenceArray<roJ_2> id_protected() {
        return this.id_break;
    }
}

