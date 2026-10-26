package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjZ_2 implements MinecraftAccessor {
   private static String[] class_;
   private static float[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   public static rgP_2 byte_(an_3 var0) {
      if (var0 instanceof rsE_2 var5) {
         rdn_3 var6 = var5.protected_();
         rVi_1 var7 = var6.continue_().case_();
         int var4 = var6.char_();
         if (var4 > 1) {
            var7.break_(rgF_2.RED + " x" + var4);
         }

         return var7;
      } else {
         String var1 = protected_(var0);
         rgP_2 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().class_(var0.L_());
         if (var1.isEmpty()) {
            return var2;
         } else {
            rgN_2 var3 = new rgN_2(var1);
            var3.class_(var2);
            return var3;
         }
      }
   }

   public static boolean byte_(iB_2 var0) {
      return (Boolean)var0.private_[75];
   }

   private static void byte_() {
      protected_ = new short[]{0, 0, 34, 35, 36, 34, 35, 36, 15, 17, 15, 16, 18, 16, 75};
   }

   public static double byte_(an_3 var0, float var1) {
      return rrfQ_2.class_(var0.BO(), (Double)var0.throws_[36], var1);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3293402255505875729L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 576573024;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, -118, -102, 21, 39, 36, 53, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean class_(rEJ var0) {
      return var0.L() != 1 && !(var0.throw_(1.0F) > 0.0F) ? byte_[3] : byte_[2];
   }

   public static boolean class_(an_3 var0) {
      return var0.BC().throws_().private_();
   }

   private static void class_() {
      class_ = new String[]{new String("[F] "), new String("[BOT] "), new String("")};
   }

   public static String class_(float var0) {
      return (int)(var0 * 100.0F) + "";
   }

   public static float class_(iB_2 var0) {
      return var0 == null ? 0.0F : rfU_2.class_(var0.u_() / var0.SK(), 0.0F, 1.0F);
   }

   public static double class_(an_3 var0, float var1) {
      return rrfQ_2.class_(var0.BO(), (Double)var0.throws_[36], var1) - void_.private_();
   }

   public static boolean break_(an_3 var0) {
      return var0.BC().throws_().throws_();
   }

   public static double break_(an_3 var0, float var1) {
      return rrfQ_2.class_(var0.re(), (Double)var0.throws_[35], var1);
   }

   private static void break_() {
      break_ = new float[]{0.0F, 0.0F, 1.0F, 100.0F, 1.0F, 1.0F, 1.0F, 0.0F};
   }

   public static String break_(iB_2 var0) {
      return rql_3.class_(var0.u_() + var0.Sd());
   }

   public static double throws_(an_3 var0, float var1) {
      return rrfQ_2.class_(var0.rx(), (Double)var0.throws_[34], var1) - void_.case_();
   }

   public static float catch_(an_3 var0, float var1) {
      return var1 == 1.0F ? (Float)var0.throws_[15] : rrfQ_2.break_((Float)var0.throws_[17], (Float)var0.throws_[15], var1);
   }

   public static float case_(an_3 var0, float var1) {
      return var1 == 1.0F ? (Float)var0.throws_[16] : rrfQ_2.break_((Float)var0.throws_[18], (Float)var0.throws_[16], var1);
   }

   private static void protected_() {
      byte_ = new boolean[]{true, true, true, false};
   }

   public static double protected_(an_3 var0, float var1) {
      return rrfQ_2.class_(var0.rx(), (Double)var0.throws_[34], var1);
   }

   public static String protected_(an_3 var0) {
      if (var0 instanceof cG_2 var1) {
         StringBuilder var2 = new StringBuilder();
         if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(var1)) {
            var2.append(rgF_2.GREEN).append("[F] ");
         }

         if (var1.sc()) {
            var2.append(rgF_2.RED).append("[BOT] ");
         }

         return var2.toString();
      } else {
         return class_[2];
      }
   }

   public static double private_(an_3 var0, float var1) {
      return rrfQ_2.class_(var0.re(), (Double)var0.throws_[35], var1) - void_.catch_();
   }
}
