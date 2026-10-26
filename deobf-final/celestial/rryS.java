package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryS extends rryB {
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;

   @Override
   public rfl_3 byte_() {
      this.new_();
      return (rfl_3)this.class_[1];
   }

   private static void int_() {
      protected_ = new short[]{0, 1, 1, 2, 3, 0, 4, 1, 4, 0, 0, 2, 3};
   }

   public rryS(SZ var1, rfl_3 var2) {
      this.new_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      rjU_2 var9 = ((rfl_3)this.class_[1]).case_();
      this.class_[2] = var9;
      rdn_3 var10 = new rdn_3(rdy_3.OW);
      this.class_[3] = var10;
      String var11 = ((SZ)this.class_[0]).break_() + " трапка";
      this.class_[4] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public rjU_2 class_() {
      this.new_();
      return (rjU_2)this.class_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -59, 118, 43, -11, 56, 123, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2008084506728725766L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 227893917;
   }

   @Override
   public rdn_3 break_() {
      this.new_();
      return (rdn_3)this.class_[3];
   }

   @Override
   public long throws_() {
      this.new_();
      return ((SZ)this.class_[0]).byte_();
   }

   @Override
   public String case_() {
      this.new_();
      return (String)this.class_[4];
   }

   private void new_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
      }
   }

   private static void package_() {
      byte_ = new byte[]{5};
   }

   public SZ protected_() {
      this.new_();
      return (SZ)this.class_[0];
   }
}
