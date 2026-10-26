package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.opengl.GL11;

public class ProjectileHelper extends Module {
   private static float[] id_protected;
   private static short[] id_throws;
   private static double[] id_catch;
   private static byte[] id_private;
   public Object[] id_break;
   public static Object[] id_byte;
   private static boolean[] id_implements;
   private static String[] id_finally;

   private void id_byte(rhd_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, float var6) {
      if (var2.id_catch() < var2.id_private() - 1) {
         int var7 = eA_2.id_catch(var2);
         if (var7 <= 0) {
            rjU_2 var8 = var4.id_class(0.0, 0.1F, 0.0);
            int var9 = eA_2.id_catch(var2);
            float var10 = 2.5F + (float)var9 * 0.5F;
            float var11 = 0.0F;
            float var12 = 0.05F;
            rjU_2 var13 = id_class(var1, (double)var10, (double)var11, 0.0F, var5);
            this.id_class(var1, var2, aI_2.g, var3, var12, 0.99F, var8, var13, var6);
         }
      }
   }

   private void id_byte(rdn_3 var1) {
      this.id_super();
      if (((cb_3)id_import.id_class[57]).sF()) {
         int var2 = var1.id_break().id_break(var1) - ((cb_3)id_import.id_class[57]).SH();
         if (var2 >= 10 && !((cb_3)id_import.id_class[57]).sK().id_class(var1.id_break())) {
            boolean var3 = ((List)this.id_break[16]).stream().anyMatch(var0 -> {
               if (var0.id_catch() != aI_2.g) {
                  return false;
               } else {
                  List var1x = var0.id_protected();
                  if (var1x == null) {
                     return false;
                  } else {
                     for (rjG_2 var3x : var1x) {
                        if (var3x instanceof rfo_3 var4 && var4.id_class() instanceof cM_2 var5 && rrff_3.id_class((cG_2)var5)) {
                           return true;
                        }
                     }

                     return id_implements[84];
                  }
               }
            });
            if (var3) {
               ((Ax_1)id_import.id_class[55]).id_package();
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
            }
         }
      }
   }

   public ProjectileHelper() {
      super("Projectile Helper", "Утилитарный модуль для снарядов\nи их оружия", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.id_super();
      rrIk_1 var5 = new rrIk_1("Эндер пёрлы", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Стрелы", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Трезубцы", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Зелья", true);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Предметы", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Автоматически стрелять\nесли цель в зоне", false);
      this.id_break[5] = var10;
      rrIk_1 var11 = new rrIk_1("Не давать отпустить если\nполностью не заряжен", true);
      this.id_break[6] = var11;
      rrIk_1 var12 = new rrIk_1("Автоматически стрелять\nесли цель в зоне", false);
      this.id_break[7] = var12;
      rrIk_1 var13 = new rrIk_1("Автоматически отпускать\nпри полном заряде", false);
      this.id_break[8] = var13;
      rrIk_1 var14 = new rrIk_1("Не давать отпустить если\nполностью не заряжен", true);
      this.id_break[9] = var14;
      rrIk_1 var15 = new rrIk_1("Автоматически стрелять\nесли цель в зоне", false);
      this.id_break[10] = var15;
      rrIm_1 var16 = new rrIm_1("Сила натяжения", 0.5F, 0.1F, 1.0F, 0.1F).id_class(((rrIk_1)this.id_break[10])::id_class);
      this.id_break[11] = var16;
      rrIk_1 var17 = new rrIk_1("Не давать отпустить если\nне достаточно заряжен", true);
      this.id_break[12] = var17;
      rrIm_1 var18 = new rrIm_1("Размер хитбокса", 0.3F, -0.2F, 0.3F, 0.01F).id_finally();
      this.id_break[13] = var18;
      ArrayList var19 = new ArrayList();
      this.id_break[14] = var19;
      ArrayList var20 = new ArrayList();
      this.id_break[15] = var20;
      ArrayList var21 = new ArrayList();
      this.id_break[16] = var21;
      ArrayList var22 = new ArrayList();
      this.id_break[17] = var22;
      this.id_class(
         new Setting[]{
            new GroupSetting(
               "Траектории",
               new rrIc_1(
                  "Рисовать", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4]
               )
            ),
            new GroupSetting("Трезубец", (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[6]),
            new GroupSetting("Арбалет", (rrIk_1)this.id_break[7], (rrIk_1)this.id_break[8], (rrIk_1)this.id_break[9]),
            new GroupSetting("Лук", (rrIk_1)this.id_break[10], (rrIm_1)this.id_break[11], (rrIk_1)this.id_break[12]),
            new GroupSetting("Другое", (rrIm_1)this.id_break[13])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_finally = new String[]{
         new String("Projectile Helper"),
         new String("Утилитарный модуль для снарядов\nи их оружия"),
         new String("Эндер пёрлы"),
         new String("Стрелы"),
         new String("Трезубцы"),
         new String("Зелья"),
         new String("Предметы"),
         new String("Автоматически стрелять\nесли цель в зоне"),
         new String("Не давать отпустить если\nполностью не заряжен"),
         new String("Автоматически стрелять\nесли цель в зоне"),
         new String("Автоматически отпускать\nпри полном заряде"),
         new String("Не давать отпустить если\nполностью не заряжен"),
         new String("Автоматически стрелять\nесли цель в зоне"),
         new String("Сила натяжения"),
         new String("Не давать отпустить если\nне достаточно заряжен"),
         new String("Размер хитбокса"),
         new String("Траектории"),
         new String("Рисовать"),
         new String("Трезубец"),
         new String("Арбалет"),
         new String("Лук"),
         new String("Другое")
      };
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_super();
      Boolean var6 = false;
      this.id_break[19] = var6;
   }

   @EventTarget
   public void id_class(rrAC var1) {
      this.id_super();
      if (var1.id_break() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rdn_3 var2 = var1.id_protected();
         rdb_3 var3 = var2.id_break();
         int var4 = var3.id_break(var2) - ((cb_3)id_import.id_class[57]).SH();
         if (((rrIk_1)this.id_break[6]).id_class() && var3 == rdy_3.kY) {
            if (var4 < 10 && !((cb_3)id_import.id_class[57]).sK().id_class(var3)) {
               var1.id_class(true);
            }
         } else if (((rrIk_1)this.id_break[9]).id_class() && var3 == rdy_3.kU) {
            if (rxm_3.id_class(var4, var2) < 1.0F && !rxm_3.id_protected(var2) && !((cb_3)id_import.id_class[57]).sK().id_class(var3)) {
               var1.id_class(true);
            }
         } else if (((rrIk_1)this.id_break[12]).id_class() && var3 == rdy_3.OM) {
            float var5 = rxQ_2.id_class(var4);
            if (var5 < 0.1F && !((cb_3)id_import.id_class[57]).sK().id_class(var3)) {
               var1.id_class(true);
            }
         }
      }
   }

   private void id_class(rhd_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, boolean var6, float var7) {
      if (var6) {
         rjU_2 var8 = var4.id_class(0.0, 0.1F, 0.0);
         rjU_2 var9 = var4.id_class(0.0, 0.15F, 0.0);
         float var10 = 0.0F;
         float var11 = rxm_3.id_class(var2, rdy_3.dc) ? 1.6F : id_protected[36];
         float var12 = 0.0F;
         float var13 = 0.05F;
         rjU_2 var14 = var1.id_protected(var5.id_throws(), var5.id_protected());
         rjU_2 var15 = var7 == 1.0F ? var1.id_class(var5.id_throws(), var5.id_protected(), var7) : var1.id_break(var7);
         List var16 = rxm_3.id_catch(var2);

         for (int var17 = 0; var17 < var16.size(); var17++) {
            rdn_3 var18 = (rdn_3)var16.get(var17);
            if (!var18.id_class()) {
               if (var18.id_break() == rdy_3.dc) {
                  var8 = var9;
                  var13 = 0.0F;
               }

               switch (var17) {
                  case 0:
                     var10 = id_protected[41];
                     break;
                  case 1:
                     var10 = id_protected[42];
                     break;
                  case 2:
                     var10 = id_protected[43];
               }

               rjY_2 var19 = new rjY_2(new rje_3(var14), var10, true);
               rje_3 var20 = new rje_3(var15);
               var20.id_class(var19);
               rjU_2 var21 = id_class(var1, (double)var11, (double)var12, (double)var20.id_catch, (double)var20.id_private, (double)var20.id_implements);
               this.id_class(var1, var2, aI_2.id_byte, var3, var13, 0.6F, var8, var21, var7);
            }
         }
      }
   }

   private void id_class(Ml_1 var1, double var2, double var4, double var6, double var8, double var10, double var12, int var14) {
      rjV_2 var15 = var1.id_byte().id_class();
      id_strictfp.id_class(var15, (float)var2, (float)var4, (float)var6).id_class(var14).id_class();
      id_strictfp.id_class(var15, (float)var8, (float)var10, (float)var12).id_class(var14).id_class();
   }

   public static rjU_2 id_class(iB_2 var0, double var1, double var3, double var5, double var7, double var9) {
      Random var11 = var0.Sa();
      return new rjU_2(var5, var7, var9)
         .id_protected()
         .id_break(var11.nextGaussian() * 0.0075F * var3, var11.nextGaussian() * 0.0075F * var3, var11.nextGaussian() * 0.0075F * var3)
         .id_class(var1);
   }

   private void id_class(cb_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, float var6) {
      rjU_2 var7 = var4.id_class(0.0, 0.1F, 0.0);
      float var8 = var1.id_this(var6);
      float var9 = (float)var2.id_break().id_break(var2) - var8;
      float var10 = var1.sR() ? rxQ_2.id_class(var9) : id_protected[50];
      float var11 = var10 * 3.0F;
      float var12 = 0.0F;
      float var13 = 0.05F;
      rjU_2 var14 = id_class(var1, (double)var11, (double)var12, 0.0F, var5);
      this.id_class(var1, var2, aI_2.id_byte, var3, var13, 0.6F, var7, var14, var6);
   }

   private void id_class(an_3 var1, float var2, float var3) {
      this.id_super();
      if (((gm_3)id_import.id_class[56]).a_(var1, var1.rN())) {
         rjU_2 var4 = var1.rv();
         double var5 = var1.rx();
         double var7 = var1.re();
         double var9 = var1.BO();
         double var11 = var4.id_break;
         double var13 = var4.id_byte;
         double var15 = var4.id_protected;
         byte var18 = 45;
         boolean var19 = false;

         for (int var20 = 0; var20 < 360; var20++) {
            rjU_2 var21 = new rjU_2(var5, var7, var9);
            var5 += var11;
            var7 += var13;
            var9 += var15;
            float var22 = 0.99F;
            if (var3 != var22 && ((gm_3)id_import.id_class[56]).id_byte(new rfH_2(var5, var7, var9)).id_break() == xu_3.id_try) {
               var22 = var3;
            }

            var11 *= (double)var22;
            var13 *= (double)var22;
            var15 *= (double)var22;
            if (!var1.rw()) {
               var13 -= (double)var2;
            }

            rjU_2 var23 = new rjU_2(var5, var7, var9);
            if (!((gm_3)id_import.id_class[56]).id_throws((int)var23.id_break >> 4, (int)var23.id_protected >> 4).id_finally()) {
               break;
            }

            rff_3 var24 = ((gm_3)id_import.id_class[56]).id_class(new rjB_2(var21, var23, rjS_2.COLLIDER, rjs_3.NONE, var1));
            int var17 = Math.max(0, 255 - (255 - var20 * var18));
            if (var24.id_byte() == rjM_2.BLOCK) {
               rjU_2 var25 = var24.id_case();
               var5 = var25.id_break;
               var7 = var25.id_byte;
               var9 = var25.id_protected;
               var19 = true;
            }

            rrHz_1 var26 = new rrHz_1(
               var1, var1.BC(), var5, var7, var9, var21.id_break, var21.id_byte, var21.id_protected, ColorHelper.id_class((float)(var20 * 10), var17)
            );
            ((List)this.id_break[14]).add(var26);
            if (var19) {
               break;
            }
         }
      }
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_super();
      if (!((List)this.id_break[17]).isEmpty()) {
         ((List)this.id_break[17]).clear();
      }

      if (!((List)this.id_break[14]).isEmpty()) {
         ((List)this.id_break[14]).clear();
      }

      if (!((List)this.id_break[15]).isEmpty()) {
         ((List)this.id_break[15]).clear();
      }

      if (!((List)this.id_break[16]).isEmpty()) {
         ((List)this.id_break[16]).clear();
      }

      float var2 = var1.id_byte();
      rjU_2 var3 = (rjU_2)rrfa_3.id_class[0];
      if (!((cb_3)id_import.id_class[57]).id_native()) {
         PX var4 = ((cb_3)id_import.id_class[57]).id_switch();
         Pair var5 = (Pair)this.id_break[18];
         if (var5 != null) {
            rdn_3 var6 = (rdn_3)var5.getLeft();
            if (var6.id_break() == rdy_3.kY) {
               this.id_byte((cb_3)id_import.id_class[57], var6, (List<rrHz_1>)this.id_break[15], var3, var4, var2);
            } else if (var6.id_break() == rdy_3.kU) {
               this.id_class((cb_3)id_import.id_class[57], var6, (List<rrHz_1>)this.id_break[15], var3, var4, rxm_3.id_protected(var6), var2);
            } else if (var6.id_break() == rdy_3.OM) {
               this.id_class((cb_3)id_import.id_class[57], var6, (List<rrHz_1>)this.id_break[15], var3, var4, var2);
            } else if (var6.id_break() == rdy_3.Jm) {
               this.id_class((rhd_3)((cb_3)id_import.id_class[57]), var6, (List<rrHz_1>)this.id_break[15], var3, var4, var2);
            } else if (var6.id_break() instanceof rkk_3) {
               this.id_break((cb_3)id_import.id_class[57], var6, (List<rrHz_1>)this.id_break[15], var3, var4, var2);
            }
         }
      }

      ObjectIterator var23 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet().iterator();

      while (var23.hasNext()) {
         Entry var25 = (Entry)var23.next();
         an_3 var27 = (an_3)var25.getValue();
         if (!var27.BL() && !var27.Ps().equals(var27.Pt())) {
            if (((rrIk_1)this.id_break[0]).id_class() && var27 instanceof rSi_1 var7) {
               this.id_class(var27, var7.id_throws(), 0.8F);
            } else if (((rrIk_1)this.id_break[2]).id_class() && var27 instanceof rhD_2) {
               rhD_2 var8 = (rhD_2)var27;
               if (var8.id_private <= 0) {
                  this.id_class(var27, 0.05F, var8.id_int());
               }
            } else if (((rrIk_1)this.id_break[1]).id_class() && var27 instanceof rhm_3 var9) {
               this.id_class(var27, 0.05F, var9.id_int());
            } else if (((rrIk_1)this.id_break[3]).id_class() && var27 instanceof rhI_2 var10) {
               this.id_class(var27, var10.id_throws(), 0.8F);
            } else if (((rrIk_1)this.id_break[4]).id_class() && var27.BC() == aI_2.id_short && !var27.PZ()) {
               this.id_class(var27, 0.04F, 0.8F);
            }
         }
      }

      if (!((List)this.id_break[14]).isEmpty() || !((List)this.id_break[15]).isEmpty()) {
         Ml_1 var24 = var1.id_class();
         var24.id_class();
         double var26 = id_void.id_case();
         double var28 = id_void.id_catch();
         double var29 = id_void.id_private();
         GL11.glEnable(2848);
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableLighting();
         RenderSystem.depthMask(false);
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(1.0F);
         id_strictfp.id_class(1, ju_3.id_this);

         for (rrHz_1 var12 : (List)this.id_break[14]) {
            float var13 = (float)((Double)var12.id_class[3] - var26);
            float var14 = (float)((Double)var12.id_class[4] - var28);
            float var15 = (float)((Double)var12.id_class[5] - var29);
            float var16 = (float)((Double)var12.id_class[6] - var26);
            float var17 = (float)((Double)var12.id_class[7] - var28);
            float var18 = (float)((Double)var12.id_class[8] - var29);
            int var19 = (Integer)var12.id_class[9];
            this.id_class(var24, (double)var16, (double)var17, (double)var18, (double)var13, (double)var14, (double)var15, var19);
         }

         id_default.id_break();
         RenderSystem.lineWidth(1.5F);
         id_strictfp.id_class(1, ju_3.id_this);

         for (rrHz_1 var32 : (List)this.id_break[15]) {
            List var34 = var32.id_protected();
            if (var34 != null && !var34.isEmpty()) {
               for (rjG_2 var38 : var34) {
                  if (var38 instanceof rfo_3 var40) {
                     rpr_3 var44 = var40.id_break();
                     float var47 = (float)((Double)var32.id_class[3] - var26);
                     float var20 = (float)((Double)var32.id_class[4] - var28);
                     float var21 = (float)((Double)var32.id_class[5] - var29);
                     this.id_class(var24, var47, var20, var21, 0.3F, var44, Color.RED.getRGB(), 64);
                  } else if (var38 instanceof rff_3) {
                     rff_3 var42 = (rff_3)var38;
                     rpr_3 var45 = var42.id_break();
                     float var48 = (float)((Double)var32.id_class[3] - var26);
                     float var50 = (float)((Double)var32.id_class[4] - var28);
                     float var51 = (float)((Double)var32.id_class[5] - var29);
                     int var22 = Color.GREEN.getRGB();
                     if (var32.id_catch() == aI_2.V && !((List)this.id_break[17]).isEmpty()) {
                        var22 = Color.RED.getRGB();
                     }

                     this.id_class(var24, var48, var50, var51, 0.3F, var45, var22, 64);
                  }
               }
            }
         }

         for (rrHz_1 var33 : (List)this.id_break[15]) {
            if (!(var3.id_protected((Double)var33.id_class[6], (Double)var33.id_class[7], (Double)var33.id_class[8]) < 0.1F)) {
               float var35 = (float)((Double)var33.id_class[3] - var26);
               float var37 = (float)((Double)var33.id_class[4] - var28);
               float var39 = (float)((Double)var33.id_class[5] - var29);
               float var41 = (float)((Double)var33.id_class[6] - var26);
               float var43 = (float)((Double)var33.id_class[7] - var28);
               float var46 = (float)((Double)var33.id_class[8] - var29);
               int var49 = (Integer)var33.id_class[9];
               this.id_class(var24, (double)var41, (double)var43, (double)var46, (double)var35, (double)var37, (double)var39, var49);
            }
         }

         id_default.id_break();
         GL11.glDisable(2848);
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.enableAlphaTest();
         rrfa_3.id_class();
         var24.id_break();
      }
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, rpr_3 var6, int var7, int var8) {
      double[][] var9 = new double[var8][3];

      for (int var10 = 0; var10 < var8; var10++) {
         float var11 = (float)var10 * 0.09817477F;
         double var12 = (double)(var2 + var5 * rfU_2.id_break(var11));
         double var14 = (double)(var4 + var5 * rfU_2.id_class(var11));
         switch (((int[])rrHW.id_class[0])[var6.id_final().ordinal()]) {
            case 1:
               var9[var10][0] = var12;
               var9[var10][1] = (double)var3;
               var9[var10][2] = var14;
               break;
            case 2:
               var9[var10][0] = (double)var2;
               var9[var10][1] = (double)(var3 + var5 * rfU_2.id_break(var11));
               var9[var10][2] = var14;
               break;
            case 3:
               var9[var10][0] = var12;
               var9[var10][1] = (double)(var3 + var5 * rfU_2.id_class(var11));
               var9[var10][2] = (double)var4;
         }
      }

      for (int var16 = id_implements[63]; var16 < var8; var16++) {
         double[] var17 = var9[var16];
         double[] var18 = var9[(var16 + 1) % var8];
         this.id_class(var1, var17[0], var17[1], var17[2], var18[0], var18[1], var18[2], var7);
      }

      switch (((int[])rrHW.id_class[0])[var6.id_final().ordinal()]) {
         case 1:
            this.id_class(var1, (double)(var2 - var5), (double)var3, (double)var4, (double)(var2 + var5), (double)var3, (double)var4, var7);
            this.id_class(var1, (double)var2, (double)var3, (double)(var4 - var5), (double)var2, (double)var3, (double)(var4 + var5), var7);
            break;
         case 2:
            this.id_class(var1, (double)var2, (double)(var3 - var5), (double)var4, (double)var2, (double)(var3 + var5), (double)var4, var7);
            this.id_class(var1, (double)var2, (double)var3, (double)(var4 - var5), (double)var2, (double)var3, (double)(var4 + var5), var7);
            break;
         case 3:
            this.id_class(var1, (double)(var2 - var5), (double)var3, (double)var4, (double)(var2 + var5), (double)var3, (double)var4, var7);
            this.id_class(var1, (double)var2, (double)(var3 - var5), (double)var4, (double)var2, (double)(var3 + var5), (double)var4, var7);
      }
   }

   @EventTarget
   public void id_class(rrAA var1) {
      this.id_super();
      if ((Boolean)this.id_break[19] && var1.id_class().id_class().id_byte() && var1.id_break() == rdy_3.kU) {
         Boolean var6 = false;
         this.id_break[19] = var6;
      }
   }

   private static rjU_2 id_class(iB_2 var0, double var1, double var3, float var5, PX var6) {
      float var7 = var6.id_throws();
      float var8 = var6.id_protected();
      float var9 = -rfU_2.id_class(var7 * rfU_2.id_throws) * rfU_2.id_break(var8 * rfU_2.id_throws);
      float var10 = -rfU_2.id_class((var8 + var5) * rfU_2.id_throws);
      float var11 = rfU_2.id_break(var7 * rfU_2.id_throws) * rfU_2.id_break(var8 * rfU_2.id_throws);
      return id_class(var0, var1, var3, (double)var9, (double)var10, (double)var11);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -148516184;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1713329549761202422L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((cb_3)id_import.id_class[57]).id_native()) {
            return;
         }

         rjU_2 var2 = ((cb_3)id_import.id_class[57]).id_new(1.0F);
         float var3 = 1.0F;
         if (!((Qw_1)id_import.id_class[20]).u.id_protected()) {
            Boolean var15 = false;
            this.id_break[19] = var15;
         }

         if (!((List)this.id_break[17]).isEmpty()) {
            Integer var16 = (Integer)this.id_break[20] + 1;
            this.id_break[20] = var16;
         } else {
            Integer var17 = 0;
            this.id_break[20] = var17;
         }

         if ((Integer)this.id_break[20] > 0 && (Integer)this.id_break[20] % 5 == 0) {
            id_import.c().id_class(Np_1.id_class(rqn_3.SB, 2.0F, 0.1F));
         }

         PX var4 = ((cb_3)id_import.id_class[57]).z();
         Object var18 = null;
         this.id_break[18] = var18;
         List var5 = List.of(
            var0 -> var0.id_break() == rdy_3.kY ? true : id_implements[92],
            var0 -> var0.id_break() == rdy_3.kU ? true : id_implements[90],
            var0 -> var0.id_break() == rdy_3.OM ? true : id_implements[88],
            var0 -> var0.id_break() == rdy_3.Jm ? true : id_implements[86],
            var0 -> var0.id_break() instanceof rkk_3
         );
         Pair var6 = null;

         for (Predicate var8 : var5) {
            Pair var9 = rrfH_2.id_class((cb_3)id_import.id_class[57], var8);
            if (var9 != null) {
               rdn_3 var10 = (rdn_3)var9.getLeft();
               if (var10.equals(((cb_3)id_import.id_class[57]).ss())) {
                  this.id_break[18] = var9;
                  break;
               }

               if (var6 == null) {
                  var6 = var9;
               }
            }
         }

         if ((Pair)this.id_break[18] == null) {
            this.id_break[18] = var6;
         }

         if ((Pair)this.id_break[18] != null) {
            rdn_3 var21 = (rdn_3)((Pair)this.id_break[18]).getLeft();
            rpm_3 var22 = (rpm_3)((Pair)this.id_break[18]).getRight();
            if (var21.id_break() == rdy_3.kY) {
               this.id_byte((cb_3)id_import.id_class[57], var21, (List<rrHz_1>)this.id_break[16], var2, var4, var3);
               if (((rrIk_1)this.id_break[5]).id_class()) {
                  this.id_byte(var21);
               }
            } else if (var21.id_break() == rdy_3.kU) {
               boolean var23 = rxm_3.id_protected(var21);
               this.id_class((cb_3)id_import.id_class[57], var21, (List<rrHz_1>)this.id_break[16], var2, var4, var23, var3);
               if (((rrIk_1)this.id_break[8]).id_class()) {
                  this.id_catch(var21);
               }

               if (var23 && ((rrIk_1)this.id_break[7]).id_class()) {
                  this.id_class(var21, var22);
               }
            } else if (var21.id_break() == rdy_3.OM) {
               this.id_class((cb_3)id_import.id_class[57], var21, (List<rrHz_1>)this.id_break[16], var2, var4, var3);
               if (((rrIk_1)this.id_break[10]).id_class()) {
                  this.id_case(var21);
               }
            } else if (var21.id_break() == rdy_3.Jm) {
               this.id_class((rhd_3)((cb_3)id_import.id_class[57]), var21, (List<rrHz_1>)this.id_break[16], var2, var4, var3);
            } else if (var21.id_break() instanceof rkk_3) {
               this.id_break((cb_3)id_import.id_class[57], var21, (List<rrHz_1>)this.id_break[16], var2, var4, var3);
            }
         }
      }
   }

   private void id_class(rhd_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, float var6) {
      rjU_2 var7 = var4.id_class(0.0, 0.1F, 0.0);
      float var8 = 1.5F;
      float var9 = 0.0F;
      float var10 = 0.03F;
      rjU_2 var11 = id_class(var1, (double)var8, (double)var9, 0.0F, var5);
      this.id_class(var1, var2, aI_2.f, var3, var10, 0.8F, var7, var11, var6);
   }

   @EventTarget
   public void id_class(rrAY var1) {
      this.id_super();
      if ((Boolean)this.id_break[19] && var1.id_break().id_break() == rdy_3.kU) {
         var1.id_class(true);
         id_import.id_class(0);
      }
   }

   private void id_class(an_3 var1, rdn_3 var2, aI_2<?> var3, List<rrHz_1> var4, float var5, float var6, rjU_2 var7, rjU_2 var8, float var9) {
      this.id_super();
      float var10 = ((rrIm_1)this.id_break[13]).id_byte();
      int var11 = rrZF.d_;
      boolean var12 = false;
      double var13 = var7.id_break;
      double var15 = var7.id_byte;
      double var17 = var7.id_protected;
      double var19 = var8.id_break;
      double var21 = var8.id_byte;
      double var23 = var8.id_protected;
      rdb_3 var25 = var2.id_break();
      if (var25 == rdy_3.OM
         || var25 == rdy_3.Jm
         || var25 == rdy_3.kY
         || var25 == rdy_3.hU
         || var25 == rdy_3.xe
         || var25 == rdy_3.XJ
         || var25 == rdy_3.kQ
         || var25 == rdy_3.kk) {
         rjU_2 var26 = var1.BX();
         rjU_2 var27 = var1.rv();
         if (!var1.BL()) {
            var21 += var9 == 1.0F ? var27.id_byte : rfU_2.id_protected((double)var9, var26.id_byte, var27.id_byte);
         }
      }

      for (int var56 = id_implements[47]; var56 < 360; var56++) {
         rjU_2 var57 = new rjU_2(var13, var15, var17);
         var13 += var19;
         var15 += var21;
         var17 += var23;
         float var28 = 0.99F;
         if (var6 != var28 && ((gm_3)id_import.id_class[56]).id_byte(new rfH_2(var13, var15, var17)).id_break() == xu_3.id_try) {
            var28 = var6;
         }

         var19 *= (double)var28;
         var21 *= (double)var28;
         var23 *= (double)var28;
         if (!var1.rw()) {
            var21 -= (double)var5;
         }

         rjU_2 var29 = new rjU_2(var13, var15, var17);
         if (!((gm_3)id_import.id_class[56]).id_throws((int)var29.id_break >> 4, (int)var29.id_protected >> 4).id_finally()) {
            break;
         }

         rjG_2 var30 = Ph_1.id_class(var57, var29, rjS_2.COLLIDER, true);
         ap_3 var31 = var3.id_volatile();
         rfl_3 var32 = var31.id_class(var29);
         double var33 = var32.id_class();
         double var35 = var33 + var33 * 0.5;
         double var37 = var57.id_case(var29);
         int var39 = (int)Math.ceil(var37 / var35);
         rfo_3 var40 = null;

         for (int var41 = 0; var41 < var39; var41++) {
            double var42 = (double)var41 / (double)var39;
            double var44 = var57.id_break + var42 * (var29.id_break - var57.id_break);
            double var46 = var57.id_byte + var42 * (var29.id_byte - var57.id_byte);
            double var48 = var57.id_protected + var42 * (var29.id_protected - var57.id_protected);
            rfl_3 var50 = var31.id_class(new rjU_2(var44, var46, var48));
            rfo_3 var51 = rhj_3.id_class(
               (gm_3)id_import.id_class[56],
               iB_2.class,
               var57,
               var29,
               var50.id_class(1.0),
               var1x -> var1x != var1 && rpJ_2.id_private.test(var1x) ? true : id_implements[72],
               var10
            );
            if (var51 != null && Ph_1.id_class(var57, var51.id_case(), rjS_2.COLLIDER, true).id_byte() == rjM_2.MISS) {
               var40 = var51;
               break;
            }
         }

         if (var40 != null) {
            rjU_2 var58 = var40.id_case();
            var13 = var58.id_break;
            var15 = var58.id_byte;
            var17 = var58.id_protected;
            var12 = true;
         } else if (var30.id_byte() == rjM_2.BLOCK) {
            rjU_2 var59 = var30.id_case();
            var13 = var59.id_break;
            var15 = var59.id_byte;
            var17 = var59.id_protected;
            var12 = true;
         }

         rrHz_1 var60 = new rrHz_1(var1, var3, var13, var15, var17, var57.id_break, var57.id_byte, var57.id_protected, var11);
         var4.add(var60);
         if (var12) {
            ArrayList var61 = new ArrayList();
            if (var40 != null) {
               var61.add(var40);

               for (rjG_2 var63 : var61) {
                  if (var63 instanceof rfo_3 var45) {
                     ((List)this.id_break[17]).add(var45.id_class());
                  }
               }
            } else if (var30.id_byte() == rjM_2.BLOCK) {
               var61.add(var30);
            }

            if (var3 == aI_2.V) {
               List var62 = rAB.id_class(var2);
               rfl_3 var64 = var32.id_byte(4.0, 2.0, 4.0);
               List var65 = ((gm_3)id_import.id_class[56])
                  .id_class(iB_2.class, var64, var1x -> var1x != var1 && rpJ_2.id_catch.test(var1x) ? true : id_implements[70]);
               if (!var65.isEmpty()) {
                  for (iB_2 var47 : var65) {
                     if (var47.SL()) {
                        double var67 = var60.id_class(var47);
                        if (var67 < 16.0) {
                           double var68 = 1.0 - Math.sqrt(var67) / 4.0;
                           if (((List)this.id_break[17]).contains(var47)) {
                              var68 = 1.0;
                           }

                           for (rLY var53 : var62) {
                              rLR var54 = var53.id_class();
                              if (var54.id_class()) {
                                 ((List)this.id_break[17]).add(var47);
                                 break;
                              }

                              int var55 = (int)(var68 * (double)var53.id_break() + 0.5);
                              if (var55 > 20) {
                                 ((List)this.id_break[17]).add(var47);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var60.id_class(var61);
            break;
         }
      }
   }

   private void id_class(rdn_3 var1, rpm_3 var2) {
      this.id_super();
      if (!((cb_3)id_import.id_class[57]).sK().id_class(var1.id_break())) {
         boolean var3 = ((List)this.id_break[16])
            .stream()
            .anyMatch(
               var0 -> {
                  if (var0.id_catch() != aI_2.id_byte) {
                     return false;
                  } else {
                     List var1x = var0.id_protected();
                     if (var1x == null) {
                        return false;
                     } else {
                        for (rjG_2 var3x : var1x) {
                           if (var3x instanceof rfo_3 var4
                              && var4.id_class() instanceof cM_2 var5
                              && rrff_3.id_class((cG_2)var5)
                              && (Integer)var5.id_private[10] == 0) {
                              return true;
                           }
                        }

                        return id_implements[80];
                     }
                  }
               }
            );
         if (var3) {
            ((Ax_1)id_import.id_class[55]).id_class(var2);
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, 84, -9, 38, 74, -22, -127, 5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break(rhd_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, float var6) {
      rjU_2 var7 = var4.id_class(0.0, 0.1F, 0.0);
      float var8 = 0.5F;
      float var9 = 0.0F;
      float var10 = 0.05F;
      rjU_2 var11 = id_class(var1, (double)var8, (double)var9, -20.0F, var5);
      this.id_class(var1, var2, aI_2.V, var3, var10, 0.8F, var7, var11, var6);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      ((List)this.id_break[14]).clear();
      ((List)this.id_break[15]).clear();
      ((List)this.id_break[16]).clear();
      ((List)this.id_break[17]).clear();
      Boolean var6 = false;
      this.id_break[19] = var6;
   }

   private void id_catch(rdn_3 var1) {
      this.id_super();
      if (((cb_3)id_import.id_class[57]).sj()) {
         int var2 = var1.id_break().id_break(var1) - ((cb_3)id_import.id_class[57]).SH();
         float var3 = rxm_3.id_class(var2, var1);
         if (var3 >= 1.0F) {
            ((Ax_1)id_import.id_class[55]).id_break((cb_3)id_import.id_class[57]);
            Boolean var8 = true;
            this.id_break[19] = var8;
         }
      }
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{64, 2.0F, 3.689349E19F};
      id_byte = var0;
   }

   private void id_case(rdn_3 var1) {
      this.id_super();
      if (((cb_3)id_import.id_class[57]).sR() && !((cb_3)id_import.id_class[57]).sK().id_class(var1.id_break())) {
         int var2 = var1.id_break().id_break(var1) - ((cb_3)id_import.id_class[57]).SH();
         float var3 = rxQ_2.id_class(var2);
         if (var3 >= ((rrIm_1)this.id_break[11]).id_byte()) {
            boolean var4 = ((List)this.id_break[16]).stream().anyMatch(var0 -> {
               if (var0.id_catch() != aI_2.id_byte) {
                  return false;
               } else {
                  List var1x = var0.id_protected();
                  if (var1x == null) {
                     return false;
                  } else {
                     for (rjG_2 var3x : var1x) {
                        if (var3x instanceof rfo_3 var4x && var4x.id_class() instanceof cM_2 var5 && rrff_3.id_class((cG_2)var5)) {
                           return true;
                        }
                     }

                     return id_implements[76];
                  }
               }
            });
            if (var4) {
               ((Ax_1)id_import.id_class[55]).id_package();
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
            }
         }
      }
   }

   private static void id_continue() {
      id_throws = new short[]{
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         17,
         17,
         14,
         14,
         15,
         15,
         16,
         16,
         0,
         57,
         57,
         18,
         57,
         15,
         57,
         15,
         57,
         15,
         57,
         15,
         57,
         15,
         56,
         0,
         2,
         1,
         3,
         4,
         14,
         15,
         2848,
         14,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         15,
         3,
         4,
         5,
         3,
         4,
         5,
         17,
         15,
         6,
         7,
         8,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         2848,
         0,
         57,
         57,
         20,
         19,
         17,
         20,
         20,
         20,
         20,
         20,
         57,
         18,
         57,
         57,
         18,
         18,
         18,
         18,
         18,
         18,
         57,
         16,
         5,
         57,
         16,
         8,
         7,
         57,
         16,
         10,
         57,
         16,
         57,
         16,
         0,
         57,
         6,
         57,
         9,
         57,
         12,
         57,
         19,
         14,
         15,
         16,
         17,
         19,
         57,
         57,
         57,
         16,
         55,
         57,
         0,
         57,
         16,
         55,
         57,
         57,
         57,
         11,
         16,
         55,
         57,
         0,
         19,
         19,
         19,
         57,
         57,
         55,
         57,
         19,
         56,
         360,
         56,
         56,
         56,
         255,
         255,
         14,
         13,
         360,
         56,
         56,
         56,
         17,
         56,
         17,
         17,
         17,
         0,
         0,
         10
      };
   }

   private static void id_else() {
      id_implements = new boolean[]{
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true
      };
   }

   private static void id_new() {
      id_catch = new double[]{
         0.1F,
         0.5,
         1.0,
         4.0,
         2.0,
         4.0,
         16.0,
         1.0,
         4.0,
         1.0,
         0.5,
         0.0,
         0.1F,
         0.0,
         0.0,
         0.1F,
         0.0,
         0.0,
         0.15F,
         0.0,
         0.0,
         0.1F,
         0.0,
         0.0,
         0.1F,
         0.0,
         0.0,
         0.1F,
         0.0,
         0.0075F,
         0.0075F,
         0.0075F
      };
   }

   private static void id_return() {
      id_protected = new float[]{
         0.5F,
         0.1F,
         1.0F,
         0.1F,
         0.3F,
         -0.2F,
         0.3F,
         0.01F,
         0.8F,
         0.05F,
         0.05F,
         0.8F,
         0.04F,
         0.8F,
         1.0F,
         1.5F,
         0.3F,
         0.3F,
         1.0F,
         1.0F,
         2.0F,
         0.1F,
         1.0F,
         0.1F,
         1.0F,
         0.99F,
         1.0F,
         0.99F,
         2.5F,
         0.5F,
         0.0F,
         0.05F,
         0.0F,
         0.99F,
         0.0F,
         1.6F,
         3.15F,
         0.0F,
         0.05F,
         1.0F,
         0.0F,
         0.0F,
         -10.0F,
         10.0F,
         0.6F,
         0.5F,
         0.0F,
         0.05F,
         -20.0F,
         0.8F,
         1.0F,
         3.0F,
         0.0F,
         0.05F,
         0.0F,
         0.6F,
         1.5F,
         0.0F,
         0.03F,
         0.0F,
         0.8F,
         0.09817477F,
         0.3F,
         0.09817477F
      };
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[21];
         this.id_break[19] = false;
         this.id_break[20] = 0;
      }
   }

   private static void id_public() {
      id_private = new byte[]{5, 5, 2, 3, 4, 2, 2, 3, 2, 3, 3, 2, 4, 64, 64, 5, 10, 10, 45, 4, 4, 10, 4, 4, 20, 3, 2, 2, 2, 2, 2, 21, 19, 20, 3, 64, 2};
   }
}
