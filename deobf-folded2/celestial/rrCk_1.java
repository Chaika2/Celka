package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrCk_1 extends rrTF<AutoTotem> {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   public abstract void id_byte();

   public rrCk_1(AutoTotem var1) {
      super(var1);
      this.id_implements();
      rrmi_3 var6 = new rrmi_3();
      this.id_class[1] = var6;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, -88, 28, 80, 52, 125, 17, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6208523094248859915L;
   }

   public abstract void id_class();

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1491900727;
   }

   public boolean id_break() {
      this.id_implements();
      return (Boolean)this.id_class[0];
   }

   private static void id_throws() {
      id_protected = new boolean[3];
   }

   private static void id_case() {
      id_break = new byte[]{2};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[0] = false;
      }
   }

   public rrmi_3 id_protected() {
      this.id_implements();
      return (rrmi_3)this.id_class[1];
   }

   private static void id_private() {
      id_byte = new short[]{1, 0, 0, 1};
   }

   @Override
   public boolean aK_() {
      this.id_implements();
      Boolean var5 = false;
      this.id_class[0] = var5;
      return super.aK_();
   }
}
