/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 */
package celestial;

import celestial.Hd_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.cZ_2;
import celestial.rVj_1;
import celestial.rfU_2;
import celestial.rgL_2;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgX_2;
import celestial.rgc_3;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjo_3;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.rrWA;
import celestial.rrWn_1;
import celestial.rrxz_3;
import celestial.uG_2;
import celestial.uX_2;
import celestial.ud_3;
import celestial.yb_3;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class cm_3 {
    private static final rje_3 id_protected = new rje_3(0.0f, 0.0f, 0.03f);
    public final int id_class;
    public final Random id_break = new Random();
    private final Function<rqO_2, uG_2> id_throws;
    private final rVj_1 id_case;
    private boolean id_catch = false;
    private rrxz_3 id_private = new rrxz_3();
    private uX_2 id_implements = new rrWA(4.0f);
    public static boolean id_byte = false;

    public int id_byte(Ml_1 ml_1, rgP_2 rgP_22, float f, float f2, int n) {
        RenderSystem.enableAlphaTest();
        return this.id_class(rgP_22.id_catch(), f, f2, n, ml_1.id_byte().id_class(), false);
    }

    private float id_byte(rpl_3 rpl_32, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3) {
        cZ_2 cZ_22 = new cZ_2(this, hx_1, f, f2, n, bl, rjV_22, bl2, n3);
        rpl_32.accept(cZ_22);
        return cZ_22.id_class(n2, f);
    }

    public cm_3(Function<rqO_2, uG_2> function) {
        this.id_class = 9;
        this.id_throws = function;
        this.id_case = new rVj_1((n, rgc_32) -> this.id_class(rgc_32.id_extends()).id_class(n).id_class(rgc_32.id_break()));
    }

    public int id_class(rgP_2 rgP_22, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3) {
        return this.id_class(rgP_22.id_catch(), f, f2, n, bl, rjV_22, hx_1, bl2, n2, n3);
    }

    public int id_class(rpl_3 rpl_32, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3) {
        return this.id_break(rpl_32, f, f2, n, bl, rjV_22, hx_1, bl2, n2, n3);
    }

    private static int id_class(int n) {
        if (id_byte) {
            return n;
        }
        return (n & 0xFC000000) == 0 ? n | 0xFF000000 : n;
    }

    public uG_2 id_class(rqO_2 rqO_22) {
        return this.id_throws.apply(rqO_22);
    }

    public void id_class(ud_3 ud_32, boolean bl, boolean bl2, float f, float f2, float f3, rjV_2 rjV_22, Ok_1 ok_1, float f4, float f5, float f6, float f7, int n) {
        ud_32.id_class(bl2, f2, f3, rjV_22, ok_1, f4, f5, f6, f7, n);
        if (bl) {
            ud_32.id_class(bl2, f2 + f, f3, rjV_22, ok_1, f4, f5, f6, f7, n);
        }
    }

    private int id_class(rpl_3 rpl_32, float f, float f2, int n, rjV_2 rjV_22, boolean bl, boolean bl2) {
        Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
        int n2 = this.id_class(rpl_32, f, f2, n, bl2, rjV_22, (Hx_1)hd_1, bl, 0, 0xF000F0);
        hd_1.id_break();
        return n2;
    }

    private int id_class(rpl_3 rpl_32, float f, float f2, int n, rjV_2 rjV_22, boolean bl, int n2, boolean bl2) {
        Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
        int n3 = this.id_class(rpl_32, f, f2, n, bl2, rjV_22, (Hx_1)hd_1, bl, n2, 0xF000F0);
        hd_1.id_break();
        return n3;
    }

    public int id_class(Ml_1 ml_1, String string, float f, float f2, int n) {
        return this.id_class(string, f, f2, n, ml_1.id_byte().id_class(), true, this.id_class());
    }

    public int id_class(String string, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3, boolean bl3) {
        return this.id_break(string, f, f2, n, bl, rjV_22, hx_1, bl2, n2, n3, bl3);
    }

    public rgS_2 id_class(rgS_2 rgS_22, int n) {
        return this.id_case.id_class(rgS_22, n, rgc_3.id_class);
    }

    public void id_class(rgS_2 rgS_22, int n, int n2, int n3, int n4) {
        rjV_2 rjV_22 = rjo_3.id_class().id_byte();
        for (rpl_3 rpl_32 : this.id_break(rgS_22, n3)) {
            this.id_class(rpl_32, n, (float)n2, n4, rjV_22, false);
            n2 += 9;
        }
    }

    public boolean id_class() {
        return rgX_2.id_byte().id_class();
    }

    public int id_class(String string, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3) {
        return this.id_class(string, f, f2, n, bl, rjV_22, hx_1, bl2, n2, n3, this.id_class());
    }

    public int id_class(rgS_2 rgS_22) {
        return rfU_2.id_case(this.id_case.id_class(rgS_22));
    }

    public int id_class(rpl_3 rpl_32) {
        return rfU_2.id_case(this.id_case.id_class(rpl_32));
    }

    public String id_class(String string, int n, boolean bl) {
        return bl ? this.id_case.id_byte(string, n, rgc_3.id_class) : this.id_case.id_break(string, n, rgc_3.id_class);
    }

    public String id_class(String string, int n) {
        return this.id_case.id_break(string, n, rgc_3.id_class);
    }

    public int id_class(Ml_1 ml_1, rgP_2 rgP_22, float f, float f2, int n, boolean bl, int n2) {
        RenderSystem.enableAlphaTest();
        return this.id_class(rgP_22.id_catch(), f, f2, n, ml_1.id_byte().id_class(), bl, n2, true);
    }

    public int id_class(Ml_1 ml_1, rgP_2 rgP_22, float f, float f2, int n) {
        RenderSystem.enableAlphaTest();
        return this.id_class(rgP_22.id_catch(), f, f2, n, ml_1.id_byte().id_class(), false);
    }

    public int id_class(Ml_1 ml_1, rpl_3 rpl_32, float f, float f2, int n) {
        RenderSystem.enableAlphaTest();
        return this.id_class(rpl_32, f, f2, n, ml_1.id_byte().id_class(), true);
    }

    public int id_class(Ml_1 ml_1, rgP_2 rgP_22, int n, int n2, int n3) {
        return this.id_class(ml_1, rgP_22, (float)(n - this.id_class(rgP_22) / 2), (float)n2, n3);
    }

    public int id_class(Ml_1 ml_1, String string, int n, int n2, int n3) {
        return this.id_class(string, (float)(n - this.id_break(string) / 2), (float)n2, n3, ml_1.id_byte().id_class(), false, this.id_class());
    }

    public int id_class(Ml_1 ml_1, String string, float f, float f2, int n, boolean bl, boolean bl2) {
        return this.id_class(string, f, f2, n, ml_1.id_byte().id_class(), bl, bl2, this.id_class());
    }

    private int id_class(String string, float f, float f2, int n, rjV_2 rjV_22, boolean bl, boolean bl2, boolean bl3) {
        if (string == null) {
            return 0;
        }
        Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
        int n2 = this.id_class(string, f, f2, n, bl, rjV_22, hd_1, bl2, 0, 0xF000F0, bl3);
        hd_1.id_break();
        return n2;
    }

    public int id_class(Ml_1 ml_1, String string, float f, float f2, int n, boolean bl) {
        return this.id_class(string, f, f2, n, ml_1.id_byte().id_class(), true, bl, this.id_class());
    }

    private int id_class(String string, float f, float f2, int n, rjV_2 rjV_22, boolean bl, boolean bl2) {
        if (string == null) {
            return 0;
        }
        Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
        int n2 = this.id_class(string, f, f2, n, bl, rjV_22, hd_1, false, 0, 0xF000F0, bl2);
        hd_1.id_break();
        return n2;
    }

    public String id_class(String string) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(8).shape(string), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }

    private int id_class(rpl_3 rpl_32, float f, float f2, int n, rjV_2 rjV_22, boolean bl) {
        Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
        int n2 = this.id_class(rpl_32, f, f2, n, bl, rjV_22, (Hx_1)hd_1, false, 0, 0xF000F0);
        hd_1.id_break();
        return n2;
    }

    public void id_class(List<String> list, rrWn_1[] rrWn_1Array, int n, rjV_2 rjV_22, boolean bl, boolean bl2) {
        Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
        for (int i = 0; i < list.size(); ++i) {
            rrWn_1 rrWn_12;
            String string = list.get(i);
            if (string == null || string.isEmpty() || (rrWn_12 = rrWn_1Array[i]) == null) continue;
            float f = rrWn_12.id_class();
            float f2 = rrWn_12.id_break();
            this.id_class(string, f, f2, n, bl, rjV_22, hd_1, false, 0, 0xF000F0, bl2);
        }
        hd_1.id_break();
    }

    public int id_break(Ml_1 ml_1, rgP_2 rgP_22, int n, int n2, int n3) {
        return this.id_break(ml_1, rgP_22, (float)(n - this.id_class(rgP_22) / 2), (float)n2, n3);
    }

    public int id_break(String string, int n) {
        return 9 * this.id_case.id_protected(string, n, rgc_3.id_class).size();
    }

    public int id_break(Ml_1 ml_1, rpl_3 rpl_32, float f, float f2, int n) {
        RenderSystem.enableAlphaTest();
        return this.id_class(rpl_32, f, f2, n, ml_1.id_byte().id_class(), false);
    }

    public rVj_1 id_break() {
        return this.id_case;
    }

    public int id_break(Ml_1 ml_1, String string, int n, int n2, int n3) {
        return this.id_class(string, (float)(n - this.id_break(string) / 2), (float)n2, n3, ml_1.id_byte().id_class(), true, this.id_class());
    }

    public List<rpl_3> id_break(rgS_2 rgS_22, int n) {
        return rgX_2.id_byte().id_class(this.id_case.id_break(rgS_22, n, rgc_3.id_class));
    }

    public int id_break(Ml_1 ml_1, rgP_2 rgP_22, float f, float f2, int n) {
        RenderSystem.enableAlphaTest();
        return this.id_class(rgP_22.id_catch(), f, f2, n, ml_1.id_byte().id_class(), true);
    }

    private float id_break(String string, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3) {
        cZ_2 cZ_22 = new cZ_2(this, hx_1, f, f2, n, bl, rjV_22, bl2, n3);
        rgL_2.id_byte(string, rgc_3.id_class, cZ_22);
        return cZ_22.id_class(n2, f);
    }

    private int id_break(rpl_3 rpl_32, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3) {
        n = cm_3.id_class(n);
        rjV_2 rjV_23 = rjV_22.id_case();
        if (bl) {
            this.id_byte(rpl_32, f, f2, n, true, rjV_22, hx_1, bl2, n2, n3);
            rjV_23.id_class(id_protected);
        }
        f = this.id_byte(rpl_32, f, f2, n, false, rjV_23, hx_1, bl2, n2, n3);
        return (int)f + (bl ? 1 : 0);
    }

    private int id_break(String string, float f, float f2, int n, boolean bl, rjV_2 rjV_22, Hx_1 hx_1, boolean bl2, int n2, int n3, boolean bl3) {
        if (bl3) {
            string = this.id_class(string);
        }
        n = cm_3.id_class(n);
        rjV_2 rjV_23 = rjV_22.id_case();
        if (bl) {
            this.id_break(string, f, f2, n, true, rjV_22, hx_1, bl2, n2, n3);
            rjV_23.id_class(id_protected);
        }
        f = this.id_break(string, f, f2, n, false, rjV_23, hx_1, bl2, n2, n3);
        return (int)f + (bl ? 1 : 0);
    }

    public int id_break(Ml_1 ml_1, String string, float f, float f2, int n, boolean bl) {
        RenderSystem.enableAlphaTest();
        return this.id_class(string, f, f2, n, ml_1.id_byte().id_class(), true, bl);
    }

    public int id_break(Ml_1 ml_1, String string, float f, float f2, int n) {
        RenderSystem.enableAlphaTest();
        return this.id_class(string, f, f2, n, ml_1.id_byte().id_class(), false, this.id_class());
    }

    public float id_break(rgS_2 rgS_22) {
        return this.id_case.id_class(rgS_22);
    }

    public int id_break(String string) {
        return rfU_2.id_case(this.id_case.id_class(string));
    }
}

