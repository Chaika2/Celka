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
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rrzF_2(URL var1, Function<rrzv_3, InputStream> var2) {
      this.byte_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2347228877716966086L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, 25, 92, -55, 20, 15, 59, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new short[]{0, 1, 0, 1};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 934488735;
   }

   @Override
   public URLConnection openConnection(URL var1) {
      return new rrzZ_2((URL)this.class_[0], (Function<rrzv_3, InputStream>)this.class_[1]);
   }

   private static void break_() {
      byte_ = new byte[]{2};
   }
}
