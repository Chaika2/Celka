package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzI_2 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;
   private static long[] protected_;
   private static boolean[] throws_;

   public long byte_() {
      return (Long)this.class_[1];
   }

   public rrzI_2(rrzw_3 var1) throws IOException {
      this.catch_();
      Path var2 = FileSystems.getDefault().getPath(var1.name());
      Long var7 = Files.size(var2);
      this.class_[1] = var7;
      FileStore var8 = Files.getFileStore(var2);
      this.class_[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1222392862;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3692299214967203670L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, -87, 56, -119, -72, 110, -98, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long class_() throws IOException {
      return !((FileStore)this.class_[0]).isReadOnly() ? ((FileStore)this.class_[0]).getUnallocatedSpace() : protected_[1];
   }

   public long break_() throws IOException {
      return !((FileStore)this.class_[0]).isReadOnly() ? ((FileStore)this.class_[0]).getUsableSpace() : protected_[0];
   }

   private static void throws_() {
      protected_ = new long[3];
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0L;
      }
   }

   private static void case_() {
      throws_ = new boolean[]{false, true};
   }

   private static void protected_() {
      break_ = new short[]{1, 0, 1, 0, 0, 0, 0};
   }

   private static void private_() {
      byte_ = new byte[]{2};
   }
}
