package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sM_2 extends C_try {
   private static short[] break_;
   private static byte[] throws_;
   private static boolean[] case_;
   private static String[] catch_;

   public sM_2(C_case var1) {
      super(var1, "blacklist");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -485405185305067277L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -378684010;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      rF_2 var3 = ((C_case)this.class_[0]).super_();
      if (!var3.byte_()) {
         throw new k_1("GetToBlockProcess is not currently active");
      } else if (var3.private_()) {
         this.case_("Blacklisted closest instances");
      } else {
         throw new k_1("No known locations, unable to blacklist");
      }
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -37, 42, 117, 91, 124, -95, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new byte[]{4, 2, 3};
   }

   private static void finally_() {
      catch_ = new String[]{
         new String("blacklist"),
         new String("GetToBlockProcess is not currently active"),
         new String("Blacklisted closest instances"),
         new String("No known locations, unable to blacklist"),
         new String("Blacklist closest block"),
         new String("While going to a block this command blacklists the closest block so that Baritone won't attempt to get to it."),
         new String(""),
         new String("Usage:"),
         new String("> blacklist")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "While going to a block this command blacklists the closest block so that Baritone won't attempt to get to it.", "", "Usage:", "> blacklist"
      );
   }

   private static void extends_() {
      break_ = new short[1];
   }

   @Override
   public String implements_() {
      return "Blacklist closest block";
   }

   private static void protected_() {
      case_ = new boolean[]{true, false, false, false, true};
   }
}
