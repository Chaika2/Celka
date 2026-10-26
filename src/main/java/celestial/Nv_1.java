/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NI;
import celestial.NN;
import celestial.NQ;
import celestial.Nf_1;
import celestial.Nq_1;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqO_2;

public abstract class Nv_1
implements NQ {
    protected Nq_1 id_break;
    protected final rqL_2 id_byte;
    protected final rqO_2 id_protected;
    protected float id_throws = 1.0f;
    protected float id_case = 1.0f;
    protected double id_catch;
    protected double id_private;
    protected double id_implements;
    protected boolean id_finally;
    protected int id_extends;
    protected NN id_native = NN.LINEAR;
    protected boolean id_volatile;
    protected boolean id_final;

    @Override
    public double id_int() {
        return this.id_implements;
    }

    protected Nv_1(rqA_2 rqA_22, rqL_2 rqL_22) {
        this(rqA_22.id_class(), rqL_22);
    }

    protected Nv_1(rqO_2 rqO_22, rqL_2 rqL_22) {
        this.id_protected = rqO_22;
        this.id_byte = rqL_22;
    }

    public String toString() {
        return "SoundInstance[" + this.id_protected + "]";
    }

    @Override
    public NI id_class(Nf_1 nf_1) {
        NI nI = nf_1.id_class(this.id_protected);
        this.id_break = nI == null ? Nf_1.id_class : nI.id_byte();
        return nI;
    }

    @Override
    public boolean id_finally() {
        return this.id_final;
    }

    @Override
    public Nq_1 id_catch() {
        return this.id_break;
    }

    @Override
    public int id_extends() {
        return this.id_extends;
    }

    @Override
    public rqO_2 id_case() {
        return this.id_protected;
    }

    @Override
    public boolean id_implements() {
        return this.id_finally;
    }

    @Override
    public NN id_new() {
        return this.id_native;
    }

    @Override
    public double id_package() {
        return this.id_private;
    }

    @Override
    public rqL_2 id_private() {
        return this.id_byte;
    }

    @Override
    public double id_final() {
        return this.id_catch;
    }

    @Override
    public float id_volatile() {
        return this.id_case * this.id_break.id_case();
    }

    @Override
    public float id_native() {
        return this.id_throws * this.id_break.id_throws();
    }
}

