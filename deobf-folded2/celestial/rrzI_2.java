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
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;
   private static long[] id_protected;
   private static boolean[] id_throws;

   public long id_byte() {
      return (Long)this.id_class[1];
   }

   public rrzI_2(rrzw_3 var1) throws IOException {
      this.id_catch();
      Path var2 = FileSystems.getDefault().getPath(var1.name());
      Long var7 = Files.size(var2);
      this.id_class[1] = var7;
      FileStore var8 = Files.getFileStore(var2);
      this.id_class[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1222392862;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3692299214967203670L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, -87, 56, -119, -72, 110, -98, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long id_class() throws IOException {
      return !((FileStore)this.id_class[0]).isReadOnly() ? ((FileStore)this.id_class[0]).getUnallocatedSpace() : id_protected[1];
   }

   public long id_break() throws IOException {
      return !((FileStore)this.id_class[0]).isReadOnly() ? ((FileStore)this.id_class[0]).getUsableSpace() : id_protected[0];
   }

   private static void id_throws() {
      id_protected = new long[3];
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = 0L;
      }
   }

   private static void id_case() {
      id_throws = new boolean[]{false, true};
   }

   private static void id_protected() {
      id_break = new short[]{1, 0, 1, 0, 0, 0, 0};
   }

   private static void id_private() {
      id_byte = new byte[]{2};
   }
}
