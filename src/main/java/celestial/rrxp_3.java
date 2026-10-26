/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hd_1;
import celestial.Ok_1;
import celestial.fj_3;
import celestial.rje_3;
import celestial.rrxq_3;

public abstract class rrxp_3
implements Ok_1 {
    private Ok_1 id_class;

    @Override
    public HU id_byte() {
        return this.id_class.id_byte();
    }

    @Override
    public int[] id_byte(int n, int n2, int n3, int n4) {
        return this.id_class.id_byte(n, n2, n3, n4);
    }

    @Override
    public void id_byte(float f, float f2, float f3) {
        this.id_class.id_byte(f, f2, f3);
    }

    public rrxp_3(Ok_1 ok_1) {
        this.id_class = ok_1;
    }

    @Override
    public void id_class(rrxq_3[] rrxq_3Array) {
        this.id_class.id_class(rrxq_3Array);
    }

    @Override
    public rje_3 id_class(rje_3 rje_32) {
        return this.id_class.id_class(rje_32);
    }

    @Override
    public void id_class(fj_3 fj_32) {
        this.id_class.id_class(fj_32);
    }

    @Override
    public void id_class(boolean bl) {
        this.id_class.id_class(bl);
    }

    @Override
    public void id_class(HU hU) {
        this.id_class.id_class(hU);
    }

    @Override
    public float[] id_break(float f, float f2, float f3, float f4) {
        return this.id_class.id_break(f, f2, f3, f4);
    }

    @Override
    public boolean id_break() {
        return this.id_class.id_break();
    }

    @Override
    public void id_break(fj_3 fj_32) {
        this.id_class.id_break(fj_32);
    }

    @Override
    public rje_3 id_break(float f, float f2, float f3) {
        return this.id_class.id_break(f, f2, f3);
    }

    public Ok_1 id_case() {
        return this.id_class;
    }

    @Override
    public Hd_1 id_protected() {
        return this.id_class.id_protected();
    }
}

