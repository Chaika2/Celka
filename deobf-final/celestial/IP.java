package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class IP {
   protected final Gson class_ = new GsonBuilder()
      .registerTypeAdapter(Ir_1.class, new IB())
      .registerTypeAdapter(IK.class, new ID())
      .registerTypeAdapter(IU.class, new Ie_1())
      .registerTypeAdapter(fS_2.class, new fs_3(this))
      .registerTypeAdapter(fb_3.class, new fM_2())
      .create();
   private rCF<xd_3, xc_3> break_;

   public rCF<xd_3, xc_3> class_() {
      return this.break_;
   }

   public void class_(rCF<xd_3, xc_3> var1) {
      this.break_ = var1;
   }
}
