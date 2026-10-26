package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GQ implements rq_3 {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   @Override
   public int byte_() {
      return ((rq_3)this.class_[0]).byte_();
   }

   public GQ(GW var1, rq_3 var2, int var3, int var4) {
      this.catch_();
      this.class_[3] = var1;
      this.class_[0] = var2;
      Integer var11 = var3;
      this.class_[1] = var11;
      Integer var12 = var4;
      this.class_[2] = var12;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 825026950;
   }

   @Override
   public boolean class_(int var1, int var2, int var3, xc_3 var4) {
      return rq_3.super.class_(var1, var2, var3, var4)
            && var2 >= this.class_[1]
            && var2 <= this.class_[2]
            && ((rq_3)this.class_[0]).class_(var1, var2, var3, var4)
         ? true
         : protected_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, 70, 106, 91, -36, 15, 104, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      return ((rq_3)this.class_[0]).class_(var1, var2, var3, var4, (List<xc_3>)((GW)this.class_[3]).break_[10]);
   }

   @Override
   public int class_() {
      return ((rq_3)this.class_[0]).class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2016567099564498140L;
   }

   @Override
   public int break_() {
      return ((rq_3)this.class_[0]).break_();
   }

   private static void throws_() {
      byte_ = new short[]{3, 0, 1, 2, 0, 3, 10, 1, 2, 0, 0, 0, 0, 0};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   private static void case_() {
      protected_ = new boolean[]{true, false, true, false, false};
   }

   @Override
   public void protected_() {
      ((rq_3)this.class_[0]).protected_();
   }

   private static void private_() {
      break_ = new byte[]{4, 2};
   }
}
