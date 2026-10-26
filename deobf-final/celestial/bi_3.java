package celestial;

import it.unimi.dsi.fastutil.longs.Long2DoubleOpenHashMap;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bi_3 {
   private static short[] break_;
   private static double[] byte_;
   private static boolean[] protected_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new double[]{1.0, 1.0};
   }

   public bi_3(Ps_1 var1, a_1 var2, EZ var3) {
      this(var2, var3);

      for (be_3 var5 : be_3.class_(var1)) {
         var5.class_((Long2DoubleOpenHashMap)this.class_[0]);
      }

      PP.a_.byte_("Favoring size: " + ((Long2DoubleOpenHashMap)this.class_[0]).size());
   }

   public bi_3(a_1 var1, EZ var2) {
      this.protected_();
      Long2DoubleOpenHashMap var9 = new Long2DoubleOpenHashMap();
      this.class_[0] = var9;
      ((Long2DoubleOpenHashMap)this.class_[0]).defaultReturnValue(1.0);
      double var3 = (Double)var2.break_[25];
      if (var3 != 1.0 && var1 != null) {
         var1.break_().forEach(var3x -> ((Long2DoubleOpenHashMap)this.class_[0]).put(rU_2.class_(var3x), var3));
      }
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1328443734;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, 22, -103, 62, 106, 124, -105, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double class_(long var1) {
      return ((Long2DoubleOpenHashMap)this.class_[0]).get(var1);
   }

   public boolean class_() {
      return ((Long2DoubleOpenHashMap)this.class_[0]).isEmpty();
   }

   private static void break_() {
      break_ = new short[]{0, 0, 0, 0, 25, 0, 0, 0};
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 641646542431286422L;
   }

   private static void throws_() {
      protected_ = new boolean[]{true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
