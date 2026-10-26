package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZn_1 extends rruH {
   private static boolean[] throws_;
   public Object[] protected_;
   private static short[] case_;
   private static float[] catch_;

   public rrZn_1(
      Category var1,
      rrZO var2,
      Supplier<rqO_2> var3,
      Supplier<rjK_2> var4,
      Supplier<rjK_2> var5,
      Supplier<Integer> var6,
      Supplier<String> var7,
      Supplier<rjK_2> var8,
      Supplier<rjK_2> var9,
      Supplier<rjK_2> var10,
      Supplier<Integer> var11,
      Supplier<rji_3> var12
   ) {
      super(var3, var4, var5, var6, var2, var7, var8, var9, var10, var11, var12);
      this.synchronized_();
      this.protected_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public Category this_() {
      this.synchronized_();
      return (Category)this.protected_[0];
   }

   @Override
   public void class_(boolean var1) {
      super.class_(!var1 && this.native_() ? throws_[1] : throws_[0]);
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4272554677177023593L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 372682864;
   }

   public static String throws_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -120, 51, -100, 77, 109, -82, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float finally_() {
      return 0.7F + 0.3F * this.protected_();
   }

   private static void else_() {
      catch_ = new float[]{0.7F, 0.3F};
   }

   private static void return_() {
      case_ = new short[2];
   }

   private static void public_() {
      throws_ = new boolean[]{true, false, true};
   }

   private void synchronized_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[1];
         Object[] var1 = this.protected_;
      }
   }
}
