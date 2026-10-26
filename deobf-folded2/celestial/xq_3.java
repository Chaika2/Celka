package celestial;

public class xq_3 extends WL implements kd_3 {
   public static final rCN id_volatile = rCT.id_throw;
   protected static final rjC_2 id_final = xd_3.id_class(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final rjC_2 id_package = xd_3.id_class(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final rjC_2 id_int = xd_3.id_class(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public xq_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Boolean.valueOf(false)).id_class(id_new, rpB_2.Y));
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile).id_class(id_new);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpB_2)var1.id_byte(id_new)) {
         case X:
         default:
            return id_int;
         case Z:
            return id_package;
         case Y:
            return id_final;
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_volatile)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rXE var2 = var1.id_int().id_break(var1.id_class());
      boolean var3 = var2.id_class() == rXG.id_byte;
      return super.id_class(var1).id_class(id_volatile, Boolean.valueOf(var3));
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_volatile) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }
}
