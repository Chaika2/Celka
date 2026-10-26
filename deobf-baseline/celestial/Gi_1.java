package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gi_1 extends rh_3 {
   private static String[] id_break;
   private static int[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static byte[] id_case;

   private static void id_byte() {
      id_protected = new short[]{0, 1, 1, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   public Gi_1(rfH_2 var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @Override
   public String toString() {
      String var10000 = id_break[0];
      Object[] var10001 = new Object[id_case[4]];
      var10001[id_throws[4]] = Pd_1.id_class((Integer)this.id_class[id_protected[8]]);
      var10001[id_throws[5]] = Pd_1.id_class((Integer)this.id_class[id_protected[9]]);
      var10001[id_case[5]] = Pd_1.id_class((Integer)this.id_class[id_protected[10]]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return super.hashCode() * id_byte[0];
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[id_protected[5]];
      int var5 = var2 - (Integer)this.id_class[id_protected[6]];
      int var6 = var3 - (Integer)this.id_class[id_protected[7]];
      return rS_2.id_class((double)var4, var5 < id_case[1] ? var5 + id_case[2] : (var5 == id_case[3] ? id_throws[3] : var5), (double)var6);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1047722277;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5830505949635191587L;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var1 == this.id_class[id_protected[0]]
            && (
               var2 == this.id_class[id_protected[1]]
                  || var2 == this.id_class[id_protected[2]] - id_throws[0]
                  || var2 == this.id_class[id_protected[3]] - id_case[0]
            )
            && var3 == this.id_class[id_protected[4]]
         ? id_throws[1]
         : id_throws[2];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 2, -75, -78, -110, -19, -70, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new String[]{new String("GoalThreeBlocks{x=%s,y=%s,z=%s}")};
   }

   private static void id_catch() {
      id_case = new byte[]{2, -1, 2, -1, 3, 2};
   }

   private static void id_case() {
      id_byte = new int[]{393857768};
   }

   private static void id_protected() {
      id_throws = new boolean[]{true, true, false, false, false, true};
   }
}
