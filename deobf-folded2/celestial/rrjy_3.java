package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import offline.launcher.ViaProtocolCompat;

public class rrjy_3 extends ProtocolVersion {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new boolean[]{true, false, true, false, true, false, true, false, true, false, true, false, false};
   }

   public boolean id_byte(ProtocolVersion var1) {
      return this.newerThanOrEqualTo(var1);
   }

   public rrjy_3(int var1, String var2, int var3) {
      super(VersionType.RELEASE, var1, -1, var2, ViaProtocolCompat.subVersionRange(var1));
      this.id_protected();
      Integer var8 = var3;
      this.id_class[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-115, -65, 127, -32, 111, 41, 77, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 183849974;
   }

   public int id_class() {
      return (Integer)this.id_class[0];
   }

   public boolean id_class(ProtocolVersion var1) {
      return this.newerThan(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7803794668772737745L;
   }

   public boolean id_break(ProtocolVersion var1) {
      return this.equalTo(var1);
   }

   private static void id_break() {
      id_byte = new short[2];
   }

   public boolean id_throws(ProtocolVersion var1) {
      return this.olderThan(var1);
   }

   public boolean id_protected(ProtocolVersion var1) {
      return this.olderThanOrEqualTo(var1);
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[0] = 0;
      }
   }
}
