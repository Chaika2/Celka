package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PV extends Pv_1 {
   private static short[] break_;
   private static boolean[] byte_;

   public PV(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1287754284;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8024662647665040964L;
   }

   @Override
   public void class_(rrLE var1) {
      vm_3 var3 = (vm_3)((Ps_1)this.class_[1]).throws_().class_[73];
      if (var3 instanceof FP var2
         && var2.class_ != null
         && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().protected_(var2.class_.private_())) {
         var1.class_(true);
      }
   }

   private static void class_() {
      byte_ = new boolean[]{true};
   }

   private static void break_() {
      break_ = new short[]{1, 73, 0};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, -116, 104, 53, -4, -92, 99, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
