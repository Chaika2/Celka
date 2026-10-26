package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Nuker extends Module implements rrnF_2 {
   public Object[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;
   private static byte[] id_catch;
   private static float[] id_private;

   public Nuker() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_return();
      rrIk_1 var5 = new rrIk_1(id_protected[2], id_throws[0]);
      this.id_break[id_byte[1]] = var5;
      rrIm_1 var6 = new rrIm_1(id_protected[3], id_private[0], id_private[1], id_private[2], id_private[3]);
      this.id_break[id_byte[2]] = var6;
      rrIm_1 var7 = new rrIm_1(id_protected[4], id_private[4], id_private[5], id_private[6], id_private[7]);
      this.id_break[id_byte[3]] = var7;
      rrIm_1 var8 = new rrIm_1(id_protected[5], id_private[8], id_private[9], id_private[10], id_private[11]).id_class(() -> {
         this.id_return();
         return !((rrIk_1)this.id_break[id_byte[77]]).id_class() ? id_throws[28] : id_throws[29];
      });
      this.id_break[id_byte[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[6], id_throws[1]);
      this.id_break[id_byte[5]] = var9;
      rrTT var10 = new rrTT(this);
      this.id_break[id_byte[6]] = var10;
      ArrayList var11 = new ArrayList();
      this.id_break[id_byte[7]] = var11;
      rrfw_3 var12 = new rrfw_3();
      this.id_break[id_byte[8]] = var12;
      Setting[] var10001 = new Setting[id_catch[0]];
      var10001[id_throws[2]] = (rrIk_1)this.id_break[id_byte[9]];
      var10001[id_throws[3]] = (rrIm_1)this.id_break[id_byte[10]];
      var10001[id_catch[1]] = (rrIm_1)this.id_break[id_byte[11]];
      var10001[id_catch[2]] = (rrIm_1)this.id_break[id_byte[12]];
      var10001[id_catch[3]] = (rrIk_1)this.id_break[id_byte[13]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private List<rrHJ> id_class(Ps_1 var1, rrHM var2, rfl_3 var3, int var4, int var5, boolean var6) {
      ArrayList var7 = new ArrayList();
      roE_2 var8 = ((gm_3)id_import.id_class[id_byte[59]]).id_instanceof();
      rfH_2 var9 = ((cb_3)id_import.id_class[id_byte[60]]).Bs();
      switch (((int[])rrHb_1.id_class[id_byte[61]])[var2.ordinal()]) {
         case 1:
            for (int var15 = -var4; var15 <= var4; var15++) {
               for (int var17 = id_throws[16]; var17 <= var5; var17++) {
                  for (int var19 = -var4; var19 <= var4; var19++) {
                     rfH_2 var21 = var9.id_break(var15, var17, var19);
                     this.id_class(var1, var7, var21, var8, var3, var6);
                  }
               }
            }
            break;
         case 2:
            for (int var14 = -var4; var14 <= var4; var14++) {
               for (int var16 = id_catch[4]; var16 <= var5 + id_throws[17]; var16++) {
                  for (int var18 = -var4; var18 <= var4; var18++) {
                     rfH_2 var20 = var9.id_break(var14, var16, var18);
                     this.id_class(var1, var7, var20, var8, var3, var6);
                  }
               }
            }
            break;
         case 3:
            for (int var10 = -var4; var10 <= var4; var10++) {
               for (int var11 = -var5; var11 <= id_catch[5]; var11++) {
                  for (int var12 = -var4; var12 <= var4; var12++) {
                     rfH_2 var13 = var9.id_break(var10, var11, var12);
                     this.id_class(var1, var7, var13, var8, var3, var6);
                  }
               }
            }
      }

      return var7;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 404698366;
   }

   @EventTarget
   public void id_class(rrLp_1 var1) {
      this.id_return();
      rfH_2 var2 = var1.id_class();
      rrLq_1 var3 = var1.id_case();
      if (var3 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_byte[45]]) {
         for (rrHJ var5 : (List)this.id_break[id_byte[46]]) {
            if (var5.id_break().equals(var2)) {
               ((List)this.id_break[id_byte[47]]).remove(var5);
               break;
            }
         }
      }
   }

   private rrHM id_class(double var1) {
      return (rrHM)rrHM.staticFields6335874c02e73489a27afe393d14ab7b[id_byte[69]];
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[14]]) {
         ((rrTT)this.id_break[id_byte[15]]).id_final();
         if (((Ax_1)id_import.id_class[id_byte[16]]).id_native() == rRl_1.ADVENTURE) {
            ((List)this.id_break[id_byte[17]]).clear();
            Object var22 = null;
            this.id_break[id_byte[18]] = var22;
            return;
         }

         Ps_1 var2 = C_throws.id_byte().id_throw();
         rrHM var3 = this.id_class((double)((cb_3)id_import.id_class[id_byte[19]]).id_goto().id_protected());
         boolean var4 = ((rrIk_1)this.id_break[id_byte[20]]).id_class();
         int var5 = ((rrIm_1)this.id_break[id_byte[21]]).id_byte().intValue();
         int var6 = ((rrIm_1)this.id_break[id_byte[22]]).id_byte().intValue();
         boolean var7 = !var4 ? id_throws[4] : id_throws[5];
         Object var23 = null;
         this.id_break[id_byte[23]] = var23;
         rfl_3 var8 = this.id_public();
         List var9 = this.id_class(var2, var3, var8, var5, var6, var7);
         if (var9.isEmpty()) {
            ((List)this.id_break[id_byte[24]]).clear();
            return;
         }

         for (rrHJ var11 : var9) {
            if (!((List)this.id_break[id_byte[25]]).contains(var11)) {
               ((List)this.id_break[id_byte[26]]).add(var11);
            }
         }

         ((List)this.id_break[id_byte[27]]).removeIf(var1x -> !var9.contains(var1x) ? id_throws[26] : id_throws[27]);
         if (((List)this.id_break[id_byte[28]]).isEmpty()) {
            return;
         }

         ArrayList var25 = new ArrayList();
         if (var8 != null) {
            var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[id_byte[29]]);
         }

         var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[id_byte[30]]);
         var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[id_byte[31]]);
         ((List)this.id_break[id_byte[32]]).sort(new rrHO(var25));
         rrHJ var26 = (rrHJ)((List)this.id_break[id_byte[33]]).get(id_throws[6]);
         rfH_2 var12 = var26.id_break();
         xc_3 var13 = var26.id_byte().id_continue();
         this.id_break[id_byte[34]] = var26;
         if (((gm_3)id_import.id_class[id_byte[35]]).id_finally(var12)) {
            return;
         }

         if (var4) {
            Optional var14 = PJ.id_class(var2, var12);
            var14.ifPresent(var1x -> {
               this.id_return();
               rjG_2 var2x = var1x.id_break();
               PX var3x = var1x.id_class();
               if (var2x instanceof rff_3 var4x) {
                  rfH_2 var5x = var4x.id_class();
                  xc_3 var6x = ((gm_3)id_import.id_class[id_byte[74]]).id_byte(var5x);
                  if (!var6x.id_catch()) {
                     ((rrTT)this.id_break[id_byte[75]]).id_class((rrTg_1)() -> var3x, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_byte[76]]);
                     this.id_break(var5x, var6x);
                     this.id_class(var4x);
                     this.id_class(var5x, var6x);
                  }
               }
            });
         } else {
            this.id_break(var12, var13);
            boolean var28 = !((Ax_1)id_import.id_class[id_byte[36]]).id_native().id_throws()
                  && var13.id_class((cb_3)id_import.id_class[id_byte[37]], (rYB)((cb_3)id_import.id_class[id_byte[38]]).id_throws[id_byte[39]], var12)
                     < id_private[12]
               ? id_throws[7]
               : id_throws[8];
            if (var28) {
               rff_3 var29 = new rff_3(rjU_2.id_class, rpr_3.UP, var12, id_throws[9]);
               this.id_class(var29);
            } else if (((rrfw_3)this.id_break[id_byte[40]]).id_class((double)((rrIm_1)this.id_break[id_byte[41]]).id_byte().floatValue())) {
               int var16 = var9.size();

               for (int var17 = id_throws[10]; var17 < var16 && !((List)this.id_break[id_byte[42]]).isEmpty(); var17++) {
                  var26 = (rrHJ)((List)this.id_break[id_byte[43]]).remove(id_throws[11]);
                  rff_3 var15 = new rff_3(rjU_2.id_class, rpr_3.UP, var26.id_break(), id_throws[12]);
                  this.id_class(var15);
               }

               ((rrfw_3)this.id_break[id_byte[44]]).id_class();
            }

            this.id_class(var12, var13);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1118477945353729122L;
   }

   private void id_class(rfH_2 var1, xc_3 var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[57]])
         .id_finally()
         .id_class(rrLH.id_class(var1, var2, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_byte[58]]));
   }

   private boolean id_class(xd_3 var1, xc_3 var2, rfH_2 var3) {
      if (var1 instanceof kX_2) {
         return id_throws[18];
      } else if (var2.id_private((gm_3)id_import.id_class[id_byte[66]], var3) < id_private[13]) {
         return id_throws[19];
      } else if (var2.id_finally((gm_3)id_import.id_class[id_byte[67]], var3).id_break()) {
         return id_throws[20];
      } else {
         return var2.id_class((gm_3)id_import.id_class[id_byte[68]], var3, rLT.LAND) ? id_throws[21] : id_throws[22];
      }
   }

   private void id_class(rff_3 var1) {
      this.id_return();
      if (((Ax_1)id_import.id_class[id_byte[52]])
         .id_break(var1.id_class(), var1.id_break(), !((rrIk_1)this.id_break[id_byte[53]]).id_class() ? id_throws[13] : id_throws[14])) {
         ((cb_3)id_import.id_class[id_byte[54]]).id_class(rpm_3.MAIN_HAND, id_throws[15]);
      }
   }

   private void id_class(Ps_1 var1, List<rrHJ> var2, rfH_2 var3, roE_2 var4, rfl_3 var5, boolean var6) {
      if (var4.id_class(var3)) {
         if (var5 == null || var5.id_break(var3)) {
            xd_3 var7 = rrjc_3.id_protected(var3);
            if (((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[id_byte[62]]).id_byte().isEmpty()
               || ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[id_byte[63]]).id_class(var7)) {
               xc_3 var8 = var7.id_continue();
               if (this.id_class(var7, var8, var3)) {
                  if (!(((cb_3)id_import.id_class[id_byte[64]]).id_break(var3) > (double)((Ax_1)id_import.id_class[id_byte[65]]).id_byte())) {
                     Optional var9 = PJ.id_class(var1, var3, var2x -> {
                        if (!var6) {
                           return id_throws[23];
                        } else {
                           return var2x.id_break() == var7 ? id_throws[24] : id_throws[25];
                        }
                     });
                     if (!var9.isEmpty()) {
                        var2.add(new rrHJ(var7, var8, var3));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public float id_break() {
      return id_private[14];
   }

   private void id_break(rfH_2 var1, xc_3 var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[55]])
         .id_finally()
         .id_class(rrLH.id_class(var1, var2, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_byte[56]]));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 73, -10, 74, 25, -114, -45, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      ((rrTT)this.id_break[id_byte[48]]).id_final();
      ((List)this.id_break[id_byte[49]]).clear();
      Object var6 = null;
      this.id_break[id_byte[50]] = var6;
      ((rrfw_3)this.id_break[id_byte[51]]).id_class();
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_byte[73]];
   }

   private static void id_goto() {
      id_byte = new short[]{
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         0,
         1,
         2,
         3,
         4,
         0,
         5,
         55,
         6,
         8,
         57,
         0,
         1,
         2,
         8,
         6,
         6,
         6,
         6,
         6,
         0,
         1,
         2,
         6,
         6,
         8,
         56,
         55,
         57,
         57,
         7,
         7,
         3,
         6,
         6,
         7,
         2,
         6,
         6,
         5,
         6,
         8,
         7,
         55,
         4,
         57,
         0,
         0,
         0,
         1,
         56,
         57,
         0,
         0,
         0,
         57,
         55,
         56,
         56,
         56,
         0,
         1,
         2,
         1,
         0,
         56,
         5,
         0,
         0
      };
   }

   private static void id_continue() {
      id_private = new float[]{3.0F, 1.0F, 6.0F, 1.0F, 3.0F, 1.0F, 6.0F, 1.0F, 150.0F, 0.0F, 2000.0F, 10.0F, 1.0F, 0.0F, -1.0F, -1.0F};
   }

   private static void id_else() {
      id_throws = new boolean[]{
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false
      };
   }

   private static void id_new() {
      id_catch = new byte[]{5, 2, 3, 4, 2, -1, 9};
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
      }
   }

   private static void id_super() {
      id_protected = new String[]{
         new String("Nuker"),
         new String("Автоматически ломает блоки\nвокруг вас"),
         new String("Смотреть на блоки"),
         new String("Радиус по XZ"),
         new String("Радиус по Y"),
         new String("Задержка"),
         new String("Оптимизировать копание")
      };
   }

   private rfl_3 id_public() {
      rfl_3 var1 = null;
      if ((rrfq_3)rrfp_3.id_class[id_byte[70]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[71]] && rrjS_2.id_break() != null) {
         var1 = (rfl_3)rrjS_2.id_class[id_byte[72]];
      }

      return var1;
   }

   @Override
   public float id_private() {
      return id_private[15];
   }
}
