package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrlg_3 extends rrTF<AutoUse> {
   private static short[] id_class;
   private static boolean[] id_break;
   public Object[] id_byte;

   private void id_byte() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
         this.id_byte[0] = false;
      }
   }

   public rrlg_3(AutoUse var1) {
      super(var1);
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public abstract boolean id_class();

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1902234258;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2824705446633795L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 73, -85, 99, -30, -123, 84, -17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[]{false, true, true, false, true, false, false};
   }

   public boolean id_throws() {
      this.id_byte();
      return (Boolean)this.id_byte[id_class[4]];
   }

   public boolean id_case() {
      bO_2 var1 = C_throws.id_byte().id_break();
      return !((cb_3)id_import.id_class[id_class[0]]).id_implements()
            && !((cb_3)id_import.id_class[id_class[1]]).id_native()
            && (!var1.id_byte() || !var1.id_private())
         ? id_break[1]
         : id_break[0];
   }

   private static void id_implements() {
      id_class = new short[]{57, 57, 0, 0, 0};
   }

   public void id_protected() {
      this.id_byte();
      Boolean var5 = id_break[3];
      this.id_byte[id_class[3]] = var5;
   }

   public void id_private() {
      this.id_byte();
      Boolean var5 = id_break[2];
      this.id_byte[id_class[2]] = var5;
   }
}
