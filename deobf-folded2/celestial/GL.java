package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GL implements rP_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static int[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      id_byte = new boolean[]{true, false, true, false, true, false};
   }

   public GL(rP_2 var1, rP_2 var2) {
      this.id_throws();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         GL var2 = (GL)var1;
         return Objects.equals((rP_2)this.id_class[0], (rP_2)var2.id_class[0]) && Objects.equals((rP_2)this.id_class[1], (rP_2)var2.id_class[1])
            ? true
            : id_byte[5];
      } else {
         return id_byte[3];
      }
   }

   @Override
   public String toString() {
      return "JankyComposite Primary: " + (rP_2)this.id_class[0] + " Fallback: " + (rP_2)this.id_class[1];
   }

   @Override
   public int hashCode() {
      int var1 = -1701079641;
      var1 = var1 * 1196141026 + ((rP_2)this.id_class[0]).hashCode();
      return var1 * -80327868 + ((rP_2)this.id_class[1]).hashCode();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1856897515;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      return ((rP_2)this.id_class[0]).id_class(var1, var2, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, -89, 11, 24, -18, -83, -81, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 602080176750954373L;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return !((rP_2)this.id_class[0]).id_break(var1, var2, var3) && !((rP_2)this.id_class[1]).id_break(var1, var2, var3) ? id_byte[1] : id_byte[0];
   }

   private static void id_break() {
      id_break = new short[]{0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }

   private static void id_protected() {
      id_protected = new int[]{-1701079641, 1196141026, -80327868};
   }
}
