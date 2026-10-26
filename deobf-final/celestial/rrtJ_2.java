package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtJ_2 extends rrtO_2 {
   private static String[] protected_;
   private static short[] throws_;
   private static boolean[] case_;
   private static float[] catch_;
   public static Object[] byte_;

   public rrtJ_2(String var1, String var2, int var3) {
      this(new rVe_1(var1), new rVe_1(var2), var3);
   }

   public rrtJ_2(rVi_1 var1, rVi_1 var2, int var3) {
      super((rrtX_2)rrtX_2.staticFieldsdadd6b8236373470b3196397455fa876[2], var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      case_ = new boolean[]{false, false, true};
   }

   @Override
   public void class_(Ml_1 var1, float var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      int var6 = this.case_();
      int var7 = Math.min(var6, 225);
      int var8 = ColorHelper.class_(0.0F, var7);
      int var9 = ColorHelper.class_(90.0F, var7);
      int var10 = ColorHelper.class_(270.0F, var7);
      int var11 = ColorHelper.class_(180.0F, var7);
      rrfD_2.class_(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11, false);
      this.catch_().class_(var1, this.volatile_(), (double)(var2 + 18.0F), (double)(var3 + 5.0F), rrZF.d_, var6);
      this.implements_().class_(var1, this.new_(), (double)(var2 + 5.0F), (double)(var3 + 17.0F), rrZF.d_, var6);
      rrfD_2.class_(var1, (rqO_2)byte_[0], var2 + 5.0F, var3 + 3.0F, 10.0F, 10.0F, ColorHelper.break_(rrZF.d_, var6));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1030757732;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1501966522124803616L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, -14, 109, -19, -94, 90, 102, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void else_() {
      protected_ = new String[]{new String("celestial/images/notification/danger.png")};
   }

   private static void return_() {
      Object[] var0 = new Object[]{new rqO_2("celestial/images/notification/danger.png")};
      byte_ = var0;
   }

   private static void public_() {
      throws_ = new short[]{2, 225, 0};
   }

   private static void synchronized_() {
      catch_ = new float[]{0.0F, 90.0F, 270.0F, 180.0F, 18.0F, 5.0F, 5.0F, 17.0F, 5.0F, 3.0F, 10.0F, 10.0F};
   }
}
