package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BM extends Pv_1 {
   private static short[] id_byte;
   private static String[] id_protected;
   public static Object[] id_break;
   private static byte[] id_throws;
   private static boolean[] id_case;

   private static void id_byte() {
      id_byte = new short[]{0, 1};
   }

   public BM(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1057045127;
   }

   @Override
   public void id_class(C var1) {
      super.id_class(var1);
      boolean var2 = rrfZ_2.id_byte();
      if (var2) {
         String var3 = var1.id_class().toLowerCase().trim();
         if ((((Pattern)id_break[id_byte[0]]).matcher(var3).find() || ((Pattern)id_break[1]).matcher(var3).find()) && rrfv_3.id_class(var3, true)) {
            var1.id_break();
         }
      }
   }

   private static void id_class() {
      Object[] var0 = new Object[]{Pattern.compile(id_protected[0], 0), Pattern.compile(id_protected[1])};
      id_break = var0;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3205699586610278206L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{56, -83, -109, 79, 69, -109, -79, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new byte[]{2};
   }

   private static void id_throws() {
      id_protected = new String[]{new String("^/(an|anarchy|grf|grief)(\\d+).*"), new String("^/(hub).*")};
   }

   private static void id_protected() {
      id_case = new boolean[]{true, false, true};
   }
}
