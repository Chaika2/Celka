/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.It_1;
import celestial.Iw_1;
import celestial.rpr_3;
import celestial.rrxX_2;
import celestial.rrxq_3;

public class IT {
    public final Iw_1[] id_catch;
    public final float id_class;
    public final float id_break;
    public final float id_byte;
    public final float id_protected;
    public final float id_throws;
    public final float id_case;
    private rrxX_2 id_private;

    public IT(int n, int n2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, float f10, float f11) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
        this.id_protected = f + f4;
        this.id_throws = f2 + f5;
        this.id_case = f3 + f6;
        this.id_catch = new Iw_1[6];
        float f12 = f + f4;
        float f13 = f2 + f5;
        float f14 = f3 + f6;
        f -= f7;
        f2 -= f8;
        f3 -= f9;
        f12 += f7;
        f13 += f8;
        f14 += f9;
        if (bl) {
            float f15 = f12;
            f12 = f;
            f = f15;
        }
        It_1 it_1 = new It_1(f, f2, f3, 0.0f, 0.0f);
        It_1 it_12 = new It_1(f12, f2, f3, 0.0f, 8.0f);
        It_1 it_13 = new It_1(f12, f13, f3, 8.0f, 8.0f);
        It_1 it_14 = new It_1(f, f13, f3, 8.0f, 0.0f);
        It_1 it_15 = new It_1(f, f2, f14, 0.0f, 0.0f);
        It_1 it_16 = new It_1(f12, f2, f14, 0.0f, 8.0f);
        It_1 it_17 = new It_1(f12, f13, f14, 8.0f, 8.0f);
        It_1 it_18 = new It_1(f, f13, f14, 8.0f, 0.0f);
        float f16 = n;
        float f17 = (float)n + f6;
        float f18 = (float)n + f6 + f4;
        float f19 = (float)n + f6 + f4 + f4;
        float f20 = (float)n + f6 + f4 + f6;
        float f21 = (float)n + f6 + f4 + f6 + f4;
        float f22 = n2;
        float f23 = (float)n2 + f6;
        float f24 = (float)n2 + f6 + f5;
        this.id_catch[2] = new Iw_1(new It_1[]{it_16, it_15, it_1, it_12}, f17, f22, f18, f23, f10, f11, bl, rpr_3.DOWN);
        this.id_catch[3] = new Iw_1(new It_1[]{it_13, it_14, it_18, it_17}, f18, f23, f19, f22, f10, f11, bl, rpr_3.UP);
        this.id_catch[1] = new Iw_1(new It_1[]{it_1, it_15, it_18, it_14}, f16, f23, f17, f24, f10, f11, bl, rpr_3.WEST);
        this.id_catch[4] = new Iw_1(new It_1[]{it_12, it_1, it_14, it_13}, f17, f23, f18, f24, f10, f11, bl, rpr_3.NORTH);
        this.id_catch[0] = new Iw_1(new It_1[]{it_16, it_12, it_13, it_17}, f18, f23, f20, f24, f10, f11, bl, rpr_3.EAST);
        this.id_catch[5] = new Iw_1(new It_1[]{it_15, it_16, it_17, it_18}, f20, f23, f21, f24, f10, f11, bl, rpr_3.SOUTH);
    }

    public IT(int[][] nArray, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, float f10, float f11) {
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
        this.id_protected = f + f4;
        this.id_throws = f2 + f5;
        this.id_case = f3 + f6;
        this.id_catch = new Iw_1[6];
        float f12 = f + f4;
        float f13 = f2 + f5;
        float f14 = f3 + f6;
        f -= f7;
        f2 -= f8;
        f3 -= f9;
        f12 += f7;
        f13 += f8;
        f14 += f9;
        if (bl) {
            float f15 = f12;
            f12 = f;
            f = f15;
        }
        It_1 it_1 = new It_1(f, f2, f3, 0.0f, 0.0f);
        It_1 it_12 = new It_1(f12, f2, f3, 0.0f, 8.0f);
        It_1 it_13 = new It_1(f12, f13, f3, 8.0f, 8.0f);
        It_1 it_14 = new It_1(f, f13, f3, 8.0f, 0.0f);
        It_1 it_15 = new It_1(f, f2, f14, 0.0f, 0.0f);
        It_1 it_16 = new It_1(f12, f2, f14, 0.0f, 8.0f);
        It_1 it_17 = new It_1(f12, f13, f14, 8.0f, 8.0f);
        It_1 it_18 = new It_1(f, f13, f14, 8.0f, 0.0f);
        this.id_catch[2] = this.id_class(new It_1[]{it_16, it_15, it_1, it_12}, nArray[1], true, f10, f11, bl, rpr_3.DOWN);
        this.id_catch[3] = this.id_class(new It_1[]{it_13, it_14, it_18, it_17}, nArray[0], true, f10, f11, bl, rpr_3.UP);
        this.id_catch[1] = this.id_class(new It_1[]{it_1, it_15, it_18, it_14}, nArray[5], false, f10, f11, bl, rpr_3.WEST);
        this.id_catch[4] = this.id_class(new It_1[]{it_12, it_1, it_14, it_13}, nArray[2], false, f10, f11, bl, rpr_3.NORTH);
        this.id_catch[0] = this.id_class(new It_1[]{it_16, it_12, it_13, it_17}, nArray[4], false, f10, f11, bl, rpr_3.EAST);
        this.id_catch[5] = this.id_class(new It_1[]{it_15, it_16, it_17, it_18}, nArray[3], false, f10, f11, bl, rpr_3.SOUTH);
    }

    public rrxq_3[][] id_class(int n) {
        if (this.id_private == null) {
            this.id_private = new rrxX_2();
        }
        return (rrxq_3[][])this.id_private.id_class(n);
    }

    private Iw_1 id_class(It_1[] it_1Array, int[] nArray, boolean bl, float f, float f2, boolean bl2, rpr_3 rpr_32) {
        if (nArray == null) {
            return null;
        }
        return bl ? new Iw_1(it_1Array, nArray[2], nArray[3], nArray[0], nArray[1], f, f2, bl2, rpr_32) : new Iw_1(it_1Array, nArray[0], nArray[1], nArray[2], nArray[3], f, f2, bl2, rpr_32);
    }
}

