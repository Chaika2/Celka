package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class YY implements RI<StringArgumentType> {
   public void id_class(StringArgumentType var1, JsonObject var2) {
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

   public void id_class(StringArgumentType var1, ruu_3 var2) {
      var2.id_class(var1.getType());
   }

   public StringArgumentType id_break(ruu_3 var1) {
      StringType var2 = var1.id_class(StringType.class);
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
