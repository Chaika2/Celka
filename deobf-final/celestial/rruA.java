package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruA extends rruu_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   private static int[] throws_;
   private static byte[] case_;
   private static float[] catch_;
   public Object[] break_;

   private int byte_(boolean var1) {
      return var1 ? -1 : case_[2];
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, -109, -64, -79, -18, -62, -32, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Supplier<Float> int_() {
      this.synchronized_();
      return (Supplier<Float>)this.break_[4];
   }

   public rruA(Supplier<Boolean> var1, Supplier<rjK_2> var2, Supplier<rjK_2> var3) {
      this.synchronized_();
      AnimValue var8 = new AnimValue(0.6F, false);
      this.break_[3] = var8;
      Supplier var9 = () -> 1.0F;
      this.break_[4] = var9;
      this.break_[0] = var1;
      this.break_[1] = var2;
      this.break_[2] = var3;
      ((AnimValue)this.break_[3]).class_((float)this.byte_((Boolean)((Supplier)this.break_[0]).get()));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new float[]{0.6F, 255.0F, 0.0F, 90.0F, 270.0F, 180.0F, 3.5F, 3.5F, 3.5F, 3.5F, 5.0F, 2.0F, 7.5F, 1.5F, 1.5F, 1.0F};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2022885300;
   }

   @Override
   public Supplier<rjK_2> class_() {
      this.synchronized_();
      return (Supplier<rjK_2>)this.break_[1];
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.synchronized_();
      super.class_(var1, var2, var3, var4, var5);
      rruv_1 var6 = this.catch_();
      float var7 = var6.break_();
      float var8 = var6.protected_();
      float var9 = var6.byte_();
      float var10 = var6.class_();
      boolean var11 = (Boolean)((Supplier)this.break_[0]).get();
      int var12 = (int)(255.0F * (Float)((Supplier)this.break_[4]).get());
      int var13 = ColorHelper.break_(6781311, var12);
      int var14 = var11 ? ColorHelper.break_(ColorHelper.class_(0.0F), var12) : var13;
      int var15 = var11 ? ColorHelper.break_(ColorHelper.class_(90.0F), var12) : var13;
      int var16 = var11 ? ColorHelper.break_(ColorHelper.class_(270.0F), var12) : var13;
      int var17 = var11 ? ColorHelper.break_(ColorHelper.class_(180.0F), var12) : var13;
      int var18 = this.byte_(var11);
      ((AnimValue)this.break_[3]).break_((float)var18);
      float var19 = ((AnimValue)this.break_[3]).byte_();
      if (ClickGuiTheme.class_()) {
         rrfD_2.class_(var1, var7, var8, var9, var10, 6, var14);
      }

      rrfD_2.break_(var1, var7, var8, var9, var10, 3.5F, 3.5F, 3.5F, 3.5F, var14, var15, var16, var17);
      rrfD_2.class_(var1, (double)(var7 + var9 - 5.0F - var19), (double)(var8 + var10 / 2.0F), 7.5F, ColorHelper.break_(rrZF.d_, var12), rrvk_1.class_());
   }

   public rruA class_(Supplier<Float> var1) {
      this.synchronized_();
      this.break_[4] = var1;
      return this;
   }

   @Override
   public rruv_1 break_() {
      return super.break_().class_(1.5F, 1.5F);
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5698141745170629122L;
   }

   @Override
   public Supplier<rjK_2> extends_() {
      this.synchronized_();
      return (Supplier<rjK_2>)this.break_[2];
   }

   private static void continue_() {
      throws_ = new int[]{6781311};
   }

   private static void else_() {
      case_ = new byte[]{6, -1, 8, 5};
   }

   public AnimValue new_() {
      this.synchronized_();
      return (AnimValue)this.break_[3];
   }

   public Supplier<Boolean> package_() {
      this.synchronized_();
      return (Supplier<Boolean>)this.break_[0];
   }

   private static void super_() {
      byte_ = new short[]{3, 4, 0, 1, 2, 3, 0, 4, 0, 4, 3, 3, 1, 2, 0, 3, 4};
   }

   private static void public_() {
      protected_ = new boolean[1];
   }

   private void synchronized_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
      }
   }
}
