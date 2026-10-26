package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLx_1 {
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   public static Object[] break_;

   private static void byte_() {
      protected_ = new boolean[]{false, true, false, false, true};
   }

   private static rrLx_1 byte_(boolean var0) {
      rrLx_1 var10000 = (rrLx_1)break_[0];
      Boolean var5 = var0;
      var10000.class_[0] = var5;
      return (rrLx_1)break_[0];
   }

   public rrLx_1() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1895982560;
   }

   public boolean class_() {
      return (Boolean)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5042578329544307841L;
   }

   public static rrLx_1 class_(boolean var0) {
      rrLx_1 var1 = byte_(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      return var1;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, -23, -35, -121, 112, 102, 0, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(boolean var1) {
      Boolean var6 = var1;
      this.class_[0] = var6;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = false;
      }
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLx_1()};
      break_ = var0;
   }

   private static void protected_() {
      byte_ = new short[7];
   }
}
