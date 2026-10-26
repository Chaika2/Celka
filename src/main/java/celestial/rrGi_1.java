/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.rrbr_3;

public class rrGi_1
extends rfH_2 {
    private int id_class;
    private int id_break;
    private int id_catch;
    private int id_private;
    private rrGi_1[] id_implements;
    private boolean id_finally;

    public static Iterable id_byte(rfH_2 rfH_22, rfH_2 rfH_23) {
        rfH_2 rfH_24 = new rfH_2(Math.min(rfH_22.b_(), rfH_23.b_()), Math.min(rfH_22.c_(), rfH_23.c_()), Math.min(rfH_22.d_(), rfH_23.d_()));
        rfH_2 rfH_25 = new rfH_2(Math.max(rfH_22.b_(), rfH_23.b_()), Math.max(rfH_22.c_(), rfH_23.c_()), Math.max(rfH_22.d_(), rfH_23.d_()));
        return new rrbr_3(rfH_24, rfH_25);
    }

    @Override
    public rfH_2 id_int() {
        return new rfH_2(this.id_class, this.id_break, this.id_catch);
    }

    public rrGi_1(int n, int n2, int n3, int n4) {
        super(0, 0, 0);
        this.id_class = n;
        this.id_break = n2;
        this.id_catch = n3;
        this.id_private = n4;
    }

    public rrGi_1() {
        this(0, 0, 0, 0);
    }

    public rrGi_1(int n, int n2, int n3) {
        this(n, n2, n3, 0);
    }

    public rrGi_1(double d, double d2, double d3) {
        this(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3));
    }

    public void id_class(rfH_2 rfH_22, rpr_3 rpr_32, rpr_3 rpr_33) {
        this.id_class = rfH_22.b_() + rpr_32.id_implements() + rpr_33.id_implements();
        this.id_break = rfH_22.c_() + rpr_32.id_finally() + rpr_33.id_finally();
        this.id_catch = rfH_22.d_() + rpr_32.id_extends() + rpr_33.id_extends();
    }

    public void id_class(rfH_2 rfH_22, rpr_3 rpr_32) {
        this.id_class = rfH_22.b_() + rpr_32.id_implements();
        this.id_break = rfH_22.c_() + rpr_32.id_finally();
        this.id_catch = rfH_22.d_() + rpr_32.id_extends();
    }

    @Override
    public rfH_2 id_class(rpr_3 rpr_32, int n) {
        return n == 1 ? this.id_break(rpr_32) : super.id_class(rpr_32, n).id_int();
    }

    public void id_class(int n, int n2, int n3) {
        this.id_class = n;
        this.id_break = n2;
        this.id_catch = n3;
        this.id_finally = true;
    }

    @Override
    public /* synthetic */ rja_3 id_break(rpr_3 rpr_32, int n) {
        return this.id_class(rpr_32, n);
    }

    @Override
    public rfH_2 id_break(rpr_3 rpr_32) {
        int n;
        rrGi_1 rrGi_12;
        if (this.id_private <= 0) {
            return super.id_class(rpr_32, 1).id_int();
        }
        if (this.id_implements == null) {
            this.id_implements = new rrGi_1[rpr_3.VALUES.length];
        }
        if (this.id_finally) {
            this.id_finally();
        }
        if ((rrGi_12 = this.id_implements[n = rpr_32.id_byte()]) == null) {
            int n2 = this.id_class + rpr_32.id_implements();
            int n3 = this.id_break + rpr_32.id_finally();
            int n4 = this.id_catch + rpr_32.id_extends();
            this.id_implements[n] = rrGi_12 = new rrGi_1(n2, n3, n4, this.id_private - 1);
        }
        return rrGi_12;
    }

    public void id_break(double d, double d2, double d3) {
        this.id_class(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3));
    }

    private void id_finally() {
        for (int i = 0; i < 6; ++i) {
            rrGi_1 rrGi_12 = this.id_implements[i];
            if (rrGi_12 == null) continue;
            rpr_3 rpr_32 = rpr_3.VALUES[i];
            int n = this.id_class + rpr_32.id_implements();
            int n2 = this.id_break + rpr_32.id_finally();
            int n3 = this.id_catch + rpr_32.id_extends();
            rrGi_12.id_class(n, n2, n3);
        }
        this.id_finally = false;
    }

    @Override
    public int c_() {
        return this.id_break;
    }

    @Override
    public int b_() {
        return this.id_class;
    }

    @Override
    public int d_() {
        return this.id_catch;
    }
}

