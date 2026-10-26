package celestial;

import com.mojang.blaze3d.platform.GLX;
import java.util.Collections;
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

   public static void id_byte(Hh_1 var0, Ml_1 var1, ly_3 var2, float var3) {
      if (!rrdZ.id_new) {
         rrdZ.z();
         var0.id_class(var1, var2, var3, false, true, false);
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

   public static void id_class(rrxN_2 var0, double var1, double var3, double var5) {
      var0.id_class(var1, var3, var5);
   }

   public static void id_class(HB var0, float var1, Ml_1 var2, Hd_1 var3, cb_3 var4, int var5, boolean var6) {
      ((yX_2)QY.id_instanceof().id_class[8]).id_break = var4;
      MT.id_class(true);
      if (var6) {
         MT.id_break(519);
         var2.id_class();
         rrxY_2 var7 = rrxU_2.id_break();
         rrxU_2.id_class(rrdZ.EZ);
         rrdZ.id_this = true;
         var0.id_class(var1, var2, var3, var4, var5);
         rrdZ.id_this = false;
         rrxU_2.id_class(var7);
         var2.id_break();
      }

      MT.id_break(515);
      GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var0.id_class(var1, var2, var3, var4, var5);
      ((yX_2)QY.id_instanceof().id_class[8]).id_break = null;
   }

   public static void id_class(HU var0) {
      if (var0 == rrxA_2.id_class) {
         id_class();
      }

      if (var0 == rrxA_2.id_break) {
         id_break();
      }

      if (var0 == rrxA_2.id_byte) {
         id_byte();
      }

      if (var0 == rrxA_2.id_protected) {
         id_throws();
      }

      if (var0 == HU.id_synchronized()) {
         id_catch();
      }

      if (rrdZ.id_class(var0)) {
         MT.id_interface();
      }

      if (GLX.useVbo()) {
         GL20.glEnableVertexAttribArray(rrdZ.C);
         GL20.glEnableVertexAttribArray(rrdZ.L);
         GL20.glEnableVertexAttribArray(rrdZ.A);
         GL20.glEnableVertexAttribArray(rrdZ.F);
      }
   }

   public static void id_class(HU var0, lD_2 var1) {
      if (rrdZ.id_volatile && !rrdZ.id_new) {
         if (var0.id_void()) {
            id_else();
         } else if (var0.id_byte().equals("eyes")) {
            rrdZ.id_double();
         } else if (var0.id_byte().equals("crumbling")) {
            id_implements();
         } else if (var0 == HU.S) {
            rrdZ.Z();
         }
      }
   }

   public static void id_class(ly_3 var0, QY var1, float var2) {
      var0.id_class(
         var1,
         (gm_3)var1.id_class[56],
         (an_3)(var1.id_catch() == null ? (cb_3)var1.id_class[57] : var1.id_catch()),
         !((Qw_1)var1.id_class[20]).id_volatile().id_class(),
         ((Qw_1)var1.id_class[20]).id_volatile().id_break(),
         var2
      );
   }

   public static void id_class(Hh_1 var0, ly_3 var1, int var2, float var3, long var4) {
      if (rrdZ.BB) {
         QY var6 = QY.id_instanceof();
         yX_2 var7 = (yX_2)var6.id_class[8];
         rrdZ.id_new = true;
         rrdZ.id_char();
         rrdZ.id_catch("pre shadow");
         GL30.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL30.glMatrixMode(5888);
         GL11.glPushMatrix();
         rrdZ.BA.id_private();
         rrdZ.id_catch("shadow bind sfb");
         id_class(var1, var6, var3);
         Ml_1 var8 = new Ml_1();
         rrdZ.id_break(var8, var1, var3);
         rrdZ.id_catch("shadow camera");
         rrdZ.id_class(rrdZ.BL, rrdZ.Bp.id_goto());
         rrdZ.id_class(rrdZ.Bp);
         rrdZ.BA.id_finally();
         rrdZ.id_catch("shadow drawbuffers");
         GL30.glReadBuffer(0);
         rrdZ.id_catch("shadow readbuffer");
         rrdZ.BA.id_implements();
         rrdZ.BA.id_class(true);
         rrdZ.id_case("shadow fb");
         GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL30.glClear(256);

         for (int var9 = 0; var9 < rrdZ.Bu; var9++) {
            if (rrdZ.Bl[var9]) {
               rji_3 var10 = rrdZ.BH[var9];
               if (var10 != null) {
                  GL30.glClearColor(var10.id_class(), var10.id_break(), var10.id_byte(), var10.id_protected());
               } else {
                  GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
               }

               rrxU_2.id_class(rrdZ.Ev[var9]);
               GL30.glClear(16384);
            }
         }

         rrdZ.BA.id_finally();
         rrdZ.id_catch("shadow clear");
         rrxw_3 var32 = new rrxw_3();
         rjU_2 var33 = var1.id_break();
         var32.id_class(var33.id_break, var33.id_byte, var33.id_protected);
         MT.id_this(7425);
         MT.id_volatile();
         MT.id_break(515);
         MT.id_class(true);
         MT.id_class(true, true, true, true);
         MT.id_class(new rrxQ_2(false));
         MT.id_class(new rrxz_3(false));
         var6.A().id_class(fJ_2.id_class);
         int var11 = ((yX_2)var6.id_class[8]).id_goto();
         var7.id_class(var1, var32, false, var11, ((cb_3)var6.id_class[57]).id_native());
         double var12 = var33.id_class();
         double var14 = var33.id_break();
         double var16 = var33.id_byte();
         MT.id_return(5888);
         MT.id_transient();
         if (rrdZ.id_native()) {
            MT.id_protected();
            var7.id_class(rrxA_2.id_class, var8, var12, var14, var16);
            rrdZ.id_catch("shadow terrain solid");
            MT.id_throws();
            var7.id_class(rrxA_2.id_break, var8, var12, var14, var16);
            rrdZ.id_catch("shadow terrain cutoutmipped");
            var6.A().id_break(fJ_2.id_class).id_class(false, false);
            var7.id_class(rrxA_2.id_byte, var8, var12, var14, var16);
            var6.A().id_break(fJ_2.id_class).id_else();
            rrdZ.id_catch("shadow terrain cutout");
         }

         MT.id_this(7424);
         MT.id_class(516, 0.1F);
         MT.id_return(5888);
         MT.id_for();
         MT.id_transient();
         yX_2 var18 = (yX_2)var6.id_class[8];
         pg_3 var19 = var6.id_case();
         Hd_1 var20 = var18.id_while().id_break();
         boolean var21 = rrdZ.id_new && !((cb_3)var6.id_class[57]).id_native();

         for (Object var23 : rrdZ.id_final() ? var18.id_try() : Collections.EMPTY_LIST) {
            yx_3 var24 = (yx_3)var23;
            yQ_2 var25 = var24.id_class;
            roJ_2 var26 = var25.id_volatile();

            for (an_3 var28 : var26.id_final()[var25.id_throws().c_() / 16]) {
               if ((var19.id_class(var28, var32, var12, var14, var16) || var28.id_else((cb_3)var6.id_class[57]))
                  && (var28 != var1.id_catch() || var21 || var1.id_implements() || var1.id_catch() instanceof iB_2 && ((iB_2)var1.id_catch()).Sc())
                  && (var28 != (cb_3)QY.id_instanceof().id_class[57] || var1.id_catch() == var28)) {
                  var18.id_break = var28;
                  rrdZ.id_class(var28);
                  var18.id_class(var28, var12, var14, var16, var3, var8, var20);
                  var18.id_break = null;
               }
            }
         }

         var18.id_class(var8);
         var20.id_class(HU.id_break(fJ_2.id_class));
         var20.id_class(HU.id_byte(fJ_2.id_class));
         var20.id_class(HU.id_protected(fJ_2.id_class));
         var20.id_class(HU.id_implements(fJ_2.id_class));
         rrdZ.r();
         rrdZ.E();
         jX_2.id_class();
         boolean var34 = rrxr_3.Pg.id_byte();
         rrxw_3 var35 = var32;

         for (Object var37 : rrdZ.id_package() ? var18.id_instanceof() : Collections.EMPTY_LIST) {
            yx_3 var38 = (yx_3)var37;
            List var39 = var38.id_class.id_byte().id_break();
            if (!var39.isEmpty()) {
               for (ryO_2 var29 : var39) {
                  if (var34) {
                     rfl_3 var30 = (rfl_3)rrxr_3.id_private(var29, rrxr_3.Pg);
                     if (var30 != null && !var35.id_class(var30)) {
                        continue;
                     }
                  }

                  rrdZ.id_class(var29);
                  rfH_2 var31 = var29.id_char();
                  var8.id_class();
                  var8.id_class((double)var31.b_() - var12, (double)var31.c_() - var14, (double)var31.d_() - var16);
                  jz_3.id_break.id_class(var29, var3, var8, var20);
                  var8.id_break();
               }
            }
         }

         var18.id_class(var8);
         var20.id_class(HU.id_case());
         var20.id_class(lp_3.id_catch());
         var20.id_class(lp_3.id_private());
         var20.id_class(lp_3.id_byte());
         var20.id_class(lp_3.id_protected());
         var20.id_class(lp_3.id_throws());
         var20.id_class(lp_3.id_case());
         var20.id_break();
         rrdZ.G();
         rrdZ.id_catch("shadow entities");
         MT.id_return(5888);
         MT.id_for();
         MT.id_class(true);
         MT.id_final();
         MT.M();
         MT.id_throw();
         MT.id_break(770, 771, 1, 0);
         MT.id_class(516, 0.1F);
         if (rrdZ.Bm >= 2) {
            MT.id_new(33989);
            rrdZ.id_catch("pre copy shadow depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, rrdZ.Bs, rrdZ.BE);
            rrdZ.id_catch("copy shadow depth");
            MT.id_new(33984);
         }

         MT.id_final();
         MT.id_class(true);
         var6.A().id_class(fJ_2.id_class);
         MT.id_this(7425);
         rrdZ.id_catch("shadow pre-translucent");
         rrdZ.BA.id_finally();
         rrdZ.id_catch("shadow drawbuffers pre-translucent");
         rrdZ.id_case("shadow pre-translucent");
         if (rrdZ.id_volatile()) {
            var7.id_class(rrxA_2.id_protected, var8, var12, var14, var16);
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
         GL11.glViewport(0, 0, rrdZ.id_extends, rrdZ.id_native);
         rrxU_2.id_class((rrxY_2)null);
         var6.A().id_class(fJ_2.id_class);
         rrdZ.id_class(rrdZ.BY);
         GL30.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5888);
         rrdZ.id_catch("shadow end");
      }
   }

   public static void id_class(Hh_1 var0, Ml_1 var1, ly_3 var2, float var3) {
      if (!rrdZ.id_new) {
         boolean var4 = rrdZ.T();
         boolean var5 = rrdZ.t();
         if (!var4 || !var5) {
            rrdZ.h();
            rrdZ.id_class(var1, false);
            GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            rrdZ.id_class(var4, var5);
            var0.id_class(var1, var2, var3, true, false, false);
            rrdZ.id_catch(var1);
            rrdZ.id_break(!var4, !var5);
            rrdZ.id_class(false, false);
         }
      }
   }

   public static boolean id_class(rHp_1 var0, float var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      if (!rrdZ.id_new && rrdZ.Sz.id_private() == 0) {
         return false;
      } else {
         MT.id_catch();
         MH var7 = var3.id_byte();
         rjV_2 var8 = var7.id_class();
         rjj_3 var9 = var7.id_break();
         Ok_1 var10 = var4.getBuffer(HU.id_break(id_class));
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
         if (var0.id_class(rpr_3.SOUTH)) {
            rja_3 var21 = rpr_3.SOUTH.id_int();
            float var22 = (float)var21.b_();
            float var23 = (float)var21.c_();
            float var24 = (float)var21.d_();
            float var25 = var9.id_throws(var22, var23, var24);
            float var26 = var9.id_case(var22, var23, var24);
            float var27 = var9.id_catch(var22, var23, var24);
            var10.id_class(var8, var18, var19, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var25, var26, var27)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var25, var26, var27)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19 + 1.0F, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var25, var26, var27)
               .id_class();
            var10.id_class(var8, var18, var19 + 1.0F, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var25, var26, var27)
               .id_class();
         }

         if (var0.id_class(rpr_3.NORTH)) {
            rja_3 var28 = rpr_3.NORTH.id_int();
            float var33 = (float)var28.b_();
            float var38 = (float)var28.c_();
            float var43 = (float)var28.d_();
            float var48 = var9.id_throws(var33, var38, var43);
            float var53 = var9.id_case(var33, var38, var43);
            float var58 = var9.id_catch(var33, var38, var43);
            var10.id_class(var8, var18, var19 + 1.0F, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var48, var53, var58)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19 + 1.0F, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var48, var53, var58)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var48, var53, var58)
               .id_class();
            var10.id_class(var8, var18, var19, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var48, var53, var58)
               .id_class();
         }

         if (var0.id_class(rpr_3.EAST)) {
            rja_3 var29 = rpr_3.EAST.id_int();
            float var34 = (float)var29.b_();
            float var39 = (float)var29.c_();
            float var44 = (float)var29.d_();
            float var49 = var9.id_throws(var34, var39, var44);
            float var54 = var9.id_case(var34, var39, var44);
            float var59 = var9.id_catch(var34, var39, var44);
            var10.id_class(var8, var18 + 1.0F, var19 + 1.0F, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var49, var54, var59)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19 + 1.0F, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var49, var54, var59)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var49, var54, var59)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var49, var54, var59)
               .id_class();
         }

         if (var0.id_class(rpr_3.WEST)) {
            rja_3 var30 = rpr_3.WEST.id_int();
            float var35 = (float)var30.b_();
            float var40 = (float)var30.c_();
            float var45 = (float)var30.d_();
            float var50 = var9.id_throws(var35, var40, var45);
            float var55 = var9.id_case(var35, var40, var45);
            float var60 = var9.id_catch(var35, var40, var45);
            var10.id_class(var8, var18, var19, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var50, var55, var60)
               .id_class();
            var10.id_class(var8, var18, var19, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var50, var55, var60)
               .id_class();
            var10.id_class(var8, var18, var19 + 1.0F, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var50, var55, var60)
               .id_class();
            var10.id_class(var8, var18, var19 + 1.0F, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var50, var55, var60)
               .id_class();
         }

         if (var0.id_class(rpr_3.DOWN)) {
            rja_3 var31 = rpr_3.DOWN.id_int();
            float var36 = (float)var31.b_();
            float var41 = (float)var31.c_();
            float var46 = (float)var31.d_();
            float var51 = var9.id_throws(var36, var41, var46);
            float var56 = var9.id_case(var36, var41, var46);
            float var61 = var9.id_catch(var36, var41, var46);
            var10.id_class(var8, var18, var19, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var51, var56, var61)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var51, var56, var61)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var51, var56, var61)
               .id_class();
            var10.id_class(var8, var18, var19, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var51, var56, var61)
               .id_class();
         }

         if (var0.id_class(rpr_3.UP)) {
            rja_3 var32 = rpr_3.UP.id_int();
            float var37 = (float)var32.b_();
            float var42 = (float)var32.c_();
            float var47 = (float)var32.d_();
            float var52 = var9.id_throws(var37, var42, var47);
            float var57 = var9.id_case(var37, var42, var47);
            float var62 = var9.id_catch(var37, var42, var47);
            var10.id_class(var8, var18, var19 + var2, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var52, var57, var62)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19 + var2, var20 + 1.0F)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var15 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var52, var57, var62)
               .id_class();
            var10.id_class(var8, var18 + 1.0F, var19 + var2, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var16 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var52, var57, var62)
               .id_class();
            var10.id_class(var8, var18, var19 + var2, var20)
               .id_class(var12, var13, var14, 1.0F)
               .id_class(var16 + var17, var15 + var17)
               .id_byte(var6)
               .id_break(var5)
               .id_class(var52, var57, var62)
               .id_class();
         }

         MT.id_case();
         return true;
      }
   }

   public static void id_break(HU var0, lD_2 var1) {
      if (rrdZ.id_volatile && !rrdZ.id_new) {
         if (var0.id_void()) {
            id_synchronized();
         } else if (var0.id_byte().equals("eyes")) {
            rrdZ.id_switch();
         } else if (var0.id_byte().equals("crumbling")) {
            id_finally();
         } else if (var0 == HU.S) {
            rrdZ.v();
         }
      }
   }

   public static void id_break(Hh_1 var0, Ml_1 var1, ly_3 var2, float var3) {
      if (!rrdZ.id_new && !rrdZ.w()) {
         rrdZ.h();
         MT.id_package();
         rrdZ.id_class(var1, true);
         GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         rrdZ.id_class(rrdZ.f(), rrdZ.j());
         var0.id_class(var1, var2, var3, true, false, true);
         rrdZ.id_catch(var1);
         rrdZ.id_break(true, true);
         rrdZ.id_class(false, false);
      }
   }

   public static void id_break(HU var0) {
      if (GLX.useVbo()) {
         GL20.glDisableVertexAttribArray(rrdZ.C);
         GL20.glDisableVertexAttribArray(rrdZ.L);
         GL20.glDisableVertexAttribArray(rrdZ.A);
         GL20.glDisableVertexAttribArray(rrdZ.F);
      }

      if (rrdZ.id_class(var0)) {
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
      byte var0 = 18;
      GL20.glVertexAttribPointer(rrdZ.C, 3, 5120, false, 72, 32L);
      GL20.glVertexAttribPointer(rrdZ.L, 2, 5126, false, 72, 36L);
      GL20.glVertexAttribPointer(rrdZ.A, 4, 5122, false, 72, 44L);
      GL20.glVertexAttribPointer(rrdZ.F, 3, 5122, false, 72, 52L);
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
