package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNn_1 implements rrNA {
   private static boolean[] class_;
   private static short[] break_;
   private static String[] byte_;
   private static byte[] protected_;
   private static long[] throws_;

   private static void byte_() {
      class_ = new boolean[]{false, true, false};
   }

   public rrNn_1(rrNW var1) {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new short[]{1, 0, 8};
   }

   @Override
   public void class_(rrNF var1) {
      rrNd_1 var2 = var1.break_();
      rrNw_1 var3 = var2.break_();
      if (var3 != null) {
         rdn_3 var4 = var3.protected_();
         String var5 = var2.case_() == null ? var4.continue_().byte_() : var2.case_();
         int var6 = var3.case_();
         long var7 = Math.max(0L, C_throws.byte_().native_().byte_() - (long)var6);
         switch (((int[])rrNc_1.class_[1])[var1.class_().ordinal()]) {
            case 1:
               MinecraftAccessor.a_(String.format(byte_[0], var4.char_(), var5, rql_3.class_(var6, ' '), rql_3.class_(var7, ' ')), false);
            default:
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
                  .byte_()
                  .interface_()
                  .extends_()
                  .class_((Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[8]) instanceof rrZj_1 var10) {
                  var10.class_(var1);
               }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2036404552;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4898238381896982646L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, -114, -102, -116, -86, -45, 63, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new String[]{new String("Auto Buy: Успешно купил %s %s за %s$! Остаток на балансе: %s$")};
   }

   private static void throws_() {
      throws_ = new long[1];
   }

   private static void protected_() {
      protected_ = new byte[]{4, 2, 32, 3, 32};
   }
}
