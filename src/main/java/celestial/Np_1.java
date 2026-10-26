/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NN;
import celestial.Nv_1;
import celestial.rfH_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqO_2;

public class Np_1
extends Nv_1 {
    public static Np_1 id_byte(rqA_2 rqA_22, float f, float f2) {
        return new Np_1(rqA_22.id_class(), rqL_2.AMBIENT, f2, f, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
    }

    public Np_1(rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2, rfH_2 rfH_22) {
        this(rqA_22, rqL_22, f, f2, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5);
    }

    public Np_1(rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2, double d, double d2, double d3) {
        this(rqA_22, rqL_22, f, f2, false, 0, NN.LINEAR, d, d2, d3);
    }

    private Np_1(rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2, boolean bl, int n, NN nN, double d, double d2, double d3) {
        this(rqA_22.id_class(), rqL_22, f, f2, bl, n, nN, d, d2, d3, false);
    }

    public Np_1(rqO_2 rqO_22, rqL_2 rqL_22, float f, float f2, boolean bl, int n, NN nN, double d, double d2, double d3, boolean bl2) {
        super(rqO_22, rqL_22);
        this.id_throws = f;
        this.id_case = f2;
        this.id_catch = d;
        this.id_private = d2;
        this.id_implements = d3;
        this.id_finally = bl;
        this.id_extends = n;
        this.id_native = nN;
        this.id_final = bl2;
    }

    public static Np_1 id_class(rqA_2 rqA_22, float f, float f2) {
        return new Np_1(rqA_22.id_class(), rqL_2.MASTER, f2, f, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
    }

    public static Np_1 id_class(rqA_2 rqA_22, float f) {
        return Np_1.id_class(rqA_22, f, 0.25f);
    }

    public static Np_1 id_class(rqA_2 rqA_22) {
        return new Np_1(rqA_22.id_class(), rqL_2.MUSIC, 1.0f, 1.0f, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
    }

    public static Np_1 id_class(rqA_2 rqA_22, double d, double d2, double d3) {
        return new Np_1(rqA_22, rqL_2.RECORDS, 4.0f, 1.0f, false, 0, NN.LINEAR, d, d2, d3);
    }

    public static Np_1 id_break(rqA_2 rqA_22, double d, double d2, double d3) {
        return new Np_1(rqA_22, rqL_2.AMBIENT, 1.0f, 1.0f, false, 0, NN.LINEAR, d, d2, d3);
    }

    public static Np_1 id_break(rqA_2 rqA_22, float f, float f2) {
        return new Np_1(rqA_22.id_class(), rqL_2.CLIENT, f, f2, false, 0, NN.NONE, 0.0, 0.0, 0.0, true);
    }

    public static Np_1 id_break(rqA_2 rqA_22) {
        return Np_1.id_byte(rqA_22, 1.0f, 1.0f);
    }
}

