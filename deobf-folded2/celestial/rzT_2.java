package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.lang.reflect.Type;
import java.util.function.Function;

class rzT_2<E, T extends rzH_2<E>> implements JsonDeserializer<E>, JsonSerializer<E> {
   private final rVL<T> id_class;
   private final String id_break;
   private final String id_byte;
   private final Function<E, T> id_protected;
   private final Pair<T, rzp_3<? extends E>> id_throws;

   rzT_2(rVL<T> var1, String var2, String var3, Function<E, T> var4, Pair<T, rzp_3<? extends E>> var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public E deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (var1.isJsonObject()) {
         JsonObject var4 = rpY_2.id_private(var1, this.id_break);
         rqO_2 var5 = new rqO_2(rpY_2.id_case(var4, this.id_byte));
         rzH_2 var6 = this.id_class.id_class(var5);
         if (var6 == null) {
            throw new JsonSyntaxException("Unknown type '" + var5 + "'");
         } else {
            return (E)var6.id_class().id_class(var4, var3);
         }
      } else if (this.id_throws == null) {
         throw new UnsupportedOperationException("Object " + var1 + " can't be deserialized");
      } else {
         return (E)((rzp_3)this.id_throws.getSecond()).id_class(var1, var3);
      }
   }

   public JsonElement serialize(E var1, Type var2, JsonSerializationContext var3) {
      rzH_2 var4 = this.id_protected.apply((E)var1);
      if (this.id_throws != null && this.id_throws.getFirst() == var4) {
         return ((rzp_3)this.id_throws.getSecond()).id_class(var1, var3);
      } else if (var4 == null) {
         throw new JsonSyntaxException("Unknown type: " + var1);
      } else {
         JsonObject var5 = new JsonObject();
         var5.addProperty(this.id_byte, this.id_class.id_break((T)var4).toString());
         var4.id_class().id_class(var5, var1, var3);
         return var5;
      }
   }
}
