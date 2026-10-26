/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 */
package celestial;

import celestial.HB;
import celestial.HU;
import celestial.Hd_1;
import celestial.Hh_1;
import celestial.Hx_1;
import celestial.MH;
import celestial.MT;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.fJ_2;
import celestial.gm_3;
import celestial.iB_2;
import celestial.jX_2;
import celestial.jz_3;
import celestial.lD_2;
import celestial.lp_3;
import celestial.ly_3;
import celestial.pg_3;
import celestial.rHp_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rja_3;
import celestial.rji_3;
import celestial.rjj_3;
import celestial.roJ_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrdX;
import celestial.rrdZ;
import celestial.rrxA_2;
import celestial.rrxN_2;
import celestial.rrxQ_2;
import celestial.rrxU_2;
import celestial.rrxY_2;
import celestial.rrxr_3;
import celestial.rrxw_3;
import celestial.rrxz_3;
import celestial.ryO_2;
import celestial.yQ_2;
import celestial.yX_2;
import celestial.yt_3;
import celestial.yx_3;
import com.mojang.blaze3d.platform.GLX;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class rrdL {
    private static final rqO_2 id_class = new rqO_2("textures/entity/end_portal.png");

    public static void id_byte() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.BY);
            rrdZ.id_class(rrdX.TERRAIN_CUTOUT);
        }
    }

    public static void id_byte(Hh_1 hh_1, Ml_1 ml_1, ly_3 ly_32, float f) {
        if (!rrdZ.id_new) {
            rrdZ.z();
            hh_1.id_class(ml_1, ly_32, f, false, true, false);
            rrdZ.Q();
        }
    }

    public static void id_int() {
        rrdZ.id_class(rrdZ.Ba);
    }

    public static void id_this() {
        MT.id_final();
    }

    public static void id_class() {
        if (rrdZ.id_volatile) {
            rrdZ.Z = true;
            rrdZ.id_class(rrdZ.BY);
            rrdZ.id_class(rrdX.TERRAIN_SOLID);
        }
    }

    public static void id_class(rrxN_2 rrxN_22, double d, double d2, double d3) {
        rrxN_22.id_class(d, d2, d3);
    }

    public static void id_class(HB hB, float f, Ml_1 ml_1, Hd_1 hd_1, cb_3 cb_32, int n, boolean bl) {
        ((yX_2)QY.id_instanceof().id_class[8]).id_break = cb_32;
        MT.id_class(true);
        if (bl) {
            MT.id_break(519);
            ml_1.id_class();
            rrxY_2 rrxY_22 = rrxU_2.id_break();
            rrxU_2.id_class(rrdZ.EZ);
            rrdZ.id_this = true;
            hB.id_class(f, ml_1, hd_1, cb_32, n);
            rrdZ.id_this = false;
            rrxU_2.id_class(rrxY_22);
            ml_1.id_break();
        }
        MT.id_break(515);
        GL30.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        hB.id_class(f, ml_1, hd_1, cb_32, n);
        ((yX_2)QY.id_instanceof().id_class[8]).id_break = null;
    }

    public static void id_class(HU hU) {
        if (hU == rrxA_2.id_class) {
            rrdL.id_class();
        }
        if (hU == rrxA_2.id_break) {
            rrdL.id_break();
        }
        if (hU == rrxA_2.id_byte) {
            rrdL.id_byte();
        }
        if (hU == rrxA_2.id_protected) {
            rrdL.id_throws();
        }
        if (hU == HU.id_synchronized()) {
            rrdL.id_catch();
        }
        if (rrdZ.id_class(hU)) {
            MT.id_interface();
        }
        if (GLX.useVbo()) {
            GL20.glEnableVertexAttribArray((int)rrdZ.C);
            GL20.glEnableVertexAttribArray((int)rrdZ.L);
            GL20.glEnableVertexAttribArray((int)rrdZ.A);
            GL20.glEnableVertexAttribArray((int)rrdZ.F);
        }
    }

    public static void id_class(HU hU, lD_2 lD_22) {
        if (rrdZ.id_volatile && !rrdZ.id_new) {
            if (hU.id_void()) {
                rrdL.id_else();
            } else if (hU.id_byte().equals("eyes")) {
                rrdZ.id_double();
            } else if (hU.id_byte().equals("crumbling")) {
                rrdL.id_implements();
            } else if (hU == HU.S) {
                rrdZ.Z();
            }
        }
    }

    public static void id_class(ly_3 ly_32, QY qY, float f) {
        ly_32.id_class(qY, (gm_3)qY.id_class[56], qY.id_catch() == null ? (cb_3)qY.id_class[57] : qY.id_catch(), !((Qw_1)qY.id_class[20]).id_volatile().id_class(), ((Qw_1)qY.id_class[20]).id_volatile().id_break(), f);
    }

    public static void id_class(Hh_1 hh_1, ly_3 ly_32, int n, float f, long l) {
        if (rrdZ.BB) {
            Object object;
            Object object2;
            Object object3;
            QY qY = QY.id_instanceof();
            yX_2 yX_22 = (yX_2)qY.id_class[8];
            rrdZ.id_new = true;
            rrdZ.id_char();
            rrdZ.id_catch("pre shadow");
            GL30.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL30.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            rrdZ.BA.id_private();
            rrdZ.id_catch("shadow bind sfb");
            rrdL.id_class(ly_32, qY, f);
            Ml_1 ml_1 = new Ml_1();
            rrdZ.id_break(ml_1, ly_32, f);
            rrdZ.id_catch("shadow camera");
            rrdZ.id_class(rrdZ.BL, rrdZ.Bp.id_goto());
            rrdZ.id_class(rrdZ.Bp);
            rrdZ.BA.id_finally();
            rrdZ.id_catch("shadow drawbuffers");
            GL30.glReadBuffer((int)0);
            rrdZ.id_catch("shadow readbuffer");
            rrdZ.BA.id_implements();
            rrdZ.BA.id_class(true);
            rrdZ.id_case("shadow fb");
            GL30.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL30.glClear((int)256);
            for (int i = 0; i < rrdZ.Bu; ++i) {
                if (!rrdZ.Bl[i]) continue;
                object3 = rrdZ.BH[i];
                if (object3 != null) {
                    GL30.glClearColor((float)((rji_3)object3).id_class(), (float)((rji_3)object3).id_break(), (float)((rji_3)object3).id_byte(), (float)((rji_3)object3).id_protected());
                } else {
                    GL30.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                }
                rrxU_2.id_class(rrdZ.Ev[i]);
                GL30.glClear((int)16384);
            }
            rrdZ.BA.id_finally();
            rrdZ.id_catch("shadow clear");
            rrxw_3 rrxw_32 = new rrxw_3();
            object3 = ly_32.id_break();
            rrxw_32.id_class(((rjU_2)object3).id_break, ((rjU_2)object3).id_byte, ((rjU_2)object3).id_protected);
            MT.id_this(7425);
            MT.id_volatile();
            MT.id_break(515);
            MT.id_class(true);
            MT.id_class(true, true, true, true);
            MT.id_class(new rrxQ_2(false));
            MT.id_class(new rrxz_3(false));
            qY.A().id_class(fJ_2.id_class);
            int n2 = ((yX_2)qY.id_class[8]).id_goto();
            yX_22.id_class(ly_32, rrxw_32, false, n2, ((cb_3)qY.id_class[57]).id_native());
            double d = ((rjU_2)object3).id_class();
            double d2 = ((rjU_2)object3).id_break();
            double d3 = ((rjU_2)object3).id_byte();
            MT.id_return(5888);
            MT.id_transient();
            if (rrdZ.id_native()) {
                MT.id_protected();
                yX_22.id_class(rrxA_2.id_class, ml_1, d, d2, d3);
                rrdZ.id_catch("shadow terrain solid");
                MT.id_throws();
                yX_22.id_class(rrxA_2.id_break, ml_1, d, d2, d3);
                rrdZ.id_catch("shadow terrain cutoutmipped");
                qY.A().id_break(fJ_2.id_class).id_class(false, false);
                yX_22.id_class(rrxA_2.id_byte, ml_1, d, d2, d3);
                qY.A().id_break(fJ_2.id_class).id_else();
                rrdZ.id_catch("shadow terrain cutout");
            }
            MT.id_this(7424);
            MT.id_class(516, 0.1f);
            MT.id_return(5888);
            MT.id_for();
            MT.id_transient();
            yX_2 yX_23 = (yX_2)qY.id_class[8];
            pg_3 pg_32 = qY.id_case();
            Hd_1 hd_1 = yX_23.id_while().id_break();
            boolean bl = rrdZ.id_new && !((cb_3)qY.id_class[57]).id_native();
            Iterator<yx_3> iterator = (rrdZ.id_final() ? yX_23.id_try() : Collections.EMPTY_LIST).iterator();
            while (iterator.hasNext()) {
                Object object4 = object2 = iterator.next();
                yQ_2 yQ_22 = ((yx_3)object4).id_class;
                object = yQ_22.id_volatile();
                for (an_3 an_32 : ((roJ_2)object).id_final()[yQ_22.id_throws().c_() / 16]) {
                    if (!pg_32.id_class(an_32, rrxw_32, d, d2, d3) && !an_32.id_else((cb_3)qY.id_class[57]) || an_32 == ly_32.id_catch() && !bl && !ly_32.id_implements() && (!(ly_32.id_catch() instanceof iB_2) || !((iB_2)ly_32.id_catch()).Sc()) || an_32 == (cb_3)QY.id_instanceof().id_class[57] && ly_32.id_catch() != an_32) continue;
                    yX_23.id_break = an_32;
                    rrdZ.id_class(an_32);
                    yX_23.id_class(an_32, d, d2, d3, f, ml_1, hd_1);
                    yX_23.id_break = null;
                }
            }
            yX_23.id_class(ml_1);
            hd_1.id_class(HU.id_break(fJ_2.id_class));
            hd_1.id_class(HU.id_byte(fJ_2.id_class));
            hd_1.id_class(HU.id_protected(fJ_2.id_class));
            hd_1.id_class(HU.id_implements(fJ_2.id_class));
            rrdZ.r();
            rrdZ.E();
            jX_2.id_class();
            boolean bl2 = rrxr_3.Pg.id_byte();
            object2 = rrxw_32;
            for (Object e : rrdZ.id_package() ? yX_23.id_instanceof() : Collections.EMPTY_LIST) {
                object = (yx_3)e;
                List<ryO_2> list = ((yx_3)object).id_class.id_byte().id_break();
                if (list.isEmpty()) continue;
                for (ryO_2 ryO_22 : list) {
                    rfl_3 rfl_32;
                    if (bl2 && (rfl_32 = (rfl_3)rrxr_3.id_private(ryO_22, rrxr_3.Pg, new Object[0])) != null && !((yt_3)object2).id_class(rfl_32)) continue;
                    rrdZ.id_class(ryO_22);
                    rfH_2 rfH_22 = ryO_22.id_char();
                    ml_1.id_class();
                    ml_1.id_class((double)rfH_22.b_() - d, (double)rfH_22.c_() - d2, (double)rfH_22.d_() - d3);
                    jz_3.id_break.id_class(ryO_22, f, ml_1, hd_1);
                    ml_1.id_break();
                }
            }
            yX_23.id_class(ml_1);
            hd_1.id_class(HU.id_case());
            hd_1.id_class(lp_3.id_catch());
            hd_1.id_class(lp_3.id_private());
            hd_1.id_class(lp_3.id_byte());
            hd_1.id_class(lp_3.id_protected());
            hd_1.id_class(lp_3.id_throws());
            hd_1.id_class(lp_3.id_case());
            hd_1.id_break();
            rrdZ.G();
            rrdZ.id_catch("shadow entities");
            MT.id_return(5888);
            MT.id_for();
            MT.id_class(true);
            MT.id_final();
            MT.M();
            MT.id_throw();
            MT.id_break(770, 771, 1, 0);
            MT.id_class(516, 0.1f);
            if (rrdZ.Bm >= 2) {
                MT.id_new(33989);
                rrdZ.id_catch("pre copy shadow depth");
                GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)rrdZ.Bs, (int)rrdZ.BE);
                rrdZ.id_catch("copy shadow depth");
                MT.id_new(33984);
            }
            MT.id_final();
            MT.id_class(true);
            qY.A().id_class(fJ_2.id_class);
            MT.id_this(7425);
            rrdZ.id_catch("shadow pre-translucent");
            rrdZ.BA.id_finally();
            rrdZ.id_catch("shadow drawbuffers pre-translucent");
            rrdZ.id_case("shadow pre-translucent");
            if (rrdZ.id_volatile()) {
                yX_22.id_class(rrxA_2.id_protected, ml_1, d, d2, d3);
                rrdZ.id_catch("shadow translucent");
            }
            MT.b();
            MT.id_this(7424);
            MT.id_class(true);
            MT.id_throw();
            MT.id_final();
            GL30.glFlush();
            rrdZ.id_catch("shadow flush");
            rrdZ.id_new = false;
            if (rrdZ.id_implements) {
                rrdZ.BA.id_class(rrdZ.SF);
                rrdZ.BA.id_class(true, rrdZ.SA);
            }
            rrdZ.id_catch("shadow postprocess");
            if (rrdZ.SN) {
                rrdZ.id_static();
            }
            rrdZ.BL.id_private();
            GL11.glViewport((int)0, (int)0, (int)rrdZ.id_extends, (int)rrdZ.id_native);
            rrxU_2.id_class((rrxY_2)null);
            qY.A().id_class(fJ_2.id_class);
            rrdZ.id_class(rrdZ.BY);
            GL30.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL30.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL30.glMatrixMode((int)5888);
            rrdZ.id_catch("shadow end");
        }
    }

    public static void id_class(Hh_1 hh_1, Ml_1 ml_1, ly_3 ly_32, float f) {
        if (!rrdZ.id_new) {
            boolean bl = rrdZ.T();
            boolean bl2 = rrdZ.t();
            if (!bl || !bl2) {
                rrdZ.h();
                rrdZ.id_class(ml_1, false);
                GL30.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                rrdZ.id_class(bl, bl2);
                hh_1.id_class(ml_1, ly_32, f, true, false, false);
                rrdZ.id_catch(ml_1);
                rrdZ.id_break(!bl, !bl2);
                rrdZ.id_class(false, false);
            }
        }
    }

    public static boolean id_class(rHp_1 rHp_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        rja_3 rja_32;
        if (!rrdZ.id_new && rrdZ.Sz.id_private() == 0) {
            return false;
        }
        MT.id_catch();
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_break(id_class));
        float f9 = 0.5f;
        float f10 = f9 * 0.15f;
        float f11 = f9 * 0.3f;
        float f12 = f9 * 0.4f;
        float f13 = 0.0f;
        float f14 = 0.2f;
        float f15 = (float)(System.currentTimeMillis() % 100000L) / 100000.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        if (rHp_12.id_class(rpr_3.SOUTH)) {
            rja_32 = rpr_3.SOUTH.id_int();
            f8 = rja_32.b_();
            f7 = rja_32.c_();
            f6 = rja_32.d_();
            f5 = rjj_32.id_throws(f8, f7, f6);
            f4 = rjj_32.id_case(f8, f7, f6);
            f3 = rjj_32.id_catch(f8, f7, f6);
            ok_1.id_class(rjV_22, f16, f17, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17 + 1.0f, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16, f17 + 1.0f, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
        }
        if (rHp_12.id_class(rpr_3.NORTH)) {
            rja_32 = rpr_3.NORTH.id_int();
            f8 = rja_32.b_();
            f7 = rja_32.c_();
            f6 = rja_32.d_();
            f5 = rjj_32.id_throws(f8, f7, f6);
            f4 = rjj_32.id_case(f8, f7, f6);
            f3 = rjj_32.id_catch(f8, f7, f6);
            ok_1.id_class(rjV_22, f16, f17 + 1.0f, f18).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17 + 1.0f, f18).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17, f18).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16, f17, f18).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
        }
        if (rHp_12.id_class(rpr_3.EAST)) {
            rja_32 = rpr_3.EAST.id_int();
            f8 = rja_32.b_();
            f7 = rja_32.c_();
            f6 = rja_32.d_();
            f5 = rjj_32.id_throws(f8, f7, f6);
            f4 = rjj_32.id_case(f8, f7, f6);
            f3 = rjj_32.id_catch(f8, f7, f6);
            ok_1.id_class(rjV_22, f16 + 1.0f, f17 + 1.0f, f18).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17 + 1.0f, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17, f18).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
        }
        if (rHp_12.id_class(rpr_3.WEST)) {
            rja_32 = rpr_3.WEST.id_int();
            f8 = rja_32.b_();
            f7 = rja_32.c_();
            f6 = rja_32.d_();
            f5 = rjj_32.id_throws(f8, f7, f6);
            f4 = rjj_32.id_case(f8, f7, f6);
            f3 = rjj_32.id_catch(f8, f7, f6);
            ok_1.id_class(rjV_22, f16, f17, f18).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16, f17, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16, f17 + 1.0f, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16, f17 + 1.0f, f18).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
        }
        if (rHp_12.id_class(rpr_3.DOWN)) {
            rja_32 = rpr_3.DOWN.id_int();
            f8 = rja_32.b_();
            f7 = rja_32.c_();
            f6 = rja_32.d_();
            f5 = rjj_32.id_throws(f8, f7, f6);
            f4 = rjj_32.id_case(f8, f7, f6);
            f3 = rjj_32.id_catch(f8, f7, f6);
            ok_1.id_class(rjV_22, f16, f17, f18).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17, f18).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16, f17, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
        }
        if (rHp_12.id_class(rpr_3.UP)) {
            rja_32 = rpr_3.UP.id_int();
            f8 = rja_32.b_();
            f7 = rja_32.c_();
            f6 = rja_32.d_();
            f5 = rjj_32.id_throws(f8, f7, f6);
            f4 = rjj_32.id_case(f8, f7, f6);
            f3 = rjj_32.id_catch(f8, f7, f6);
            ok_1.id_class(rjV_22, f16, f17 + f2, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17 + f2, f18 + 1.0f).id_class(f10, f11, f12, 1.0f).id_class(f13 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16 + 1.0f, f17 + f2, f18).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f14 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
            ok_1.id_class(rjV_22, f16, f17 + f2, f18).id_class(f10, f11, f12, 1.0f).id_class(f14 + f15, f13 + f15).id_byte(n2).id_break(n).id_class(f5, f4, f3).id_class();
        }
        MT.id_case();
        return true;
    }

    public static void id_break(HU hU, lD_2 lD_22) {
        if (rrdZ.id_volatile && !rrdZ.id_new) {
            if (hU.id_void()) {
                rrdL.id_synchronized();
            } else if (hU.id_byte().equals("eyes")) {
                rrdZ.id_switch();
            } else if (hU.id_byte().equals("crumbling")) {
                rrdL.id_finally();
            } else if (hU == HU.S) {
                rrdZ.v();
            }
        }
    }

    public static void id_break(Hh_1 hh_1, Ml_1 ml_1, ly_3 ly_32, float f) {
        if (!rrdZ.id_new && !rrdZ.w()) {
            rrdZ.h();
            MT.id_package();
            rrdZ.id_class(ml_1, true);
            GL30.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            rrdZ.id_class(rrdZ.f(), rrdZ.j());
            hh_1.id_class(ml_1, ly_32, f, true, false, true);
            rrdZ.id_catch(ml_1);
            rrdZ.id_break(true, true);
            rrdZ.id_class(false, false);
        }
    }

    public static void id_break(HU hU) {
        if (GLX.useVbo()) {
            GL20.glDisableVertexAttribArray((int)rrdZ.C);
            GL20.glDisableVertexAttribArray((int)rrdZ.L);
            GL20.glDisableVertexAttribArray((int)rrdZ.A);
            GL20.glDisableVertexAttribArray((int)rrdZ.F);
        }
        if (rrdZ.id_class(hU)) {
            MT.id_throw();
        }
    }

    public static void id_break() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.BY);
            rrdZ.id_class(rrdX.TERRAIN_CUTOUT_MIPPED);
        }
    }

    public static void id_throws() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.SO);
            rrdZ.id_class(rrdX.TERRAIN_TRANSLUCENT);
        }
    }

    public static void id_finally() {
        if (rrdZ.id_volatile) {
            MT.id_class(true);
            rrdZ.id_class(rrdZ.Bj);
            rrdZ.id_class(rrdX.NONE);
        }
    }

    public static void id_catch() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdX.TRIPWIRE);
        }
    }

    public static void id_extends() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.BI);
            rrdZ.id_class(rrdX.OUTLINE);
        }
    }

    public static void id_case() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.Bj);
            rrdZ.id_class(rrdX.NONE);
        }
    }

    public static void id_continue() {
    }

    public static void id_else() {
        rrdZ.id_class(rrdZ.SB);
    }

    public static void id_implements() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.BU);
            rrdZ.id_class(rrdX.DESTROY);
            if (rrdZ.BU.id_private() == rrdZ.BY.id_private()) {
                rrxU_2.id_class(rrdZ.Ev[0]);
                MT.id_class(false);
            }
        }
    }

    public static void id_new() {
    }

    public static void id_package() {
        int n = 18;
        GL20.glVertexAttribPointer((int)rrdZ.C, (int)3, (int)5120, (boolean)false, (int)72, (long)32L);
        GL20.glVertexAttribPointer((int)rrdZ.L, (int)2, (int)5126, (boolean)false, (int)72, (long)36L);
        GL20.glVertexAttribPointer((int)rrdZ.A, (int)4, (int)5122, (boolean)false, (int)72, (long)44L);
        GL20.glVertexAttribPointer((int)rrdZ.F, (int)3, (int)5122, (boolean)false, (int)72, (long)52L);
    }

    public static void id_super() {
    }

    public static void id_protected() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.Bj);
            rrdZ.id_class(rrdX.NONE);
        }
    }

    public static void id_private() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdX.NONE);
        }
    }

    public static void id_final() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdX.NONE);
        }
    }

    public static void id_volatile() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdX.DEBUG);
        }
    }

    public static void id_synchronized() {
        if (rrdZ.id_volatile) {
            if (rrdZ.R() && rrdZ.I()) {
                rrdZ.id_class(rrdZ.Ss);
            } else {
                rrdZ.id_class(rrdZ.Sr);
            }
        } else {
            rrdZ.id_class(rrdZ.By);
        }
    }

    public static void id_native() {
        if (rrdZ.id_volatile) {
            rrdZ.id_class(rrdZ.Bj);
            rrdZ.id_class(rrdX.NONE);
        }
    }
}

