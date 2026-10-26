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
      return ((cb_3)id_import.id_class[id_protected[29]]).id_throws[id_protected[30]] % id_byte[5] == 0 ? var0 - id_break[0] : var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 111, -122, -2, 42, 109, 121, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(rrfB_2 var0, double var1, double var3, double var5) {
      switch (((int[])rrfr_3.id_class[id_protected[0]])[var0.ordinal()]) {
         case 1:
            for (int var10 = id_class[0]; var10 < id_byte[0]; var10++) {
               ((Aq_1)((cb_3)id_import.id_class[id_protected[1]]).id_break[id_protected[2]]).id_break(new rZh_1(var1, var3, var5, id_class[1]));
               ((Aq_1)((cb_3)id_import.id_class[id_protected[3]]).id_break[id_protected[4]]).id_break(new rZh_1(var1, var3 + id_throws[0], var5, id_class[2]));
            }

            for (int var11 = id_class[3]; var11 < id_byte[1]; var11++) {
               ((Aq_1)((cb_3)id_import.id_class[id_protected[5]]).id_break[id_protected[6]])
                  .id_break(new rZh_1(((cb_3)id_import.id_class[id_protected[7]]).rx(), var3, ((cb_3)id_import.id_class[id_protected[8]]).BO(), id_class[4]));
               ((Aq_1)((cb_3)id_import.id_class[id_protected[9]]).id_break[id_protected[10]])
                  .id_break(
                     new rZh_1(
                        ((cb_3)id_import.id_class[id_protected[11]]).rx(), var3 + id_throws[1], ((cb_3)id_import.id_class[id_protected[12]]).BO(), id_class[5]
                     )
                  );
            }
            break;
         case 2:
         case 3:
            for (int var7 = id_class[6]; var7 < id_byte[2]; var7++) {
               ((Aq_1)((cb_3)id_import.id_class[id_protected[13]]).id_break[id_protected[14]]).id_break(new rZh_1(var1, var3, var5, id_class[7]));
               ((Aq_1)((cb_3)id_import.id_class[id_protected[15]]).id_break[id_protected[16]])
                  .id_break(new rZh_1(var1, var3 + id_throws[2], var5, id_class[8]));
            }

            for (int var8 = id_class[9]; var8 < id_byte[3]; var8++) {
               ((Aq_1)((cb_3)id_import.id_class[id_protected[17]]).id_break[id_protected[18]])
                  .id_break(new rZh_1(((cb_3)id_import.id_class[id_protected[19]]).rx(), var3, ((cb_3)id_import.id_class[id_protected[20]]).BO(), id_class[10]));
               ((Aq_1)((cb_3)id_import.id_class[id_protected[21]]).id_break[id_protected[22]])
                  .id_break(
                     new rZh_1(
                        ((cb_3)id_import.id_class[id_protected[23]]).rx(), var3 + id_throws[3], ((cb_3)id_import.id_class[id_protected[24]]).BO(), id_class[11]
                     )
                  );
            }

            for (int var9 = id_class[12]; var9 < id_byte[4]; var9++) {
               ((Aq_1)((cb_3)id_import.id_class[id_protected[25]]).id_break[id_protected[26]]).id_break(new rZh_1(var1, var3, var5, id_class[13]));
               ((Aq_1)((cb_3)id_import.id_class[id_protected[27]]).id_break[id_protected[28]]).id_break(new rZh_1(var1, var3, var5, id_class[14]));
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
