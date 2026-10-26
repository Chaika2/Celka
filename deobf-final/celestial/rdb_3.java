package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class rdb_3 implements rpL_2 {
   public static final Map<xd_3, rdb_3> throws_ = Maps.newHashMap();
   protected static final UUID case_ = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID catch_ = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   protected static final Random private_ = new Random();
   protected final rdX_2 implements_;
   private final rde_3 class_;
   private final int break_;
   private final int byte_;
   private final boolean protected_;
   private final rdb_3 finally_;
   private String extends_;
   private final rxK_2 native_;
   private boolean volatile_;

   public rkc_3 byte_(rdn_3 var1) {
      return var1.break_().super_() ? rkc_3.EAT : rkc_3.NONE;
   }

   public boolean int_() {
      return this.finally_ != null;
   }

   public rdb_3(rdO_2 var1) {
      this.implements_ = var1.protected_;
      this.class_ = var1.throws_;
      this.finally_ = var1.byte_;
      this.byte_ = var1.break_;
      this.break_ = var1.class_;
      this.native_ = var1.case_;
      this.protected_ = var1.catch_;
      this.volatile_ = var1.private_;
   }

   @Override
   public String toString() {
      return rVL.for_.break_(this).break_();
   }

   public rxK_2 this_() {
      return this.native_;
   }

   public static int class_(rdb_3 var0) {
      return var0 == null ? 0 : rVL.for_.class_(var0);
   }

   public boolean class_() {
      return false;
   }

   public void class_(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
   }

   public void class_(rdn_3 var1, rYB var2, an_3 var3, int var4, boolean var5) {
   }

   public boolean class_(rye_3 var1) {
      return !this.protected_ || !var1.int_();
   }

   protected static rff_3 class_(rYB var0, rhd_3 var1, rjs_3 var2) {
      float var3 = (Float)var1.throws_[16];
      float var4 = (Float)var1.throws_[15];
      rjU_2 var5 = var1.new_(1.0F);
      float var6 = rfU_2.break_(-var4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var7 = rfU_2.class_(-var4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var8 = -rfU_2.break_(-var3 * (float) (Math.PI / 180.0));
      float var9 = rfU_2.class_(-var3 * (float) (Math.PI / 180.0));
      float var10 = var7 * var8;
      float var11 = var6 * var8;
      double var12 = 5.0;
      rjU_2 var14 = var5.break_((double)var10 * 5.0, (double)var9 * 5.0, (double)var11 * 5.0);
      return var0.class_(new rjB_2(var5, var14, rjS_2.OUTLINE, var2, var1));
   }

   public void class_(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.class_(var1)) {
         var2.add(new rdn_3(this));
      }
   }

   protected boolean class_(rdX_2 var1) {
      rdX_2 var2 = this.new_();
      return var2 != null && (var1 == rdX_2.catch_ || var1 == var2);
   }

   public boolean class_(rdn_3 var1, rdn_3 var2) {
      return false;
   }

   public Multimap<iJ_2, ix_3> class_(rXQ var1) {
      return ImmutableMultimap.of();
   }

   public boolean class_(rlb_3<rdb_3> var1) {
      return var1.class_(this);
   }

   public boolean class_(rdn_3 var1) {
      return this.implements_() == 1 && this.extends_();
   }

   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
   }

   public boolean class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      return true;
   }

   public ryZ_2 class_(rdH_2 var1) {
      return ryZ_2.PASS;
   }

   public boolean class_(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      return false;
   }

   public boolean class_(rdn_3 var1, iB_2 var2, iB_2 var3) {
      return false;
   }

   public float class_(rdn_3 var1, xc_3 var2) {
      return 1.0F;
   }

   public rdn_3 class_(rdn_3 var1, rYB var2, iB_2 var3) {
      return this.super_() ? var3.class_(var2, var1) : var1;
   }

   public ryZ_2 class_(rdn_3 var1, rhd_3 var2, iB_2 var3, rpm_3 var4) {
      return ryZ_2.PASS;
   }

   @Deprecated
   public static rdb_3 class_(xd_3 var0) {
      return throws_.getOrDefault(var0, rdy_3.class_);
   }

   public void class_(rYB var1, iB_2 var2, rdn_3 var3, int var4) {
   }

   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      if (this.super_()) {
         rdn_3 var4 = var2.protected_(var3);
         if (var2.else_(this.this_().protected_())) {
            var2.break_(var3);
            return rym_3.break_(var4);
         } else {
            return rym_3.protected_(var4);
         }
      } else {
         return rym_3.byte_(var2.protected_(var3));
      }
   }

   public void break_(rdn_3 var1, rYB var2, rhd_3 var3) {
   }

   public boolean break_(rcd_3 var1) {
      return false;
   }

   public static rdb_3 break_(int var0) {
      return rVL.for_.class_(var0);
   }

   public boolean break_(xc_3 var1) {
      return false;
   }

   public int break_(rdn_3 var1) {
      if (var1.break_().super_()) {
         return this.this_().throws_() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public String break_() {
      return this.volatile_();
   }

   public boolean throws_(rdn_3 var1) {
      return var1.public_();
   }

   public final int finally_() {
      return this.byte_;
   }

   public rde_3 finally_(rdn_3 var1) {
      if (!var1.public_()) {
         return this.class_;
      } else {
         switch (this.class_) {
            case COMMON:
            case UNCOMMON:
               return rde_3.RARE;
            case RARE:
               return rde_3.EPIC;
            case EPIC:
            default:
               return this.class_;
         }
      }
   }

   public boolean extends_(rdn_3 var1) {
      return var1.break_() == rdy_3.kU;
   }

   public boolean extends_() {
      return this.byte_ > 0;
   }

   public String case_(rdn_3 var1) {
      return this.break_();
   }

   @Override
   public rdb_3 case_() {
      return this;
   }

   public rdn_3 continue_() {
      return new rdn_3(this);
   }

   public boolean else_() {
      return this.protected_;
   }

   public rgP_2 implements_(rdn_3 var1) {
      return new rgn_3(this.case_(var1));
   }

   public final int implements_() {
      return this.break_;
   }

   public final rdX_2 new_() {
      return this.implements_;
   }

   public final rdb_3 package_() {
      return this.finally_;
   }

   public boolean super_() {
      return this.native_ != null;
   }

   public int protected_() {
      return 0;
   }

   public boolean final_() {
      return true;
   }

   protected String volatile_() {
      if (this.extends_ == null) {
         this.extends_ = rqR_2.class_("item", rVL.for_.break_(this));
      }

      return this.extends_;
   }

   public boolean synchronized_() {
      return this.volatile_;
   }

   public rgP_2 native_() {
      return new rgn_3(this.break_());
   }

   public rqA_2 U_() {
      return rqn_3.SV;
   }

   public rqA_2 V_() {
      return rqn_3.Sg;
   }
}
