package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pp_1 extends Pv_1 {
   private static String[] byte_;
   private static short[] protected_;
   private static long[] throws_;
   public Object[] break_;
   private static boolean[] case_;
   private static byte[] catch_;

   private static void byte_() {
      catch_ = new byte[]{3, 2};
   }

   public Pp_1(C_class var1) {
      super(var1);
      this.catch_();
      Long var6 = -1L;
      this.break_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6326508002934234513L;
   }

   @Override
   public void class_(rrAM var1) {
      this.protected_();
   }

   @Override
   public void class_(rrLO var1) {
      this.catch_();
      if (var1.class_() == null
         && (
            (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )) {
         String var2 = var1.protected_().toLowerCase();
         if (var2.contains("[⚔] дуэль началась")) {
            Long var7 = rqR_2.break_();
            this.break_[0] = var7;
         } else if (var2.contains("[⚔] дуэль завершена")) {
            this.case_();
            this.protected_();
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2129577809;
   }

   private static void class_() {
      protected_ = new short[]{0, 1, 2, 1, 4, 0, 0, 0, 1, 19, 0};
   }

   @Override
   public void class_(rrFK var1) {
      this.protected_();
   }

   private static void break_() {
      case_ = new boolean[]{false, true, true, false};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, -65, 97, 85, 63, 76, 49, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      byte_ = new String[]{new String("[⚔] дуэль началась"), new String("[⚔] дуэль завершена"), new String("[⚔]"), new String("#FF6600")};
   }

   private void catch_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = 0L;
      }
   }

   private void case_() {
      this.catch_();
      if ((Long)this.break_[0] != -1L) {
         long var1 = Math.max(0L, rqR_2.break_() - (Long)this.break_[0]);
         String var3 = rql_3.class_(Duration.ofMillis(var1), rqy_3.HOURS, rqy_3.MINUTES, rqy_3.SECONDS);
         rVi_1 var4 = rrfu_3.class_().class_("[⚔]").class_(rVa_1.class_("#FF6600")).break_().class_(new rgN_2(" Дуэль длилась " + rgF_2.YELLOW + var3));
         ((cq_3)((Ps_1)this.class_[1]).throws_().class_[19]).throws_().break_(var4);
      }
   }

   private void protected_() {
      this.catch_();
      Long var5 = -1L;
      this.break_[0] = var5;
   }

   private static void private_() {
      throws_ = new long[]{-1L, -1L, 0L, -1L, 0L};
   }
}
