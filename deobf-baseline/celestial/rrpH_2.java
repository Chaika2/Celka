package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpH_2 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{true};
   }

   public rrpH_2(GriefJoiner var1) {
      this.id_break();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 156743717759219309L;
   }

   public Optional<rrpl_3> id_class(rrfq_3 var1) {
      return var1 == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[1]]
         ? Optional.of(new rrpn_3((GriefJoiner)this.id_class[id_byte[2]]))
         : Optional.empty();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1971815900;
   }

   private static void id_class() {
      id_byte = new short[3];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 40, 69, -98, 75, -61, -5, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }
}
