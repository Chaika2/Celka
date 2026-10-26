/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rPZ;
import celestial.rPm_1;
import celestial.rqb_3;
import celestial.rrEm_1;

public class rPh_1<E extends iB_2>
extends rPm_1<E> {
    private boolean id_class;
    private boolean id_byte;
    private final rqb_3 id_protected;
    private final rPm_1<? super E> id_throws;
    private int id_case;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, E e, long l) {
        this.id_throws.id_byte(rrEm_12, e, l);
        this.id_byte = this.id_throws.id_class() == rPZ.RUNNING;
    }

    public rPh_1(rPm_1<? super E> rPm_12, rqb_3 rqb_32) {
        this(rPm_12, false, rqb_32);
    }

    public rPh_1(rPm_1<? super E> rPm_12, boolean bl, rqb_3 rqb_32) {
        super(rPm_12.id_break);
        this.id_throws = rPm_12;
        this.id_class = !bl;
        this.id_protected = rqb_32;
    }

    @Override
    public String toString() {
        return "RunSometimes: " + this.id_throws;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        if (!this.id_throws.id_class(rrEm_12, e)) {
            return false;
        }
        if (this.id_class) {
            this.id_class(rrEm_12);
            this.id_class = false;
        }
        if (this.id_case > 0) {
            --this.id_case;
        }
        return !this.id_byte && this.id_case == 0;
    }

    private void id_class(rrEm_1 rrEm_12) {
        this.id_case = this.id_protected.id_class(rrEm_12.id_int);
    }

    @Override
    protected boolean id_class(long l) {
        return false;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e, long l) {
        return this.id_throws.id_class(rrEm_12, e, l);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, E e, long l) {
        this.id_class(rrEm_12);
        this.id_throws.id_break(rrEm_12, e, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        this.id_throws.id_protected(rrEm_12, e, l);
    }
}

