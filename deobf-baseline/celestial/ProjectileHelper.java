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
      if (var2.id_catch() < var2.id_private() - id_implements[53]) {
         int var7 = eA_2.id_catch(var2);
         if (var7 <= 0) {
            rjU_2 var8 = var4.id_class(id_catch[11], id_catch[12], id_catch[13]);
            int var9 = eA_2.id_catch(var2);
            float var10 = id_protected[28] + (float)var9 * id_protected[29];
            float var11 = id_protected[30];
            float var12 = id_protected[31];
            rjU_2 var13 = id_class(var1, (double)var10, (double)var11, id_protected[32], var5);
            this.id_class(var1, var2, aI_2.g, var3, var12, id_protected[33], var8, var13, var6);
         }
      }
   }

   private void id_byte(rdn_3 var1) {
      this.id_super();
      if (((cb_3)id_import.id_class[id_throws[142]]).sF()) {
         int var2 = var1.id_break().id_break(var1) - ((cb_3)id_import.id_class[id_throws[143]]).SH();
         if (var2 >= id_private[17] && !((cb_3)id_import.id_class[id_throws[144]]).sK().id_class(var1.id_break())) {
            boolean var3 = ((List)this.id_break[id_throws[145]]).stream().anyMatch(var0 -> {
               if (var0.id_catch() != aI_2.g) {
                  return id_implements[81];
               } else {
                  List var1x = var0.id_protected();
                  if (var1x == null) {
                     return id_implements[82];
                  } else {
                     for (rjG_2 var3x : var1x) {
                        if (var3x instanceof rfo_3 var4 && var4.id_class() instanceof cM_2 var5 && rrff_3.id_class((cG_2)var5)) {
                           return id_implements[83];
                        }
                     }

                     return id_implements[84];
                  }
               }
            });
            if (var3) {
               ((Ax_1)id_import.id_class[id_throws[146]]).id_package();
               ((Aq_1)((cb_3)id_import.id_class[id_throws[147]]).id_break[id_throws[148]])
                  .id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
            }
         }
      }
   }

   public ProjectileHelper() {
      super(id_finally[0], id_finally[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_super();
      rrIk_1 var5 = new rrIk_1(id_finally[2], id_implements[0]);
      this.id_break[id_throws[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_finally[3], id_implements[1]);
      this.id_break[id_throws[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_finally[4], id_implements[2]);
      this.id_break[id_throws[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_finally[5], id_implements[3]);
      this.id_break[id_throws[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_finally[6], id_implements[4]);
      this.id_break[id_throws[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_finally[7], id_implements[5]);
      this.id_break[id_throws[6]] = var10;
      rrIk_1 var11 = new rrIk_1(id_finally[8], id_implements[6]);
      this.id_break[id_throws[7]] = var11;
      rrIk_1 var12 = new rrIk_1(id_finally[9], id_implements[7]);
      this.id_break[id_throws[8]] = var12;
      rrIk_1 var13 = new rrIk_1(id_finally[10], id_implements[8]);
      this.id_break[id_throws[9]] = var13;
      rrIk_1 var14 = new rrIk_1(id_finally[11], id_implements[9]);
      this.id_break[id_throws[10]] = var14;
      rrIk_1 var15 = new rrIk_1(id_finally[12], id_implements[10]);
      this.id_break[id_throws[11]] = var15;
      rrIm_1 var16 = new rrIm_1(id_finally[13], id_protected[0], id_protected[1], id_protected[2], id_protected[3])
         .id_class(((rrIk_1)this.id_break[id_throws[12]])::id_class);
      this.id_break[id_throws[13]] = var16;
      rrIk_1 var17 = new rrIk_1(id_finally[14], id_implements[11]);
      this.id_break[id_throws[14]] = var17;
      rrIm_1 var18 = new rrIm_1(id_finally[15], id_protected[4], id_protected[5], id_protected[6], id_protected[7]).id_finally();
      this.id_break[id_throws[15]] = var18;
      ArrayList var19 = new ArrayList();
      this.id_break[id_throws[16]] = var19;
      ArrayList var20 = new ArrayList();
      this.id_break[id_throws[17]] = var20;
      ArrayList var21 = new ArrayList();
      this.id_break[id_throws[18]] = var21;
      ArrayList var22 = new ArrayList();
      this.id_break[id_throws[19]] = var22;
      Setting[] var10001 = new Setting[id_private[0]];
      byte var10003 = id_implements[12];
      String var10006 = id_finally[16];
      Setting[] var10007 = new Setting[id_implements[13]];
      byte var10009 = id_implements[14];
      String var10012 = id_finally[17];
      rrIk_1[] var10013 = new rrIk_1[id_private[1]];
      var10013[id_implements[15]] = (rrIk_1)this.id_break[id_throws[20]];
      var10013[id_implements[16]] = (rrIk_1)this.id_break[id_throws[21]];
      var10013[id_private[2]] = (rrIk_1)this.id_break[id_throws[22]];
      var10013[id_private[3]] = (rrIk_1)this.id_break[id_throws[23]];
      var10013[id_private[4]] = (rrIk_1)this.id_break[id_throws[24]];
      var10007[var10009] = new rrIc_1(var10012, var10013);
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_implements[17];
      var10006 = id_finally[18];
      var10007 = new Setting[id_private[5]];
      var10007[id_implements[18]] = (rrIk_1)this.id_break[id_throws[25]];
      var10007[id_implements[19]] = (rrIk_1)this.id_break[id_throws[26]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[6];
      var10006 = id_finally[19];
      var10007 = new Setting[id_private[7]];
      var10007[id_implements[20]] = (rrIk_1)this.id_break[id_throws[27]];
      var10007[id_implements[21]] = (rrIk_1)this.id_break[id_throws[28]];
      var10007[id_private[8]] = (rrIk_1)this.id_break[id_throws[29]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[9];
      var10006 = id_finally[20];
      var10007 = new Setting[id_private[10]];
      var10007[id_implements[22]] = (rrIk_1)this.id_break[id_throws[30]];
      var10007[id_implements[23]] = (rrIm_1)this.id_break[id_throws[31]];
      var10007[id_private[11]] = (rrIk_1)this.id_break[id_throws[32]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_private[12];
      var10006 = id_finally[21];
      var10007 = new Setting[id_implements[24]];
      var10007[id_implements[25]] = (rrIm_1)this.id_break[id_throws[33]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
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
      Boolean var6 = id_implements[36];
      this.id_break[id_throws[136]] = var6;
   }

   @EventTarget
   public void id_class(rrAC var1) {
      this.id_super();
      if (var1.id_break() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[128]]) {
         rdn_3 var2 = var1.id_protected();
         rdb_3 var3 = var2.id_break();
         int var4 = var3.id_break(var2) - ((cb_3)id_import.id_class[id_throws[129]]).SH();
         if (((rrIk_1)this.id_break[id_throws[130]]).id_class() && var3 == rdy_3.kY) {
            if (var4 < id_private[16] && !((cb_3)id_import.id_class[id_throws[131]]).sK().id_class(var3)) {
               var1.id_class(id_implements[33]);
            }
         } else if (((rrIk_1)this.id_break[id_throws[132]]).id_class() && var3 == rdy_3.kU) {
            if (rxm_3.id_class(var4, var2) < id_protected[22] && !rxm_3.id_protected(var2) && !((cb_3)id_import.id_class[id_throws[133]]).sK().id_class(var3)) {
               var1.id_class(id_implements[34]);
            }
         } else if (((rrIk_1)this.id_break[id_throws[134]]).id_class() && var3 == rdy_3.OM) {
            float var5 = rxQ_2.id_class(var4);
            if (var5 < id_protected[23] && !((cb_3)id_import.id_class[id_throws[135]]).sK().id_class(var3)) {
               var1.id_class(id_implements[35]);
            }
         }
      }
   }

   private void id_class(rhd_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, boolean var6, float var7) {
      if (var6) {
         rjU_2 var8 = var4.id_class(id_catch[14], id_catch[15], id_catch[16]);
         rjU_2 var9 = var4.id_class(id_catch[17], id_catch[18], id_catch[19]);
         float var10 = id_protected[34];
         float var11 = rxm_3.id_class(var2, rdy_3.dc) ? id_protected[35] : id_protected[36];
         float var12 = id_protected[37];
         float var13 = id_protected[38];
         rjU_2 var14 = var1.id_protected(var5.id_throws(), var5.id_protected());
         rjU_2 var15 = var7 == id_protected[39] ? var1.id_class(var5.id_throws(), var5.id_protected(), var7) : var1.id_break(var7);
         List var16 = rxm_3.id_catch(var2);

         for (int var17 = id_implements[54]; var17 < var16.size(); var17++) {
            rdn_3 var18 = (rdn_3)var16.get(var17);
            if (!var18.id_class()) {
               if (var18.id_break() == rdy_3.dc) {
                  var8 = var9;
                  var13 = id_protected[40];
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

               rjY_2 var19 = new rjY_2(new rje_3(var14), var10, id_implements[55]);
               rje_3 var20 = new rje_3(var15);
               var20.id_class(var19);
               rjU_2 var21 = id_class(var1, (double)var11, (double)var12, (double)var20.id_catch, (double)var20.id_private, (double)var20.id_implements);
               this.id_class(var1, var2, aI_2.id_byte, var3, var13, id_protected[44], var8, var21, var7);
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
         .id_break(var11.nextGaussian() * id_catch[29] * var3, var11.nextGaussian() * id_catch[30] * var3, var11.nextGaussian() * id_catch[31] * var3)
         .id_class(var1);
   }

   private void id_class(cb_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, float var6) {
      rjU_2 var7 = var4.id_class(id_catch[23], id_catch[24], id_catch[25]);
      float var8 = var1.id_this(var6);
      float var9 = (float)var2.id_break().id_break(var2) - var8;
      float var10 = var1.sR() ? rxQ_2.id_class(var9) : id_protected[50];
      float var11 = var10 * id_protected[51];
      float var12 = id_protected[52];
      float var13 = id_protected[53];
      rjU_2 var14 = id_class(var1, (double)var11, (double)var12, id_protected[54], var5);
      this.id_class(var1, var2, aI_2.id_byte, var3, var13, id_protected[55], var7, var14, var6);
   }

   private void id_class(an_3 var1, float var2, float var3) {
      this.id_super();
      if (((gm_3)id_import.id_class[id_throws[168]]).a_(var1, var1.rN())) {
         rjU_2 var4 = var1.rv();
         double var5 = var1.rx();
         double var7 = var1.re();
         double var9 = var1.BO();
         double var11 = var4.id_break;
         double var13 = var4.id_byte;
         double var15 = var4.id_protected;
         byte var18 = id_private[18];
         boolean var19 = id_implements[42];

         for (int var20 = id_implements[43]; var20 < id_throws[169]; var20++) {
            rjU_2 var21 = new rjU_2(var5, var7, var9);
            var5 += var11;
            var7 += var13;
            var9 += var15;
            float var22 = id_protected[25];
            if (var3 != var22 && ((gm_3)id_import.id_class[id_throws[170]]).id_byte(new rfH_2(var5, var7, var9)).id_break() == xu_3.id_try) {
               var22 = var3;
            }

            var11 *= (double)var22;
            var13 *= (double)var22;
            var15 *= (double)var22;
            if (!var1.rw()) {
               var13 -= (double)var2;
            }

            rjU_2 var23 = new rjU_2(var5, var7, var9);
            if (!((gm_3)id_import.id_class[id_throws[171]])
               .id_throws((int)var23.id_break >> id_private[19], (int)var23.id_protected >> id_private[20])
               .id_finally()) {
               break;
            }

            rff_3 var24 = ((gm_3)id_import.id_class[id_throws[172]]).id_class(new rjB_2(var21, var23, rjS_2.COLLIDER, rjs_3.NONE, var1));
            int var17 = Math.max(id_implements[44], id_throws[173] - (id_throws[174] - var20 * var18));
            if (var24.id_byte() == rjM_2.BLOCK) {
               rjU_2 var25 = var24.id_case();
               var5 = var25.id_break;
               var7 = var25.id_byte;
               var9 = var25.id_protected;
               var19 = id_implements[45];
            }

            rrHz_1 var26 = new rrHz_1(
               var1,
               var1.BC(),
               var5,
               var7,
               var9,
               var21.id_break,
               var21.id_byte,
               var21.id_protected,
               ColorHelper.id_class((float)(var20 * id_private[21]), var17)
            );
            ((List)this.id_break[id_throws[175]]).add(var26);
            if (var19) {
               break;
            }
         }
      }
   }

   @EventTarget
   public void id_class(RenderEvent var1) {
      this.id_super();
      if (!((List)this.id_break[id_throws[34]]).isEmpty()) {
         ((List)this.id_break[id_throws[35]]).clear();
      }

      if (!((List)this.id_break[id_throws[36]]).isEmpty()) {
         ((List)this.id_break[id_throws[37]]).clear();
      }

      if (!((List)this.id_break[id_throws[38]]).isEmpty()) {
         ((List)this.id_break[id_throws[39]]).clear();
      }

      if (!((List)this.id_break[id_throws[40]]).isEmpty()) {
         ((List)this.id_break[id_throws[41]]).clear();
      }

      float var2 = var1.id_byte();
      rjU_2 var3 = (rjU_2)rrfa_3.id_class[id_throws[42]];
      if (!((cb_3)id_import.id_class[id_throws[43]]).id_native()) {
         PX var4 = ((cb_3)id_import.id_class[id_throws[44]]).id_switch();
         Pair var5 = (Pair)this.id_break[id_throws[45]];
         if (var5 != null) {
            rdn_3 var6 = (rdn_3)var5.getLeft();
            if (var6.id_break() == rdy_3.kY) {
               this.id_byte((cb_3)id_import.id_class[id_throws[46]], var6, (List<rrHz_1>)this.id_break[id_throws[47]], var3, var4, var2);
            } else if (var6.id_break() == rdy_3.kU) {
               this.id_class(
                  (cb_3)id_import.id_class[id_throws[48]], var6, (List<rrHz_1>)this.id_break[id_throws[49]], var3, var4, rxm_3.id_protected(var6), var2
               );
            } else if (var6.id_break() == rdy_3.OM) {
               this.id_class((cb_3)id_import.id_class[id_throws[50]], var6, (List<rrHz_1>)this.id_break[id_throws[51]], var3, var4, var2);
            } else if (var6.id_break() == rdy_3.Jm) {
               this.id_class((rhd_3)((cb_3)id_import.id_class[id_throws[52]]), var6, (List<rrHz_1>)this.id_break[id_throws[53]], var3, var4, var2);
            } else if (var6.id_break() instanceof rkk_3) {
               this.id_break((cb_3)id_import.id_class[id_throws[54]], var6, (List<rrHz_1>)this.id_break[id_throws[55]], var3, var4, var2);
            }
         }
      }

      ObjectIterator var23 = ((gm_3)id_import.id_class[id_throws[56]]).id_return().int2ObjectEntrySet().iterator();

      while (var23.hasNext()) {
         Entry var25 = (Entry)var23.next();
         an_3 var27 = (an_3)var25.getValue();
         if (!var27.BL() && !var27.Ps().equals(var27.Pt())) {
            if (((rrIk_1)this.id_break[id_throws[57]]).id_class() && var27 instanceof rSi_1 var7) {
               this.id_class(var27, var7.id_throws(), id_protected[8]);
            } else if (((rrIk_1)this.id_break[id_throws[58]]).id_class() && var27 instanceof rhD_2) {
               rhD_2 var8 = (rhD_2)var27;
               if (var8.id_private <= 0) {
                  this.id_class(var27, id_protected[9], var8.id_int());
               }
            } else if (((rrIk_1)this.id_break[id_throws[59]]).id_class() && var27 instanceof rhm_3 var9) {
               this.id_class(var27, id_protected[10], var9.id_int());
            } else if (((rrIk_1)this.id_break[id_throws[60]]).id_class() && var27 instanceof rhI_2 var10) {
               this.id_class(var27, var10.id_throws(), id_protected[11]);
            } else if (((rrIk_1)this.id_break[id_throws[61]]).id_class() && var27.BC() == aI_2.id_short && !var27.PZ()) {
               this.id_class(var27, id_protected[12], id_protected[13]);
            }
         }
      }

      if (!((List)this.id_break[id_throws[62]]).isEmpty() || !((List)this.id_break[id_throws[63]]).isEmpty()) {
         Ml_1 var24 = var1.id_class();
         var24.id_class();
         double var26 = id_void.id_case();
         double var28 = id_void.id_catch();
         double var29 = id_void.id_private();
         GL11.glEnable(id_throws[64]);
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableLighting();
         RenderSystem.depthMask(id_implements[26]);
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(id_protected[14]);
         id_strictfp.id_class(id_implements[27], ju_3.id_this);

         for (rrHz_1 var12 : (List)this.id_break[id_throws[65]]) {
            float var13 = (float)((Double)var12.id_class[id_throws[66]] - var26);
            float var14 = (float)((Double)var12.id_class[id_throws[67]] - var28);
            float var15 = (float)((Double)var12.id_class[id_throws[68]] - var29);
            float var16 = (float)((Double)var12.id_class[id_throws[69]] - var26);
            float var17 = (float)((Double)var12.id_class[id_throws[70]] - var28);
            float var18 = (float)((Double)var12.id_class[id_throws[71]] - var29);
            int var19 = (Integer)var12.id_class[id_throws[72]];
            this.id_class(var24, (double)var16, (double)var17, (double)var18, (double)var13, (double)var14, (double)var15, var19);
         }

         id_default.id_break();
         RenderSystem.lineWidth(id_protected[15]);
         id_strictfp.id_class(id_implements[28], ju_3.id_this);

         for (rrHz_1 var32 : (List)this.id_break[id_throws[73]]) {
            List var34 = var32.id_protected();
            if (var34 != null && !var34.isEmpty()) {
               for (rjG_2 var38 : var34) {
                  if (var38 instanceof rfo_3 var40) {
                     rpr_3 var44 = var40.id_break();
                     float var47 = (float)((Double)var32.id_class[id_throws[74]] - var26);
                     float var20 = (float)((Double)var32.id_class[id_throws[75]] - var28);
                     float var21 = (float)((Double)var32.id_class[id_throws[76]] - var29);
                     this.id_class(var24, var47, var20, var21, id_protected[16], var44, Color.RED.getRGB(), id_private[13]);
                  } else if (var38 instanceof rff_3) {
                     rff_3 var42 = (rff_3)var38;
                     rpr_3 var45 = var42.id_break();
                     float var48 = (float)((Double)var32.id_class[id_throws[77]] - var26);
                     float var50 = (float)((Double)var32.id_class[id_throws[78]] - var28);
                     float var51 = (float)((Double)var32.id_class[id_throws[79]] - var29);
                     int var22 = Color.GREEN.getRGB();
                     if (var32.id_catch() == aI_2.V && !((List)this.id_break[id_throws[80]]).isEmpty()) {
                        var22 = Color.RED.getRGB();
                     }

                     this.id_class(var24, var48, var50, var51, id_protected[17], var45, var22, id_private[14]);
                  }
               }
            }
         }

         for (rrHz_1 var33 : (List)this.id_break[id_throws[81]]) {
            if (!(
               var3.id_protected((Double)var33.id_class[id_throws[82]], (Double)var33.id_class[id_throws[83]], (Double)var33.id_class[id_throws[84]])
                  < id_catch[0]
            )) {
               float var35 = (float)((Double)var33.id_class[id_throws[85]] - var26);
               float var37 = (float)((Double)var33.id_class[id_throws[86]] - var28);
               float var39 = (float)((Double)var33.id_class[id_throws[87]] - var29);
               float var41 = (float)((Double)var33.id_class[id_throws[88]] - var26);
               float var43 = (float)((Double)var33.id_class[id_throws[89]] - var28);
               float var46 = (float)((Double)var33.id_class[id_throws[90]] - var29);
               int var49 = (Integer)var33.id_class[id_throws[91]];
               this.id_class(var24, (double)var41, (double)var43, (double)var46, (double)var35, (double)var37, (double)var39, var49);
            }
         }

         id_default.id_break();
         GL11.glDisable(id_throws[92]);
         RenderSystem.disableBlend();
         RenderSystem.depthMask(id_implements[29]);
         RenderSystem.enableTexture();
         RenderSystem.enableAlphaTest();
         rrfa_3.id_class();
         var24.id_break();
      }
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, rpr_3 var6, int var7, int var8) {
      double[][] var9 = new double[var8][id_private[25]];

      for (int var10 = id_implements[56]; var10 < var8; var10++) {
         float var11 = (float)var10 * id_protected[61];
         double var12 = (double)(var2 + var5 * rfU_2.id_break(var11));
         double var14 = (double)(var4 + var5 * rfU_2.id_class(var11));
         switch (((int[])rrHW.id_class[id_throws[186]])[var6.id_final().ordinal()]) {
            case 1:
               var9[var10][id_implements[57]] = var12;
               var9[var10][id_implements[58]] = (double)var3;
               var9[var10][id_private[26]] = var14;
               break;
            case 2:
               var9[var10][id_implements[59]] = (double)var2;
               var9[var10][id_implements[60]] = (double)(var3 + var5 * rfU_2.id_break(var11));
               var9[var10][id_private[27]] = var14;
               break;
            case 3:
               var9[var10][id_implements[61]] = var12;
               var9[var10][id_implements[62]] = (double)(var3 + var5 * rfU_2.id_class(var11));
               var9[var10][id_private[28]] = (double)var4;
         }
      }

      for (int var16 = id_implements[63]; var16 < var8; var16++) {
         double[] var17 = var9[var16];
         double[] var18 = var9[(var16 + id_implements[64]) % var8];
         this.id_class(
            var1,
            var17[id_implements[65]],
            var17[id_implements[66]],
            var17[id_private[29]],
            var18[id_implements[67]],
            var18[id_implements[68]],
            var18[id_private[30]],
            var7
         );
      }

      switch (((int[])rrHW.id_class[id_throws[187]])[var6.id_final().ordinal()]) {
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
      if ((Boolean)this.id_break[id_throws[161]] && var1.id_class().id_class().id_byte() && var1.id_break() == rdy_3.kU) {
         Boolean var6 = id_implements[40];
         this.id_break[id_throws[162]] = var6;
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
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[93]]) {
         if (((cb_3)id_import.id_class[id_throws[94]]).id_native()) {
            return;
         }

         rjU_2 var2 = ((cb_3)id_import.id_class[id_throws[95]]).id_new(id_protected[18]);
         float var3 = id_protected[19];
         if (!((Qw_1)id_import.id_class[id_throws[96]]).u.id_protected()) {
            Boolean var15 = id_implements[30];
            this.id_break[id_throws[97]] = var15;
         }

         if (!((List)this.id_break[id_throws[98]]).isEmpty()) {
            Integer var16 = (Integer)this.id_break[id_throws[99]] + id_implements[31];
            this.id_break[id_throws[100]] = var16;
         } else {
            Integer var17 = Integer.valueOf(id_implements[32]);
            this.id_break[id_throws[101]] = var17;
         }

         if ((Integer)this.id_break[id_throws[102]] > 0 && (Integer)this.id_break[id_throws[103]] % id_private[15] == 0) {
            id_import.c().id_class(Np_1.id_class(rqn_3.SB, id_protected[20], id_protected[21]));
         }

         PX var4 = ((cb_3)id_import.id_class[id_throws[104]]).z();
         Object var18 = null;
         this.id_break[id_throws[105]] = var18;
         List var5 = List.of(
            var0 -> var0.id_break() == rdy_3.kY ? id_implements[91] : id_implements[92],
            var0 -> var0.id_break() == rdy_3.kU ? id_implements[89] : id_implements[90],
            var0 -> var0.id_break() == rdy_3.OM ? id_implements[87] : id_implements[88],
            var0 -> var0.id_break() == rdy_3.Jm ? id_implements[85] : id_implements[86],
            var0 -> var0.id_break() instanceof rkk_3
         );
         Pair var6 = null;

         for (Predicate var8 : var5) {
            Pair var9 = rrfH_2.id_class((cb_3)id_import.id_class[id_throws[106]], var8);
            if (var9 != null) {
               rdn_3 var10 = (rdn_3)var9.getLeft();
               if (var10.equals(((cb_3)id_import.id_class[id_throws[107]]).ss())) {
                  this.id_break[id_throws[108]] = var9;
                  break;
               }

               if (var6 == null) {
                  var6 = var9;
               }
            }
         }

         if ((Pair)this.id_break[id_throws[109]] == null) {
            this.id_break[id_throws[110]] = var6;
         }

         if ((Pair)this.id_break[id_throws[111]] != null) {
            rdn_3 var21 = (rdn_3)((Pair)this.id_break[id_throws[112]]).getLeft();
            rpm_3 var22 = (rpm_3)((Pair)this.id_break[id_throws[113]]).getRight();
            if (var21.id_break() == rdy_3.kY) {
               this.id_byte((cb_3)id_import.id_class[id_throws[114]], var21, (List<rrHz_1>)this.id_break[id_throws[115]], var2, var4, var3);
               if (((rrIk_1)this.id_break[id_throws[116]]).id_class()) {
                  this.id_byte(var21);
               }
            } else if (var21.id_break() == rdy_3.kU) {
               boolean var23 = rxm_3.id_protected(var21);
               this.id_class((cb_3)id_import.id_class[id_throws[117]], var21, (List<rrHz_1>)this.id_break[id_throws[118]], var2, var4, var23, var3);
               if (((rrIk_1)this.id_break[id_throws[119]]).id_class()) {
                  this.id_catch(var21);
               }

               if (var23 && ((rrIk_1)this.id_break[id_throws[120]]).id_class()) {
                  this.id_class(var21, var22);
               }
            } else if (var21.id_break() == rdy_3.OM) {
               this.id_class((cb_3)id_import.id_class[id_throws[121]], var21, (List<rrHz_1>)this.id_break[id_throws[122]], var2, var4, var3);
               if (((rrIk_1)this.id_break[id_throws[123]]).id_class()) {
                  this.id_case(var21);
               }
            } else if (var21.id_break() == rdy_3.Jm) {
               this.id_class((rhd_3)((cb_3)id_import.id_class[id_throws[124]]), var21, (List<rrHz_1>)this.id_break[id_throws[125]], var2, var4, var3);
            } else if (var21.id_break() instanceof rkk_3) {
               this.id_break((cb_3)id_import.id_class[id_throws[126]], var21, (List<rrHz_1>)this.id_break[id_throws[127]], var2, var4, var3);
            }
         }
      }
   }

   private void id_class(rhd_3 var1, rdn_3 var2, List<rrHz_1> var3, rjU_2 var4, PX var5, float var6) {
      rjU_2 var7 = var4.id_class(id_catch[26], id_catch[27], id_catch[28]);
      float var8 = id_protected[56];
      float var9 = id_protected[57];
      float var10 = id_protected[58];
      rjU_2 var11 = id_class(var1, (double)var8, (double)var9, id_protected[59], var5);
      this.id_class(var1, var2, aI_2.f, var3, var10, id_protected[60], var7, var11, var6);
   }

   @EventTarget
   public void id_class(rrAY var1) {
      this.id_super();
      if ((Boolean)this.id_break[id_throws[160]] && var1.id_break().id_break() == rdy_3.kU) {
         var1.id_class(id_implements[38]);
         id_import.id_class(id_implements[39]);
      }
   }

   private void id_class(an_3 var1, rdn_3 var2, aI_2<?> var3, List<rrHz_1> var4, float var5, float var6, rjU_2 var7, rjU_2 var8, float var9) {
      this.id_super();
      float var10 = ((rrIm_1)this.id_break[id_throws[176]]).id_byte();
      int var11 = rrZF.d_;
      boolean var12 = id_implements[46];
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
            var21 += var9 == id_protected[26] ? var27.id_byte : rfU_2.id_protected((double)var9, var26.id_byte, var27.id_byte);
         }
      }

      for (int var56 = id_implements[47]; var56 < id_throws[177]; var56++) {
         rjU_2 var57 = new rjU_2(var13, var15, var17);
         var13 += var19;
         var15 += var21;
         var17 += var23;
         float var28 = id_protected[27];
         if (var6 != var28 && ((gm_3)id_import.id_class[id_throws[178]]).id_byte(new rfH_2(var13, var15, var17)).id_break() == xu_3.id_try) {
            var28 = var6;
         }

         var19 *= (double)var28;
         var21 *= (double)var28;
         var23 *= (double)var28;
         if (!var1.rw()) {
            var21 -= (double)var5;
         }

         rjU_2 var29 = new rjU_2(var13, var15, var17);
         if (!((gm_3)id_import.id_class[id_throws[179]])
            .id_throws((int)var29.id_break >> id_private[22], (int)var29.id_protected >> id_private[23])
            .id_finally()) {
            break;
         }

         rjG_2 var30 = Ph_1.id_class(var57, var29, rjS_2.COLLIDER, id_implements[48]);
         ap_3 var31 = var3.id_volatile();
         rfl_3 var32 = var31.id_class(var29);
         double var33 = var32.id_class();
         double var35 = var33 + var33 * id_catch[1];
         double var37 = var57.id_case(var29);
         int var39 = (int)Math.ceil(var37 / var35);
         rfo_3 var40 = null;

         for (int var41 = id_implements[49]; var41 < var39; var41++) {
            double var42 = (double)var41 / (double)var39;
            double var44 = var57.id_break + var42 * (var29.id_break - var57.id_break);
            double var46 = var57.id_byte + var42 * (var29.id_byte - var57.id_byte);
            double var48 = var57.id_protected + var42 * (var29.id_protected - var57.id_protected);
            rfl_3 var50 = var31.id_class(new rjU_2(var44, var46, var48));
            rfo_3 var51 = rhj_3.id_class(
               (gm_3)id_import.id_class[id_throws[180]],
               iB_2.class,
               var57,
               var29,
               var50.id_class(id_catch[2]),
               var1x -> var1x != var1 && rpJ_2.id_private.test(var1x) ? id_implements[71] : id_implements[72],
               var10
            );
            if (var51 != null && Ph_1.id_class(var57, var51.id_case(), rjS_2.COLLIDER, id_implements[50]).id_byte() == rjM_2.MISS) {
               var40 = var51;
               break;
            }
         }

         if (var40 != null) {
            rjU_2 var58 = var40.id_case();
            var13 = var58.id_break;
            var15 = var58.id_byte;
            var17 = var58.id_protected;
            var12 = id_implements[51];
         } else if (var30.id_byte() == rjM_2.BLOCK) {
            rjU_2 var59 = var30.id_case();
            var13 = var59.id_break;
            var15 = var59.id_byte;
            var17 = var59.id_protected;
            var12 = id_implements[52];
         }

         rrHz_1 var60 = new rrHz_1(var1, var3, var13, var15, var17, var57.id_break, var57.id_byte, var57.id_protected, var11);
         var4.add(var60);
         if (var12) {
            ArrayList var61 = new ArrayList();
            if (var40 != null) {
               var61.add(var40);

               for (rjG_2 var63 : var61) {
                  if (var63 instanceof rfo_3 var45) {
                     ((List)this.id_break[id_throws[181]]).add(var45.id_class());
                  }
               }
            } else if (var30.id_byte() == rjM_2.BLOCK) {
               var61.add(var30);
            }

            if (var3 == aI_2.V) {
               List var62 = rAB.id_class(var2);
               rfl_3 var64 = var32.id_byte(id_catch[3], id_catch[4], id_catch[5]);
               List var65 = ((gm_3)id_import.id_class[id_throws[182]])
                  .id_class(iB_2.class, var64, var1x -> var1x != var1 && rpJ_2.id_catch.test(var1x) ? id_implements[69] : id_implements[70]);
               if (!var65.isEmpty()) {
                  for (iB_2 var47 : var65) {
                     if (var47.SL()) {
                        double var67 = var60.id_class(var47);
                        if (var67 < id_catch[6]) {
                           double var68 = id_catch[7] - Math.sqrt(var67) / id_catch[8];
                           if (((List)this.id_break[id_throws[183]]).contains(var47)) {
                              var68 = id_catch[9];
                           }

                           for (rLY var53 : var62) {
                              rLR var54 = var53.id_class();
                              if (var54.id_class()) {
                                 ((List)this.id_break[id_throws[184]]).add(var47);
                                 break;
                              }

                              int var55 = (int)(var68 * (double)var53.id_break() + id_catch[10]);
                              if (var55 > id_private[24]) {
                                 ((List)this.id_break[id_throws[185]]).add(var47);
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
      if (!((cb_3)id_import.id_class[id_throws[149]]).sK().id_class(var1.id_break())) {
         boolean var3 = ((List)this.id_break[id_throws[150]])
            .stream()
            .anyMatch(
               var0 -> {
                  if (var0.id_catch() != aI_2.id_byte) {
                     return id_implements[77];
                  } else {
                     List var1x = var0.id_protected();
                     if (var1x == null) {
                        return id_implements[78];
                     } else {
                        for (rjG_2 var3x : var1x) {
                           if (var3x instanceof rfo_3 var4
                              && var4.id_class() instanceof cM_2 var5
                              && rrff_3.id_class((cG_2)var5)
                              && (Integer)var5.id_private[id_throws[188]] == 0) {
                              return id_implements[79];
                           }
                        }

                        return id_implements[80];
                     }
                  }
               }
            );
         if (var3) {
            ((Ax_1)id_import.id_class[id_throws[151]]).id_class(var2);
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
      rjU_2 var7 = var4.id_class(id_catch[20], id_catch[21], id_catch[22]);
      float var8 = id_protected[45];
      float var9 = id_protected[46];
      float var10 = id_protected[47];
      rjU_2 var11 = id_class(var1, (double)var8, (double)var9, id_protected[48], var5);
      this.id_class(var1, var2, aI_2.V, var3, var10, id_protected[49], var7, var11, var6);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      ((List)this.id_break[id_throws[137]]).clear();
      ((List)this.id_break[id_throws[138]]).clear();
      ((List)this.id_break[id_throws[139]]).clear();
      ((List)this.id_break[id_throws[140]]).clear();
      Boolean var6 = id_implements[37];
      this.id_break[id_throws[141]] = var6;
   }

   private void id_catch(rdn_3 var1) {
      this.id_super();
      if (((cb_3)id_import.id_class[id_throws[163]]).sj()) {
         int var2 = var1.id_break().id_break(var1) - ((cb_3)id_import.id_class[id_throws[164]]).SH();
         float var3 = rxm_3.id_class(var2, var1);
         if (var3 >= id_protected[24]) {
            ((Ax_1)id_import.id_class[id_throws[165]]).id_break((cb_3)id_import.id_class[id_throws[166]]);
            Boolean var8 = id_implements[41];
            this.id_break[id_throws[167]] = var8;
         }
      }
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{64, 2.0F, 3.689349E19F};
      id_byte = var0;
   }

   private void id_case(rdn_3 var1) {
      this.id_super();
      if (((cb_3)id_import.id_class[id_throws[152]]).sR() && !((cb_3)id_import.id_class[id_throws[153]]).sK().id_class(var1.id_break())) {
         int var2 = var1.id_break().id_break(var1) - ((cb_3)id_import.id_class[id_throws[154]]).SH();
         float var3 = rxQ_2.id_class(var2);
         if (var3 >= ((rrIm_1)this.id_break[id_throws[155]]).id_byte()) {
            boolean var4 = ((List)this.id_break[id_throws[156]]).stream().anyMatch(var0 -> {
               if (var0.id_catch() != aI_2.id_byte) {
                  return id_implements[73];
               } else {
                  List var1x = var0.id_protected();
                  if (var1x == null) {
                     return id_implements[74];
                  } else {
                     for (rjG_2 var3x : var1x) {
                        if (var3x instanceof rfo_3 var4x && var4x.id_class() instanceof cM_2 var5 && rrff_3.id_class((cG_2)var5)) {
                           return id_implements[75];
                        }
                     }

                     return id_implements[76];
                  }
               }
            });
            if (var4) {
               ((Ax_1)id_import.id_class[id_throws[157]]).id_package();
               ((Aq_1)((cb_3)id_import.id_class[id_throws[158]]).id_break[id_throws[159]])
                  .id_class(new rZb_1(rZM.RELEASE_USE_ITEM, rfH_2.id_protected, rpr_3.DOWN));
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
