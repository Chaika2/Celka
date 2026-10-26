package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sz_3 {
   private static boolean[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_byte = new short[]{0, 1, 2, 3};
   }

   private sz_3() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-23, -98, -37, 85, -61, 114, -69, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3144562506864034877L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 367338540;
   }

   public static List<C_interface> id_class(C_case var0) {
      Objects.requireNonNull(var0);
      C_try[] var10002 = new C_try[36];
      var10002[id_class[0]] = new sV_2(var0);
      var10002[1] = new EG(var0);
      var10002[2] = new sf_3(var0);
      var10002[3] = new sj_3(var0);
      var10002[4] = new so_3(var0);
      var10002[5] = new sO_2(var0);
      var10002[6] = new Er_1(var0);
      var10002[7] = new sR_2(var0);
      var10002[8] = new sX_2(var0);
      var10002[9] = new sw_3(var0);
      var10002[10] = new EO(var0);
      var10002[11] = new Eb_1(var0);
      var10002[12] = new sH_2(var0);
      var10002[13] = new sp_3(var0);
      var10002[14] = new sK_2(var0);
      var10002[15] = new sY_2(var0);
      var10002[16] = new sh_3(var0);
      var10002[17] = new EP(var0);
      var10002[18] = new rruf_1(var0);
      var10002[19] = new rrmf_3(var0);
      var10002[20] = new rrms_3(var0);
      var10002[21] = new rrmX_2(var0);
      var10002[22] = new rrmF_2(var0);
      var10002[23] = new rrmH_2(var0);
      var10002[24] = new rrmm_3(var0);
      var10002[25] = new rrmw_3(var0);
      var10002[26] = new rrmI_2(var0);
      var10002[27] = new rrmO_2(var0);
      var10002[28] = new rrug_1(var0);
      var10002[29] = new rrmY_2(var0);
      var10002[30] = new rrmW_2(var0);
      var10002[31] = new rrut_1(var0);
      var10002[32] = new rrua_1(var0);
      var10002[33] = new rrmh_3(var0);
      var10002[34] = new sx_3(var0);
      var10002[35] = new sA_2(var0);
      ArrayList var1 = new ArrayList<>(Arrays.asList(var10002));
      sN_2 var2 = new sN_2(var0);
      var1.add((C_try)var2.id_class[id_byte[0]]);
      var1.add((C_try)var2.id_class[1]);
      var1.add((C_try)var2.id_class[2]);
      var1.add((C_try)var2.id_class[3]);
      return Collections.unmodifiableList(var1);
   }

   private static void id_class() {
      id_break = new byte[]{36, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
   }

   private static void id_break() {
      id_class = new boolean[]{false, true};
   }
}
