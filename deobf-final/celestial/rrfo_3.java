package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfo_3 implements MinecraftAccessor {
   private static short[] class_;
   private static String[] break_;
   private static float[] byte_;
   private static double[] protected_;
   private static boolean[] throws_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1722276922;
   }

   public static boolean byte_() {
      return ((gm_3)import_.class_[56]).break_((cb_3)import_.class_[57], ((cb_3)import_.class_[57]).rN().protected_(0.0, 0.1F, 0.0));
   }

   static {
      ntfClinit();
   }

   public static boolean class_(rdn_3 var0) {
      if ((cb_3)import_.class_[57] == null) {
         return false;
      } else {
         return !((cb_3)import_.class_[57]).sK().class_(var0.break_()) && !((cb_3)import_.class_[57]).r().class_(var0) ? throws_[16] : throws_[15];
      }
   }

   public static boolean class_(an_3 var0) {
      yt_3 var1 = ((yX_2)import_.class_[8]).static_();
      return var1 == null ? false : var1.class_(var0.rN());
   }

   public static void class_(rpm_3 var0) {
      ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rZd_1(var0));
   }

   public static void class_(int var0) {
      if (rme_3.class_ != var0) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rme_3(var0));
         ((Ax_1)import_.class_[55]).break_ = var0;
      }
   }

   public static boolean class_(float var0) {
      boolean var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().a().aJ_();
      boolean var2 = ((cb_3)import_.class_[57]).class_(var0, var1) > 0.9F ? true : throws_[1];
      boolean var3 = (float)(System.currentTimeMillis() - ((Ax_1)import_.class_[55]).protected_) < 500.0F ? true : throws_[3];
      return !var2 && !var3 ? throws_[5] : throws_[4];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{13, -89, 13, 35, 55, -62, -25, 87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean class_(iB_2 var0) {
      boolean var1 = true;

      for (rdn_3 var3 : var0.PV()) {
         if (var3.class_() || !rrfH_2.class_(var3.break_())) {
            var1 = throws_[13];
            break;
         }
      }

      return var1;
   }

   public static boolean class_(float var0, float var1, float var2) {
      yt_3 var3 = ((yX_2)import_.class_[8]).static_();
      return var3 == null ? false : var3.break_((double)var0, (double)var1, (double)var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7016357777502199587L;
   }

   public static boolean class_() {
      rJr_1 var0 = (rJr_1)((cb_3)import_.class_[57]).implements_[4];
      return var0 != null && var0.case_ != 0 && !(var0 instanceof rXi_1) ? true : throws_[18];
   }

   public static void break_() {
      case_();
      import_.break_(new mt_3(new rrvL(), import_, (Ak_1)rrfp_3.class_[0]));
   }

   public static boolean break_(int var0) {
      rdn_3 var1 = ((cb_3)import_.class_[57]).class_(rXQ.FEET);
      return !var1.class_() && rrfH_2.class_(var1, Pair.of(var0, eY_2.implements_)) ? true : throws_[9];
   }

   public static double throws_() {
      double var0 = 0.0;

      for (rdn_3 var3 : ((cb_3)import_.class_[57]).PV()) {
         var0 += rrfH_2.byte_(var3);
      }

      return var0;
   }

   private static void finally_() {
      protected_ = new double[]{0.0, 0.1F, 0.0, 0.0};
   }

   private static void catch_() {
      throws_ = new boolean[]{true, false, true, false, true, false, true, false, true, false, false, false, true, false, false, true, false, true, false};
   }

   private static void extends_() {
      break_ = new String[]{new String("menu.savingLevel")};
   }

   public static void case_() {
      boolean var0 = import_.switch_();
      ((gm_3)import_.class_[56]).catch_();
      if (var0) {
         import_.byte_(new ZE(new rgn_3("menu.savingLevel")));
      } else {
         import_.transient_();
      }

      if (var0) {
         import_.break_(new rrvL());
      } else {
         import_.break_(new vG_2(new rrvL()));
      }
   }

   private static void implements_() {
      byte_ = new float[]{0.5F, 0.9F, 500.0F};
   }

   public static boolean protected_() {
      return class_(0.5F);
   }

   private static void private_() {
      class_ = new short[]{56, 57, 57, 57, 0, 57, 0, 55, 0, 57, 55, 57, 57, 8, 8, 0, 56, 57, 57, 57, 57, 4};
   }
}
