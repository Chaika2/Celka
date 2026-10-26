package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoFish extends Module {
   private static String[] byte_;
   private static float[] protected_;
   private static byte[] throws_;
   private static boolean[] catch_;
   public Object[] break_;
   private static short[] private_;

   private void byte_(rpm_3 var1) {
      this.this_();
      if (this.return_()) {
         if (!(Boolean)this.break_[0]
            && (rhp_3)((cb_3)import_.class_[57]).implements_[29] != null
            && ((rhp_3)((cb_3)import_.class_[57]).implements_[29]).implements_()) {
            this.class_(var1);
            Boolean var6 = true;
            this.break_[0] = var6;
         }
      }
   }

   public AutoFish() {
      super("Auto Fish", "Автоматически ловит рыбу за вас", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.this_();
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         this.break_[0] = false;
         this.break_[1] = 0;
      }
   }

   private void class_(rpm_3 var1) {
      ryZ_2 var2 = ((Ax_1)import_.class_[55]).class_(var1);
      if (var2 == ryZ_2.SUCCESS) {
         ((cb_3)import_.class_[57]).class_(var1);
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rpm_3 var2 = rrfH_2.class_((cb_3)import_.class_[57], rdy_3.Xd);
         if (var2 != null) {
            this.byte_(var2);
            this.break_(var2);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3974042643107681316L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -693866113;
   }

   private void break_(rpm_3 var1) {
      this.this_();
      if (this.return_()) {
         if ((Boolean)this.break_[0]) {
            Integer var6 = (Integer)this.break_[1] + 1;
            this.break_[1] = var6;
            if ((Integer)this.break_[1] >= 5) {
               this.class_(var1);
               this.goto_();
            }
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 112, 53, 11, 45, -85, 26, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.goto_();
   }

   private void goto_() {
      this.this_();
      Integer var5 = 0;
      this.break_[1] = var5;
      Boolean var6 = false;
      this.break_[0] = var6;
   }

   private static void continue_() {
      catch_ = new boolean[]{true, true, false, false, true, false, false, false, false, true, false};
   }

   private static void else_() {
      private_ = new short[]{4, 0, 57, 0, 57, 29, 57, 29, 0, 0, 1, 1, 1, 55, 57, 57, 1, 0};
   }

   private static void new_() {
      throws_ = new byte[]{5, 2};
   }

   private boolean return_() {
      an_3 var1 = Ph_1.class_(((cb_3)import_.class_[57]).rO(), 20.0F, false, null);
      return var1 != null ? false : catch_[4];
   }

   private static void super_() {
      protected_ = new float[]{20.0F};
   }

   private static void public_() {
      byte_ = new String[]{new String("Auto Fish"), new String("Автоматически ловит рыбу за вас")};
   }
}
