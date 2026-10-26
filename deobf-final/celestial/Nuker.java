package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Nuker extends Module implements rrnF_2 {
   public Object[] break_;
   private static short[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;
   private static byte[] catch_;
   private static float[] private_;

   public Nuker() {
      super("Nuker", "Автоматически ломает блоки\nвокруг вас", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.return_();
      rrIk_1 var5 = new rrIk_1("Смотреть на блоки", true);
      this.break_[0] = var5;
      rrIm_1 var6 = new rrIm_1("Радиус по XZ", 3.0F, 1.0F, 6.0F, 1.0F);
      this.break_[1] = var6;
      rrIm_1 var7 = new rrIm_1("Радиус по Y", 3.0F, 1.0F, 6.0F, 1.0F);
      this.break_[2] = var7;
      rrIm_1 var8 = new rrIm_1("Задержка", 150.0F, 0.0F, 2000.0F, 10.0F).class_(() -> {
         this.return_();
         return !((rrIk_1)this.break_[0]).class_() ? true : throws_[29];
      });
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Оптимизировать копание", true);
      this.break_[4] = var9;
      rrTT var10 = new rrTT(this);
      this.break_[5] = var10;
      ArrayList var11 = new ArrayList();
      this.break_[6] = var11;
      rrfw_3 var12 = new rrfw_3();
      this.break_[7] = var12;
      this.class_(new Setting[]{(rrIk_1)this.break_[0], (rrIm_1)this.break_[1], (rrIm_1)this.break_[2], (rrIm_1)this.break_[3], (rrIk_1)this.break_[4]});
   }

   static {
      ntfClinit();
   }

   private List<rrHJ> class_(Ps_1 var1, rrHM var2, rfl_3 var3, int var4, int var5, boolean var6) {
      ArrayList var7 = new ArrayList();
      roE_2 var8 = ((gm_3)import_.class_[56]).instanceof_();
      rfH_2 var9 = ((cb_3)import_.class_[57]).Bs();
      switch (((int[])rrHb_1.class_[0])[var2.ordinal()]) {
         case 1:
            for (int var15 = -var4; var15 <= var4; var15++) {
               for (int var17 = 0; var17 <= var5; var17++) {
                  for (int var19 = -var4; var19 <= var4; var19++) {
                     rfH_2 var21 = var9.break_(var15, var17, var19);
                     this.class_(var1, var7, var21, var8, var3, var6);
                  }
               }
            }
            break;
         case 2:
            for (int var14 = -var4; var14 <= var4; var14++) {
               for (int var16 = 2; var16 <= var5 + 1; var16++) {
                  for (int var18 = -var4; var18 <= var4; var18++) {
                     rfH_2 var20 = var9.break_(var14, var16, var18);
                     this.class_(var1, var7, var20, var8, var3, var6);
                  }
               }
            }
            break;
         case 3:
            for (int var10 = -var4; var10 <= var4; var10++) {
               for (int var11 = -var5; var11 <= -1; var11++) {
                  for (int var12 = -var4; var12 <= var4; var12++) {
                     rfH_2 var13 = var9.break_(var10, var11, var12);
                     this.class_(var1, var7, var13, var8, var3, var6);
                  }
               }
            }
      }

      return var7;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 404698366;
   }

   @EventTarget
   public void class_(rrLp_1 var1) {
      this.return_();
      rfH_2 var2 = var1.class_();
      rrLq_1 var3 = var1.case_();
      if (var3 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]) {
         for (rrHJ var5 : (List)this.break_[6]) {
            if (var5.break_().equals(var2)) {
               ((List)this.break_[6]).remove(var5);
               break;
            }
         }
      }
   }

   private rrHM class_(double var1) {
      return (rrHM)rrHM.staticFields6335874c02e73489a27afe393d14ab7b[0];
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrTT)this.break_[5]).final_();
         if (((Ax_1)import_.class_[55]).native_() == rRl_1.ADVENTURE) {
            ((List)this.break_[6]).clear();
            Object var22 = null;
            this.break_[8] = var22;
            return;
         }

         Ps_1 var2 = C_throws.byte_().throw_();
         rrHM var3 = this.class_((double)((cb_3)import_.class_[57]).goto_().protected_());
         boolean var4 = ((rrIk_1)this.break_[0]).class_();
         int var5 = ((rrIm_1)this.break_[1]).byte_().intValue();
         int var6 = ((rrIm_1)this.break_[2]).byte_().intValue();
         boolean var7 = !var4 ? true : throws_[5];
         Object var23 = null;
         this.break_[8] = var23;
         rfl_3 var8 = this.public_();
         List var9 = this.class_(var2, var3, var8, var5, var6, var7);
         if (var9.isEmpty()) {
            ((List)this.break_[6]).clear();
            return;
         }

         for (rrHJ var11 : var9) {
            if (!((List)this.break_[6]).contains(var11)) {
               ((List)this.break_[6]).add(var11);
            }
         }

         ((List)this.break_[6]).removeIf(var1x -> !var9.contains(var1x) ? true : throws_[27]);
         if (((List)this.break_[6]).isEmpty()) {
            return;
         }

         ArrayList var25 = new ArrayList();
         if (var8 != null) {
            var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[0]);
         }

         var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[1]);
         var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[2]);
         ((List)this.break_[6]).sort(new rrHO(var25));
         rrHJ var26 = (rrHJ)((List)this.break_[6]).get(0);
         rfH_2 var12 = var26.break_();
         xc_3 var13 = var26.byte_().continue_();
         this.break_[8] = var26;
         if (((gm_3)import_.class_[56]).finally_(var12)) {
            return;
         }

         if (var4) {
            Optional var14 = PJ.class_(var2, var12);
            var14.ifPresent(var1x -> {
               this.return_();
               rjG_2 var2x = var1x.break_();
               PX var3x = var1x.class_();
               if (var2x instanceof rff_3 var4x) {
                  rfH_2 var5x = var4x.class_();
                  xc_3 var6x = ((gm_3)import_.class_[56]).byte_(var5x);
                  if (!var6x.catch_()) {
                     ((rrTT)this.break_[5]).class_((rrTg_1)() -> var3x, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
                     this.break_(var5x, var6x);
                     this.class_(var4x);
                     this.class_(var5x, var6x);
                  }
               }
            });
         } else {
            this.break_(var12, var13);
            boolean var28 = !((Ax_1)import_.class_[55]).native_().throws_()
                  && var13.class_((cb_3)import_.class_[57], (rYB)((cb_3)import_.class_[57]).throws_[7], var12) < 1.0F
               ? true
               : throws_[8];
            if (var28) {
               rff_3 var29 = new rff_3(rjU_2.class_, rpr_3.UP, var12, false);
               this.class_(var29);
            } else if (((rrfw_3)this.break_[7]).class_((double)((rrIm_1)this.break_[3]).byte_().floatValue())) {
               int var16 = var9.size();

               for (int var17 = 0; var17 < var16 && !((List)this.break_[6]).isEmpty(); var17++) {
                  var26 = (rrHJ)((List)this.break_[6]).remove(0);
                  rff_3 var15 = new rff_3(rjU_2.class_, rpr_3.UP, var26.break_(), false);
                  this.class_(var15);
               }

               ((rrfw_3)this.break_[7]).class_();
            }

            this.class_(var12, var13);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1118477945353729122L;
   }

   private void class_(rfH_2 var1, xc_3 var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .finally_()
         .class_(rrLH.class_(var1, var2, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1]));
   }

   private boolean class_(xd_3 var1, xc_3 var2, rfH_2 var3) {
      if (var1 instanceof kX_2) {
         return true;
      } else if (var2.private_((gm_3)import_.class_[56], var3) < 0.0F) {
         return false;
      } else if (var2.finally_((gm_3)import_.class_[56], var3).break_()) {
         return false;
      } else {
         return var2.class_((gm_3)import_.class_[56], var3, rLT.LAND) ? false : throws_[22];
      }
   }

   private void class_(rff_3 var1) {
      this.return_();
      if (((Ax_1)import_.class_[55]).break_(var1.class_(), var1.break_(), !((rrIk_1)this.break_[4]).class_() ? true : throws_[14])) {
         ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND, false);
      }
   }

   private void class_(Ps_1 var1, List<rrHJ> var2, rfH_2 var3, roE_2 var4, rfl_3 var5, boolean var6) {
      if (var4.class_(var3)) {
         if (var5 == null || var5.break_(var3)) {
            xd_3 var7 = rrjc_3.protected_(var3);
            if (((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).byte_().isEmpty()
               || ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).class_(var7)) {
               xc_3 var8 = var7.continue_();
               if (this.class_(var7, var8, var3)) {
                  if (!(((cb_3)import_.class_[57]).break_(var3) > (double)((Ax_1)import_.class_[55]).byte_())) {
                     Optional var9 = PJ.class_(var1, var3, var2x -> {
                        if (!var6) {
                           return true;
                        } else {
                           return var2x.break_() == var7 ? true : throws_[25];
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
   public float break_() {
      return -1.0F;
   }

   private void break_(rfH_2 var1, xc_3 var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .finally_()
         .class_(rrLH.class_(var1, var2, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0]));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 73, -10, 74, 25, -114, -45, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.return_();
      super.throws_(var1);
      ((rrTT)this.break_[5]).final_();
      ((List)this.break_[6]).clear();
      Object var6 = null;
      this.break_[8] = var6;
      ((rrfw_3)this.break_[7]).class_();
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   private static void goto_() {
      byte_ = new short[]{
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

   private static void continue_() {
      private_ = new float[]{3.0F, 1.0F, 6.0F, 1.0F, 3.0F, 1.0F, 6.0F, 1.0F, 150.0F, 0.0F, 2000.0F, 10.0F, 1.0F, 0.0F, -1.0F, -1.0F};
   }

   private static void else_() {
      throws_ = new boolean[]{
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

   private static void new_() {
      catch_ = new byte[]{5, 2, 3, 4, 2, -1, 9};
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
      }
   }

   private static void super_() {
      protected_ = new String[]{
         new String("Nuker"),
         new String("Автоматически ломает блоки\nвокруг вас"),
         new String("Смотреть на блоки"),
         new String("Радиус по XZ"),
         new String("Радиус по Y"),
         new String("Задержка"),
         new String("Оптимизировать копание")
      };
   }

   private rfl_3 public_() {
      rfl_3 var1 = null;
      if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] && rrjS_2.break_() != null) {
         var1 = (rfl_3)rrjS_2.class_[1];
      }

      return var1;
   }

   @Override
   public float private_() {
      return -1.0F;
   }
}
