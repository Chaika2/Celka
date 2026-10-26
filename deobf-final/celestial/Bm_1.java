package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bm_1 extends Pv_1 implements PP {
   private static String[] break_;
   private static short[] throws_;

   public Bm_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrLu_1 var1) {
      if (var1.class_() instanceof rvV_2 var3) {
         if ((rrfq_3)rrfp_3.class_[1] != null) {
            return;
         }

         rgP_2 var4 = var3.break_();
         if (var4 == null) {
            return;
         }

         String var5 = var4.byte_();
         if (var5.isEmpty()) {
            return;
         }

         break_(var5);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7369341208060580759L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1242390226;
   }

   private static void class_() {
      break_ = new String[]{
         new String("funtime.su"), new String("reallyworld"), new String("holyworld"), new String("sunrise"), new String("eztime.su"), new String("metahvh")
      };
   }

   private static void break_() {
      throws_ = new short[]{1, 2, 0, 6, 7, 8, 9};
   }

   public static void break_(String var0) {
      var0 = var0.toLowerCase();
      Aq_1 var1 = b_.void_();
      rud_3 var2 = var1 == null ? null : var1.class_();
      if (var0.contains("funtime.su")) {
         rrfp_3.break_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2], var2);
      } else if (var0.contains("reallyworld")) {
         rrfp_3.break_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0], var2);
      } else if (var0.contains("holyworld")) {
         rrfp_3.break_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6], var2);
      } else if (var0.contains("sunrise")) {
         rrfp_3.break_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[7], var2);
      } else if (var0.contains("eztime.su")) {
         rrfp_3.break_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[8], var2);
      } else if (var0.contains("metahvh")) {
         rrfp_3.break_((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[9], var2);
      }
   }

   public static String private_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-23, -39, 18, 15, -97, 30, 0, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
