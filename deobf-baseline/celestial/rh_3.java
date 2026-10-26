package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rh_3 implements PZ, rP_2 {
   private static boolean[] id_break;
   private static int[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static short[] id_case;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new boolean[]{true, true, false, true, true, false, true, false, false, true, false, false, true, false, false};
   }

   public rh_3(rfH_2 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rh_3(int var1, int var2, int var3) {
      this.id_protected();
      Integer var8 = var1;
      this.id_class[id_case[0]] = var8;
      Integer var9 = var2;
      this.id_class[id_case[1]] = var9;
      Integer var10 = var3;
      this.id_class[id_case[2]] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_break[4];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rh_3 var2 = (rh_3)var1;
         return this.id_class[id_case[13]] == var2.id_class[id_case[14]]
               && this.id_class[id_case[15]] == var2.id_class[id_case[16]]
               && this.id_class[id_case[17]] == var2.id_class[id_case[18]]
            ? id_break[6]
            : id_break[7];
      } else {
         return id_break[5];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_protected[0];
      Object[] var10001 = new Object[id_throws[0]];
      var10001[id_break[8]] = Pd_1.id_class((Integer)this.id_class[id_case[22]]);
      var10001[id_break[9]] = Pd_1.id_class((Integer)this.id_class[id_case[23]]);
      var10001[id_throws[1]] = Pd_1.id_class((Integer)this.id_class[id_case[24]]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return (int)rU_2.id_byte((Integer)this.id_class[id_case[19]], (Integer)this.id_class[id_case[20]], (Integer)this.id_class[id_case[21]]) * id_byte[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, 127, -104, -89, -49, 43, -77, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1644760468;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3671922935217675364L;
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[id_case[7]];
      int var5 = var2 - (Integer)this.id_class[id_case[8]];
      int var6 = var3 - (Integer)this.id_class[id_case[9]];
      return rS_2.id_class((double)var4, var5 < 0 ? var5 + id_break[3] : var5, (double)var6);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var1 == this.id_class[id_case[3]]
            && (var2 == this.id_class[id_case[4]] || var2 == this.id_class[id_case[5]] - id_break[0])
            && var3 == this.id_class[id_case[6]]
         ? id_break[1]
         : id_break[2];
   }

   @Override
   public rfH_2 id_break() {
      return new rfH_2((Integer)this.id_class[id_case[10]], (Integer)this.id_class[id_case[11]], (Integer)this.id_class[id_case[12]]);
   }

   private static void id_throws() {
      id_throws = new byte[]{3, 2, 3, 2};
   }

   private static void id_catch() {
      id_protected = new String[]{new String("GoalTwoBlocks{x=%s,y=%s,z=%s}")};
   }

   private static void id_case() {
      id_case = new short[]{0, 1, 2, 0, 1, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[2]];
         Object[] var1 = this.id_class;
         var1[id_break[10]] = Integer.valueOf(id_break[11]);
         var1[id_break[12]] = Integer.valueOf(id_break[13]);
         var1[id_throws[3]] = Integer.valueOf(id_break[14]);
      }
   }

   private static void id_private() {
      id_byte = new int[]{516508351};
   }
}
