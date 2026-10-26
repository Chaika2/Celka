package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzp_3 implements Iterator<Path> {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new short[]{0, 0, 3, 0, 4, 0, 3, 0, 4};
   }

   public rrzp_3(rrzy_3 var1) {
      this.id_protected();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean hasNext() {
      return ((rrzy_3)this.id_class[0]).id_class[3] ? false : ((Iterator)((rrzy_3)this.id_class[0]).id_class[4]).hasNext();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3574219386184917621L;
   }

   public synchronized Path id_class() {
      if ((Boolean)((rrzy_3)this.id_class[0]).id_class[3]) {
         throw new NoSuchElementException();
      } else {
         return (Path)((Iterator)((rrzy_3)this.id_class[0]).id_class[4]).next();
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-18, -30, 106, 13, 25, -89, -77, 97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 231181357;
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
