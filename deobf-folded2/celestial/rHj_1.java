package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rHj_1 extends ryO_2 {
   private rqO_2 id_class = new rqO_2("empty");
   private rqO_2 id_break = new rqO_2("empty");
   private rqO_2 id_byte = new rqO_2("empty");
   private rHV id_protected = rHV.ROLLABLE;
   private String id_throws = "minecraft:air";

   public void id_byte(rqO_2 var1) {
      this.id_byte = var1;
   }

   public rHj_1(ryW_2<?> var1) {
      super(var1);
   }

   public rHj_1() {
      this(ryW_2.id_char);
   }

   public void id_class(rHV var1) {
      this.id_protected = var1;
   }

   public void id_class(rrEm_1 var1, int var2, boolean var3) {
      rKd_1 var4 = var1.id_else().id_implements();
      rrPt_1 var5 = var1.O();
      rrrA var6 = var1.id_protected();
      Random var7 = var1.id_long();
      rfH_2 var8 = this.id_char();
      ArrayList var9 = Lists.newArrayList();
      rrPl_1 var10 = new rrPl_1();
      var10.id_class(var1, var8, new rfH_2(1, 1, 1), false, (xd_3)null);
      reA_2 var11 = new reA_2(var10);
      rel_3 var12 = new rel_3(var5, var11, var8, 1, rqd_3.NONE, new rfi_3(var8, var8));
      reW_2.id_class(var1.id_new(), var12, var2, rel_3::new, var4, var5, var9, var7);

      for (rel_3 var14 : var9) {
         var14.id_class(var1, var6, var4, var7, rfi_3.id_break(), var8, var3);
      }
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("name", this.id_class.toString());
      var1.id_class("target", this.id_break.toString());
      var1.id_class("pool", this.id_byte.toString());
      var1.id_class("final_state", this.id_throws);
      var1.id_class("joint", this.id_protected.id_class());
      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class = new rqO_2(var2.id_native("name"));
      this.id_break = new rqO_2(var2.id_native("target"));
      this.id_byte = new rqO_2(var2.id_native("pool"));
      this.id_throws = var2.id_native("final_state");
      this.id_protected = rHV.id_class(var2.id_native("joint")).orElseGet(() -> kW_2.id_private(var1).id_final().id_protected() ? rHV.ALIGNED : rHV.ROLLABLE);
   }

   public void id_class(String var1) {
      this.id_throws = var1;
   }

   public void id_class(rqO_2 var1) {
      this.id_class = var1;
   }

   public void id_break(rqO_2 var1) {
      this.id_break = var1;
   }

   public rqO_2 id_throws() {
      return this.id_class;
   }

   public String id_finally() {
      return this.id_throws;
   }

   public rqO_2 id_catch() {
      return this.id_break;
   }

   public rHV id_extends() {
      return this.id_protected;
   }

   public rqO_2 id_private() {
      return this.id_byte;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 12, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
