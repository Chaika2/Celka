package celestial;

import java.util.Random;

public class rph_3 {
   private static final rqO_2 id_class = new rqO_2("minecraft", "alt");
   private static final rgc_3 id_break = rgc_3.id_class.id_class(id_class);
   private static final rph_3 id_byte = new rph_3();
   private final Random id_protected = new Random();
   private final String[] id_throws = new String[]{
      "the",
      "elder",
      "scrolls",
      "klaatu",
      "berata",
      "niktu",
      "xyzzy",
      "bless",
      "curse",
      "light",
      "darkness",
      "fire",
      "air",
      "earth",
      "water",
      "hot",
      "dry",
      "cold",
      "wet",
      "ignite",
      "snuff",
      "embiggen",
      "twist",
      "shorten",
      "stretch",
      "fiddle",
      "destroy",
      "imbue",
      "galvanize",
      "enchant",
      "free",
      "limited",
      "range",
      "of",
      "towards",
      "inside",
      "sphere",
      "cube",
      "self",
      "other",
      "ball",
      "mental",
      "physical",
      "grow",
      "shrink",
      "demon",
      "elemental",
      "spirit",
      "animal",
      "creature",
      "beast",
      "humanoid",
      "undead",
      "fresh",
      "stale",
      "phnglui",
      "mglwnafh",
      "cthulhu",
      "rlyeh",
      "wgahnagl",
      "fhtagn",
      "baguette"
   };

   private rph_3() {
   }

   public static rph_3 id_class() {
      return id_byte;
   }

   public void id_class(long var1) {
      this.id_protected.setSeed(var1);
   }

   public rgS_2 id_class(cm_3 var1, int var2) {
      StringBuilder var3 = new StringBuilder();
      int var4 = this.id_protected.nextInt(2) + 3;

      for (int var5 = 0; var5 < var4; var5++) {
         if (var5 != 0) {
            var3.append(" ");
         }

         var3.append(rqR_2.id_class(this.id_throws, this.id_protected));
      }

      return var1.id_break().id_class(new rgN_2(var3.toString()).id_break(id_break), var2, rgc_3.id_class);
   }
}
