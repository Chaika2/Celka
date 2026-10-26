/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ok_1;
import celestial.jF_2;
import celestial.jL_2;
import celestial.jv_3;
import celestial.rfU_2;
import celestial.util.ColorHelper;

public interface OW
extends Ok_1 {
    @Override
    default public Ok_1 id_byte(int n, int n2) {
        return this.id_class((short)n, (short)n2, 2);
    }

    @Override
    default public Ok_1 id_class(float f, float f2) {
        jv_3 jv_32 = this.id_case();
        if (jv_32.id_break() == jL_2.UV && jv_32.id_byte() == 0) {
            if (jv_32.id_class() != jF_2.FLOAT) {
                throw new IllegalStateException();
            }
            this.id_class(0, f);
            this.id_class(4, f2);
            this.id_catch();
            return this;
        }
        return this;
    }

    public static byte id_class(float f) {
        return (byte)((int)(rfU_2.id_class(f, -1.0f, 1.0f) * 127.0f) & 0xFF);
    }

    @Override
    default public Ok_1 id_class(int n, int n2) {
        jv_3 jv_32 = this.id_case();
        if (jv_32.id_break() != jL_2.COLOR) {
            return this;
        }
        if (jv_32.id_class() != jF_2.UBYTE) {
            throw new IllegalStateException();
        }
        this.id_class(0, (byte)ColorHelper.id_byte(n));
        this.id_class(1, (byte)ColorHelper.id_protected(n));
        this.id_class(2, (byte)ColorHelper.id_break(n));
        this.id_class(3, (byte)n2);
        this.id_catch();
        return this;
    }

    default public Ok_1 id_class(short s, short s2, int n) {
        jv_3 jv_32 = this.id_case();
        if (jv_32.id_break() == jL_2.UV && jv_32.id_byte() == n) {
            if (jv_32.id_class() != jF_2.SHORT) {
                throw new IllegalStateException();
            }
            this.id_class(0, s);
            this.id_class(2, s2);
            this.id_catch();
            return this;
        }
        return this;
    }

    @Override
    default public Ok_1 id_class(float f, float f2, float f3) {
        jv_3 jv_32 = this.id_case();
        if (jv_32.id_break() != jL_2.NORMAL) {
            return this;
        }
        if (jv_32.id_class() != jF_2.BYTE) {
            throw new IllegalStateException();
        }
        this.id_class(0, OW.id_class(f));
        this.id_class(1, OW.id_class(f2));
        this.id_class(2, OW.id_class(f3));
        this.id_catch();
        return this;
    }

    public void id_class(int var1, byte var2);

    public void id_class(int var1, short var2);

    public void id_class(int var1, float var2);

    @Override
    default public Ok_1 id_class(double d, double d2, double d3) {
        if (this.id_case().id_class() != jF_2.FLOAT) {
            throw new IllegalStateException();
        }
        this.id_class(0, (float)d);
        this.id_class(4, (float)d2);
        this.id_class(8, (float)d3);
        this.id_catch();
        return this;
    }

    @Override
    default public Ok_1 id_class(int n) {
        jv_3 jv_32 = this.id_case();
        if (jv_32.id_break() != jL_2.COLOR) {
            return this;
        }
        if (jv_32.id_class() != jF_2.UBYTE) {
            throw new IllegalStateException();
        }
        this.id_class(0, (byte)ColorHelper.id_byte(n));
        this.id_class(1, (byte)ColorHelper.id_protected(n));
        this.id_class(2, (byte)ColorHelper.id_break(n));
        this.id_class(3, (byte)ColorHelper.id_throws(n));
        this.id_catch();
        return this;
    }

    @Override
    default public Ok_1 id_break(int n, int n2, int n3, int n4) {
        jv_3 jv_32 = this.id_case();
        if (jv_32.id_break() != jL_2.COLOR) {
            return this;
        }
        if (jv_32.id_class() != jF_2.UBYTE) {
            throw new IllegalStateException();
        }
        this.id_class(0, (byte)n);
        this.id_class(1, (byte)n2);
        this.id_class(2, (byte)n3);
        this.id_class(3, (byte)n4);
        this.id_catch();
        return this;
    }

    @Override
    default public Ok_1 id_break(int n, int n2) {
        return this.id_class((short)n, (short)n2, 1);
    }

    public void id_catch();

    public jv_3 id_case();
}

