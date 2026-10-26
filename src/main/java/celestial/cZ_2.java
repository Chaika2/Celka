/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Hx_1;
import celestial.Ok_1;
import celestial.cm_3;
import celestial.rVa_1;
import celestial.rgc_3;
import celestial.rjV_2;
import celestial.rpv_3;
import celestial.uE_2;
import celestial.uG_2;
import celestial.uX_2;
import celestial.ud_3;
import celestial.uk_3;
import com.google.common.collect.Lists;
import java.util.List;

public class cZ_2
implements rpv_3 {
    public final Hx_1 id_class;
    private final boolean id_byte;
    private final float id_protected;
    private final float id_throws;
    private final float id_case;
    private final float id_catch;
    private final float id_private;
    private final rjV_2 id_implements;
    private final boolean id_finally;
    private final int id_extends;
    private float id_native;
    private float id_volatile;
    private List<uk_3> id_final;
    private rgc_3 id_package;
    private uG_2 id_int;
    public final /* synthetic */ cm_3 id_break;

    public cZ_2(cm_3 cm_32, Hx_1 hx_1, float f, float f2, int n, boolean bl, rjV_2 rjV_22, boolean bl2, int n2) {
        this.id_break = cm_32;
        this.id_class = hx_1;
        this.id_native = f;
        this.id_volatile = f2;
        this.id_byte = bl;
        this.id_protected = bl ? 0.25f : 1.0f;
        this.id_throws = (float)(n >> 16 & 0xFF) / 255.0f * this.id_protected;
        this.id_case = (float)(n >> 8 & 0xFF) / 255.0f * this.id_protected;
        this.id_catch = (float)(n & 0xFF) / 255.0f * this.id_protected;
        this.id_private = (float)(n >> 24 & 0xFF) / 255.0f;
        this.id_implements = rjV_22.id_break() ? ud_3.id_class : rjV_22;
        this.id_finally = bl2;
        this.id_extends = n2;
    }

    public float id_class(int n, float f) {
        if (n != 0) {
            float f2 = (float)(n >> 24 & 0xFF) / 255.0f;
            float f3 = (float)(n >> 16 & 0xFF) / 255.0f;
            float f4 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f5 = (float)(n & 0xFF) / 255.0f;
            this.id_class(new uk_3(f - 1.0f, this.id_volatile + 9.0f, this.id_native + 1.0f, this.id_volatile - 1.0f, 0.01f, f3, f4, f5, f2));
        }
        if (this.id_final != null) {
            ud_3 ud_32 = this.id_break.id_class(rgc_3.id_break).id_class();
            Ok_1 ok_1 = this.id_class.getBuffer(ud_32.id_class(this.id_finally));
            for (uk_3 uk_32 : this.id_final) {
                ud_32.id_class(uk_32, this.id_implements, ok_1, this.id_extends);
            }
        }
        return this.id_native;
    }

    private uG_2 id_class(rgc_3 rgc_32) {
        if (rgc_32 == this.id_package) {
            return this.id_int;
        }
        this.id_package = rgc_32;
        this.id_int = this.id_break.id_class(rgc_32.id_extends());
        return this.id_int;
    }

    private void id_class(uk_3 uk_32) {
        if (this.id_final == null) {
            this.id_final = Lists.newArrayList();
        }
        this.id_final.add(uk_32);
    }

    @Override
    public boolean accept(int n, rgc_3 rgc_32, int n2) {
        float f;
        float f2;
        float f3;
        float f4;
        uG_2 uG_22 = this.id_class(rgc_32);
        uX_2 uX_22 = uG_22.id_class(n2);
        ud_3 ud_32 = rgc_32.id_case() && n2 != 32 ? uG_22.id_class(uX_22) : uG_22.id_break(n2);
        boolean bl = rgc_32.id_break();
        float f5 = this.id_private;
        rVa_1 rVa_12 = rgc_32.id_class();
        if (rVa_12 != null) {
            int n3 = rVa_12.id_class();
            f4 = (float)(n3 >> 16 & 0xFF) / 255.0f * this.id_protected;
            f3 = (float)(n3 >> 8 & 0xFF) / 255.0f * this.id_protected;
            f2 = (float)(n3 & 0xFF) / 255.0f * this.id_protected;
        } else {
            f4 = this.id_throws;
            f3 = this.id_case;
            f2 = this.id_catch;
        }
        if (!(ud_32 instanceof uE_2)) {
            float f6 = bl ? uX_22.id_case() : 0.0f;
            f = this.id_byte ? uX_22.id_catch() : 0.0f;
            Ok_1 ok_1 = this.id_class.getBuffer(ud_32.id_class(this.id_finally));
            this.id_break.id_class(ud_32, bl, rgc_32.id_byte(), f6, this.id_native + f, this.id_volatile + f, this.id_implements, ok_1, f4, f3, f2, f5, this.id_extends);
        }
        float f7 = uX_22.id_class(bl);
        float f8 = f = this.id_byte ? 1.0f : 0.0f;
        if (rgc_32.id_protected()) {
            this.id_class(new uk_3(this.id_native + f - 1.0f, this.id_volatile + f + 4.5f, this.id_native + f + f7, this.id_volatile + f + 4.5f - 1.0f, 0.01f, f4, f3, f2, f5));
        }
        if (rgc_32.id_throws()) {
            this.id_class(new uk_3(this.id_native + f - 1.0f, this.id_volatile + f + 9.0f, this.id_native + f + f7, this.id_volatile + f + 9.0f - 1.0f, 0.01f, f4, f3, f2, f5));
        }
        this.id_native += f7;
        return true;
    }
}

