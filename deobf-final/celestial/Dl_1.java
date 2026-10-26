package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class Dl_1 implements Dt_1 {
   private final xd_3 class_;
   private final List<Dy_1> break_ = Lists.newArrayList();

   private Dl_1(xd_3 var1) {
      this.class_ = var1;
   }

   public Dl_1 class_(DI var1, List<DS> var2) {
      this.break_.add(new DH(var1, var2));
      return this;
   }

   public Dl_1 class_(DI var1, DS... var2) {
      return this.class_(var1, ImmutableList.copyOf(var2));
   }

   public Dl_1 class_(DI var1, DS var2) {
      return this.class_(var1, ImmutableList.of(var2));
   }

   public static Dl_1 class_(xd_3 var0) {
      return new Dl_1(var0);
   }

   @Override
   public xd_3 class_() {
      return this.class_;
   }

   public Dl_1 class_(List<DS> var1) {
      this.break_.add(new Dy_1(var1));
      return this;
   }

   public Dl_1 class_(DS var1) {
      return this.class_(ImmutableList.of(var1));
   }

   public JsonElement break_() {
      rCF var1 = this.class_.new_();
      this.break_.forEach(var1x -> var1x.class_(var1));
      JsonArray var2 = new JsonArray();
      this.break_.stream().map(Dy_1::class_).forEach(var2::add);
      JsonObject var3 = new JsonObject();
      var3.add("multipart", var2);
      return var3;
   }
}
