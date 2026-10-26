package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpL_2 extends rrTF<FtHelper> {
   private static boolean[] break_;
   public Object[] class_;
   private static String[] byte_;
   private static byte[] protected_;
   private static long[] case_;
   private static short[] catch_;

   private boolean byte_() {
      this.class_();
      return (rgP_2)this.class_[0] == null ? false : ((Pattern)Pj_1.break_[0]).matcher(((rgP_2)this.class_[0]).byte_()).find();
   }

   public rrpL_2(FtHelper var1) {
      super(var1);
      this.class_();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAZ var1) {
      if (var1.class_() instanceof Fc_1 var2 && this.byte_()) {
         if (this.continue_().continue_()) {
            this.class_(var2);
         }

         return;
      }
   }

   @EventTarget
   public void class_(rrLU var1) {
      this.class_();
      vm_3 var2 = var1.class_();
      rgP_2 var7 = var2 == null ? null : var2.new_();
      this.class_[0] = var7;
      Integer var8 = 0;
      this.class_[1] = var8;
   }

   private void class_(Fc_1 var1) {
      this.class_();
      if ((rgP_2)this.class_[0] != null) {
         rVi_1 var2 = ((rgP_2)this.class_[0]).case_();
         if ((Integer)this.class_[1] > 0) {
            var2.break_(" ").class_(new rgN_2(this.finally_()).break_(rgF_2.RED));
         }

         String var3 = this.break_();
         if (var3 != null) {
            var2.break_(" ").class_(new rgN_2(var3).break_(rgF_2.YELLOW));
         }

         var1.class_(var2);
      }
   }

   @EventTarget
   public void class_(rrFo_1 var1) {
      this.class_();
      Object var6 = null;
      this.class_[0] = var6;
      Integer var7 = 0;
      this.class_[1] = var7;
   }

   private int class_(List<rJY> var1) {
      int var2 = 0;

      for (rJY var4 : var1) {
         if (var4.break_()) {
            rrNt_1 var5 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).break_(var4);
            if (var5 != null && var5.case_() != -1) {
               var2 += var5.case_();
            }
         }
      }

      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8981317241478819756L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1688258107;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, 93, -120, 96, -25, -8, 67, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = 0;
      }
   }

   @EventTarget
   public void class_(rrAT var1) {
      this.class_();
      vm_3 var3 = (vm_3)import_.class_[73];
      if (var3 instanceof Fc_1 var2 && this.byte_()) {
         rJr_1 var10 = var1.class_();
         List var4 = var10.class_(null);
         Integer var9 = this.class_(var4);
         this.class_[1] = var9;
         this.class_(var2);
         return;
      }
   }

   private String break_() {
      if (!this.continue_().continue_()) {
         return null;
      } else {
         Pj_1 var1 = C_throws.byte_().package_();
         if (var1.byte_()) {
            return null;
         } else {
            long var2 = System.currentTimeMillis() - var1.break_();
            long var4 = Math.max(0L, var1.class_() - var2 - 1000L);
            long var6 = (var4 + 999L) / 1000L;
            long var8 = var6 / 60L;
            long var10 = var6 % 60L;
            return String.format("[⟲ %d:%02d]", var8, var10);
         }
      }
   }

   private static void throws_() {
      protected_ = new byte[]{44, 2, -1, 2};
   }

   private String finally_() {
      this.class_();
      return "[$" + rql_3.class_((Integer)this.class_[1], ',') + "]";
   }

   private static void case_() {
      case_ = new long[]{0L, 1000L, 999L, 1000L, 60L, 60L};
   }

   private static void implements_() {
      catch_ = new short[]{73, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0};
   }

   private static void protected_() {
      byte_ = new String[]{new String(" "), new String(" "), new String("[⟲ %d:%02d]")};
   }

   private static void private_() {
      break_ = new boolean[]{false, false, false, true, false, false, true, false};
   }
}
