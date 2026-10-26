package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoExplosion extends Module implements rrnF_2 {
   private static long[] byte_;
   public Object[] break_;
   private static double[] protected_;
   private static byte[] throws_;
   private static boolean[] catch_;
   private static short[] private_;
   private static float[] implements_;
   private static String[] finally_;

   private rSa_1 byte_(rfH_2 var1) {
      return var1 == null
         ? null
         : this.class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_())
            .stream()
            .filter(var0 -> var0 instanceof rSa_1)
            .map(var0 -> (rSa_1)var0)
            .findFirst()
            .orElse(null);
   }

   public AutoExplosion() {
      super("Auto Explosion", "Автоматически взрывает кристалл\nпосле установки обсидиана", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.return_();
      rrIk_1 var5 = new rrIk_1("Смотреть на кристалл", true);
      this.break_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Коррекция движения", true).class_(((rrIk_1)this.break_[0])::class_);
      this.break_[1] = var6;
      rrTT var7 = new rrTT(this);
      this.break_[8] = var7;
      rrnn_3 var8 = new rrnn_3(this);
      this.break_[9] = var8;
      this.class_(new Setting[]{(rrIk_1)this.break_[0], (rrIk_1)this.break_[1]});
   }

   static {
      ntfClinit();
   }

   private boolean this_() {
      rLY var1 = ((cb_3)import_.class_[57]).byte_(rLD.continue_);
      rLY var2 = ((cb_3)import_.class_[57]).byte_(rLD.throws_);
      return var1 == null || var2 != null && var2.byte_() > var1.byte_() ? catch_[22] : catch_[21];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3269477539150907110L;
   }

   @EventTarget
   public void class_(rrAE var1) {
      this.return_();
      rfH_2 var6 = var1.break_();
      this.break_[3] = var6;
   }

   private void class_(rvG_2 var1) {
      this.return_();

      for (int var5 : var1.break_()) {
         if ((rSa_1)this.break_[2] != null && ((rSa_1)this.break_[2]).V() == var5) {
            this.new_();
            break;
         }
      }
   }

   private List<an_3> class_(double var1, double var3, double var5) {
      return ((gm_3)import_.class_[56]).class_(null, new rfl_3(var1, var3, var5, var1 + 1.0, var3 + 2.0, var5 + 1.0));
   }

   @EventTarget
   public void class_(rrAf_1 var1) {
      this.return_();
      rjG_2 var3 = (rjG_2)import_.class_[64];
      if (var3 instanceof rff_3 var2 && !var1.byte_().class_()) {
         rfH_2 var8 = var2.class_();
         this.break_[3] = var8;
      }
   }

   private void class_(rSa_1 var1) {
      this.return_();
      if (var1 != null) {
         this.break_[2] = var1;
         if (((rrIk_1)this.break_[0]).class_()) {
            ((rrTT)this.break_[8]).class_(var1, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         }

         this.break_(var1);
      }
   }

   @EventTarget(
      id_class = 100
   )
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rfH_2 var2 = (rfH_2)this.break_[4];
         if (var2 != null) {
            rSa_1 var3 = this.byte_(var2);
            if (((gm_3)import_.class_[56]).finally_(var2) && var3 == null) {
               this.new_();
               return;
            }

            if (((cb_3)import_.class_[57]).break_((double)var2.b_(), (double)var2.c_(), (double)var2.d_()) > 6.0F) {
               this.new_();
               return;
            }

            if (!this.this_()) {
               this.new_();
               return;
            }

            if (var3 == null) {
               int var10002 = (Integer)this.break_[7] + 1;
               Integer var9 = var10002;
               this.break_[7] = var9;
               if (var10002 > 10) {
                  this.new_();
                  Integer var10 = 0;
                  this.break_[7] = var10;
                  return;
               }

               ((rrTT)this.break_[8]).class_(var2, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
            } else {
               Integer var11 = 0;
               this.break_[7] = var11;
               Boolean var12 = false;
               this.break_[5] = var12;
            }

            if ((Boolean)this.break_[5]) {
               ryZ_2 var4 = this.continue_();
               if (var4 == ryZ_2.SUCCESS) {
                  Boolean var13 = false;
                  this.break_[5] = var13;
               }
            }

            this.class_(var3);
         } else {
            this.new_();
         }

         if ((rfH_2)this.break_[3] != null) {
            this.class_((rfH_2)this.break_[3]);
            Object var14 = null;
            this.break_[3] = var14;
         }
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvG_2 var3) {
         this.class_(var3);
      }
   }

   private boolean class_(xd_3 var1) {
      return !(var1 instanceof kY_2) && var1 != xd_3.break_(25) ? catch_[18] : catch_[17];
   }

   @EventTarget
   public void class_(rrAI var1) {
      this.return_();
      rdn_3 var2 = var1.protected_();
      rfH_2 var3 = var1.class_();
      xd_3 var4 = var1.byte_();
      ryZ_2 var5 = var1.break_();
      if (var5.break_()) {
         if (this.class_(var4)) {
            if (var2.break_() == rdy_3.kM) {
               this.break_[4] = var3;
            }
         }
      }
   }

   private void class_(rfH_2 var1) {
      this.return_();
      xd_3 var2 = rrjc_3.protected_(var1);
      if (this.class_(var2)) {
         if (rrfY_2.break_(rdy_3.kM) != -1) {
            if (this.break_(var1)) {
               this.break_[4] = var1;
               Boolean var8 = true;
               this.break_[5] = var8;
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1028875454;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -101, 6, -106, 44, -63, 63, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean break_(rfH_2 var1) {
      rfH_2 var2 = var1.final_();
      if (!((gm_3)import_.class_[56]).finally_(var2)) {
         return false;
      } else {
         double var3 = (double)var2.b_();
         double var5 = (double)var2.c_();
         double var7 = (double)var2.d_();
         List var9 = this.class_(var3, var5, var7);
         return var9.isEmpty();
      }
   }

   private void break_(rSa_1 var1) {
      this.return_();
      if (this.super_()) {
         an_3 var2 = Ph_1.class_((rSa_1)this.break_[2], ((cb_3)import_.class_[57]).new_(1.0F), ((rrTT)this.break_[8]).throws_(), 3.0F, false);
         if (((rrIk_1)this.break_[0]).class_() && var2 != (rSa_1)this.break_[2]) {
            return;
         }

         ((Ax_1)import_.class_[55]).class_((cb_3)import_.class_[57], var1, true);
         Long var7 = System.currentTimeMillis();
         this.break_[6] = var7;
      }
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.new_();
   }

   @Override
   public rrTp_1 catch_() {
      this.return_();
      return ((rrIk_1)this.break_[1]).class_()
         ? (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0]
         : (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private static void goto_() {
      catch_ = new boolean[]{
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
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
         false,
         false,
         false,
         false,
         true,
         false,
         false
      };
   }

   private ryZ_2 continue_() {
      this.return_();
      rfH_2 var1 = (rfH_2)this.break_[4];
      if (var1 != null) {
         rjG_2 var3 = (rjG_2)import_.class_[64];
         if (var3 instanceof rff_3 var2) {
            if (!var2.class_().equals(var1)) {
               return ryZ_2.FAIL;
            }

            int var7 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
            int var4 = rrfY_2.break_(rdy_3.kM);
            if (var4 >= 0) {
               ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var4;
            }

            rpm_3 var5 = var4 == -3 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
            ryZ_2 var6 = ((Ax_1)import_.class_[55]).class_((cb_3)import_.class_[57], (gm_3)import_.class_[56], var5, var2);
            if (var6 == ryZ_2.SUCCESS) {
               ((cb_3)import_.class_[57]).class_(var5);
            }

            ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var7;
            return var6;
         }
      }

      return ryZ_2.FAIL;
   }

   private static void else_() {
      implements_ = new float[]{6.0F, 1.0F, 3.0F, 500.0F, -1.0F, -1.0F};
   }

   private static void instanceof_() {
      protected_ = new double[]{1.0, 2.0, 1.0};
   }

   public void new_() {
      this.return_();
      Object var5 = null;
      this.break_[2] = var5;
      Object var6 = null;
      this.break_[4] = var6;
      Boolean var7 = false;
      this.break_[5] = var7;
      Integer var8 = 0;
      this.break_[7] = var8;
      ((rrTT)this.break_[8]).final_();
      ((rrTT)this.break_[8]).finally_();
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[10];
         this.break_[5] = false;
         this.break_[6] = 0L;
         this.break_[7] = 0;
      }
   }

   private boolean super_() {
      this.return_();
      rSa_1 var1 = (rSa_1)this.break_[2];
      if (var1 == null) {
         return false;
      } else {
         return (float)(System.currentTimeMillis() - this.break_[6]) >= 500.0F && rrfo_3.protected_() ? true : catch_[13];
      }
   }

   private static void throw_() {
      private_ = new short[]{
         0,
         0,
         0,
         1,
         8,
         9,
         0,
         1,
         3,
         64,
         3,
         4,
         0,
         4,
         56,
         57,
         7,
         7,
         7,
         8,
         0,
         7,
         5,
         5,
         5,
         3,
         3,
         3,
         2,
         0,
         8,
         0,
         2,
         57,
         8,
         0,
         2,
         55,
         57,
         6,
         2,
         6,
         4,
         5,
         2,
         2,
         4,
         64,
         57,
         1,
         57,
         1,
         55,
         57,
         56,
         57,
         57,
         1,
         56,
         56,
         2,
         4,
         5,
         7,
         8,
         8,
         57,
         57,
         9,
         1,
         0,
         3
      };
   }

   private static void try_() {
      finally_ = new String[]{
         new String("Auto Explosion"),
         new String("Автоматически взрывает кристалл\nпосле установки обсидиана"),
         new String("Смотреть на кристалл"),
         new String("Коррекция движения")
      };
   }

   private static void while_() {
      throws_ = new byte[]{2, 10, -1, -3, 25, 10, 5, 6, 7};
   }

   private static void public_() {
      byte_ = new long[1];
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   @Override
   public rrTf_1 aL_() {
      this.return_();
      return (rrTf_1)this.break_[9];
   }
}
