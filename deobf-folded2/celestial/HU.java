package celestial;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;

public abstract class HU extends Hn_1 {
   private static final HU E = id_class(
      "solid", ju_3.id_private, 7, 2097152, true, false, Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(true)
   );
   private static final HU G = id_class(
      "cutout_mipped",
      ju_3.id_private,
      7,
      131072,
      true,
      false,
      Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_native).id_class(true)
   );
   private static final HU b = id_class(
      "cutout",
      ju_3.id_private,
      7,
      131072,
      true,
      false,
      Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_int).id_class(id_native).id_class(true)
   );
   private static final HU M = id_class("translucent", ju_3.id_private, 7, 262144, true, true, id_import());
   private static final HU O = id_class("translucent_moving_block", ju_3.id_private, 7, 262144, false, true, id_short());
   private static final HU h = id_class("translucent_no_crumbling", ju_3.id_private, 7, 262144, false, true, id_import());
   private static final HU X = id_class(
      "leash", ju_3.id_else, 7, 256, Ha_1.id_class().id_class(id_new).id_class(id_throw).id_class(id_synchronized).id_class(false)
   );
   private static final HU J = id_class("water_mask", ju_3.id_super, 7, 256, Ha_1.id_class().id_class(id_new).id_class(id_void).id_class(false));
   private static final HU x = id_class(
      "armor_glint",
      ju_3.id_synchronized,
      7,
      256,
      Ha_1.id_class()
         .id_class(new HR(Hz_1.id_class, true, false))
         .id_class(id_float)
         .id_class(id_throw)
         .id_class(id_char)
         .id_class(id_case)
         .id_class(id_this)
         .id_class(id_short)
         .id_class(false)
   );
   private static final HU d = id_class(
      "armor_entity_glint",
      ju_3.id_synchronized,
      7,
      256,
      Ha_1.id_class()
         .id_class(new HR(Hz_1.id_class, true, false))
         .id_class(id_float)
         .id_class(id_throw)
         .id_class(id_char)
         .id_class(id_case)
         .id_class(id_else)
         .id_class(id_short)
         .id_class(false)
   );
   private static final HU k = id_class(
      "glint_translucent",
      ju_3.id_synchronized,
      7,
      256,
      Ha_1.id_class()
         .id_class(new HR(Hz_1.id_class, true, false))
         .id_class(id_float)
         .id_class(id_throw)
         .id_class(id_char)
         .id_class(id_case)
         .id_class(id_this)
         .id_class(P)
         .id_class(false)
   );
   private static final HU W = id_class(
      "glint",
      ju_3.id_synchronized,
      7,
      256,
      Ha_1.id_class()
         .id_class(new HR(Hz_1.id_class, true, false))
         .id_class(id_float)
         .id_class(id_throw)
         .id_class(id_char)
         .id_class(id_case)
         .id_class(id_this)
         .id_class(false)
   );
   private static final HU z = id_class(
      "glint_direct",
      ju_3.id_synchronized,
      7,
      256,
      Ha_1.id_class()
         .id_class(new HR(Hz_1.id_class, true, false))
         .id_class(id_float)
         .id_class(id_throw)
         .id_class(id_char)
         .id_class(id_case)
         .id_class(id_this)
         .id_class(false)
   );
   private static final HU Q = id_class(
      "entity_glint",
      ju_3.id_synchronized,
      7,
      256,
      Ha_1.id_class()
         .id_class(new HR(Hz_1.id_class, true, false))
         .id_class(id_float)
         .id_class(id_throw)
         .id_class(id_char)
         .id_class(id_case)
         .id_class(P)
         .id_class(id_else)
         .id_class(false)
   );
   private static final HU N = id_class(
      "entity_glint_direct",
      ju_3.id_synchronized,
      7,
      256,
      Ha_1.id_class()
         .id_class(new HR(Hz_1.id_class, true, false))
         .id_class(id_float)
         .id_class(id_throw)
         .id_class(id_char)
         .id_class(id_case)
         .id_class(id_else)
         .id_class(false)
   );
   private static final HU c = id_class(
      "lightning",
      ju_3.id_this,
      7,
      256,
      false,
      true,
      Ha_1.id_class().id_class(id_long).id_class(id_throws).id_class(id_switch).id_class(id_final).id_class(false)
   );
   private static final HU u = id_class("tripwire", ju_3.id_private, 7, 262144, true, true, id_default());
   public static final yr_3 S = id_class(
      "lines",
      ju_3.id_this,
      1,
      256,
      Ha_1.id_class().id_class(new Hw_1(OptionalDouble.empty())).id_class(id_short).id_class(id_private).id_class(P).id_class(id_long).id_class(false)
   );
   private final jZ_2 m;
   private final int Z;
   private final int v;
   private final boolean F;
   private final boolean L;
   private final Optional<HU> A;
   private int n = -1;
   public static final HU[] s = id_static();
   private static Map<rrWx_1, HU> C;

   public Optional<HU> id_char() {
      return this.A;
   }

   public static HU id_byte(rqO_2 var0, boolean var1) {
      var0 = id_continue(var0);
      return id_class(
         "entity_translucent",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_private)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_throw)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(var1);
            return id_class("entity_translucent", ju_3.id_implements, 7, 256, true, true, var2);
         }
      );
   }

   public static HU id_byte(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "entity_cutout",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_byte)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(true);
            return id_class("entity_cutout", ju_3.id_implements, 7, 256, true, false, var1);
         }
      );
   }

   public static HU id_int(rqO_2 var0) {
      return id_class(
         "text",
         var0,
         () -> id_class(
               "text",
               ju_3.id_goto,
               7,
               256,
               false,
               false,
               Ha_1.id_class().id_class(new HR(var0, false, false)).id_class(id_finally).id_class(id_private).id_class(id_synchronized).id_class(false)
            )
      );
   }

   public static HU id_int() {
      return k;
   }

   public static int id_long() {
      return S.G.id_new.size();
   }

   public rqO_2 id_float() {
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
      return this.id_class;
   }

   public static HU id_this() {
      return N;
   }

   public boolean id_interface() {
      return this.F;
   }

   private static HU id_class(rrWx_1 var0, Supplier<HU> var1) {
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

   private static HU id_class(String var0, int var1, Supplier<HU> var2) {
      rrWx_1 var3 = new rrWx_1(var0, var1);
      return id_class(var3, var2);
   }

   public static HU id_class(int var0) {
      return id_class(
         "end_portal",
         var0,
         () -> {
            Ho_1 var1;
            HR var2;
            if (var0 <= 1) {
               var1 = id_private;
               var2 = new HR(jE_2.id_class, false, false);
            } else {
               var1 = id_protected;
               var2 = new HR(jE_2.id_break, false, false);
            }

            return id_class(
               "end_portal",
               ju_3.id_this,
               7,
               256,
               false,
               true,
               Ha_1.id_class().id_class(var1).id_class(var2).id_class(new Hj_1(var0)).id_class(id_strictfp).id_class(false)
            );
         }
      );
   }

   public static HU id_class(rqO_2 var0, float var1) {
      var0 = id_continue(var0);
      return id_class("entity_alpha", var0, var1, () -> {
         Ha_1 var2 = Ha_1.id_class().id_class(new HR(var0, false, false)).id_class(new HC(var1)).id_class(id_throw).id_class(true);
         return id_class("entity_alpha", ju_3.id_implements, 7, 256, var2);
      });
   }

   public static HU id_class(rqO_2 var0, HH var1) {
      return id_class(
         "outline",
         var0,
         var1 == id_instanceof,
         () -> id_class(
               "outline",
               ju_3.id_return,
               7,
               256,
               Ha_1.id_class()
                  .id_class(new HR(var0, false, false))
                  .id_class(var1)
                  .id_class(id_interface)
                  .id_class(id_finally)
                  .id_class(id_super)
                  .id_class(id_default)
                  .id_class(id_transient)
                  .id_class(He_1.IS_OUTLINE)
            )
      );
   }

   public static HU id_class(rqO_2 var0, float var1, float var2) {
      var0 = id_continue(var0);
      return id_class(
         "energy_swirl",
         var0,
         var1,
         var2,
         () -> id_class(
               "energy_swirl",
               ju_3.id_implements,
               7,
               256,
               false,
               true,
               Ha_1.id_class()
                  .id_class(new HR(var0, false, false))
                  .id_class(new HI(var1, var2))
                  .id_class(id_strictfp)
                  .id_class(id_protected)
                  .id_class(id_while)
                  .id_class(id_finally)
                  .id_class(id_throw)
                  .id_class(id_synchronized)
                  .id_class(id_public)
                  .id_class(false)
            )
      );
   }

   public static yr_3 id_class(String var0, jZ_2 var1, int var2, int var3, boolean var4, boolean var5, Ha_1 var6) {
      return yr_3.id_break(var0, var1, var2, var3, var4, var5, var6);
   }

   public void id_class(lD_2 var1, int var2, int var3, int var4) {
      if (var1.id_final()) {
         if (this.L) {
            var1.id_protected((float)var2, (float)var3, (float)var4);
         }

         if (var1.id_finally != null) {
            rrMh_1.id_class(var1.id_finally);
         }

         var1.id_finally();
         this.id_class();
         if (rrbb_3.rs()) {
            rrxn_3.id_class(false);
            rrdZ.u();
            rrdL.id_class(this, var1);
         }

         yk_3.id_class(var1);
         if (rrbb_3.rs()) {
            rrdL.id_break(this, var1);
            rrdZ.m();
            rrxn_3.id_class(true);
         }

         this.id_break();
      }
   }

   private static HU id_class(String var0, rqO_2 var1, boolean var2, Supplier<HU> var3) {
      rrWx_1 var4 = new rrWx_1(var0, var1, var2);
      return id_class(var4, var3);
   }

   private static HU id_class(String var0, rqO_2 var1, Supplier<HU> var2) {
      rrWx_1 var3 = new rrWx_1(var0, var1);
      return id_class(var3, var2);
   }

   public static yr_3 id_class(String var0, jZ_2 var1, int var2, int var3, Ha_1 var4) {
      return id_class(var0, var1, var2, var3, false, false, var4);
   }

   private static HU id_class(String var0, rqO_2 var1, float var2, Supplier<HU> var3) {
      rrWx_1 var4 = new rrWx_1(var0, var1, var2);
      return id_class(var4, var3);
   }

   private static HU id_class(String var0, rqO_2 var1, float var2, float var3, Supplier<HU> var4) {
      rrWx_1 var5 = new rrWx_1(var0, var1, var2, var3);
      return id_class(var5, var4);
   }

   public static HU id_class(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "armor_cutout_no_cull",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_byte)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_throw)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(id_short)
               .id_class(true);
            return id_class("armor_cutout_no_cull", ju_3.id_implements, 7, 256, true, false, var1);
         }
      );
   }

   public static HU id_class(rqO_2 var0, boolean var1) {
      var0 = id_continue(var0);
      return id_class(
         "entity_cutout_no_cull",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_byte)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_throw)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(var1);
            return id_class("entity_cutout_no_cull", ju_3.id_implements, 7, 256, true, false, var2);
         }
      );
   }

   private static Ha_1 id_default() {
      return Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_private).id_class(id_switch).id_class(true);
   }

   private static Ha_1 id_short() {
      return Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_private).id_class(P).id_class(true);
   }

   public boolean id_void() {
      return this.id_float() == Hz_1.id_class;
   }

   public static HU id_break(rqO_2 var0, boolean var1) {
      var0 = id_continue(var0);
      return id_class(
         "entity_cutout_no_cull_z_offset",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_byte)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_throw)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(id_short)
               .id_class(var1);
            return id_class("entity_cutout_no_cull_z_offset", ju_3.id_implements, 7, 256, true, false, var2);
         }
      );
   }

   public static HU id_break(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "entity_solid",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_byte)
               .id_class(id_while)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(true);
            return id_class("entity_solid", ju_3.id_implements, 7, 256, true, false, var1);
         }
      );
   }

   public boolean id_throws() {
      return this.L;
   }

   public static HU id_throws(rqO_2 var0) {
      return id_break(var0, true);
   }

   public static HU id_finally() {
      return O;
   }

   public static HU id_finally(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "entity_decal",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_char)
               .id_class(id_throw)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(false);
            return id_class("entity_decal", ju_3.id_implements, 7, 256, var1);
         }
      );
   }

   public static HU id_catch(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "entity_translucent_cull",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_private)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(true);
            return id_class("entity_translucent_cull", ju_3.id_implements, 7, 256, true, true, var1);
         }
      );
   }

   public static HU id_catch() {
      return G;
   }

   public static HU id_extends() {
      return h;
   }

   public static HU id_extends(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "entity_no_outline",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_private)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_throw)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(id_float)
               .id_class(false);
            return id_class("entity_no_outline", ju_3.id_implements, 7, 256, false, true, var1);
         }
      );
   }

   public int id_goto() {
      return this.v;
   }

   public static HU id_case() {
      return E;
   }

   public static HU id_case(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "item_entity_translucent_cull",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_private)
               .id_class(P)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(Hn_1.id_long)
               .id_class(true);
            return id_class("item_entity_translucent_cull", ju_3.id_implements, 7, 256, true, true, var1);
         }
      );
   }

   public static HU id_continue() {
      return z;
   }

   public static rqO_2 id_continue(rqO_2 var0) {
      if (rrbb_3.R()) {
         var0 = rrME.id_class(var0);
      }

      if (rrbY_2.id_class()) {
         var0 = rrbY_2.id_class(var0);
      }

      return var0;
   }

   public static HU id_else() {
      return c;
   }

   public static HU id_implements() {
      return M;
   }

   public static HU id_implements(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "entity_smooth_cutout",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_extends)
               .id_class(id_while)
               .id_class(id_final)
               .id_class(id_throw)
               .id_class(id_synchronized)
               .id_class(true);
            return id_class("entity_smooth_cutout", ju_3.id_implements, 7, 256, var1);
         }
      );
   }

   private static Ha_1 id_import() {
      return Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_private).id_class(id_for).id_class(true);
   }

   public Optional<HU> id_instanceof() {
      return Optional.empty();
   }

   public static HU id_new() {
      return W;
   }

   public static HU id_new(rqO_2 var0) {
      return id_class(
         "text_see_through",
         var0,
         () -> id_class(
               "text_see_through",
               ju_3.id_goto,
               7,
               256,
               false,
               false,
               Ha_1.id_class()
                  .id_class(new HR(var0, false, false))
                  .id_class(id_finally)
                  .id_class(id_private)
                  .id_class(id_synchronized)
                  .id_class(id_interface)
                  .id_class(id_float)
                  .id_class(false)
            )
      );
   }

   public static HU id_package(rqO_2 var0) {
      return id_class(
         "crumbling",
         var0,
         () -> {
            HR var1 = new HR(var0, false, false);
            return id_class(
               "crumbling",
               ju_3.id_private,
               7,
               256,
               false,
               true,
               Ha_1.id_class().id_class(var1).id_class(id_finally).id_class(id_catch).id_class(id_float).id_class(id_import).id_class(false)
            );
         }
      );
   }

   public static HU id_package() {
      return d;
   }

   public static HU id_return() {
      return S;
   }

   public static HU id_super() {
      return Q;
   }

   public boolean id_throw() {
      return false;
   }

   public int id_try() {
      return this.Z;
   }

   public jZ_2 id_while() {
      return this.m;
   }

   private static HU[] id_static() {
      HU[] var0 = id_public().toArray(new HU[0]);
      int var2 = 0;

      while (var2 < var0.length) {
         HU var1 = var0[var2];
         var1.n = var2++;
      }

      return var0;
   }

   public static List<HU> id_public() {
      return ImmutableList.of(id_case(), id_catch(), id_private(), id_implements(), id_synchronized());
   }

   public int id_protected() {
      return this.n;
   }

   public static HU id_protected(rqO_2 var0) {
      return id_class(var0, true);
   }

   public static HU id_protected(rqO_2 var0, boolean var1) {
      var0 = id_continue(var0);
      return id_class(
         "beacon_beam",
         var0,
         var1,
         () -> {
            Ha_1 var2 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(var1 ? id_private : id_byte)
               .id_class(var1 ? id_float : id_long)
               .id_class(id_default)
               .id_class(false);
            return id_class("beacon_beam", ju_3.id_private, 7, 256, false, true, var2);
         }
      );
   }

   public static HU id_private(rqO_2 var0) {
      return id_byte(var0, true);
   }

   public static HU id_private() {
      return b;
   }

   public boolean id_abstract() {
      return this.id_byte().equals("entity_solid");
   }

   public static HU id_final() {
      return x;
   }

   public static HU id_final(rqO_2 var0) {
      return id_class(var0, id_throw);
   }

   public static HU id_volatile() {
      return J;
   }

   public static HU id_volatile(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "eyes",
         var0,
         () -> {
            HR var1 = new HR(var0, false, false);
            return id_class(
               "eyes",
               ju_3.id_implements,
               7,
               256,
               false,
               true,
               Ha_1.id_class().id_class(var1).id_class(id_protected).id_class(id_float).id_class(id_strictfp).id_class(false)
            );
         }
      );
   }

   public static HU id_synchronized() {
      return u;
   }

   public static HU id_native(rqO_2 var0) {
      var0 = id_continue(var0);
      return id_class(
         "entity_shadow",
         var0,
         () -> {
            Ha_1 var1 = Ha_1.id_class()
               .id_class(new HR(var0, false, false))
               .id_class(id_private)
               .id_class(id_while)
               .id_class(id_finally)
               .id_class(id_instanceof)
               .id_class(id_synchronized)
               .id_class(id_public)
               .id_class(id_float)
               .id_class(id_abstract)
               .id_class(id_short)
               .id_class(false);
            return id_class("entity_shadow", ju_3.id_implements, 7, 256, false, false, var1);
         }
      );
   }

   public static HU id_native() {
      return X;
   }
}
