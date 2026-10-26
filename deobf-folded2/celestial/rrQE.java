package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQE implements Iterator<Path> {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_byte = new short[]{1, 0, 0, 1, 0, 1, 1, 0, 0, 0};
   }

   public rrQE(rrQs_1 var1) {
      this.id_protected();
      this.id_class[1] = var1;
      Integer var7 = 0;
      this.id_class[0] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public void remove() {
      throw new ReadOnlyFileSystemException();
   }

   @Override
   public boolean hasNext() {
      return this.id_class[0] < ((rrQs_1)this.id_class[1]).getNameCount() ? true : id_protected[2];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1405969425;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{103, 91, 123, 0, -22, 100, 98, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8181194376249765417L;
   }

   public Path id_class() {
      if ((Integer)this.id_class[0] < ((rrQs_1)this.id_class[1]).getNameCount()) {
         rrQs_1 var1 = ((rrQs_1)this.id_class[1]).id_class((Integer)this.id_class[0]);
         Integer var6 = (Integer)this.id_class[0] + 1;
         this.id_class[0] = var6;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   private static void id_break() {
      id_break = new byte[]{2};
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, true, false, true, false, false};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[0] = 0;
      }
   }
}
