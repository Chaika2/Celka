package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import offline.launcher.ViaProtocolCompat;

public class rrjy_3 extends ProtocolVersion {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   private static void byte_() {
      break_ = new boolean[]{true, false, true, false, true, false, true, false, true, false, true, false, false};
   }

   public boolean byte_(ProtocolVersion var1) {
      return this.newerThanOrEqualTo(var1);
   }

   public rrjy_3(int var1, String var2, int var3) {
      super(VersionType.RELEASE, var1, -1, var2, ViaProtocolCompat.subVersionRange(var1));
      this.protected_();
      Integer var8 = var3;
      this.class_[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-115, -65, 127, -32, 111, 41, 77, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 183849974;
   }

   public int class_() {
      return (Integer)this.class_[0];
   }

   public boolean class_(ProtocolVersion var1) {
      return this.newerThan(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7803794668772737745L;
   }

   public boolean break_(ProtocolVersion var1) {
      return this.equalTo(var1);
   }

   private static void break_() {
      byte_ = new short[2];
   }

   public boolean throws_(ProtocolVersion var1) {
      return this.olderThan(var1);
   }

   public boolean protected_(ProtocolVersion var1) {
      return this.olderThanOrEqualTo(var1);
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }
}
