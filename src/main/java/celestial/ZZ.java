/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.HF;
import celestial.Hd_1;
import celestial.Ig_1;
import celestial.LF;
import celestial.Ma_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.cm_3;
import celestial.fZ_2;
import celestial.jJ_2;
import celestial.jX_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rZy_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rjV_2;
import celestial.rrvs_1;
import celestial.ryS_2;
import celestial.ux_3;
import celestial.vm_3;
import celestial.vs_3;
import celestial.xc_3;
import celestial.yb_3;
import celestial.yk_3;
import celestial.zM_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.stream.IntStream;

public class ZZ
extends vm_3
implements rrvs_1 {
    private final jJ_2 id_class = new jJ_2();
    private final ryS_2 id_throws;
    private int id_case;
    private int id_catch;
    private ux_3 id_private;
    private final String[] id_implements = (String[])IntStream.range(0, 4).mapToObj(ryS_22::id_class).map(rgP_2::getString).toArray(String[]::new);

    public ZZ(ryS_2 ryS_22) {
        super(new rgn_3("sign.edit"));
        this.id_throws = ryS_22;
        vs_3.INSTANCE.id_class(this);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (n == 265) {
            this.id_catch = this.id_catch - 1 & 3;
            this.id_private.id_throws();
            return true;
        }
        if (n != 264 && n != 257 && n != 335) {
            return this.id_private.id_class(n) ? true : super.id_class(n, n2, n3);
        }
        this.id_catch = this.id_catch + 1 & 3;
        this.id_private.id_throws();
        return true;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        int n3;
        int n4;
        String string;
        int n5;
        HF.id_byte();
        this.id_class(ml_1);
        ZZ.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 40, 0xFFFFFF);
        ml_1.id_class();
        ml_1.id_class((double)(this.id_package / 2), 0.0, 50.0);
        float f2 = 93.75f;
        ml_1.id_class(93.75f, -93.75f, 93.75f);
        ml_1.id_class(0.0, -1.3125, 0.0);
        xc_3 xc_32 = this.id_throws.id_abstract();
        boolean bl = xc_32.id_break() instanceof zM_2;
        if (!bl) {
            ml_1.id_class(0.0, -0.3125, 0.0);
        }
        boolean bl2 = this.id_case / 6 % 2 == 0;
        float f3 = 0.6666667f;
        ml_1.id_class();
        ml_1.id_class(0.6666667f, -0.6666667f, -0.6666667f);
        Hd_1 hd_1 = this.id_volatile.id_interface().id_break();
        Ig_1 ig_1 = jX_2.id_class(xc_32.id_break());
        Ok_1 ok_1 = ig_1.id_class(hd_1, this.id_class::id_class);
        this.id_class.id_class.id_class(ml_1, ok_1, 0xF000F0, fZ_2.id_class);
        if (bl) {
            this.id_class.id_break.id_class(ml_1, ok_1, 0xF000F0, fZ_2.id_class);
        }
        ml_1.id_break();
        float f4 = 0.010416667f;
        ml_1.id_class(0.0, 0.3333333432674408, 0.046666666865348816);
        ml_1.id_class(0.010416667f, -0.010416667f, 0.010416667f);
        int n6 = this.id_throws.id_private().id_catch();
        int n7 = this.id_private.id_case();
        int n8 = this.id_private.id_catch();
        int n9 = this.id_catch * 10 - this.id_implements.length * 5;
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        for (n5 = 0; n5 < this.id_implements.length; ++n5) {
            string = this.id_implements[n5];
            if (string == null) continue;
            if (this.id_super.id_class()) {
                string = this.id_super.id_class(string);
            }
            float f5 = -((cm_3)this.id_volatile.id_class[15]).id_break(string) / 2;
            ((cm_3)this.id_volatile.id_class[15]).id_class(string, f5, n5 * 10 - this.id_implements.length * 5, n6, false, rjV_22, hd_1, false, 0, 0xF000F0, false);
            if (n5 != this.id_catch || n7 < 0 || !bl2) continue;
            n4 = ((cm_3)this.id_volatile.id_class[15]).id_break(string.substring(0, Math.max(Math.min(n7, string.length()), 0)));
            n3 = n4 - ((cm_3)this.id_volatile.id_class[15]).id_break(string) / 2;
            if (n7 < string.length()) continue;
            ((cm_3)this.id_volatile.id_class[15]).id_class("_", n3, n9, n6, false, rjV_22, hd_1, false, 0, 0xF000F0, false);
        }
        hd_1.id_break();
        for (n5 = 0; n5 < this.id_implements.length; ++n5) {
            string = this.id_implements[n5];
            if (string == null || n5 != this.id_catch || n7 < 0) continue;
            int n10 = ((cm_3)this.id_volatile.id_class[15]).id_break(string.substring(0, Math.max(Math.min(n7, string.length()), 0)));
            n4 = n10 - ((cm_3)this.id_volatile.id_class[15]).id_break(string) / 2;
            if (bl2 && n7 < string.length()) {
                ZZ.id_class(ml_1, n4, n9 - 1, n4 + 1, n9 + 9, 0xFF000000 | n6);
            }
            if (n8 == n7) continue;
            n3 = Math.min(n7, n8);
            int n11 = Math.max(n7, n8);
            int n12 = ((cm_3)this.id_volatile.id_class[15]).id_break(string.substring(0, n3)) - ((cm_3)this.id_volatile.id_class[15]).id_break(string) / 2;
            int n13 = ((cm_3)this.id_volatile.id_class[15]).id_break(string.substring(0, n11)) - ((cm_3)this.id_volatile.id_class[15]).id_break(string) / 2;
            int n14 = Math.min(n12, n13);
            int n15 = Math.max(n12, n13);
            yb_3 yb_32 = yb_3.id_class();
            lD_2 lD_22 = yb_32.id_byte();
            RenderSystem.disableTexture();
            RenderSystem.enableColorLogicOp();
            RenderSystem.logicOp(Ma_1.OR_REVERSE);
            lD_22.id_class(7, ju_3.id_this);
            lD_22.id_class(rjV_22, (float)n14, (float)(n9 + 9), 0.0f).id_break(0, 0, 255, 255).id_class();
            lD_22.id_class(rjV_22, (float)n15, (float)(n9 + 9), 0.0f).id_break(0, 0, 255, 255).id_class();
            lD_22.id_class(rjV_22, (float)n15, (float)n9, 0.0f).id_break(0, 0, 255, 255).id_class();
            lD_22.id_class(rjV_22, (float)n14, (float)n9, 0.0f).id_break(0, 0, 255, 255).id_class();
            lD_22.id_finally();
            yk_3.id_class(lD_22);
            RenderSystem.disableColorLogicOp();
            RenderSystem.enableTexture();
        }
        ml_1.id_break();
        HF.id_protected();
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean id_class(char c, int n) {
        this.id_private.id_class(c);
        return true;
    }

    @Override
    public void id_private() {
        ++this.id_case;
        if (!this.id_throws.id_void().id_class(this.id_throws.id_abstract().id_break())) {
            this.id_native();
        }
    }

    @Override
    public void id_volatile() {
        this.id_native();
    }

    private void id_native() {
        this.id_throws.id_break();
        this.id_volatile.id_break((vm_3)null);
    }

    @Override
    public boolean aO_() {
        return true;
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120, 200, 20, cN_2.id_byte, lF -> this.id_native()));
        this.id_throws.id_class(false);
        this.id_private = new ux_3(() -> this.id_implements[this.id_catch], string -> {
            this.id_implements[this.id_catch] = string;
            this.id_throws.id_class(this.id_catch, new rgN_2((String)string));
        }, ux_3.id_class(this.id_volatile), ux_3.id_byte(this.id_volatile), string -> ((cm_3)this.id_volatile.id_class[15]).id_break((String)string) <= 90);
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
        Aq_1 aq_1 = this.id_volatile.id_void();
        if (aq_1 != null) {
            aq_1.id_class(new rZy_1(this.id_throws.id_char(), this.id_implements[0], this.id_implements[1], this.id_implements[2], this.id_implements[3]));
        }
        this.id_throws.id_class(true);
    }
}

