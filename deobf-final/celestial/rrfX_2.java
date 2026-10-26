package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfX_2 {
   ;
   private static byte[] bytes802b921f788437d584e63ee707538d8a;
   private static boolean[] booleans802b921f788437d584e63ee707538d8a;
   public static Object[] staticFields802b921f788437d584e63ee707538d8a;
   private static String[] strings802b921f788437d584e63ee707538d8a;
   private static short[] shorts802b921f788437d584e63ee707538d8a;

   private static void byte_() {
      shorts802b921f788437d584e63ee707538d8a = new short[]{2, 0, 0, 1, 0, 0, 1, 0, 1};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 78639357;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, 93, 83, 115, -77, 10, -48, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6422151226812569589L;
   }

   public static rrfX_2 class_(rrNd_1 var0) {
      if (var0.catch_() != rdy_3.kc) {
         return null;
      } else {
         return var0 == ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).break_()
            ? (rrfX_2)staticFields802b921f788437d584e63ee707538d8a[0]
            : (rrfX_2)staticFields802b921f788437d584e63ee707538d8a[1];
      }
   }

   public static rrfX_2 class_(rdn_3 var0) {
      if (var0.break_() != rdy_3.kc) {
         return null;
      } else {
         rrNd_1 var1 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).break_();
         rrNt_1 var2 = new rrNt_1(var0);
         if (var1 != null) {
            for (rrcT_2 var4 : var1.instanceof_()) {
               if (var4 instanceof rrcN_2 var5 && var5.class_(var1, var2).byte_()) {
                  return (rrfX_2)staticFields802b921f788437d584e63ee707538d8a[0];
               }
            }
         }

         return (rrfX_2)staticFields802b921f788437d584e63ee707538d8a[1];
      }
   }

   private static void class_() {
      Object[] var0 = new Object[]{new rrfX_2(), new rrfX_2(), null};
      var0[2] = new rrfX_2[]{(rrfX_2)var0[0], (rrfX_2)var0[1]};
      staticFields802b921f788437d584e63ee707538d8a = var0;
   }

   private static void break_() {
      booleans802b921f788437d584e63ee707538d8a = new boolean[]{false, true, false, false, true, true};
   }

   private static void throws_() {
      bytes802b921f788437d584e63ee707538d8a = new byte[]{2, 2, 3};
   }

   private static void case_() {
      strings802b921f788437d584e63ee707538d8a = new String[]{new String("DESTROYER"), new String("DEFAULT")};
   }
}
