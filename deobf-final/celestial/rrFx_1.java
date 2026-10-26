package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFx_1 extends Pv_1 {
   private static short[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{true, false};
   }

   public rrFx_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrFK var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.break_[0]).class_()) {
         if (var3 instanceof rrFd_1 var4 && this.class_()) {
            var4.throw_().class_(var1);
            break;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -914225151;
   }

   public boolean class_() {
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w();
      return var1.aJ_() && var1.this_() && var1.throw_() ? true : byte_[1];
   }

   @Override
   public void class_(rrLC var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.break_[0]).class_()) {
         if (var3 instanceof rrFd_1 var4 && this.class_() && var1.class_() == ((Ps_1)this.class_[1]).catch_()) {
            var4.throw_().class_(var1);
            break;
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4396900578114742150L;
   }

   @Override
   public void class_(rrLI var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.break_[0]).class_()) {
         if (var3 instanceof rrFd_1 var4 && this.class_() && var1.byte_() == ((Ps_1)this.class_[1]).catch_()) {
            var4.throw_().class_(var1);
            break;
         }
      }
   }

   @Override
   public void class_(rrAN var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.break_[0]).class_()) {
         if (var3 instanceof rrFd_1 var4 && this.class_()) {
            var4.throw_().class_(var1);
            break;
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, -84, 16, -25, 78, -63, -105, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new short[]{0, 1, 0, 0, 1, 0, 0};
   }
}
