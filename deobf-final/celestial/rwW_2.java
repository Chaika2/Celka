package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public abstract class rwW_2 extends DataFix {
   private final String class_;
   private final String break_;
   private final TypeReference byte_;

   public rwW_2(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2);
      this.class_ = var3;
      this.byte_ = var4;
      this.break_ = var5;
   }

   protected abstract Typed<?> class_(Typed<?> var1);

   public TypeRewriteRule makeRule() {
      OpticFinder var1 = DSL.namedChoice(this.break_, this.getInputSchema().getChoiceType(this.byte_, this.break_));
      return this.fixTypeEverywhereTyped(
         this.class_,
         this.getInputSchema().getType(this.byte_),
         this.getOutputSchema().getType(this.byte_),
         var2 -> var2.updateTyped(var1, this.getOutputSchema().getChoiceType(this.byte_, this.break_), this::class_)
      );
   }
}
