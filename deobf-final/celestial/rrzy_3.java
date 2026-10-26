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
   private static byte[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static String[] protected_;
   private static short[] throws_;

   private static void byte_() {
      protected_ = new String[]{new String("Iterator has already been returned")};
   }

   public rrzy_3(rrQs_1 var1, Filter<? super Path> var2) throws IOException {
      this.class_();
      rrzf_3 var7 = var1.private_();
      this.class_[0] = var7;
      this.class_[1] = var1;
      this.class_[2] = var2;
      if (!((rrzf_3)this.class_[0]).protected_(var1.throws_())) {
         throw new NotDirectoryException(var1.toString());
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public synchronized Iterator<Path> iterator() {
      if ((Boolean)this.class_[3]) {
         throw new ClosedDirectoryStreamException();
      } else if ((Iterator)this.class_[4] != null) {
         throw new IllegalStateException("Iterator has already been returned");
      } else {
         try {
            Iterator var6 = ((rrzf_3)this.class_[throws_[6]]).class_((rrQs_1)this.class_[throws_[7]], (Filter<? super Path>)this.class_[throws_[8]]);
            this.class_[throws_[9]] = var6;
         } catch (IOException var7) {
            throw new DirectoryIteratorException(var7);
         }

         return new rrzp_3(this);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{101, -77, -12, 11, 96, -75, 74, 23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[3] = false;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -325807731;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5085288858633596958L;
   }

   @Override
   public synchronized void close() throws IOException {
      Boolean var5 = true;
      this.class_[3] = var5;
   }

   private static void break_() {
      byte_ = new boolean[]{true, false};
   }

   private static void throws_() {
      break_ = new byte[]{5, 3};
   }

   private static void protected_() {
      throws_ = new short[]{0, 1, 2, 0, 3, 4, 0, 1, 2, 4, 3};
   }
}
