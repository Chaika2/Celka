package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class JA {
   protected static final rpr_3[] class_ = new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.NORTH, rpr_3.SOUTH, rpr_3.DOWN, rpr_3.UP};
   protected final QP break_;
   public final boolean byte_;
   protected final float protected_;
   protected final boolean throws_;
   protected final zr_3 case_;
   protected final float catch_;
   protected final float private_;
   protected final float implements_;
   protected final boolean finally_;
   protected final Jq_1 extends_;
   protected rqO_2 native_;

   public Jp_1 byte_() {
      return Jp_1.NONE;
   }

   @Deprecated
   public boolean byte_(xc_3 var1) {
      return false;
   }

   @Deprecated
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.break_(var1, var2, var3, var4);
   }

   @Deprecated
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return rjw_3.class_();
   }

   public JA(Jq_1 var1) {
      this.break_ = var1.class_;
      this.byte_ = var1.byte_;
      this.native_ = var1.volatile_;
      this.protected_ = var1.case_;
      this.throws_ = var1.implements_;
      this.case_ = var1.protected_;
      this.catch_ = var1.finally_;
      this.private_ = var1.extends_;
      this.implements_ = var1.native_;
      this.finally_ = var1.synchronized_;
      this.extends_ = var1;
   }

   @Deprecated
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return true;
   }

   @Deprecated
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return rjw_3.break_();
   }

   @Deprecated
   public void class_(xc_3 var1, rRg_1 var2, rfH_2 var3, int var4, int var5) {
   }

   @Deprecated
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      this.break_(var1, var2, var3, var4);
   }

   @Deprecated
   public long class_(xc_3 var1, rfH_2 var2) {
      return rfU_2.class_(var2);
   }

   @Deprecated
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.finally_(var2, var3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Deprecated
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      switch (var4) {
         case LAND:
            return !var1.new_(var2, var3);
         case WATER:
            return var2.break_(var3).class_(rlG_2.break_);
         case AIR:
            return !var1.new_(var2, var3);
         default:
            return false;
      }
   }

   @Deprecated
   public rJZ class_(xc_3 var1, rYB var2, rfH_2 var3) {
      return null;
   }

   @Deprecated
   public int class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return 0;
   }

   @Deprecated
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
   }

   @Deprecated
   public void class_(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
   }

   @Deprecated
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      ruP_2.class_(var2, var3);
   }

   @Deprecated
   public float class_(xc_3 var1, rhd_3 var2, rRq_1 var3, rfH_2 var4) {
      float var5 = var1.private_(var3, var4);
      if (var5 == -1.0F) {
         return 0.0F;
      } else {
         int var6 = var2.byte_(var1) ? 30 : 100;
         return var2.protected_(var1) / var5 / (float)var6;
      }
   }

   public float class_(xc_3 var1, rhd_3 var2, rdn_3 var3, rRq_1 var4, rfH_2 var5) {
      float var6 = var1.private_(var4, var5);
      if (var6 == -1.0F) {
         return 0.0F;
      } else {
         int var7 = var2.class_(var1, var3) ? 30 : 100;
         return var2.class_(var3, var1) / var6 / (float)var7;
      }
   }

   @Deprecated
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
   }

   @Deprecated
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
   }

   @Deprecated
   public boolean class_(xc_3 var1, xc_3 var2, rpr_3 var3) {
      return false;
   }

   @Deprecated
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
   }

   @Deprecated
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var1;
   }

   @Deprecated
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1;
   }

   @Deprecated
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Deprecated
   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, int var4, int var5) {
      return false;
   }

   @Deprecated
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      return ryZ_2.PASS;
   }

   @Deprecated
   public boolean class_(xc_3 var1, rxx_3 var2) {
      return this.break_.throws_() && (var2.volatile_().class_() || var2.volatile_().break_() != this.case_());
   }

   @Deprecated
   public List<rdn_3> class_(xc_3 var1, rzP_2 var2) {
      rqO_2 var3 = this.throws_();
      if (var3 == rzl_3.class_) {
         return Collections.emptyList();
      } else {
         rzr_3 var4 = var2.class_(rzQ_2.catch_, var1).class_(rzz_3.native_);
         rrEm_1 var5 = var4.byte_();
         rzL_2 var6 = var5.const_().o().class_(var3);
         return var6.class_(var4);
      }
   }

   @Deprecated
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1;
   }

   @Deprecated
   public boolean class_(xc_3 var1, rXs_1 var2) {
      return this.break_.throws_() || !this.break_.break_();
   }

   @Deprecated
   public int break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return 0;
   }

   @Deprecated
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.break_(var1, var2, var3, rjm_3.break_());
   }

   @Deprecated
   public boolean break_(xc_3 var1) {
      return false;
   }

   @Deprecated
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return 0;
   }

   @Deprecated
   public rjC_2 break_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.byte_ ? var1.finally_(var2, var3) : rjw_3.class_();
   }

   @Deprecated
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (this.protected_() && !var1.class_(var4.break_())) {
         var2.else_(var3);
      }
   }

   @Deprecated
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
   }

   public final rqO_2 throws_() {
      if (this.native_ == null) {
         rqO_2 var1 = rVL.strictfp_.break_(this.catch_());
         this.native_ = new rqO_2(var1.byte_(), "blocks/" + var1.break_());
      }

      return this.native_;
   }

   @Deprecated
   public rXE throws_(xc_3 var1) {
      return rXG.class_.private_();
   }

   @Deprecated
   public float throws_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.new_(var2, var3) ? 0.2F : 1.0F;
   }

   protected abstract xd_3 catch_();

   @Deprecated
   public boolean case_(xc_3 var1) {
      return false;
   }

   public abstract rdb_3 case_();

   @Deprecated
   public Qs_1 protected_(xc_3 var1) {
      return this.break_.catch_();
   }

   @Deprecated
   public int protected_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      if (var1.implements_(var2, var3)) {
         return var2.while_();
      } else {
         return var1.class_(var2, var3) ? 0 : 1;
      }
   }

   public final boolean protected_() {
      return this instanceof kx_3;
   }

   public QS private_() {
      return this.extends_.break_.apply(this.catch_().continue_());
   }
}
