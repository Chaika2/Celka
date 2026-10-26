package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bd_1 extends HashMap<String, String> {
   private static String[] id_class;

   public Bd_1() {
      this.put(id_class[0], id_class[1]);
      this.put(id_class[2], id_class[3]);
      this.put(id_class[4], id_class[5]);
      this.put(id_class[6], id_class[7]);
      this.put(id_class[8], rgF_2.BLUE + "HERO");
      this.put(id_class[9], rgF_2.YELLOW + "TITAN");
      this.put(id_class[10], rgF_2.GREEN + "AVENGER");
      this.put(id_class[11], rgF_2.AQUA + "OVERLORD");
      this.put(id_class[12], rgF_2.GOLD + "MAGISTER");
      this.put(id_class[13], rgF_2.GOLD + "GOD");
      this.put(id_class[14], rgF_2.RED + "VAMPIRE");
      this.put(id_class[15], rgF_2.GOLD + "PEGAS");
      this.put(id_class[16], rgF_2.RED + "IMPERATOR");
      this.put(id_class[17], rgF_2.LIGHT_PURPLE + "DRAGON");
      this.put(id_class[18], rgF_2.LIGHT_PURPLE + "BULL");
      this.put(id_class[19], rgF_2.GOLD + "TIGER");
      this.put(id_class[20], rgF_2.DARK_GREEN + "HYDRA");
      this.put(id_class[21], rgF_2.RED + "DRACULA");
      this.put(id_class[22], rgF_2.GREEN + "COBRA");
      this.put(id_class[23], id_class[24]);
      this.put(id_class[25], rgF_2.DARK_GRAY + "BUNNY");
      this.put(id_class[26], rgF_2.YELLOW + "D.HELPER");
      this.put(id_class[27], rgF_2.LIGHT_PURPLE + "MEDIA");
      this.put(id_class[28], rgF_2.DARK_RED + "YT");
      this.put(id_class[29], rgF_2.YELLOW + "HELPER");
      this.put(id_class[30], rgF_2.BLUE + "ML.MODER");
      this.put(id_class[31], rgF_2.BLUE + "MODER");
      this.put(id_class[32], rgF_2.BLUE + "MODER+");
      this.put(id_class[33], rgF_2.BLUE + "ST.MODER");
      this.put(id_class[34], rgF_2.BLUE + "GL.MODER");
      this.put(id_class[35], rgF_2.AQUA + "ML.ADMIN");
      this.put(id_class[36], rgF_2.DARK_RED + "ADMIN");
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
