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
   private final rVL<T> class_;
   private final String break_;
   private final String byte_;
   private final Function<E, T> protected_;
   private final Pair<T, rzp_3<? extends E>> throws_;

   rzT_2(rVL<T> var1, String var2, String var3, Function<E, T> var4, Pair<T, rzp_3<? extends E>> var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public E deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (var1.isJsonObject()) {
         JsonObject var4 = rpY_2.private_(var1, this.break_);
         rqO_2 var5 = new rqO_2(rpY_2.case_(var4, this.byte_));
         rzH_2 var6 = this.class_.class_(var5);
         if (var6 == null) {
            throw new JsonSyntaxException("Unknown type '" + var5 + "'");
         } else {
            return (E)var6.class_().class_(var4, var3);
         }
      } else if (this.throws_ == null) {
         throw new UnsupportedOperationException("Object " + var1 + " can't be deserialized");
      } else {
         return (E)((rzp_3)this.throws_.getSecond()).class_(var1, var3);
      }
   }

   public JsonElement serialize(E var1, Type var2, JsonSerializationContext var3) {
      rzH_2 var4 = this.protected_.apply((E)var1);
      if (this.throws_ != null && this.throws_.getFirst() == var4) {
         return ((rzp_3)this.throws_.getSecond()).class_(var1, var3);
      } else if (var4 == null) {
         throw new JsonSyntaxException("Unknown type: " + var1);
      } else {
         JsonObject var5 = new JsonObject();
         var5.addProperty(this.byte_, this.class_.break_((T)var4).toString());
         var4.class_().class_(var5, var1, var3);
         return var5;
      }
   }
}
