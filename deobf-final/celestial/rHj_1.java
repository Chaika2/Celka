package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rHj_1 extends ryO_2 {
   private rqO_2 class_ = new rqO_2("empty");
   private rqO_2 break_ = new rqO_2("empty");
   private rqO_2 byte_ = new rqO_2("empty");
   private rHV protected_ = rHV.ROLLABLE;
   private String throws_ = "minecraft:air";

   public void byte_(rqO_2 var1) {
      this.byte_ = var1;
   }

   public rHj_1(ryW_2<?> var1) {
      super(var1);
   }

   public rHj_1() {
      this(ryW_2.char_);
   }

   public void class_(rHV var1) {
      this.protected_ = var1;
   }

   public void class_(rrEm_1 var1, int var2, boolean var3) {
      rKd_1 var4 = var1.else_().implements_();
      rrPt_1 var5 = var1.O();
      rrrA var6 = var1.protected_();
      Random var7 = var1.long_();
      rfH_2 var8 = this.char_();
      ArrayList var9 = Lists.newArrayList();
      rrPl_1 var10 = new rrPl_1();
      var10.class_(var1, var8, new rfH_2(1, 1, 1), false, (xd_3)null);
      reA_2 var11 = new reA_2(var10);
      rel_3 var12 = new rel_3(var5, var11, var8, 1, rqd_3.NONE, new rfi_3(var8, var8));
      reW_2.class_(var1.new_(), var12, var2, rel_3::new, var4, var5, var9, var7);

      for (rel_3 var14 : var9) {
         var14.class_(var1, var6, var4, var7, rfi_3.break_(), var8, var3);
      }
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("name", this.class_.toString());
      var1.class_("target", this.break_.toString());
      var1.class_("pool", this.byte_.toString());
      var1.class_("final_state", this.throws_);
      var1.class_("joint", this.protected_.class_());
      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_ = new rqO_2(var2.native_("name"));
      this.break_ = new rqO_2(var2.native_("target"));
      this.byte_ = new rqO_2(var2.native_("pool"));
      this.throws_ = var2.native_("final_state");
      this.protected_ = rHV.class_(var2.native_("joint")).orElseGet(() -> kW_2.private_(var1).final_().protected_() ? rHV.ALIGNED : rHV.ROLLABLE);
   }

   public void class_(String var1) {
      this.throws_ = var1;
   }

   public void class_(rqO_2 var1) {
      this.class_ = var1;
   }

   public void break_(rqO_2 var1) {
      this.break_ = var1;
   }

   public rqO_2 throws_() {
      return this.class_;
   }

   public String finally_() {
      return this.throws_;
   }

   public rqO_2 catch_() {
      return this.break_;
   }

   public rHV extends_() {
      return this.protected_;
   }

   public rqO_2 private_() {
      return this.byte_;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 12, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
