package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sM_2 extends C_try {
   private static short[] id_break;
   private static byte[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;

   public sM_2(C_case var1) {
      super(var1, "blacklist");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -485405185305067277L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -378684010;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(0);
      rF_2 var3 = ((C_case)this.id_class[0]).id_super();
      if (!var3.id_byte()) {
         throw new k_1("GetToBlockProcess is not currently active");
      } else if (var3.id_private()) {
         this.id_case("Blacklisted closest instances");
      } else {
         throw new k_1("No known locations, unable to blacklist");
      }
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -37, 42, 117, 91, 124, -95, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new byte[]{4, 2, 3};
   }

   private static void id_finally() {
      id_catch = new String[]{
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
   public List<String> id_catch() {
      return Arrays.asList(
         "While going to a block this command blacklists the closest block so that Baritone won't attempt to get to it.", "", "Usage:", "> blacklist"
      );
   }

   private static void id_extends() {
      id_break = new short[1];
   }

   @Override
   public String id_implements() {
      return "Blacklist closest block";
   }

   private static void id_protected() {
      id_case = new boolean[]{true, false, false, false, true};
   }
}
