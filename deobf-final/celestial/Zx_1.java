package celestial;

import java.util.List;

public class Zx_1 extends Zu_1 {
   private final LF class_;

   public Zx_1(rgP_2 var1, List<rpl_3> var2, String var3, rRm_1 var4, rRm_1 var5) {
      super(var1, var3, var2);
      this.class_ = new Zd_1(this, 10, 5, 44, 20, cN_2.class_(var5.class_()), var1x -> {
         boolean var2x = !var5.class_();
         var5.class_(var2x, (rnW_2)null);
         var1x.break_(cN_2.class_(var5.class_()));
      }, var1, var2, var5, var4);
      this.break_.add(this.class_);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.class_(var1, var3, var4);
      this.class_.volatile_ = var4 + var5 - 45;
      this.class_.final_ = var3;
      this.class_.class_(var1, var7, var8, var10);
   }
}
