package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvY extends Pv_1 {
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{true, false};
   }

   public rrvY(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrFK var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.id_break[id_byte[1]]).id_class()) {
         if (var3 instanceof rrvo_1 var4 && this.id_class()) {
            var4.id_throw().id_break();
            break;
         }
      }
   }

   @Override
   public void id_class(rrLa_1 var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.id_break[id_byte[0]]).id_class()) {
         if (var3 instanceof rrvo_1 var4 && this.id_class()) {
            var4.id_throw().id_class(var1);
            break;
         }
      }
   }

   public boolean id_class() {
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[2]]).id_private().w();
      return var1.aJ_() && var1.id_return() ? true : id_break[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6602298591688164057L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1839176734;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, -84, -14, 76, 11, 66, 49, -65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new short[3];
   }
}
