package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzZ_2 extends URLConnection {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   public rrzZ_2(URL var1, Function<rrzv_3, InputStream> var2) {
      super(var1);
      this.id_byte();
      this.id_class[id_byte[0]] = var2;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -62, -36, 24, -124, 115, 39, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1558248895;
   }

   private static void id_class() {
      id_break = new boolean[]{true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5335656178672297368L;
   }

   @Override
   public void connect() throws IOException {
   }

   @Override
   public InputStream getInputStream() {
      return (InputStream)((Function)this.id_class[id_byte[1]]).apply(this.getURL()::openStream);
   }

   private static void id_break() {
      id_byte = new short[2];
   }
}
