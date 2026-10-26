package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIz_1 extends Setting<Integer> {
   private static boolean[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static byte[] throws_;

   private void int_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public rrIz_1(String var1, int var2) {
      super(var1, var2);
      this.int_();
      this.class_[0] = var1;
      Integer var8 = var2;
      this.break_[1] = var8;
      Supplier var9 = () -> true;
      this.break_[0] = var9;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4854059563237423760L;
   }

   public Supplier<Boolean> class_() {
      this.int_();
      return (Supplier<Boolean>)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 363394284;
   }

   public rrIz_1 break_() {
      this.int_();
      Supplier var5 = () -> false;
      this.break_[0] = var5;
      return this;
   }

   public Integer finally_() {
      this.int_();
      return (Integer)this.break_[1];
   }

   private static void extends_() {
      protected_ = new short[]{0, 1, 0, 0, 0, 1};
   }

   private static void package_() {
      throws_ = new byte[]{2};
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, -35, 35, -42, 68, -54, -10, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void final_() {
      byte_ = new boolean[]{false, true};
   }
}
