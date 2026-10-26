/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.fc_3;
import celestial.uF_2;
import celestial.uJ_2;

public class uL_2
implements uJ_2 {
    private final int id_break;
    private final int id_byte;
    private final float id_protected;
    private final float id_throws;
    private final float id_case;
    private final int id_catch;
    public final /* synthetic */ uF_2 id_class;

    @Override
    public float id_byte() {
        return this.id_class.id_byte;
    }

    public uL_2(uF_2 uF_22, int n, int n2, int n3, int n4, float f, float f2, int n5) {
        this.id_class = uF_22;
        this.id_break = n2 - n;
        this.id_byte = n3 - n4;
        this.id_case = f / uF_22.id_byte;
        this.id_protected = (f2 + (float)n + uF_22.id_throws) / uF_22.id_byte;
        this.id_throws = (uF_22.id_private - (float)n3 + uF_22.id_case) / uF_22.id_byte;
        this.id_catch = n5;
    }

    @Override
    public void id_class(int n, int n2) {
        fN_2 fN_22 = new fN_2(fc_3.LUMINANCE, this.id_break, this.id_byte, false);
        fN_22.id_class(this.id_class.id_break, this.id_catch, this.id_break, this.id_byte, this.id_class.id_catch, this.id_class.id_catch, this.id_class.id_throws, this.id_class.id_case, 0, 0);
        fN_22.id_class(0, n, n2, 0, 0, this.id_break, this.id_byte, false, true);
    }

    @Override
    public int id_class() {
        return this.id_break;
    }

    @Override
    public int id_break() {
        return this.id_byte;
    }

    @Override
    public float id_throws() {
        return this.id_protected;
    }

    @Override
    public boolean id_protected() {
        return false;
    }

    @Override
    public float id_native() {
        return this.id_throws;
    }

    @Override
    public float getAdvance() {
        return this.id_case;
    }
}

