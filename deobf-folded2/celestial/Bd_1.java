package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bd_1 extends HashMap<String, String> {
   private static String[] id_class;

   public Bd_1() {
      this.put(" §c●§f ", "");
      this.put(" §6●§f ", "");
      this.put(" §a●§f ", "");
      this.put("§fꔀ §7§7", "");
      this.put("ꔄ", rgF_2.BLUE + "HERO");
      this.put("ꔈ", rgF_2.YELLOW + "TITAN");
      this.put("ꔒ", rgF_2.GREEN + "AVENGER");
      this.put("ꔖ", rgF_2.AQUA + "OVERLORD");
      this.put("ꔠ", rgF_2.GOLD + "MAGISTER");
      this.put("ꕁ", rgF_2.GOLD + "GOD");
      this.put("ꕅ", rgF_2.RED + "VAMPIRE");
      this.put("ꕉ", rgF_2.GOLD + "PEGAS");
      this.put("ꔤ", rgF_2.RED + "IMPERATOR");
      this.put("ꔨ", rgF_2.LIGHT_PURPLE + "DRAGON");
      this.put("ꔲ", rgF_2.LIGHT_PURPLE + "BULL");
      this.put("ꔶ", rgF_2.GOLD + "TIGER");
      this.put("ꕀ", rgF_2.DARK_GREEN + "HYDRA");
      this.put("ꕄ", rgF_2.RED + "DRACULA");
      this.put("ꕈ", rgF_2.GREEN + "COBRA");
      this.put("ꕒ", "RABBIT");
      this.put("ꕖ", rgF_2.DARK_GRAY + "BUNNY");
      this.put("ꕠ", rgF_2.YELLOW + "D.HELPER");
      this.put("ꔁ", rgF_2.LIGHT_PURPLE + "MEDIA");
      this.put("ꔅ", rgF_2.DARK_RED + "YT");
      this.put("ꔉ", rgF_2.YELLOW + "HELPER");
      this.put("ꔓ", rgF_2.BLUE + "ML.MODER");
      this.put("ꔗ", rgF_2.BLUE + "MODER");
      this.put("ꔡ", rgF_2.BLUE + "MODER+");
      this.put("ꔥ", rgF_2.BLUE + "ST.MODER");
      this.put("ꔩ", rgF_2.BLUE + "GL.MODER");
      this.put("ꔳ", rgF_2.AQUA + "ML.ADMIN");
      this.put("ꔷ", rgF_2.DARK_RED + "ADMIN");
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_class = new String[]{
         new String(" §c●§f "),
         new String(""),
         new String(" §6●§f "),
         new String(""),
         new String(" §a●§f "),
         new String(""),
         new String("§fꔀ §7§7"),
         new String(""),
         new String("ꔄ"),
         new String("ꔈ"),
         new String("ꔒ"),
         new String("ꔖ"),
         new String("ꔠ"),
         new String("ꕁ"),
         new String("ꕅ"),
         new String("ꕉ"),
         new String("ꔤ"),
         new String("ꔨ"),
         new String("ꔲ"),
         new String("ꔶ"),
         new String("ꕀ"),
         new String("ꕄ"),
         new String("ꕈ"),
         new String("ꕒ"),
         new String("RABBIT"),
         new String("ꕖ"),
         new String("ꕠ"),
         new String("ꔁ"),
         new String("ꔅ"),
         new String("ꔉ"),
         new String("ꔓ"),
         new String("ꔗ"),
         new String("ꔡ"),
         new String("ꔥ"),
         new String("ꔩ"),
         new String("ꔳ"),
         new String("ꔷ")
      };
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1376781452842169633L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{6, -10, -34, 99, -75, -5, -104, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 22028558;
   }
}
