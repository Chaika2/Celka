package celestial;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const.PrimitiveType;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class rTA extends Schema {
   public static final PrimitiveCodec<String> class_ = new rTn_1();
   private static final Type<String> break_ = new PrimitiveType(class_);

   public rTA(int var1, Schema var2) {
      super(var1, var2);
   }

   public static String class_(String var0) {
      rqO_2 var1 = rqO_2.break_(var0);
      return var1 != null ? var1.toString() : var0;
   }

   public static Type<String> class_() {
      return break_;
   }

   public Type<?> getChoiceType(TypeReference var1, String var2) {
      return super.getChoiceType(var1, class_(var2));
   }
}
