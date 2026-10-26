package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class IP {
   protected final Gson id_class = new GsonBuilder()
      .registerTypeAdapter(Ir_1.class, new IB())
      .registerTypeAdapter(IK.class, new ID())
      .registerTypeAdapter(IU.class, new Ie_1())
      .registerTypeAdapter(fS_2.class, new fs_3(this))
      .registerTypeAdapter(fb_3.class, new fM_2())
      .create();
   private rCF<xd_3, xc_3> id_break;

   public rCF<xd_3, xc_3> id_class() {
      return this.id_break;
   }

   public void id_class(rCF<xd_3, xc_3> var1) {
      this.id_break = var1;
   }
}
