package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruy_1 extends rrun_1 {
   public Object[] byte_;
   private static float[] protected_;
   private static short[] throws_;
   private static byte[] case_;
   private static boolean[] catch_;

   private static void int_() {
      catch_ = new boolean[2];
   }

   public rruy_1(
      Supplier<String> var1,
      rrZO var2,
      Supplier<Integer> var3,
      Supplier<rjK_2> var4,
      Supplier<rqO_2> var5,
      Supplier<rjK_2> var6,
      Supplier<rjK_2> var7,
      Supplier<Integer> var8
   ) {
      super(var5, var6, var7, var8);
      this.new_();
      this.byte_[3] = var1;
      this.byte_[0] = var2;
      this.byte_[2] = var3;
      this.byte_[1] = var4;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new short[]{3, 0, 2, 1, 1, 2, 0, 3};
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.new_();
      super.class_(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.catch_();
      rjK_2 var7 = (rjK_2)((Supplier)this.byte_[1]).get();
      int var8 = ColorHelper.class_((Integer)((Supplier)this.byte_[2]).get(), this.finally_());
      ((rrZO)this.byte_[0])
         .break_(
            var1,
            (String)((Supplier)this.byte_[3]).get(),
            (double)(var6.break_() + var7.byte_),
            (double)(var6.protected_() + var7.protected_),
            ColorHelper.break_(var8, (int)(255.0F * this.package_().get())),
            false,
            false
         );
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1081492013;
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6076455165781366727L;
   }

   private static void continue_() {
      protected_ = new float[]{255.0F};
   }

   private void new_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[4];
         Object[] var1 = this.byte_;
      }
   }

   private static void super_() {
      case_ = new byte[]{4};
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, -81, 47, -112, 55, -109, -53, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
