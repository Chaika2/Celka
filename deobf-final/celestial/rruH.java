package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruH extends rrup_1 {
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] break_;
   private static float[] case_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, 107, -44, 24, -67, -89, 19, -15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Supplier<rqO_2> int_() {
      this.synchronized_();
      return (Supplier<rqO_2>)this.break_[3];
   }

   public rruH(
      Supplier<rqO_2> var1,
      Supplier<rjK_2> var2,
      Supplier<rjK_2> var3,
      Supplier<Integer> var4,
      rrZO var5,
      Supplier<String> var6,
      Supplier<rjK_2> var7,
      Supplier<rjK_2> var8,
      Supplier<rjK_2> var9,
      Supplier<Integer> var10,
      Supplier<rji_3> var11
   ) {
      super(var5, var6, var7, var8, var9, var10, var11);
      this.synchronized_();
      this.break_[0] = var2;
      this.break_[1] = var3;
      this.break_[2] = var4;
      this.break_[3] = var1;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new byte[]{4};
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.synchronized_();
      super.class_(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.catch_();
      rjK_2 var7 = this.new_().get();
      rjK_2 var8 = this.package_().get();
      int var9 = ColorHelper.class_((Integer)((Supplier)this.break_[2]).get(), this.finally_());
      rrfD_2.class_(
         var1,
         (rqO_2)((Supplier)this.break_[3]).get(),
         var6.break_() + var7.byte_,
         var6.protected_() + var7.protected_,
         var8.byte_,
         var8.protected_,
         ColorHelper.break_(var9, (int)(255.0F * this.continue_().get()))
      );
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4853165087480461457L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1822078590;
   }

   @Override
   public float finally_() {
      return 1.0F - 0.2F * this.protected_();
   }

   private static void else_() {
      protected_ = new short[]{0, 1, 2, 3, 2, 3, 0, 1, 3};
   }

   public Supplier<rjK_2> new_() {
      this.synchronized_();
      return (Supplier<rjK_2>)this.break_[0];
   }

   public Supplier<rjK_2> package_() {
      this.synchronized_();
      return (Supplier<rjK_2>)this.break_[1];
   }

   private static void return_() {
      case_ = new float[]{255.0F, 1.0F, 0.2F};
   }

   private void synchronized_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }
}
