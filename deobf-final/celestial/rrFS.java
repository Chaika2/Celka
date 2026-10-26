package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFS extends rrvR_1 {
   private static byte[] native_;
   private static float[] volatile_;
   private static short[] final_;
   private static String[] package_;
   public Object[] protected_;
   private static boolean[] int_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 46, -128, -94, 14, 39, 13, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFS() {
      super("Keybinds", new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.M();
      rrFs_1 var5 = new rrFs_1(this);
      this.protected_[0] = var5;
      Float var6 = this.E();
      this.protected_[1] = var6;
      this.try_().class_(this.goto_());
   }

   static {
      ntfClinit();
   }

   private static void B() {
      package_ = new String[]{new String("Keybinds")};
   }

   private static void S() {
      int_ = new boolean[]{true, true, true, false, true, false, false, false, false, false, true, true, true};
   }

   private static void s() {
      native_ = new byte[]{-1, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7544726781679561298L;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      float var8 = this.implements_();
      float var9 = this.ao_();
      rrvg_1.class_(this, var1, () -> {
         this.M();
         rrfi_3.break_();
         rrfD_2.protected_(var1, var6, var7 + 12.5F, var8, var9, -1);
         rrfi_3.class_(1);
         ((rrFs_1)this.protected_[0]).class_(var1, var6, var7);
         rrfi_3.class_();
      });
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1999908848;
   }

   private void M() {
      if (this.protected_ == null) {
         this.protected_ = new Object[2];
         Object[] var1 = this.protected_;
         var1[1] = 0.0F;
      }
   }

   private static void G() {
      volatile_ = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 47.0F, 12.5F, 0.0F};
   }

   @Override
   public float goto_() {
      this.M();
      return (Float)this.protected_[1];
   }

   @Override
   public void instanceof_() {
      this.M();
      super.instanceof_();
      this.break_(!((rrFs_1)this.protected_[0]).break_() && (vm_3)import_.class_[73] instanceof FP ? true : int_[3]);
      Float var5 = this.E();
      this.protected_[1] = var5;
      ((rrFs_1)this.protected_[0]).throws_();
   }

   @Override
   public boolean package_() {
      this.M();
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w();
      if (var1.aJ_() && var1.try_()) {
         return !this.super_() && !((rrFs_1)this.protected_[0]).break_() ? int_[5] : int_[4];
      } else {
         return int_[6];
      }
   }

   private static void throw_() {
      final_ = new short[]{0, 1, 0, 73, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0};
   }

   @Override
   public float while_() {
      this.M();
      return ((rrFs_1)this.protected_[0]).finally_() - 2.0F;
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private float E() {
      this.M();
      boolean var1 = false;
      int var2 = 0;

      for (rrFE var4 : ((rrFs_1)this.protected_[0]).class_()) {
         int var5 = (int)((rrFs_1)this.protected_[0]).class_(var4);
         if (!var1 || var5 > var2) {
            var1 = int_[10];
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : volatile_[3];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(this.byte_()) + 47.0F, var6);
   }

   @Override
   public float ao_() {
      return this.while_();
   }
}
