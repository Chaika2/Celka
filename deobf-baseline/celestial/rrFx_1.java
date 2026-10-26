package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFx_1 extends Pv_1 {
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[]{true, false};
   }

   public rrFx_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrFK var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.id_break[id_break[5]]).id_class()) {
         if (var3 instanceof rrFd_1 var4 && this.id_class()) {
            var4.id_throw().id_class(var1);
            break;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -914225151;
   }

   public boolean id_class() {
      Hud var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[6]]).id_private().w();
      return var1.aJ_() && var1.id_this() && var1.id_throw() ? id_byte[0] : id_byte[1];
   }

   @Override
   public void id_class(rrLC var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.id_break[id_break[0]]).id_class()) {
         if (var3 instanceof rrFd_1 var4 && this.id_class() && var1.id_class() == ((Ps_1)this.id_class[id_break[1]]).id_catch()) {
            var4.id_throw().id_class(var1);
            break;
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4396900578114742150L;
   }

   @Override
   public void id_class(rrLI var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.id_break[id_break[3]]).id_class()) {
         if (var3 instanceof rrFd_1 var4 && this.id_class() && var1.id_byte() == ((Ps_1)this.id_class[id_break[4]]).id_catch()) {
            var4.id_throw().id_class(var1);
            break;
         }
      }
   }

   @Override
   public void id_class(rrAN var1) {
      for (rrtN_2 var3 : ((rrtu_3)rrvV.id_break[id_break[2]]).id_class()) {
         if (var3 instanceof rrFd_1 var4 && this.id_class()) {
            var4.id_throw().id_class(var1);
            break;
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-110, -84, 16, -25, 78, -63, -105, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new short[]{0, 1, 0, 0, 1, 0, 0};
   }
}
