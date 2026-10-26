package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfu_3 implements MinecraftAccessor {
   private static byte[] byte_;
   private static short[] protected_;
   private static float[] throws_;
   public static Object[] class_;
   private static String[] case_;
   private static boolean[] catch_;
   public Object[] break_;

   private static void byte_() {
      throws_ = new float[]{0.0F, 255.0F, 0.0F, 255.0F, 0.0F, 255.0F, 0.0F, 255.0F};
   }

   public static void byte_(Object var0) {
      if ((cb_3)import_.class_[57] != null) {
         ((cq_3)import_.class_[19]).throws_().break_(break_(var0).break_());
      }
   }

   rrfu_3() {
      this.case_();
      rVa_1 var5 = (rVa_1)class_[2];
      this.break_[2] = var5;
      rVa_1 var6 = (rVa_1)class_[2];
      this.break_[3] = var6;
      rVa_1 var7 = (rVa_1)class_[3];
      this.break_[4] = var7;
      rVa_1 var8 = (rVa_1)class_[3];
      this.break_[5] = var8;
   }

   static {
      ntfClinit();
   }

   private static int[] class_(int var0) {
      return new int[]{var0 >> 16 & 0xFF, var0 >> 8 & 0xFF, var0 & 0xFF, var0 >> 24 & 0xFF};
   }

   private static int class_(int var0, int var1, float var2) {
      int[] var3 = class_(var0);
      int[] var4 = class_(var1);
      float var5 = (float)var3[0] + (float)(var4[0] - var3[0]) * var2;
      float var6 = (float)var3[1] + (float)(var4[1] - var3[1]) * var2;
      float var7 = (float)var3[2] + (float)(var4[2] - var3[2]) * var2;
      float var8 = (float)var3[3] + (float)(var4[3] - var3[3]) * var2;
      return ColorHelper.class_(
         (int)rfU_2.class_(var5, 0.0F, 255.0F),
         (int)rfU_2.class_(var6, 0.0F, 255.0F),
         (int)rfU_2.class_(var7, 0.0F, 255.0F),
         (int)rfU_2.class_(var8, 0.0F, 255.0F)
      );
   }

   public static void class_(Module var0, String var1, float var2) {
      rVi_1 var3 = new rgN_2("Подождите ").break_(rgF_2.RED + String.format("%.1fс", var2)).break_(" до использования " + var1);
      class_(break_(var0).break_(rgF_2.GRAY).class_(var3));
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var0.case_(), var3, 2000));
   }

   private static rVa_1 class_(rVa_1 var0, rVa_1 var1, float var2) {
      return new rVa_1(class_(var0.class_(), var1.class_(), var2));
   }

   public static void class_(rVi_1 var0) {
      if ((cb_3)import_.class_[57] != null) {
         PP.a_.class_(var0);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2414556194390501828L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, 106, -106, -74, -58, 32, 109, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static String class_(Module var0) {
      return var0.final_() + ": ";
   }

   public static NotificationStyle class_(Object var0) {
      return class_().byte_().class_().class_(rrfy_3.class_(var0).toString());
   }

   public static NotificationStyle class_() {
      return new NotificationStyle();
   }

   private static void break_() {
      byte_ = new byte[]{2, 2, 2, 3, 3, 3, 4, 16, 8, 2, 3, 24, 2, 3, 6, 4};
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 602320318;
   }

   public static NotificationStyle break_(Object var0) {
      NotificationStyle var1 = class_().byte_().break_((String)class_[0]);
      return var1.class_(rrfy_3.class_(var0).toString());
   }

   public static rVe_1 break_(Module var0) {
      return new rVe_1(var0.final_() + ": ");
   }

   private static void throws_() {
      Object[] var0 = new Object[]{"Celestial", new rVa_1(-4934476), new rVa_1(-4934476), new rVa_1(-4934476)};
      class_ = var0;
   }

   rVe_1 catch_() {
      rVe_1 var1 = new rVe_1("");
      if ((String)this.break_[0] != null) {
         int var2 = ((String)this.break_[0]).length();
         var1.class_(new rgN_2("(").class_(rgc_3.class_.class_((rVa_1)class_[1])));

         for (int var3 = 0; var3 < var2; var3++) {
            var1.class_(
               new rgN_2(String.valueOf(((String)this.break_[0]).charAt(var3)))
                  .class_(rgc_3.class_.class_(class_((rVa_1)this.break_[2], (rVa_1)this.break_[3], (float)var3 / (float)var2)))
            );
         }

         var1.class_(new rgN_2(")").class_(rgc_3.class_.class_((rVa_1)class_[1])));
         var1.class_(" » ");
      }

      if ((String)this.break_[1] != null) {
         int var4 = ((String)this.break_[1]).length();

         for (int var5 = 0; var5 < var4; var5++) {
            var1.class_(
               new rgN_2(String.valueOf(((String)this.break_[1]).charAt(var5)))
                  .class_(rgc_3.class_.class_(class_((rVa_1)this.break_[4], (rVa_1)this.break_[5], (float)var5 / (float)var4)))
            );
         }
      }

      return var1;
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
      }
   }

   private static void implements_() {
      protected_ = new short[]{
         2, 2, 2, 3, 3, 4, 3, 5, 57, 19, 57, 0, 2000, 0, 0, 0, 1, 0, 2, 3, 1, 1, 1, 1, 4, 5, 255, 255, 255, 255, 180, 180, 180, 180, 180, 180, 180, 180, 180
      };
   }

   private static void protected_() {
      case_ = new String[]{
         new String("Подождите "),
         new String("%.1fс"),
         new String(""),
         new String("("),
         new String(")"),
         new String(" » "),
         new String("Impact"),
         new String("Celestial")
      };
   }

   private static void private_() {
      catch_ = new boolean[]{true, false, true, false, false, false, false, false, false, true, true, true, false, true, false, true};
   }
}
