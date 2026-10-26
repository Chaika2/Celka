package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmJ_2 implements rruq_1 {
   private static String[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   private static void id_byte() {
      id_break = new String[]{new String(" ")};
   }

   rrmJ_2() {
      this.id_class();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, 50, -7, -127, -97, 39, -60, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6344209331919228763L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 367673369;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String var2 = var1.id_implements();
      if (((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_class(var2)) {
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_byte(var2);
      } else {
         String var3 = var1.id_class(" ", 1);
         rrvm_1 var8 = new rrvm_1(var2, var3, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
         this.id_class[0] = var8;
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_break();
         ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_break(var1x -> {
            if ((rrvm_1)this.id_class[0] != null) {
               ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_class(((rrvm_1)this.id_class[0]).id_class(rrfC_2.id_class(var1x)), true);
               Object var6 = null;
               this.id_class[0] = var6;
            }
         });
      }
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true, true};
   }

   private static void id_protected() {
      id_protected = new short[10];
   }
}
