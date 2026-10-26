package celestial;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;

public abstract class HU extends Hn_1 {
   private static final HU E = class_(
      "solid", ju_3.private_, 7, 2097152, true, false, Ha_1.class_().class_(final_).class_(synchronized_).class_(package_).class_(true)
   );
   private static final HU G = class_(
      "cutout_mipped", ju_3.private_, 7, 131072, true, false, Ha_1.class_().class_(final_).class_(synchronized_).class_(package_).class_(native_).class_(true)
   );
   private static final HU b = class_(
      "cutout", ju_3.private_, 7, 131072, true, false, Ha_1.class_().class_(final_).class_(synchronized_).class_(int_).class_(native_).class_(true)
   );
   private static final HU M = class_("translucent", ju_3.private_, 7, 262144, true, true, import_());
   private static final HU O = class_("translucent_moving_block", ju_3.private_, 7, 262144, false, true, short_());
   private static final HU h = class_("translucent_no_crumbling", ju_3.private_, 7, 262144, false, true, import_());
   private static final HU X = class_("leash", ju_3.else_, 7, 256, Ha_1.class_().class_(new_).class_(throw_).class_(synchronized_).class_(false));
   private static final HU J = class_("water_mask", ju_3.super_, 7, 256, Ha_1.class_().class_(new_).class_(void_).class_(false));
   private static final HU x = class_(
      "armor_glint",
      ju_3.synchronized_,
      7,
      256,
      Ha_1.class_()
         .class_(new HR(Hz_1.class_, true, false))
         .class_(float_)
         .class_(throw_)
         .class_(char_)
         .class_(case_)
         .class_(this_)
         .class_(short_)
         .class_(false)
   );
   private static final HU d = class_(
      "armor_entity_glint",
      ju_3.synchronized_,
      7,
      256,
      Ha_1.class_()
         .class_(new HR(Hz_1.class_, true, false))
         .class_(float_)
         .class_(throw_)
         .class_(char_)
         .class_(case_)
         .class_(else_)
         .class_(short_)
         .class_(false)
   );
   private static final HU k = class_(
      "glint_translucent",
      ju_3.synchronized_,
      7,
      256,
      Ha_1.class_().class_(new HR(Hz_1.class_, true, false)).class_(float_).class_(throw_).class_(char_).class_(case_).class_(this_).class_(P).class_(false)
   );
   private static final HU W = class_(
      "glint",
      ju_3.synchronized_,
      7,
      256,
      Ha_1.class_().class_(new HR(Hz_1.class_, true, false)).class_(float_).class_(throw_).class_(char_).class_(case_).class_(this_).class_(false)
   );
   private static final HU z = class_(
      "glint_direct",
      ju_3.synchronized_,
      7,
      256,
      Ha_1.class_().class_(new HR(Hz_1.class_, true, false)).class_(float_).class_(throw_).class_(char_).class_(case_).class_(this_).class_(false)
   );
   private static final HU Q = class_(
      "entity_glint",
      ju_3.synchronized_,
      7,
      256,
      Ha_1.class_().class_(new HR(Hz_1.class_, true, false)).class_(float_).class_(throw_).class_(char_).class_(case_).class_(P).class_(else_).class_(false)
   );
   private static final HU N = class_(
      "entity_glint_direct",
      ju_3.synchronized_,
      7,
      256,
      Ha_1.class_().class_(new HR(Hz_1.class_, true, false)).class_(float_).class_(throw_).class_(char_).class_(case_).class_(else_).class_(false)
   );
   private static final HU c = class_(
      "lightning", ju_3.this_, 7, 256, false, true, Ha_1.class_().class_(long_).class_(throws_).class_(switch_).class_(final_).class_(false)
   );
   private static final HU u = class_("tripwire", ju_3.private_, 7, 262144, true, true, default_());
   public static final yr_3 S = class_(
      "lines", ju_3.this_, 1, 256, Ha_1.class_().class_(new Hw_1(OptionalDouble.empty())).class_(short_).class_(private_).class_(P).class_(long_).class_(false)
   );
   private final jZ_2 m;
   private final int Z;
   private final int v;
   private final boolean F;
   private final boolean L;
   private final Optional<HU> A;
   private int n = -1;
   public static final HU[] s = static_();
   private static Map<rrWx_1, HU> C;

   public Optional<HU> char_() {
      return this.A;
   }

   public static HU byte_(rqO_2 var0, boolean var1) {
      var0 = continue_(var0);
      return class_(
         "entity_translucent",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(private_)
               .class_(while_)
               .class_(finally_)
               .class_(throw_)
               .class_(synchronized_)
               .class_(public_)
               .class_(var1);
            return class_("entity_translucent", ju_3.implements_, 7, 256, true, true, var2);
         }
      );
   }

   public static HU byte_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "entity_cutout",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(byte_)
               .class_(while_)
               .class_(finally_)
               .class_(synchronized_)
               .class_(public_)
               .class_(true);
            return class_("entity_cutout", ju_3.implements_, 7, 256, true, false, var1);
         }
      );
   }

   public static HU int_(rqO_2 var0) {
      return class_(
         "text",
         var0,
         () -> class_(
               "text",
               ju_3.goto_,
               7,
               256,
               false,
               false,
               Ha_1.class_().class_(new HR(var0, false, false)).class_(finally_).class_(private_).class_(synchronized_).class_(false)
            )
      );
   }

   public static HU int_() {
      return k;
   }

   public static int long_() {
      return S.G.new_.size();
   }

   public rqO_2 float_() {
      return null;
   }

   public HU(String var1, jZ_2 var2, int var3, int var4, boolean var5, boolean var6, Runnable var7, Runnable var8) {
      super(var1, var7, var8);
      this.m = var2;
      this.Z = var3;
      this.v = var4;
      this.F = var5;
      this.L = var6;
      this.A = Optional.of(this);
   }

   @Override
   public String toString() {
      return this.class_;
   }

   public static HU this_() {
      return N;
   }

   public boolean interface_() {
      return this.F;
   }

   private static HU class_(rrWx_1 var0, Supplier<HU> var1) {
      if (C == null) {
         C = new HashMap<>();
      }

      HU var2 = C.get(var0);
      if (var2 != null) {
         return var2;
      } else {
         var2 = (HU)var1.get();
         C.put(var0, var2);
         return var2;
      }
   }

   private static HU class_(String var0, int var1, Supplier<HU> var2) {
      rrWx_1 var3 = new rrWx_1(var0, var1);
      return class_(var3, var2);
   }

   public static HU class_(int var0) {
      return class_(
         "end_portal",
         var0,
         () -> {
            Ho_1 var1;
            HR var2;
            if (var0 <= 1) {
               var1 = private_;
               var2 = new HR(jE_2.class_, false, false);
            } else {
               var1 = protected_;
               var2 = new HR(jE_2.break_, false, false);
            }

            return class_(
               "end_portal", ju_3.this_, 7, 256, false, true, Ha_1.class_().class_(var1).class_(var2).class_(new Hj_1(var0)).class_(strictfp_).class_(false)
            );
         }
      );
   }

   public static HU class_(rqO_2 var0, float var1) {
      var0 = continue_(var0);
      return class_("entity_alpha", var0, var1, () -> {
         Ha_1 var2 = Ha_1.class_().class_(new HR(var0, false, false)).class_(new HC(var1)).class_(throw_).class_(true);
         return class_("entity_alpha", ju_3.implements_, 7, 256, var2);
      });
   }

   public static HU class_(rqO_2 var0, HH var1) {
      return class_(
         "outline",
         var0,
         var1 == instanceof_,
         () -> class_(
               "outline",
               ju_3.return_,
               7,
               256,
               Ha_1.class_()
                  .class_(new HR(var0, false, false))
                  .class_(var1)
                  .class_(interface_)
                  .class_(finally_)
                  .class_(super_)
                  .class_(default_)
                  .class_(transient_)
                  .class_(He_1.IS_OUTLINE)
            )
      );
   }

   public static HU class_(rqO_2 var0, float var1, float var2) {
      var0 = continue_(var0);
      return class_(
         "energy_swirl",
         var0,
         var1,
         var2,
         () -> class_(
               "energy_swirl",
               ju_3.implements_,
               7,
               256,
               false,
               true,
               Ha_1.class_()
                  .class_(new HR(var0, false, false))
                  .class_(new HI(var1, var2))
                  .class_(strictfp_)
                  .class_(protected_)
                  .class_(while_)
                  .class_(finally_)
                  .class_(throw_)
                  .class_(synchronized_)
                  .class_(public_)
                  .class_(false)
            )
      );
   }

   public static yr_3 class_(String var0, jZ_2 var1, int var2, int var3, boolean var4, boolean var5, Ha_1 var6) {
      return yr_3.break_(var0, var1, var2, var3, var4, var5, var6);
   }

   public void class_(lD_2 var1, int var2, int var3, int var4) {
      if (var1.final_()) {
         if (this.L) {
            var1.protected_((float)var2, (float)var3, (float)var4);
         }

         if (var1.finally_ != null) {
            rrMh_1.class_(var1.finally_);
         }

         var1.finally_();
         this.class_();
         if (rrbb_3.rs()) {
            rrxn_3.class_(false);
            rrdZ.u();
            rrdL.class_(this, var1);
         }

         yk_3.class_(var1);
         if (rrbb_3.rs()) {
            rrdL.break_(this, var1);
            rrdZ.m();
            rrxn_3.class_(true);
         }

         this.break_();
      }
   }

   private static HU class_(String var0, rqO_2 var1, boolean var2, Supplier<HU> var3) {
      rrWx_1 var4 = new rrWx_1(var0, var1, var2);
      return class_(var4, var3);
   }

   private static HU class_(String var0, rqO_2 var1, Supplier<HU> var2) {
      rrWx_1 var3 = new rrWx_1(var0, var1);
      return class_(var3, var2);
   }

   public static yr_3 class_(String var0, jZ_2 var1, int var2, int var3, Ha_1 var4) {
      return class_(var0, var1, var2, var3, false, false, var4);
   }

   private static HU class_(String var0, rqO_2 var1, float var2, Supplier<HU> var3) {
      rrWx_1 var4 = new rrWx_1(var0, var1, var2);
      return class_(var4, var3);
   }

   private static HU class_(String var0, rqO_2 var1, float var2, float var3, Supplier<HU> var4) {
      rrWx_1 var5 = new rrWx_1(var0, var1, var2, var3);
      return class_(var5, var4);
   }

   public static HU class_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "armor_cutout_no_cull",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(byte_)
               .class_(while_)
               .class_(finally_)
               .class_(throw_)
               .class_(synchronized_)
               .class_(public_)
               .class_(short_)
               .class_(true);
            return class_("armor_cutout_no_cull", ju_3.implements_, 7, 256, true, false, var1);
         }
      );
   }

   public static HU class_(rqO_2 var0, boolean var1) {
      var0 = continue_(var0);
      return class_(
         "entity_cutout_no_cull",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(byte_)
               .class_(while_)
               .class_(finally_)
               .class_(throw_)
               .class_(synchronized_)
               .class_(public_)
               .class_(var1);
            return class_("entity_cutout_no_cull", ju_3.implements_, 7, 256, true, false, var2);
         }
      );
   }

   private static Ha_1 default_() {
      return Ha_1.class_().class_(final_).class_(synchronized_).class_(package_).class_(private_).class_(switch_).class_(true);
   }

   private static Ha_1 short_() {
      return Ha_1.class_().class_(final_).class_(synchronized_).class_(package_).class_(private_).class_(P).class_(true);
   }

   public boolean void_() {
      return this.float_() == Hz_1.class_;
   }

   public static HU break_(rqO_2 var0, boolean var1) {
      var0 = continue_(var0);
      return class_(
         "entity_cutout_no_cull_z_offset",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(byte_)
               .class_(while_)
               .class_(finally_)
               .class_(throw_)
               .class_(synchronized_)
               .class_(public_)
               .class_(short_)
               .class_(var1);
            return class_("entity_cutout_no_cull_z_offset", ju_3.implements_, 7, 256, true, false, var2);
         }
      );
   }

   public static HU break_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_("entity_solid", var0, () -> {
         Ha_1 var1 = Ha_1.class_().class_(new HR(var0, false, false)).class_(byte_).class_(while_).class_(synchronized_).class_(public_).class_(true);
         return class_("entity_solid", ju_3.implements_, 7, 256, true, false, var1);
      });
   }

   public boolean throws_() {
      return this.L;
   }

   public static HU throws_(rqO_2 var0) {
      return break_(var0, true);
   }

   public static HU finally_() {
      return O;
   }

   public static HU finally_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "entity_decal",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(while_)
               .class_(finally_)
               .class_(char_)
               .class_(throw_)
               .class_(synchronized_)
               .class_(public_)
               .class_(false);
            return class_("entity_decal", ju_3.implements_, 7, 256, var1);
         }
      );
   }

   public static HU catch_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "entity_translucent_cull",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(private_)
               .class_(while_)
               .class_(finally_)
               .class_(synchronized_)
               .class_(public_)
               .class_(true);
            return class_("entity_translucent_cull", ju_3.implements_, 7, 256, true, true, var1);
         }
      );
   }

   public static HU catch_() {
      return G;
   }

   public static HU extends_() {
      return h;
   }

   public static HU extends_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "entity_no_outline",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(private_)
               .class_(while_)
               .class_(finally_)
               .class_(throw_)
               .class_(synchronized_)
               .class_(public_)
               .class_(float_)
               .class_(false);
            return class_("entity_no_outline", ju_3.implements_, 7, 256, false, true, var1);
         }
      );
   }

   public int goto_() {
      return this.v;
   }

   public static HU case_() {
      return E;
   }

   public static HU case_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "item_entity_translucent_cull",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(private_)
               .class_(P)
               .class_(while_)
               .class_(finally_)
               .class_(synchronized_)
               .class_(public_)
               .class_(Hn_1.long_)
               .class_(true);
            return class_("item_entity_translucent_cull", ju_3.implements_, 7, 256, true, true, var1);
         }
      );
   }

   public static HU continue_() {
      return z;
   }

   public static rqO_2 continue_(rqO_2 var0) {
      if (rrbb_3.R()) {
         var0 = rrME.class_(var0);
      }

      if (rrbY_2.class_()) {
         var0 = rrbY_2.class_(var0);
      }

      return var0;
   }

   public static HU else_() {
      return c;
   }

   public static HU implements_() {
      return M;
   }

   public static HU implements_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "entity_smooth_cutout",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(extends_)
               .class_(while_)
               .class_(final_)
               .class_(throw_)
               .class_(synchronized_)
               .class_(true);
            return class_("entity_smooth_cutout", ju_3.implements_, 7, 256, var1);
         }
      );
   }

   private static Ha_1 import_() {
      return Ha_1.class_().class_(final_).class_(synchronized_).class_(package_).class_(private_).class_(for_).class_(true);
   }

   public Optional<HU> instanceof_() {
      return Optional.empty();
   }

   public static HU new_() {
      return W;
   }

   public static HU new_(rqO_2 var0) {
      return class_(
         "text_see_through",
         var0,
         () -> class_(
               "text_see_through",
               ju_3.goto_,
               7,
               256,
               false,
               false,
               Ha_1.class_()
                  .class_(new HR(var0, false, false))
                  .class_(finally_)
                  .class_(private_)
                  .class_(synchronized_)
                  .class_(interface_)
                  .class_(float_)
                  .class_(false)
            )
      );
   }

   public static HU package_(rqO_2 var0) {
      return class_(
         "crumbling",
         var0,
         () -> {
            HR var1 = new HR(var0, false, false);
            return class_(
               "crumbling",
               ju_3.private_,
               7,
               256,
               false,
               true,
               Ha_1.class_().class_(var1).class_(finally_).class_(catch_).class_(float_).class_(import_).class_(false)
            );
         }
      );
   }

   public static HU package_() {
      return d;
   }

   public static HU return_() {
      return S;
   }

   public static HU super_() {
      return Q;
   }

   public boolean throw_() {
      return false;
   }

   public int try_() {
      return this.Z;
   }

   public jZ_2 while_() {
      return this.m;
   }

   private static HU[] static_() {
      HU[] var0 = public_().toArray(new HU[0]);
      int var2 = 0;

      while (var2 < var0.length) {
         HU var1 = var0[var2];
         var1.n = var2++;
      }

      return var0;
   }

   public static List<HU> public_() {
      return ImmutableList.of(case_(), catch_(), private_(), implements_(), synchronized_());
   }

   public int protected_() {
      return this.n;
   }

   public static HU protected_(rqO_2 var0) {
      return class_(var0, true);
   }

   public static HU protected_(rqO_2 var0, boolean var1) {
      var0 = continue_(var0);
      return class_(
         "beacon_beam",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(var1 ? private_ : byte_)
               .class_(var1 ? float_ : long_)
               .class_(default_)
               .class_(false);
            return class_("beacon_beam", ju_3.private_, 7, 256, false, true, var2);
         }
      );
   }

   public static HU private_(rqO_2 var0) {
      return byte_(var0, true);
   }

   public static HU private_() {
      return b;
   }

   public boolean abstract_() {
      return this.byte_().equals("entity_solid");
   }

   public static HU final_() {
      return x;
   }

   public static HU final_(rqO_2 var0) {
      return class_(var0, throw_);
   }

   public static HU volatile_() {
      return J;
   }

   public static HU volatile_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "eyes",
         var0,
         () -> {
            HR var1 = new HR(var0, false, false);
            return class_(
               "eyes", ju_3.implements_, 7, 256, false, true, Ha_1.class_().class_(var1).class_(protected_).class_(float_).class_(strictfp_).class_(false)
            );
         }
      );
   }

   public static HU synchronized_() {
      return u;
   }

   public static HU native_(rqO_2 var0) {
      var0 = continue_(var0);
      return class_(
         "entity_shadow",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.class_()
               .class_(new HR(var0, false, false))
               .class_(private_)
               .class_(while_)
               .class_(finally_)
               .class_(instanceof_)
               .class_(synchronized_)
               .class_(public_)
               .class_(float_)
               .class_(abstract_)
               .class_(short_)
               .class_(false);
            return class_("entity_shadow", ju_3.implements_, 7, 256, false, false, var1);
         }
      );
   }

   public static HU native_() {
      return X;
   }
}
