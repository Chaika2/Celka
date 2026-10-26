package celestial;

import java.util.Random;

public class rph_3 {
   private static final rqO_2 class_ = new rqO_2("minecraft", "alt");
   private static final rgc_3 break_ = rgc_3.class_.class_(class_);
   private static final rph_3 byte_ = new rph_3();
   private final Random protected_ = new Random();
   private final String[] throws_ = new String[]{
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

   public static rph_3 class_() {
      return byte_;
   }

   public void class_(long var1) {
      this.protected_.setSeed(var1);
   }

   public rgS_2 class_(cm_3 var1, int var2) {
      StringBuilder var3 = new StringBuilder();
      int var4 = this.protected_.nextInt(2) + 3;

      for (int var5 = 0; var5 < var4; var5++) {
         if (var5 != 0) {
            var3.append(" ");
         }

         var3.append(rqR_2.class_(this.throws_, this.protected_));
      }

      return var1.break_().class_(new rgN_2(var3.toString()).break_(break_), var2, rgc_3.class_);
   }
}
