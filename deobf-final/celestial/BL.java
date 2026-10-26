package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BL extends Pv_1 {
   private static boolean[] break_;
   private static byte[] byte_;
   private static String[] protected_;
   private static short[] throws_;

   private static void byte_() {
      throws_ = new short[]{0, 1, 1, 0, 2, 0, 2, 0, 1, 1, 0};
   }

   public BL(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new boolean[]{false, true, true, false};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2132120571;
   }

   @Override
   public void class_(A var1) {
      if ((Boolean)C_class.instanceof_().Pd.class_[0]) {
         if (var1.class_() == (n_1)n_1.staticFieldse7df95b1dfb038edb75e6ac1f750d600[1]) {
            rU_2 var2 = rU_2.class_(var1.break_());
            xc_3 var3 = bw_3.class_((Ps_1)this.class_[1], var2);
            if (var3.break_() instanceof xb_3) {
               if (var3.byte_(xb_3.volatile_) == rCp_1.FOOT) {
                  var2 = var2.class_(var3.byte_(xb_3.p));
               }

               Set var4 = ((C_class)this.class_[0]).strictfp_().byte_().class_().break_((C_else)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[2]);
               boolean var5 = var4.stream().map(C_this::class_).filter(var2::equals).findFirst().isPresent();
               if (!var5) {
                  ((C_class)this.class_[0])
                     .strictfp_()
                     .byte_()
                     .class_()
                     .class_(new C_while("bed", (C_else)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[2], var2));
               }
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9213059358347374721L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, 56, -85, -102, 17, 106, -114, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new String[]{
         new String("bed"),
         new String("death"),
         new String("Death position saved."),
         new String("Click to goto death"),
         new String("%s%s goto %s @ %d"),
         new String("wp")
      };
   }

   private static void protected_() {
      byte_ = new byte[]{4, 2, 3};
   }

   @Override
   public void volatile_() {
      if ((Boolean)C_class.instanceof_().y.class_[0]) {
         C_while var1 = new C_while("death", (C_else)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[1], ((Ps_1)this.class_[1]).volatile_());
         ((C_class)this.class_[0]).strictfp_().byte_().class_().class_(var1);
         rVe_1 var2 = new rVe_1("Death position saved.");
         var2.class_(
            var2.class_()
               .class_(rgF_2.WHITE)
               .class_(new rgy_3(rgp_3.class_, new rgN_2("Click to goto death")))
               .class_(new rgl_3(rgH_2.RUN_COMMAND, String.format("%s%s goto %s @ %d", C_throw.class_, "wp", var1.break_().class_(), var1.protected_())))
         );
         PP.a_.class_(var2);
      }
   }
}
