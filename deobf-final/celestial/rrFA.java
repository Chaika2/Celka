package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFA {
   private static short[] byte_;
   public static Object[] class_;
   private static float[] protected_;
   private static byte[] throws_;
   public Object[] break_;
   private static boolean[] case_;

   private static void byte_() {
      protected_ = new float[]{0.55F, 0.5F, 0.5F, -8.0F, 11.0F, 8.0F, 0.5F, 8.0F, 8.0F, 0.5F, 3.0F};
   }

   public rrFA() {
      this.protected_();
      rrFL[] var6 = new rrFL[6];
      this.break_[0] = var6;

      for (int var1 = 0; var1 < 6; var1++) {
         ((rrFL[])this.break_[0])[var1] = new rrFL(0.55F, 0.5F, 0.5F);
      }
   }

   static {
      ntfClinit();
   }

   private static rdn_3 class_(iB_2 var0, int var1) {
      return switch (var1) {
         case 0 -> var0.class_(rXQ.HEAD);
         case 1 -> var0.class_(rXQ.CHEST);
         case 2 -> var0.class_(rXQ.LEGS);
         case 3 -> var0.class_(rXQ.FEET);
         case 4 -> var0.protected_(rpm_3.MAIN_HAND);
         case 5 -> var0.protected_(rpm_3.OFF_HAND);
         default -> throw new IllegalArgumentException("неверный индекс слота: " + var1);
      };
   }

   public void class_(Ml_1 var1, float var2, float var3, float var4) {
      int var5 = 0;

      for (int var6 = 5; var6 >= 0; var6--) {
         if (((rrFL[])this.break_[0])[var6].byte_()) {
            float var7 = -8.0F - (float)var5 * 11.0F;
            ((rrFL[])this.break_[0])[var6].class_(var7);
            var5++;
         }
      }

      for (rrFL var9 : (rrFL[])this.break_[0]) {
         if (var9.byte_()) {
            var9.class_(var1, var2 + var9.class_(), var3, var4, 8.0F, 0.5F);
         }
      }
   }

   public void class_(iB_2 var1) {
      for (int var2 = 0; var2 < 6; var2++) {
         ((rrFL[])this.break_[0])[var2].class_(class_(var1, var2));
      }
   }

   public boolean class_() {
      for (rrFL var4 : (rrFL[])this.break_[0]) {
         if (var4.byte_()) {
            return true;
         }
      }

      return case_[4];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 75, -10, -40, -75, 79, 11, 68}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5507683006095049234L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2053466081;
   }

   public void break_() {
      for (rrFL var4 : (rrFL[])this.break_[0]) {
         var4.break_();
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 0.0F, 6};
      class_ = var0;
   }

   private static void catch_() {
      case_ = new boolean[]{false, false, false, true, false, false, false, false, true, false, true};
   }

   private static void case_() {
      byte_ = new short[8];
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void private_() {
      throws_ = new byte[]{6, 6, 6, 5, 5, 2, 3, 4, 6};
   }
}
