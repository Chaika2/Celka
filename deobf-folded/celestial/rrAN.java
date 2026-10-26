package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAN {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   private static void id_byte() {
      id_protected = new short[6];
   }

   public rrAN() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public rLR id_class() {
      return (rLR)this.id_class[id_protected[5]];
   }

   public static rrAN id_class(rLR var0) {
      ((rrAN)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrAN)id_break[id_protected[2]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 66, -62, 109, -16, 30, 69, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1447422709;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7056690815489559153L;
   }

   public static void id_break(rLR var0) {
      rrAN var1 = id_class(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[3]]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[4]]).id_class(var1);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrAN()};
      id_break = var0;
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true, true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
