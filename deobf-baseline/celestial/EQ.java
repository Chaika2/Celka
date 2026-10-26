package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EQ {
   private static short[] id_break;
   private static double[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;
   private static String[] id_throws;
   private static boolean[] id_case;

   private static void id_byte() {
      id_protected = new byte[]{4, 2, 3, -1, -1, 8, 2, 3, 4, 5, 7};
   }

   public EQ(int var1, int var2, int var3, rP_2 var4) {
      this.id_protected();
      Object var9 = null;
      this.id_class[id_break[0]] = var9;
      Double var10 = id_byte[0];
      this.id_class[id_break[1]] = var10;
      Double var11 = var4.id_class(var1, var2, var3);
      this.id_class[id_break[2]] = var11;
      if (Double.isNaN((Double)this.id_class[id_break[3]])) {
         String var10002 = id_throws[0];
         Object[] var10003 = new Object[id_protected[0]];
         var10003[id_case[0]] = var4;
         var10003[id_case[1]] = Pd_1.id_class(var1);
         var10003[id_protected[1]] = Pd_1.id_class(var2);
         var10003[id_protected[2]] = Pd_1.id_class(var3);
         throw new IllegalStateException(String.format(var10002, var10003));
      } else {
         Integer var12 = Integer.valueOf(id_protected[3]);
         this.id_class[id_break[4]] = var12;
         Integer var13 = var1;
         this.id_class[id_break[5]] = var13;
         Integer var14 = var2;
         this.id_class[id_break[6]] = var14;
         Integer var15 = var3;
         this.id_class[id_break[7]] = var15;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      EQ var2 = (EQ)var1;
      return this.id_class[id_break[12]] == var2.id_class[id_break[13]]
            && this.id_class[id_break[14]] == var2.id_class[id_break[15]]
            && this.id_class[id_break[16]] == var2.id_class[id_break[17]]
         ? id_case[4]
         : id_case[5];
   }

   @Override
   public int hashCode() {
      return (int)rU_2.id_byte((Integer)this.id_class[id_break[9]], (Integer)this.id_class[id_break[10]], (Integer)this.id_class[id_break[11]]);
   }

   public boolean id_class() {
      return this.id_class[id_break[8]] != id_protected[4] ? id_case[2] : id_case[3];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3072391282506715228L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1240112285;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 114, 75, 80, -127, 36, 53, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new double[]{1000000.0, 0.0, 0.0, 0.0};
   }

   private static void id_throws() {
      id_case = new boolean[]{false, true, true, false, true, false, false, false, true, false, false, false};
   }

   private static void id_catch() {
      id_throws = new String[]{new String("%s calculated implausible heuristic NaN at %s %s %s")};
   }

   private static void id_case() {
      id_break = new short[]{6, 4, 3, 3, 7, 0, 1, 2, 7, 0, 1, 2, 0, 0, 1, 1, 2, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[5]];
         Object[] var1 = this.id_class;
         var1[id_case[6]] = Integer.valueOf(id_case[7]);
         var1[id_case[8]] = Integer.valueOf(id_case[9]);
         var1[id_protected[6]] = Integer.valueOf(id_case[10]);
         var1[id_protected[7]] = id_byte[1];
         var1[id_protected[8]] = id_byte[2];
         var1[id_protected[9]] = id_byte[3];
         var1[id_protected[10]] = Integer.valueOf(id_case[11]);
      }
   }
}
