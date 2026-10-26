package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryC extends rrTF<ClickPearl> implements rrnF_2 {
   private static float[] break_;
   private static short[] byte_;
   private static long[] protected_;
   private static String[] case_;
   private static boolean[] catch_;
   private static byte[] private_;
   public Object[] class_;

   private int byte_(int var1) {
      this.else_();
      if (var1 == -2) {
         rrfo_3.class_(rpm_3.MAIN_HAND);
         ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.class_(rpm_3.OFF_HAND);
         ((cb_3)import_.class_[57]).class_(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         Integer var6 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
         this.class_[4] = var6;
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var1;
         rryl_1 var7 = (rryl_1)rryl_1.staticFieldsf4b744ad2cb233a5a56c412114fd18f6[0];
         this.class_[6] = var7;
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.class_[0]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND);
         Long var8 = System.currentTimeMillis();
         this.class_[2] = var8;
         return var1;
      } else {
         return private_[9];
      }
   }

   private static void int_() {
      byte_ = new short[]{
         0,
         1,
         4,
         2,
         57,
         0,
         5,
         0,
         0,
         0,
         2,
         5,
         1,
         0,
         3,
         3,
         6,
         6,
         0,
         7,
         7,
         57,
         6,
         7,
         1,
         57,
         2,
         0,
         55,
         57,
         57,
         57,
         1,
         4,
         57,
         1,
         0,
         6,
         0,
         57,
         1,
         55,
         57,
         2,
         1,
         1,
         3,
         5,
         4,
         57,
         1,
         4,
         4,
         3,
         3,
         3,
         5,
         1,
         7,
         6,
         57,
         45,
         57,
         46
      };
   }

   public rryC(ClickPearl var1) {
      super(var1);
      this.else_();
      rrfP_2 var6 = new rrfP_2();
      this.class_[0] = var6;
      rrTT var7 = new rrTT(this);
      this.class_[1] = var7;
      Integer var8 = -1;
      this.class_[4] = var8;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new byte[]{-1, -1, -1, 8, -2, -3, 9, 9, 36, -1, -1, -1, 2, 8, 2, 3, 4, 5, 7};
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(q_1 var1) {
      this.else_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.class_[0]).class_(System.currentTimeMillis() - this.class_[2] > 200L ? true : catch_[6]);
         if ((Boolean)this.class_[5]) {
            int var2 = rrfY_2.class_(rdy_3.Jm, false, true);
            int var3 = this.package_();
            if (var3 > 0) {
               ((rrTT)this.class_[1])
                  .class_(
                     (rrTg_1)() -> new PX((Float)((cb_3)import_.class_[57]).break_[45], (Float)((cb_3)import_.class_[57]).break_[46]),
                     (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]
                  );
            }

            if (var3 != 0) {
               int var10002 = (Integer)this.class_[3] + 1;
               Integer var8 = var10002;
               this.class_[3] = var8;
               if (var10002 < var3) {
                  return;
               }
            }

            if ((rryl_1)this.class_[6] == null) {
               this.class_(var2);
            }

            if ((rryl_1)this.class_[6] == (rryl_1)rryl_1.staticFieldsf4b744ad2cb233a5a56c412114fd18f6[0]) {
               int var12 = (Integer)this.class_[7] + 1;
               Integer var9 = var12;
               this.class_[7] = var9;
               if (var12 > 1) {
                  rrfo_3.class_(rpm_3.MAIN_HAND);
                  ((cb_3)import_.class_[57]).class_(rpm_3.MAIN_HAND);
                  this.synchronized_();
                  this.throws_(var3);
                  Object var10 = null;
                  this.class_[6] = var10;
                  Integer var11 = 0;
                  this.class_[7] = var11;
               }
            } else {
               this.throws_(var3);
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.else_();
      ((rrfP_2)this.class_[0]).class_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7541307131828579775L;
   }

   public void class_(int var1) {
      if (var1 != -1) {
         int var2 = this.byte_(var1);
         if (var2 > 8) {
            ((Ax_1)import_.class_[55]).class_(var2);
         }
      }
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.else_();
      ClickPearl var2 = this.continue_();
      boolean var3 = var1.break_() == var2.continue_().finally_().byte_() ? true : catch_[1];
      if (var3) {
         int var4 = rrfY_2.class_(rdy_3.Jm, false, true);
         rryH var5 = this.break_(var4);
         if (var5 == (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[2]) {
            int var6 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.Jm);
            float var7 = (float)var6 / 20.0F;
            rrfu_3.class_(var2, "эндер жемчуга", var7);
         } else if (var5 == (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[0]) {
            Boolean var12 = true;
            this.class_[5] = var12;
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-57, -52, -120, 64, -76, 47, 53, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   private rryH break_(int var1) {
      if (var1 == -1) {
         return (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.Jm)
            ? (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[2]
            : (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[0];
      }
   }

   private void throws_(int var1) {
      this.else_();
      if (var1 != 0) {
         ((rrTT)this.class_[1]).final_();
         ((rrTT)this.class_[1]).finally_();
      }

      Integer var6 = 0;
      this.class_[3] = var6;
      Boolean var7 = false;
      this.class_[5] = var7;
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private static void goto_() {
      catch_ = new boolean[]{
         true, false, false, true, true, true, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, false
      };
   }

   private void else_() {
      if (this.class_ == null) {
         this.class_ = new Object[8];
         this.class_[2] = 0L;
         this.class_[3] = 0;
         this.class_[4] = 0;
         this.class_[5] = false;
         this.class_[7] = 0;
      }
   }

   private static void new_() {
      protected_ = new long[]{200L, 0L};
   }

   private int package_() {
      return (C_volatile)rrTT.break_[3] instanceof rrTT && ((C_volatile)rrTT.break_[3]).byte_() != null ? 2 : catch_[15];
   }

   private static void return_() {
      case_ = new String[]{new String("эндер жемчуга")};
   }

   private static void public_() {
      break_ = new float[]{20.0F, -1.0F, -1.0F};
   }

   private static int protected_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -705165434;
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   private void synchronized_() {
      this.else_();
      if ((Integer)this.class_[4] != -1) {
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = (Integer)this.class_[4];
         Integer var5 = -1;
         this.class_[4] = var5;
      }
   }

   @Override
   public boolean aK_() {
      this.else_();
      Boolean var5 = false;
      this.class_[5] = var5;
      ((rrTT)this.class_[1]).final_();
      Integer var6 = 0;
      this.class_[7] = var6;
      Object var7 = null;
      this.class_[6] = var7;
      return super.aK_();
   }
}
