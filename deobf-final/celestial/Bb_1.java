package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bb_1 extends Pv_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static String[] throws_;

   private static void byte_() {
      protected_ = new boolean[]{false, true, true, true, true, false, true, false, false};
   }

   public Bb_1(C_class var1) {
      super(var1);
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1750887501455729896L;
   }

   @Override
   public void class_(rrFK var1) {
      this.class_(false);
   }

   public void class_(boolean var1) {
      this.case_();
      if (var1 != (Boolean)this.break_[0]) {
         Boolean var7 = var1;
         this.break_[0] = var7;
         rrFw_1 var2 = rrFw_1.class_(
            this.break_[0] ? (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[0] : (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1]
         );
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1651729777;
   }

   @Override
   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         this.class_(this.protected_());
      }
   }

   public boolean class_() {
      this.case_();
      return (Boolean)this.break_[0];
   }

   private static void break_() {
      byte_ = new short[]{0, 0, 0, 0, 0, 1, 0, 0, 1, 19, 19, 19, 1, 2, 0};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, -76, -124, 113, 5, 17, 6, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("pvp"),
         new String("обычная дуэль"),
         new String("личная дуэль"),
         new String("командная дуэль"),
         new String("рейтинговая дуэль"),
         new String("pvp"),
         new String("окончено")
      };
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   private boolean protected_() {
      QY var1 = ((Ps_1)this.class_[1]).throws_();
      uj_3 var2 = ((cq_3)var1.class_[19]).extends_();
      rgP_2 var3 = ((cq_3)var1.class_[19]).final_();
      int var4 = ((cq_3)var1.class_[19]).package_();
      if (var2.class_("pvp")) {
         return true;
      } else if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         || !var2.class_("обычная дуэль") && !var2.class_("личная дуэль") && !var2.class_("командная дуэль") && !var2.class_("рейтинговая дуэль")) {
         if (rrjS_2.protected_()) {
            return true;
         } else {
            if (var3 != null && var4 > 0) {
               String var5 = var3.getString().toLowerCase();
               if (var5.contains("pvp") && !var5.contains("окончено")) {
                  return true;
               }
            }

            return protected_[5];
         }
      } else {
         return protected_[2];
      }
   }
}
