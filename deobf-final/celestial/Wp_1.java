package celestial;

import java.util.List;

public class Wp_1 extends dB_2 {
   public static final rCu_1<rpr_3> volatile_ = dz_3.volatile_;
   public static final rqO_2 final_ = new rqO_2("contents");
   private final rxL_2 package_;

   public Wp_1(rxL_2 var1, Jq_1 var2) {
      super(var2);
      this.package_ = var1;
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.UP));
   }

   public static rxL_2 class_(xd_3 var0) {
      return var0 instanceof Wp_1 ? ((Wp_1)var0).break_() : null;
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rdn_3 var4 = super.class_(var1, var2, var3);
      ryr_3 var5 = (ryr_3)var1.class_(var2);
      rcd_3 var6 = var5.throws_(new rcd_3());
      if (!var6.case_()) {
         var4.class_("BlockEntityTag", var6);
      }

      return var4;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      ryO_2 var5 = var2.class_(var3);
      return var5 instanceof ryr_3 ? rjw_3.class_(((ryr_3)var5).class_(var1, 1.0F)) : rjw_3.break_();
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new ryr_3(this.package_);
   }

   @Override
   public void class_(rdn_3 var1, rRq_1 var2, List<rgP_2> var3, VD var4) {
      super.class_(var1, var2, var3, var4);
      rcd_3 var5 = var1.break_("BlockEntityTag");
      if (var5 != null) {
         if (var5.byte_("LootTable", 8)) {
            var3.add(new rgN_2("???????"));
         }

         if (var5.byte_("Items", 9)) {
            rqs_3 var6 = rqs_3.class_(27, rdn_3.break_);
            rXC.break_(var5, var6);
            int var7 = 0;
            int var8 = 0;

            for (rdn_3 var10 : var6) {
               if (!var10.class_()) {
                  var8++;
                  if (var7 <= 4) {
                     var7++;
                     rVi_1 var11 = var10.continue_().case_();
                     var11.break_(" x").break_(String.valueOf(var10.char_()));
                     var3.add(var11);
                  }
               }
            }

            if (var8 - var7 > 0) {
               var3.add(new rgn_3("container.shulkerBox.more", var8 - var7).class_(rgF_2.ITALIC));
            }
         }
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   public static xd_3 class_(rxL_2 var0) {
      if (var0 == null) {
         return xu_3.bD;
      } else {
         switch (var0) {
            case WHITE:
               return xu_3.bU;
            case ORANGE:
               return xu_3.be;
            case MAGENTA:
               return xu_3.ba;
            case LIGHT_BLUE:
               return xu_3.bi;
            case YELLOW:
               return xu_3.Mr;
            case LIME:
               return xu_3.MP;
            case PINK:
               return xu_3.MB;
            case GRAY:
               return xu_3.MS;
            case LIGHT_GRAY:
               return xu_3.Ms;
            case CYAN:
               return xu_3.ME;
            case PURPLE:
            default:
               return xu_3.MG;
            case BLUE:
               return xu_3.Mb;
            case BROWN:
               return xu_3.MM;
            case GREEN:
               return xu_3.MO;
            case RED:
               return xu_3.Mh;
            case BLACK:
               return xu_3.MX;
         }
      }
   }

   @Override
   public List<rdn_3> class_(xc_3 var1, rzP_2 var2) {
      ryO_2 var3 = var2.break_(rzQ_2.private_);
      if (var3 instanceof ryr_3 var4) {
         var2 = var2.class_(final_, (var1x, var2x) -> {
            for (int var3x = 0; var3x < var4.else_(); var3x++) {
               var2x.accept(var4.extends_(var3x));
            }
         });
      }

      return super.class_(var1, var2);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (var1.class_(var2) instanceof ryr_3 var6) {
         if (!var1.continue_ && var4.implements_() && !var6.return_()) {
            rdn_3 var7 = break_(this.break_());
            rcd_3 var8 = var6.throws_(new rcd_3());
            if (!var8.case_()) {
               var7.class_("BlockEntityTag", var8);
            }

            if (var6.Bk()) {
               var7.class_(var6.rD());
            }

            rsE_2 var9 = new rsE_2(var1, (double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5, var7);
            var9.private_();
            var1.a_(var9);
         } else {
            var6.protected_(var4);
         }
      }

      super.class_(var1, var2, var3, var4);
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, var1.finally_());
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else if (var4.native_()) {
         return ryZ_2.CONSUME;
      } else if (var2.class_(var3) instanceof ryr_3 var8) {
         boolean var9;
         if (var8.private_() == ryB_2.CLOSED) {
            rpr_3 var10 = var1.byte_(volatile_);
            var9 = var2.break_(rqZ_2.class_(var3, var10));
         } else {
            var9 = true;
         }

         if (var9) {
            var4.class_(var8);
            var4.break_(rlB_2.u);
            rbW_2.class_(var4, true);
         }

         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof ryr_3) {
            ((ryr_3)var6).class_(var5.continue_());
         }
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   public static rdn_3 break_(rxL_2 var0) {
      return new rdn_3(class_(var0));
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof ryr_3) {
            var2.byte_(var3, var1.break_());
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   public static rxL_2 break_(rdb_3 var0) {
      return class_(xd_3.class_(var0));
   }

   public rxL_2 break_() {
      return this.package_;
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.break_((rXu_1)var2.class_(var3));
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }

   @Override
   public Qs_1 protected_(xc_3 var1) {
      return Qs_1.DESTROY;
   }
}
