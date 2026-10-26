package celestial;

import java.util.List;

public class rkP_2 extends rdb_3 {
   @Override
   public rkc_3 byte_(rdn_3 var1) {
      return rkc_3.BLOCK;
   }

   public rkP_2(rdO_2 var1) {
      super(var1);
      dQ_2.class_(this, rxS_2.class_);
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      var2.break_(var3);
      return rym_3.break_(var4);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rxO_2.class_(var1, var3);
   }

   @Override
   public boolean class_(rdn_3 var1, rdn_3 var2) {
      return rlc_3.byte_.class_(var2.break_()) || super.class_(var1, var2);
   }

   @Override
   public int break_(rdn_3 var1) {
      return 72000;
   }

   @Override
   public String case_(rdn_3 var1) {
      return var1.break_("BlockEntityTag") != null ? this.break_() + "." + protected_(var1).byte_() : super.case_(var1);
   }

   public static rxL_2 protected_(rdn_3 var0) {
      return rxL_2.class_(var0.class_("BlockEntityTag").private_("Base"));
   }
}
