package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLf_1 {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static short[] throws_;
   public static Object[] break_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrLf_1()};
      break_ = var0;
   }

   public rrLf_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -704518575;
   }

   public rdn_3 class_() {
      return (rdn_3)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{124, -124, -30, -71, -66, 32, 52, 60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8899489962997357870L;
   }

   public static void class_(iB_2 var0, rdn_3 var1) {
      rrLf_1 var2 = break_(var0, var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
   }

   private static rrLf_1 break_(iB_2 var0, rdn_3 var1) {
      ((rrLf_1)break_[0]).class_[0] = var0;
      ((rrLf_1)break_[0]).class_[1] = var1;
      return (rrLf_1)break_[0];
   }

   public iB_2 break_() {
      return (iB_2)this.class_[0];
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private static void catch_() {
      protected_ = new boolean[]{false, true};
   }

   private static void case_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
