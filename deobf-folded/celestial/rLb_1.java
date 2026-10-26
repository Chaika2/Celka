package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;

public class rLb_1 implements ruS_2<Af_1> {
   private static final Gson id_class = new GsonBuilder()
      .registerTypeAdapter(ruy_3.class, new rup_3())
      .registerTypeAdapter(ruC_2.class, new rul_3())
      .registerTypeAdapter(run_3.class, new ruH_2())
      .registerTypeHierarchyAdapter(rgP_2.class, new rgB_2())
      .registerTypeHierarchyAdapter(rgc_3.class, new rgm_3())
      .registerTypeAdapterFactory(new rpd_3())
      .create();
   private run_3 id_break;

   public rLb_1() {
   }

   public rLb_1(run_3 var1) {
      this.id_break = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_break = rpY_2.id_class(id_class, var1.id_throws(32767), run_3.class);
   }

   public void id_class(Af_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(id_class.toJson(this.id_break));
   }

   public run_3 id_break() {
      return this.id_break;
   }
}
