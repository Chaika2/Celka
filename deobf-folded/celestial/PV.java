package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PV extends Pv_1 {
   private static short[] id_break;
   private static boolean[] id_byte;

   public PV(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1287754284;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8024662647665040964L;
   }

   @Override
   public void id_class(rrLE var1) {
      vm_3 var3 = (vm_3)((Ps_1)this.id_class[1]).id_throws().id_class[73];
      if (var3 instanceof FP var2
         && var2.id_class != null
         && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[2]]).id_private().id_throws().id_protected(var2.id_class.id_private())) {
         var1.id_class(true);
      }
   }

   private static void id_class() {
      id_byte = new boolean[]{true};
   }

   private static void id_break() {
      id_break = new short[]{1, 73, 0};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, -116, 104, 53, -4, -92, 99, 84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
