package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIk_1 extends Setting<Boolean> {
   private static short[] byte_;
   public Object[] break_;
   private static boolean[] protected_;
   private static byte[] throws_;

   public rrIk_1(String var1, boolean var2, rrZO var3) {
      this(var1, var2);
      this.break_[1] = var3;
   }

   public rrIk_1(String var1, boolean var2) {
      super(var1, var2);
      this.volatile_();
      Boolean var7 = var2;
      this.break_[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1640420870455538881L;
   }

   public Boolean class_() {
      return super.byte_() && this.private_() ? true : protected_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1524705312;
   }

   public rrZO break_() {
      this.volatile_();
      return (rrZO)this.break_[1];
   }

   public boolean finally_() {
      this.volatile_();
      return (Boolean)this.break_[0];
   }

   private static void extends_() {
      byte_ = new short[]{0, 1, 0, 1};
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, 2, -63, -13, -113, 25, -98, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void final_() {
      throws_ = new byte[]{2};
   }

   private void volatile_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   private static void native_() {
      protected_ = new boolean[]{true, false, false, false};
   }
}
