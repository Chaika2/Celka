package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class YY implements RI<StringArgumentType> {
   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void class_(StringArgumentType var1, JsonObject var2) {
      switch (var1.getType()) {
         case SINGLE_WORD:
            var2.addProperty("type", "word");
            break;
         case QUOTABLE_PHRASE:
            var2.addProperty("type", "phrase");
            break;
         case GREEDY_PHRASE:
         default:
            var2.addProperty("type", "greedy");
      }
   }

   public void class_(StringArgumentType var1, ruu_3 var2) {
      var2.class_(var1.getType());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StringArgumentType break_(ruu_3 var1) {
      StringType var2 = var1.class_(StringType.class);
      switch (var2) {
         case SINGLE_WORD:
            return StringArgumentType.word();
         case QUOTABLE_PHRASE:
            return StringArgumentType.string();
         case GREEDY_PHRASE:
         default:
            return StringArgumentType.greedyString();
      }
   }
}
