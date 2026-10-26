/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.HF;
import celestial.HQ;
import celestial.HU;
import celestial.HW;
import celestial.Hd_1;
import celestial.Hn_1;
import celestial.Hx_1;
import celestial.IF;
import celestial.II;
import celestial.IJ;
import celestial.IQ;
import celestial.Ip_1;
import celestial.MH;
import celestial.MK;
import celestial.Ml_1;
import celestial.OP;
import celestial.OQ;
import celestial.Ok_1;
import celestial.Oz_1;
import celestial.QY;
import celestial.cb_3;
import celestial.cm_3;
import celestial.fJ_2;
import celestial.fY_2;
import celestial.fZ_2;
import celestial.gm_3;
import celestial.iB_2;
import celestial.jG_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.lp_3;
import celestial.manager.FontManager;
import celestial.rAL;
import celestial.rAn_1;
import celestial.rTO;
import celestial.rVL;
import celestial.rYB;
import celestial.rdS_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjV_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrGD;
import celestial.rrGK;
import celestial.rrQX;
import celestial.rrZO;
import celestial.rrbN_2;
import celestial.rrbY_2;
import celestial.rrbb_3;
import celestial.rrby_3;
import celestial.rrdZ;
import celestial.rrfD_2;
import celestial.rrjP_2;
import celestial.rrxp_3;
import celestial.rrxr_3;
import celestial.rxJ_2;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import celestial.wK_2;
import celestial.xm_3;
import celestial.yS_2;
import celestial.yb_3;
import celestial.yq_3;
import celestial.zE_2;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.List;
import java.util.Set;

public class Hz_1
implements rAn_1 {
    public static final rqO_2 id_class = new rqO_2("textures/misc/enchanted_item_glint.png");
    private static final Set<rdb_3> id_throws = Sets.newHashSet((Object[])new rdb_3[]{rdy_3.id_class});
    public float id_break;
    private final HW id_case;
    private final fY_2 id_catch;
    private final yq_3 id_private;
    public Ip_1 id_byte;
    public static boolean id_protected = true;
    private final rTO id_implements = new rTO();

    public static Ok_1 id_byte(Hx_1 hx_1, HU hU, boolean bl, boolean bl2) {
        if (!id_protected) {
            bl2 = false;
        }
        if (rrdZ.id_new) {
            bl2 = false;
        }
        if (rrbY_2.id_case()) {
            bl2 = false;
        }
        return bl2 ? OQ.id_class(hx_1.getBuffer(bl ? HU.id_continue() : HU.id_this()), hx_1.getBuffer(hU)) : hx_1.getBuffer(hU);
    }

    public rrGK id_byte() {
        return rrGD.MODELS;
    }

    public Hz_1(fY_2 fY_22, Ip_1 ip_1, yq_3 yq_32) {
        this.id_catch = fY_22;
        this.id_byte = ip_1;
        this.id_case = new HW(ip_1);
        for (rdb_3 rdb_32 : rVL.id_for) {
            if (id_throws.contains(rdb_32)) continue;
            this.id_case.id_class(rdb_32, new II(rVL.id_for.id_break(rdb_32), "inventory"));
        }
        this.id_private = yq_32;
    }

    public void id_class(iB_2 iB_22, rdn_3 rdn_32, float f, float f2) {
        this.id_break(iB_22, rdn_32, f, f2);
    }

    public void id_class(cm_3 cm_32, rdn_3 rdn_32, float f, float f2) {
        this.id_class(cm_32, rdn_32, f, f2, null, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(cm_3 cm_32, rdn_3 rdn_32, float f, float f2, String string, float f3) {
        if (!rdn_32.id_class()) {
            Ml_1 ml_1 = new Ml_1();
            int n = (int)(f3 * 255.0f);
            if ((rdn_32.id_char() != 1 || string != null) && n > 0) {
                String string2 = string == null ? String.valueOf(rdn_32.id_char()) : string;
                ml_1.id_class(0.0, 0.0, (double)(this.id_break + 200.0f));
                Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
                boolean bl = cm_3.id_byte;
                cm_3.id_byte = true;
                try {
                    cm_32.id_class(string2, f + 19.0f - 2.0f - (float)cm_32.id_break(string2), f2 + 6.0f + 3.0f, ColorHelper.id_break(0xFFFFFF, n), true, ml_1.id_byte().id_class(), (Hx_1)hd_1, false, 0, 0xF000F0);
                    hd_1.id_break();
                }
                finally {
                    cm_3.id_byte = bl;
                }
            }
        }
    }

    public void id_class(cm_3 cm_32, rdn_3 rdn_32, float f, float f2, String string) {
        this.id_class(cm_32, rdn_32, f, f2, string, false);
    }

    public void id_class(rdn_3 rdn_32, int n, int n2) {
        this.id_break((cb_3)QY.id_instanceof().id_class[57], rdn_32, n, n2);
    }

    protected void id_class(rdn_3 rdn_32, float f, float f2, IJ iJ) {
        boolean bl;
        RenderSystem.pushMatrix();
        this.id_catch.id_class(fJ_2.id_class);
        this.id_catch.id_break(fJ_2.id_class).id_class(false, false);
        RenderSystem.enableRescaleNormal();
        RenderSystem.enableAlphaTest();
        RenderSystem.defaultAlphaFunc();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.translatef(f, f2, 100.0f + this.id_break);
        RenderSystem.translatef(8.0f, 8.0f, 0.0f);
        RenderSystem.scalef(1.0f, -1.0f, 1.0f);
        RenderSystem.scalef(16.0f, 16.0f, 16.0f);
        Ml_1 ml_1 = new Ml_1();
        Hd_1 hd_1 = QY.id_instanceof().id_interface().id_break();
        boolean bl2 = bl = !iJ.id_byte();
        if (bl) {
            HF.id_byte();
        }
        this.id_class(rdn_32, IQ.GUI, false, ml_1, hd_1, 0xF000F0, fZ_2.id_class, iJ);
        hd_1.id_break();
        RenderSystem.enableDepthTest();
        if (bl) {
            HF.id_protected();
        }
        RenderSystem.disableAlphaTest();
        RenderSystem.disableRescaleNormal();
        RenderSystem.popMatrix();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void id_class(Ml_1 ml_1, rdn_3 rdn_32, float f, float f2, float f3, IJ iJ) {
        boolean bl;
        ml_1.id_class();
        this.id_catch.id_class(fJ_2.id_class);
        this.id_catch.id_break(fJ_2.id_class).id_class(false, false);
        RenderSystem.enableRescaleNormal();
        RenderSystem.enableAlphaTest();
        RenderSystem.defaultAlphaFunc();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, f3);
        ml_1.id_class((double)f, (double)f2, (double)(100.0f + this.id_break));
        ml_1.id_class(8.0, 8.0, 0.0);
        ml_1.id_class(1.0f, -1.0f, 1.0f);
        ml_1.id_class(16.0f, 16.0f, 16.0f);
        Hd_1 hd_1 = QY.id_instanceof().id_interface().id_break();
        boolean bl2 = bl = !iJ.id_byte();
        if (bl) {
            HF.id_byte();
        }
        float f4 = Hn_1.id_break;
        Hn_1.id_break = f3;
        try {
            this.id_class(rdn_32, IQ.GUI, false, ml_1, hd_1, 0xF000F0, fZ_2.id_class, f3, iJ);
            hd_1.id_break();
        }
        finally {
            Hn_1.id_break = f4;
        }
        RenderSystem.enableDepthTest();
        if (bl) {
            HF.id_protected();
        }
        RenderSystem.disableAlphaTest();
        RenderSystem.disableRescaleNormal();
        ml_1.id_break();
    }

    private void id_class(lD_2 lD_22, float f, float f2, int n, int n2, int n3, int n4, int n5, int n6) {
        lD_22.id_class(7, ju_3.id_this);
        lD_22.id_class((double)f, (double)f2, 0.0).id_break(n3, n4, n5, n6).id_class();
        lD_22.id_class((double)f, (double)(f2 + (float)n2), 0.0).id_break(n3, n4, n5, n6).id_class();
        lD_22.id_class((double)(f + (float)n), (double)(f2 + (float)n2), 0.0).id_break(n3, n4, n5, n6).id_class();
        lD_22.id_class((double)(f + (float)n), (double)f2, 0.0).id_break(n3, n4, n5, n6).id_class();
        yb_3.id_class().id_break();
    }

    private void id_class(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, float f4, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        lD_22.id_class(rjV_22, f, f2, 0.0f).id_class(n).id_class();
        lD_22.id_class(rjV_22, f, f2 + f4, 0.0f).id_class(n).id_class();
        lD_22.id_class(rjV_22, f + f3, f2 + f4, 0.0f).id_class(n).id_class();
        lD_22.id_class(rjV_22, f + f3, f2, 0.0f).id_class(n).id_class();
    }

    @Override
    public void id_class(rAL rAL2) {
        this.id_case.id_break();
    }

    public void id_class(Ml_1 ml_1, rdn_3 rdn_32, float f, float f2, float f3) {
        this.id_class(ml_1, rdn_32, f, f2, f3, this.id_class(rdn_32, null, null));
    }

    public void id_class(Ml_1 ml_1, lD_2 lD_22, rdn_3 rdn_32, float f, float f2, float f3, int n) {
        if (!rdn_32.id_case()) {
            return;
        }
        RenderSystem.disableDepthTest();
        RenderSystem.disableTexture();
        RenderSystem.disableAlphaTest();
        RenderSystem.disableBlend();
        float f4 = rdn_32.id_catch();
        float f5 = rdn_32.id_private();
        float f6 = Math.max(0.0f, (f5 - f4) / f5);
        int n2 = Math.round(f3 - f4 * f3 / f5);
        int n3 = ColorHelper.id_break(rfU_2.id_case(f6 / 3.0f, 1.0f, 1.0f), n);
        if (rrbb_3.K()) {
            n3 = rrbN_2.id_class(f6, n3);
        }
        this.id_class(ml_1, lD_22, f, f2, f3, 1.5f, ColorHelper.id_break(Color.BLACK.getRGB(), n));
        this.id_class(ml_1, lD_22, f, f2, (float)n2, 1.0f, n3);
        RenderSystem.enableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
        RenderSystem.enableDepthTest();
    }

    public void id_class(Ml_1 ml_1, rdn_3 rdn_32, float f, float f2, float f3, float f4) {
        if (!rdn_32.id_class() && rdn_32.id_case()) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.disableAlphaTest();
            RenderSystem.disableBlend();
            float f5 = rdn_32.id_catch();
            float f6 = rdn_32.id_private();
            float f7 = Math.max(0.0f, (f6 - f5) / f6);
            int n = Math.round(f3 - f5 * f3 / f6);
            int n2 = rfU_2.id_case(f7 / 3.0f, 1.0f, 1.0f);
            if (rrbb_3.K()) {
                n2 = rrbN_2.id_class(f7, n2);
            }
            rrfD_2.id_protected(ml_1, f, f2, f3, 2.0f, ColorHelper.id_break(Color.BLACK.getRGB(), (int)f4));
            rrfD_2.id_protected(ml_1, f, f2, n, 1.0f, ColorHelper.id_break(n2, (int)f4));
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
        }
    }

    public void id_class(cm_3 cm_32, rdn_3 rdn_32, float f, float f2, String string, boolean bl) {
        if (!rdn_32.id_class()) {
            Object object;
            float f3;
            float f4;
            float f5;
            Object object2;
            rdb_3 rdb_32 = rdn_32.id_break();
            Ml_1 ml_1 = new Ml_1();
            if (rdn_32.id_case()) {
                RenderSystem.disableDepthTest();
                RenderSystem.disableTexture();
                RenderSystem.disableAlphaTest();
                RenderSystem.disableBlend();
                object2 = yb_3.id_class();
                lD_2 lD_22 = ((yb_3)object2).id_byte();
                f5 = rdn_32.id_catch();
                f4 = rdn_32.id_private();
                f3 = Math.max(0.0f, (f4 - f5) / f4);
                int n = Math.round(13.0f - f5 * 13.0f / f4);
                int n2 = rfU_2.id_case(f3 / 3.0f, 1.0f, 1.0f);
                if (rrbb_3.K()) {
                    n2 = rrbN_2.id_class(f3, n2);
                }
                this.id_class(lD_22, f + 2.0f, f2 + 13.0f, 13, 2, 0, 0, 0, 255);
                this.id_class(lD_22, f + 2.0f, f2 + 13.0f, n, 1, n2 >> 16 & 0xFF, n2 >> 8 & 0xFF, n2 & 0xFF, 255);
                RenderSystem.enableBlend();
                RenderSystem.enableAlphaTest();
                RenderSystem.enableTexture();
                RenderSystem.enableDepthTest();
            }
            boolean bl2 = (object2 = (cb_3)QY.id_instanceof().id_class[57]) != null;
            f5 = QY.id_instanceof().X();
            f4 = bl2 ? ((rhd_3)object2).sK().id_class(rdb_32, f5) : 0.0f;
            f3 = bl2 ? ((cb_3)object2).r().id_class(rdn_32, f5) : 0.0f;
            float f6 = Math.max(f4, f3);
            if (rdn_32.id_char() != 1 || string != null) {
                String string2 = string == null ? String.valueOf(rdn_32.id_char()) : string;
                ml_1.id_class(0.0, 0.0, (double)(this.id_break + 200.0f));
                object = Hx_1.id_class(yb_3.id_class().id_byte());
                cm_32.id_class(string2, f + 19.0f - 2.0f - (float)cm_32.id_break(string2), f2 + 6.0f + 3.0f, 0xFFFFFF, true, ml_1.id_byte().id_class(), (Hx_1)object, false, 0, 0xF000F0);
                ((Hd_1)object).id_break();
            }
            if (f6 > 0.0f) {
                RenderSystem.disableDepthTest();
                RenderSystem.disableTexture();
                RenderSystem.enableBlend();
                RenderSystem.defaultBlendFunc();
                yb_3 yb_32 = yb_3.id_class();
                object = yb_32.id_byte();
                this.id_class((lD_2)object, f, f2 + (float)rfU_2.id_protected(16.0f * (1.0f - f6)), 16, rfU_2.id_case(16.0f * f6), 255, 255, 255, 127);
                RenderSystem.enableTexture();
                RenderSystem.enableDepthTest();
            }
            if (bl && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_int().aJ_() && rdb_32 instanceof rdS_2) {
                rdS_2 rdS_22 = (rdS_2)((Object)rdb_32);
                if (bl2) {
                    object = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break();
                    String string3 = rdS_22.id_class((rhd_3)object2, rdn_32);
                    float f7 = ((rrZO)object).id_break(string3);
                    ml_1.id_class();
                    ml_1.id_class((double)f, (double)f2, (double)(this.id_break + 160.0f));
                    ml_1.id_class(0.5f, 0.5f, 0.5f);
                    rdn_3 rdn_33 = rdS_22.id_catch();
                    rdb_3 rdb_33 = rdn_33.id_break();
                    int n = 16;
                    int n3 = 9;
                    if (rdb_33 == rdy_3.dc) {
                        n = 20;
                    } else if (rdb_33 == rdy_3.Pz) {
                        n = 17;
                        n3 = 10;
                    }
                    this.id_class(ml_1, rdn_33, (float)n, (float)n3, 1.0f);
                    ml_1.id_class(2.0f, 2.0f, 2.0f);
                    ((rrZO)object).id_class(MinecraftAccessor.id_strictfp);
                    ((rrZO)object).id_class(ml_1, MinecraftAccessor.id_strictfp, string3, (double)(16.0f - f7), 2.0, -1, false, false);
                    ((rrZO)object).id_byte(MinecraftAccessor.id_strictfp);
                    ml_1.id_break();
                }
            }
        }
    }

    public static Ok_1 id_class(Hx_1 hx_1, HU hU, MH mH) {
        return OQ.id_class(new Oz_1(hx_1.getBuffer(HU.id_new()), mH.id_class(), mH.id_break()), hx_1.getBuffer(hU));
    }

    public void id_class(IJ iJ, rdn_3 rdn_32, float f, int n, int n2, Ml_1 ml_1, Ok_1 ok_1) {
        if (rrbb_3.w()) {
            ok_1.id_class(true);
        }
        for (rpr_3 rpr_32 : rpr_3.VALUES) {
            this.id_implements.setSeed(42L);
            this.id_class(ml_1, ok_1, iJ.id_class(null, rpr_32, this.id_implements), rdn_32, n, n2, f);
        }
        this.id_implements.setSeed(42L);
        this.id_class(ml_1, ok_1, iJ.id_class(null, null, this.id_implements), rdn_32, n, n2, f);
    }

    private void id_class(Ml_1 ml_1, Ok_1 ok_1, List<wK_2> list, rdn_3 rdn_32, int n, int n2) {
        boolean bl = !rdn_32.id_class();
        MH mH = ml_1.id_byte();
        boolean bl2 = rrbY_2.id_class();
        for (wK_2 wK_22 : list) {
            if (bl2 && (wK_22 = rrbY_2.id_class(wK_22)) == null) continue;
            int n3 = -1;
            if (bl && wK_22.id_break()) {
                n3 = this.id_private.id_class(rdn_32, wK_22.id_byte());
                if (rrbb_3.K()) {
                    n3 = rrbN_2.id_class(rdn_32, wK_22.id_byte(), n3);
                }
            }
            float f = (float)(n3 >> 16 & 0xFF) / 255.0f;
            float f2 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n3 & 0xFF) / 255.0f;
            ok_1.id_class(mH, wK_22, f, f2, f3, n, n2);
        }
    }

    private void id_class(Ml_1 ml_1, Ok_1 ok_1, List<wK_2> list, rdn_3 rdn_32, int n, int n2, float f) {
        boolean bl = !rdn_32.id_class();
        MH mH = ml_1.id_byte();
        boolean bl2 = rrbY_2.id_class();
        int n3 = list.size();
        for (int i = 0; i < n3; ++i) {
            wK_2 wK_22 = list.get(i);
            if (bl2 && (wK_22 = rrbY_2.id_class(wK_22)) == null) continue;
            int n4 = -1;
            if (bl && wK_22.id_break()) {
                n4 = this.id_private.id_class(rdn_32, wK_22.id_byte());
                if (rrbb_3.K()) {
                    n4 = rrbN_2.id_class(rdn_32, wK_22.id_byte(), n4);
                }
            }
            float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n4 & 0xFF) / 255.0f;
            ok_1.id_break(mH, wK_22, f2, f3, f4, f, n, n2);
        }
    }

    public static Ok_1 id_class(Hx_1 hx_1, HU hU, boolean bl, boolean bl2) {
        if (!id_protected) {
            bl2 = false;
        }
        if (rrdZ.id_new) {
            bl2 = false;
        }
        if (rrbY_2.id_case()) {
            bl2 = false;
        }
        return bl2 ? OQ.id_class(hx_1.getBuffer(bl ? HU.id_final() : HU.id_package()), hx_1.getBuffer(hU)) : hx_1.getBuffer(hU);
    }

    public void id_class(rdn_3 rdn_32, IQ iQ, boolean bl, Ml_1 ml_1, Hx_1 hx_1, int n, int n2, IJ iJ) {
        if (!rdn_32.id_class()) {
            boolean bl2;
            ml_1.id_class();
            boolean bl3 = bl2 = iQ == IQ.GUI || iQ == IQ.GROUND || iQ == IQ.FIXED;
            if (rdn_32.id_break() == rdy_3.kY && bl2) {
                iJ = this.id_case.id_class().id_class(new II("minecraft:trident#inventory"));
            }
            iJ.id_case().id_class(iQ).id_class(bl, ml_1);
            ml_1.id_class(-0.5, -0.5, -0.5);
            if (!iJ.id_protected() && (rdn_32.id_break() != rdy_3.kY || bl2)) {
                Object object;
                boolean bl4 = iQ != IQ.GUI && !iQ.id_class() && rdn_32.id_break() instanceof rxJ_2 ? !((object = ((rxJ_2)rdn_32.id_break()).id_catch()) instanceof xm_3) && !(object instanceof zE_2) : true;
                if (iJ.id_implements()) {
                    rrxr_3.rX.id_class(this, iJ, rdn_32, ml_1, hx_1, n, n2, bl4);
                } else {
                    Ok_1 ok_1;
                    Object object2;
                    object = yS_2.id_class(rdn_32, bl4);
                    if (rdn_32.id_break() == rdy_3.Xx && rdn_32.id_else()) {
                        ml_1.id_class();
                        object2 = ml_1.id_byte();
                        if (iQ == IQ.GUI) {
                            ((MH)object2).id_class().id_class(0.5f);
                        } else if (iQ.id_class()) {
                            ((MH)object2).id_class().id_class(0.75f);
                        }
                        ok_1 = bl4 ? Hz_1.id_break(hx_1, (HU)object, (MH)object2) : Hz_1.id_class(hx_1, (HU)object, (MH)object2);
                        ml_1.id_break();
                    } else {
                        ok_1 = bl4 ? Hz_1.id_byte(hx_1, (HU)object, true, rdn_32.id_else()) : Hz_1.id_break(hx_1, (HU)object, true, rdn_32.id_else());
                    }
                    if (rrbb_3.rd()) {
                        iJ = rrby_3.id_class(rdn_32, iJ, IF.id_break, false);
                        IF.id_break = null;
                    }
                    if (rrbY_2.id_class()) {
                        rrbY_2.id_byte();
                    }
                    this.id_class(iJ, rdn_32, n, n2, ml_1, ok_1);
                    if (rrbY_2.id_class()) {
                        if (rrbY_2.id_protected()) {
                            rrbY_2.id_throws();
                            object2 = ok_1 instanceof rrxp_3 ? ((rrxp_3)ok_1).id_case() : ok_1;
                            this.id_class(iJ, rdn_32, HQ.id_class, n2, ml_1, (Ok_1)object2);
                            rrbY_2.id_catch();
                        }
                        rrbY_2.id_private();
                    }
                }
            } else {
                jG_2.id_class.id_class(rdn_32, iQ, ml_1, hx_1, n, n2);
            }
            ml_1.id_break();
        }
    }

    public void id_class(rdn_3 rdn_32, IQ iQ, boolean bl, Ml_1 ml_1, Hx_1 hx_1, int n, int n2, float f, IJ iJ) {
        if (!rdn_32.id_class()) {
            boolean bl2;
            ml_1.id_class();
            boolean bl3 = bl2 = iQ == IQ.GUI || iQ == IQ.GROUND || iQ == IQ.FIXED;
            if (rdn_32.id_break() == rdy_3.kY && bl2) {
                iJ = this.id_case.id_class().id_class(new II("minecraft:trident#inventory"));
            }
            iJ.id_case().id_class(iQ).id_class(bl, ml_1);
            ml_1.id_class(-0.5, -0.5, -0.5);
            if (!iJ.id_protected() && (rdn_32.id_break() != rdy_3.kY || bl2)) {
                Object object;
                boolean bl4 = iQ != IQ.GUI && !iQ.id_class() && rdn_32.id_break() instanceof rxJ_2 ? !((object = ((rxJ_2)rdn_32.id_break()).id_catch()) instanceof xm_3) && !(object instanceof zE_2) : true;
                Object object2 = object = f < 1.0f ? ((rrjP_2)rrjP_2.id_break[0]).id_class(hx_1, f, false) : hx_1;
                if (iJ.id_implements()) {
                    rrxr_3.rX.id_class(this, iJ, rdn_32, ml_1, object, n, n2, bl4);
                } else {
                    Ok_1 ok_1;
                    Object object3;
                    HU hU = yS_2.id_class(rdn_32, bl4);
                    if (rdn_32.id_break() == rdy_3.Xx && rdn_32.id_else()) {
                        ml_1.id_class();
                        object3 = ml_1.id_byte();
                        if (iQ == IQ.GUI) {
                            ((MH)object3).id_class().id_class(0.5f);
                        } else if (iQ.id_class()) {
                            ((MH)object3).id_class().id_class(0.75f);
                        }
                        ok_1 = bl4 ? Hz_1.id_break((Hx_1)object, hU, (MH)object3) : Hz_1.id_class((Hx_1)object, hU, (MH)object3);
                        ml_1.id_break();
                    } else {
                        ok_1 = bl4 ? Hz_1.id_byte((Hx_1)object, hU, true, rdn_32.id_else()) : Hz_1.id_break((Hx_1)object, hU, true, rdn_32.id_else());
                    }
                    if (rrbb_3.rd()) {
                        iJ = rrby_3.id_class(rdn_32, iJ, IF.id_break, false);
                        IF.id_break = null;
                    }
                    if (rrbY_2.id_class()) {
                        rrbY_2.id_byte();
                    }
                    this.id_class(iJ, rdn_32, f, n, n2, ml_1, ok_1);
                    if (rrbY_2.id_class()) {
                        if (rrbY_2.id_protected()) {
                            rrbY_2.id_throws();
                            object3 = ok_1 instanceof rrxp_3 ? ((rrxp_3)ok_1).id_case() : ok_1;
                            this.id_class(iJ, rdn_32, f, HQ.id_class, n2, ml_1, (Ok_1)object3);
                            rrbY_2.id_catch();
                        }
                        rrbY_2.id_private();
                    }
                }
            } else {
                Hx_1 hx_12 = f < 1.0f ? ((rrjP_2)rrjP_2.id_break[0]).id_class(hx_1, f) : hx_1;
                jG_2.id_class.id_class(rdn_32, iQ, ml_1, hx_12, n, n2);
            }
            ml_1.id_break();
        }
    }

    public void id_class(rdn_3 rdn_32, float f, float f2) {
        this.id_class(rdn_32, f, f2, this.id_class(rdn_32, null, null));
    }

    public void id_class(iB_2 iB_22, rdn_3 rdn_32, IQ iQ, boolean bl, Ml_1 ml_1, Hx_1 hx_1, rYB rYB2, int n, int n2) {
        if (!rdn_32.id_class()) {
            IJ iJ = this.id_class(rdn_32, rYB2, iB_22);
            this.id_class(rdn_32, iQ, bl, ml_1, hx_1, n, n2, iJ);
        }
    }

    public void id_class(IJ iJ, rdn_3 rdn_32, int n, int n2, Ml_1 ml_1, Ok_1 ok_1) {
        if (rrbb_3.w()) {
            ok_1.id_class(true);
        }
        for (rpr_3 rpr_32 : rpr_3.VALUES) {
            this.id_class(ml_1, ok_1, iJ.id_class(null, rpr_32, this.id_implements), rdn_32, n, n2);
        }
        this.id_implements.setSeed(42L);
        this.id_class(ml_1, ok_1, iJ.id_class(null, null, this.id_implements), rdn_32, n, n2);
    }

    public IJ id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        rdb_3 rdb_32 = rdn_32.id_break();
        IJ iJ = rdb_32 == rdy_3.kY ? this.id_case.id_class().id_class(new II("minecraft:trident_in_hand#inventory")) : this.id_case.id_break(rdn_32);
        gm_3 gm_32 = rYB2 instanceof gm_3 ? (gm_3)rYB2 : null;
        IF.id_break = null;
        IJ iJ2 = iJ.id_catch().id_class(iJ, rdn_32, gm_32, iB_22);
        if (rrbb_3.rd()) {
            iJ2 = rrby_3.id_class(rdn_32, iJ2, IF.id_break, true);
        }
        return iJ2 == null ? this.id_case.id_class().id_break() : iJ2;
    }

    public void id_class(rdn_3 rdn_32, IQ iQ, int n, int n2, Ml_1 ml_1, Hx_1 hx_1) {
        this.id_class(null, rdn_32, iQ, false, ml_1, hx_1, null, n, n2);
    }

    public HW id_break() {
        return this.id_case;
    }

    public void id_break(rdn_3 rdn_32, int n, int n2) {
        this.id_break(null, rdn_32, n, n2);
    }

    private void id_break(iB_2 iB_22, rdn_3 rdn_32, float f, float f2) {
        if (!rdn_32.id_class()) {
            this.id_break += 50.0f;
            this.id_class(rdn_32, f, f2, this.id_class(rdn_32, null, iB_22));
            this.id_break -= 50.0f;
        }
    }

    public static Ok_1 id_break(Hx_1 hx_1, HU hU, MH mH) {
        return OQ.id_class(new Oz_1(hx_1.getBuffer(HU.id_continue()), mH.id_class(), mH.id_break()), hx_1.getBuffer(hU));
    }

    public static Ok_1 id_break(Hx_1 hx_1, HU hU, boolean bl, boolean bl2) {
        if (!id_protected) {
            bl2 = false;
        }
        if (rrdZ.id_new) {
            bl2 = false;
        }
        if (rrbY_2.id_case()) {
            bl2 = false;
        }
        if (!bl2) {
            return hx_1.getBuffer(hU);
        }
        return QY.d() && hU == lp_3.id_implements() ? OQ.id_class(hx_1.getBuffer(HU.id_int()), hx_1.getBuffer(hU)) : OQ.id_class(hx_1.getBuffer(bl ? HU.id_new() : HU.id_super()), hx_1.getBuffer(hU));
    }
}

