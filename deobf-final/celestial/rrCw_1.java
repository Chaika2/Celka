package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCw_1 extends rrTF<Velocity> {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true, true, false, false, true, false, false};
   }

   public rrCw_1(Velocity var1) {
      super(var1);
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1748116245440440331L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, 76, -95, -13, 64, -76, 70, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.break_();
      if (var1.class_() instanceof rvc_3 var3) {
         if ((cb_3)import_.class_[57] != null && var3.break_() == ((cb_3)import_.class_[57]).V()) {
            Boolean var8 = true;
            this.class_[0] = var8;
         }
      }
   }

   @EventTarget
   public void class_(rrAO var1) {
      this.break_();
      if ((Boolean)this.class_[0]) {
         var1.break_(true);
         Boolean var6 = false;
         this.class_[0] = var6;
      }
   }

   private static void class_() {
      byte_ = new short[]{57, 57, 0, 0, 0, 0};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -948733648;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         this.class_[0] = false;
      }
   }

   @Override
   public boolean aK_() {
      this.break_();
      Boolean var5 = false;
      this.class_[0] = var5;
      return super.aK_();
   }
}
