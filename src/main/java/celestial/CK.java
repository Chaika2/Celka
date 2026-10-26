/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;

public class CK
extends lO_2 {
    protected final Ch_1 id_class;
    private final float id_break;
    private float id_interface = 0.91f;
    private float id_char;
    private float id_abstract;
    private float id_long;
    private boolean id_float;

    public void id_byte(int n) {
        this.id_char = (float)((n & 0xFF0000) >> 16) / 255.0f;
        this.id_abstract = (float)((n & 0xFF00) >> 8) / 255.0f;
        this.id_long = (float)((n & 0xFF) >> 0) / 255.0f;
        this.id_float = true;
    }

    protected CK(gm_3 gm_32, double d, double d2, double d3, Ch_1 ch_1, float f) {
        super(gm_32, d, d2, d3);
        this.id_class = ch_1;
        this.id_break = f;
    }

    @Override
    public CJ id_class() {
        return CJ.id_byte;
    }

    @Override
    public int id_break(float f) {
        return 0xF000F0;
    }

    public void id_break(int n) {
        float f = (float)((n & 0xFF0000) >> 16) / 255.0f;
        float f2 = (float)((n & 0xFF00) >> 8) / 255.0f;
        float f3 = (float)((n & 0xFF) >> 0) / 255.0f;
        float f4 = 1.0f;
        this.id_class(f * 1.0f, f2 * 1.0f, f3 * 1.0f);
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            this.id_break(this.id_class);
            if (this.id_super > this.id_this / 2) {
                this.id_throws(1.0f - ((float)this.id_super - (float)(this.id_this / 2)) / (float)this.id_this);
                if (this.id_float) {
                    this.id_synchronized += (this.id_char - this.id_synchronized) * 0.2f;
                    this.id_return += (this.id_abstract - this.id_return) * 0.2f;
                    this.id_public += (this.id_long - this.id_public) * 0.2f;
                }
            }
            this.id_extends += (double)this.id_break;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)this.id_interface;
            this.id_extends *= (double)this.id_interface;
            this.id_native *= (double)this.id_interface;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }

    protected void id_case(float f) {
        this.id_interface = f;
    }
}

