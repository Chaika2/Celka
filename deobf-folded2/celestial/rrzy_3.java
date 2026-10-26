package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.ClosedDirectoryStreamException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.DirectoryStream.Filter;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzy_3 implements DirectoryStream<Path> {
   private static byte[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_protected = new String[]{new String("Iterator has already been returned")};
   }

   public rrzy_3(rrQs_1 var1, Filter<? super Path> var2) throws IOException {
      this.id_class();
      rrzf_3 var7 = var1.id_private();
      this.id_class[0] = var7;
      this.id_class[1] = var1;
      this.id_class[2] = var2;
      if (!((rrzf_3)this.id_class[0]).id_protected(var1.id_throws())) {
         throw new NotDirectoryException(var1.toString());
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public synchronized Iterator<Path> iterator() {
      if ((Boolean)this.id_class[3]) {
         throw new ClosedDirectoryStreamException();
      } else if ((Iterator)this.id_class[4] != null) {
         throw new IllegalStateException("Iterator has already been returned");
      } else {
         try {
            Iterator var6 = ((rrzf_3)this.id_class[id_throws[6]])
               .id_class((rrQs_1)this.id_class[id_throws[7]], (Filter<? super Path>)this.id_class[id_throws[8]]);
            this.id_class[id_throws[9]] = var6;
         } catch (IOException var7) {
            throw new DirectoryIteratorException(var7);
         }

         return new rrzp_3(this);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{101, -77, -12, 11, 96, -75, 74, 23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[3] = false;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -325807731;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5085288858633596958L;
   }

   @Override
   public synchronized void close() throws IOException {
      Boolean var5 = true;
      this.id_class[3] = var5;
   }

   private static void id_break() {
      id_byte = new boolean[]{true, false};
   }

   private static void id_throws() {
      id_break = new byte[]{5, 3};
   }

   private static void id_protected() {
      id_throws = new short[]{0, 1, 2, 0, 3, 4, 0, 1, 2, 4, 3};
   }
}
