package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Eb_1 extends C_try {
   private static String[] id_break;
   private static byte[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;

   public Eb_1(C_case var1) {
      super(var1, "surface", "top");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      rU_2 var3 = ((C_case)this.id_class[0]).id_throw().id_volatile();
      int var4 = ((C_case)this.id_class[0]).id_throw().id_case().id_short();
      int var5 = ((C_case)this.id_class[0]).id_throw().id_case().id_try();
      if (var3.c_() > var4 && ((gm_3)b_.id_class[56]).id_byte(var3.id_class()).id_break() instanceof Ja_1) {
         this.id_case("Вы уже на поверхности");
      } else {
         int var6 = Math.max(var3.c_(), var4);

         for (int var7 = var6; var7 < var5; var7++) {
            rU_2 var8 = new rU_2(var3.b_(), var7, var3.d_());
            if (!(((gm_3)b_.id_class[56]).id_byte(var8).id_break() instanceof Ja_1) && var8.c_() > var3.c_()) {
               rS_2 var9 = new rS_2(var8.id_class());
               this.id_case(String.format("Идем к: %s", var9.toString()));
               ((C_case)this.id_class[0]).id_import().id_break(var9);
               return;
            }
         }

         this.id_case("Не удалось найти поверхность");
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 381185163;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5096936801780201357L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -43, 37, 12, 105, 103, -35, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_break = new String[]{
         new String("surface"),
         new String("top"),
         new String("Вы уже на поверхности"),
         new String("Идем к: %s"),
         new String("Не удалось найти поверхность"),
         new String("Used to get out of caves, mines, ..."),
         new String("The surface/top command tells Baritone to head towards the closest surface-like area."),
         new String(""),
         new String("This can be the surface or the highest available air space, depending on circumstances."),
         new String(""),
         new String("Usage:"),
         new String("> surface - Used to get out of caves, mines, ..."),
         new String("> top - Used to get out of caves, mines, ...")
      };
   }

   private static void id_finally() {
      id_throws = new byte[]{2, 7, 2, 3, 4, 5, 6};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList(
         "The surface/top command tells Baritone to head towards the closest surface-like area.",
         "",
         "This can be the surface or the highest available air space, depending on circumstances.",
         "",
         "Usage:",
         "> surface - Used to get out of caves, mines, ...",
         "> top - Used to get out of caves, mines, ..."
      );
   }

   private static void id_extends() {
      id_catch = new boolean[]{false, true, true, false, false, true, true};
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Used to get out of caves, mines, ...";
   }

   private static void id_protected() {
      id_case = new short[]{0, 0, 0, 56, 56, 0};
   }
}
