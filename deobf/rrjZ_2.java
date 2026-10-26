package celestial;

import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjZ_2 implements MinecraftAccessor {
   private static String[] id_class;
   private static float[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public static rgP_2 id_byte(an_3 var0) {
      if (var0 instanceof rsE_2 var5) {
         rdn_3 var6 = var5.id_protected();
         rVi_1 var7 = var6.id_continue().id_case();
         int var4 = var6.id_char();
         if (var4 > 1) {
            var7.id_break(rgF_2.RED + " x" + var4);
         }

         return var7;
      } else {
         String var1 = id_protected(var0);
         rgP_2 var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_class(var0.L_());
         if (var1.isEmpty()) {
            return var2;
         } else {
            rgN_2 var3 = new rgN_2(var1);
            var3.id_class(var2);
            return var3;
         }
      }
   }

   public static boolean id_byte(iB_2 var0) {
      return (Boolean)var0.id_private[75];
   }

   private static void id_byte() {
      id_protected = new short[]{0, 0, 34, 35, 36, 34, 35, 36, 15, 17, 15, 16, 18, 16, 75};
   }

   public static double id_byte(an_3 var0, float var1) {
      return rrfQ_2.id_class(var0.BO(), (Double)var0.id_throws[36], var1);
   }

   public rrjZ_2() {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3293402255505875729L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 576573024;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, -118, -102, 21, 39, 36, 53, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean id_class(rEJ var0) {
      return var0.L() != 1 && !(var0.id_throw(1.0F) > 0.0F) ? false : true;
   }

   public static boolean id_class(an_3 var0) {
      return var0.BC().id_throws().id_private();
   }

   private static void id_class() {
      id_class = new String[]{new String("[F] "), new String("[BOT] "), new String("")};
   }

   public static String id_class(float var0) {
      return "" + (int)(var0 * 100.0F);
   }

   public static float id_class(iB_2 var0) {
      return var0 == null ? 0.0F : rfU_2.id_class(var0.u_() / var0.SK(), 0.0F, 1.0F);
   }

   public static double id_class(an_3 var0, float var1) {
      return rrfQ_2.id_class(var0.BO(), (Double)var0.id_throws[36], var1) - id_void.id_private();
   }

   public static boolean id_break(an_3 var0) {
      return var0.BC().id_throws().id_throws();
   }

   public static double id_break(an_3 var0, float var1) {
      return rrfQ_2.id_class(var0.re(), (Double)var0.id_throws[35], var1);
   }

   private static void id_break() {
      id_break = new float[]{0.0F, 0.0F, 1.0F, 100.0F, 1.0F, 1.0F, 1.0F, 0.0F};
   }

   public static String id_break(iB_2 var0) {
      return rql_3.id_class(var0.u_() + var0.Sd());
   }

   public static double id_throws(an_3 var0, float var1) {
      return rrfQ_2.id_class(var0.rx(), (Double)var0.id_throws[34], var1) - id_void.id_case();
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_protected();
      id_class();
      id_byte();
      id_break();
   }

   public static float id_catch(an_3 var0, float var1) {
      return var1 == 1.0F ? (Float)var0.id_throws[15] : rrfQ_2.id_break((Float)var0.id_throws[17], (Float)var0.id_throws[15], var1);
   }

   public static float id_case(an_3 var0, float var1) {
      return var1 == 1.0F ? (Float)var0.id_throws[16] : rrfQ_2.id_break((Float)var0.id_throws[18], (Float)var0.id_throws[16], var1);
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, true, true, false};
   }

   public static double id_protected(an_3 var0, float var1) {
      return rrfQ_2.id_class(var0.rx(), (Double)var0.id_throws[34], var1);
   }

   public static String id_protected(an_3 var0) {
      if (var0 instanceof cG_2 var1) {
         StringBuilder var2 = new StringBuilder();
         if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var1)) {
            var2.append(rgF_2.GREEN).append(new String("[F] "));
         }

         if (var1.sc()) {
            var2.append(rgF_2.RED).append(new String("[BOT] "));
         }

         return var2.toString();
      } else {
         return new String("");
      }
   }

   public static double id_private(an_3 var0, float var1) {
      return rrfQ_2.id_class(var0.re(), (Double)var0.id_throws[35], var1) - id_void.id_catch();
   }
}
