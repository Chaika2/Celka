package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public abstract class rwW_2 extends DataFix {
   private final String id_class;
   private final String id_break;
   private final TypeReference id_byte;

   public rwW_2(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2);
      this.id_class = var3;
      this.id_byte = var4;
      this.id_break = var5;
   }

   protected abstract Typed<?> id_class(Typed<?> var1);

   public TypeRewriteRule makeRule() {
      OpticFinder var1 = DSL.namedChoice(this.id_break, this.getInputSchema().getChoiceType(this.id_byte, this.id_break));
      return this.fixTypeEverywhereTyped(
         this.id_class,
         this.getInputSchema().getType(this.id_byte),
         this.getOutputSchema().getType(this.id_byte),
         var2 -> var2.updateTyped(var1, this.getOutputSchema().getChoiceType(this.id_byte, this.id_break), this::id_class)
      );
   }
}
