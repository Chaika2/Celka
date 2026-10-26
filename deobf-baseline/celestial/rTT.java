package celestial;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;

public class rTT extends DataFix {
   private final String id_class;
   private final TypeReference id_break;

   public rTT(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.id_class = var2;
      this.id_break = var3;
   }

   protected final <K> TypeRewriteRule id_class(String var1, TaggedChoiceType<K> var2, TaggedChoiceType<?> var3) {
      if (var2.getKeyType() != var3.getKeyType()) {
         throw new IllegalStateException("Could not inject: key type is not the same");
      } else {
         return this.fixTypeEverywhere(var1, var2, var3, var2x -> var2xx -> {
               if (!var3.hasType(var2xx.getFirst())) {
                  throw new IllegalArgumentException(String.format("Unknown type %s in %s ", var2xx.getFirst(), this.id_break));
               } else {
                  return var2xx;
               }
            });
      }
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType var1 = this.getInputSchema().findChoiceType(this.id_break);
      TaggedChoiceType var2 = this.getOutputSchema().findChoiceType(this.id_break);
      return this.id_class(this.id_class, var1, var2);
   }
}
