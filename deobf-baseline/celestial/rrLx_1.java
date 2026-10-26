package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLx_1 {
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   public static Object[] id_break;

   private static void id_byte() {
      id_protected = new boolean[]{false, true, false, false, true};
   }

   private static rrLx_1 id_byte(boolean var0) {
      rrLx_1 var10000 = (rrLx_1)id_break[id_byte[0]];
      Boolean var5 = var0;
      var10000.id_class[id_byte[1]] = var5;
      return (rrLx_1)id_break[id_byte[2]];
   }

   public rrLx_1() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1895982560;
   }

   public boolean id_class() {
      return (Boolean)this.id_class[id_byte[5]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5042578329544307841L;
   }

   public static rrLx_1 id_class(boolean var0) {
      rrLx_1 var1 = id_byte(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[3]]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[4]]).id_class(var1);
      return var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, -23, -35, -121, 112, 102, 0, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_byte[6]] = var6;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[1]];
         Object[] var1 = this.id_class;
         var1[id_protected[2]] = id_protected[3];
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLx_1()};
      id_break = var0;
   }

   private static void id_protected() {
      id_byte = new short[7];
   }
}
