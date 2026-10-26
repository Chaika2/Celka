package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HudWidget extends rrvR_1 {
   private static boolean[] native_;
   private static byte[] volatile_;
   private static float[] final_;
   private static short[] package_;
   public Object[] protected_;
   private static String[] int_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, 52, 79, -54, -56, -45, 75, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public HudWidget() {
      super("Staff Viewer", new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.B();
      rrFZ var5 = new rrFZ(this);
      this.protected_[0] = var5;
      Float var6 = this.S();
      this.protected_[1] = var6;
      this.try_().class_((Float)this.protected_[1]);
   }

   static {
      ntfClinit();
   }

   private void B() {
      if (this.protected_ == null) {
         this.protected_ = new Object[2];
         Object[] var1 = this.protected_;
         var1[1] = 0.0F;
      }
   }

   private float S() {
      this.B();
      boolean var1 = false;
      int var2 = 0;

      for (rrqr_3 var4 : ((rrFZ)this.protected_[0]).byte_()) {
         int var5 = (int)((rrFZ)this.protected_[0]).class_(var4);
         if (!var1 || var5 > var2) {
            var1 = native_[10];
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : final_[3];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(this.byte_()) + 47.0F, var6);
   }

   private static void s() {
      int_ = new String[]{new String("Staff Viewer")};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -281692866;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      float var8 = this.implements_();
      float var9 = this.ao_();
      rrvg_1.class_(this, var1, () -> {
         this.B();
         rrfi_3.break_();
         rrfD_2.protected_(var1, var6, var7 + 12.5F, var8, var9, -1);
         rrfi_3.class_(1);
         ((rrFZ)this.protected_[0]).class_(var1, var6, var7);
         rrfi_3.class_();
      });
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6629523933158757609L;
   }

   private static void M() {
      volatile_ = new byte[]{-1, 2};
   }

   private static void G() {
      package_ = new short[]{0, 1, 1, 0, 73, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public float goto_() {
      this.B();
      return (Float)this.protected_[1];
   }

   @Override
   public void instanceof_() {
      this.B();
      super.instanceof_();
      this.break_(!((rrFZ)this.protected_[0]).class_() && (vm_3)import_.class_[73] instanceof FP ? true : native_[3]);
      Float var5 = this.S();
      this.protected_[1] = var5;
      ((rrFZ)this.protected_[0]).throws_();
   }

   @Override
   public boolean package_() {
      this.B();
      StaffViewer var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().o();
      if (!var1.aJ_()) {
         return native_[6];
      } else {
         return !this.super_() && !((rrFZ)this.protected_[0]).class_() ? native_[5] : native_[4];
      }
   }

   private static void throw_() {
      native_ = new boolean[]{true, true, true, false, true, false, false, false, false, false, true, true, true};
   }

   @Override
   public float while_() {
      this.B();
      return ((rrFZ)this.protected_[0]).finally_() - 2.0F;
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private static void E() {
      final_ = new float[]{0.5F, 0.5F, 2.0F, 0.0F, 47.0F, 12.5F, 0.0F};
   }

   @Override
   public float ao_() {
      return this.while_();
   }
}
