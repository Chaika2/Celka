package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvy_1 extends cG_2 {
   private static float[] finally_;
   private static boolean[] extends_;
   private static short[] native_;
   public Object[] break_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-53, 101, -52, -66, -76, 51, -55, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void long_() {
      finally_ = new float[1];
   }

   private static void float_() {
      extends_ = new boolean[]{false, false, false, true, true, false, false, true};
   }

   public rrvy_1(cG_2 var1) {
      super((gm_3)var1.class_[5], var1.sv());
      this.public_();
      this.break_[0] = var1;
      this.protected_(var1);
   }

   static {
      ntfClinit();
   }

   public void class_(int var1, BiConsumer<Integer, rrvy_1> var2) {
      this.public_();

      for (int var3 = 0; var3 < var1; var3++) {
         this.private_(
            new rjU_2(
               (double)((Float)((cG_2)this.break_[0]).private_[42]).floatValue(),
               (double)((Float)((cG_2)this.break_[0]).private_[43]).floatValue(),
               (double)((Float)((cG_2)this.break_[0]).private_[44]).floatValue()
            )
         );
         if (var2 != null) {
            var2.accept(var3, this);
         }
      }
   }

   public void class_(int var1) {
      this.class_(var1, null);
   }

   @Override
   public rdn_3 class_(rXQ var1) {
      this.public_();
      return ((cG_2)this.break_[0]).class_(var1);
   }

   @Override
   public void class_(rdn_3 var1, int var2) {
   }

   @Override
   public void class_(rXQ var1, rdn_3 var2) {
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8676723994713416295L;
   }

   @Override
   public void class_(rqA_2 var1, float var2, float var3) {
   }

   @Override
   public void U() {
   }

   @Override
   public void break_(rfH_2 var1, xc_3 var2) {
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return false;
   }

   @Override
   public void Sk() {
   }

   @Override
   public Aw_1 continue_() {
      return null;
   }

   public List<Float> else_() {
      this.public_();
      ArrayList var1 = new ArrayList();
      short var2 = 1000;

      for (int var3 = 0; !this.BL() && var3 < var2; var3++) {
         float var4 = (Float)this.throws_[31];
         this.private_(
            new rjU_2(
               (double)((Float)((cG_2)this.break_[0]).private_[42]).floatValue(),
               (double)((Float)((cG_2)this.break_[0]).private_[43]).floatValue(),
               (double)((Float)((cG_2)this.break_[0]).private_[44]).floatValue()
            )
         );
         if ((Float)this.throws_[31] != 0.0F && (Float)this.throws_[31] != var4) {
            var1.add((Float)this.throws_[31]);
         }
      }

      return var1;
   }

   private static int else_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -826193530;
   }

   @Override
   public boolean implements_() {
      this.public_();
      return ((cG_2)this.break_[0]).implements_();
   }

   @Override
   public boolean try_() {
      return true;
   }

   private static void static_() {
      native_ = new short[]{5, 0, 0, 42, 0, 43, 0, 44, 1000, 31, 0, 42, 0, 43, 0, 44, 31, 31, 31, 0, 0, 0, 0, 0, 0};
   }

   private void public_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   @Override
   public void private_(float var1) {
   }

   @Override
   public boolean native_() {
      this.public_();
      return ((cG_2)this.break_[0]).native_();
   }

   @Override
   public boolean SG() {
      return false;
   }

   @Override
   public Iterable<rdn_3> PV() {
      this.public_();
      return ((cG_2)this.break_[0]).PV();
   }

   @Override
   public void Bb() {
   }

   @Override
   public boolean Sy() {
      this.public_();
      return ((cG_2)this.break_[0]).Sy();
   }

   @Override
   public boolean Sp() {
      return false;
   }

   @Override
   public void St() {
   }

   @Override
   public rpZ_2 Su() {
      this.public_();
      return ((cG_2)this.break_[0]).Su();
   }

   @Override
   public boolean SO() {
      return true;
   }

   @Override
   public void Sv() {
   }
}
