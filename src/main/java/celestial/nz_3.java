/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.QY;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.yX_2;

public class nz_3
extends lO_2 {
    private final xc_3 id_class;
    private rfH_2 id_break;
    private final float id_interface;
    private final float id_char;

    @Override
    protected float id_byte() {
        return this.id_instanceof.id_class((double)(this.id_interface / 4.0f * 16.0f));
    }

    public nz_3(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, xc_3 xc_32) {
        super(gm_32, d, d2, d3, d4, d5, d6);
        this.id_class = xc_32;
        this.id_class(QY.id_instanceof().id_synchronized().id_break().id_class(xc_32));
        this.id_else = 1.0f;
        this.id_synchronized = 0.6f;
        this.id_return = 0.6f;
        this.id_public = 0.6f;
        this.id_throw /= 2.0f;
        this.id_interface = this.id_continue.nextFloat() * 3.0f;
        this.id_char = this.id_continue.nextFloat() * 3.0f;
    }

    @Override
    public CJ id_class() {
        return CJ.id_class;
    }

    public nz_3 id_class(rfH_2 rfH_22) {
        this.id_break = rfH_22;
        if (this.id_class.id_class(xu_3.id_implements)) {
            return this;
        }
        this.id_break(rfH_22);
        return this;
    }

    @Override
    protected float id_break() {
        return this.id_instanceof.id_class((double)((this.id_interface + 1.0f) / 4.0f * 16.0f));
    }

    @Override
    public int id_break(float f) {
        int n = super.id_break(f);
        int n2 = 0;
        if (this.id_byte.id_int(this.id_break)) {
            n2 = yX_2.id_class(this.id_byte, this.id_break);
        }
        return n == 0 ? n2 : n;
    }

    protected void id_break(rfH_2 rfH_22) {
        int n = QY.id_instanceof().s().id_class(this.id_class, this.id_byte, rfH_22, 0);
        this.id_synchronized *= (float)(n >> 16 & 0xFF) / 255.0f;
        this.id_return *= (float)(n >> 8 & 0xFF) / 255.0f;
        this.id_public *= (float)(n & 0xFF) / 255.0f;
    }

    @Override
    protected float id_throws() {
        return this.id_instanceof.id_break((double)((this.id_char + 1.0f) / 4.0f * 16.0f));
    }

    public nz_3 id_catch() {
        this.id_break = new rfH_2(this.id_catch, this.id_private, this.id_implements);
        if (this.id_class.id_class(xu_3.id_implements)) {
            return this;
        }
        this.id_break(this.id_break);
        return this;
    }

    @Override
    protected float id_protected() {
        return this.id_instanceof.id_break((double)(this.id_char / 4.0f * 16.0f));
    }
}

