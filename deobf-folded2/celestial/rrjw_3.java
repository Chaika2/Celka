package celestial;

import com.viaversion.viabackwards.api.ViaBackwardsPlatform;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjw_3 implements ViaBackwardsPlatform {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrjw_3(File var1) {
      this.id_byte();
      this.id_class[0] = var1;
      File var2 = (File)this.id_class[0];
      this.init(new File(var2, "config.yml"));
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2048320532;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, -16, -3, -30, -2, -117, -109, -66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new short[]{0, 0, 1, 0};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 430614204804540872L;
   }

   public Logger getLogger() {
      return (Logger)rrjA_2.id_break[1];
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true};
   }

   public void disable() {
   }

   public File getDataFolder() {
      return (File)this.id_class[0];
   }

   public boolean isOutdated() {
      return false;
   }
}
