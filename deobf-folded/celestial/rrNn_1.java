package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNn_1 implements rrNA {
   private static boolean[] id_class;
   private static short[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;
   private static long[] id_throws;

   private static void id_byte() {
      id_class = new boolean[]{false, true, false};
   }

   public rrNn_1(rrNW var1) {
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_break = new short[]{1, 0, 8};
   }

   @Override
   public void id_class(rrNF var1) {
      rrNd_1 var2 = var1.id_break();
      rrNw_1 var3 = var2.id_break();
      if (var3 != null) {
         rdn_3 var4 = var3.id_protected();
         String var5 = var2.id_case() == null ? var4.id_continue().id_byte() : var2.id_case();
         int var6 = var3.id_case();
         long var7 = Math.max(id_throws[0], C_throws.id_byte().id_native().id_byte() - (long)var6);
         switch (((int[])rrNc_1.id_class[1])[var1.id_class().ordinal()]) {
            case 1:
               String var10000 = id_byte[0];
               Object[] var10001 = new Object[4];
               var10001[id_class[0]] = var4.id_char();
               var10001[1] = var5;
               var10001[2] = rql_3.id_class(var6, ' ');
               var10001[3] = rql_3.id_class(var7, ' ');
               MinecraftAccessor.a_(String.format(var10000, var10001), id_class[2]);
            default:
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]])
                  .id_byte()
                  .id_interface()
                  .id_extends()
                  .id_class((Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[8]) instanceof rrZj_1 var10) {
                  var10.id_class(var1);
               }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2036404552;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4898238381896982646L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, -114, -102, -116, -86, -45, 63, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new String[]{new String("Auto Buy: Успешно купил %s %s за %s$! Остаток на балансе: %s$")};
   }

   private static void id_throws() {
      id_throws = new long[1];
   }

   private static void id_protected() {
      id_protected = new byte[]{4, 2, 32, 3, 32};
   }
}
