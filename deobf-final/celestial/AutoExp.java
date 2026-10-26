package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoExp extends Module implements rrnF_2 {
   private static byte[] byte_;
   private static float[] protected_;
   private static short[] throws_;
   public Object[] break_;
   private static long[] catch_;
   private static String[] private_;
   private static boolean[] implements_;

   public AutoExp() {
      super("Auto Exp", "Автоматически кидает пузырьки\nс опытом под ноги", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.return_();
      rrIF var5 = new rrIF("Кидать на", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.break_[0] = var5;
      rrIm_1 var6 = new rrIm_1("Задержка", 0.0F, 0.0F, 100.0F, 10.0F);
      this.break_[1] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.break_[2] = var7;
      rrTT var8 = new rrTT(this);
      this.break_[3] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.break_[4] = var9;
      Integer var10 = -1;
      this.break_[6] = var10;
      Integer var11 = -1;
      this.break_[7] = var11;
      this.class_(new Setting[]{(rrIF)this.break_[0], (rrIm_1)this.break_[1]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      implements_ = new boolean[]{false, true, true, false, false, true, false, false};
   }

   @EventTarget(
      id_class = -100
   )
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.break_[2]).class_(this.break_[7] == -1 && rqR_2.break_() - this.break_[5] > 200L ? true : implements_[3]);
         if (((rrIF)this.break_[0]).break_()) {
            int var2 = rrfY_2.class_(rdy_3.xe, false, true);
            if (var2 == -1) {
               this.new_();
               return;
            }

            rrTg_1 var3 = () -> ((cb_3)import_.class_[57]).goto_().case_(90.0F);
            ((rrTT)this.break_[3]).class_(var3, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
            if (!((cb_3)import_.class_[57]).z().break_(var3.getNeedRotation(), 3.0F)) {
               return;
            }

            if (((rrfw_3)this.break_[4]).class_((double)((rrIm_1)this.break_[1]).byte_().floatValue())) {
               int var4 = this.class_(var2);
               if (var4 > 8 && (Integer)this.break_[7] == -1) {
                  Integer var9 = var4;
                  this.break_[7] = var9;
               }

               ((rrfw_3)this.break_[4]).class_();
            }
         } else {
            this.new_();
         }
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.return_();
      ((rrfP_2)this.break_[2]).class_(var1);
   }

   private int class_(int var1) {
      this.return_();
      if (var1 == -2) {
         rrfo_3.class_(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.class_(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         Integer var6 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
         this.break_[6] = var6;
         rrfo_3.class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         ((Ax_1)import_.class_[55]).break_ = (Integer)this.break_[6];
         return var1;
      } else if (var1 >= 9 && var1 <= 36 && rqR_2.break_() - (Long)this.break_[5] > 300L) {
         ((rrfP_2)this.break_[2]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         Long var7 = rqR_2.break_();
         this.break_[5] = var7;
         return var1;
      } else {
         return byte_[12];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3703566411899288495L;
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, 82, -24, -86, -45, -89, 37, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 573967953;
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.new_();
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   private static void goto_() {
      private_ = new String[]{
         new String("Auto Exp"), new String("Автоматически кидает пузырьки\nс опытом под ноги"), new String("Кидать на"), new String("Задержка")
      };
   }

   private static void continue_() {
      protected_ = new float[]{0.0F, 0.0F, 100.0F, 10.0F, 3.0F, -1.0F, -1.0F, 90.0F};
   }

   private static void else_() {
      byte_ = new byte[]{-1, -1, 2, -1, -1, 8, -1, -2, -3, 9, 9, 36, -1, -1, -1, -1, -1, 8, 5, 6, 7};
   }

   public void new_() {
      this.return_();
      ((rrTT)this.break_[3]).final_();
      ((rrTT)this.break_[3]).finally_();
      ((rrfw_3)this.break_[4]).class_();
      if ((Integer)this.break_[7] != -1) {
         ((Ax_1)import_.class_[55]).class_((Integer)this.break_[7]);
         Long var5 = rqR_2.break_();
         this.break_[5] = var5;
         Integer var6 = -1;
         this.break_[7] = var6;
      }

      if ((Integer)this.break_[6] != -1) {
         rrfo_3.class_((Integer)this.break_[6]);
         Integer var7 = -1;
         this.break_[6] = var7;
      }
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[8];
         this.break_[5] = 0L;
         this.break_[6] = 0;
         this.break_[7] = 0;
      }
   }

   private static void while_() {
      catch_ = new long[]{200L, 300L, 0L};
   }

   private static void public_() {
      throws_ = new short[]{
         3,
         0,
         0,
         1,
         2,
         3,
         4,
         6,
         7,
         0,
         1,
         0,
         2,
         7,
         5,
         0,
         3,
         0,
         57,
         4,
         1,
         7,
         7,
         4,
         2,
         57,
         1,
         6,
         55,
         6,
         5,
         2,
         57,
         1,
         55,
         5,
         0,
         57,
         3,
         3,
         4,
         7,
         55,
         7,
         5,
         7,
         6,
         6,
         6,
         57
      };
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   @Override
   public rrTq_1 aB_() {
      return new rrTq_1(rjG_2.catch_(), ((cb_3)import_.class_[57]).goto_());
   }
}
