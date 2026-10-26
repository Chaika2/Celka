package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrle_3 extends rrTF<FreeCamera> {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      byte_ = new short[]{73, 57, 18, 73, 57, 57, 0, 57, 0, 57, 0};
   }

   public rrle_3(FreeCamera var1) {
      super(var1);
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new boolean[]{true, true};
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      ruS_2 var2 = var1.class_();
      if (var2 instanceof rFP) {
         if ((vm_3)import_.class_[73] instanceof Zb_1) {
            return;
         }

         this.continue_().aw_();
      }
   }

   @EventTarget
   public void class_(rrAo_1 var1) {
      FreeCamera var2 = this.continue_();
      if (var2.continue_()) {
         if (!((vm_3)import_.class_[73] instanceof Zb_1)) {
            rrlU_2 var3 = var2.new_();
            if (!var3.protected_() && !((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_) {
               var1.class_(true);
            } else {
               var1.class_(var3.throws_());
               var1.byte_(var3.case_());
               var1.byte_(var3.break_());
               var1.protected_(var3.byte_());
               var1.break_(var3.class_());
               var1.break_(var3.protected_());
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1283178436;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8967797363433077248L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -58, 48, 122, 80, -109, -121, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   @Override
   public boolean aI_() {
      this.break_();
      if ((cb_3)import_.class_[57] != null) {
         rjU_2 var5 = ((cb_3)import_.class_[57]).rv();
         this.class_[0] = var5;
      }

      return super.aI_();
   }

   @Override
   public boolean aK_() {
      this.break_();
      if ((cb_3)import_.class_[57] != null && (rjU_2)this.class_[0] != null && this.continue_().continue_()) {
         ((cb_3)import_.class_[57]).byte_((rjU_2)this.class_[0]);
      }

      return super.aK_();
   }
}
