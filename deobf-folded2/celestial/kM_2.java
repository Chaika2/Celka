package celestial;

import java.util.Map;

public class kM_2 extends xd_3 {
   public static final rCN id_volatile = Wt_1.id_volatile;
   public static final rCN id_final = Wt_1.id_final;
   public static final rCN id_package = Wt_1.id_package;
   public static final rCN id_int = Wt_1.id_int;
   public static final rCN id_new = Wt_1.id_new;
   public static final rCN id_continue = Wt_1.id_continue;
   private static final Map<rpr_3, rCN> id_super = Wt_1.id_super;

   public kM_2(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(true))
            .id_class(id_final, Boolean.valueOf(true))
            .id_class(id_package, Boolean.valueOf(true))
            .id_class(id_int, Boolean.valueOf(true))
            .id_class(id_new, Boolean.valueOf(true))
            .id_class(id_continue, Boolean.valueOf(true))
      );
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_super.get(var2.id_class(rpr_3.NORTH)), var1.id_byte(id_volatile))
         .id_class(id_super.get(var2.id_class(rpr_3.SOUTH)), var1.id_byte(id_package))
         .id_class(id_super.get(var2.id_class(rpr_3.EAST)), var1.id_byte(id_final))
         .id_class(id_super.get(var2.id_class(rpr_3.WEST)), var1.id_byte(id_int))
         .id_class(id_super.get(var2.id_class(rpr_3.UP)), var1.id_byte(id_new))
         .id_class(id_super.get(var2.id_class(rpr_3.DOWN)), var1.id_byte(id_continue));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_new, id_continue, id_volatile, id_final, id_package, id_int);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(id_super.get(var2.id_break(rpr_3.NORTH)), var1.id_byte(id_volatile))
         .id_class(id_super.get(var2.id_break(rpr_3.SOUTH)), var1.id_byte(id_package))
         .id_class(id_super.get(var2.id_break(rpr_3.EAST)), var1.id_byte(id_final))
         .id_class(id_super.get(var2.id_break(rpr_3.WEST)), var1.id_byte(id_int))
         .id_class(id_super.get(var2.id_break(rpr_3.UP)), var1.id_byte(id_new))
         .id_class(id_super.get(var2.id_break(rpr_3.DOWN)), var1.id_byte(id_continue));
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      return this.id_continue()
         .id_class(id_continue, Boolean.valueOf(this != var2.id_byte(var3.id_break()).id_break()))
         .id_class(id_new, Boolean.valueOf(this != var2.id_byte(var3.id_final()).id_break()))
         .id_class(id_volatile, Boolean.valueOf(this != var2.id_byte(var3.id_private()).id_break()))
         .id_class(id_final, Boolean.valueOf(this != var2.id_byte(var3.id_extends()).id_break()))
         .id_class(id_package, Boolean.valueOf(this != var2.id_byte(var3.id_protected()).id_break()))
         .id_class(id_int, Boolean.valueOf(this != var2.id_byte(var3.id_byte()).id_break()));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var3.id_class(this) ? var1.id_class(id_super.get(var2), Boolean.valueOf(false)) : super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
