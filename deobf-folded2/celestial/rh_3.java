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
      this.id_class[0] = var8;
      Integer var9 = var2;
      this.id_class[1] = var9;
      Integer var10 = var3;
      this.id_class[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rh_3 var2 = (rh_3)var1;
         return this.id_class[0] == var2.id_class[0] && this.id_class[1] == var2.id_class[1] && this.id_class[2] == var2.id_class[2] ? true : id_break[7];
      } else {
         return id_break[5];
      }
   }

   @Override
   public String toString() {
      return String.format(
         "GoalTwoBlocks{x=%s,y=%s,z=%s}",
         Pd_1.id_class((Integer)this.id_class[0]),
         Pd_1.id_class((Integer)this.id_class[1]),
         Pd_1.id_class((Integer)this.id_class[2])
      );
   }

   @Override
   public int hashCode() {
      return (int)rU_2.id_byte((Integer)this.id_class[0], (Integer)this.id_class[1], (Integer)this.id_class[2]) * 516508351;
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
      int var4 = var1 - (Integer)this.id_class[0];
      int var5 = var2 - (Integer)this.id_class[1];
      int var6 = var3 - (Integer)this.id_class[2];
      return rS_2.id_class((double)var4, var5 < 0 ? var5 + 1 : var5, (double)var6);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var1 == this.id_class[0] && (var2 == this.id_class[1] || var2 == this.id_class[1] - 1) && var3 == this.id_class[2] ? true : id_break[2];
   }

   @Override
   public rfH_2 id_break() {
      return new rfH_2((Integer)this.id_class[0], (Integer)this.id_class[1], (Integer)this.id_class[2]);
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
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   private static void id_private() {
      id_byte = new int[]{516508351};
   }
}
