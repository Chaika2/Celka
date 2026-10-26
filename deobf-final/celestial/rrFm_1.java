package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFm_1 extends rrFl_1<rrTB> {
   private static float[] break_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] class_;
   private static short[] case_;

   @Override
   public Collection<rrTB> byte_() {
      return ((rrTs_1)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[0]).class_();
   }

   public rrFm_1(rrFu_1 var1) {
      this.implements_();
      Map var6 = ((rrTs_1)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[0]).break_();
      this.class_[1] = var6;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -78534862;
   }

   public float class_(rrTB var1) {
      String var2 = var1.throws_() + var1.case_();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(var2) + 20.0F;
   }

   @Override
   public void class_(Ml_1 var1, float var2, float var3) {
      this.implements_();
      rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      this.break_(18.0F);
      float var5 = this.finally_();
      float var6 = this.protected_();
      int var7 = (int)(255.0F * ((rrFu_1)this.class_[0]).long_());
      int var8 = ColorHelper.break_(rrZF.d_, var7);
      rrfD_2.protected_((lD_2)rrfD_2.class_[7]);
      var4.class_(MinecraftAccessor.strictfp_);

      for (rrTB var11 : ((rrTs_1)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[0]).class_()) {
         String var12 = var11.case_();
         float var13 = var2 + 3.0F;
         float var14 = var3 + var5;
         var4.break_(var1, MinecraftAccessor.strictfp_, var11.throws_(), (double)(var13 + 7.0F), (double)var14, var8, false, false);
         var4.break_(
            var1,
            MinecraftAccessor.strictfp_,
            var12,
            (double)(var13 + ((rrFu_1)this.class_[0]).implements_() - var4.break_(var12) - 5.0F),
            (double)var14,
            var8,
            false,
            false
         );
         rrfD_2.class_(var1, (lD_2)rrfD_2.class_[7], var13 + 2.0F, var14 + 1.5F, 5.0F, ColorHelper.break_(var11.break_(), var7), 1.0F);
         var5 += var6;
         this.class_(var6);
      }

      rrfD_2.break_((lD_2)rrfD_2.class_[7]);
      var4.byte_(MinecraftAccessor.strictfp_);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5180515657812772426L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, 31, 57, -94, -119, -40, -79, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFu_1 class_() {
      this.implements_();
      return (rrFu_1)this.class_[0];
   }

   public Map<rrTS, List<rrTB>> break_() {
      this.implements_();
      return (Map<rrTS, List<rrTB>>)this.class_[1];
   }

   @Override
   public void throws_() {
      super.throws_();

      for (rrTB var3 : this.byte_()) {
         rrTE[] var4 = var3.catch_();
         LocalDateTime var5 = LocalDateTime.now((ZoneId)rrTG.class_[0]);
         LocalDateTime var6 = rrTG.class_(var4, var5);
         var3.class_(var6);
         var3.class_(rrTG.break_(var5, var6));
         var3.class_(ColorHelper.break_(ColorHelper.break_(Color.GREEN.getRGB(), Color.RED.getRGB(), var3.byte_()), 0.5F));
         var3.break_(rrTG.class_(var5, var6));
      }
   }

   private static void catch_() {
      case_ = new short[]{0, 1, 0, 0, 0, 7, 0, 0, 7, 7, 0, 0, 0, 0, 1};
   }

   private static void extends_() {
      throws_ = new byte[]{2};
   }

   private static void case_() {
      break_ = new float[]{18.0F, 255.0F, 3.0F, 7.0F, 5.0F, 2.0F, 1.5F, 5.0F, 1.0F, 0.5F, 20.0F, 10.0F};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public float protected_() {
      return 10.0F;
   }

   private static void private_() {
      protected_ = new boolean[4];
   }
}
