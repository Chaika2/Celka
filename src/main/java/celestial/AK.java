/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.QY;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rdn_3;

public class AK
extends lO_2 {
    private final float id_class;
    private final float id_break;

    @Override
    protected float id_byte() {
        return this.id_instanceof.id_class((double)(this.id_class / 4.0f * 16.0f));
    }

    public AK(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, rdn_3 rdn_32) {
        this(gm_32, d, d2, d3, rdn_32);
        this.id_finally *= (double)0.1f;
        this.id_extends *= (double)0.1f;
        this.id_native *= (double)0.1f;
        this.id_finally += d4;
        this.id_extends += d5;
        this.id_native += d6;
    }

    protected AK(gm_3 gm_32, double d, double d2, double d3, rdn_3 rdn_32) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        this.id_class(QY.id_instanceof().id_float().id_class(rdn_32, gm_32, null).id_throws());
        this.id_else = 1.0f;
        this.id_throw /= 2.0f;
        this.id_class = this.id_continue.nextFloat() * 3.0f;
        this.id_break = this.id_continue.nextFloat() * 3.0f;
    }

    @Override
    public CJ id_class() {
        return CJ.id_class;
    }

    @Override
    protected float id_break() {
        return this.id_instanceof.id_class((double)((this.id_class + 1.0f) / 4.0f * 16.0f));
    }

    @Override
    protected float id_throws() {
        return this.id_instanceof.id_break((double)((this.id_break + 1.0f) / 4.0f * 16.0f));
    }

    @Override
    protected float id_protected() {
        return this.id_instanceof.id_break((double)(this.id_break / 4.0f * 16.0f));
    }
}

