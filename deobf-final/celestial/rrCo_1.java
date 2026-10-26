package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCo_1 extends rrTF<Flight> {
   private static double[] break_;
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] case_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         this.class_[0] = 0;
      }
   }

   public rrCo_1(Flight var1) {
      super(var1);
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1746503085;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6506181075765063635L;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.byte_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && ((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_) {
         int var10002 = (Integer)this.class_[0] + 1;
         Integer var6 = var10002;
         this.class_[0] = var6;
         if (var10002 > 70) {
            ((cb_3)import_.class_[57]).rv().byte_ = -0.2;
            Integer var7 = 0;
            this.class_[0] = var7;
         } else {
            ((cb_3)import_.class_[57]).sl();
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, 70, 89, -52, 104, 22, -97, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      protected_ = new byte[]{70};
   }

   private static void break_() {
      byte_ = new short[]{0, 57, 17, 0, 0, 57, 0, 57, 0};
   }

   private static void throws_() {
      case_ = new boolean[]{true, false, false, true, false, false};
   }

   private static void protected_() {
      break_ = new double[]{-0.2};
   }

   @Override
   public boolean aK_() {
      this.byte_();
      Integer var5 = 0;
      this.class_[0] = var5;
      return super.aK_();
   }
}
