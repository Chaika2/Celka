package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfG_2 {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static String[] protected_;
   private static byte[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rrfG_2(rrfb_3 var1) {
      this.byte_();
      this.class_[0] = var1;
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
         return (rrfb_3)this.class_[0] == (rrfb_3)var2.class_[0] ? true : break_[5];
      } else {
         return break_[3];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((rrfb_3)this.class_[0]);
   }

   public rrfb_3 class_() {
      return (rrfb_3)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3936991579558287306L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 19, 1, -111, 61, -41, -107, 103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1497885829;
   }

   public static rrfG_2 class_(rdn_3 var0) {
      if (var0.break_() == rdy_3.WN && var0.final_()) {
         String var1 = var0.package_().native_("id");

         return switch (var1) {
            case "loots:summon:mystic/loot3" -> new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[0]);
            case "loots:summon:mystic/loot2" -> new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[1]);
            case "loots:summon:mystic/loot1" -> new rrfG_2((rrfb_3)rrfb_3.staticFields6cf753d486d83843b93ccc10386a903f[2]);
            default -> null;
         };
      } else {
         return null;
      }
   }

   private static void break_() {
      byte_ = new short[]{0, 1, 2, 0, 0, 0, 0, 0};
   }

   private static void throws_() {
      break_ = new boolean[]{false, true, true, false, true, false, true};
   }

   private static void case_() {
      throws_ = new byte[]{-1, 2};
   }

   private static void protected_() {
      protected_ = new String[]{
         new String("id"), new String("loots:summon:mystic/loot3"), new String("loots:summon:mystic/loot2"), new String("loots:summon:mystic/loot1")
      };
   }
}
