package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLX {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   private static rrLX id_byte(boolean var0) {
      rrLX var10000 = (rrLX)id_break[0];
      Boolean var5 = var0;
      var10000.id_class[0] = var5;
      return (rrLX)id_break[0];
   }

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrLX()};
      id_break = var0;
   }

   public rrLX() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1793916002;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6087353979856394318L;
   }

   public boolean id_class() {
      return (Boolean)this.id_class[0];
   }

   public static rrLX id_class(boolean var0) {
      rrLX var1 = id_byte(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
      return var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, -15, -108, -14, 3, -44, 114, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true, false, false, true};
   }

   public void id_break(boolean var1) {
      Boolean var6 = var1;
      this.id_class[0] = var6;
   }

   private static void id_throws() {
      id_protected = new short[7];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[0] = false;
      }
   }
}
