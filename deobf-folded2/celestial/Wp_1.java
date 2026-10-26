package celestial;

import java.util.List;

public class Wp_1 extends dB_2 {
   public static final rCu_1<rpr_3> id_volatile = dz_3.id_volatile;
   public static final rqO_2 id_final = new rqO_2("contents");
   private final rxL_2 id_package;

   public Wp_1(rxL_2 var1, Jq_1 var2) {
      super(var2);
      this.id_package = var1;
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.UP));
   }

   public static rxL_2 id_class(xd_3 var0) {
      return var0 instanceof Wp_1 ? ((Wp_1)var0).id_break() : null;
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rdn_3 var4 = super.id_class(var1, var2, var3);
      ryr_3 var5 = (ryr_3)var1.id_class(var2);
      rcd_3 var6 = var5.id_throws(new rcd_3());
      if (!var6.id_case()) {
         var4.id_class("BlockEntityTag", var6);
      }

      return var4;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      ryO_2 var5 = var2.id_class(var3);
      return var5 instanceof ryr_3 ? rjw_3.id_class(((ryr_3)var5).id_class(var1, 1.0F)) : rjw_3.id_break();
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new ryr_3(this.id_package);
   }

   @Override
   public void id_class(rdn_3 var1, rRq_1 var2, List<rgP_2> var3, VD var4) {
      super.id_class(var1, var2, var3, var4);
      rcd_3 var5 = var1.id_break("BlockEntityTag");
      if (var5 != null) {
         if (var5.id_byte("LootTable", 8)) {
            var3.add(new rgN_2("???????"));
         }

         if (var5.id_byte("Items", 9)) {
            rqs_3 var6 = rqs_3.id_class(27, rdn_3.id_break);
            rXC.id_break(var5, var6);
            int var7 = 0;
            int var8 = 0;

            for (rdn_3 var10 : var6) {
               if (!var10.id_class()) {
                  var8++;
                  if (var7 <= 4) {
                     var7++;
                     rVi_1 var11 = var10.id_continue().id_case();
                     var11.id_break(" x").id_break(String.valueOf(var10.id_char()));
                     var3.add(var11);
                  }
               }
            }

            if (var8 - var7 > 0) {
               var3.add(new rgn_3("container.shulkerBox.more", var8 - var7).id_class(rgF_2.ITALIC));
            }
         }
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   public static xd_3 id_class(rxL_2 var0) {
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
   public List<rdn_3> id_class(xc_3 var1, rzP_2 var2) {
      ryO_2 var3 = var2.id_break(rzQ_2.id_private);
      if (var3 instanceof ryr_3 var4) {
         var2 = var2.id_class(id_final, (var1x, var2x) -> {
            for (int var3x = 0; var3x < var4.id_else(); var3x++) {
               var2x.accept(var4.id_extends(var3x));
            }
         });
      }

      return super.id_class(var1, var2);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (var1.id_class(var2) instanceof ryr_3 var6) {
         if (!var1.id_continue && var4.id_implements() && !var6.id_return()) {
            rdn_3 var7 = id_break(this.id_break());
            rcd_3 var8 = var6.id_throws(new rcd_3());
            if (!var8.id_case()) {
               var7.id_class("BlockEntityTag", var8);
            }

            if (var6.Bk()) {
               var7.id_class(var6.rD());
            }

            rsE_2 var9 = new rsE_2(var1, (double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5, var7);
            var9.id_private();
            var1.a_(var9);
         } else {
            var6.id_protected(var4);
         }
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.ENTITYBLOCK_ANIMATED;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, var1.id_finally());
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_continue) {
         return ryZ_2.SUCCESS;
      } else if (var4.id_native()) {
         return ryZ_2.CONSUME;
      } else if (var2.id_class(var3) instanceof ryr_3 var8) {
         boolean var9;
         if (var8.id_private() == ryB_2.CLOSED) {
            rpr_3 var10 = var1.id_byte(id_volatile);
            var9 = var2.id_break(rqZ_2.id_class(var3, var10));
         } else {
            var9 = true;
         }

         if (var9) {
            var4.id_class(var8);
            var4.id_break(rlB_2.u);
            rbW_2.id_class(var4, true);
         }

         return ryZ_2.CONSUME;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.id_this()) {
         ryO_2 var6 = var1.id_class(var2);
         if (var6 instanceof ryr_3) {
            ((ryr_3)var6).id_class(var5.id_continue());
         }
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   public static rdn_3 id_break(rxL_2 var0) {
      return new rdn_3(id_class(var0));
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof ryr_3) {
            var2.id_byte(var3, var1.id_break());
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   public static rxL_2 id_break(rdb_3 var0) {
      return id_class(xd_3.id_class(var0));
   }

   public rxL_2 id_break() {
      return this.id_package;
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.id_break((rXu_1)var2.id_class(var3));
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.DESTROY;
   }
}
