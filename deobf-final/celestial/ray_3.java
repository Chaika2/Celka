package celestial;

import java.util.Random;

public class ray_3 extends riY_2 {
   private boolean throws_;
   private boolean case_;
   private boolean catch_;
   private boolean private_;
   private static final rap_3 implements_ = new rap_3();

   public ray_3(Random var1, int var2, int var3) {
      super(raF_2.long_, var1, var2, 64, var3, 12, 10, 15);
   }

   public ray_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.long_, var2);
      this.throws_ = var2.new_("placedMainChest");
      this.case_ = var2.new_("placedHiddenChest");
      this.catch_ = var2.new_("placedTrap1");
      this.private_ = var2.new_("placedTrap2");
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (!this.class_(var1, var5, 0)) {
         return false;
      } else {
         this.class_(var1, var5, 0, -4, 0, this.class_ - 1, 0, this.byte_ - 1, false, var4, implements_);
         this.class_(var1, var5, 2, 1, 2, 9, 2, 2, false, var4, implements_);
         this.class_(var1, var5, 2, 1, 12, 9, 2, 12, false, var4, implements_);
         this.class_(var1, var5, 2, 1, 3, 2, 2, 11, false, var4, implements_);
         this.class_(var1, var5, 9, 1, 3, 9, 2, 11, false, var4, implements_);
         this.class_(var1, var5, 1, 3, 1, 10, 6, 1, false, var4, implements_);
         this.class_(var1, var5, 1, 3, 13, 10, 6, 13, false, var4, implements_);
         this.class_(var1, var5, 1, 3, 2, 1, 6, 12, false, var4, implements_);
         this.class_(var1, var5, 10, 3, 2, 10, 6, 12, false, var4, implements_);
         this.class_(var1, var5, 2, 3, 2, 9, 3, 12, false, var4, implements_);
         this.class_(var1, var5, 2, 6, 2, 9, 6, 12, false, var4, implements_);
         this.class_(var1, var5, 3, 7, 3, 8, 7, 11, false, var4, implements_);
         this.class_(var1, var5, 4, 8, 4, 7, 8, 10, false, var4, implements_);
         this.break_(var1, var5, 3, 1, 3, 8, 2, 11);
         this.break_(var1, var5, 4, 3, 6, 7, 3, 9);
         this.break_(var1, var5, 2, 4, 2, 9, 5, 12);
         this.break_(var1, var5, 4, 6, 5, 7, 6, 9);
         this.break_(var1, var5, 5, 7, 6, 6, 7, 8);
         this.break_(var1, var5, 5, 1, 2, 6, 2, 2);
         this.break_(var1, var5, 5, 2, 12, 6, 2, 12);
         this.break_(var1, var5, 5, 5, 1, 6, 5, 1);
         this.break_(var1, var5, 5, 5, 13, 6, 5, 13);
         this.class_(var1, xu_3.class_.continue_(), 1, 5, 5, var5);
         this.class_(var1, xu_3.class_.continue_(), 10, 5, 5, var5);
         this.class_(var1, xu_3.class_.continue_(), 1, 5, 9, var5);
         this.class_(var1, xu_3.class_.continue_(), 10, 5, 9, var5);

         for (byte var8 = 0; var8 <= 14; var8 += 14) {
            this.class_(var1, var5, 2, 4, var8, 2, 5, var8, false, var4, implements_);
            this.class_(var1, var5, 4, 4, var8, 4, 5, var8, false, var4, implements_);
            this.class_(var1, var5, 7, 4, var8, 7, 5, var8, false, var4, implements_);
            this.class_(var1, var5, 9, 4, var8, 9, 5, var8, false, var4, implements_);
         }

         this.class_(var1, var5, 5, 6, 0, 6, 6, 0, false, var4, implements_);

         for (byte var14 = 0; var14 <= 11; var14 += 11) {
            for (byte var9 = 2; var9 <= 12; var9 += 2) {
               this.class_(var1, var5, var14, 4, var9, var14, 5, var9, false, var4, implements_);
            }

            this.class_(var1, var5, var14, 6, 5, var14, 6, 5, false, var4, implements_);
            this.class_(var1, var5, var14, 6, 9, var14, 6, 9, false, var4, implements_);
         }

         this.class_(var1, var5, 2, 7, 2, 2, 9, 2, false, var4, implements_);
         this.class_(var1, var5, 9, 7, 2, 9, 9, 2, false, var4, implements_);
         this.class_(var1, var5, 2, 7, 12, 2, 9, 12, false, var4, implements_);
         this.class_(var1, var5, 9, 7, 12, 9, 9, 12, false, var4, implements_);
         this.class_(var1, var5, 4, 9, 4, 4, 9, 4, false, var4, implements_);
         this.class_(var1, var5, 7, 9, 4, 7, 9, 4, false, var4, implements_);
         this.class_(var1, var5, 4, 9, 10, 4, 9, 10, false, var4, implements_);
         this.class_(var1, var5, 7, 9, 10, 7, 9, 10, false, var4, implements_);
         this.class_(var1, var5, 5, 9, 7, 6, 9, 7, false, var4, implements_);
         xc_3 var15 = xu_3.Pd.continue_().class_(zG_2.volatile_, rpr_3.EAST);
         xc_3 var16 = xu_3.Pd.continue_().class_(zG_2.volatile_, rpr_3.WEST);
         xc_3 var10 = xu_3.Pd.continue_().class_(zG_2.volatile_, rpr_3.SOUTH);
         xc_3 var11 = xu_3.Pd.continue_().class_(zG_2.volatile_, rpr_3.NORTH);
         this.class_(var1, var11, 5, 9, 6, var5);
         this.class_(var1, var11, 6, 9, 6, var5);
         this.class_(var1, var10, 5, 9, 8, var5);
         this.class_(var1, var10, 6, 9, 8, var5);
         this.class_(var1, var11, 4, 0, 0, var5);
         this.class_(var1, var11, 5, 0, 0, var5);
         this.class_(var1, var11, 6, 0, 0, var5);
         this.class_(var1, var11, 7, 0, 0, var5);
         this.class_(var1, var11, 4, 1, 8, var5);
         this.class_(var1, var11, 4, 2, 9, var5);
         this.class_(var1, var11, 4, 3, 10, var5);
         this.class_(var1, var11, 7, 1, 8, var5);
         this.class_(var1, var11, 7, 2, 9, var5);
         this.class_(var1, var11, 7, 3, 10, var5);
         this.class_(var1, var5, 4, 1, 9, 4, 1, 9, false, var4, implements_);
         this.class_(var1, var5, 7, 1, 9, 7, 1, 9, false, var4, implements_);
         this.class_(var1, var5, 4, 1, 10, 7, 2, 10, false, var4, implements_);
         this.class_(var1, var5, 5, 4, 5, 6, 4, 5, false, var4, implements_);
         this.class_(var1, var15, 4, 4, 5, var5);
         this.class_(var1, var16, 7, 4, 5, var5);

         for (int var12 = 0; var12 < 4; var12++) {
            this.class_(var1, var10, 5, 0 - var12, 6 + var12, var5);
            this.class_(var1, var10, 6, 0 - var12, 6 + var12, var5);
            this.break_(var1, var5, 5, 0 - var12, 7 + var12, 6, 0 - var12, 9 + var12);
         }

         this.break_(var1, var5, 1, -3, 12, 10, -1, 13);
         this.break_(var1, var5, 1, -3, 1, 3, -1, 13);
         this.break_(var1, var5, 1, -3, 1, 9, -1, 5);

         for (byte var17 = 1; var17 <= 13; var17 += 2) {
            this.class_(var1, var5, 1, -3, var17, 1, -2, var17, false, var4, implements_);
         }

         for (byte var18 = 2; var18 <= 12; var18 += 2) {
            this.class_(var1, var5, 1, -1, var18, 3, -1, var18, false, var4, implements_);
         }

         this.class_(var1, var5, 2, -2, 1, 5, -2, 1, false, var4, implements_);
         this.class_(var1, var5, 7, -2, 1, 9, -2, 1, false, var4, implements_);
         this.class_(var1, var5, 6, -3, 1, 6, -3, 1, false, var4, implements_);
         this.class_(var1, var5, 6, -1, 1, 6, -1, 1, false, var4, implements_);
         this.class_(var1, xu_3.Sz.continue_().class_(zC_2.volatile_, rpr_3.EAST).class_(zC_2.package_, Boolean.valueOf(true)), 1, -3, 8, var5);
         this.class_(var1, xu_3.Sz.continue_().class_(zC_2.volatile_, rpr_3.WEST).class_(zC_2.package_, Boolean.valueOf(true)), 4, -3, 8, var5);
         this.class_(
            var1,
            xu_3.SQ.continue_().class_(zA_2.new_, Boolean.valueOf(true)).class_(zA_2.super_, Boolean.valueOf(true)).class_(zA_2.final_, Boolean.valueOf(true)),
            2,
            -3,
            8,
            var5
         );
         this.class_(
            var1,
            xu_3.SQ.continue_().class_(zA_2.new_, Boolean.valueOf(true)).class_(zA_2.super_, Boolean.valueOf(true)).class_(zA_2.final_, Boolean.valueOf(true)),
            3,
            -3,
            8,
            var5
         );
         xc_3 var19 = xu_3.ra.continue_().class_(Wu_1.volatile_, rCY.SIDE).class_(Wu_1.package_, rCY.SIDE);
         this.class_(var1, var19, 5, -3, 7, var5);
         this.class_(var1, var19, 5, -3, 6, var5);
         this.class_(var1, var19, 5, -3, 5, var5);
         this.class_(var1, var19, 5, -3, 4, var5);
         this.class_(var1, var19, 5, -3, 3, var5);
         this.class_(var1, var19, 5, -3, 2, var5);
         this.class_(var1, xu_3.ra.continue_().class_(Wu_1.volatile_, rCY.SIDE).class_(Wu_1.int_, rCY.SIDE), 5, -3, 1, var5);
         this.class_(var1, xu_3.ra.continue_().class_(Wu_1.final_, rCY.SIDE).class_(Wu_1.int_, rCY.SIDE), 4, -3, 1, var5);
         this.class_(var1, xu_3.rV.continue_(), 3, -3, 1, var5);
         if (!this.catch_) {
            this.catch_ = this.class_(var1, var5, var4, 3, -2, 1, rpr_3.NORTH, rzl_3.instanceof_);
         }

         this.class_(var1, xu_3.BD.continue_().class_(zq_3.int_, Boolean.valueOf(true)), 3, -2, 2, var5);
         this.class_(var1, xu_3.Sz.continue_().class_(zC_2.volatile_, rpr_3.NORTH).class_(zC_2.package_, Boolean.valueOf(true)), 7, -3, 1, var5);
         this.class_(var1, xu_3.Sz.continue_().class_(zC_2.volatile_, rpr_3.SOUTH).class_(zC_2.package_, Boolean.valueOf(true)), 7, -3, 5, var5);
         this.class_(
            var1,
            xu_3.SQ
               .continue_()
               .class_(zA_2.int_, Boolean.valueOf(true))
               .class_(zA_2.continue_, Boolean.valueOf(true))
               .class_(zA_2.final_, Boolean.valueOf(true)),
            7,
            -3,
            2,
            var5
         );
         this.class_(
            var1,
            xu_3.SQ
               .continue_()
               .class_(zA_2.int_, Boolean.valueOf(true))
               .class_(zA_2.continue_, Boolean.valueOf(true))
               .class_(zA_2.final_, Boolean.valueOf(true)),
            7,
            -3,
            3,
            var5
         );
         this.class_(
            var1,
            xu_3.SQ
               .continue_()
               .class_(zA_2.int_, Boolean.valueOf(true))
               .class_(zA_2.continue_, Boolean.valueOf(true))
               .class_(zA_2.final_, Boolean.valueOf(true)),
            7,
            -3,
            4,
            var5
         );
         this.class_(var1, xu_3.ra.continue_().class_(Wu_1.final_, rCY.SIDE).class_(Wu_1.int_, rCY.SIDE), 8, -3, 6, var5);
         this.class_(var1, xu_3.ra.continue_().class_(Wu_1.int_, rCY.SIDE).class_(Wu_1.package_, rCY.SIDE), 9, -3, 6, var5);
         this.class_(var1, xu_3.ra.continue_().class_(Wu_1.volatile_, rCY.SIDE).class_(Wu_1.package_, rCY.UP), 9, -3, 5, var5);
         this.class_(var1, xu_3.rV.continue_(), 9, -3, 4, var5);
         this.class_(var1, var19, 9, -2, 4, var5);
         if (!this.private_) {
            this.private_ = this.class_(var1, var5, var4, 9, -2, 3, rpr_3.WEST, rzl_3.instanceof_);
         }

         this.class_(var1, xu_3.BD.continue_().class_(zq_3.package_, Boolean.valueOf(true)), 8, -1, 3, var5);
         this.class_(var1, xu_3.BD.continue_().class_(zq_3.package_, Boolean.valueOf(true)), 8, -2, 3, var5);
         if (!this.throws_) {
            this.throws_ = this.class_(var1, var5, var4, 8, -3, 3, rzl_3.try_);
         }

         this.class_(var1, xu_3.rV.continue_(), 9, -3, 2, var5);
         this.class_(var1, xu_3.rV.continue_(), 8, -3, 1, var5);
         this.class_(var1, xu_3.rV.continue_(), 4, -3, 5, var5);
         this.class_(var1, xu_3.rV.continue_(), 5, -2, 5, var5);
         this.class_(var1, xu_3.rV.continue_(), 5, -1, 5, var5);
         this.class_(var1, xu_3.rV.continue_(), 6, -3, 5, var5);
         this.class_(var1, xu_3.rV.continue_(), 7, -2, 5, var5);
         this.class_(var1, xu_3.rV.continue_(), 7, -1, 5, var5);
         this.class_(var1, xu_3.rV.continue_(), 8, -3, 5, var5);
         this.class_(var1, var5, 9, -1, 1, 9, -1, 5, false, var4, implements_);
         this.break_(var1, var5, 8, -3, 8, 10, -1, 10);
         this.class_(var1, xu_3.BC.continue_(), 8, -2, 11, var5);
         this.class_(var1, xu_3.BC.continue_(), 9, -2, 11, var5);
         this.class_(var1, xu_3.BC.continue_(), 10, -2, 11, var5);
         xc_3 var13 = xu_3.Pu.continue_().class_(kL_2.p, rpr_3.NORTH).class_(kL_2.q, rCH.WALL);
         this.class_(var1, var13, 8, -2, 12, var5);
         this.class_(var1, var13, 9, -2, 12, var5);
         this.class_(var1, var13, 10, -2, 12, var5);
         this.class_(var1, var5, 8, -3, 8, 8, -3, 10, false, var4, implements_);
         this.class_(var1, var5, 10, -3, 8, 10, -3, 10, false, var4, implements_);
         this.class_(var1, xu_3.rV.continue_(), 10, -2, 9, var5);
         this.class_(var1, var19, 8, -2, 9, var5);
         this.class_(var1, var19, 8, -2, 10, var5);
         this.class_(
            var1,
            xu_3.ra.continue_().class_(Wu_1.volatile_, rCY.SIDE).class_(Wu_1.package_, rCY.SIDE).class_(Wu_1.final_, rCY.SIDE).class_(Wu_1.int_, rCY.SIDE),
            10,
            -1,
            9,
            var5
         );
         this.class_(var1, xu_3.D.continue_().class_(kD_2.volatile_, rpr_3.UP), 9, -2, 8, var5);
         this.class_(var1, xu_3.D.continue_().class_(kD_2.volatile_, rpr_3.WEST), 10, -2, 8, var5);
         this.class_(var1, xu_3.D.continue_().class_(kD_2.volatile_, rpr_3.WEST), 10, -1, 8, var5);
         this.class_(var1, xu_3.BS.continue_().class_(WZ.p, rpr_3.NORTH), 10, -2, 10, var5);
         if (!this.case_) {
            this.case_ = this.class_(var1, var5, var4, 9, -3, 10, rzl_3.try_);
         }

         return true;
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("placedMainChest", this.throws_);
      var1.class_("placedHiddenChest", this.case_);
      var1.class_("placedTrap1", this.catch_);
      var1.class_("placedTrap2", this.private_);
   }
}
