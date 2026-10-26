package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFC implements MinecraftAccessor {
   private static short[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;
   private static float[] id_case;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_throws[11]] = Integer.valueOf(id_throws[12]);
         var1[id_protected[1]] = id_throws[13];
      }
   }

   public rrFC() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private boolean id_class(iB_2 var1) {
      if ((cb_3)id_import.id_class[id_byte[10]] == null) {
         return id_throws[2];
      } else {
         float var2 = ((cb_3)id_import.id_class[id_byte[11]]).u_() + ((cb_3)id_import.id_class[id_byte[12]]).Sd();
         float var3 = var1.u_() + var1.Sd();
         return var2 >= var3 ? id_throws[3] : id_throws[4];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, -93, -86, -27, 60, 84, -97, -13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9) {
      int var10 = (Integer)var2.id_private[id_byte[0]];
      if (var2 != (iB_2)this.id_class[id_byte[1]] || var10 > (Integer)this.id_class[id_byte[2]]) {
         Boolean var16 = var2 != (cb_3)id_import.id_class[id_byte[3]] && this.id_class(var2) ? id_throws[0] : id_throws[1];
         this.id_class[id_byte[4]] = var16;
      }

      Integer var17 = var10;
      this.id_class[id_byte[5]] = var17;
      this.id_class[id_byte[6]] = var2;
      int var11 = this.id_class[id_byte[7]] ? (Integer)id_break[id_byte[8]] : (Integer)id_break[id_byte[9]];
      rrfD_2.id_class(var1, var2, var3, var4, var5, var6, var7, var8, id_case[0] * var9 / id_case[1], var11);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5759375175269915834L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{-16718336, -65536};
      id_break = var0;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 894441572;
   }

   private static void id_break() {
      id_byte = new short[]{10, 0, 1, 57, 2, 1, 0, 2, 0, 1, 57, 57, 57, 230, 255};
   }

   private static void id_throws() {
      id_throws = new boolean[]{true, false, false, true, false, false, false, false, false, false, true, true, false, false, false, false, true, false};
   }

   private static void id_case() {
      id_protected = new byte[]{3, 2, 2};
   }

   private static void id_protected() {
      id_case = new float[]{1.0F, 255.0F};
   }
}
