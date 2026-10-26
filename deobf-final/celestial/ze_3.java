package celestial;

public class ze_3 extends Ww_1 {
   private static Qh_1 package_;
   private static Qh_1 int_;

   protected ze_3(Jq_1 var1) {
      super(Wf_1.WITHER_SKELETON, var1);
   }

   public static void class_(rYB var0, rfH_2 var1, rys_3 var2) {
      if (!var0.continue_) {
         xc_3 var3 = var2.abstract_();
         boolean var4 = var3.class_(xu_3.sh) || var3.class_(xu_3.sX);
         if (var4 && var1.c_() >= 0 && var0.abstract_() != rRO.PEACEFUL) {
            Qh_1 var5 = implements_();
            QJ var6 = var5.class_(var0, var1);
            if (var6 != null) {
               for (int var7 = 0; var7 < var5.byte_(); var7++) {
                  for (int var8 = 0; var8 < var5.break_(); var8++) {
                     ryw_3 var9 = var6.class_(var7, var8, 0);
                     var0.class_(var9.protected_(), xu_3.class_.continue_(), 2);
                     var0.byte_(2001, var9.protected_(), xd_3.finally_(var9.class_()));
                  }
               }

               rSN var16 = aI_2.i.class_(var0);
               rfH_2 var17 = var6.class_(1, 2, 0).protected_();
               var16.class_(
                  (double)var17.b_() + 0.5, (double)var17.c_() + 0.55, (double)var17.d_() + 0.5, var6.break_().final_() == rpB_2.X ? 0.0F : 90.0F, 0.0F
               );
               Float var15 = var6.break_().final_() == rpB_2.X ? 0.0F : 90.0F;
               var16.private_[23] = var15;
               var16.throws_();

               for (rhN_2 var10 : var0.class_(rhN_2.class, var16.rN().class_(50.0))) {
                  Oo_1.final_.class_(var10, var16);
               }

               var0.a_(var16);

               for (int var19 = 0; var19 < var5.byte_(); var19++) {
                  for (int var20 = 0; var20 < var5.break_(); var20++) {
                     var0.class_(var6.class_(var19, var20, 0).protected_(), xu_3.class_);
                  }
               }
            }
         }
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.class_(var1, var2, var3, var4, var5);
      ryO_2 var6 = var1.class_(var2);
      if (var6 instanceof rys_3) {
         class_(var1, var2, (rys_3)var6);
      }
   }

   public static boolean break_(rYB var0, rfH_2 var1, rdn_3 var2) {
      return var2.break_() == rdy_3.dX && var1.c_() >= 2 && var0.abstract_() != rRO.PEACEFUL && !var0.continue_ ? finally_().class_(var0, var1) != null : false;
   }

   private static Qh_1 finally_() {
      if (int_ == null) {
         int_ = Qx_1.class_()
            .class_("   ", "###", "~#~")
            .class_('#', var0 -> var0.class_().class_(rls_3.d))
            .class_('~', ryw_3.class_(QM.class_(QP.class_)))
            .break_();
      }

      return int_;
   }

   private static Qh_1 implements_() {
      if (package_ == null) {
         package_ = Qx_1.class_()
            .class_("^^^", "###", "~#~")
            .class_('#', var0 -> var0.class_().class_(rls_3.d))
            .class_('^', ryw_3.class_(Qd_1.class_(xu_3.sh).or(Qd_1.class_(xu_3.sX))))
            .class_('~', ryw_3.class_(QM.class_(QP.class_)))
            .break_();
      }

      return package_;
   }
}
