package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtq_3 extends rrtm_3 {
   public Object[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   private static boolean[] native_;
   private static float[] volatile_;

   @Override
   public void byte_(int var1, int var2, int var3) {
      this.public_();
      super.byte_(var1, var2, var3);
      ((rrtY_2)this.byte_[2]).byte_(var1, var2, var3);
   }

   public rrtq_3(rrtN_2 var1, rrIv_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.public_();
      this.byte_[0] = var1;
      this.byte_[1] = var2;
      rrtY_2 var13 = new rrtY_2(this, var2, (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[0]);
      this.byte_[2] = var13;
      ((rrIv_1)this.byte_[1]).class_((rrtY_2)this.byte_[2]);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.public_();
      if (var4 == 0 && super.class_(var1, var2, var3, var4, var5)) {
         ((rrtY_2)this.byte_[2]).class_(var1, var2, var3, var4, false);
         return true;
      } else {
         return native_[2];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1713167873914147669L;
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.public_();
      ((rrtY_2)this.byte_[2]).class_(var1, var2);
      return super.class_(var1, var2);
   }

   @Override
   public void class_(int var1, int var2, int var3) {
      this.public_();
      super.class_(var1, var2, var3);
      ((rrtY_2)this.byte_[2]).class_(var1, var2, var3);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4) {
      this.public_();
      super.class_(var1, var2, var3, var4);
      ((rrtY_2)this.byte_[2]).throws_();
      return false;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.class_(var1, var2, var3, var4);
      rruv_1 var5 = this.volatile_();
      float var6 = this.package_();
      float var7 = this.final_();
      float var8 = this.new_();
      float var9 = var5.class_();
      this.private_().interface_().class_(var1, () -> {
         this.public_();
         ((rrtY_2)this.byte_[2]).class_(var1, var2, var6, var7, var8, var9, var3, var4, false);
      });
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1225413495;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, -128, 122, 46, -75, 15, -86, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<?> finally_() {
      this.public_();
      return (rrIv_1)this.byte_[1];
   }

   private static void goto_() {
      volatile_ = new float[]{3.0F, 10.0F};
   }

   @Override
   public void case_() {
      this.public_();
      super.case_();
      ((rrtY_2)this.byte_[2]).private_();
   }

   @Override
   public void else_() {
      this.public_();
      super.else_();
      ((rrtY_2)this.byte_[2]).protected_();
   }

   private static void return_() {
      throws_ = new byte[]{3};
   }

   private static void while_() {
      native_ = new boolean[]{false, true, false, false, false};
   }

   private void public_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[3];
         Object[] var1 = this.byte_;
      }
   }

   @Override
   public rrtN_2 private_() {
      this.public_();
      return (rrtN_2)this.byte_[0];
   }

   @Override
   public rruv_1 volatile_() {
      return new rruv_1(this.package_(), this.final_() - 3.0F, this.new_(), this.continue_() - 10.0F);
   }

   private static void synchronized_() {
      protected_ = new short[]{0, 1, 0, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2};
   }
}
