package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ButtonSetting extends Setting<Runnable> {
   private static short[] id_byte;
   public Object[] id_break;
   private static byte[] id_protected;

   public ButtonSetting(Module var1, String var2, Runnable var3) {
      super(var2, var3);
      this.id_native();
      this.id_break[id_byte[0]] = var1;
      this.id_break[id_byte[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public Module id_class() {
      this.id_native();
      return (Module)this.id_break[id_byte[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -979700072;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7660900345133855223L;
   }

   public Runnable id_break() {
      this.id_native();
      return (Runnable)this.id_break[id_byte[3]];
   }

   private static void id_finally() {
      id_byte = new short[]{0, 1, 0, 1};
   }

   private static void id_extends() {
      id_protected = new byte[]{2};
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, 9, -126, -51, 77, -1, -21, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[0]];
         Object[] var1 = this.id_break;
      }
   }
}
