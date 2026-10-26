package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gv_1 extends rE_2 {
   private static int[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;

   private static void id_byte() {
      id_protected = new short[]{1, 0, 1, 2};
   }

   public Gv_1(rfH_2 var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      String var10000 = id_byte[0];
      Object[] var10001 = new Object[3];
      var10001[id_case[1]] = Pd_1.id_class((Integer)this.id_class[id_protected[1]]);
      var10001[1] = Pd_1.id_class((Integer)this.id_class[1]);
      var10001[2] = Pd_1.id_class((Integer)this.id_class[2]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 1636324008;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8005320330672154794L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 744117733;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -110, -32, 15, 27, -85, 39, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var2 > this.id_class[1] ? id_case[0] : super.id_break(var1, var2, var3);
   }

   private static void id_throws() {
      id_break = new int[]{1636324008};
   }

   private static void id_catch() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_case() {
      id_case = new boolean[]{false, false, true};
   }

   private static void id_protected() {
      id_byte = new String[]{new String("GoalBreak{x=%s,y=%s,z=%s}")};
   }
}
