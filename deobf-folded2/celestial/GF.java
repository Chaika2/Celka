package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GF extends rS_2 {
   private static boolean[] id_break;
   private static int[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static short[] id_case;

   private static void id_byte() {
      id_byte = new int[]{1910811835};
   }

   public GF(rfH_2 var1) {
      super(var1.id_final());
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return String.format(
         "GoalPlace{x=%s,y=%s,z=%s}",
         Pd_1.id_class((Integer)this.id_class[0]),
         Pd_1.id_class((Integer)this.id_class[1]),
         Pd_1.id_class((Integer)this.id_class[2])
      );
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 1910811835;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 864662254;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      return (double)((Integer)this.id_class[1] * 100) + super.id_class(var1, var2, var3);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5442381948491353447L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -87, 6, -49, -44, 89, -115, -65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new byte[]{100, 3, 2};
   }

   private static void id_catch() {
      id_break = new boolean[]{false, true};
   }

   private static void id_case() {
      id_case = new short[]{1, 0, 1, 2};
   }

   private static void id_protected() {
      id_protected = new String[]{new String("GoalPlace{x=%s,y=%s,z=%s}")};
   }
}
