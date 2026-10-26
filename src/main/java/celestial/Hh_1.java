/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ax_1;
import celestial.C_break;
import celestial.FP;
import celestial.HB;
import celestial.HF;
import celestial.HQ;
import celestial.Hd_1;
import celestial.Hm_1;
import celestial.IQ;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.MH;
import celestial.MK;
import celestial.MT;
import celestial.Ml_1;
import celestial.OP;
import celestial.PX;
import celestial.QY;
import celestial.Qg_1;
import celestial.Qi_1;
import celestial.Qw_1;
import celestial.Vq_1;
import celestial.Zb_1;
import celestial.an_3;
import celestial.cG_2;
import celestial.cT_2;
import celestial.cb_3;
import celestial.cj_3;
import celestial.cq_3;
import celestial.ct_3;
import celestial.event.RenderEvent;
import celestial.fN_2;
import celestial.fZ_2;
import celestial.gm_3;
import celestial.iB_2;
import celestial.jI_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.ly_3;
import celestial.rAL;
import celestial.rAn_1;
import celestial.rEJ;
import celestial.rEu_1;
import celestial.rGw_1;
import celestial.rLD;
import celestial.rRl_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rfo_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rhj_3;
import celestial.rhx_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rng_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqW_2;
import celestial.rrAW;
import celestial.rrAz_1;
import celestial.rrGD;
import celestial.rrGK;
import celestial.rrJr_1;
import celestial.rrME;
import celestial.rrQX;
import celestial.rrWU;
import celestial.rrbb_3;
import celestial.rrbo_3;
import celestial.rrdL;
import celestial.rrdZ;
import celestial.rrfa_3;
import celestial.rrfc_3;
import celestial.rrnG_2;
import celestial.rrnS_2;
import celestial.rrth_3;
import celestial.rrvE;
import celestial.rrvk_1;
import celestial.rrxM_2;
import celestial.rrxr_3;
import celestial.rrzQ_2;
import celestial.rsG_2;
import celestial.ryw_3;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.vB_2;
import celestial.vm_3;
import celestial.xc_3;
import celestial.yB_2;
import celestial.yX_2;
import celestial.yb_3;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hh_1
implements AutoCloseable,
rAn_1 {
    private static final rqO_2 id_byte = new rqO_2("textures/misc/nausea.png");
    private static final Logger id_protected = LogManager.getLogger();
    private final QY id_throws;
    private final rAL id_case;
    private final Random id_catch = new Random();
    private float id_private;
    public final HB id_class;
    private final ct_3 id_implements;
    private final yB_2 id_finally;
    private int id_extends;
    private float id_native;
    private float id_volatile;
    private float id_final;
    private float id_package;
    private final boolean id_int;
    private final boolean id_new;
    private long id_continue;
    private long id_super = rqR_2.id_break();
    private final HQ id_this;
    private final fZ_2 id_else = new fZ_2();
    private boolean id_synchronized;
    private final float id_return;
    private float id_public;
    private float id_goto;
    private rdn_3 id_while;
    private int id_try;
    private float id_instanceof;
    private float id_throw;
    private Vq_1 id_interface;
    private rjV_2 id_char = new rjV_2();
    private static final rqO_2[] id_abstract = new rqO_2[]{new rqO_2("shaders/post/notch.json"), new rqO_2("shaders/post/fxaa.json"), new rqO_2("shaders/post/art.json"), new rqO_2("shaders/post/bumpy.json"), new rqO_2("shaders/post/blobs2.json"), new rqO_2("shaders/post/pencil.json"), new rqO_2("shaders/post/color_convolve.json"), new rqO_2("shaders/post/deconverge.json"), new rqO_2("shaders/post/flip.json"), new rqO_2("shaders/post/invert.json"), new rqO_2("shaders/post/ntsc.json"), new rqO_2("shaders/post/outline.json"), new rqO_2("shaders/post/phosphor.json"), new rqO_2("shaders/post/scan_pincushion.json"), new rqO_2("shaders/post/sobel.json"), new rqO_2("shaders/post/bits.json"), new rqO_2("shaders/post/desaturate.json"), new rqO_2("shaders/post/green.json"), new rqO_2("shaders/post/blur.json"), new rqO_2("shaders/post/wobble.json"), new rqO_2("shaders/post/blobs.json"), new rqO_2("shaders/post/antialias.json"), new rqO_2("shaders/post/creeper.json"), new rqO_2("shaders/post/spider.json")};
    public static final int id_break = id_abstract.length;
    private int id_long = id_break;
    private boolean id_float;
    private final ly_3 id_void = new ly_3();
    private boolean id_static = false;
    private rYB id_import = null;
    private float id_short = 128.0f;
    private long id_default = 0L;
    private int id_const = 0;
    private int id_strictfp = 0;
    private int id_boolean = 0;
    private float id_transient = 0.0f;
    private float id_for = 0.0f;
    private final Vq_1[] id_double = new Vq_1[10];
    private boolean id_switch = false;
    private long r;

    private void id_byte(float f) {
        int n = this.id_throws.id_else().id_super();
        int n2 = this.id_throws.id_else().id_this();
        double d = rfU_2.id_protected((double)f, 2.0, 1.0);
        float f2 = 0.2f * f;
        float f3 = 0.4f * f;
        float f4 = 0.2f * f;
        double d2 = (double)n * d;
        double d3 = (double)n2 * d;
        double d4 = ((double)n - d2) / 2.0;
        double d5 = ((double)n2 - d3) / 2.0;
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(OP.ONE, MK.ONE, OP.ONE, MK.ONE);
        RenderSystem.color4f(f2, f3, f4, 1.0f);
        this.id_throws.A().id_class(id_byte);
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(7, ju_3.id_synchronized);
        lD_22.id_class(d4, d5 + d3, -90.0).id_class(0.0f, 1.0f).id_class();
        lD_22.id_class(d4 + d2, d5 + d3, -90.0).id_class(1.0f, 1.0f).id_class();
        lD_22.id_class(d4 + d2, d5, -90.0).id_class(1.0f, 0.0f).id_class();
        lD_22.id_class(d4, d5, -90.0).id_class(0.0f, 0.0f).id_class();
        yb_32.id_break();
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
    }

    public void id_byte() {
        this.id_float = !this.id_float;
    }

    private boolean id_int() {
        boolean bl;
        Objects.requireNonNull(this);
        an_3 an_32 = this.id_throws.id_catch();
        boolean bl2 = bl = an_32 instanceof rhd_3 && !((Qw_1)this.id_throws.id_class[20]).g;
        if (bl && !((rhx_3)((rhd_3)an_32).id_implements[18]).id_throws) {
            rdn_3 rdn_32 = ((iB_2)an_32).ss();
            rjG_2 rjG_22 = (rjG_2)this.id_throws.id_class[64];
            if (rjG_22 != null && rjG_22.id_byte() == rjM_2.BLOCK) {
                rfH_2 rfH_22 = ((rff_3)rjG_22).id_class();
                xc_3 xc_32 = ((gm_3)this.id_throws.id_class[56]).id_byte(rfH_22);
                if (((Ax_1)this.id_throws.id_class[55]).id_native() == rRl_1.SPECTATOR) {
                    bl = xc_32.id_break((gm_3)this.id_throws.id_class[56], rfH_22) != null;
                } else {
                    ryw_3 ryw_32 = new ryw_3((gm_3)this.id_throws.id_class[56], rfH_22, false);
                    bl = !rdn_32.id_class() && (rdn_32.id_class(((gm_3)this.id_throws.id_class[56]).id_int(), ryw_32) || rdn_32.id_break(((gm_3)this.id_throws.id_class[56]).id_int(), ryw_32));
                }
            }
        }
        return bl;
    }

    public Hh_1(QY qY, rAL rAL2, yB_2 yB_22) {
        this.id_int = true;
        this.id_new = true;
        this.id_return = 1.0f;
        this.id_throws = qY;
        this.id_case = rAL2;
        this.id_class = qY.id_import();
        this.id_implements = new ct_3(qY.A());
        this.id_this = new HQ(this, qY);
        this.id_finally = yB_22;
        this.id_interface = null;
    }

    public void id_class(Qg_1 qg_1, double d) {
        RenderSystem.clear(256, (Boolean)QY.id_break[2]);
        RenderSystem.matrixMode(5889);
        RenderSystem.loadIdentity();
        double d2 = (double)qg_1.id_extends() / d;
        double d3 = (double)qg_1.id_native() / d;
        RenderSystem.ortho(0.0, d2, d3, 0.0, 1000.0, 3000.0);
        RenderSystem.matrixMode(5888);
        RenderSystem.loadIdentity();
        RenderSystem.translatef(0.0f, 0.0f, -2000.0f);
    }

    public void id_class(an_3 an_32) {
        if (this.id_interface != null) {
            this.id_interface.close();
        }
        this.id_interface = null;
        if (an_32 instanceof rEJ) {
            this.id_class(new rqO_2("shaders/post/creeper.json"));
        } else if (an_32 instanceof rGw_1) {
            this.id_class(new rqO_2("shaders/post/spider.json"));
        } else if (an_32 instanceof rEu_1) {
            this.id_class(new rqO_2("shaders/post/invert.json"));
        } else if (rrxr_3.rF.id_byte()) {
            rrxr_3.id_private(rrxr_3.rF, an_32, this);
        }
    }

    public void id_class(float f, long l, Ml_1 ml_1) {
        boolean bl;
        this.id_this.id_class(f);
        if (this.id_throws.id_catch() == null) {
            this.id_throws.id_break((cb_3)this.id_throws.id_class[57]);
        }
        this.id_class(f);
        if (rrbb_3.rs()) {
            rrdZ.id_class(this.id_throws, this.id_void, f, l);
        }
        if (bl = rrbb_3.rs()) {
            rrdZ.id_class(f, l);
        }
        boolean bl2 = this.id_int();
        ly_3 ly_32 = this.id_void;
        this.id_private = ((Qw_1)this.id_throws.id_class[20]).id_break * 16;
        if (rrbb_3.id_this()) {
            this.id_private *= 0.95f;
        }
        if (rrbb_3.id_else()) {
            this.id_private *= 0.83f;
        }
        Ml_1 ml_12 = new Ml_1();
        ml_12.id_byte().id_class().id_class(this.id_class(ly_32, f, true));
        Ml_1 ml_13 = ml_12;
        if (rrdZ.rr()) {
            ml_12 = ml_1;
        }
        if (((Qw_1)this.id_throws.id_class[20]).E > 0.0) {
            this.id_class(ml_12, f);
        }
        if (rrdZ.rr()) {
            ml_12 = ml_13;
        }
        rjV_2 rjV_22 = ml_12.id_byte().id_class();
        this.id_class(rjV_22);
        ly_32.id_class(this.id_throws, (gm_3)this.id_throws.id_class[56], this.id_throws.id_catch() == null ? (cb_3)this.id_throws.id_class[57] : this.id_throws.id_catch(), !((Qw_1)this.id_throws.id_class[20]).id_volatile().id_class(), ((Qw_1)this.id_throws.id_class[20]).id_volatile().id_break(), f);
        ml_1.id_class(rje_3.id_break.id_byte(ly_32.id_protected()));
        ml_1.id_class(rje_3.id_protected.id_byte(ly_32.id_throws() + 180.0f));
        ((yX_2)this.id_throws.id_class[8]).id_class(ml_1, f, l, bl2, ly_32, this, this.id_this, rjV_22);
        this.id_char = rjV_22.id_case();
        rjV_2 rjV_23 = ml_1.id_byte().id_class();
        this.id_char.id_class(rjV_23);
        rrfa_3.id_class(rjV_22, rjV_23, f);
        RenderEvent.id_class(ml_1, rjV_23, f);
        Objects.requireNonNull(this);
        if (!rrdZ.id_new) {
            if (bl) {
                rrdL.id_break(this, ml_1, ly_32, f);
                rrdZ.id_float();
            }
            RenderSystem.clear(256, (Boolean)QY.id_break[2]);
            if (bl) {
                rrdL.id_byte(this, ml_1, ly_32, f);
            } else {
                this.id_class(ml_1, ly_32, f);
            }
        }
        if (bl) {
            rrdZ.id_import();
        }
    }

    public void id_class(float f, long l, boolean bl) {
        this.id_continue();
        if (!(this.id_throws.id_static() || !((Qw_1)this.id_throws.id_class[20]).id_new || ((Qw_1)this.id_throws.id_class[20]).S && ((Qi_1)this.id_throws.id_class[22]).id_break())) {
            if (this.r < 2L) {
                ++this.r;
            }
            if (this.r == 1L) {
                rrfc_3.id_class();
            }
            if (rqR_2.id_break() - this.id_super > 500L) {
                this.id_throws.id_break(false);
            }
        } else {
            this.id_super = rqR_2.id_break();
        }
        if (!((Boolean)this.id_throws.id_class[72]).booleanValue()) {
            Object object;
            int n = (int)(((Qi_1)this.id_throws.id_class[22]).id_byte() * (double)this.id_throws.id_else().id_super() / (double)this.id_throws.id_else().id_new());
            int n2 = (int)(((Qi_1)this.id_throws.id_class[22]).id_protected() * (double)this.id_throws.id_else().id_this() / (double)this.id_throws.id_else().id_continue());
            if (bl && (gm_3)this.id_throws.id_class[56] != null && !rrbb_3.rw()) {
                this.id_class(f, l, new Ml_1());
                if (this.id_throws.id_finally() && this.id_continue < rqR_2.id_break() - 1000L) {
                    this.id_continue = rqR_2.id_break();
                    if (!this.id_throws.id_this().id_while()) {
                        this.id_package();
                    }
                }
                ((yX_2)this.id_throws.id_class[8]).id_byte();
                if (this.id_interface != null && this.id_float) {
                    RenderSystem.disableBlend();
                    RenderSystem.disableDepthTest();
                    RenderSystem.disableAlphaTest();
                    RenderSystem.enableTexture();
                    RenderSystem.matrixMode(5890);
                    RenderSystem.pushMatrix();
                    RenderSystem.loadIdentity();
                    this.id_interface.id_class(f);
                    RenderSystem.popMatrix();
                    RenderSystem.enableTexture();
                }
                this.id_throws.B().id_class(true);
            } else {
                RenderSystem.viewport(0, 0, this.id_throws.id_else().id_extends(), this.id_throws.id_else().id_native());
            }
            Qg_1 qg_1 = this.id_throws.id_else();
            this.id_class(qg_1, qg_1.id_return());
            HF.id_protected();
            Ml_1 ml_1 = new Ml_1();
            if (this.id_this.id_throws()) {
                this.id_this.id_class(false);
            }
            rrnG_2 rrnG_22 = rrnG_2.id_class((vm_3)this.id_throws.id_class[73], ml_1, n, n2, f);
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(rrnG_22);
            vm_3 vm_32 = rrnG_22.id_break();
            this.id_throws.id_class[74] = vm_32;
            vm_3 vm_33 = vm_32;
            if (bl && (gm_3)this.id_throws.id_class[56] != null && (!((Qw_1)this.id_throws.id_class[20]).g || vm_33 != null)) {
                RenderSystem.defaultAlphaFunc();
                this.id_class(this.id_throws.id_else().id_super(), this.id_throws.id_else().id_this(), f);
                ((cq_3)this.id_throws.id_class[19]).id_class(ml_1, f);
                if (((Qw_1)this.id_throws.id_class[20]).rC && !((Qw_1)this.id_throws.id_class[20]).R) {
                    rrbb_3.id_class(ml_1);
                }
                RenderSystem.clear(256, (Boolean)QY.id_break[2]);
            }
            if (this.id_switch == ((cT_2)this.id_throws.id_class[75] == null)) {
                if ((cT_2)this.id_throws.id_class[75] != null) {
                    cj_3.id_class(this.id_throws);
                    object = (cT_2)this.id_throws.id_class[75];
                    if (object instanceof cj_3) {
                        cj_3 cj_32 = (cj_3)object;
                        cj_32.id_protected();
                    }
                }
                boolean bl2 = this.id_switch = (cT_2)this.id_throws.id_class[75] != null;
            }
            if ((cT_2)this.id_throws.id_class[75] != null) {
                try {
                    ((cT_2)this.id_throws.id_class[75]).id_class(ml_1, n, n2, this.id_throws.id_default());
                }
                catch (Throwable throwable) {
                    object = KY.id_class(throwable, "Rendering overlay");
                    Ko_1 ko_1 = ((KY)object).id_class("Overlay render details");
                    ko_1.id_class("Overlay name", () -> ((cT_2)this.id_throws.id_class[75]).getClass().getCanonicalName());
                    throw new KU((KY)object);
                }
            }
            if (vm_33 != null) {
                try {
                    boolean bl3;
                    boolean bl4 = bl3 = ((Qw_1)this.id_throws.id_class[20]).rs != 2;
                    if (bl3 && vm_33 instanceof rrvE) {
                        this.id_class(qg_1, 2.0);
                    }
                    int n3 = (int)(((Qi_1)this.id_throws.id_class[22]).id_byte() * (double)qg_1.id_volatile() / (double)qg_1.id_new());
                    int n4 = (int)(((Qi_1)this.id_throws.id_class[22]).id_protected() * (double)qg_1.id_final() / (double)qg_1.id_continue());
                    vm_33.id_class(ml_1, n, n2, this.id_throws.id_default());
                    if (vm_33 instanceof ClickGuiScreen) {
                        ClickGuiScreen clickGuiScreen = (ClickGuiScreen)ClickGuiScreen.id_class[0];
                        clickGuiScreen.id_byte(false);
                        clickGuiScreen.id_class(ml_1, (int)((Integer)rrvk_1.id_class[0]), (int)((Integer)rrvk_1.id_class[1]), this.id_throws.id_default());
                        clickGuiScreen.id_byte(true);
                    }
                    Integer n5 = n3;
                    rrvk_1.id_class[0] = n5;
                    Integer n6 = n4;
                    rrvk_1.id_class[1] = n6;
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnS_2.id_class(vm_33, ml_1, n, n2, f));
                }
                catch (Throwable throwable) {
                    object = KY.id_class(throwable, "Rendering screen");
                    Ko_1 ko_1 = ((KY)object).id_class("Screen render details");
                    ko_1.id_class("Screen name", () -> vm_33.getClass().getCanonicalName());
                    ko_1.id_class("Mouse location", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%f, %f)", n, n2, ((Qi_1)this.id_throws.id_class[22]).id_byte(), ((Qi_1)this.id_throws.id_class[22]).id_protected()));
                    ko_1.id_class("Screen size", () -> String.format(Locale.ROOT, "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f", this.id_throws.id_else().id_super(), this.id_throws.id_else().id_this(), this.id_throws.id_else().id_extends(), this.id_throws.id_else().id_native(), this.id_throws.id_else().id_return()));
                    throw new KU((KY)object);
                }
            }
            this.id_this.id_class(true);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(ml_1);
        }
        this.id_super();
        this.id_new();
        rrWU.id_class();
        if (((Qw_1)this.id_throws.id_class[20]).rn) {
            ((Qw_1)this.id_throws.id_class[20]).Y = true;
        }
    }

    public static float id_class(iB_2 iB_22, float f) {
        int n = iB_22.id_byte(rLD.id_int).id_break();
        return n > 200 ? 1.0f : 0.7f + rfU_2.id_class(((float)n - f) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public rjV_2 id_class(ly_3 ly_32, float f, boolean bl) {
        Ml_1 ml_1 = new Ml_1();
        ml_1.id_byte().id_class().id_class();
        if (rrbb_3.rs() && rrdZ.R()) {
            rrdZ.id_case(ml_1);
        }
        this.id_short = this.id_private * 2.0f;
        if (this.id_short < 173.0f) {
            this.id_short = 173.0f;
        }
        Objects.requireNonNull(this);
        if (1.0f != 1.0f) {
            ml_1.id_class((double)this.id_public, (double)(-this.id_goto), 0.0);
            Objects.requireNonNull(this);
            Objects.requireNonNull(this);
            ml_1.id_class(1.0f, 1.0f, 1.0f);
        }
        ml_1.id_byte().id_class().id_class(rjV_2.id_class(this.id_break(ly_32, f, bl), (float)this.id_throws.id_else().id_extends() / (float)this.id_throws.id_else().id_native(), 0.05f, this.id_short));
        return ml_1.id_byte().id_class();
    }

    private void id_class(int n, int n2, float f) {
        if (this.id_while != null && this.id_try > 0) {
            int n3 = 40 - this.id_try;
            float f2 = ((float)n3 + f) / 40.0f;
            float f3 = f2 * f2;
            float f4 = f2 * f3;
            float f5 = 10.25f * f4 * f3 - 24.95f * f3 * f3 + 25.5f * f4 - 13.8f * f3 + 4.0f * f2;
            float f6 = f5 * (float)Math.PI;
            float f7 = this.id_instanceof * (float)(n / 4);
            float f8 = this.id_throw * (float)(n2 / 4);
            RenderSystem.enableAlphaTest();
            RenderSystem.pushMatrix();
            RenderSystem.pushLightingAttributes();
            RenderSystem.enableDepthTest();
            RenderSystem.disableCull();
            Ml_1 ml_1 = new Ml_1();
            ml_1.id_class();
            ml_1.id_class((double)((float)(n / 2) + f7 * rfU_2.id_throws(rfU_2.id_class(f6 * 2.0f))), (double)((float)(n2 / 2) + f8 * rfU_2.id_throws(rfU_2.id_class(f6 * 2.0f))), -50.0);
            float f9 = 50.0f + 175.0f * rfU_2.id_class(f6);
            ml_1.id_class(f9, -f9, f9);
            ml_1.id_class(rje_3.id_protected.id_byte(900.0f * rfU_2.id_throws(rfU_2.id_class(f6))));
            ml_1.id_class(rje_3.id_break.id_byte(6.0f * rfU_2.id_break(f2 * 8.0f)));
            ml_1.id_class(rje_3.id_case.id_byte(6.0f * rfU_2.id_break(f2 * 8.0f)));
            Hd_1 hd_1 = this.id_finally.id_break();
            this.id_throws.id_float().id_class(this.id_while, IQ.FIXED, 0xF000F0, fZ_2.id_class, ml_1, hd_1);
            ml_1.id_break();
            hd_1.id_break();
            RenderSystem.popAttributes();
            RenderSystem.popMatrix();
            RenderSystem.enableCull();
            RenderSystem.disableDepthTest();
        }
    }

    public void id_class(rdn_3 rdn_32) {
        this.id_while = rdn_32;
        this.id_try = 40;
        this.id_instanceof = this.id_catch.nextFloat() * 2.0f - 1.0f;
        this.id_throw = this.id_catch.nextFloat() * 2.0f - 1.0f;
    }

    public boolean id_class(int n) {
        if (!GLX.isUsingFBOs()) {
            return false;
        }
        if (this.id_interface != null && this.id_interface != this.id_double[2] && this.id_interface != this.id_double[4]) {
            return true;
        }
        if (n != 2 && n != 4) {
            if (this.id_interface == null) {
                return true;
            }
            this.id_interface.close();
            this.id_interface = null;
            return true;
        }
        if (this.id_interface != null && this.id_interface == this.id_double[n]) {
            return true;
        }
        if ((gm_3)this.id_throws.id_class[56] == null) {
            return true;
        }
        this.id_class(new rqO_2("shaders/post/fxaa_of_" + n + "x.json"));
        this.id_double[n] = this.id_interface;
        return this.id_float;
    }

    private void id_class(vB_2 vB_22) {
        try {
            String string = null;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            int n = calendar.get(5);
            int n2 = calendar.get(2) + 1;
            if (n == 8 && n2 == 4) {
                string = "Happy birthday, OptiFine!";
            }
            if (n == 14 && n2 == 8) {
                string = "Happy birthday, sp614x!";
            }
            if (string == null) {
                return;
            }
            rrxr_3.id_class((Object)vB_22, rrxr_3.SX, (Object)string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public void id_class(float f) {
        an_3 an_33 = this.id_throws.id_catch();
        if (an_33 != null && (gm_3)this.id_throws.id_class[56] != null) {
            rfl_3 rfl_32;
            Object var24_3 = null;
            this.id_throws.id_class[63] = var24_3;
            double d = ((Ax_1)this.id_throws.id_class[55]).id_byte();
            rrAz_1 rrAz_12 = rrAz_1.id_class(an_33.id_break(d, f, false), 3.0, d, an_33.id_new(f), an_33.rN(), an_33.rO(), false, f);
            rrAz_1.id_class(rrAz_12);
            rjG_2 rjG_22 = rrAz_12.id_break();
            this.id_throws.id_class[64] = rjG_22;
            if ((rjG_2)this.id_throws.id_class[64] != null && ((rjG_2)this.id_throws.id_class[64]).id_byte() == rjM_2.NONE) {
                return;
            }
            rjU_2 rjU_22 = rrAz_12.id_throws();
            boolean bl = false;
            double d2 = d;
            if (!rrAz_12.id_byte() && ((Ax_1)this.id_throws.id_class[55]).id_private()) {
                d = d2 = 6.0;
            } else if (d > 3.0) {
                bl = true;
            }
            d2 *= d2;
            if ((rjG_2)this.id_throws.id_class[64] != null) {
                d2 = ((rjG_2)this.id_throws.id_class[64]).id_case().id_implements(rjU_22);
            }
            PX pX = rrAz_12.id_catch();
            rjU_2 rjU_23 = an_33.id_class(pX.id_throws(), pX.id_protected(), 1.0f);
            rjU_2 rjU_24 = rjU_22.id_break(rjU_23.id_break * d, rjU_23.id_byte * d, rjU_23.id_protected * d);
            rfo_3 rfo_32 = rhj_3.id_class(an_33, rjU_22, rjU_24, rfl_32 = rrAz_12.id_implements().id_break(rjU_23.id_class(d)).id_byte(1.0, 1.0, 1.0), an_32 -> !an_32.id_native() && an_32.rY(), d2);
            if (rfo_32 != null) {
                rrAW rrAW2 = rrAW.id_class(rfo_32);
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAW2);
                an_3 an_34 = rfo_32.id_class();
                rjU_2 rjU_25 = rfo_32.id_case();
                double d3 = rjU_22.id_implements(rjU_25);
                if (bl && d3 > 9.0) {
                    rff_3 rff_32 = rff_3.id_class(rjU_25, rpr_3.id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected), new rfH_2(rjU_25));
                    this.id_throws.id_class[64] = rff_32;
                } else if (!rrAW2.id_byte() && (d3 < d2 || (rjG_2)this.id_throws.id_class[64] == null)) {
                    rfo_3 rfo_33 = rrAW2.id_class();
                    this.id_throws.id_class[64] = rfo_33;
                    if (an_34 instanceof iB_2 || an_34 instanceof rsG_2) {
                        an_3 an_35 = an_34;
                        this.id_throws.id_class[63] = an_35;
                    }
                }
            }
        }
    }

    public void id_class(int n, int n2) {
        if (this.id_interface != null) {
            this.id_interface.id_class(n, n2);
        }
        ((yX_2)this.id_throws.id_class[8]).id_class(n, n2);
    }

    public void id_class(Vq_1 vq_1) {
        this.id_interface = vq_1;
    }

    @Override
    public void id_class(rAL rAL2) {
        if (this.id_interface != null) {
            this.id_interface.close();
        }
        this.id_interface = null;
        if (this.id_long == id_break) {
            this.id_class(this.id_throws.id_catch());
        } else {
            this.id_class(id_abstract[this.id_long]);
        }
    }

    public void id_class(rqO_2 rqO_22) {
        if (GLX.isUsingFBOs()) {
            if (this.id_interface != null) {
                this.id_interface.close();
            }
            try {
                this.id_interface = new Vq_1(this.id_throws.A(), this.id_case, this.id_throws.B(), rqO_22);
                this.id_interface.id_class(this.id_throws.id_else().id_extends(), this.id_throws.id_else().id_native());
                this.id_float = true;
            }
            catch (IOException iOException) {
                id_protected.warn("Failed to load shader: {}", (Object)rqO_22, (Object)iOException);
                this.id_long = id_break;
                this.id_float = false;
            }
            catch (JsonSyntaxException jsonSyntaxException) {
                id_protected.warn("Failed to parse shader: {}", (Object)rqO_22, (Object)jsonSyntaxException);
                this.id_long = id_break;
                this.id_float = false;
            }
        }
    }

    private void id_class(Ml_1 ml_1, ly_3 ly_32, float f) {
        this.id_class(ml_1, ly_32, f, true, true, false);
    }

    public void id_class(Ml_1 ml_1, ly_3 ly_32, float f, boolean bl, boolean bl2, boolean bl3) {
        if (!this.id_synchronized) {
            rrdZ.id_break(bl3);
            this.id_class(this.id_class(ly_32, f, false));
            MH mH = ml_1.id_byte();
            mH.id_class().id_class();
            mH.id_break().id_byte();
            boolean bl4 = false;
            if (bl) {
                ml_1.id_class();
                if (((Qw_1)this.id_throws.id_class[20]).E > 0.0) {
                    this.id_class(ml_1, f);
                }
                boolean bl5 = bl4 = this.id_throws.id_catch() instanceof iB_2 && ((iB_2)this.id_throws.id_catch()).Sc();
                if ((((Qw_1)this.id_throws.id_class[20]).id_volatile().id_class() || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()) && !bl4 && !((Qw_1)this.id_throws.id_class[20]).g && ((Ax_1)this.id_throws.id_class[55]).id_native() != rRl_1.SPECTATOR) {
                    this.id_this.id_byte();
                    if (rrbb_3.rs()) {
                        rrdL.id_class(this.id_class, f, ml_1, this.id_finally.id_break(), (cb_3)this.id_throws.id_class[57], this.id_throws.id_case().id_class((cb_3)this.id_throws.id_class[57], f), bl3);
                    } else {
                        this.id_class.id_class(f, ml_1, this.id_finally.id_break(), (cb_3)this.id_throws.id_class[57], this.id_throws.id_case().id_class((cb_3)this.id_throws.id_class[57], f));
                    }
                    this.id_this.id_break();
                }
                ml_1.id_break();
            }
            rrdZ.g();
            if (!bl2) {
                return;
            }
            this.id_this.id_break();
            if ((((Qw_1)this.id_throws.id_class[20]).id_volatile().id_class() || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()) && !bl4) {
                Hm_1.id_class(this.id_throws, ml_1);
            }
            if (((Qw_1)this.id_throws.id_class[20]).E > 0.0) {
                this.id_class(ml_1, f);
            }
        }
    }

    private void id_class(Ml_1 ml_1, float f) {
        an_3 an_32 = this.id_throws.id_catch();
        if (an_32 instanceof rhd_3) {
            rhd_3 rhd_32 = (rhd_3)an_32;
            float f2 = ((Float)rhd_32.id_throws[29]).floatValue() - ((Float)rhd_32.id_throws[28]).floatValue();
            float f3 = -(((Float)rhd_32.id_throws[29]).floatValue() + f2 * f);
            float f4 = rfU_2.id_catch(f, ((Float)rhd_32.id_implements[7]).floatValue(), ((Float)rhd_32.id_implements[8]).floatValue());
            ml_1.id_class((double)(rfU_2.id_class(f3 * (float)Math.PI) * (f4 *= (float)((Qw_1)this.id_throws.id_class[20]).E) * 0.5f), (double)(-Math.abs(rfU_2.id_break(f3 * (float)Math.PI) * f4)), 0.0);
            ml_1.id_class(rje_3.id_case.id_byte(rfU_2.id_class(f3 * (float)Math.PI) * f4 * 3.0f));
            ml_1.id_class(rje_3.id_break.id_byte(Math.abs(rfU_2.id_break(f3 * (float)Math.PI - 0.2f) * f4) * 5.0f));
        }
    }

    public void id_class(rjV_2 rjV_22) {
        RenderSystem.matrixMode(5889);
        RenderSystem.loadIdentity();
        RenderSystem.multMatrix(rjV_22);
        RenderSystem.matrixMode(5888);
    }

    @Override
    public void close() {
        this.id_this.close();
        this.id_implements.close();
        this.id_else.close();
        this.id_break();
    }

    public float id_break(float f) {
        return rfU_2.id_catch(f, this.id_package, this.id_final);
    }

    public void id_break() {
        if (this.id_interface != null) {
            this.id_interface.close();
        }
        this.id_interface = null;
        this.id_long = id_break;
    }

    private double id_break(ly_3 ly_32, float f, boolean bl) {
        if (this.id_synchronized) {
            return 90.0;
        }
        double d = 70.0;
        if (bl) {
            d = ((Qw_1)this.id_throws.id_class[20]).U;
            if (rrbb_3.rX()) {
                d *= (double)rfU_2.id_catch(f, this.id_volatile, this.id_native);
            }
        }
        boolean bl2 = false;
        if ((vm_3)this.id_throws.id_class[73] == null) {
            bl2 = ((Qw_1)this.id_throws.id_class[20]).Pf.id_protected();
        }
        if (bl2) {
            if (!rrbb_3.id_package) {
                rrbb_3.id_package = true;
                rrbb_3.id_int = ((Qw_1)this.id_throws.id_class[20]).D;
                ((Qw_1)this.id_throws.id_class[20]).D = true;
                ((yX_2)this.id_throws.id_class[8]).id_volatile();
            }
            if (rrbb_3.id_package) {
                d /= 4.0;
            }
        } else if (rrbb_3.id_package) {
            rrbb_3.id_package = false;
            ((Qw_1)this.id_throws.id_class[20]).D = rrbb_3.id_int;
            ((yX_2)this.id_throws.id_class[8]).id_volatile();
        }
        if (ly_32.id_catch() instanceof iB_2 && ((iB_2)ly_32.id_catch()).Sl()) {
            float f2 = Math.min((float)((Integer)((iB_2)ly_32.id_catch()).id_private[13]).intValue() + f, 20.0f);
            d /= (double)((1.0f - 500.0f / (f2 + 500.0f)) * 2.0f + 1.0f);
        }
        return d;
    }

    public Vq_1 id_throws() {
        return this.id_interface;
    }

    public ly_3 id_finally() {
        return this.id_void;
    }

    public ct_3 id_catch() {
        return this.id_implements;
    }

    public HQ id_extends() {
        return this.id_this;
    }

    public void id_case() {
        this.id_while = null;
        this.id_implements.id_class();
        this.id_void.id_package();
    }

    private void id_continue() {
        vm_3 vm_32;
        Object object;
        gm_3 gm_32;
        rrbb_3.rf();
        rrbo_3.id_class();
        if (!this.id_static) {
            rrxM_2.id_class();
            if (rrbb_3.ru() == 64 && rrbb_3.rm() == 32) {
                rrbb_3.id_class(true);
            }
            this.id_static = true;
        }
        if ((gm_32 = (gm_3)this.id_throws.id_class[56]) != null && rrbb_3.rZ()) {
            rrbb_3.id_class(false);
            object = new rgN_2(jI_2.id_class("of.message.java64Bit", new Object[0]));
            ((cq_3)this.id_throws.id_class[19]).id_throws().id_class((rgP_2)object);
        }
        if ((vm_32 = (vm_3)this.id_throws.id_class[73]) instanceof vB_2) {
            object = (vB_2)vm_32;
            this.id_class((vB_2)object);
        }
        if (this.id_import != gm_32) {
            rrME.id_class(this.id_import, (rYB)gm_32);
            rrbb_3.id_volatile();
            this.id_default = 0L;
            this.id_const = 0;
            this.id_import = gm_32;
        }
        if (!this.id_class(rrdZ.So)) {
            rrdZ.So = 0;
        }
        if ((vm_3)this.id_throws.id_class[73] != null && ((vm_3)this.id_throws.id_class[73]).getClass() == FP.class) {
            this.id_throws.id_break(new rrJr_1((FP)((vm_3)this.id_throws.id_class[73])));
        }
    }

    public float id_implements() {
        return this.id_private;
    }

    private void id_new() {
        this.id_boolean = 0;
        if (rrbb_3.rO() && rrbb_3.rM()) {
            rng_3 rng_32;
            if (this.id_throws.id_switch() && (rng_32 = this.id_throws.id_this()) != null) {
                boolean bl = this.id_throws.id_throw();
                if (!bl && !((vm_3)this.id_throws.id_class[73] instanceof Zb_1)) {
                    if (this.id_strictfp > 0) {
                        rrbb_3.id_class((long)this.id_strictfp);
                        this.id_boolean = this.id_strictfp;
                    }
                    long l = System.nanoTime() / 1000000L;
                    if (this.id_default != 0L && this.id_const != 0) {
                        long l2 = l - this.id_default;
                        if (l2 < 0L) {
                            this.id_default = l;
                            l2 = 0L;
                        }
                        if (l2 >= 50L) {
                            this.id_default = l;
                            int n = rng_32.Q();
                            int n2 = n - this.id_const;
                            if (n2 < 0) {
                                this.id_const = n;
                                n2 = 0;
                            }
                            if (n2 < 1 && this.id_strictfp < 100) {
                                this.id_strictfp += 2;
                            }
                            if (n2 > 1 && this.id_strictfp > 0) {
                                --this.id_strictfp;
                            }
                            this.id_const = n;
                        }
                    } else {
                        this.id_default = l;
                        this.id_const = rng_32.Q();
                        this.id_for = 1.0f;
                        this.id_transient = 50.0f;
                    }
                } else {
                    if ((vm_3)this.id_throws.id_class[73] instanceof Zb_1) {
                        rrbb_3.id_class(20L);
                    }
                    this.id_default = 0L;
                    this.id_const = 0;
                }
            }
        } else {
            this.id_default = 0L;
            this.id_const = 0;
        }
    }

    private void id_package() {
        if (((yX_2)this.id_throws.id_class[8]).id_private() > 10 && ((yX_2)this.id_throws.id_class[8]).id_native() && !this.id_throws.id_this().id_while()) {
            fN_2 fN_22 = rqW_2.id_class(this.id_throws.id_else().id_extends(), this.id_throws.id_else().id_native(), this.id_throws.B());
            rqR_2.id_catch().execute(() -> {
                int n = fN_22.id_class();
                int n2 = fN_22.id_break();
                int n3 = 0;
                int n4 = 0;
                if (n > n2) {
                    n3 = (n - n2) / 2;
                    n = n2;
                } else {
                    n4 = (n2 - n) / 2;
                    n2 = n;
                }
                try (fN_2 fN_23 = new fN_2(64, 64, false);){
                    fN_22.id_class(n3, n4, n, n2, fN_23);
                    fN_23.id_class(this.id_throws.id_this().id_try());
                }
                catch (IOException iOException) {
                    id_protected.warn("Couldn't save auto screenshot", (Throwable)iOException);
                }
                finally {
                    fN_22.close();
                }
            });
        }
    }

    private void id_super() {
        int n;
        if ((gm_3)this.id_throws.id_class[56] != null && rrbb_3.rT() && rrzQ_2.id_class("CheckGlErrorFrameFinish", 10000L) && (n = MT.id_switch()) != 0 && rrbo_3.id_class(n)) {
            String string = rrbb_3.id_byte(n);
            rgN_2 rgN_22 = new rgN_2(jI_2.id_class("of.message.openglError", n, string));
            ((cq_3)this.id_throws.id_class[19]).id_throws().id_class(rgN_22);
        }
    }

    public void id_protected() {
        this.id_final();
        this.id_this.id_class();
        if (this.id_throws.id_catch() == null) {
            this.id_throws.id_break((cb_3)this.id_throws.id_class[57]);
        }
        this.id_void.id_class();
        ++this.id_extends;
        this.id_class.id_class();
        ((yX_2)this.id_throws.id_class[8]).id_class(this.id_void);
        this.id_package = this.id_final;
        if (((cq_3)this.id_throws.id_class[19]).id_extends().id_throws()) {
            this.id_final += 0.05f;
            if (this.id_final > 1.0f) {
                this.id_final = 1.0f;
            }
        } else if (this.id_final > 0.0f) {
            this.id_final -= 0.0125f;
        }
        if (this.id_try > 0) {
            --this.id_try;
            if (this.id_try == 0) {
                this.id_while = null;
            }
        }
    }

    public rrGK id_private() {
        return rrGD.SHADERS;
    }

    private void id_final() {
        float f = 1.0f;
        an_3 an_32 = this.id_throws.id_catch();
        if (an_32 instanceof cG_2) {
            cG_2 cG_22 = (cG_2)an_32;
            f = cG_22.id_new();
        }
        this.id_volatile = this.id_native;
        this.id_native += (f - this.id_native) * 0.5f;
        if (this.id_native > 1.5f) {
            this.id_native = 1.5f;
        }
        if (this.id_native < 0.1f) {
            this.id_native = 0.1f;
        }
    }

    public rjV_2 id_volatile() {
        return this.id_char;
    }

    public fZ_2 id_native() {
        return this.id_else;
    }
}

