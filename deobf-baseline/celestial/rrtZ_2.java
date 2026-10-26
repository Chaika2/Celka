package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtZ_2 {
   private static short[] id_class;
   private static float[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_class = new short[]{1, 0};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, -58, -24, -91, 53, 122, -19, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3936614201360387518L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1233933486;
   }

   private static void id_class() {
      id_break = new float[]{
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         34.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         22.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         22.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         22.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         23.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         5.0F,
         0.0F,
         5.0F,
         5.0F,
         20.0F
      };
   }

   public static rrtm_3 id_class(rrtN_2 var0, Setting<?> var1, float var2) {
      if (var1 instanceof rrIm_1 var3) {
         return new rrtp_3(var0, var3, id_break[0], id_break[1], var2 - id_break[2] - id_break[3], id_break[4]);
      } else if (var1 instanceof rrIk_1 var4) {
         return new rrtl_3(var0, var4, id_break[5], id_break[6], var2 - id_break[7] - id_break[8], (float)(id_byte[0] + var4.id_implements() * id_byte[1]));
      } else if (var1 instanceof rrIQ var5) {
         return new rrtV_2(var0, var5, id_break[9], id_break[10], var2 - id_break[11] - id_break[12], id_break[13]);
      } else {
         if (var1 instanceof rrIc_1 var6) {
            if (var6.id_extends() == (rrIu_1)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_class[0]]) {
               return new rrtj_3(var0, var6, id_break[14], id_break[15], var2 - id_break[16] - id_break[17], id_break[18]);
            }

            if (var6.id_extends() == (rrIu_1)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_class[1]]) {
               return new GuiList(var0, var6, id_break[19], id_break[20], var2 - id_break[21] - id_break[22], id_break[23]);
            }
         } else {
            if (var1 instanceof rrIv_1 var7) {
               return new rrtq_3(var0, var7, id_break[24], id_break[25], var2 - id_break[26] - id_break[27], id_break[28]);
            }

            if (var1 instanceof rrIF var8) {
               return new rrtT_2(
                  var0, var8, id_break[29], id_break[30], var2 - id_break[31] - id_break[32], (float)(id_byte[2] + var8.id_implements() * id_byte[3])
               );
            }

            if (var1 instanceof rrIz_1 var9) {
               return new rrtH_2(
                  var0, var9, id_break[33], id_break[34], var2 - id_break[35] - id_break[36], (float)(id_byte[4] + var9.id_implements() * id_byte[5])
               );
            }

            if (var1 instanceof ButtonSetting var10) {
               return new rrty_3(var0, var10, id_break[37], id_break[38], var2 - id_break[39] - id_break[40], id_break[41]);
            }
         }

         return null;
      }
   }

   private static void id_break() {
      id_byte = new byte[]{20, 9, 22, 9, 20, 9};
   }
}
