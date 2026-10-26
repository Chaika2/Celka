package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZt_1 extends rrZN implements rrZA {
   private static double[] protected_;
   public Object[] break_;
   public static Object[] byte_;
   private static byte[] throws_;
   private static short[] case_;
   private static boolean[] catch_;
   private static float[] private_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1473538746;
   }

   private static void int_() {
      case_ = new short[]{
         1,
         0,
         2,
         3,
         0,
         8,
         8,
         8,
         0,
         1,
         1,
         9,
         9,
         5,
         6,
         7,
         6,
         7,
         7,
         5,
         5,
         6,
         6,
         5,
         6,
         7,
         8,
         7,
         0,
         1,
         8,
         6,
         2,
         5,
         1,
         7,
         8,
         0,
         9,
         5,
         7,
         8,
         4,
         2,
         7,
         8,
         0,
         1,
         7,
         8,
         1,
         2,
         2,
         6,
         2,
         2,
         2,
         1,
         9,
         5,
         4,
         5
      };
   }

   public rrZt_1(rrvJ var1, int var2) {
      this.package_();
      rruL var7 = new rruL();
      this.break_[1] = var7;
      this.break_[0] = var1;
      rrZl_1 var9 = new rrZl_1(new rrZH(0.5F)).native_();
      this.break_[2] = var9;
      AnimValue var10 = new AnimValue(0.5F, false);
      this.break_[3] = var10;
      this.class_(var2);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new byte[]{25, 15, 12, 5, 52, 25, 2, 5, 8, 9, 9, 4, 5, 6, 7, 8, 10, 5, 52, 2, 15, 3, 25, 4, 20};
   }

   @Override
   public float class_() {
      return 235.0F;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.package_();
      ClickGuiScreen var6 = ((rrvJ)this.break_[0]).volatile_();
      List var7 = ((rruL)this.break_[1]).class_();
      int var8 = var6.finally_();

      for (int var9 = var7.size() - 1; var9 >= 0; var9--) {
         rruF var10 = (rruF)var7.get(var9);
         float var11 = var10.class_().protected_();
         if (!(var11 < (float)var8 + (Float)this.break_[7] - 20.0F + 5.0F)
            && !(var11 > (float)var8 + (Float)this.break_[8] + 20.0F - 5.0F)
            && var10.class_().break_((float)var2, (float)var3)
            && var10.class_(var1, var2, var3, var4, var5)) {
            return true;
         }
      }

      ((rruL)this.break_[1]).break_();
      return !((rrZl_1)this.break_[2]).class_(var1, var2, var3, var4, var5) && !super.class_(var1, var2, var3, var4, var5) ? catch_[16] : catch_[15];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7997946208726075749L;
   }

   public void class_(int var1) {
      this.package_();
      ClickGuiScreen var2 = ((rrvJ)this.break_[0]).volatile_();
      byte var3 = 0;

      for (int var4 = 0; var4 < ((Category[])byte_[8]).length; var4++) {
         Category var5 = ((Category[])byte_[8])[var4];
         String var6 = var5.class_();
         if (var4 > 0 && !((Category[])byte_[8])[var4 - 1].class_().equals(var6)) {
            var3 += 15;
         }

         float var7 = (float)var3;
         rrZn_1 var8 = new rrZn_1(
               var5,
               ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).throws_(),
               var5::byte_,
               () -> new rjK_2(2.0F, 3.0F),
               () -> new rjK_2(14.0F, 14.0F),
               () -> rrZF.d_,
               var5::protected_,
               () -> {
                  this.package_();
                  return new rjK_2(
                     (float)(var2.abstract_() + 5) + (Float)this.break_[4],
                     (float)(var2.finally_() + 52) + (Float)this.break_[5] + var7 + (float)(var5.ordinal() * 25)
                  );
               },
               () -> new rjK_2((float)(var1 - 12), 20.0F),
               () -> new rjK_2(20.0F, 8.0F),
               () -> rrZF.d_,
               () -> new rji_3(
                     (float)ColorHelper.class_(0.0F), (float)ColorHelper.class_(90.0F), (float)ColorHelper.class_(270.0F), (float)ColorHelper.class_(180.0F)
                  )
            )
            .<rrup_1>break_(ClickGuiTheme::class_)
            .<rrup_1>byte_(true)
            .class_(0.3F);
         ((rruL)this.break_[1]).class_(new rruF(var8).class_(() -> (Category)byte_[5] != var5 ? true : catch_[20]).class_(() -> class_(var2, var5)));

         for (rruF var10 : ((rruL)this.break_[1]).class_()) {
            rruu_1 var12 = var10.case_();
            if (var12 instanceof rrZn_1) {
               rrZn_1 var11 = (rrZn_1)var12;
               Category var13 = var11.this_();
               if (!((Map)byte_[9]).containsKey(var13.class_())) {
                  ((Map)byte_[9]).put(var6, var10.class_().protected_());
               }
            }
         }
      }
   }

   public static void class_(ClickGuiScreen var0, Category var1) {
      if (var1 != (Category)byte_[5]) {
         rrvJ var2 = var0.interface_();
         rrZN var3 = var2.class_(var1);
         if (var3.aj_()) {
            byte_[6] = var1;
            byte_[7] = var0;
         }
      }
   }

   @Override
   public float class_(boolean var1) {
      this.package_();
      float var2 = 0.0F;

      for (rruF var4 : ((rruL)this.break_[1]).class_()) {
         var2 += var4.class_().class_() + 5.0F;
      }

      return var2 + (float)(((Map)byte_[9]).size() * 15);
   }

   @Override
   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      this.package_();
      else_();
      Float var23 = var6 - 50.0F;
      this.break_[8] = var23;
      Float var24 = 35.0F;
      this.break_[7] = var24;
      Boolean var25 = this.class_(
               (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], var3 + 5.0F - 5.0F, var4 + 52.0F - 20.0F, 100.0F, (Float)this.break_[8] - 10.0F
            )
            && super.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9)
         ? true
         : catch_[10];
      this.break_[6] = var25;
      float var10 = this.class_(false);
      float var11 = this.class_();
      rrZH var12 = ((rrZl_1)this.break_[2]).extends_();
      var12.class_(var10, var11);
      Float var26 = var12.case_();
      this.break_[5] = var26;
      rrvJ.class_(var1, var3, var4, (int)var5, (int)var6 - 25);

      for (rruF var14 : ((rruL)this.break_[1]).class_()) {
         float var15 = var14.class_().protected_();
         if (!(var15 < var4 + (Float)this.break_[7] - 20.0F + 5.0F) && !(var15 > var4 + (Float)this.break_[8] + 20.0F - 5.0F)) {
            var14.class_(var1, var2, var7, var8, var9);
         }
      }

      rrZO var27 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).native_();

      for (Entry var29 : ((Map)byte_[9]).entrySet()) {
         String var16 = (String)var29.getKey();
         float var17 = (Float)var29.getValue();
         float var18 = var4 + (Float)this.break_[5] - 10.0F + var17;
         if (!(var18 < var4 + (Float)this.break_[7] - 10.0F) && !(var18 > var4 + (Float)this.break_[8] + 10.0F)) {
            var27.byte_(var1, var16, var3 + (Float)this.break_[4] + 5.0F, var18, rrZF.k_);
         }
      }

      rrvJ.final_();
      rrvJ.class_(var1, ((rrZl_1)this.break_[2]).extends_(), var3, var4 + (Float)this.break_[7], var4 + (Float)this.break_[8], var5, 25.0F);
      return true;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      this.package_();
      ((rrZl_1)this.break_[2]).extends_().class_(this.break_[6] && super.class_(var1, var2, var3, var4, var6) ? true : catch_[18], var4, 25.0);
      return ((rrZl_1)this.break_[2]).class_(var1, var2, var3, var4, var6);
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.package_();
      super.break_(var1, var2, var3);
      ((rrZl_1)this.break_[2]).break_(var1, var2, var3);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, 36, -31, 119, 15, 120, 99, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      catch_ = new boolean[]{
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private static void else_() {
      if ((Category)byte_[6] != null && (ClickGuiScreen)byte_[7] != null) {
         rrvJ var0 = ((ClickGuiScreen)byte_[7]).interface_();
         rrZN var1 = var0.class_((Category)byte_[5]);
         if (!var1.ai_()) {
            if (var1.implements_().class_().byte_() >= 1.0F) {
               var1.d_(true);
            }
         } else if (var1.ak_()) {
            var1.d_(false);
            var0.class_((Category)byte_[5], (Category)byte_[6]);
            Category var6 = (Category)byte_[6];
            byte_[5] = var6;
            Object var7 = null;
            byte_[6] = var7;
            Object var8 = null;
            byte_[7] = var8;
         }
      }
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[9];
         Object[] var1 = this.break_;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = false;
         var1[7] = 0.0F;
         var1[8] = 0.0F;
      }
   }

   private static void return_() {
      Object[] var0 = new Object[10];
      var0[0] = 5;
      var0[1] = 52;
      var0[2] = 15;
      var0[3] = 25;
      var0[4] = 20;
      var0[5] = Category.valueOf("RENDER");
      Category[] var2 = new Category[]{
         Category.valueOf("COMBAT"),
         Category.valueOf("MOVEMENT"),
         Category.valueOf("RENDER"),
         Category.valueOf("PLAYER"),
         Category.valueOf("UTIL"),
         Category.valueOf("CONFIGS"),
         Category.valueOf("THEMES"),
         Category.valueOf("AUTOBUY_ITEMS"),
         Category.valueOf("AUTOBUY_HISTORY")
      };
      var0[8] = var2;
      var0[9] = new HashMap();
      byte_ = var0;
   }

   @Override
   public void private_() {
      this.package_();
      super.private_();
      ((rrZl_1)this.break_[2]).private_();
   }

   private static void volatile_() {
      private_ = new float[]{
         0.5F,
         0.5F,
         0.3F,
         1.0F,
         50.0F,
         35.0F,
         5.0F,
         5.0F,
         52.0F,
         20.0F,
         100.0F,
         10.0F,
         20.0F,
         5.0F,
         20.0F,
         5.0F,
         10.0F,
         10.0F,
         10.0F,
         5.0F,
         25.0F,
         20.0F,
         5.0F,
         20.0F,
         5.0F,
         235.0F,
         0.0F,
         5.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         20.0F,
         8.0F,
         20.0F,
         14.0F,
         14.0F,
         2.0F,
         3.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private static void synchronized_() {
      protected_ = new double[]{25.0};
   }
}
