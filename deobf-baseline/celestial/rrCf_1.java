package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCf_1 extends rrTF<Velocity> {
   private static short[] id_class;
   private static boolean[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_break = new boolean[]{true, true};
   }

   public rrCf_1(Velocity var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_protected = new byte[]{31};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, -17, -88, -57, -41, 50, 49, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1856068226;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      ruS_2 var2 = var1.id_class();
      if (var2 instanceof rvc_3 var3) {
         if ((cb_3)id_import.id_class[id_class[0]] != null && var3.id_break() == ((cb_3)id_import.id_class[id_class[1]]).V()) {
            var1.id_class(id_break[0]);
         }
      } else if (var2 instanceof rvu_3 var4) {
         var4.id_class(id_byte[0]);
         var4.id_break(id_byte[1]);
         var4.id_byte(id_byte[2]);
      } else if (var2 instanceof rvQ_2 var5 && var5.id_break() == id_protected[0]) {
         var1.id_class(id_break[1]);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5214565446306757762L;
   }

   private static void id_break() {
      id_class = new short[]{57, 57};
   }

   private static void id_protected() {
      id_byte = new float[3];
   }
}
