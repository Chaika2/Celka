package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwX_2 implements MinecraftAccessor {
   private static byte[] byte_;
   private static String[] protected_;
   private static double[] throws_;
   private static boolean[] case_;
   private static short[] catch_;
   public Object[] class_;
   public static Object[] break_;
   private static int[] private_;
   private static float[] implements_;

   public boolean byte_() {
      return (Boolean)this.class_[2];
   }

   private static void int_() {
      case_ = new boolean[]{true, false, false, false, true, false, true, false, false, true, false};
   }

   public rrwX_2(rrtN_2 var1) {
      this.case_();
      rruL var6 = new rruL();
      this.class_[1] = var6;
      this.class_[0] = var1;
      if (var1.new_()) {
         this.package_();
      }
   }

   static {
      ntfClinit();
   }

   public void class_(Ml_1 var1, float var2, float var3, boolean var4, boolean var5) {
      rrtN_2 var6 = this.class_();
      int var7 = ColorHelper.class_(0.0F);
      int var8 = ColorHelper.class_(90.0F);
      int var9 = ColorHelper.class_(270.0F);
      int var10 = ColorHelper.class_(180.0F);
      float var11 = var6.implements_();
      float var12 = var6.ao_();
      rrfD_2.class_(var1, var2, var3 + 3.0F, var11, var12, 8.0F, 8.0F, 8.0F, 8.0F, rrZF.n_);
      rrfD_2.break_(var1, var2, var3, var11, 13.0F, 4.0F, 4.0F, 0.0F, 0.0F, var7, var8, var9, var10);
      if (!var5) {
         rrZO var13 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).protected_();
         StringBuilder var14 = new StringBuilder();
         String var15 = var6.byte_();

         for (int var16 = 0; var16 < var15.length(); var16++) {
            char var17 = var15.charAt(var16);
            if (var4 && var13.break_(var14.toString() + var17) > var11 - 40.0F) {
               int var18 = var14.length() - 1;
               if (var18 >= 0 && var14.charAt(var18) == ' ') {
                  var14.deleteCharAt(var18);
               }

               var14.append("...");
               break;
            }

            var14.append(var17);
         }

         var13.byte_(var1, var14.toString(), var2 + var11 / 2.0F + 0.5F, var3 + 2.5F, rrZF.d_, false);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -39557666;
   }

   public void class_(Ml_1 var1, Runnable var2, rrtu_3 var3, int var4, int var5, boolean var6) {
      rrtN_2 var7 = this.class_();
      float var8 = var7.long_();
      this.class_().class_(var1, var8);
      var2.run();
      this.break_().class_(var1, var3, var4, var5, false, var6);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1026358058022567622L;
   }

   public void class_(Ml_1 var1, Runnable var2, rrtu_3 var3, int var4, int var5, boolean var6, boolean var7) {
      rrtN_2 var8 = this.class_();
      rrwX_2 var9 = var8.interface_();
      float var10 = var8.long_();
      double var11 = (double)(1.0F - var10);
      var1.class_(var11 * (double)(var8.default_() + var8.implements_() / 2.0F), var11 * (double)(var8.abstract_() + var8.ao_() / 2.0F), 0.0);
      var1.class_(var10, var10, var10);
      var9.class_(var1, var8.default_(), var8.abstract_(), var6, var7);
      this.break_().class_(var1, var3, var4, var5, false, var7);
      var2.run();
   }

   public void class_(Ml_1 var1, Runnable var2, boolean var3, boolean var4) {
      if (var3) {
         var2.run();
      } else {
         float var5 = ((rrtN_2)this.class_[0]).long_();
         var1.class_();
         rrfi_3.break_();
         if (var4) {
            this.class_().class_(var1, var5);
         }

         var2.run();
         rrfi_3.class_(1);
         var1.break_();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 111, -1, -88, 35, -121, -114, 86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[2] = var6;
   }

   public rrtN_2 class_() {
      return (rrtN_2)this.class_[0];
   }

   public void class_(Ml_1 var1, Runnable var2) {
      var1.class_();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
      float var3 = ((rrtN_2)this.class_[0]).long_();
      this.class_().class_(var1, var3);
      var2.run();
      RenderSystem.enableAlphaTest();
      RenderSystem.enableBlend();
      var1.break_();
   }

   public rruL break_() {
      return (rruL)this.class_[1];
   }

   private static void finally_() {
      byte_ = new byte[]{32, 3, 2};
   }

   private static void extends_() {
      Object[] var0 = new Object[]{-657931};
      break_ = var0;
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = false;
      }
   }

   private static void implements_() {
      implements_ = new float[]{
         0.3F,
         1.0F,
         2.0F,
         2.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         3.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         13.0F,
         4.0F,
         4.0F,
         0.0F,
         0.0F,
         40.0F,
         2.0F,
         0.5F,
         2.5F,
         9.0F,
         9.0F,
         11.0F,
         2.0F
      };
   }

   private void package_() {
      rrtN_2 var1 = this.class_();
      Runnable var2 = () -> var1.int_();
      ((rruL)this.class_[1])
         .class_(
            new rruF(
                  this.class_(),
                  new rrun_1(
                        () -> rrZL.native_,
                        () -> new rjK_2(var1.default_() + var1.implements_() - 11.0F, var1.abstract_() + 2.0F),
                        () -> new rjK_2(9.0F, 9.0F),
                        () -> -657931
                     )
                     .class_(0.3F)
               )
               .class_(var2)
         );
   }

   private static void protected_() {
      catch_ = new short[]{1, 0, 1, 0, 0, 0, 0, 1, 2, 2};
   }

   private static void private_() {
      protected_ = new String[]{new String("...")};
   }

   private static void final_() {
      private_ = new int[]{-657931, -657931};
   }

   private static void native_() {
      throws_ = new double[1];
   }
}
