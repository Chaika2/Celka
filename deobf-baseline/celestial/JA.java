package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class JA {
   protected static final rpr_3[] id_class = new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.NORTH, rpr_3.SOUTH, rpr_3.DOWN, rpr_3.UP};
   protected final QP id_break;
   public final boolean id_byte;
   protected final float id_protected;
   protected final boolean id_throws;
   protected final zr_3 id_case;
   protected final float id_catch;
   protected final float id_private;
   protected final float id_implements;
   protected final boolean id_finally;
   protected final Jq_1 id_extends;
   protected rqO_2 id_native;

   public Jp_1 id_byte() {
      return Jp_1.NONE;
   }

   @Deprecated
   public boolean id_byte(xc_3 var1) {
      return false;
   }

   @Deprecated
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_break(var1, var2, var3, var4);
   }

   @Deprecated
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return rjw_3.id_class();
   }

   public JA(Jq_1 var1) {
      this.id_break = var1.id_class;
      this.id_byte = var1.id_byte;
      this.id_native = var1.id_volatile;
      this.id_protected = var1.id_case;
      this.id_throws = var1.id_implements;
      this.id_case = var1.id_protected;
      this.id_catch = var1.id_finally;
      this.id_private = var1.id_extends;
      this.id_implements = var1.id_native;
      this.id_finally = var1.id_synchronized;
      this.id_extends = var1;
   }

   @Deprecated
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return true;
   }

   @Deprecated
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.id_break();
   }

   @Deprecated
   public void id_class(xc_3 var1, rRg_1 var2, rfH_2 var3, int var4, int var5) {
   }

   @Deprecated
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.id_break(var1, var2, var3, var4);
   }

   @Deprecated
   public long id_class(xc_3 var1, rfH_2 var2) {
      return rfU_2.id_class(var2);
   }

   @Deprecated
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_finally(var2, var3);
   }

   @Deprecated
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return !var1.id_new(var2, var3);
         case WATER:
            return var2.id_break(var3).id_class(rlG_2.id_break);
         case AIR:
            return !var1.id_new(var2, var3);
         default:
            return false;
      }
   }

   @Deprecated
   public rJZ id_class(xc_3 var1, rYB var2, rfH_2 var3) {
      return null;
   }

   @Deprecated
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return 0;
   }

   @Deprecated
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
   }

   @Deprecated
   public void id_class(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
   }

   @Deprecated
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      ruP_2.id_class(var2, var3);
   }

   @Deprecated
   public float id_class(xc_3 var1, rhd_3 var2, rRq_1 var3, rfH_2 var4) {
      float var5 = var1.id_private(var3, var4);
      if (var5 == -1.0F) {
         return 0.0F;
      } else {
         int var6 = var2.id_byte(var1) ? 30 : 100;
         return var2.id_protected(var1) / var5 / (float)var6;
      }
   }

   public float id_class(xc_3 var1, rhd_3 var2, rdn_3 var3, rRq_1 var4, rfH_2 var5) {
      float var6 = var1.id_private(var4, var5);
      if (var6 == -1.0F) {
         return 0.0F;
      } else {
         int var7 = var2.id_class(var1, var3) ? 30 : 100;
         return var2.id_class(var3, var1) / var6 / (float)var7;
      }
   }

   @Deprecated
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
   }

   @Deprecated
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
   }

   @Deprecated
   public boolean id_class(xc_3 var1, xc_3 var2, rpr_3 var3) {
      return false;
   }

   @Deprecated
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
   }

   @Deprecated
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var1;
   }

   @Deprecated
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1;
   }

   @Deprecated
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Deprecated
   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      return false;
   }

   @Deprecated
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      return ryZ_2.PASS;
   }

   @Deprecated
   public boolean id_class(xc_3 var1, rxx_3 var2) {
      return this.id_break.id_throws() && (var2.id_volatile().id_class() || var2.id_volatile().id_break() != this.id_case());
   }

   @Deprecated
   public List<rdn_3> id_class(xc_3 var1, rzP_2 var2) {
      rqO_2 var3 = this.id_throws();
      if (var3 == rzl_3.id_class) {
         return Collections.emptyList();
      } else {
         rzr_3 var4 = var2.id_class(rzQ_2.id_catch, var1).id_class(rzz_3.id_native);
         rrEm_1 var5 = var4.id_byte();
         rzL_2 var6 = var5.id_const().o().id_class(var3);
         return var6.id_class(var4);
      }
   }

   @Deprecated
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1;
   }

   @Deprecated
   public boolean id_class(xc_3 var1, rXs_1 var2) {
      return this.id_break.id_throws() || !this.id_break.id_break();
   }

   @Deprecated
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return 0;
   }

   @Deprecated
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.id_break(var1, var2, var3, rjm_3.id_break());
   }

   @Deprecated
   public boolean id_break(xc_3 var1) {
      return false;
   }

   @Deprecated
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return 0;
   }

   @Deprecated
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_byte ? var1.id_finally(var2, var3) : rjw_3.id_class();
   }

   @Deprecated
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (this.id_protected() && !var1.id_class(var4.id_break())) {
         var2.id_else(var3);
      }
   }

   @Deprecated
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
   }

   public final rqO_2 id_throws() {
      if (this.id_native == null) {
         rqO_2 var1 = rVL.id_strictfp.id_break(this.id_catch());
         this.id_native = new rqO_2(var1.id_byte(), "blocks/" + var1.id_break());
      }

      return this.id_native;
   }

   @Deprecated
   public rXE id_throws(xc_3 var1) {
      return rXG.id_class.id_private();
   }

   @Deprecated
   public float id_throws(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_new(var2, var3) ? 0.2F : 1.0F;
   }

   protected abstract xd_3 id_catch();

   @Deprecated
   public boolean id_case(xc_3 var1) {
      return false;
   }

   public abstract rdb_3 id_case();

   @Deprecated
   public Qs_1 id_protected(xc_3 var1) {
      return this.id_break.id_catch();
   }

   @Deprecated
   public int id_protected(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      if (var1.id_implements(var2, var3)) {
         return var2.id_while();
      } else {
         return var1.id_class(var2, var3) ? 0 : 1;
      }
   }

   public final boolean id_protected() {
      return this instanceof kx_3;
   }

   public QS id_private() {
      return this.id_extends.id_break.apply(this.id_catch().id_continue());
   }
}
