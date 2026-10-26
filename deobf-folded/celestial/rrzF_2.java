package celestial;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzF_2 extends URLStreamHandler {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   public rrzF_2(URL var1, Function<rrzv_3, InputStream> var2) {
      this.id_byte();
      this.id_class[id_break[0]] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2347228877716966086L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, 25, 92, -55, 20, 15, 59, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new short[]{0, 1, 0, 1};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 934488735;
   }

   @Override
   public URLConnection openConnection(URL var1) {
      return new rrzZ_2((URL)this.id_class[id_break[2]], (Function<rrzv_3, InputStream>)this.id_class[1]);
   }

   private static void id_break() {
      id_byte = new byte[]{2};
   }
}
