package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjQ_2 implements MinecraftAccessor {
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   public static Object[] id_class;

   private static void id_byte() {
      id_throws = new String[]{new String("шар"), new String("пасхальное яйцо"), new String("голова"), new String("дед-мороз")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7442691967393647656L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1323322964;
   }

   public static boolean id_class(rfH_2 var0) {
      if (rrjc_3.id_protected(var0) instanceof JU var2) {
         return var2.id_break() == Wf_1.PLAYER ? id_protected[1] : id_protected[2];
      } else {
         return id_protected[3];
      }
   }

   private static void id_class() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{id_throws[0], id_throws[1], id_throws[2], id_throws[3]};
      var0[0] = var2;
      id_class = var0;
   }

   public static boolean id_class(rdn_3 var0) {
      if (var0.id_break() instanceof rkG_2) {
         String var1 = var0.id_continue().id_byte().toLowerCase();
         return Arrays.<String>stream((String[])id_class[id_break[0]]).anyMatch(var1x -> var1.contains(var1x));
      } else {
         return id_protected[0];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, -57, 25, -126, -30, -36, 91, -71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new short[1];
   }

   private static void id_throws() {
      id_byte = new byte[]{4, 2, 3};
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true, false, false, false, true, false, true};
   }
}
