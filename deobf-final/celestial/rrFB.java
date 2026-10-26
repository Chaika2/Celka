package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFB extends rrFr_1 {
   public Object[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;

   @Override
   public boolean byte_() {
      return true;
   }

   private static long byte_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -461490798771604423L;
   }

   public rrFB(rrvi_1 var1, rdb_3 var2, String var3) {
      this.extends_();
      this.break_[2] = var1;
      rdn_3 var9 = new rdn_3(var2);
      this.break_[0] = var9;
      this.break_[1] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public rdn_3 class_() {
      this.extends_();
      return (rdn_3)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 450250485;
   }

   @Override
   public boolean break_(boolean var1) {
      this.extends_();
      return ((rrvi_1)this.break_[2]).package_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-3, 21, -55, -8, -66, -24, -121, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean throws_() {
      return false;
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }

   @Override
   public String implements_() {
      this.extends_();
      return (String)this.break_[1];
   }

   @Override
   public boolean protected_() {
      this.extends_();
      return ((rrvi_1)this.break_[2]).x();
   }

   private static void final_() {
      protected_ = new short[]{2, 0, 1, 0, 1, 2, 2};
   }

   private static void volatile_() {
      byte_ = new byte[]{3};
   }

   private static void native_() {
      throws_ = new boolean[]{true, false};
   }
}
