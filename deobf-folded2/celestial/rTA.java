package celestial;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const.PrimitiveType;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class rTA extends Schema {
   public static final PrimitiveCodec<String> id_class = new rTn_1();
   private static final Type<String> id_break = new PrimitiveType(id_class);

   public rTA(int var1, Schema var2) {
      super(var1, var2);
   }

   public static String id_class(String var0) {
      rqO_2 var1 = rqO_2.id_break(var0);
      return var1 != null ? var1.toString() : var0;
   }

   public static Type<String> id_class() {
      return id_break;
   }

   public Type<?> getChoiceType(TypeReference var1, String var2) {
      return super.getChoiceType(var1, id_class(var2));
   }
}
