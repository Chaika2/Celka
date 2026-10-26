package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryP extends rryB {
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static double[] throws_;
   private static long[] case_;

   @Override
   public rfl_3 byte_() {
      this.int_();
      return (rfl_3)this.class_[1];
   }

   private void int_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[5] = 0L;
      }
   }

   public rryP(Sz_1 var1, rfl_3 var2) {
      this.int_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      rjU_2 var9 = ((rfl_3)this.class_[1]).case_();
      this.class_[2] = var9;
      rdn_3 var10 = new rdn_3(rdy_3.Jd);
      this.class_[3] = var10;
      String var11 = ((Sz_1)this.class_[0]).byte_() + " пласт";
      this.class_[4] = var11;
      Long var12 = ((rfl_3)this.class_[1]).byte_() <= 2.0 ? ((Sz_1)this.class_[0]).break_().getAsLong() : ((Sz_1)this.class_[0]).protected_().getAsLong();
      this.class_[5] = var12;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{116, -64, 12, -48, 69, -66, 60, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4783319154897070753L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1897164488;
   }

   @Override
   public rjU_2 class_() {
      this.int_();
      return (rjU_2)this.class_[2];
   }

   @Override
   public rdn_3 break_() {
      this.int_();
      return (rdn_3)this.class_[3];
   }

   @Override
   public long throws_() {
      this.int_();
      return (Long)this.class_[5];
   }

   @Override
   public String case_() {
      this.int_();
      return (String)this.class_[4];
   }

   private static void continue_() {
      throws_ = new double[]{2.0};
   }

   private static void new_() {
      byte_ = new byte[]{6, 5};
   }

   private static void package_() {
      protected_ = new short[]{0, 1, 1, 2, 3, 0, 4, 1, 0, 0, 5, 1, 4, 5, 0, 2, 3};
   }

   private static void super_() {
      case_ = new long[1];
   }

   public Sz_1 protected_() {
      this.int_();
      return (Sz_1)this.class_[0];
   }
}
