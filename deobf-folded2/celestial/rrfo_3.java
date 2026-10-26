package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfo_3 implements MinecraftAccessor {
   private static short[] id_class;
   private static String[] id_break;
   private static float[] id_byte;
   private static double[] id_protected;
   private static boolean[] id_throws;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1722276922;
   }

   public static boolean id_byte() {
      return ((gm_3)id_import.id_class[56]).id_break((cb_3)id_import.id_class[57], ((cb_3)id_import.id_class[57]).rN().id_protected(0.0, 0.1F, 0.0));
   }

   static {
      ntfClinit();
   }

   public static boolean id_class(rdn_3 var0) {
      if ((cb_3)id_import.id_class[57] == null) {
         return false;
      } else {
         return !((cb_3)id_import.id_class[57]).sK().id_class(var0.id_break()) && !((cb_3)id_import.id_class[57]).r().id_class(var0)
            ? id_throws[16]
            : id_throws[15];
      }
   }

   public static boolean id_class(an_3 var0) {
      yt_3 var1 = ((yX_2)id_import.id_class[8]).id_static();
      return var1 == null ? false : var1.id_class(var0.rN());
   }

   public static void id_class(rpm_3 var0) {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZd_1(var0));
   }

   public static void id_class(int var0) {
      if (rme_3.id_class != var0) {
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rme_3(var0));
         ((Ax_1)id_import.id_class[55]).id_break = var0;
      }
   }

   public static boolean id_class(float var0) {
      boolean var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().a().aJ_();
      boolean var2 = ((cb_3)id_import.id_class[57]).id_class(var0, var1) > 0.9F ? true : id_throws[1];
      boolean var3 = (float)(System.currentTimeMillis() - ((Ax_1)id_import.id_class[55]).id_protected) < 500.0F ? true : id_throws[3];
      return !var2 && !var3 ? id_throws[5] : id_throws[4];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{13, -89, 13, 35, 55, -62, -25, 87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean id_class(iB_2 var0) {
      boolean var1 = true;

      for (rdn_3 var3 : var0.PV()) {
         if (var3.id_class() || !rrfH_2.id_class(var3.id_break())) {
            var1 = id_throws[13];
            break;
         }
      }

      return var1;
   }

   public static boolean id_class(float var0, float var1, float var2) {
      yt_3 var3 = ((yX_2)id_import.id_class[8]).id_static();
      return var3 == null ? false : var3.id_break((double)var0, (double)var1, (double)var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7016357777502199587L;
   }

   public static boolean id_class() {
      rJr_1 var0 = (rJr_1)((cb_3)id_import.id_class[57]).id_implements[4];
      return var0 != null && var0.id_case != 0 && !(var0 instanceof rXi_1) ? true : id_throws[18];
   }

   public static void id_break() {
      id_case();
      id_import.id_break(new mt_3(new rrvL(), id_import, (Ak_1)rrfp_3.id_class[0]));
   }

   public static boolean id_break(int var0) {
      rdn_3 var1 = ((cb_3)id_import.id_class[57]).id_class(rXQ.FEET);
      return !var1.id_class() && rrfH_2.id_class(var1, Pair.of(var0, eY_2.id_implements)) ? true : id_throws[9];
   }

   public static double id_throws() {
      double var0 = 0.0;

      for (rdn_3 var3 : ((cb_3)id_import.id_class[57]).PV()) {
         var0 += rrfH_2.id_byte(var3);
      }

      return var0;
   }

   private static void id_finally() {
      id_protected = new double[]{0.0, 0.1F, 0.0, 0.0};
   }

   private static void id_catch() {
      id_throws = new boolean[]{true, false, true, false, true, false, true, false, true, false, false, false, true, false, false, true, false, true, false};
   }

   private static void id_extends() {
      id_break = new String[]{new String("menu.savingLevel")};
   }

   public static void id_case() {
      boolean var0 = id_import.id_switch();
      ((gm_3)id_import.id_class[56]).id_catch();
      if (var0) {
         id_import.id_byte(new ZE(new rgn_3("menu.savingLevel")));
      } else {
         id_import.id_transient();
      }

      if (var0) {
         id_import.id_break(new rrvL());
      } else {
         id_import.id_break(new vG_2(new rrvL()));
      }
   }

   private static void id_implements() {
      id_byte = new float[]{0.5F, 0.9F, 500.0F};
   }

   public static boolean id_protected() {
      return id_class(0.5F);
   }

   private static void id_private() {
      id_class = new short[]{56, 57, 57, 57, 0, 57, 0, 55, 0, 57, 55, 57, 57, 8, 8, 0, 56, 57, 57, 57, 57, 4};
   }
}
