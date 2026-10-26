package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class Dl_1 implements Dt_1 {
   private final xd_3 id_class;
   private final List<Dy_1> id_break = Lists.newArrayList();

   private Dl_1(xd_3 var1) {
      this.id_class = var1;
   }

   public Dl_1 id_class(DI var1, List<DS> var2) {
      this.id_break.add(new DH(var1, var2));
      return this;
   }

   public Dl_1 id_class(DI var1, DS... var2) {
      return this.id_class(var1, ImmutableList.copyOf(var2));
   }

   public Dl_1 id_class(DI var1, DS var2) {
      return this.id_class(var1, ImmutableList.of(var2));
   }

   public static Dl_1 id_class(xd_3 var0) {
      return new Dl_1(var0);
   }

   @Override
   public xd_3 id_class() {
      return this.id_class;
   }

   public Dl_1 id_class(List<DS> var1) {
      this.id_break.add(new Dy_1(var1));
      return this;
   }

   public Dl_1 id_class(DS var1) {
      return this.id_class(ImmutableList.of(var1));
   }

   public JsonElement id_break() {
      rCF var1 = this.id_class.id_new();
      this.id_break.forEach(var1x -> var1x.id_class(var1));
      JsonArray var2 = new JsonArray();
      this.id_break.stream().map(Dy_1::id_class).forEach(var2::add);
      JsonObject var3 = new JsonObject();
      var3.add("multipart", var2);
      return var3;
   }
}
