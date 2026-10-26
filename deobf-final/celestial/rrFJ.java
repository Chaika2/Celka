package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFJ extends rrvR_1 {
   private static String[] native_;
   private static float[] volatile_;
   public Object[] protected_;
   private static short[] final_;
   private static boolean[] package_;
   private static byte[] int_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, 90, 104, -118, 125, -106, -124, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFJ() {
      super("Pickup Viewer", new AnimValue(0.5F, true), new AnimValue(0.5F, true));
      this.s();
      rrFO var5 = new rrFO(this);
      this.protected_[0] = var5;
      this.try_().class_(this.goto_());
   }

   static {
      ntfClinit();
   }

   private static void B() {
      package_ = new boolean[]{true, true, true, false, false, false, false, true, false, true, true};
   }

   private static void S() {
      volatile_ = new float[]{0.5F, 0.5F, 0.0F, 50.0F, 2.0F, 13.0F};
   }

   private void s() {
      if (this.protected_ == null) {
         this.protected_ = new Object[1];
         Object[] var1 = this.protected_;
      }
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      float var8 = this.implements_();
      float var9 = this.ao_();
      rrvg_1.class_(this, var1, () -> {
         this.s();
         rrfi_3.break_();
         rrfD_2.protected_(var1, var6, var7 + 13.0F, var8, var9, -1);
         rrfi_3.class_(1);
         ((rrFO)this.protected_[0]).class_(var1, var6, var7);
         rrfi_3.class_();
      });
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 360793264;
   }

   public void class_(rrFK var1) {
      this.s();
      ((rrFO)this.protected_[0]).class_(var1);
   }

   public void class_(rrLf_1 var1) {
      this.s();
      ((rrFO)this.protected_[0]).class_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -585551402968958234L;
   }

   public void class_(rrAM var1) {
      this.s();
      ((rrFO)this.protected_[0]).class_(var1);
   }

   private static void M() {
      int_ = new byte[]{-1};
   }

   private static void G() {
      native_ = new String[]{new String("Pickup Viewer")};
   }

   @Override
   public float goto_() {
      this.s();
      boolean var1 = false;
      int var2 = 0;

      for (rrFX var4 : ((rrFO)this.protected_[0]).break_()) {
         int var5 = (int)((rrFO)this.protected_[0]).class_(var4);
         if (!var1 || var5 > var2) {
            var1 = package_[7];
            var2 = var5;
         }
      }

      float var6 = var1 ? (float)var2 : volatile_[2];
      return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_().break_(this.byte_()) + 50.0F, var6);
   }

   @Override
   public void instanceof_() {
      this.s();
      super.instanceof_();
      ((rrFO)this.protected_[0]).throws_();
   }

   @Override
   public boolean package_() {
      this.s();
      return this.throw_() && !((rrFO)this.protected_[0]).break_().isEmpty() ? true : package_[3];
   }

   public boolean throw_() {
      return false;
   }

   @Override
   public float while_() {
      this.s();
      return ((rrFO)this.protected_[0]).finally_() - 2.0F;
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private static void E() {
      final_ = new short[11];
   }

   @Override
   public float ao_() {
      return this.while_();
   }
}
