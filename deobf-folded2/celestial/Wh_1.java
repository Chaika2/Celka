package celestial;

public class Wh_1 extends Jo_1 {
   public static final rCu_1<rCR> id_package = rCT.M;

   protected Wh_1(Jq_1 var1) {
      super(false, var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_package, rCR.NORTH_SOUTH));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_package);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            switch ((rCR)var1.id_byte(id_package)) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
            }
         case COUNTERCLOCKWISE_90:
            switch ((rCR)var1.id_byte(id_package)) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_SOUTH:
                  return var1.id_class(id_package, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.id_class(id_package, rCR.NORTH_SOUTH);
            }
         case CLOCKWISE_90:
            switch ((rCR)var1.id_byte(id_package)) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_SOUTH:
                  return var1.id_class(id_package, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.id_class(id_package, rCR.NORTH_SOUTH);
            }
         default:
            return var1;
      }
   }

   @Override
   protected void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4) {
      if (var4.id_continue().id_implements() && new WJ(var2, var3, var1).id_break() == 3) {
         this.id_class(var2, var3, var1, false);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      rCR var3 = var1.id_byte(id_package);
      switch (var2) {
         case LEFT_RIGHT:
            switch (var3) {
               case ASCENDING_NORTH:
                  return var1.id_class(id_package, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.id_class(id_package, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               default:
                  return super.id_class(var1, var2);
            }
         case FRONT_BACK:
            switch (var3) {
               case ASCENDING_EAST:
                  return var1.id_class(id_package, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.id_class(id_package, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
               case ASCENDING_SOUTH:
               default:
                  break;
               case SOUTH_EAST:
                  return var1.id_class(id_package, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.id_class(id_package, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.id_class(id_package, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.id_class(id_package, rCR.NORTH_WEST);
            }
         default:
            return super.id_class(var1, var2);
      }
   }

   @Override
   public rCZ<rCR> id_implements() {
      return id_package;
   }
}
