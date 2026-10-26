package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFu_1 extends rrvR_1 {
   public Object[] protected_;
   private static byte[] native_;
   private static short[] volatile_;
   private static String[] final_;
   private static boolean[] package_;
   private static float[] int_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 108, 92, 122, -94, -5, 39, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFu_1() {
      super("Schedules", new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.throw_();
      rrFm_1 var5 = new rrFm_1(this);
      this.protected_[0] = var5;
      Float var6 = this.E();
      this.protected_[1] = var6;
      this.try_().class_((Float)this.protected_[1]);
   }

   static {
      ntfClinit();
   }

   private static void B() {
      final_ = new String[]{new String("Schedules")};
   }

   private static void S() {
      native_ = new byte[]{2};
   }

   private static void s() {
      int_ = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 70.0F, 0.0F};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1893052533;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      rrvg_1.class_(this, var1, () -> {
         this.throw_();
         ((rrFm_1)this.protected_[0]).class_(var1, var6, var7);
      });
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4732958983921704167L;
   }

   private static void M() {
      package_ = new boolean[]{true, true, true, false, false, false, false, true, true};
   }

   private static void G() {
      volatile_ = new short[]{0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0};
   }

   @Override
   public float goto_() {
      this.throw_();
      return (Float)this.protected_[1];
   }

   @Override
   public void instanceof_() {
      this.throw_();
      super.instanceof_();
      Float var5 = this.E();
      this.protected_[1] = var5;
      ((rrFm_1)this.protected_[0]).throws_();
   }

   @Override
   public boolean package_() {
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w();
      return var1.aJ_() && var1.super_() ? true : package_[3];
   }

   private void throw_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[2];
         Object[] var1 = this.protected_;
         var1[1] = 0.0F;
      }
   }

   @Override
   public float while_() {
      this.throw_();
      return ((rrFm_1)this.protected_[0]).finally_() - 2.0F;
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private float E() {
      this.throw_();
      boolean var1 = false;
      int var2 = 0;

      for (List var4 : ((rrFm_1)this.protected_[0]).break_().values()) {
         for (rrTB var6 : var4) {
            int var7 = (int)((rrFm_1)this.protected_[0]).class_(var6);
            if (!var1 || var7 > var2) {
               var1 = package_[7];
               var2 = var7;
            }
         }
      }

      float var8 = var1 ? (float)var2 : int_[3];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_().break_(this.byte_()) + 70.0F, var8);
   }
}
