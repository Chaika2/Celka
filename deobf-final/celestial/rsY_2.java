package celestial;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class rsY_2 implements rsR_2 {
   private final rdn_3 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final rdb_3 case_;
   private final int catch_;
   private final float private_;

   public rsY_2(rdb_3 var1, int var2, rdb_3 var3, int var4, int var5, int var6, int var7) {
      this.class_ = new rdn_3(var3);
      this.byte_ = var5;
      this.protected_ = var6;
      this.throws_ = var7;
      this.case_ = var1;
      this.catch_ = var2;
      this.break_ = var4;
      this.private_ = 0.05F;
   }

   @Override
   public rdI_2 class_(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(rdy_3.dP, this.byte_);
      List var4 = rVL.double_.case_().filter(var0 -> !var0.class_().isEmpty() && rAr_1.class_(var0)).collect(Collectors.toList());
      rLi_1 var5 = (rLi_1)var4.get(var2.nextInt(var4.size()));
      rdn_3 var6 = rAB.class_(new rdn_3(this.class_.break_(), this.break_), var5);
      return new rdI_2(var3, new rdn_3(this.case_, this.catch_), var6, this.protected_, this.throws_, this.private_);
   }
}
