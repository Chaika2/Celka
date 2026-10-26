package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFo_1 {
   public Object[] class_;
   private static byte[] byte_;
   public static Object[] break_;
   private static boolean[] protected_;
   private static short[] throws_;

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public rrFo_1() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[1] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6094234995490456253L;
   }

   public boolean class_() {
      return (Boolean)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, -112, -7, -46, 71, -23, 10, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrFo_1 class_(vm_3 var0) {
      ((rrFo_1)break_[0]).class_[0] = var0;
      rrFo_1 var10000 = (rrFo_1)break_[0];
      Boolean var6 = false;
      var10000.class_[1] = var6;
      return (rrFo_1)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2051213003;
   }

   public static rrFo_1 break_(vm_3 var0) {
      rrFo_1 var1 = class_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      return var1;
   }

   public vm_3 break_() {
      return (vm_3)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = false;
      }
   }

   private static void catch_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1, 1};
   }

   private static void case_() {
      protected_ = new boolean[]{false, false, true, false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrFo_1()};
      break_ = var0;
   }
}
