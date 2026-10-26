package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFO extends rrFl_1<rrFX> {
   private static boolean[] protected_;
   public Object[] class_;
   private static float[] throws_;
   private static byte[] case_;
   public static Object[] break_;
   private static short[] catch_;
   private static long[] private_;
   private static String[] implements_;

   @Override
   public Collection<rrFX> byte_() {
      this.catch_();
      return (List)this.class_[0];
   }

   public rrFO(rrFJ var1) {
      this.catch_();
      ArrayList var6 = new ArrayList();
      this.class_[0] = var6;
      rrFh_1 var7 = new rrFh_1();
      this.class_[2] = var7;
      this.class_[1] = var1;
   }

   static {
      ntfClinit();
   }

   public void class_(rrLf_1 var1) {
      this.catch_();
      if (((rrFJ)this.class_[1]).throw_()) {
         iB_2 var2 = var1.break_();
         if (var2 != (cb_3)MinecraftAccessor.import_.class_[57]) {
            rdn_3 var3 = var1.class_();
            if (var3.protected_("don-item") || var3.protected_("gift")) {
               rrFX var4 = new rrFX(var2, var3);
               if (((List)this.class_[0]).contains(var4)) {
                  rrFX var5 = (rrFX)((List)this.class_[0]).get(((List)this.class_[0]).indexOf(var4));
                  var5.class_(var5.case_() + var3.char_());
                  var5.break_(0);
               } else {
                  ((List)this.class_[0]).add(var4);
               }

               if (!((List)this.class_[0]).isEmpty()) {
                  ((List)this.class_[0]).sort((rrFh_1)this.class_[2]);
               }
            }
         }
      }
   }

   public float class_(rrFX var1) {
      rVi_1 var2 = var1.throws_();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_().break_(var2.byte_()) + 7.0F;
   }

   public void class_(rrAM var1) {
      this.catch_();

      for (rrFX var3 : (List)this.class_[0]) {
         var3.class_(false);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, 5, -73, 116, 126, -16, -36, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrFJ class_() {
      this.catch_();
      return (rrFJ)this.class_[1];
   }

   @Override
   public void class_(Ml_1 var1, float var2, float var3) {
      this.catch_();
      rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      this.break_(18.0F);
      float var5 = this.finally_();
      float var6 = this.protected_();
      var4.class_(MinecraftAccessor.strictfp_);

      for (rrFX var8 : (List)this.class_[0]) {
         AnimValue var9 = var8.protected_();
         var8.class_(!var8.protected_().new_() ? true : protected_[1]);
         float var10 = var6 * 0.8F * var9.continue_();
         float var11 = var2 + 3.0F;
         float var12 = var3 + var5 - var10;
         rVi_1 var13 = var8.throws_();
         int var14 = (int)(255.0F * var9.byte_());
         var4.break_(var1, var13, (double)var11, (double)var12, rrZF.d_, var14);
         float var15 = var6 * var9.byte_();
         var5 += var15;
         this.class_(var15);
      }

      var4.byte_(MinecraftAccessor.strictfp_);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2123269686;
   }

   public void class_(rrFK var1) {
      this.catch_();
      ((List)this.class_[0]).clear();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6088166958131759015L;
   }

   public List<rrFX> break_() {
      this.catch_();
      return (List<rrFX>)this.class_[0];
   }

   @Override
   public void throws_() {
      this.catch_();
      super.throws_();
      if (!((List)this.class_[0]).isEmpty()) {
         ((List)this.class_[0]).removeIf(var0 -> {
            if (var0.protected_().catch_()) {
               return true;
            } else {
               var0.break_(var0.break_() + 1);
               if ((long)var0.break_() >= (Long)break_[0] * 40L) {
                  var0.class_(false);
               }

               return protected_[7];
            }
         });
      }
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void extends_() {
      catch_ = new short[]{0, 2, 1, 0, 0, 0, 0, 0, 0, 1, 57, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 2, 0};
   }

   public rrFh_1 case_() {
      this.catch_();
      return (rrFh_1)this.class_[2];
   }

   private static void implements_() {
      throws_ = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 7.0F, 10.0F};
   }

   private static void package_() {
      implements_ = new String[]{new String("don-item"), new String("gift")};
   }

   @Override
   public float protected_() {
      return 10.0F;
   }

   private static void private_() {
      protected_ = new boolean[]{true, false, false, false, true, true, false, false, false, true, false};
   }

   private static void final_() {
      case_ = new byte[]{3};
   }

   private static void volatile_() {
      private_ = new long[]{40L, 30L, 0L};
   }

   private static void native_() {
      Object[] var0 = new Object[]{30L};
      break_ = var0;
   }
}
