package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bG_2 extends bb_3 {
   private static byte[] protected_;
   private static boolean[] throws_;
   public static Object[] class_;
   private static short[] case_;
   private static String[] catch_;
   public Object[] break_;

   public bG_2(C_class var1, bM_2 var2) {
      super(var1, var2);
      this.final_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3575450969027118560L;
   }

   @Override
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rFu_1 var2) {
         rgP_2 var5 = var2.byte_();
         if (var2.break_() != rFm_1.ACTIONBAR || var5 == null) {
            return;
         }

         String var4 = var5.byte_();
         if (((Pattern)rrjM_2.class_[0]).matcher(var4).find()) {
            this.implements_();
         }
      }
   }

   @Override
   public void class_() {
      super.class_();
      this.catch_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -212195467;
   }

   @Override
   public void class_(rrLp_1 var1) {
      this.final_();
      if (var1.case_() == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]) {
         rfH_2 var2 = var1.class_();
         if (!var2.equals((rfH_2)this.break_[0])) {
            this.break_[0] = var2;
            Integer var8 = 1;
            this.break_[1] = var8;
         } else {
            int var10002 = (Integer)this.break_[1] + 1;
            Integer var9 = var10002;
            this.break_[1] = var9;
            if (var10002 >= 15) {
               this.implements_();
               this.catch_();
            }
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -15, -72, -80, -113, -32, -78, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      Object[] var0 = new Object[]{15};
      class_ = var0;
   }

   private static void finally_() {
      protected_ = new byte[]{15, 2, 15};
   }

   private void catch_() {
      this.final_();
      Object var5 = null;
      this.break_[0] = var5;
      Integer var6 = 0;
      this.break_[1] = var6;
   }

   private static void extends_() {
      catch_ = new String[]{new String("Найден приват")};
   }

   private static void case_() {
      case_ = new short[]{2, 0, 0, 1, 1, 1, 0, 0, 1};
   }

   private void implements_() {
      rVi_1 var1 = new rgN_2("Найден приват").class_(rgF_2.GRAY);
      this.class_(var1);
      this.catch_();
   }

   private static void private_() {
      throws_ = new boolean[]{true, true, false, true, false, true, false};
   }

   private void final_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[1] = 0;
      }
   }
}
