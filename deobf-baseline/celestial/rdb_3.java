package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class rdb_3 implements rpL_2 {
   public static final Map<xd_3, rdb_3> id_throws = Maps.newHashMap();
   protected static final UUID id_case = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   protected static final UUID id_catch = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   protected static final Random id_private = new Random();
   protected final rdX_2 id_implements;
   private final rde_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final boolean id_protected;
   private final rdb_3 id_finally;
   private String id_extends;
   private final rxK_2 id_native;
   private boolean id_volatile;

   public rkc_3 id_byte(rdn_3 var1) {
      return var1.id_break().id_super() ? rkc_3.EAT : rkc_3.NONE;
   }

   public boolean id_int() {
      return this.id_finally != null;
   }

   public rdb_3(rdO_2 var1) {
      this.id_implements = var1.id_protected;
      this.id_class = var1.id_throws;
      this.id_finally = var1.id_byte;
      this.id_byte = var1.id_break;
      this.id_break = var1.id_class;
      this.id_native = var1.id_case;
      this.id_protected = var1.id_catch;
      this.id_volatile = var1.id_private;
   }

   @Override
   public String toString() {
      return rVL.id_for.id_break(this).id_break();
   }

   public rxK_2 id_this() {
      return this.id_native;
   }

   public static int id_class(rdb_3 var0) {
      return var0 == null ? 0 : rVL.id_for.id_class(var0);
   }

   public boolean id_class() {
      return false;
   }

   public void id_class(rdn_3 var1, rYB var2, iB_2 var3, int var4) {
   }

   public void id_class(rdn_3 var1, rYB var2, an_3 var3, int var4, boolean var5) {
   }

   public boolean id_class(rye_3 var1) {
      return !this.id_protected || !var1.id_int();
   }

   protected static rff_3 id_class(rYB var0, rhd_3 var1, rjs_3 var2) {
      float var3 = (Float)var1.id_throws[16];
      float var4 = (Float)var1.id_throws[15];
      rjU_2 var5 = var1.id_new(1.0F);
      float var6 = rfU_2.id_break(-var4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var7 = rfU_2.id_class(-var4 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var8 = -rfU_2.id_break(-var3 * (float) (Math.PI / 180.0));
      float var9 = rfU_2.id_class(-var3 * (float) (Math.PI / 180.0));
      float var10 = var7 * var8;
      float var11 = var6 * var8;
      double var12 = 5.0;
      rjU_2 var14 = var5.id_break((double)var10 * 5.0, (double)var9 * 5.0, (double)var11 * 5.0);
      return var0.id_class(new rjB_2(var5, var14, rjS_2.OUTLINE, var2, var1));
   }

   public void id_class(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.id_class(var1)) {
         var2.add(new rdn_3(this));
      }
   }

   protected boolean id_class(rdX_2 var1) {
      rdX_2 var2 = this.id_new();
      return var2 != null && (var1 == rdX_2.id_catch || var1 == var2);
   }

   public boolean id_class(rdn_3 var1, rdn_3 var2) {
      return false;
   }

   public Multimap<iJ_2, ix_3> id_class(rXQ var1) {
      return ImmutableMultimap.of();
   }

   public boolean id_class(rlb_3<rdb_3> var1) {
      return var1.id_class(this);
   }

   public boolean id_class(rdn_3 var1) {
      return this.id_implements() == 1 && this.id_extends();
   }

   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
   }

   public boolean id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4) {
      return true;
   }

   public ryZ_2 id_class(rdH_2 var1) {
      return ryZ_2.PASS;
   }

   public boolean id_class(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      return false;
   }

   public boolean id_class(rdn_3 var1, iB_2 var2, iB_2 var3) {
      return false;
   }

   public float id_class(rdn_3 var1, xc_3 var2) {
      return 1.0F;
   }

   public rdn_3 id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      return this.id_super() ? var3.id_class(var2, var1) : var1;
   }

   public ryZ_2 id_class(rdn_3 var1, rhd_3 var2, iB_2 var3, rpm_3 var4) {
      return ryZ_2.PASS;
   }

   @Deprecated
   public static rdb_3 id_class(xd_3 var0) {
      return id_throws.getOrDefault(var0, rdy_3.id_class);
   }

   public void id_class(rYB var1, iB_2 var2, rdn_3 var3, int var4) {
   }

   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      if (this.id_super()) {
         rdn_3 var4 = var2.id_protected(var3);
         if (var2.id_else(this.id_this().id_protected())) {
            var2.id_break(var3);
            return rym_3.id_break(var4);
         } else {
            return rym_3.id_protected(var4);
         }
      } else {
         return rym_3.id_byte(var2.id_protected(var3));
      }
   }

   public void id_break(rdn_3 var1, rYB var2, rhd_3 var3) {
   }

   public boolean id_break(rcd_3 var1) {
      return false;
   }

   public static rdb_3 id_break(int var0) {
      return rVL.id_for.id_class(var0);
   }

   public boolean id_break(xc_3 var1) {
      return false;
   }

   public int id_break(rdn_3 var1) {
      if (var1.id_break().id_super()) {
         return this.id_this().id_throws() ? 16 : 32;
      } else {
         return 0;
      }
   }

   public String id_break() {
      return this.id_volatile();
   }

   public boolean id_throws(rdn_3 var1) {
      return var1.id_public();
   }

   public final int id_finally() {
      return this.id_byte;
   }

   public rde_3 id_finally(rdn_3 var1) {
      if (!var1.id_public()) {
         return this.id_class;
      } else {
         switch (this.id_class) {
            case COMMON:
            case UNCOMMON:
               return rde_3.RARE;
            case RARE:
               return rde_3.EPIC;
            case EPIC:
            default:
               return this.id_class;
         }
      }
   }

   public boolean id_extends(rdn_3 var1) {
      return var1.id_break() == rdy_3.kU;
   }

   public boolean id_extends() {
      return this.id_byte > 0;
   }

   public String id_case(rdn_3 var1) {
      return this.id_break();
   }

   @Override
   public rdb_3 id_case() {
      return this;
   }

   public rdn_3 id_continue() {
      return new rdn_3(this);
   }

   public boolean id_else() {
      return this.id_protected;
   }

   public rgP_2 id_implements(rdn_3 var1) {
      return new rgn_3(this.id_case(var1));
   }

   public final int id_implements() {
      return this.id_break;
   }

   public final rdX_2 id_new() {
      return this.id_implements;
   }

   public final rdb_3 id_package() {
      return this.id_finally;
   }

   public boolean id_super() {
      return this.id_native != null;
   }

   public int id_protected() {
      return 0;
   }

   public boolean id_final() {
      return true;
   }

   protected String id_volatile() {
      if (this.id_extends == null) {
         this.id_extends = rqR_2.id_class("item", rVL.id_for.id_break(this));
      }

      return this.id_extends;
   }

   public boolean id_synchronized() {
      return this.id_volatile;
   }

   public rgP_2 id_native() {
      return new rgn_3(this.id_break());
   }

   public rqA_2 U_() {
      return rqn_3.SV;
   }

   public rqA_2 V_() {
      return rqn_3.Sg;
   }
}
