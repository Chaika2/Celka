package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rE_2 implements PZ, rP_2 {
   private static int[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static String[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_case;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[2]];
         Object[] var1 = this.id_class;
         var1[id_throws[11]] = Integer.valueOf(id_throws[12]);
         var1[id_throws[13]] = Integer.valueOf(id_throws[14]);
         var1[id_byte[3]] = Integer.valueOf(id_throws[15]);
      }
   }

   public rE_2(rfH_2 var1) {
      this.id_byte();
      Integer var6 = var1.b_();
      this.id_class[id_case[0]] = var6;
      Integer var7 = var1.c_();
      this.id_class[id_case[1]] = var7;
      Integer var8 = var1.d_();
      this.id_class[id_case[2]] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_throws[5];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rE_2 var2 = (rE_2)var1;
         return this.id_class[id_case[12]] == var2.id_class[id_case[13]]
               && this.id_class[id_case[14]] == var2.id_class[id_case[15]]
               && this.id_class[id_case[16]] == var2.id_class[id_case[17]]
            ? id_throws[7]
            : id_throws[8];
      } else {
         return id_throws[6];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_protected[0];
      Object[] var10001 = new Object[id_byte[0]];
      var10001[id_throws[9]] = Pd_1.id_class((Integer)this.id_class[id_case[21]]);
      var10001[id_throws[10]] = Pd_1.id_class((Integer)this.id_class[id_case[22]]);
      var10001[id_byte[1]] = Pd_1.id_class((Integer)this.id_class[id_case[23]]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return (int)rU_2.id_byte((Integer)this.id_class[id_case[18]], (Integer)this.id_class[id_case[19]], (Integer)this.id_class[id_case[20]]) * id_break[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1775437066;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[id_case[9]];
      int var5 = var2 - (Integer)this.id_class[id_case[10]];
      int var6 = var3 - (Integer)this.id_class[id_case[11]];
      return rS_2.id_class((double)var4, var5 < 0 ? var5 + id_throws[4] : var5, (double)var6);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{2, 60, -92, -2, -98, -51, 18, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6906107583425140550L;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[id_case[6]];
      int var5 = var2 - (Integer)this.id_class[id_case[7]];
      int var6 = var3 - (Integer)this.id_class[id_case[8]];
      return Math.abs(var4) + Math.abs(var5 < 0 ? var5 + id_throws[0] : var5) + Math.abs(var6) <= id_throws[1] ? id_throws[2] : id_throws[3];
   }

   @Override
   public rfH_2 id_break() {
      return new rfH_2((Integer)this.id_class[id_case[3]], (Integer)this.id_class[id_case[4]], (Integer)this.id_class[id_case[5]]);
   }

   private static void id_throws() {
      id_break = new int[]{-49639096};
   }

   private static void id_catch() {
      id_case = new short[]{0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void id_case() {
      id_protected = new String[]{new String("GoalGetToBlock{x=%s,y=%s,z=%s}")};
   }

   private static void id_protected() {
      id_throws = new boolean[]{true, true, true, false, true, true, false, true, false, false, true, false, false, true, false, false};
   }

   private static void id_private() {
      id_byte = new byte[]{3, 2, 3, 2};
   }
}
