package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rS_2 implements PZ, rP_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static double[] id_protected;
   private static byte[] id_throws;
   private static int[] id_case;
   public Object[] id_class;
   private static String[] id_catch;

   private static void id_byte() {
      id_case = new int[]{905165533};
   }

   public rS_2(rfH_2 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rS_2(int var1, int var2, int var3) {
      this.id_private();
      Integer var8 = var1;
      this.id_class[id_break[0]] = var8;
      Integer var9 = var2;
      this.id_class[id_break[1]] = var9;
      Integer var10 = var3;
      this.id_class[id_break[2]] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return id_byte[2];
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rS_2 var2 = (rS_2)var1;
         return this.id_class[id_break[9]] == var2.id_class[id_break[10]]
               && this.id_class[id_break[11]] == var2.id_class[id_break[12]]
               && this.id_class[id_break[13]] == var2.id_class[id_break[14]]
            ? id_byte[4]
            : id_byte[5];
      } else {
         return id_byte[3];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_catch[0];
      Object[] var10001 = new Object[id_throws[0]];
      var10001[id_byte[6]] = Pd_1.id_class((Integer)this.id_class[id_break[18]]);
      var10001[id_byte[7]] = Pd_1.id_class((Integer)this.id_class[id_break[19]]);
      var10001[id_throws[1]] = Pd_1.id_class((Integer)this.id_class[id_break[20]]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return (int)rU_2.id_byte((Integer)this.id_class[id_break[15]], (Integer)this.id_class[id_break[16]], (Integer)this.id_class[id_break[17]]) * id_case[0];
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_class[id_break[6]];
      int var5 = var2 - (Integer)this.id_class[id_break[7]];
      int var6 = var3 - (Integer)this.id_class[id_break[8]];
      return id_class((double)var4, var5, (double)var6);
   }

   public static double id_class(double var0, int var2, double var3) {
      double var5 = id_protected[0];
      var5 += rJ_2.id_class(id_byte[8], var2);
      return var5 + rX_2.id_class(var0, var3);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 611550311;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, 42, -30, -43, 102, 120, 50, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7342487622152534617L;
   }

   @Override
   public rfH_2 id_break() {
      return new rfH_2((Integer)this.id_class[id_break[21]], (Integer)this.id_class[id_break[22]], (Integer)this.id_class[id_break[23]]);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var1 == this.id_class[id_break[3]] && var2 == this.id_class[id_break[4]] && var3 == this.id_class[id_break[5]] ? id_byte[0] : id_byte[1];
   }

   private static void id_throws() {
      id_throws = new byte[]{3, 2, 3, 2};
   }

   private static void id_catch() {
      id_protected = new double[1];
   }

   private static void id_case() {
      id_break = new short[]{0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void id_implements() {
      id_byte = new boolean[]{true, false, true, false, true, false, false, true, false, false, false, true, false, false};
   }

   private static void id_protected() {
      id_catch = new String[]{new String("GoalBlock{x=%s,y=%s,z=%s}")};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[2]];
         Object[] var1 = this.id_class;
         var1[id_byte[9]] = Integer.valueOf(id_byte[10]);
         var1[id_byte[11]] = Integer.valueOf(id_byte[12]);
         var1[id_throws[3]] = Integer.valueOf(id_byte[13]);
      }
   }
}
