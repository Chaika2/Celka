package celestial;

public abstract class Jo_1 extends xd_3 {
   protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final rjC_2 id_final = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final boolean id_package;

   protected Jo_1(boolean var1, Jq_1 var2) {
      super(var2);
      this.id_package = var1;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue && var2.id_byte(var3).id_class(this)) {
         rCR var7 = var1.id_byte(this.id_implements());
         if (id_class(var3, var2, var7)) {
            id_protected(var1, var2, var3);
            var2.id_class(var3, var6);
         } else {
            this.id_class(var1, var2, var3, var4);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean id_class(rfH_2 var0, rYB var1, rCR var2) {
      if (!id_byte((rRq_1)var1, var0.id_break())) {
         return true;
      } else {
         switch (var2) {
            case ASCENDING_EAST:
               return !id_byte((rRq_1)var1, var0.id_extends());
            case ASCENDING_WEST:
               return !id_byte((rRq_1)var1, var0.id_byte());
            case ASCENDING_NORTH:
               return !id_byte((rRq_1)var1, var0.id_private());
            case ASCENDING_SOUTH:
               return !id_byte((rRq_1)var1, var0.id_protected());
            default:
               return false;
         }
      }
   }

   protected void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4) {
   }

   protected xc_3 id_class(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      if (var1.id_continue) {
         return var3;
      } else {
         rCR var5 = var3.id_byte(this.id_implements());
         return new WJ(var1, var2, var3).id_class(var1.id_public(var2), var4, var5).id_byte();
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = super.id_continue();
      rpr_3 var3 = var1.id_case();
      boolean var4 = var3 == rpr_3.EAST || var3 == rpr_3.WEST;
      return var2.id_class(this.id_implements(), var4 ? rCR.EAST_WEST : rCR.NORTH_SOUTH);
   }

   public static boolean id_class(rYB var0, rfH_2 var1) {
      return id_catch(var0.id_byte(var1));
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rCR var5 = var1.id_class(this) ? var1.id_byte(this.id_implements()) : null;
      return var5 != null && var5.id_break() ? id_final : id_volatile;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return id_byte(var2, var3.id_break());
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break())) {
         this.id_class(var1, var2, var3, var5);
      }
   }

   protected xc_3 id_class(xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      var1 = this.id_class(var2, var3, var1, true);
      if (this.id_package) {
         var1.id_class(var2, var3, this, var3, var4);
      }

      return var1;
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5) {
         super.id_break(var1, var2, var3, var4, var5);
         if (var1.id_byte(this.id_implements()).id_break()) {
            var2.id_break(var3.id_final(), this);
         }

         if (this.id_package) {
            var2.id_break(var3, this);
            var2.id_break(var3.id_break(), this);
         }
      }
   }

   public boolean id_break() {
      return this.id_package;
   }

   public static boolean id_catch(xc_3 var0) {
      return var0.id_class(rls_3.id_float) && var0.id_break() instanceof Jo_1;
   }

   public abstract rCZ<rCR> id_implements();

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.NORMAL;
   }
}
