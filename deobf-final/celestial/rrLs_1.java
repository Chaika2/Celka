package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLs_1 extends Om_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] class_;
   public static Object[] break_;

   public rrLs_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1299680969;
   }

   public static rrLs_1 class_(Va_1 var0, int var1, int var2) {
      rrLs_1 var3 = break_(var0, var1, var2);
      if (var2 == 1) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
      }

      return var3;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, -26, 23, -36, 8, 17, 53, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3723347138302305828L;
   }

   public int class_() {
      this.throws_();
      return (Integer)this.class_[2];
   }

   private static rrLs_1 break_(Va_1 var0, int var1, int var2) {
      ((rrLs_1)break_[0]).class_[0] = var0;
      rrLs_1 var10000 = (rrLs_1)break_[0];
      Integer var8 = var1;
      var10000.class_[1] = var8;
      var10000 = (rrLs_1)break_[0];
      Integer var9 = var2;
      var10000.class_[2] = var9;
      ((rrLs_1)break_[0]).class_(false);
      return (rrLs_1)break_[0];
   }

   public Va_1 break_() {
      this.throws_();
      return (Va_1)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   private static void catch_() {
      throws_ = new byte[]{3, 2};
   }

   private static void case_() {
      protected_ = new boolean[]{false, true, false, true, false, false, true};
   }

   private static void implements_() {
      Object[] var0 = new Object[]{new rrLs_1()};
      break_ = var0;
   }

   public int protected_() {
      this.throws_();
      return (Integer)this.class_[1];
   }

   private static void private_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 1, 2};
   }
}
