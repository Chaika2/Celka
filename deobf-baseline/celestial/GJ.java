package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GJ {
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_break;

   private static void id_byte() {
      id_throws = new boolean[]{false, true, true, true, false, true, true, false, true, true, false, true, false, true, true};
   }

   public boolean id_byte(bw_3 var1, int var2, int var3, int var4, xc_3 var5) {
      int var6 = xd_3.id_char.id_class(var5);
      int var7 = ((int[])this.id_class[id_protected[9]])[var6];
      if ((var7 & id_throws[5]) == 0) {
         var7 = this.id_class(var6, var5);
      }

      if ((var7 & id_byte[8]) != 0) {
         return EF.id_throws(var1, var2, var3, var4, var5);
      } else {
         return (var7 & id_byte[9]) != 0 ? id_throws[6] : id_throws[7];
      }
   }

   public GJ() {
      this.id_class();
      int[] var5 = new int[xd_3.id_char.id_class()];
      this.id_class[id_protected[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3636416815881542624L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 26, -7, 0, -13, 121, 89, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 773148430;
   }

   public boolean id_class(bw_3 var1, int var2, int var3, int var4, xc_3 var5) {
      int var6 = xd_3.id_char.id_class(var5);
      int var7 = ((int[])this.id_class[id_protected[10]])[var6];
      if ((var7 & id_throws[8]) == 0) {
         var7 = this.id_class(var6, var5);
      }

      if ((var7 & id_byte[10]) != 0) {
         return EF.id_protected(var1, var2, var3, var4, var5);
      } else {
         return (var7 & id_byte[11]) != 0 ? id_throws[9] : id_throws[10];
      }
   }

   private int id_class(int var1, xc_3 var2) {
      int var3 = id_throws[0];
      Gx_1 var4 = EF.id_implements(var2);
      if (var4 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[1]]) {
         var3 |= id_byte[0];
      }

      if (var4 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[2]]) {
         var3 |= id_byte[1];
      }

      Gx_1 var5 = EF.id_private(var2);
      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[3]]) {
         var3 |= id_byte[2];
      }

      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[4]]) {
         var3 |= id_byte[3];
      }

      Gx_1 var6 = EF.id_class(var2);
      if (var6 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[5]]) {
         var3 |= id_byte[4];
      }

      if (var6 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[6]]) {
         var3 |= id_byte[5];
      }

      var3 |= id_throws[1];
      ((int[])this.id_class[id_protected[7]])[var1] = var3;
      return var3;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[11]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_break() {
      id_protected = new short[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0};
   }

   public boolean id_break(bw_3 var1, int var2, int var3, int var4, xc_3 var5) {
      int var6 = xd_3.id_char.id_class(var5);
      int var7 = ((int[])this.id_class[id_protected[8]])[var6];
      if ((var7 & id_throws[2]) == 0) {
         var7 = this.id_class(var6, var5);
      }

      if ((var7 & id_byte[6]) != 0) {
         return EF.id_catch(var1, var2, var3, var4, var5);
      } else {
         return (var7 & id_byte[7]) != 0 ? id_throws[3] : id_throws[4];
      }
   }

   private static void id_throws() {
      id_byte = new byte[]{2, 4, 8, 16, 32, 64, 4, 2, 16, 8, 64, 32, 7, 2, 2, 4, 3, 8, 4, 16, 5, 32, 6, 64};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{1, 2, 4, 8, 16, 32, 64};
      id_break = var0;
   }
}
