/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPZ;
import celestial.rrEm_1;
import java.util.Map;

public abstract class rPm_1<E extends iB_2> {
    protected final Map<il_3<?>, iC_2> id_break;
    private rPZ id_class = rPZ.STOPPED;
    private long id_byte;
    private final int id_protected;
    private final int id_throws;

    protected void id_byte(rrEm_1 rrEm_12, E e, long l) {
    }

    public rPm_1(Map<il_3<?>, iC_2> map) {
        this(map, 60);
    }

    public rPm_1(Map<il_3<?>, iC_2> map, int n, int n2) {
        this.id_protected = n;
        this.id_throws = n2;
        this.id_break = map;
    }

    public rPm_1(Map<il_3<?>, iC_2> map, int n) {
        this(map, n, n);
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    private boolean id_class(E e) {
        for (Map.Entry<il_3<?>, iC_2> entry : this.id_break.entrySet()) {
            il_3<?> il_32 = entry.getKey();
            iC_2 iC_22 = entry.getValue();
            if (((iB_2)e).SF().id_class(il_32, iC_22)) continue;
            return false;
        }
        return true;
    }

    protected boolean id_class(rrEm_1 rrEm_12, E e, long l) {
        return false;
    }

    protected boolean id_class(long l) {
        return l > this.id_byte;
    }

    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return true;
    }

    public rPZ id_class() {
        return this.id_class;
    }

    protected void id_break(rrEm_1 rrEm_12, E e, long l) {
    }

    public final boolean id_throws(rrEm_1 rrEm_12, E e, long l) {
        if (this.id_class(e) && this.id_class(rrEm_12, e)) {
            this.id_class = rPZ.RUNNING;
            int n = this.id_protected + rrEm_12.id_long().nextInt(this.id_throws + 1 - this.id_protected);
            this.id_byte = l + (long)n;
            this.id_protected(rrEm_12, e, l);
            return true;
        }
        return false;
    }

    public final void id_catch(rrEm_1 rrEm_12, E e, long l) {
        this.id_class = rPZ.STOPPED;
        this.id_break(rrEm_12, e, l);
    }

    public final void id_case(rrEm_1 rrEm_12, E e, long l) {
        if (!this.id_class(l) && this.id_class(rrEm_12, e, l)) {
            this.id_byte(rrEm_12, e, l);
        } else {
            this.id_catch(rrEm_12, e, l);
        }
    }

    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
    }
}

