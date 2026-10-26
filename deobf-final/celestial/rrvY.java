package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvY extends Pv_1 {
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true, false};
   }

   public rrvY(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrFK var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.break_[0]).class_()) {
         if (var3 instanceof rrvo_1 var4 && this.class_()) {
            var4.throw_().break_();
            break;
         }
      }
   }

   @Override
   public void class_(rrLa_1 var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.break_[0]).class_()) {
         if (var3 instanceof rrvo_1 var4 && this.class_()) {
            var4.throw_().class_(var1);
            break;
         }
      }
   }

   public boolean class_() {
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w();
      return var1.aJ_() && var1.return_() ? true : break_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6602298591688164057L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1839176734;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, -84, -14, 76, 11, 66, 49, -65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new short[3];
   }
}
