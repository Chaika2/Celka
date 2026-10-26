package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtp_3 extends rrtm_3 {
   private static byte[] protected_;
   private static short[] throws_;
   private static String[] native_;
   private static boolean[] volatile_;
   private static float[] final_;
   public Object[] byte_;
   private static int[] package_;

   public rrtp_3(rrtN_2 var1, rrIm_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.goto_();
      rrtv_3 var11 = new rrtv_3((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.4F, false);
      this.byte_[2] = var11;
      AnimValue var12 = new AnimValue(0.3F, true);
      this.byte_[3] = var12;
      this.byte_[1] = var1;
      this.byte_[0] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.goto_();
      if (super.class_(var1, var2, var3, var4, var5)) {
         if (var4 == 0) {
            Boolean var10 = true;
            this.byte_[4] = var10;
         } else if (var4 == 2) {
            ((rrIm_1)this.byte_[0]).class_(((rrIm_1)this.byte_[0]).extends_(), false, true);
         }

         return volatile_[8];
      } else {
         return volatile_[9];
      }
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.goto_();
      super.class_(var1, var2, var3, var4);
      float var5 = this.package_();
      float var6 = this.final_();
      float var7 = this.new_();
      float var8 = ((rrIm_1)this.byte_[0]).class_();
      float var9 = ((rrIm_1)this.byte_[0]).native_();
      float var10 = ((rrIm_1)this.byte_[0]).byte_();
      float var11 = ((rrIm_1)this.byte_[0]).volatile_();
      this.class_(var5, var7, var8, var9, var11, var3);
      this.private_().interface_().class_(var1, () -> this.class_(var1, var5, var6, var7, var8, var9, var10));
   }

   private void class_(Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.goto_();
      int var8 = ColorHelper.class_(0.0F);
      int var9 = ColorHelper.class_(180.0F);
      String var10 = String.valueOf(var5);
      String var11 = String.valueOf(var6);
      ((AnimValue)this.byte_[3]).break_(var7);
      boolean var12 = ((rrIm_1)this.byte_[0]).final_();
      byte var13 = var12 ? 100 : protected_[1];
      float var14 = (float)((int)(((AnimValue)this.byte_[3]).byte_() * (float)var13)) / (float)var13;
      String var15 = var14 + "";
      if (var12 && var15.endsWith(".0") && var15.length() > 3) {
         var15 = var15.substring(0, var15.length() - 2);
      }

      float var16 = (((rrIm_1)this.byte_[0]).byte_() - var5) / (var6 - var5);
      ((rrtv_3)this.byte_[2]).class_().break_(var16);
      float var17 = ((rrtv_3)this.byte_[2]).class_().byte_();
      var11 = this.class_(((rrIm_1)this.byte_[0]).package_(), var14, var11);
      var15 = this.class_(((rrIm_1)this.byte_[0]).break_(), var14, var15);
      rrtF_2.protected_(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(),
         ((rrIm_1)this.byte_[0]).throws_(),
         var2,
         var3,
         rrZF.k_,
         255
      );
      rrtF_2.protected_(
         var1, this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).native_(), var10, var2, var3 + 19.0F, rrZF.k_, 255
      );
      rrtF_2.protected_(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).native_(),
         var11,
         var2 + var4 + 1.0F - ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).native_().break_(var11),
         var3 + 19.0F,
         rrZF.k_,
         255
      );
      rrtF_2.break_(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).native_(),
         var15,
         var2 + var4 / 2.0F,
         var3 + 19.0F,
         rrZF.k_,
         255
      );
      rrtF_2.class_(var1, var2 + 1.0F, var3 + 10.0F, var4 - 1.0F, 2.0F, 1.0F, 6781311, this.class_(255));
      rrtF_2.class_(var1, var2 + 1.0F, var3 + 10.0F, (var4 - 1.0F) * var17, 2.0F, 1.0F, var8, var8, var9, var9, this.class_(255));
      float var18 = rfU_2.class_(var2 + var4 * var17, var2 + 3.0F, var2 + var4 - 2.0F);
      rrtF_2.class_(var1, this, var18, var3 + 11.0F, 8.0F, rrZF.d_, 255, this.private_().long_() * rrvk_1.class_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4563716211253658676L;
   }

   private String class_(BiFunction<rrIm_1, Float, String> var1, float var2, String var3) {
      this.goto_();
      if (var1 != null) {
         String var4 = (String)var1.apply((rrIm_1)this.byte_[0], var2);
         if (var4 != null) {
            var3 = var4;
         }
      }

      return var3;
   }

   private void class_(float var1, float var2, float var3, float var4, float var5, int var6) {
      this.goto_();
      if ((Boolean)this.byte_[4]) {
         float var7 = rrfQ_2.class_(((float)var6 - var1) * (var4 - var3) / var2 + var3, var5);
         ((rrIm_1)this.byte_[0]).class_(rfU_2.class_(var7, var3, var4), false, true);
      }
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      this.goto_();
      if (super.break_(var1, var2, var3)) {
         Boolean var8 = false;
         this.byte_[4] = var8;
         return true;
      } else {
         return volatile_[12];
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1162221727;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, -121, -41, -76, 63, 53, -99, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<?> finally_() {
      this.goto_();
      return (rrIm_1)this.byte_[0];
   }

   private void goto_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[5];
         Object[] var1 = this.byte_;
         var1[4] = false;
      }
   }

   @Override
   public void case_() {
      this.goto_();
      super.case_();
      Boolean var5 = false;
      this.byte_[4] = var5;
   }

   private static void instanceof_() {
      package_ = new int[]{6781311};
   }

   private static void return_() {
      throws_ = new short[]{
         1, 2, 3, 1, 0, 0, 0, 0, 0, 3, 0, 3, 0, 2, 2, 0, 0, 0, 0, 255, 0, 255, 0, 0, 255, 0, 255, 255, 255, 255, 4, 0, 0, 4, 0, 0, 4, 4, 1, 0
      };
   }

   private static void try_() {
      protected_ = new byte[]{100, 10, 3, 2, 2, 5, 4};
   }

   private static void while_() {
      volatile_ = new boolean[]{false, true, false, false, true, true, false, true, true, false, false, true, false, false, false};
   }

   private static void public_() {
      final_ = new float[]{
         0.4F,
         0.3F,
         0.0F,
         180.0F,
         19.0F,
         1.0F,
         19.0F,
         2.0F,
         19.0F,
         1.0F,
         10.0F,
         1.0F,
         2.0F,
         1.0F,
         1.0F,
         10.0F,
         1.0F,
         2.0F,
         1.0F,
         3.0F,
         2.0F,
         11.0F,
         8.0F,
         8.0F,
         1.0F,
         6.0F
      };
   }

   @Override
   public rrtN_2 private_() {
      this.goto_();
      return (rrtN_2)this.byte_[1];
   }

   @Override
   public rruv_1 volatile_() {
      return new rruv_1(this.package_(), this.final_() + 8.0F, this.new_() + 1.0F, 6.0F);
   }

   private static void synchronized_() {
      native_ = new String[]{new String(".0")};
   }
}
