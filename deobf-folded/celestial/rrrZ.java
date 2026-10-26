package celestial;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrrZ<C extends rUv_1> {
   public static final BiMap<String, rrrZ<?>> id_class = HashBiMap.create();
   private static final Map<rrrZ<?>, rKm_1> id_else = Maps.newHashMap();
   private static final Logger id_synchronized = LogManager.getLogger();
   public static final rrrZ<rrrI> id_break = id_class("Pillager_Outpost", new riT_2(rrrI.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<raI_2> id_byte = id_class("Mineshaft", new raK_2(raI_2.id_class), rKm_1.UNDERGROUND_STRUCTURES);
   public static final rrrZ<rUt_1> id_protected = id_class("Mansion", new rrri_1(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> id_throws = id_class("Jungle_Pyramid", new raq_3(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> id_case = id_class("Desert_Pyramid", new reY_2(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> id_catch = id_class("Igloo", new ran_3(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUo_1> id_private = id_class("Ruined_Portal", new rij_3(rUo_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rio_3> id_implements = id_class("Shipwreck", new riU_2(rio_3.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrq_1 id_finally = id_class("Swamp_Hut", new rrrq_1(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> id_extends = id_class("Stronghold", new rrru_1(rUt_1.id_class), rKm_1.STRONGHOLDS);
   public static final rrrZ<rUt_1> id_native = id_class("Monument", new riL_2(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rin_3> id_volatile = id_class("Ocean_Ruin", new riH_2(rin_3.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> id_final = id_class("Fortress", new raZ_2(rUt_1.id_class), rKm_1.UNDERGROUND_DECORATION);
   public static final rrrZ<rUt_1> id_package = id_class("EndCity", new raB_2(rUt_1.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUV> id_int = id_class("Buried_Treasure", new reV_2(rUV.id_class), rKm_1.UNDERGROUND_STRUCTURES);
   public static final rrrZ<rrrI> id_new = id_class("Village", new rrrf_1(rrrI.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final rrrZ<rUt_1> id_continue = id_class("Nether_Fossil", new rae_3(rUt_1.id_class), rKm_1.UNDERGROUND_DECORATION);
   public static final rrrZ<rrrI> id_super = id_class("Bastion_Remnant", new rey_3(rrrI.id_class), rKm_1.SURFACE_STRUCTURES);
   public static final List<rrrZ<?>> id_this = ImmutableList.of(id_break, id_new, id_continue);
   private static final rqO_2 id_return = new rqO_2("jigsaw");
   private static final Map<rqO_2, rqO_2> id_public = ImmutableMap.builder()
      .put(new rqO_2("nvi"), id_return)
      .put(new rqO_2("pcp"), id_return)
      .put(new rqO_2("bastionremnant"), id_return)
      .put(new rqO_2("runtime"), id_return)
      .build();
   private final Codec<reP_2<C, rrrZ<C>>> id_goto;

   public List<rYf_1> id_byte() {
      return ImmutableList.of();
   }

   public rrrZ(Codec<C> var1) {
      this.id_goto = var1.fieldOf("config").xmap(var1x -> new reP_2<>(this, (C)var1x), var0 -> var0.id_throws).codec();
   }

   private rrrH<C> id_class(int var1, int var2, rfi_3 var3, int var4, long var5) {
      return this.id_class().create(this, var1, var2, var3, var4, var5);
   }

   public rrrH<?> id_class(rVm_1 var1, rKd_1 var2, rYY var3, rrPt_1 var4, long var5, rfj_3 var7, rYG var8, int var9, rqm_3 var10, rrSI var11, C var12) {
      rfj_3 var13 = this.id_class(var11, var5, var10, var7.id_break, var7.id_byte);
      if (var7.id_break == var13.id_break
         && var7.id_byte == var13.id_byte
         && this.id_class(var2, var3, var5, var10, var7.id_break, var7.id_byte, var8, var13, (C)var12)) {
         rrrH var14 = this.id_class(var7.id_break, var7.id_byte, rfi_3.id_class(), var9, var5);
         var14.id_class(var1, var2, var4, var7.id_break, var7.id_byte, var8, var12);
         if (var14.id_throws()) {
            return var14;
         }
      }

      return rrrH.id_class;
   }

   protected boolean id_class(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, C var10) {
      return true;
   }

   public final rfj_3 id_class(rrSI var1, long var2, rqm_3 var4, int var5, int var6) {
      int var7 = var1.id_class();
      int var8 = var1.id_break();
      int var9 = Math.floorDiv(var5, var7);
      int var10 = Math.floorDiv(var6, var7);
      var4.id_class(var2, var9, var10, var1.id_byte());
      int var11;
      int var12;
      if (this.id_break()) {
         var11 = var4.nextInt(var7 - var8);
         var12 = var4.nextInt(var7 - var8);
      } else {
         var11 = (var4.nextInt(var7 - var8) + var4.nextInt(var7 - var8)) / 2;
         var12 = (var4.nextInt(var7 - var8) + var4.nextInt(var7 - var8)) / 2;
      }

      return new rfj_3(var9 * var7 + var11, var10 * var7 + var12);
   }

   public abstract rrrv_1<C> id_class();

   private static <F extends rrrZ<?>> F id_class(String var0, F var1, rKm_1 var2) {
      id_class.put(var0.toLowerCase(Locale.ROOT), var1);
      id_else.put(var1, var2);
      return rVL.id_class(rVL.t, var0.toLowerCase(Locale.ROOT), (F)var1);
   }

   public reP_2<C, ? extends rrrZ<C>> id_class(C var1) {
      return new reP_2<>(this, (C)var1);
   }

   public rfH_2 id_class(rRR var1, rrrA var2, rfH_2 var3, int var4, boolean var5, long var6, rrSI var8) {
      int var9 = var8.id_class();
      int var10 = var3.b_() >> 4;
      int var11 = var3.d_() >> 4;
      int var12 = 0;

      for (rqm_3 var13 = new rqm_3(); var12 <= var4; var12++) {
         for (int var14 = -var12; var14 <= var12; var14++) {
            boolean var15 = var14 == -var12 || var14 == var12;

            for (int var16 = -var12; var16 <= var12; var16++) {
               boolean var17 = var16 == -var12 || var16 == var12;
               if (var15 || var17) {
                  int var18 = var10 + var9 * var14;
                  int var19 = var11 + var9 * var16;
                  rfj_3 var20 = this.id_class(var8, var6, var13, var18, var19);
                  roC_2 var21 = var1.id_class(var20.id_break, var20.id_byte, roN_2.id_break);
                  rrrH var22 = var2.id_class(rjh_3.id_class(var21.id_private(), 0), this, var21);
                  if (var22 != null && var22.id_throws()) {
                     if (var5 && var22.id_private()) {
                        var22.id_implements();
                        return var22.id_class();
                     }

                     if (!var5) {
                        return var22.id_class();
                     }
                  }

                  if (var12 == 0) {
                     break;
                  }
               }
            }

            if (var12 == 0) {
               break;
            }
         }
      }

      return null;
   }

   public static rrrH<?> id_class(rrPt_1 var0, rcd_3 var1, long var2) {
      String var4 = var1.id_native("id");
      if ("INVALID".equals(var4)) {
         return rrrH.id_class;
      } else {
         rrrZ var5 = rVL.t.id_class(new rqO_2(var4.toLowerCase(Locale.ROOT)));
         if (var5 == null) {
            id_synchronized.error("Unknown feature id: {}", var4);
            return null;
         } else {
            int var6 = var1.id_private("ChunkX");
            int var7 = var1.id_private("ChunkZ");
            int var8 = var1.id_private("references");
            rfi_3 var9 = var1.id_throws("BB") ? new rfi_3(var1.id_final("BB")) : rfi_3.id_class();
            rcy_3 var10 = var1.id_protected("Children", 10);

            try {
               rrrH var11 = var5.id_class(var6, var7, var9, var8, var2);

               for (int var12 = 0; var12 < var10.size(); var12++) {
                  rcd_3 var13 = var10.id_class(var12);
                  String var14 = var13.id_native("id").toLowerCase(Locale.ROOT);
                  rqO_2 var15 = new rqO_2(var14);
                  rqO_2 var16 = id_public.getOrDefault(var15, var15);
                  raF_2 var17 = rVL.I.id_class(var16);
                  if (var17 == null) {
                     id_synchronized.error("Unknown structure piece id: {}", var16);
                  } else {
                     try {
                        rrrn_1 var18 = var17.load(var0, var13);
                        var11.id_protected().add(var18);
                     } catch (Exception var19) {
                        id_synchronized.error("Exception loading structure piece with id {}", var16, var19);
                     }
                  }
               }

               return var11;
            } catch (Exception var20) {
               id_synchronized.error("Failed Start with id {}", var4, var20);
               return null;
            }
         }
      }
   }

   protected boolean id_break() {
      return true;
   }

   public static void id_throws() {
   }

   public String id_catch() {
      return (String)id_class.inverse().get(this);
   }

   public Codec<reP_2<C, rrrZ<C>>> id_case() {
      return this.id_goto;
   }

   public rKm_1 id_protected() {
      return id_else.get(this);
   }

   public List<rYf_1> id_private() {
      return ImmutableList.of();
   }
}
