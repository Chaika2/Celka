package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BA extends Pv_1 {
   private static boolean[] byte_;
   public Object[] break_;
   private static short[] protected_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   public BA(C_class var1) {
      super(var1);
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public boolean class_() {
      this.byte_();
      return (Boolean)this.break_[0];
   }

   @Override
   public void class_(rrLU var1) {
      super.class_(var1);
      if (var1.class_() instanceof Fu_1 var2) {
         rJr_1 var4 = var2.G_();
         if (var4.case_ != 0 && !(var4 instanceof rXi_1)) {
            this.class_(true);
         }
      }
   }

   @Override
   public void class_(rrFo_1 var1) {
      super.class_(var1);
      if (var1.break_() instanceof Fu_1) {
         this.class_(false);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -345971107;
   }

   private void class_(boolean var1) {
      this.byte_();
      Boolean var6 = var1;
      this.break_[0] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -530730696724975923L;
   }

   @Override
   public void class_(rrAM var1) {
      super.class_(var1);
      this.class_(false);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 92, -71, -121, -64, 81, 50, -54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(y_1 var1) {
      super.break_(var1);
      if (var1.byte_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ruS_2 var2 = var1.protected_();
         if (var2 instanceof rmt_3) {
            this.class_(true);
         } else if (var2 instanceof rmD_2 var3) {
            if (var3.break_() == rmU_2.OPEN_INVENTORY) {
               this.class_(true);
            }
         } else if (var2 instanceof rmj_3) {
            this.class_(false);
         }
      }
   }

   private static void break_() {
      protected_ = new short[3];
   }

   private static void protected_() {
      byte_ = new boolean[]{true, true, false, true, false, false, true, false, false};
   }
}
