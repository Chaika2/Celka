package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFd_1 extends rrvR_1 {
   private static short[] native_;
   private static String[] volatile_;
   private static boolean[] final_;
   public Object[] protected_;
   private static float[] package_;
   private static byte[] int_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, -89, -64, 116, -91, -5, -89, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFd_1() {
      super("Potions", new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.E();
      rrFk_1 var5 = new rrFk_1(this);
      this.protected_[0] = var5;
      Float var6 = this.M();
      this.protected_[1] = var6;
      this.try_().class_((Float)this.protected_[1]);
   }

   static {
      ntfClinit();
   }

   private static void B() {
      volatile_ = new String[]{new String("Potions")};
   }

   private static void S() {
      native_ = new short[]{0, 1, 1, 0, 0, 73, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   private static void s() {
      final_ = new boolean[]{true, true, true, false, true, false, false, false, false, false, true, true, true};
   }

   private static void h() {
      package_ = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 70.0F, 12.5F, 0.0F};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1131286600;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 982607933608022961L;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      float var8 = this.implements_();
      float var9 = this.ao_();
      rrvg_1.class_(this, var1, () -> {
         this.E();
         rrfi_3.break_();
         rrfD_2.protected_(var1, var6, var7 + 12.5F, var8, var9, -1);
         rrfi_3.class_(1);
         ((rrFk_1)this.protected_[0]).class_(var1, var6, var7);
         rrfi_3.class_();
      });
   }

   private float M() {
      this.E();
      boolean var1 = false;
      int var2 = 0;

      for (rrFz_1 var4 : ((rrFk_1)this.protected_[0]).class_()) {
         int var5 = (int)((rrFk_1)this.protected_[0]).class_(var4);
         if (!var1 || var5 > var2) {
            var1 = final_[10];
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : package_[3];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(this.byte_()) + 70.0F, var6);
   }

   private static void G() {
      int_ = new byte[]{-1, 2};
   }

   @Override
   public float goto_() {
      this.E();
      return (Float)this.protected_[1];
   }

   @Override
   public void instanceof_() {
      this.E();
      super.instanceof_();
      this.break_(!((rrFk_1)this.protected_[0]).private_() && (vm_3)import_.class_[73] instanceof FP ? true : final_[3]);
      Float var5 = this.M();
      this.protected_[1] = var5;
      ((rrFk_1)this.protected_[0]).throws_();
   }

   @Override
   public boolean package_() {
      this.E();
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w();
      if (var1.aJ_() && var1.this_() && var1.throw_()) {
         return !this.super_() && !((rrFk_1)this.protected_[0]).private_() ? final_[5] : final_[4];
      } else {
         return final_[6];
      }
   }

   public rrFk_1 throw_() {
      this.E();
      return (rrFk_1)this.protected_[0];
   }

   @Override
   public float while_() {
      this.E();
      return ((rrFk_1)this.protected_[0]).finally_() - 2.0F;
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private void E() {
      if (this.protected_ == null) {
         this.protected_ = new Object[2];
         Object[] var1 = this.protected_;
         var1[1] = 0.0F;
      }
   }

   @Override
   public void as_() {
      this.E();
      super.as_();
      ((rrFk_1)this.protected_[0]).catch_();
   }

   @Override
   public float ao_() {
      return this.while_();
   }
}
