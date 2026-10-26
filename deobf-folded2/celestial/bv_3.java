package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bv_3 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   public bL_2 id_byte() {
      return (bL_2)this.id_class[2];
   }

   public bv_3(rfl_3 var1, bL_2[] var2, int var3) {
      this.id_extends();
      Integer var8 = var3;
      this.id_class[0] = var8;
      this.id_class[1] = var2;
      Integer var10 = var2.length;
      this.id_class[5] = var10;
      bL_2 var11 = var2[0];
      this.id_class[2] = var11;
      bL_2 var12 = var2[var2.length - 1];
      this.id_class[3] = var12;
      this.id_class[4] = var1;
   }

   static {
      ntfClinit();
   }

   public int id_class() {
      return (Integer)this.id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -64019766;
   }

   public boolean id_class(rYB var1, rfH_2 var2) {
      return this.id_class(var1, var2, null);
   }

   public int id_class(rfH_2 var1) {
      if (var1 != null && !this.id_catch()) {
         for (int var2 = id_byte[19]; var2 < ((bL_2[])this.id_class[1]).length; var2++) {
            if (((bL_2[])this.id_class[1])[var2].equals(var1)) {
               return var2;
            }
         }

         return id_break[1];
      } else {
         return id_break[0];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, -76, 49, 60, -46, 62, -77, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class(rYB var1, rpr_3 var2) {
      for (bL_2 var6 : (bL_2[])this.id_class[1]) {
         if (var1.id_finally(var6.id_byte(var2))) {
            return false;
         }
      }

      return id_byte[7];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7878301976046139145L;
   }

   public boolean id_class(rYB var1) {
      for (bL_2 var5 : (bL_2[])this.id_class[1]) {
         if (var1.id_finally(var5)) {
            return false;
         }
      }

      return id_byte[4];
   }

   public boolean id_class(rYB var1, rfH_2 var2, rpr_3 var3) {
      for (bL_2 var7 : (bL_2[])this.id_class[1]) {
         if (var7.equals(var2)) {
            if (var3 != null) {
               var7 = var7.id_byte(var3);
            }

            return !var1.id_finally(var7) ? true : id_byte[13];
         }
      }

      return id_byte[14];
   }

   public boolean id_break(rfH_2 var1) {
      if (var1 != null && !this.id_catch()) {
         for (bL_2 var5 : (bL_2[])this.id_class[1]) {
            if (var5.equals(var1)) {
               return true;
            }
         }

         return id_byte[18];
      } else {
         return id_byte[15];
      }
   }

   public boolean id_break(rYB var1, rfH_2 var2) {
      for (bL_2 var6 : (bL_2[])this.id_class[1]) {
         if (var1.id_finally(var6.id_class(var2))) {
            return false;
         }
      }

      return id_byte[10];
   }

   public rfl_3 id_break() {
      return (rfl_3)this.id_class[4];
   }

   public bL_2[] id_throws() {
      return (bL_2[])this.id_class[1];
   }

   private static void id_finally() {
      id_break = new byte[]{-1, -1, 6, 5};
   }

   public boolean id_catch() {
      return rrki_1.id_break((bL_2[])this.id_class[1]);
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[0] = 0;
         var1[5] = 0;
      }
   }

   public int id_case() {
      return (Integer)this.id_class[5];
   }

   private static void id_implements() {
      id_byte = new boolean[]{
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   public bL_2 id_protected() {
      return (bL_2)this.id_class[3];
   }

   private static void id_private() {
      id_protected = new short[]{0, 1, 5, 2, 3, 4, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 2, 3, 4, 5};
   }
}
