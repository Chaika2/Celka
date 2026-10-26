/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Ok_1;
import celestial.lD_2;
import celestial.rjV_2;
import celestial.rrWD;
import celestial.uk_3;

public class ud_3 {
    private final HU id_break;
    private final HU id_byte;
    private final float id_protected;
    private final float id_throws;
    private final float id_case;
    private final float id_catch;
    private final float id_private;
    private final float id_implements;
    private final float id_finally;
    private final float id_extends;
    public static final rjV_2 id_class = rrWD.id_class();

    public ud_3(HU hU, HU hU2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.id_break = hU;
        this.id_byte = hU2;
        this.id_protected = f;
        this.id_throws = f2;
        this.id_case = f3;
        this.id_catch = f4;
        this.id_private = f5;
        this.id_implements = f6;
        this.id_finally = f7;
        this.id_extends = f8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void id_class(boolean bl, float f, float f2, rjV_2 rjV_22, Ok_1 ok_1, float f3, float f4, float f5, float f6, int n) {
        float f7;
        float f8 = f + this.id_private;
        float f9 = f + this.id_implements;
        float f10 = this.id_finally - 3.0f;
        float f11 = this.id_extends - 3.0f;
        float f12 = f2 + f10;
        float f13 = f2 + f11;
        float f14 = bl ? 1.0f - 0.25f * f10 : 0.0f;
        float f15 = f7 = bl ? 1.0f - 0.25f * f11 : 0.0f;
        if (ok_1 instanceof lD_2) {
            lD_2 lD_22 = (lD_2)ok_1;
            if (rjV_22 == id_class) {
                int n2 = (int)(f3 * 255.0f);
                int n3 = (int)(f4 * 255.0f);
                int n4 = (int)(f5 * 255.0f);
                int n5 = (int)(f6 * 255.0f);
                int n6 = n & 0xFFFF;
                int n7 = n >> 16 & 0xFFFF;
                lD_22.id_class(f8 + f14, f12, 0.0f, n2, n3, n4, n5, this.id_protected, this.id_case, n6, n7);
                lD_22.id_class(f8 + f7, f13, 0.0f, n2, n3, n4, n5, this.id_protected, this.id_catch, n6, n7);
                lD_22.id_class(f9 + f7, f13, 0.0f, n2, n3, n4, n5, this.id_throws, this.id_catch, n6, n7);
                lD_22.id_class(f9 + f14, f12, 0.0f, n2, n3, n4, n5, this.id_throws, this.id_case, n6, n7);
                return;
            }
        }
        ok_1.id_class(rjV_22, f8 + f14, f12, 0.0f).id_class(f3, f4, f5, f6).id_class(this.id_protected, this.id_case).id_break(n).id_class();
        ok_1.id_class(rjV_22, f8 + f7, f13, 0.0f).id_class(f3, f4, f5, f6).id_class(this.id_protected, this.id_catch).id_break(n).id_class();
        ok_1.id_class(rjV_22, f9 + f7, f13, 0.0f).id_class(f3, f4, f5, f6).id_class(this.id_throws, this.id_catch).id_break(n).id_class();
        ok_1.id_class(rjV_22, f9 + f14, f12, 0.0f).id_class(f3, f4, f5, f6).id_class(this.id_throws, this.id_case).id_break(n).id_class();
    }

    public HU id_class(boolean bl) {
        return bl ? this.id_byte : this.id_break;
    }

    public void id_class(uk_3 uk_32, rjV_2 rjV_22, Ok_1 ok_1, int n) {
        ok_1.id_class(rjV_22, uk_32.id_class, uk_32.id_break, uk_32.id_throws).id_class(uk_32.id_case, uk_32.id_catch, uk_32.id_private, uk_32.id_implements).id_class(this.id_protected, this.id_case).id_break(n).id_class();
        ok_1.id_class(rjV_22, uk_32.id_byte, uk_32.id_break, uk_32.id_throws).id_class(uk_32.id_case, uk_32.id_catch, uk_32.id_private, uk_32.id_implements).id_class(this.id_protected, this.id_catch).id_break(n).id_class();
        ok_1.id_class(rjV_22, uk_32.id_byte, uk_32.id_protected, uk_32.id_throws).id_class(uk_32.id_case, uk_32.id_catch, uk_32.id_private, uk_32.id_implements).id_class(this.id_throws, this.id_catch).id_break(n).id_class();
        ok_1.id_class(rjV_22, uk_32.id_class, uk_32.id_protected, uk_32.id_throws).id_class(uk_32.id_case, uk_32.id_catch, uk_32.id_private, uk_32.id_implements).id_class(this.id_throws, this.id_case).id_break(n).id_class();
    }
}

