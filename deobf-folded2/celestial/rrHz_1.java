package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHz_1 {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static double[] id_throws;

   public double id_byte() {
      return (Double)this.id_class[5];
   }

   public rrHz_1(an_3 var1, aI_2<?> var2, double var3, double var5, double var7, double var9, double var11, double var13, int var15) {
      this.id_package();
      this.id_class[0] = var1;
      this.id_class[2] = var2;
      Double var22 = var3;
      this.id_class[3] = var22;
      Double var23 = var5;
      this.id_class[4] = var23;
      Double var24 = var7;
      this.id_class[5] = var24;
      Double var25 = var9;
      this.id_class[6] = var25;
      Double var26 = var11;
      this.id_class[7] = var26;
      Double var27 = var13;
      this.id_class[8] = var27;
      Integer var28 = var15;
      this.id_class[9] = var28;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrHz_1 var2 = (rrHz_1)var1;
         return Objects.equals((an_3)this.id_class[0], (an_3)var2.id_class[0]);
      } else {
         return id_protected[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((an_3)this.id_class[0]);
   }

   public void id_class(List<rjG_2> var1) {
      this.id_class[1] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1556726230;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3901851750731412344L;
   }

   public an_3 id_class() {
      return (an_3)this.id_class[0];
   }

   public double id_class(iB_2 var1) {
      rjU_2 var2 = var1.Ps();
      double var3 = (Double)this.id_class[3] - var2.id_break;
      double var5 = (Double)this.id_class[4] - var2.id_byte;
      double var7 = (Double)this.id_class[5] - var2.id_protected;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, -19, 57, 31, -50, 93, 8, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double id_break() {
      return (Double)this.id_class[8];
   }

   public double id_throws() {
      return (Double)this.id_class[7];
   }

   public double id_finally() {
      return (Double)this.id_class[3];
   }

   public aI_2<?> id_catch() {
      return (aI_2<?>)this.id_class[2];
   }

   private static void id_extends() {
      id_throws = new double[6];
   }

   public double id_case() {
      return (Double)this.id_class[6];
   }

   public int id_implements() {
      return (Integer)this.id_class[9];
   }

   private void id_package() {
      if (this.id_class == null) {
         this.id_class = new Object[10];
         this.id_class[3] = 0.0;
         this.id_class[4] = 0.0;
         this.id_class[5] = 0.0;
         this.id_class[6] = 0.0;
         this.id_class[7] = 0.0;
         this.id_class[8] = 0.0;
         this.id_class[9] = 0;
      }
   }

   public List<rjG_2> id_protected() {
      return (List<rjG_2>)this.id_class[1];
   }

   public double id_private() {
      return (Double)this.id_class[4];
   }

   private static void id_final() {
      id_protected = new boolean[]{true, false, false};
   }

   private static void id_volatile() {
      id_byte = new byte[]{10, 3, 4, 5, 6, 7, 8, 9};
   }

   private static void id_native() {
      id_break = new short[]{3, 4, 5, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 4, 5, 6, 7, 8, 9, 1};
   }
}
