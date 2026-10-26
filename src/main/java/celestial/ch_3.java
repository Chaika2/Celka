/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.MK;
import celestial.Ml_1;
import celestial.OP;
import celestial.QY;
import celestial.Qg_1;
import celestial.cX_2;
import celestial.cm_3;
import celestial.fj_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rgP_2;
import celestial.rjV_2;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.uI_2;
import celestial.yb_3;
import celestial.yk_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ch_3 {
    public static final rqO_2 id_break = new rqO_2("textures/gui/options_background.png");
    public static final rqO_2 id_byte = new rqO_2("textures/gui/container/stats_icons.png");
    public static final rqO_2 id_protected = new rqO_2("textures/gui/icons.png");
    private int id_class;
    private final cX_2 id_throws = new cX_2();

    public static void id_byte(Ml_1 ml_1, cm_3 cm_32, String string, int n, int n2, int n3) {
        cm_32.id_class(ml_1, string, (float)n, (float)n2, n3);
    }

    private static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n, float f5, float f6, float f7, float f8, int n2, int n3) {
        ch_3.id_class(ml_1.id_byte().id_class(), f, f2, f3, f4, n, (f7 + 0.0f) / (float)n2, (f7 + f5) / (float)n2, (f8 + 0.0f) / (float)n3, (f8 + f6) / (float)n3);
    }

    private static void id_class(rjV_2 rjV_22, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, float f4) {
        lD_2 lD_22 = yb_3.id_class().id_byte();
        lD_22.id_class(7, ju_3.id_synchronized);
        lD_22.id_class(rjV_22, (float)n, (float)n4, (float)n5).id_class(f, f4).id_class();
        lD_22.id_class(rjV_22, (float)n2, (float)n4, (float)n5).id_class(f2, f4).id_class();
        lD_22.id_class(rjV_22, (float)n2, (float)n3, (float)n5).id_class(f2, f3).id_class();
        lD_22.id_class(rjV_22, (float)n, (float)n3, (float)n5).id_class(f, f3).id_class();
        lD_22.id_finally();
        RenderSystem.enableAlphaTest();
        yk_3.id_class(lD_22);
    }

    private static void id_class(rjV_2 rjV_22, float f, float f2, float f3, float f4, int n, float f5, float f6, float f7, float f8) {
        lD_2 lD_22 = yb_3.id_class().id_byte();
        lD_22.id_class(7, ju_3.id_synchronized);
        lD_22.id_class(rjV_22, f, f4, (float)n).id_class(f5, f8).id_class();
        lD_22.id_class(rjV_22, f2, f4, (float)n).id_class(f6, f8).id_class();
        lD_22.id_class(rjV_22, f2, f3, (float)n).id_class(f6, f7).id_class();
        lD_22.id_class(rjV_22, f, f3, (float)n).id_class(f5, f7).id_class();
        lD_22.id_finally();
        RenderSystem.enableAlphaTest();
        yk_3.id_class(lD_22);
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, fj_3 fj_32, int n6) {
        ch_3.id_class(ml_1.id_byte().id_class(), n, n + n4, n2, n2 + n5, n3, fj_32.id_case(), fj_32.id_catch(), fj_32.id_private(), fj_32.id_implements(), n6);
    }

    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        ch_3.id_class(ml_1, n, n2, this.id_class, (float)n3, (float)n4, n5, n6, 256, 256, n7);
    }

    protected void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        if (n2 < n) {
            int n5 = n;
            n = n2;
            n2 = n5;
        }
        ch_3.id_class(ml_1, n, n3, n2 + 1, n3 + 1, n4);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, int n2) {
        ch_3.id_class(ml_1, f, f + f3, f2, f2 + f4, 0, f7, f8, f5, f6, n, n2);
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6) {
        ch_3.id_class(ml_1, n, n2, n3, n4, f, f2, n3, n4, n5, n6);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2) {
        ch_3.id_class(ml_1, f, f2, f5, f6, f3, f4, f5, f6, n, n2);
    }

    private static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, float f, float f2, int n8, int n9) {
        ch_3.id_class(ml_1.id_byte().id_class(), n, n2, n3, n4, n5, (f + 0.0f) / (float)n8, (f + (float)n6) / (float)n8, (f2 + 0.0f) / (float)n9, (f2 + (float)n7) / (float)n9);
    }

    private static void id_class(rjV_2 rjV_22, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, float f4, int n6) {
        lD_2 lD_22 = yb_3.id_class().id_byte();
        lD_22.id_class(7, ju_3.id_public);
        lD_22.id_class(rjV_22, (float)n, (float)n4, (float)n5).id_class(f, f4).id_class(n6).id_class();
        lD_22.id_class(rjV_22, (float)n2, (float)n4, (float)n5).id_class(f2, f4).id_class(n6).id_class();
        lD_22.id_class(rjV_22, (float)n2, (float)n3, (float)n5).id_class(f2, f3).id_class(n6).id_class();
        lD_22.id_class(rjV_22, (float)n, (float)n3, (float)n5).id_class(f, f3).id_class(n6).id_class();
        lD_22.id_finally();
        RenderSystem.enableAlphaTest();
        yk_3.id_class(lD_22);
    }

    public void id_class(int n, int n2, int n3, int n4) {
        this.id_class(this.id_throws.id_class(new uI_2(n, n2, n3 - n, n4 - n2)));
    }

    private void id_class(@Nullable uI_2 uI_22) {
        if (uI_22 != null) {
            Qg_1 qg_1 = QY.id_instanceof().id_else();
            int n = qg_1.id_continue();
            double d = qg_1.id_return();
            double d2 = (double)uI_22.id_protected() * d;
            double d3 = (double)n - (double)uI_22.id_byte() * d;
            double d4 = (double)uI_22.id_catch() * d;
            double d5 = (double)uI_22.id_private() * d;
            RenderSystem.enableScissor((int)d2, (int)d3, Math.max(0, (int)d4), Math.max(0, (int)d5));
        } else {
            RenderSystem.disableScissor();
        }
    }

    public void id_class(int n) {
        this.id_class = n;
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, float f, float f2, int n5, int n6, int n7, int n8) {
        ch_3.id_class(ml_1, n, n + n3, n2, n2 + n4, 0, n5, n6, f, f2, n7, n8);
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, int n3, float f, float f2, int n4, int n5, int n6, int n7, int n8) {
        ch_3.id_class(ml_1, n, n + n4, n2, n2 + n5, n3, n4, n5, f, f2, n7, n6, n8);
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, float f, float f2, int n5, int n6, int n7, int n8, int n9) {
        ch_3.id_class(ml_1, n, n + n3, n2, n2 + n4, 0, n5, n6, f, f2, n7, n8, n9);
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, int n7) {
        ch_3.id_class(ml_1, n, n2, n3, n4, f, f2, n3, n4, n5, n6, n7);
    }

    private static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, float f, float f2, int n8, int n9, int n10) {
        ch_3.id_class(ml_1.id_byte().id_class(), n, n2, n3, n4, n5, (f + 0.0f) / (float)n8, (f + (float)n6) / (float)n8, (f2 + 0.0f) / (float)n9, (f2 + (float)n7) / (float)n9, n10);
    }

    protected static void id_class(rjV_2 rjV_22, lD_2 lD_22, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        float f = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n6 & 0xFF) / 255.0f;
        float f5 = (float)(n7 >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n7 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n7 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n7 & 0xFF) / 255.0f;
        lD_22.id_class(rjV_22, (float)n3, (float)n2, (float)n5).id_class(f2, f3, f4, f).id_class();
        lD_22.id_class(rjV_22, (float)n, (float)n2, (float)n5).id_class(f2, f3, f4, f).id_class();
        lD_22.id_class(rjV_22, (float)n, (float)n4, (float)n5).id_class(f6, f7, f8, f5).id_class();
        lD_22.id_class(rjV_22, (float)n3, (float)n4, (float)n5).id_class(f6, f7, f8, f5).id_class();
    }

    public static void id_class(Ml_1 ml_1, cm_3 cm_32, String string, int n, int n2, int n3) {
        cm_32.id_class(ml_1, string, (float)(n - cm_32.id_break(string) / 2), (float)n2, n3);
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5) {
        ch_3.id_class(ml_1.id_byte().id_class(), n, n2, n3, n4, n5);
    }

    public static void id_class(Ml_1 ml_1, cm_3 cm_32, rgP_2 rgP_22, int n, int n2, int n3) {
        rpl_3 rpl_32 = rgP_22.id_catch();
        cm_32.id_class(ml_1, rpl_32, (float)(n - cm_32.id_class(rpl_32) / 2), (float)n2, n3);
    }

    public static void id_class(Ml_1 ml_1, cm_3 cm_32, rgP_2 rgP_22, int n, float f, int n2) {
        rpl_3 rpl_32 = rgP_22.id_catch();
        cm_32.id_class(ml_1, rpl_32, (float)(n - cm_32.id_class(rpl_32) / 2), f, n2);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, int n) {
        ch_3.id_class(ml_1.id_byte().id_class(), f, f2, f3, f4, n);
    }

    private static void id_class(rjV_2 rjV_22, int n, int n2, int n3, int n4, int n5) {
        int n6;
        if (n < n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        lD_2 lD_22 = yb_3.id_class().id_byte();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        lD_22.id_class(7, ju_3.id_this);
        lD_22.id_class(rjV_22, (float)n, (float)n4, 0.0f).id_class(f2, f3, f4, f).id_class();
        lD_22.id_class(rjV_22, (float)n3, (float)n4, 0.0f).id_class(f2, f3, f4, f).id_class();
        lD_22.id_class(rjV_22, (float)n3, (float)n2, 0.0f).id_class(f2, f3, f4, f).id_class();
        lD_22.id_class(rjV_22, (float)n, (float)n2, 0.0f).id_class(f2, f3, f4, f).id_class();
        lD_22.id_finally();
        yk_3.id_class(lD_22);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }

    private static void id_class(rjV_2 rjV_22, float f, float f2, float f3, float f4, int n) {
        float f5;
        if (f < f3) {
            f5 = f;
            f = f3;
            f3 = f5;
        }
        if (f2 < f4) {
            f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        lD_2 lD_22 = yb_3.id_class().id_byte();
        RenderSystem.enableBlend();
        RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        lD_22.id_class(7, ju_3.id_this);
        lD_22.id_class(rjV_22, f, f4, 0.0f).id_class(f6, f7, f8, f5).id_class();
        lD_22.id_class(rjV_22, f3, f4, 0.0f).id_class(f6, f7, f8, f5).id_class();
        lD_22.id_class(rjV_22, f3, f2, 0.0f).id_class(f6, f7, f8, f5).id_class();
        lD_22.id_class(rjV_22, f, f2, 0.0f).id_class(f6, f7, f8, f5).id_class();
        lD_22.id_finally();
        yk_3.id_class(lD_22);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }

    protected void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6) {
        RenderSystem.disableTexture();
        RenderSystem.enableBlend();
        RenderSystem.disableAlphaTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.shadeModel(7425);
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(7, ju_3.id_this);
        ch_3.id_class(ml_1.id_byte().id_class(), lD_22, n, n2, n3, n4, this.id_class, n5, n6);
        yb_32.id_break();
        RenderSystem.shadeModel(7424);
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
    }

    public void id_class(int n, int n2, BiConsumer<Integer, Integer> biConsumer) {
        RenderSystem.blendFuncSeparate(OP.ZERO, MK.ONE_MINUS_SRC_ALPHA, OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
        biConsumer.accept(n + 1, n2);
        biConsumer.accept(n - 1, n2);
        biConsumer.accept(n, n2 + 1);
        biConsumer.accept(n, n2 - 1);
        RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
        biConsumer.accept(n, n2);
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, fj_3 fj_32) {
        ch_3.id_class(ml_1.id_byte().id_class(), n, n + n4, n2, n2 + n5, n3, fj_32.id_case(), fj_32.id_catch(), fj_32.id_private(), fj_32.id_implements());
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, int n, int n2, int n3, fj_3 fj_32) {
        ch_3.id_class(ml_1.id_byte().id_class(), f, f + (float)n2, f2, f2 + (float)n3, n, fj_32.id_case(), fj_32.id_catch(), fj_32.id_private(), fj_32.id_implements());
    }

    public static void id_class(Ml_1 ml_1, int n, int n2, int n3, float f, float f2, int n4, int n5, int n6, int n7) {
        ch_3.id_class(ml_1, n, n + n4, n2, n2 + n5, n3, n4, n5, f, f2, n7, n6);
    }

    public static void id_class(Ml_1 ml_1, cm_3 cm_32, rgP_2 rgP_22, float f, float f2, int n) {
        rpl_3 rpl_32 = rgP_22.id_catch();
        cm_32.id_class(ml_1, rpl_32, f - (float)(cm_32.id_class(rpl_32) / 2), f2, n);
    }

    public static void id_break(Ml_1 ml_1, cm_3 cm_32, String string, int n, int n2, int n3) {
        cm_32.id_class(ml_1, string, (float)n, (float)n2, n3);
    }

    public void id_break(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6) {
        ch_3.id_class(ml_1, n, n2, this.id_class, (float)n3, (float)n4, n5, n6, 256, 256);
    }

    public static void id_break(Ml_1 ml_1, cm_3 cm_32, rgP_2 rgP_22, int n, int n2, int n3) {
        cm_32.id_break(ml_1, rgP_22, (float)n, (float)n2, n3);
    }

    protected void id_break(Ml_1 ml_1, int n, int n2, int n3, int n4) {
        if (n3 < n2) {
            int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        ch_3.id_class(ml_1, n, n2 + 1, n + 1, n3, n4);
    }

    public void y_() {
        this.id_class(this.id_throws.id_class());
    }

    public int h_() {
        return this.id_class;
    }
}

