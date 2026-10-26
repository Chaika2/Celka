package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class xr_3 extends xF_2 {
   public static final rCc_1 volatile_ = kE_2.p;
   private final zh_3 final_;
   private static final Map<rpr_3, rjC_2> package_ = Maps.newEnumMap(
      ImmutableMap.of(
         rpr_3.SOUTH,
         xd_3.class_(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         rpr_3.WEST,
         xd_3.class_(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         rpr_3.NORTH,
         xd_3.class_(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         rpr_3.EAST,
         xd_3.class_(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );

   protected xr_3(zh_3 var1, Jq_1 var2) {
      super(var2);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.NORTH));
      this.final_ = var1;
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this.break_());
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return !var3.class_(this.final_) && var2 == var1.byte_(volatile_)
         ? this.final_.break_().continue_().class_(zO_2.volatile_, Integer.valueOf(7))
         : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return package_.get(var1.byte_(volatile_));
   }

   protected rdb_3 break_() {
      if (this.final_ == xu_3.Pg) {
         return rdy_3.Jk;
      } else {
         return this.final_ == xu_3.Bg ? rdy_3.JW : rdy_3.class_;
      }
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.class_(xu_3.PS);
   }
}
