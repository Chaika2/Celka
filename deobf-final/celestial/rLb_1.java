package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;

public class rLb_1 implements ruS_2<Af_1> {
   private static final Gson class_ = new GsonBuilder()
      .registerTypeAdapter(ruy_3.class, new rup_3())
      .registerTypeAdapter(ruC_2.class, new rul_3())
      .registerTypeAdapter(run_3.class, new ruH_2())
      .registerTypeHierarchyAdapter(rgP_2.class, new rgB_2())
      .registerTypeHierarchyAdapter(rgc_3.class, new rgm_3())
      .registerTypeAdapterFactory(new rpd_3())
      .create();
   private run_3 break_;

   public rLb_1() {
   }

   public rLb_1(run_3 var1) {
      this.break_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.break_ = rpY_2.class_(class_, var1.throws_(32767), run_3.class);
   }

   public void class_(Af_1 var1) {
      var1.class_(this);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(class_.toJson(this.break_));
   }

   public run_3 break_() {
      return this.break_;
   }
}
