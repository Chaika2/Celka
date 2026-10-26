package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mb_1 extends rI_2 {
   private static short[] protected_;
   private static boolean[] throws_;
   public Object[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, -43, -94, -37, 122, 112, 27, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Mb_1(rq_3 var1, rja_3 var2, rY_2[] var3) {
      super(var1);
      this.throws_();
      rY_2[] var8 = Stream.of(var3)
         .map(var1x -> var1x.class_(rpr_3.WEST, var2.b_()).class_(rpr_3.DOWN, var2.c_()).class_(rpr_3.NORTH, var2.d_()))
         .toArray(rY_2[]::new);
      this.byte_[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -268265936714585139L;
   }

   @Override
   public boolean break_(int var1, int var2, int var3, xc_3 var4) {
      this.throws_();

      for (rY_2 var8 : (rY_2[])this.byte_[0]) {
         if (var1 >= (Integer)var8.class_().break_[0]
            && var2 >= (Integer)var8.class_().break_[1]
            && var3 >= (Integer)var8.class_().break_[2]
            && var1 <= (Integer)var8.protected_().break_[0]
            && var2 <= (Integer)var8.protected_().break_[1]
            && var3 <= (Integer)var8.protected_().break_[2]) {
            return true;
         }
      }

      return throws_[2];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2105072063;
   }

   private void throws_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }

   private static void catch_() {
      protected_ = new short[]{0, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void case_() {
      throws_ = new boolean[]{false, true, false, true};
   }
}
