/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.Hh_1;
import celestial.Hz_1;
import celestial.MK;
import celestial.MT;
import celestial.Ml_1;
import celestial.OP;
import celestial.QY;
import celestial.Qw_1;
import celestial.VX;
import celestial.an_3;
import celestial.cI_2;
import celestial.cY_2;
import celestial.cb_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.ly_3;
import celestial.rAa_1;
import celestial.rJZ;
import celestial.rLD;
import celestial.rRl_1;
import celestial.rVU;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rgF_2;
import celestial.rgL_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rlG_2;
import celestial.rnB_2;
import celestial.rnO_2;
import celestial.rnP_2;
import celestial.rns_3;
import celestial.roE_2;
import celestial.rpQ_2;
import celestial.rpZ_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rrAa_1;
import celestial.rrMd_1;
import celestial.rrQX;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rrby_3;
import celestial.rrnB_2;
import celestial.rrnE_2;
import celestial.rrxr_3;
import celestial.ryj_3;
import celestial.uB_2;
import celestial.uP_2;
import celestial.uR_2;
import celestial.uV_2;
import celestial.uj_3;
import celestial.uo_3;
import celestial.ur_3;
import celestial.yb_3;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class cq_3
extends ch_3 {
    private static final rqO_2 id_throws = new rqO_2("textures/misc/vignette.png");
    private static final rqO_2 id_case = new rqO_2("textures/gui/widgets.png");
    private static final rqO_2 id_catch = new rqO_2("textures/misc/pumpkinblur.png");
    private static final rgP_2 id_private = new rgn_3("demo.demoExpired");
    private final Random id_implements = new Random();
    private final QY id_finally;
    private final Hz_1 id_extends;
    private final cI_2 id_native;
    private int id_volatile;
    private rgP_2 id_final;
    private int id_package;
    private boolean id_int;
    private boolean id_new;
    public float id_class = 1.0f;
    private int id_continue;
    private rdn_3 id_super = rdn_3.id_break;
    private final uV_2 id_this;
    private final uo_3 id_else;
    private final cY_2 id_synchronized;
    private final uR_2 id_return;
    private final uj_3 id_public;
    private int id_goto;
    private rgP_2 id_while;
    private rgP_2 id_try;
    private int id_instanceof;
    private int id_throw;
    private int id_interface;
    private int id_char;
    private int id_abstract;
    private long id_long;
    private long id_float;
    private int id_void;
    private int id_static;
    private int id_import;
    private final Map<rVU, List<ur_3>> id_short = Maps.newHashMap();
    private final Set<String> id_default = new HashSet<String>();
    private rnP_2 id_const;

    private void id_byte(Ml_1 ml_1) {
        Qw_1 qw_1 = (Qw_1)this.id_finally.id_class[20];
        if ((qw_1.id_volatile().id_class() || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()) && (((Ax_1)this.id_finally.id_class[55]).id_native() != rRl_1.SPECTATOR || this.id_class((rjG_2)this.id_finally.id_class[64]))) {
            if (qw_1.R && !qw_1.g && !((cb_3)this.id_finally.id_class[57]).sW() && !qw_1.id_switch) {
                RenderSystem.pushMatrix();
                RenderSystem.translatef(this.id_void / 2, this.id_static / 2, this.h_());
                ly_3 ly_32 = ((Hh_1)this.id_finally.id_class[16]).id_finally();
                RenderSystem.rotatef(ly_32.id_protected(), -1.0f, 0.0f, 0.0f);
                RenderSystem.rotatef(ly_32.id_throws(), 0.0f, 1.0f, 0.0f);
                RenderSystem.scalef(-1.0f, -1.0f, -1.0f);
                RenderSystem.renderCrosshair(10);
                RenderSystem.popMatrix();
            } else {
                RenderSystem.blendFuncSeparate(OP.ONE_MINUS_DST_COLOR, MK.ONE_MINUS_SRC_COLOR, OP.ONE, MK.ZERO);
                if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAa_1.id_class()).id_byte()) {
                    this.id_break(ml_1, (this.id_void - 15) / 2, (this.id_static - 15) / 2, 0, 0, 15, 15);
                    if (((Qw_1)this.id_finally.id_class[20]).id_interface == VX.CROSSHAIR) {
                        float f = ((cb_3)this.id_finally.id_class[57]).id_class(0.0f, false);
                        boolean bl = false;
                        if ((an_3)this.id_finally.id_class[63] != null && (an_3)this.id_finally.id_class[63] instanceof iB_2 && f >= 1.0f) {
                            bl = ((cb_3)this.id_finally.id_class[57]).id_byte(false) > 5.0f;
                            bl &= ((an_3)this.id_finally.id_class[63]).BM();
                        }
                        int n = this.id_static / 2 - 7 + 16;
                        int n2 = this.id_void / 2 - 8;
                        if (bl) {
                            this.id_break(ml_1, n2, n, 68, 94, 16, 16);
                        } else if (f < 1.0f) {
                            int n3 = (int)(f * 17.0f);
                            this.id_break(ml_1, n2, n, 36, 94, 16, 4);
                            this.id_break(ml_1, n2, n, 52, 94, n3, 4);
                        }
                    }
                }
            }
        }
    }

    public int id_int() {
        return this.id_import;
    }

    public cq_3(QY qY) {
        this.id_finally = qY;
        this.id_extends = qY.id_float();
        this.id_this = new uV_2(qY);
        this.id_synchronized = new cY_2(qY);
        this.id_native = new cI_2(qY);
        this.id_return = new uR_2(qY, this);
        this.id_public = new uj_3(qY);
        this.id_else = new uo_3(qY);
        for (rVU rVU2 : rVU.values()) {
            this.id_short.put(rVU2, Lists.newArrayList());
        }
        this.id_short.get((Object)rVU.CHAT).add(new uP_2(qY));
        this.id_short.get((Object)rVU.SYSTEM).add(new uP_2(qY));
        this.id_short.get((Object)rVU.GAME_INFO).add(new uB_2(qY));
        this.id_class();
    }

    private iB_2 id_this() {
        rhd_3 rhd_32 = this.id_super();
        if (rhd_32 != null) {
            an_3 an_32 = rhd_32.ra();
            if (an_32 == null) {
                return null;
            }
            if (an_32 instanceof iB_2) {
                return (iB_2)an_32;
            }
        }
        return null;
    }

    public void id_class(float f, float f2, float f3, rhd_3 rhd_32, rdn_3 rdn_32, boolean bl) {
        if (!rdn_32.id_class()) {
            int n = rdn_32.id_interface();
            float f4 = (float)n - f3;
            if (f4 > 0.0f) {
                RenderSystem.pushMatrix();
                float f5 = 1.0f + f4 / 5.0f;
                RenderSystem.translatef(f + 8.0f, f2 + 12.0f, 0.0f);
                RenderSystem.scalef(1.0f / f5, (f5 + 1.0f) / 2.0f, 1.0f);
                RenderSystem.translatef(-(f + 8.0f), -(f2 + 12.0f), 0.0f);
            }
            this.id_extends.id_class(rhd_32, rdn_32, f, f2);
            if (f4 > 0.0f) {
                RenderSystem.popMatrix();
            }
            this.id_extends.id_class((cm_3)this.id_finally.id_class[15], rdn_32, f, f2);
            if (bl) {
                int n2 = rdn_32.id_class((cb_3)this.id_finally.id_class[57]);
                this.id_extends.id_class((cm_3)this.id_finally.id_class[15], rdn_32, f, f2, "" + n2);
            }
        }
    }

    public void id_class(Ml_1 ml_1, float f) {
        int n;
        float f2;
        int n2;
        this.id_void = this.id_finally.id_else().id_super();
        this.id_static = this.id_finally.id_else().id_this();
        cm_3 cm_32 = this.id_catch();
        RenderSystem.enableBlend();
        if (rrbb_3.A()) {
            this.id_break(this.id_finally.id_catch());
        } else {
            RenderSystem.enableDepthTest();
            RenderSystem.defaultBlendFunc();
        }
        rrnE_2.id_class(ml_1, f);
        if (((Ax_1)this.id_finally.id_class[55]).id_native() == rRl_1.SPECTATOR) {
            this.id_synchronized.id_class(ml_1, f);
        } else if (!((Qw_1)this.id_finally.id_class[20]).g) {
            this.id_class(f, ml_1);
        }
        if (!((Qw_1)this.id_finally.id_class[20]).g) {
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.id_finally.A().id_class(id_protected);
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            this.id_byte(ml_1);
            MT.id_throws();
            RenderSystem.defaultBlendFunc();
            if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_continue()) {
                this.id_public.id_class(ml_1);
            }
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.id_finally.A().id_class(id_protected);
            if (((Ax_1)this.id_finally.id_class[55]).id_class()) {
                this.id_protected(ml_1);
            }
            this.id_throws(ml_1);
            RenderSystem.disableBlend();
            n2 = this.id_void / 2 - 91;
            if (((cb_3)this.id_finally.id_class[57]).L()) {
                this.id_class(ml_1, n2);
            } else if (((Ax_1)this.id_finally.id_class[55]).id_throws()) {
                this.id_break(ml_1, n2);
            }
            if (((Qw_1)this.id_finally.id_class[20]).id_else && ((Ax_1)this.id_finally.id_class[55]).id_native() != rRl_1.SPECTATOR) {
                this.id_class(ml_1);
            } else if (((cb_3)this.id_finally.id_class[57]).id_native()) {
                this.id_synchronized.id_class(ml_1);
            }
            this.id_synchronized.id_class(ml_1);
        }
        if (((cb_3)this.id_finally.id_class[57]).su() > 0) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableAlphaTest();
            float f3 = ((cb_3)this.id_finally.id_class[57]).su();
            f2 = f3 / 100.0f;
            if (f2 > 1.0f) {
                f2 = 1.0f - (f3 - 100.0f) / 10.0f;
            }
            n = (int)(220.0f * f2) << 24 | 0x101020;
            cq_3.id_class(ml_1, 0, 0, this.id_void, this.id_static, n);
            RenderSystem.enableAlphaTest();
            RenderSystem.enableDepthTest();
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (this.id_finally.id_int()) {
            this.id_break(ml_1);
        }
        if (((Qw_1)this.id_finally.id_class[20]).R) {
            this.id_this.id_class(ml_1);
        }
        if (!((Qw_1)this.id_finally.id_class[20]).g) {
            rnP_2 rnP_22;
            int n3;
            int n4;
            n2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_new();
            if (this.id_final != null && this.id_package > 0 && (n2 != 0 || this.id_final instanceof rVe_1)) {
                f2 = (float)this.id_package - f;
                n = (int)(f2 * 255.0f / 20.0f);
                if (n > 255) {
                    n = 255;
                }
                if (n > 8) {
                    RenderSystem.pushMatrix();
                    RenderSystem.translatef(this.id_void / 2, this.id_static - 68 + (this.id_import + 15), 0.0f);
                    RenderSystem.enableBlend();
                    RenderSystem.defaultBlendFunc();
                    int n5 = 0xFFFFFF;
                    if (this.id_int) {
                        n5 = rfU_2.id_case(f2 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                    }
                    n4 = n << 24 & 0xFF000000;
                    n3 = cm_32.id_class(this.id_final);
                    this.id_class(ml_1, -4, n3, 0xFFFFFF | n4);
                    if (this.id_new) {
                        cm_32.id_break(ml_1, this.id_final, (float)(-n3 / 2), -4.0f, n5 | n4);
                    } else {
                        cm_32.id_byte(ml_1, this.id_final, -n3 / 2, -4.0f, n5 | n4);
                    }
                    RenderSystem.disableBlend();
                    RenderSystem.popMatrix();
                }
            }
            if (this.id_while != null && this.id_goto > 0 && (n2 != 0 || this.id_while instanceof rVe_1)) {
                f2 = (float)this.id_goto - f;
                n = 255;
                if (this.id_goto > this.id_interface + this.id_throw) {
                    float f4 = (float)(this.id_instanceof + this.id_throw + this.id_interface) - f2;
                    n = (int)(f4 * 255.0f / (float)this.id_instanceof);
                }
                if (this.id_goto <= this.id_interface) {
                    n = (int)(f2 * 255.0f / (float)this.id_interface);
                }
                if ((n = rfU_2.id_class(n, 0, 255)) > 8) {
                    RenderSystem.pushMatrix();
                    RenderSystem.translatef(this.id_void / 2, this.id_static / 2, 0.0f);
                    RenderSystem.enableBlend();
                    RenderSystem.defaultBlendFunc();
                    RenderSystem.pushMatrix();
                    RenderSystem.scalef(4.0f, 4.0f, 4.0f);
                    int n6 = n << 24 & 0xFF000000;
                    n4 = cm_32.id_class(this.id_while);
                    this.id_class(ml_1, -10, n4, 0xFFFFFF | n6);
                    cm_32.id_break(ml_1, this.id_while, (float)(-n4 / 2), -10.0f, 0xFFFFFF | n6);
                    RenderSystem.popMatrix();
                    if (this.id_try != null) {
                        RenderSystem.pushMatrix();
                        RenderSystem.scalef(2.0f, 2.0f, 2.0f);
                        n3 = cm_32.id_class(this.id_try);
                        this.id_class(ml_1, 5, n3, 0xFFFFFF | n6);
                        cm_32.id_break(ml_1, this.id_try, (float)(-n3 / 2), 5.0f, 0xFFFFFF | n6);
                        RenderSystem.popMatrix();
                    }
                    RenderSystem.disableBlend();
                    RenderSystem.popMatrix();
                }
            }
            this.id_else.id_class(ml_1);
            rns_3 rns_32 = ((gm_3)this.id_finally.id_class[56]).id_package();
            rnP_2 rnP_23 = null;
            rnB_2 rnB_22 = rns_32.id_private(((cb_3)this.id_finally.id_class[57]).i());
            if (rnB_22 != null && (n4 = rnB_22.id_volatile().id_class()) >= 0) {
                rnP_23 = rns_32.id_class(3 + n4);
            }
            this.id_const = rnP_22 = rnP_23 != null ? rnP_23 : rns_32.id_class(1);
            this.id_default.clear();
            if (rnP_22 != null) {
                this.id_class(ml_1, rnP_22);
            }
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableAlphaTest();
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, (float)(this.id_static - 48) - ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w().id_new(), 0.0f);
            this.id_native.id_class(ml_1, this.id_volatile);
            RenderSystem.popMatrix();
            rnP_22 = rns_32.id_class(0);
            rrnB_2.id_class(ml_1, f);
            if (((Qw_1)this.id_finally.id_class[20]).F.id_protected() && (!this.id_finally.id_switch() || ((Aq_1)((cb_3)this.id_finally.id_class[57]).id_break[0]).id_throws().size() > 1 || rnP_22 != null)) {
                this.id_return.id_class(true);
                this.id_return.id_class(ml_1, this.id_void, rns_32, rnP_22);
            } else {
                this.id_return.id_class(false);
            }
        }
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.enableAlphaTest();
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_class(new rgn_3("record.nowPlaying", rgP_22), true, false);
    }

    private void id_class(an_3 an_32) {
        if (an_32 != null) {
            float f = rfU_2.id_class(1.0f - an_32.rX(), 0.0f, 1.0f);
            this.id_class = (float)((double)this.id_class + (double)(f - this.id_class) * 0.01);
        }
    }

    private int id_class(iB_2 iB_22) {
        if (iB_22 != null && iB_22.R()) {
            float f = iB_22.SK();
            int n = (int)(f + 0.5f) / 2;
            if (n > 30) {
                n = 30;
            }
            return n;
        }
        return 0;
    }

    public void id_class() {
        this.id_instanceof = 10;
        this.id_throw = 70;
        this.id_interface = 20;
    }

    public void id_class(rVU rVU2, rgP_2 rgP_22, UUID uUID) {
        if (!(this.id_finally.id_class(uUID) || ((Qw_1)this.id_finally.id_class[20]).M && this.id_finally.id_class(this.id_break(rgP_22)))) {
            for (ur_3 ur_32 : this.id_short.get((Object)rVU2)) {
                ur_32.id_class(rVU2, rgP_22, uUID);
            }
        }
    }

    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23, int n, int n2, int n3) {
        if (rgP_22 == null && rgP_23 == null && n < 0 && n2 < 0 && n3 < 0) {
            this.id_while = null;
            this.id_try = null;
            this.id_goto = 0;
        } else if (rgP_22 != null) {
            this.id_while = rgP_22;
            this.id_goto = this.id_instanceof + this.id_throw + this.id_interface;
        } else if (rgP_23 != null) {
            this.id_try = rgP_23;
        } else {
            if (n >= 0) {
                this.id_instanceof = n;
            }
            if (n2 >= 0) {
                this.id_throw = n2;
            }
            if (n3 >= 0) {
                this.id_interface = n3;
            }
            if (this.id_goto > 0) {
                this.id_goto = this.id_instanceof + this.id_throw + this.id_interface;
            }
        }
    }

    public void id_class(rgP_2 rgP_22, boolean bl, boolean bl2) {
        this.id_final = rgP_22;
        this.id_package = 60;
        this.id_int = bl;
        this.id_new = bl2;
    }

    public void id_class(Ml_1 ml_1, int n) {
        this.id_finally.A().id_class(ch_3.id_protected);
        float f = ((cb_3)this.id_finally.id_class[57]).E();
        int n2 = 182;
        int n3 = (int)(f * 183.0f);
        int n4 = this.id_static - 32 + 3;
        this.id_break(ml_1, n, n4, 0, 84, 182, 5);
        if (n3 > 0) {
            this.id_break(ml_1, n, n4, 0, 89, n3, 5);
        }
    }

    private void id_class(Ml_1 ml_1, rnP_2 rnP_22) {
        int n;
        rns_3 rns_32 = rnP_22.id_class();
        List<Object> list = rns_32.id_class(rnP_22);
        List list2 = list.stream().filter(rAa_12 -> rAa_12.id_throws() != null && !rAa_12.id_throws().startsWith("#")).collect(Collectors.toList());
        list = list2.size() > 15 ? Lists.newArrayList((Iterable)Iterables.skip(list2, (int)(list.size() - 15))) : list2;
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)list.size());
        boolean bl = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_continue();
        rgP_2 rgP_22 = rnP_22.id_protected();
        int n2 = n = this.id_catch().id_class(rgP_22);
        int n3 = this.id_catch().id_break(": ");
        for (rAa_1 rAa_13 : list) {
            rnB_2 rnB_22 = rns_32.id_private(rAa_13.id_throws());
            rVi_1 rVi_12 = rnB_2.id_class(rnB_22, new rgN_2(rAa_13.id_throws()), rnO_2.values());
            arrayList.add(Pair.of((Object)rAa_13, (Object)rVi_12));
            n2 = Math.max(n2, this.id_catch().id_class(rVi_12) + n3 + this.id_catch().id_break(Integer.toString(rAa_13.id_break())));
            this.id_default.add(rVi_12.getString());
        }
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_this()) {
            int n4 = list.size() * 9;
            int n5 = this.id_static / 2 + n4 / 2;
            int n6 = this.id_void - n2 - 3;
            int n7 = 0;
            int n8 = ((Qw_1)this.id_finally.id_class[20]).id_break(0.3f);
            int n9 = ((Qw_1)this.id_finally.id_class[20]).id_break(0.4f);
            for (Pair pair : arrayList) {
                rAa_1 rAa_14 = (rAa_1)pair.getFirst();
                rgP_2 rgP_23 = (rgP_2)pair.getSecond();
                String string = "" + rgF_2.RED + rAa_14.id_break();
                int n10 = n5 - ++n7 * 9;
                int n11 = this.id_void - 3 + 2;
                cq_3.id_class(ml_1, n6 - 2, n10, n11, n10 + 9, n8);
                this.id_catch().id_byte(ml_1, rgP_23, n6, n10, -1);
                this.id_catch().id_break(ml_1, string, (float)(n11 - this.id_catch().id_break(string)), (float)n10, -1);
                if (n7 != list.size()) continue;
                cq_3.id_class(ml_1, n6 - 2, n10 - (bl ? 2 : 1), n11, n10, n8);
                if (bl) continue;
                cq_3.id_class(ml_1, n6 - 2, n10 - 9 - 1, n11, n10 - 1, n9);
                this.id_catch().id_byte(ml_1, rgP_22, n6 + n2 / 2 - n / 2, n10 - 9, -1);
            }
        }
    }

    private boolean id_class(rjG_2 rjG_22) {
        if (rjG_22 == null) {
            return false;
        }
        if (rjG_22.id_byte() == rjM_2.ENTITY) {
            return ((rfo_3)rjG_22).id_class() instanceof rJZ;
        }
        if (rjG_22.id_byte() == rjM_2.BLOCK) {
            gm_3 gm_32 = (gm_3)this.id_finally.id_class[56];
            rfH_2 rfH_22 = ((rff_3)rjG_22).id_class();
            return gm_32.id_byte(rfH_22).id_break(gm_32, rfH_22) != null;
        }
        return false;
    }

    public void id_class(Ml_1 ml_1) {
        if (this.id_continue > 0 && !this.id_super.id_class()) {
            int n;
            rVi_1 rVi_12 = new rgN_2("").id_class(this.id_super.id_continue()).id_class(this.id_super.id_synchronized().color);
            if (this.id_super.id_this()) {
                rVi_12.id_class(rgF_2.ITALIC);
            }
            rgP_2 rgP_22 = rVi_12;
            if (rrxr_3.PQ.id_byte()) {
                rgP_22 = (rgP_2)rrxr_3.id_private(this.id_super, rrxr_3.PQ, rVi_12);
            }
            int n2 = this.id_catch().id_class(rgP_22);
            int n3 = (this.id_void - n2) / 2;
            int n4 = this.id_static - 59;
            if (!((Ax_1)this.id_finally.id_class[55]).id_class()) {
                n4 += 14;
            }
            if ((n = (int)((float)this.id_continue * 256.0f / 10.0f)) > 255) {
                n = 255;
            }
            if (n > 0) {
                RenderSystem.pushMatrix();
                RenderSystem.enableBlend();
                RenderSystem.defaultBlendFunc();
                cq_3.id_class(ml_1, n3 - 2, n4 - 2, n3 + n2 + 2, n4 + 9 + 2, ((Qw_1)this.id_finally.id_class[20]).id_class(0));
                cm_3 cm_32 = null;
                if (rrxr_3.PG.id_byte()) {
                    cm_32 = (cm_3)rrxr_3.id_private(this.id_super.id_break(), rrxr_3.PG, this.id_super);
                }
                if (cm_32 != null) {
                    n2 = (this.id_void - cm_32.id_class(rgP_22)) / 2;
                    cm_32.id_break(ml_1, rgP_22.id_catch(), (float)n3, (float)n4, 0xFFFFFF + (n << 24));
                } else {
                    this.id_catch().id_break(ml_1, rgP_22, (float)n3, (float)n4, 0xFFFFFF + (n << 24));
                }
                RenderSystem.disableBlend();
                RenderSystem.popMatrix();
            }
        }
    }

    private void id_class(Ml_1 ml_1, int n, int n2, int n3) {
        int n4 = ((Qw_1)this.id_finally.id_class[20]).id_break(0.0f);
        if (n4 != 0) {
            int n5 = -n2 / 2;
            cq_3.id_class(ml_1, n5 - 2, n - 2, n5 + n2 + 2, n + 9 + 2, ryj_3.id_class(n4, n3));
        }
    }

    protected void id_class(float f, Ml_1 ml_1) {
        rhd_3 rhd_32 = this.id_super();
        if (rhd_32 != null) {
            float f2;
            int n;
            int n2;
            int n3;
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.id_finally.A().id_class(id_case);
            rdn_3 rdn_32 = rhd_32.Sn();
            rpZ_2 rpZ_22 = rhd_32.Su().id_class();
            int n4 = this.id_void / 2;
            int n5 = this.h_();
            this.id_class(-90);
            int n6 = this.id_static - 22;
            this.id_break(ml_1, n4 - 91, n6, 0, 0, 182, 22);
            this.id_break(ml_1, n4 - 91 - 1 + ((rhz_3)rhd_32.id_implements[1]).id_protected * 20, this.id_static - 22 - 1, 0, 22, 24, 22);
            if (!rdn_32.id_class()) {
                if (rpZ_22 == rpZ_2.LEFT) {
                    this.id_break(ml_1, n4 - 91 - 29, this.id_static - 23, 24, 22, 29, 24);
                } else {
                    this.id_break(ml_1, n4 + 91, this.id_static - 23, 53, 22, 29, 24);
                }
            }
            this.id_class(n5);
            RenderSystem.enableRescaleNormal();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            rrby_3.id_class(false);
            for (n3 = 0; n3 < 9; ++n3) {
                n2 = n4 - 90 + n3 * 20 + 2;
                n = this.id_static - 16 - 3;
                this.id_class(n2, n, f, rhd_32, ((rhz_3)rhd_32.id_implements[1]).id_class.get(n3), false);
            }
            if (!rdn_32.id_class()) {
                rrby_3.id_class(true);
                n3 = this.id_static - 16 - 3;
                if (rpZ_22 == rpZ_2.LEFT) {
                    this.id_class(n4 - 91 - 26, n3, f, rhd_32, rdn_32, false);
                } else {
                    this.id_class(n4 + 91 + 10, n3, f, rhd_32, rdn_32, false);
                }
                rrby_3.id_class(false);
            }
            if (((Qw_1)this.id_finally.id_class[20]).id_interface == VX.HOTBAR && (f2 = ((cb_3)this.id_finally.id_class[57]).id_class(0.0f, false)) < 1.0f) {
                n2 = this.id_static - 20;
                n = n4 + 91 + 6;
                if (rpZ_22 == rpZ_2.RIGHT) {
                    n = n4 - 91 - 22;
                }
                this.id_finally.A().id_class(ch_3.id_protected);
                int n7 = (int)(f2 * 19.0f);
                RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
                this.id_break(ml_1, n, n2, 0, 94, 18, 18);
                this.id_break(ml_1, n, n2 + 18 - n7, 18, 112 - n7, 18, n7);
            }
            RenderSystem.disableRescaleNormal();
            RenderSystem.disableBlend();
        }
    }

    public void id_break(Ml_1 ml_1, int n) {
        int n2;
        int n3;
        this.id_finally.A().id_class(ch_3.id_protected);
        int n4 = ((cb_3)this.id_finally.id_class[57]).sn();
        if (n4 > 0) {
            n3 = 182;
            int n5 = (int)(((Float)((cb_3)this.id_finally.id_class[57]).id_implements[21]).floatValue() * 183.0f);
            n2 = this.id_static - 32 + 3;
            this.id_break(ml_1, n, n2, 0, 64, 182, 5);
            if (n5 > 0) {
                this.id_break(ml_1, n, n2, 0, 69, n5, 5);
            }
        }
        if ((Integer)((cb_3)this.id_finally.id_class[57]).id_implements[19] > 0) {
            n3 = 8453920;
            if (rrbb_3.K()) {
                n3 = rrbN_2.id_class(n3);
            }
            String string = "" + (Integer)((cb_3)this.id_finally.id_class[57]).id_implements[19];
            n2 = (this.id_void - this.id_catch().id_break(string)) / 2;
            int n6 = this.id_static - 31 - 4;
            this.id_catch().id_break(ml_1, string, (float)(n2 + 1), (float)n6, 0);
            this.id_catch().id_break(ml_1, string, (float)(n2 - 1), (float)n6, 0);
            this.id_catch().id_break(ml_1, string, (float)n2, (float)(n6 + 1), 0);
            this.id_catch().id_break(ml_1, string, (float)n2, (float)(n6 - 1), 0);
            this.id_catch().id_break(ml_1, string, (float)n2, (float)n6, n3);
        }
    }

    public UUID id_break(rgP_2 rgP_22) {
        String string = rgL_2.id_class(rgP_22);
        String string2 = StringUtils.substringBetween((String)string, (String)"<", (String)">");
        return string2 == null ? rqR_2.id_break : this.id_finally.id_volatile().id_class(string2);
    }

    private void id_break(an_3 an_32) {
        if (!rrbb_3.A()) {
            RenderSystem.enableDepthTest();
            RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
        } else {
            roE_2 roE_22 = ((gm_3)this.id_finally.id_class[56]).id_instanceof();
            float f = (float)roE_22.id_class(an_32);
            double d = Math.min(roE_22.id_int() * (double)roE_22.id_new() * 1000.0, Math.abs(roE_22.id_extends() - roE_22.id_implements()));
            double d2 = Math.max((double)roE_22.id_continue(), d);
            f = (double)f < d2 ? 1.0f - (float)((double)f / d2) : 0.0f;
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            RenderSystem.blendFuncSeparate(OP.ZERO, MK.ONE_MINUS_SRC_COLOR, OP.ONE, MK.ZERO);
            if (f > 0.0f) {
                RenderSystem.color4f(0.0f, f, f, 1.0f);
            } else {
                RenderSystem.color4f(this.id_class, this.id_class, this.id_class, 1.0f);
            }
            this.id_finally.A().id_class(id_throws);
            yb_3 yb_32 = yb_3.id_class();
            lD_2 lD_22 = yb_32.id_byte();
            lD_22.id_class(7, ju_3.id_synchronized);
            lD_22.id_class(0.0, (double)this.id_static, -90.0).id_class(0.0f, 1.0f).id_class();
            lD_22.id_class((double)this.id_void, (double)this.id_static, -90.0).id_class(1.0f, 1.0f).id_class();
            lD_22.id_class((double)this.id_void, 0.0, -90.0).id_class(1.0f, 0.0f).id_class();
            lD_22.id_class(0.0, 0.0, -90.0).id_class(0.0f, 0.0f).id_class();
            yb_32.id_break();
            RenderSystem.depthMask(true);
            RenderSystem.enableDepthTest();
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.defaultBlendFunc();
        }
    }

    public void id_break(Ml_1 ml_1) {
        rgP_2 rgP_22 = ((gm_3)this.id_finally.id_class[56]).r() >= 120500L ? id_private : new rgn_3("demo.remainingTime", rql_3.id_class((int)(120500L - ((gm_3)this.id_finally.id_class[56]).r())));
        int n = this.id_catch().id_class(rgP_22);
        this.id_catch().id_break(ml_1, rgP_22, (float)(this.id_void - n - 10), 5.0f, 0xFFFFFF);
    }

    private int id_break(int n) {
        return (int)Math.ceil((double)n / 10.0);
    }

    public cI_2 id_throws() {
        return this.id_native;
    }

    private void id_throws(Ml_1 ml_1) {
        int n;
        iB_2 iB_22 = this.id_this();
        if (iB_22 != null && (n = this.id_class(iB_22)) != 0) {
            int n2 = (int)Math.ceil(iB_22.Ss());
            int n3 = this.id_static - 39;
            int n4 = this.id_void / 2 + 91;
            int n5 = n3;
            int n6 = 0;
            boolean bl = false;
            while (n > 0) {
                int n7 = Math.min(n, 10);
                n -= n7;
                for (int i = 0; i < n7; ++i) {
                    int n8 = 52;
                    int n9 = 0;
                    int n10 = n4 - i * 8 - 9;
                    this.id_break(ml_1, n10, n5, 52 + n9 * 9, 9, 9, 9);
                    if (i * 2 + 1 + n6 < n2) {
                        this.id_break(ml_1, n10, n5, 88, 9, 9, 9);
                    }
                    if (i * 2 + 1 + n6 != n2) continue;
                    this.id_break(ml_1, n10, n5, 97, 9, 9, 9);
                }
                n5 -= 10;
                n6 += 20;
            }
        }
    }

    public void id_finally() {
        this.id_return.id_throws();
        this.id_public.id_class();
    }

    public cm_3 id_catch() {
        return (cm_3)this.id_finally.id_class[15];
    }

    public uj_3 id_extends() {
        return this.id_public;
    }

    public int id_case() {
        return this.id_volatile;
    }

    public rnP_2 id_continue() {
        return this.id_const;
    }

    public uR_2 id_implements() {
        return this.id_return;
    }

    public Set<String> id_new() {
        return this.id_default;
    }

    public int id_package() {
        return this.id_package;
    }

    private rhd_3 id_super() {
        return !(this.id_finally.id_catch() instanceof rhd_3) ? null : (rhd_3)this.id_finally.id_catch();
    }

    public void id_protected() {
        if ((gm_3)this.id_finally.id_class[56] == null) {
            rrMd_1.id_byte();
        }
        if (this.id_package > 0) {
            --this.id_package;
        }
        if (this.id_goto > 0) {
            --this.id_goto;
            if (this.id_goto <= 0) {
                this.id_while = null;
                this.id_try = null;
            }
        }
        ++this.id_volatile;
        an_3 an_32 = this.id_finally.id_catch();
        if (an_32 != null) {
            this.id_class(an_32);
        }
        if ((cb_3)this.id_finally.id_class[57] != null) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)this.id_finally.id_class[57]).id_implements[1]).id_byte();
            boolean bl = true;
            if (rrxr_3.PQ.id_byte()) {
                rgP_2 rgP_22 = (rgP_2)rrxr_3.id_private(rdn_32, rrxr_3.PQ, rdn_32.id_continue());
                rgP_2 rgP_23 = (rgP_2)rrxr_3.id_private(this.id_super, rrxr_3.PQ, this.id_super.id_continue());
                bl = rrbb_3.id_class((Object)rgP_22, (Object)rgP_23);
            }
            if (rdn_32.id_class()) {
                this.id_continue = 0;
            } else if (!this.id_super.id_class() && rdn_32.id_break() == this.id_super.id_break() && rdn_32.id_continue().equals(this.id_super.id_continue()) && bl) {
                if (this.id_continue > 0) {
                    --this.id_continue;
                }
            } else {
                this.id_continue = 40;
            }
            this.id_super = rdn_32;
        }
    }

    private void id_protected(Ml_1 ml_1) {
        rhd_3 rhd_32 = this.id_super();
        if (rhd_32 != null) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12 = rfU_2.id_case(rhd_32.Ss());
            boolean bl = this.id_float > (long)this.id_volatile && (this.id_float - (long)this.id_volatile) / 3L % 2L == 1L;
            long l = rqR_2.id_break();
            if (n12 < this.id_char && (Integer)rhd_32.id_throws[47] > 0) {
                this.id_long = l;
                this.id_float = this.id_volatile + 20;
            } else if (n12 > this.id_char && (Integer)rhd_32.id_throws[47] > 0) {
                this.id_long = l;
                this.id_float = this.id_volatile + 10;
            }
            if (l - this.id_long > 1000L) {
                this.id_char = n12;
                this.id_abstract = n12;
                this.id_long = l;
            }
            this.id_char = n12;
            int n13 = this.id_abstract;
            this.id_implements.setSeed((long)this.id_volatile * 312871L);
            rpQ_2 rpQ_22 = rhd_32.sk();
            int n14 = rpQ_22.id_class();
            int n15 = this.id_void / 2 - 91;
            int n16 = this.id_void / 2 + 91;
            int n17 = this.id_static - 39;
            float f = (float)rhd_32.id_class(iQ_2.id_class);
            int n18 = rfU_2.id_case(rhd_32.Sd());
            int n19 = rfU_2.id_case((f + (float)n18) / 2.0f / 10.0f);
            int n20 = Math.max(10 - (n19 - 2), 3);
            int n21 = n17 - (n19 - 1) * n20 - 10;
            int n22 = n17 - 10;
            int n23 = 0;
            int n24 = n18;
            int n25 = rhd_32.Bq();
            int n26 = -1;
            if (rhd_32.id_break(rLD.id_finally)) {
                n26 = this.id_volatile % rfU_2.id_case(f + 5.0f);
            }
            for (n11 = 0; n11 < 10; ++n11) {
                if (n25 <= 0) continue;
                n10 = n15 + n11 * 8;
                if (n11 * 2 + 1 < n25) {
                    this.id_break(ml_1, n10, n21, 34, 9, 9, 9);
                }
                if (n11 * 2 + 1 == n25) {
                    this.id_break(ml_1, n10, n21, 25, 9, 9, 9);
                }
                if (n11 * 2 + 1 <= n25) continue;
                this.id_break(ml_1, n10, n21, 16, 9, 9, 9);
            }
            n11 = rhd_32.id_break(rLD.id_super) ? 1 : 0;
            for (n10 = rfU_2.id_case((f + (float)n18) / 2.0f) - 1; n10 >= 0; --n10) {
                n9 = 16;
                if (n11 != 0) {
                    n9 += 36;
                }
                n8 = 0;
                if (bl) {
                    n8 = 1;
                }
                n7 = rfU_2.id_case((float)(n10 + 1) / 10.0f) - 1;
                n6 = n15 + n10 % 10 * 8;
                n5 = n17 - n7 * n20;
                if (n12 <= 4) {
                    n5 += this.id_implements.nextInt(2);
                }
                if (n24 <= 0 && n10 == n26) {
                    n5 -= 2;
                }
                n4 = 0;
                if (((rYB)rhd_32.id_throws[7]).id_public().id_implements()) {
                    n4 = 5;
                }
                this.id_break(ml_1, n6, n5, 16 + n8 * 9, 9 * n4, 9, 9);
                if (bl) {
                    if (n10 * 2 + 1 < n13) {
                        this.id_break(ml_1, n6, n5, n9 + 54, 9 * n4, 9, 9);
                    }
                    if (n10 * 2 + 1 == n13) {
                        this.id_break(ml_1, n6, n5, n9 + 63, 9 * n4, 9, 9);
                    }
                }
                if (n24 > 0) {
                    if (n24 == n18 && n18 % 2 == 1) {
                        this.id_break(ml_1, n6, n5, n9 + 153, 9 * n4, 9, 9);
                        --n24;
                        continue;
                    }
                    this.id_break(ml_1, n6, n5, n9 + 144, 9 * n4, 9, 9);
                    n24 -= 2;
                    continue;
                }
                if (n10 * 2 + 1 < n12) {
                    this.id_break(ml_1, n6, n5, n9 + 36, 9 * n4, 9, 9);
                }
                if (n10 * 2 + 1 != n12) continue;
                this.id_break(ml_1, n6, n5, n9 + 45, 9 * n4, 9, 9);
            }
            iB_2 iB_22 = this.id_this();
            n9 = this.id_class(iB_22);
            n8 = rhd_32.id_break(rLD.id_new);
            if (n9 == 0) {
                for (n7 = 0; n7 < 10; ++n7) {
                    n6 = n17;
                    n5 = 16;
                    n4 = 0;
                    if (n8 != 0) {
                        n5 += 36;
                        n4 = 13;
                    }
                    if (rhd_32.sk().id_byte() <= 0.0f && this.id_volatile % (n14 * 3 + 1) == 0) {
                        n6 = n17 + (this.id_implements.nextInt(3) - 1);
                    }
                    n3 = n16 - n7 * 8 - 9;
                    this.id_break(ml_1, n3, n6, 16 + n4 * 9, 27, 9, 9);
                    if (n7 * 2 + 1 < n14) {
                        this.id_break(ml_1, n3, n6, n5 + 36, 27, 9, 9);
                    }
                    if (n7 * 2 + 1 != n14) continue;
                    this.id_break(ml_1, n3, n6, n5 + 45, 27, 9, 9);
                }
                n22 -= 10;
                n23 -= 10;
                float f2 = rpQ_22.id_byte();
                if (f2 > 0.0f) {
                    n6 = rfU_2.id_case(f2 / 2.0f);
                    for (n5 = 0; n5 < n6; ++n5) {
                        n4 = n17 - 10;
                        n3 = 16;
                        n2 = 0;
                        if (n8 != 0) {
                            n3 += 36;
                            n2 = 13;
                        }
                        n = n16 - n5 * 8 - 9;
                        this.id_break(ml_1, n, n4, 16 + n2 * 9, 27, 9, 9);
                        if ((float)(n5 * 2 + 1) < f2) {
                            this.id_break(ml_1, n, n4, n3 + 36, 27, 9, 9);
                        }
                        if (n5 * 2 + 1 != rfU_2.id_case(f2)) continue;
                        this.id_break(ml_1, n, n4, n3 + 45, 27, 9, 9);
                    }
                    n22 -= 10;
                    n23 -= 10;
                }
            } else {
                n23 -= 10 * this.id_break(n9);
            }
            int n27 = rhd_32.ri();
            n6 = Math.min(rhd_32.PA(), n27);
            if (((an_3)rhd_32).id_class(rlG_2.id_break) || n6 < n27) {
                n5 = this.id_break(n9) - 1;
                n4 = n5 * 10;
                n22 -= n4;
                n3 = rfU_2.id_throws((double)(n6 - 2) * 10.0 / (double)n27);
                n2 = rfU_2.id_throws((double)n6 * 10.0 / (double)n27) - n3;
                for (n = 0; n < n3 + n2; ++n) {
                    if (n < n3) {
                        this.id_break(ml_1, n16 - n * 8 - 9, n22, 16, 18, 9, 9);
                        continue;
                    }
                    this.id_break(ml_1, n16 - n * 8 - 9, n22, 25, 18, 9, 9);
                }
                if (rhd_32.PA() > 0) {
                    n23 -= 10;
                }
            }
            this.id_import = n23;
        }
    }

    public cY_2 id_private() {
        return this.id_synchronized;
    }

    public rgP_2 id_final() {
        return this.id_final;
    }

    public String id_volatile() {
        return this.id_while == null ? "" : this.id_while.id_byte();
    }

    public void id_native() {
        this.id_this.id_class();
    }
}

