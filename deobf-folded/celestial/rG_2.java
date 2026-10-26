package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rG_2 implements rP_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static int[] id_protected;
   private static double[] id_throws;
   private static String[] id_case;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new int[]{495796690};
   }

   public rG_2(rP_2 var1) {
      this.id_protected();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rG_2 var2 = (rG_2)var1;
         return Objects.equals((rP_2)this.id_class[id_break[2]], (rP_2)var2.id_class[id_break[3]]);
      } else {
         return id_byte[2];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_case[0];
      Object[] var10001 = new Object[1];
      var10001[id_byte[4]] = ((rP_2)this.id_class[id_break[5]]).toString();
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return ((rP_2)this.id_class[id_break[4]]).hashCode() * 495796690;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      return -((rP_2)this.id_class[id_break[1]]).id_class(var1, var2, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-45, 48, -63, -68, -65, 58, -93, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -814363674889322582L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 862855768;
   }

   @Override
   public double id_class() {
      return Double.NEGATIVE_INFINITY;
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true, false, true, false, true};
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return id_byte[0];
   }

   private static void id_throws() {
      id_throws = new double[]{Double.NEGATIVE_INFINITY};
   }

   private static void id_catch() {
      id_break = new short[6];
   }

   private static void id_case() {
      id_case = new String[]{new String("GoalInverted{%s}")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
