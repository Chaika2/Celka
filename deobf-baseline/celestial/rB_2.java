package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rB_2 implements rP_2 {
   private static short[] id_break;
   public static Object[] id_class;
   private static String[] id_byte;
   private static boolean[] id_protected;
   private static int[] id_throws;
   private static double[] id_case;

   private static void id_byte() {
      Object[] var0 = new Object[]{0.7071067811865476};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      return var1.getClass() == rB_2.class ? id_protected[2] : id_protected[3];
   }

   @Override
   public String toString() {
      return id_byte[0];
   }

   @Override
   public int hashCode() {
      return id_throws[0];
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = Math.abs(var1);
      int var5 = Math.abs(var3);
      int var6 = Math.min(var4, var5);
      int var7 = Math.max(var4, var5);
      int var8 = var7 - var6;
      double var9 = Math.min((double)var4, Math.min((double)var5, (double)var8 * (Double)id_class[id_break[1]]));
      return var9 * (Double)C_throws.id_break().PS.id_class[id_break[2]]
         + rJ_2.id_class((Integer)C_throws.id_break().id_instanceof.id_class[id_break[3]], var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3597580886043972284L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 535115551;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -106, -113, -63, 70, 88, -113, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new int[]{201385781};
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var2 != C_throws.id_break().id_instanceof.id_class[id_break[0]] || var1 != 0 && var3 != 0 && Math.abs(var1) != Math.abs(var3)
         ? id_protected[1]
         : id_protected[0];
   }

   private static void id_throws() {
      id_break = new short[4];
   }

   private static void id_catch() {
      id_protected = new boolean[]{true, false, true, false, false, true, false};
   }

   private static void id_case() {
      id_byte = new String[]{new String("GoalAxis")};
   }

   private static void id_protected() {
      id_case = new double[]{2.0, 2.0, 0.0};
   }
}
