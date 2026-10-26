package celestial;

import com.mojang.blaze3d.platform.GLX;
import java.util.Collections;
import java.util.List;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class rrdL {
   private static final rqO_2 class_ = new rqO_2("textures/entity/end_portal.png");

   public static void byte_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.BY);
         rrdZ.class_(rrdX.TERRAIN_CUTOUT);
      }
   }

   public static void byte_(Hh_1 var0, Ml_1 var1, ly_3 var2, float var3) {
      if (!rrdZ.new_) {
         rrdZ.z();
         var0.class_(var1, var2, var3, false, true, false);
         rrdZ.Q();
      }
   }

   public static void int_() {
      rrdZ.class_(rrdZ.Ba);
   }

   public static void this_() {
      MT.final_();
   }

   public static void class_() {
      if (rrdZ.volatile_) {
         rrdZ.Z = true;
         rrdZ.class_(rrdZ.BY);
         rrdZ.class_(rrdX.TERRAIN_SOLID);
      }
   }

   public static void class_(rrxN_2 var0, double var1, double var3, double var5) {
      var0.class_(var1, var3, var5);
   }

   public static void class_(HB var0, float var1, Ml_1 var2, Hd_1 var3, cb_3 var4, int var5, boolean var6) {
      ((yX_2)QY.instanceof_().class_[8]).break_ = var4;
      MT.class_(true);
      if (var6) {
         MT.break_(519);
         var2.class_();
         rrxY_2 var7 = rrxU_2.break_();
         rrxU_2.class_(rrdZ.EZ);
         rrdZ.this_ = true;
         var0.class_(var1, var2, var3, var4, var5);
         rrdZ.this_ = false;
         rrxU_2.class_(var7);
         var2.break_();
      }

      MT.break_(515);
      GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var0.class_(var1, var2, var3, var4, var5);
      ((yX_2)QY.instanceof_().class_[8]).break_ = null;
   }

   public static void class_(HU var0) {
      if (var0 == rrxA_2.class_) {
         class_();
      }

      if (var0 == rrxA_2.break_) {
         break_();
      }

      if (var0 == rrxA_2.byte_) {
         byte_();
      }

      if (var0 == rrxA_2.protected_) {
         throws_();
      }

      if (var0 == HU.synchronized_()) {
         catch_();
      }

      if (rrdZ.class_(var0)) {
         MT.interface_();
      }

      if (GLX.useVbo()) {
         GL20.glEnableVertexAttribArray(rrdZ.C);
         GL20.glEnableVertexAttribArray(rrdZ.L);
         GL20.glEnableVertexAttribArray(rrdZ.A);
         GL20.glEnableVertexAttribArray(rrdZ.F);
      }
   }

   public static void class_(HU var0, lD_2 var1) {
      if (rrdZ.volatile_ && !rrdZ.new_) {
         if (var0.void_()) {
            else_();
         } else if (var0.byte_().equals("eyes")) {
            rrdZ.double_();
         } else if (var0.byte_().equals("crumbling")) {
            implements_();
         } else if (var0 == HU.S) {
            rrdZ.Z();
         }
      }
   }

   public static void class_(ly_3 var0, QY var1, float var2) {
      var0.class_(
         var1,
         (gm_3)var1.class_[56],
         (an_3)(var1.catch_() == null ? (cb_3)var1.class_[57] : var1.catch_()),
         !((Qw_1)var1.class_[20]).volatile_().class_(),
         ((Qw_1)var1.class_[20]).volatile_().break_(),
         var2
      );
   }

   public static void class_(Hh_1 var0, ly_3 var1, int var2, float var3, long var4) {
      if (rrdZ.BB) {
         QY var6 = QY.instanceof_();
         yX_2 var7 = (yX_2)var6.class_[8];
         rrdZ.new_ = true;
         rrdZ.char_();
         rrdZ.catch_("pre shadow");
         GL30.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL30.glMatrixMode(5888);
         GL11.glPushMatrix();
         rrdZ.BA.private_();
         rrdZ.catch_("shadow bind sfb");
         class_(var1, var6, var3);
         Ml_1 var8 = new Ml_1();
         rrdZ.break_(var8, var1, var3);
         rrdZ.catch_("shadow camera");
         rrdZ.class_(rrdZ.BL, rrdZ.Bp.goto_());
         rrdZ.class_(rrdZ.Bp);
         rrdZ.BA.finally_();
         rrdZ.catch_("shadow drawbuffers");
         GL30.glReadBuffer(0);
         rrdZ.catch_("shadow readbuffer");
         rrdZ.BA.implements_();
         rrdZ.BA.class_(true);
         rrdZ.case_("shadow fb");
         GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL30.glClear(256);

         for (int var9 = 0; var9 < rrdZ.Bu; var9++) {
            if (rrdZ.Bl[var9]) {
               rji_3 var10 = rrdZ.BH[var9];
               if (var10 != null) {
                  GL30.glClearColor(var10.class_(), var10.break_(), var10.byte_(), var10.protected_());
               } else {
                  GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
               }

               rrxU_2.class_(rrdZ.Ev[var9]);
               GL30.glClear(16384);
            }
         }

         rrdZ.BA.finally_();
         rrdZ.catch_("shadow clear");
         rrxw_3 var32 = new rrxw_3();
         rjU_2 var33 = var1.break_();
         var32.class_(var33.break_, var33.byte_, var33.protected_);
         MT.this_(7425);
         MT.volatile_();
         MT.break_(515);
         MT.class_(true);
         MT.class_(true, true, true, true);
         MT.class_(new rrxQ_2(false));
         MT.class_(new rrxz_3(false));
         var6.A().class_(fJ_2.class_);
         int var11 = ((yX_2)var6.class_[8]).goto_();
         var7.class_(var1, var32, false, var11, ((cb_3)var6.class_[57]).native_());
         double var12 = var33.class_();
         double var14 = var33.break_();
         double var16 = var33.byte_();
         MT.return_(5888);
         MT.transient_();
         if (rrdZ.native_()) {
            MT.protected_();
            var7.class_(rrxA_2.class_, var8, var12, var14, var16);
            rrdZ.catch_("shadow terrain solid");
            MT.throws_();
            var7.class_(rrxA_2.break_, var8, var12, var14, var16);
            rrdZ.catch_("shadow terrain cutoutmipped");
            var6.A().break_(fJ_2.class_).class_(false, false);
            var7.class_(rrxA_2.byte_, var8, var12, var14, var16);
            var6.A().break_(fJ_2.class_).else_();
            rrdZ.catch_("shadow terrain cutout");
         }

         MT.this_(7424);
         MT.class_(516, 0.1F);
         MT.return_(5888);
         MT.for_();
         MT.transient_();
         yX_2 var18 = (yX_2)var6.class_[8];
         pg_3 var19 = var6.case_();
         Hd_1 var20 = var18.while_().break_();
         boolean var21 = rrdZ.new_ && !((cb_3)var6.class_[57]).native_();

         for (Object var23 : rrdZ.final_() ? var18.try_() : Collections.EMPTY_LIST) {
            yx_3 var24 = (yx_3)var23;
            yQ_2 var25 = var24.class_;
            roJ_2 var26 = var25.volatile_();

            for (an_3 var28 : var26.final_()[var25.throws_().c_() / 16]) {
               if ((var19.class_(var28, var32, var12, var14, var16) || var28.else_((cb_3)var6.class_[57]))
                  && (var28 != var1.catch_() || var21 || var1.implements_() || var1.catch_() instanceof iB_2 && ((iB_2)var1.catch_()).Sc())
                  && (var28 != (cb_3)QY.instanceof_().class_[57] || var1.catch_() == var28)) {
                  var18.break_ = var28;
                  rrdZ.class_(var28);
                  var18.class_(var28, var12, var14, var16, var3, var8, var20);
                  var18.break_ = null;
               }
            }
         }

         var18.class_(var8);
         var20.class_(HU.break_(fJ_2.class_));
         var20.class_(HU.byte_(fJ_2.class_));
         var20.class_(HU.protected_(fJ_2.class_));
         var20.class_(HU.implements_(fJ_2.class_));
         rrdZ.r();
         rrdZ.E();
         jX_2.class_();
         boolean var34 = rrxr_3.Pg.byte_();
         rrxw_3 var35 = var32;

         for (Object var37 : rrdZ.package_() ? var18.instanceof_() : Collections.EMPTY_LIST) {
            yx_3 var38 = (yx_3)var37;
            List var39 = var38.class_.byte_().break_();
            if (!var39.isEmpty()) {
               for (ryO_2 var29 : var39) {
                  if (var34) {
                     rfl_3 var30 = (rfl_3)rrxr_3.private_(var29, rrxr_3.Pg);
                     if (var30 != null && !var35.class_(var30)) {
                        continue;
                     }
                  }

                  rrdZ.class_(var29);
                  rfH_2 var31 = var29.char_();
                  var8.class_();
                  var8.class_((double)var31.b_() - var12, (double)var31.c_() - var14, (double)var31.d_() - var16);
                  jz_3.break_.class_(var29, var3, var8, var20);
                  var8.break_();
               }
            }
         }

         var18.class_(var8);
         var20.class_(HU.case_());
         var20.class_(lp_3.catch_());
         var20.class_(lp_3.private_());
         var20.class_(lp_3.byte_());
         var20.class_(lp_3.protected_());
         var20.class_(lp_3.throws_());
         var20.class_(lp_3.case_());
         var20.break_();
         rrdZ.G();
         rrdZ.catch_("shadow entities");
         MT.return_(5888);
         MT.for_();
         MT.class_(true);
         MT.final_();
         MT.M();
         MT.throw_();
         MT.break_(770, 771, 1, 0);
         MT.class_(516, 0.1F);
         if (rrdZ.Bm >= 2) {
            MT.new_(33989);
            rrdZ.catch_("pre copy shadow depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, rrdZ.Bs, rrdZ.BE);
            rrdZ.catch_("copy shadow depth");
            MT.new_(33984);
         }

         MT.final_();
         MT.class_(true);
         var6.A().class_(fJ_2.class_);
         MT.this_(7425);
         rrdZ.catch_("shadow pre-translucent");
         rrdZ.BA.finally_();
         rrdZ.catch_("shadow drawbuffers pre-translucent");
         rrdZ.case_("shadow pre-translucent");
         if (rrdZ.volatile_()) {
            var7.class_(rrxA_2.protected_, var8, var12, var14, var16);
            rrdZ.catch_("shadow translucent");
         }

         MT.b();
         MT.this_(7424);
         MT.class_(true);
         MT.throw_();
         MT.final_();
         GL30.glFlush();
         rrdZ.catch_("shadow flush");
         rrdZ.new_ = false;
         if (rrdZ.implements_) {
            rrdZ.BA.class_(rrdZ.SF);
            rrdZ.BA.class_(true, rrdZ.SA);
         }

         rrdZ.catch_("shadow postprocess");
         if (rrdZ.SN) {
            rrdZ.static_();
         }

         rrdZ.BL.private_();
         GL11.glViewport(0, 0, rrdZ.extends_, rrdZ.native_);
         rrxU_2.class_((rrxY_2)null);
         var6.A().class_(fJ_2.class_);
         rrdZ.class_(rrdZ.BY);
         GL30.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5888);
         rrdZ.catch_("shadow end");
      }
   }

   public static void class_(Hh_1 var0, Ml_1 var1, ly_3 var2, float var3) {
      if (!rrdZ.new_) {
         boolean var4 = rrdZ.T();
         boolean var5 = rrdZ.t();
         if (!var4 || !var5) {
            rrdZ.h();
            rrdZ.class_(var1, false);
            GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            rrdZ.class_(var4, var5);
            var0.class_(var1, var2, var3, true, false, false);
            rrdZ.catch_(var1);
            rrdZ.break_(!var4, !var5);
            rrdZ.class_(false, false);
         }
      }
   }

   public static boolean class_(rHp_1 var0, float var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (!rrdZ.new_ && rrdZ.Sz.private_() == 0) {
         return false;
      } else {
         MT.catch_();
         MH var7 = var3.byte_();
         rjV_2 var8 = var7.class_();
         rjj_3 var9 = var7.break_();
         Ok_1 var10 = var4.getBuffer(HU.break_(class_));
         float var11 = 0.5F;
         float var12 = var11 * 0.15F;
         float var13 = var11 * 0.3F;
         float var14 = var11 * 0.4F;
         float var15 = 0.0F;
         float var16 = 0.2F;
         float var17 = (float)(System.currentTimeMillis() % 100000L) / 100000.0F;
         float var18 = 0.0F;
         float var19 = 0.0F;
         float var20 = 0.0F;
         if (var0.class_(rpr_3.SOUTH)) {
            rja_3 var21 = rpr_3.SOUTH.int_();
            float var22 = (float)var21.b_();
            float var23 = (float)var21.c_();
            float var24 = (float)var21.d_();
            float var25 = var9.throws_(var22, var23, var24);
            float var26 = var9.case_(var22, var23, var24);
            float var27 = var9.catch_(var22, var23, var24);
            var10.class_(var8, var18, var19, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var25, var26, var27)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var25, var26, var27)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19 + 1.0F, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var25, var26, var27)
               .class_();
            var10.class_(var8, var18, var19 + 1.0F, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var25, var26, var27)
               .class_();
         }

         if (var0.class_(rpr_3.NORTH)) {
            rja_3 var28 = rpr_3.NORTH.int_();
            float var33 = (float)var28.b_();
            float var38 = (float)var28.c_();
            float var43 = (float)var28.d_();
            float var48 = var9.throws_(var33, var38, var43);
            float var53 = var9.case_(var33, var38, var43);
            float var58 = var9.catch_(var33, var38, var43);
            var10.class_(var8, var18, var19 + 1.0F, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var48, var53, var58)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19 + 1.0F, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var48, var53, var58)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var48, var53, var58)
               .class_();
            var10.class_(var8, var18, var19, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var48, var53, var58)
               .class_();
         }

         if (var0.class_(rpr_3.EAST)) {
            rja_3 var29 = rpr_3.EAST.int_();
            float var34 = (float)var29.b_();
            float var39 = (float)var29.c_();
            float var44 = (float)var29.d_();
            float var49 = var9.throws_(var34, var39, var44);
            float var54 = var9.case_(var34, var39, var44);
            float var59 = var9.catch_(var34, var39, var44);
            var10.class_(var8, var18 + 1.0F, var19 + 1.0F, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var49, var54, var59)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19 + 1.0F, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var49, var54, var59)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var49, var54, var59)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var49, var54, var59)
               .class_();
         }

         if (var0.class_(rpr_3.WEST)) {
            rja_3 var30 = rpr_3.WEST.int_();
            float var35 = (float)var30.b_();
            float var40 = (float)var30.c_();
            float var45 = (float)var30.d_();
            float var50 = var9.throws_(var35, var40, var45);
            float var55 = var9.case_(var35, var40, var45);
            float var60 = var9.catch_(var35, var40, var45);
            var10.class_(var8, var18, var19, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var50, var55, var60)
               .class_();
            var10.class_(var8, var18, var19, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var50, var55, var60)
               .class_();
            var10.class_(var8, var18, var19 + 1.0F, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var50, var55, var60)
               .class_();
            var10.class_(var8, var18, var19 + 1.0F, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var50, var55, var60)
               .class_();
         }

         if (var0.class_(rpr_3.DOWN)) {
            rja_3 var31 = rpr_3.DOWN.int_();
            float var36 = (float)var31.b_();
            float var41 = (float)var31.c_();
            float var46 = (float)var31.d_();
            float var51 = var9.throws_(var36, var41, var46);
            float var56 = var9.case_(var36, var41, var46);
            float var61 = var9.catch_(var36, var41, var46);
            var10.class_(var8, var18, var19, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var51, var56, var61)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var51, var56, var61)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var51, var56, var61)
               .class_();
            var10.class_(var8, var18, var19, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var51, var56, var61)
               .class_();
         }

         if (var0.class_(rpr_3.UP)) {
            rja_3 var32 = rpr_3.UP.int_();
            float var37 = (float)var32.b_();
            float var42 = (float)var32.c_();
            float var47 = (float)var32.d_();
            float var52 = var9.throws_(var37, var42, var47);
            float var57 = var9.case_(var37, var42, var47);
            float var62 = var9.catch_(var37, var42, var47);
            var10.class_(var8, var18, var19 + var2, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var52, var57, var62)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19 + var2, var20 + 1.0F)
               .class_(var12, var13, var14, 1.0F)
               .class_(var15 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var52, var57, var62)
               .class_();
            var10.class_(var8, var18 + 1.0F, var19 + var2, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var16 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var52, var57, var62)
               .class_();
            var10.class_(var8, var18, var19 + var2, var20)
               .class_(var12, var13, var14, 1.0F)
               .class_(var16 + var17, var15 + var17)
               .byte_(var6)
               .break_(var5)
               .class_(var52, var57, var62)
               .class_();
         }

         MT.case_();
         return true;
      }
   }

   public static void break_(HU var0, lD_2 var1) {
      if (rrdZ.volatile_ && !rrdZ.new_) {
         if (var0.void_()) {
            synchronized_();
         } else if (var0.byte_().equals("eyes")) {
            rrdZ.switch_();
         } else if (var0.byte_().equals("crumbling")) {
            finally_();
         } else if (var0 == HU.S) {
            rrdZ.v();
         }
      }
   }

   public static void break_(Hh_1 var0, Ml_1 var1, ly_3 var2, float var3) {
      if (!rrdZ.new_ && !rrdZ.w()) {
         rrdZ.h();
         MT.package_();
         rrdZ.class_(var1, true);
         GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         rrdZ.class_(rrdZ.f(), rrdZ.j());
         var0.class_(var1, var2, var3, true, false, true);
         rrdZ.catch_(var1);
         rrdZ.break_(true, true);
         rrdZ.class_(false, false);
      }
   }

   public static void break_(HU var0) {
      if (GLX.useVbo()) {
         GL20.glDisableVertexAttribArray(rrdZ.C);
         GL20.glDisableVertexAttribArray(rrdZ.L);
         GL20.glDisableVertexAttribArray(rrdZ.A);
         GL20.glDisableVertexAttribArray(rrdZ.F);
      }

      if (rrdZ.class_(var0)) {
         MT.throw_();
      }
   }

   public static void break_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.BY);
         rrdZ.class_(rrdX.TERRAIN_CUTOUT_MIPPED);
      }
   }

   public static void throws_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.SO);
         rrdZ.class_(rrdX.TERRAIN_TRANSLUCENT);
      }
   }

   public static void finally_() {
      if (rrdZ.volatile_) {
         MT.class_(true);
         rrdZ.class_(rrdZ.Bj);
         rrdZ.class_(rrdX.NONE);
      }
   }

   public static void catch_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdX.TRIPWIRE);
      }
   }

   public static void extends_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.BI);
         rrdZ.class_(rrdX.OUTLINE);
      }
   }

   public static void case_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.Bj);
         rrdZ.class_(rrdX.NONE);
      }
   }

   public static void continue_() {
   }

   public static void else_() {
      rrdZ.class_(rrdZ.SB);
   }

   public static void implements_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.BU);
         rrdZ.class_(rrdX.DESTROY);
         if (rrdZ.BU.private_() == rrdZ.BY.private_()) {
            rrxU_2.class_(rrdZ.Ev[0]);
            MT.class_(false);
         }
      }
   }

   public static void new_() {
   }

   public static void package_() {
      byte var0 = 18;
      GL20.glVertexAttribPointer(rrdZ.C, 3, 5120, false, 72, 32L);
      GL20.glVertexAttribPointer(rrdZ.L, 2, 5126, false, 72, 36L);
      GL20.glVertexAttribPointer(rrdZ.A, 4, 5122, false, 72, 44L);
      GL20.glVertexAttribPointer(rrdZ.F, 3, 5122, false, 72, 52L);
   }

   public static void super_() {
   }

   public static void protected_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.Bj);
         rrdZ.class_(rrdX.NONE);
      }
   }

   public static void private_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdX.NONE);
      }
   }

   public static void final_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdX.NONE);
      }
   }

   public static void volatile_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdX.DEBUG);
      }
   }

   public static void synchronized_() {
      if (rrdZ.volatile_) {
         if (rrdZ.R() && rrdZ.I()) {
            rrdZ.class_(rrdZ.Ss);
         } else {
            rrdZ.class_(rrdZ.Sr);
         }
      } else {
         rrdZ.class_(rrdZ.By);
      }
   }

   public static void native_() {
      if (rrdZ.volatile_) {
         rrdZ.class_(rrdZ.Bj);
         rrdZ.class_(rrdX.NONE);
      }
   }
}
