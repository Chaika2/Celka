package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfG_2 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rrfG_2(rrfb_3 var1) {
      this.id_byte();
      this.id_class[id_byte[7]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrfG_2 var2 = (rrfG_2)var1;
         return (rrfb_3)this.id_class[id_byte[3]] == (rrfb_3)var2.id_class[id_byte[4]] ? true : id_break[5];
      } else {
         return id_break[3];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((rrfb_3)this.id_class[id_byte[5]]);
   }

   public rrfb_3 id_class() {
      return (rrfb_3)this.id_class[id_byte[6]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3936991579558287306L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 19, 1, -111, 61, -41, -107, 103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1497885829;
   }

   public static rrfG_2 id_class(rdn_3 var0) {
      if (var0.id_break() == rdy_3.WN && var0.id_final()) {
         String var1 = var0.id_package().id_native(id_protected[0]);
         byte var3 = -1;
         switch (var1.hashCode()) {
            case -255400917:
               if (var1.equals(id_protected[3])) {
                  var3 = 2;
               }
               break;
            case -255400916:
               if (var1.equals(id_protected[2])) {
                  var3 = 1;
               }
               break;
            case -255400915:
               if (var1.equals(id_protected[1])) {
                  var3 = id_break[0];
               }
         }
         return switch (var3) {
            case 0 -> new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[id_byte[0]]);
            case 1 -> new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[1]);
            case 2 -> new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[2]);
            default -> null;
         };
      } else {
         return null;
      }
   }

   private static void id_break() {
      id_byte = new short[]{0, 1, 2, 0, 0, 0, 0, 0};
   }

   private static void id_throws() {
      id_break = new boolean[]{false, true, true, false, true, false, true};
   }

   private static void id_case() {
      id_throws = new byte[]{-1, 2};
   }

   private static void id_protected() {
      id_protected = new String[]{
         new String("id"), new String("loots:summon:mystic/loot3"), new String("loots:summon:mystic/loot2"), new String("loots:summon:mystic/loot1")
      };
   }
}
