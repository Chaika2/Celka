package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rJ_2 implements rP_2, rx_3 {
   public Object[] id_class;
   private static double[] id_new;
   private static short[] id_continue;
   private static String[] id_super;
   private static int[] id_this;
   private static boolean[] id_else;
   private static byte[] id_synchronized;

   private static void id_byte() {
      id_new = new double[]{2.0, 0.0};
   }

   public rJ_2(int var1) {
      this.id_case();
      Integer var6 = var1;
      this.id_class[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rJ_2 var2 = (rJ_2)var1;
         return this.id_class[0] == var2.id_class[0] ? true : id_else[5];
      } else {
         return id_else[3];
      }
   }

   @Override
   public String toString() {
      return String.format("GoalYLevel{y=%s}", Pd_1.id_class((Integer)this.id_class[0]));
   }

   @Override
   public int hashCode() {
      return (Integer)this.id_class[0] * 1271009915;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, 115, 96, 70, 10, -50, 57, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2490053521021185537L;
   }

   public static double id_class(int var0, int var1) {
      if (var1 > var0) {
         return id_package[2] / 2.0 * (double)(var1 - var0);
      } else {
         return var1 < var0 ? (double)(var0 - var1) * id_break : id_new[1];
      }
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      return id_class((Integer)this.id_class[0], var2);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1829798921;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var2 == this.id_class[0] ? true : id_else[1];
   }

   private static void id_break() {
      id_synchronized = new byte[]{2};
   }

   private static void id_throws() {
      id_else = new boolean[]{true, false, true, false, true, false, true, false, true, false, false};
   }

   private static void id_catch() {
      id_super = new String[]{new String("GoalYLevel{y=%s}")};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[0] = 0;
      }
   }

   private static void id_protected() {
      id_this = new int[]{1271009915};
   }

   private static void id_private() {
      id_continue = new short[7];
   }
}
