package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIi_1 implements MinecraftAccessor {
   private static boolean[] id_class;
   private static float[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static double[] id_throws;

   private static void id_byte() {
      id_class = new boolean[]{false, true, true, false, true, true, false, true, true, false, true, true, false, true, true};
   }

   static {
      ntfClinit();
   }

   public static float id_class(float var0) {
      return ((cb_3)id_import.id_class[57]).id_throws[41] % 2 == 0 ? var0 - 1.0E-4F : var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 111, -122, -2, 42, 109, 121, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(rrfB_2 var0, double var1, double var3, double var5) {
      switch (((int[])rrfr_3.id_class[0])[var0.ordinal()]) {
         case 1:
            for (int var10 = id_class[0]; var10 < 12; var10++) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZh_1(var1, var3, var5, true));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZh_1(var1, var3 + 0.1F, var5, true));
            }

            for (int var11 = id_class[3]; var11 < 12; var11++) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
                  .id_break(new rZh_1(((cb_3)id_import.id_class[57]).rx(), var3, ((cb_3)id_import.id_class[57]).BO(), true));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
                  .id_break(new rZh_1(((cb_3)id_import.id_class[57]).rx(), var3 + 0.1F, ((cb_3)id_import.id_class[57]).BO(), true));
            }
            break;
         case 2:
         case 3:
            for (int var7 = id_class[6]; var7 < 12; var7++) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZh_1(var1, var3, var5, true));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZh_1(var1, var3 + 0.1F, var5, true));
            }

            for (int var8 = id_class[9]; var8 < 12; var8++) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
                  .id_break(new rZh_1(((cb_3)id_import.id_class[57]).rx(), var3, ((cb_3)id_import.id_class[57]).BO(), true));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
                  .id_break(new rZh_1(((cb_3)id_import.id_class[57]).rx(), var3 + 0.1F, ((cb_3)id_import.id_class[57]).BO(), true));
            }

            for (int var9 = id_class[12]; var9 < 12; var9++) {
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZh_1(var1, var3, var5, true));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZh_1(var1, var3, var5, true));
            }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1123644771;
   }

   private static void id_class() {
      id_byte = new byte[]{12, 12, 12, 12, 12, 2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4908910862679697599L;
   }

   private static void id_break() {
      id_break = new float[]{1.0E-4F};
   }

   private static void id_throws() {
      id_protected = new short[]{0, 57, 0, 57, 0, 57, 0, 57, 57, 57, 0, 57, 57, 57, 0, 57, 0, 57, 0, 57, 57, 57, 0, 57, 57, 57, 0, 57, 0, 57, 41};
   }

   private static void id_protected() {
      id_throws = new double[]{0.1F, 0.1F, 0.1F, 0.1F};
   }
}
