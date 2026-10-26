package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uV_2 extends ch_3 {
   private static final Map<rKv_1, String> id_class = rqR_2.id_class(new EnumMap<>(rKv_1.class), var0 -> {
      var0.put(rKv_1.WORLD_SURFACE_WG, "SW");
      var0.put(rKv_1.WORLD_SURFACE, "S");
      var0.put(rKv_1.OCEAN_FLOOR_WG, "OW");
      var0.put(rKv_1.OCEAN_FLOOR, "O");
      var0.put(rKv_1.MOTION_BLOCKING, "M");
      var0.put(rKv_1.MOTION_BLOCKING_NO_LEAVES, "ML");
   });
   private final QY id_throws;
   private final cm_3 id_case;
   private rjG_2 id_catch;
   private rjG_2 id_private;
   private rfj_3 id_implements;
   private roJ_2 id_finally;
   private CompletableFuture<roJ_2> id_extends;
   private String id_native = null;
   private List<String> id_volatile = null;
   private List<String> id_final = null;
   private long id_package = 0L;
   private long id_int = 0L;
   private final List<Float> id_new = new ArrayList<>();
   private final List<Float> id_continue = new ArrayList<>();

   protected void id_byte(Ml_1 var1) {
      List var2 = this.id_final;
      if (var2 == null || System.currentTimeMillis() > this.id_int) {
         var2 = this.id_case();
         this.id_final = var2;
         this.id_int = System.currentTimeMillis() + 100L;
      }

      rrWn_1[] var3 = new rrWn_1[var2.size()];
      rrWC[] var4 = new rrWC[var2.size()];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         String var6 = (String)var2.get(var5);
         if (!Strings.isNullOrEmpty(var6)) {
            byte var7 = 9;
            int var8 = this.id_case.id_break(var6);
            int var9 = this.id_throws.id_else().id_super() - 2 - var8;
            int var10 = 2 + var7 * var5;
            var4[var5] = new rrWC(var9 - 1, var10 - 1, var9 + var8 + 1, var10 + var7 - 1);
            var3[var5] = new rrWn_1(var9, var10);
         }
      }

      rrWl_1.id_class(var1.id_byte().id_class(), var4, -1873784752);
      this.id_case.id_class(var2, var3, 14737632, var1.id_byte().id_class(), false, this.id_case.id_class());
   }

   public uV_2(QY var1) {
      this.id_throws = var1;
      this.id_case = (cm_3)var1.id_class[15];
   }

   private static long id_class(long var0) {
      return var0 / 1024L / 1024L;
   }

   private int id_class(int var1, int var2, float var3) {
      int var4 = var1 >> 24 & 0xFF;
      int var5 = var1 >> 16 & 0xFF;
      int var6 = var1 >> 8 & 0xFF;
      int var7 = var1 & 0xFF;
      int var8 = var2 >> 24 & 0xFF;
      int var9 = var2 >> 16 & 0xFF;
      int var10 = var2 >> 8 & 0xFF;
      int var11 = var2 & 0xFF;
      int var12 = rfU_2.id_class((int)rfU_2.id_catch(var3, (float)var4, (float)var8), 0, 255);
      int var13 = rfU_2.id_class((int)rfU_2.id_catch(var3, (float)var5, (float)var9), 0, 255);
      int var14 = rfU_2.id_class((int)rfU_2.id_catch(var3, (float)var6, (float)var10), 0, 255);
      int var15 = rfU_2.id_class((int)rfU_2.id_catch(var3, (float)var7, (float)var11), 0, 255);
      return var12 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   private String id_class(Entry<rCZ<?>, Comparable<?>> var1) {
      rCZ var2 = (rCZ)var1.getKey();
      Comparable var3 = (Comparable)var1.getValue();
      Object var4 = rqR_2.id_class(var2, var3);
      if (Boolean.TRUE.equals(var3)) {
         var4 = rgF_2.GREEN + var4;
      } else if (Boolean.FALSE.equals(var3)) {
         var4 = rgF_2.RED + var4;
      }

      return var2.id_throws() + ": " + var4;
   }

   public void id_class() {
      this.id_extends = null;
      this.id_finally = null;
   }

   public void id_class(Ml_1 var1) {
      RenderSystem.pushMatrix();
      an_3 var2 = this.id_throws.id_catch();
      this.id_catch = var2.id_break(20.0, 0.0F, false);
      this.id_private = var2.id_break(20.0, 0.0F, true);
      this.id_break(var1);
      this.id_byte(var1);
      RenderSystem.popMatrix();
      if (((Qw_1)this.id_throws.id_class[20]).o) {
         int var3 = this.id_throws.id_else().id_super();
         this.id_class(var1, this.id_throws.k(), 0, var3 / 2, true);
         rng_3 var4 = this.id_throws.id_this();
         if (var4 != null) {
            this.id_class(var1, var4.i(), var3 - Math.min(var3 / 2, 240), var3 / 2, false);
         }
      }
   }

   private void id_class(Ml_1 var1, rpN_2 var2, int var3, int var4, boolean var5) {
      if (!var5) {
         int var6 = (int)(512.0 / this.id_throws.id_else().id_return());
         var3 = Math.max(var3, var6);
         var4 = this.id_throws.id_else().id_super() - var3;
         RenderSystem.disableDepthTest();
         int var7 = var2.id_class();
         int var8 = var2.id_break();
         long[] var9 = var2.id_byte();
         int var10 = var3;
         int var11 = Math.max(0, var9.length - var4);
         int var12 = var9.length - var11;
         int var13 = var2.id_class(var7 + var11);
         long var14 = 0L;
         int var16 = Integer.MAX_VALUE;
         int var17 = Integer.MIN_VALUE;

         for (int var18 = 0; var18 < var12; var18++) {
            int var19 = (int)(var9[var2.id_class(var13 + var18)] / 1000000L);
            var16 = Math.min(var16, var19);
            var17 = Math.max(var17, var19);
            var14 += (long)var19;
         }

         int var30 = this.id_throws.id_else().id_this();
         id_class(var1, var3, var30 - 60, var3 + var12, var30, -1873784752);
         lD_2 var31 = yb_3.id_class().id_byte();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         var31.id_class(7, ju_3.id_this);

         for (rjV_2 var20 = rjo_3.id_class().id_byte(); var13 != var8; var13 = var2.id_class(var13 + 1)) {
            int var21 = var2.id_class(var9[var13], var5 ? 30 : 60, var5 ? 60 : 20);
            int var22 = var5 ? 100 : 60;
            int var23 = this.id_break(rfU_2.id_class(var21, 0, var22), 0, var22 / 2, var22);
            int var24 = var23 >> 24 & 0xFF;
            int var25 = var23 >> 16 & 0xFF;
            int var26 = var23 >> 8 & 0xFF;
            int var27 = var23 & 0xFF;
            var31.id_class(var20, (float)(var10 + 1), (float)var30, 0.0F).id_break(var25, var26, var27, var24).id_class();
            var31.id_class(var20, (float)(var10 + 1), (float)(var30 - var21 + 1), 0.0F).id_break(var25, var26, var27, var24).id_class();
            var31.id_class(var20, (float)var10, (float)(var30 - var21 + 1), 0.0F).id_break(var25, var26, var27, var24).id_class();
            var31.id_class(var20, (float)var10, (float)var30, 0.0F).id_break(var25, var26, var27, var24).id_class();
            var10++;
         }

         var31.id_finally();
         yk_3.id_class(var31);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         if (var5) {
            id_class(var1, var3 + 1, var30 - 30 + 1, var3 + 14, var30 - 30 + 10, -1873784752);
            this.id_case.id_break(var1, "60 FPS", (float)(var3 + 2), (float)(var30 - 30 + 2), 14737632);
            this.id_class(var1, var3, var3 + var12 - 1, var30 - 30, -1);
            id_class(var1, var3 + 1, var30 - 60 + 1, var3 + 14, var30 - 60 + 10, -1873784752);
            this.id_case.id_break(var1, "30 FPS", (float)(var3 + 2), (float)(var30 - 60 + 2), 14737632);
            this.id_class(var1, var3, var3 + var12 - 1, var30 - 60, -1);
         } else {
            id_class(var1, var3 + 1, var30 - 60 + 1, var3 + 14, var30 - 60 + 10, -1873784752);
            this.id_case.id_break(var1, "20 TPS", (float)(var3 + 2), (float)(var30 - 60 + 2), 14737632);
            this.id_class(var1, var3, var3 + var12 - 1, var30 - 60, -1);
         }

         this.id_class(var1, var3, var3 + var12 - 1, var30 - 1, -1);
         this.id_break(var1, var3, var30 - 60, var30, -1);
         this.id_break(var1, var3 + var12 - 1, var30 - 60, var30, -1);
         if (var5 && ((Qw_1)this.id_throws.id_class[20]).id_protected > 0 && ((Qw_1)this.id_throws.id_class[20]).id_protected <= 250) {
            this.id_class(var1, var3, var3 + var12 - 1, var30 - 1 - (int)(1800.0 / (double)((Qw_1)this.id_throws.id_class[20]).id_protected), -16711681);
         }

         String var32 = var16 + " ms min";
         String var33 = var14 / (long)var12 + " ms avg";
         String var34 = var17 + " ms max";
         this.id_case.id_class(var1, var32, (float)(var3 + 2), (float)(var30 - 60 - 9), 14737632);
         this.id_case.id_class(var1, var33, (float)(var3 + var12 / 2 - this.id_case.id_break(var33) / 2), (float)(var30 - 60 - 9), 14737632);
         this.id_case.id_class(var1, var34, (float)(var3 + var12 - this.id_case.id_break(var34)), (float)(var30 - 60 - 9), 14737632);
         RenderSystem.enableDepthTest();
      }
   }

   protected void id_break(Ml_1 var1) {
      List var2 = this.id_volatile;
      if (var2 == null || System.currentTimeMillis() > this.id_package) {
         var2 = this.id_protected();
         var2.add("");
         boolean var3 = this.id_throws.id_this() != null;
         var2.add(
            "Debug: Pie [shift]: "
               + (((Qw_1)this.id_throws.id_class[20]).Y ? "visible" : "hidden")
               + (var3 ? " FPS + TPS" : " FPS")
               + " [alt]: "
               + (((Qw_1)this.id_throws.id_class[20]).o ? "visible" : "hidden")
         );
         var2.add("For help: press F3 + Q");
         this.id_volatile = var2;
         this.id_package = System.currentTimeMillis() + 100L;
      }

      rrWn_1[] var11 = new rrWn_1[var2.size()];
      rrWC[] var4 = new rrWC[var2.size()];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         String var6 = (String)var2.get(var5);
         if (!Strings.isNullOrEmpty(var6)) {
            byte var7 = 9;
            int var8 = this.id_case.id_break(var6);
            byte var9 = 2;
            int var10 = 2 + var7 * var5;
            var4[var5] = new rrWC(1, var10 - 1, 2 + var8 + 1, var10 + var7 - 1);
            var11[var5] = new rrWn_1(2, var10);
         }
      }

      rrWl_1.id_class(var1.id_byte().id_class(), var4, -1873784752);
      this.id_case.id_class(var2, var11, 14737632, var1.id_byte().id_class(), false, this.id_case.id_class());
   }

   private int id_break(int var1, int var2, int var3, int var4) {
      return var1 < var3 ? this.id_class(-16711936, -256, (float)var1 / (float)var3) : this.id_class(-256, -65536, (float)(var1 - var3) / (float)(var4 - var3));
   }

   protected List<String> id_throws() {
      rng_3 var1 = this.id_throws.id_this();
      rud_3 var2 = this.id_throws.id_void().id_class();
      float var3 = 0.0F;
      float var4 = 0.0F;
      String var5;
      if (var1 != null) {
         var5 = String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", var1.a(), var3, var4);
      } else {
         var5 = String.format("\"%s\" server, %.0f tx, %.0f rx", ((cb_3)this.id_throws.id_class[57]).id_short(), var3, var4);
      }

      boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new();
      rfH_2 var7 = this.id_throws.id_catch().Bs();
      if (var6) {
         var7 = rfH_2.id_protected;
      }

      if (this.id_throws.E()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + rqu_3.id_class().getName() + " (" + this.id_throws.id_class() + "/" + Qn_1.id_class() + ")",
               (String)this.id_throws.id_class[79],
               var5,
               ((yX_2)this.id_throws.id_class[8]).id_catch(),
               ((yX_2)this.id_throws.id_class[8]).id_implements(),
               "P: " + ((Cy_1)this.id_throws.id_class[12]).id_protected() + ". T: " + ((gm_3)this.id_throws.id_class[56]).id_case(),
               ((gm_3)this.id_throws.id_class[56]).id_for(),
               "",
               String.format("Chunk-relative: %d %d %d", var7.b_() & 15, var7.c_() & 15, var7.d_() & 15)
            }
         );
      } else {
         cb_3 var8 = (cb_3)this.id_throws.id_class[57];
         PX var9 = var8.id_switch();
         rpr_3 var10 = var8.id_int(var9.id_throws());

         String var11 = switch (var10) {
            case NORTH -> "Towards negative Z";
            case SOUTH -> "Towards positive Z";
            case WEST -> "Towards negative X";
            case EAST -> "Towards positive X";
            default -> "Invalid";
         };
         rfj_3 var12 = new rfj_3(var7);
         if (!Objects.equals(this.id_implements, var12)) {
            this.id_implements = var12;
            this.id_class();
         }

         rYB var13 = this.id_implements();
         Object var14 = var13 instanceof rrEm_1 ? ((rrEm_1)var13).x() : LongSets.EMPTY_SET;
         ArrayList var15 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + rqu_3.id_class().getName()
                  + " ("
                  + this.id_throws.id_class()
                  + "/"
                  + Qn_1.id_class()
                  + ("release".equalsIgnoreCase(this.id_throws.Q()) ? "" : "/" + this.id_throws.Q())
                  + ")",
               (String)this.id_throws.id_class[79],
               var5,
               ((yX_2)this.id_throws.id_class[8]).id_catch(),
               ((yX_2)this.id_throws.id_class[8]).id_implements(),
               "P: " + ((Cy_1)this.id_throws.id_class[12]).id_protected() + ". T: " + ((gm_3)this.id_throws.id_class[56]).id_case(),
               ((gm_3)this.id_throws.id_class[56]).id_for()
            }
         );
         String var16 = this.id_private();
         if (var16 != null) {
            var15.add(var16);
         }

         var15.add(((gm_3)this.id_throws.id_class[56]).E().id_class() + " FC: " + var14.size());
         var15.add("");
         double var17 = this.id_throws.id_catch().rx();
         double var19 = this.id_throws.id_catch().re();
         double var21 = this.id_throws.id_catch().BO();
         if (var6) {
            var17 = 0.0;
            var19 = 0.0;
            var21 = 0.0;
         }

         var15.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", var17, var19, var21));
         var15.add(String.format("Block: %d %d %d", var7.b_(), var7.c_(), var7.d_()));
         var15.add(String.format("Chunk: %d %d %d in %d %d %d", var7.b_() & 15, var7.c_() & 15, var7.d_() & 15, var7.b_() >> 4, var7.c_() >> 4, var7.d_() >> 4));
         var15.add(
            String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", var10, var11, rfU_2.id_catch(var9.id_throws()), rfU_2.id_catch(var9.id_protected()))
         );
         if ((gm_3)this.id_throws.id_class[56] != null) {
            if (((gm_3)this.id_throws.id_class[56]).id_int(var7)) {
               roJ_2 var23 = this.id_extends();
               if (var23.id_catch()) {
                  var15.add("Waiting for chunk...");
               } else {
                  int var24 = ((gm_3)this.id_throws.id_class[56]).id_native().id_class().id_break(var7, 0);
                  int var25 = ((gm_3)this.id_throws.id_class[56]).id_class(rRo_1.SKY, var7);
                  int var26 = ((gm_3)this.id_throws.id_class[56]).id_class(rRo_1.BLOCK, var7);
                  var15.add("Client Light: " + var24 + " (" + var25 + " sky, " + var26 + " block)");
                  roJ_2 var27 = this.id_finally();
                  if (var27 != null) {
                     rrse_3 var28 = var13.id_goto().id_class();
                     var15.add("Server Light: (" + var28.id_class(rRo_1.SKY).id_class(var7) + " sky, " + var28.id_class(rRo_1.BLOCK).id_class(var7) + " block)");
                  } else {
                     var15.add("Server Light: (?? sky, ?? block)");
                  }

                  StringBuilder var38 = new StringBuilder("CH");

                  for (rKv_1 var32 : rKv_1.values()) {
                     if (var32.id_byte()) {
                        var38.append(" ").append(id_class.get(var32)).append(": ").append(var23.id_class(var32, var7.b_(), var7.d_()));
                     }
                  }

                  var15.add(var38.toString());
                  var38.setLength(0);
                  var38.append("SH");

                  for (rKv_1 var44 : rKv_1.values()) {
                     if (var44.id_protected()) {
                        var38.append(" ").append(id_class.get(var44)).append(": ");
                        if (var27 != null) {
                           var38.append(var27.id_class(var44, var7.b_(), var7.d_()));
                        } else {
                           var38.append("??");
                        }
                     }
                  }

                  var15.add(var38.toString());
                  if (var7.c_() >= 0 && var7.c_() < 256) {
                     var15.add(
                        "Biome: "
                           + ((gm_3)this.id_throws.id_class[56]).id_new().id_break(rVL.n).id_break(((gm_3)this.id_throws.id_class[56]).id_implements(var7))
                     );
                     long var40 = 0L;
                     float var43 = 0.0F;
                     if (var27 != null) {
                        var43 = var13.id_interface();
                        var40 = var27.id_this();
                     }

                     rRh_1 var45 = new rRh_1(var13.id_abstract(), var13.P(), var40, var43);
                     var15.add(
                        String.format(
                           Locale.ROOT,
                           "Local Difficulty: %.2f // %.2f (Day %d)",
                           var45.id_break(),
                           var45.id_byte(),
                           ((gm_3)this.id_throws.id_class[56]).P() / 24000L
                        )
                     );
                  }
               }
            } else {
               var15.add("Outside of world...");
            }
         } else {
            var15.add("Outside of world...");
         }

         rrEm_1 var33 = this.id_catch();
         if (var33 != null) {
            rrEg_1 var34 = var33.id_else().id_volatile();
            if (var34 != null) {
               Object2IntMap var36 = var34.id_break();
               int var37 = var34.id_class();
               var15.add(
                  "SC: "
                     + var37
                     + ", "
                     + Stream.of(aH_2.values())
                        .map(var1x -> Character.toUpperCase(var1x.id_break().charAt(0)) + ": " + var36.getInt(var1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               var15.add("SC: N/A");
            }
         }

         Vq_1 var35 = ((Hh_1)this.id_throws.id_class[16]).id_throws();
         if (var35 != null) {
            var15.add("Shader: " + var35.id_class());
         }

         var15.add(this.id_throws.c().id_case() + String.format(" (Mood %d%%)", Math.round(((cb_3)this.id_throws.id_class[57]).id_double() * 100.0F)));
         return var15;
      }
   }

   private roJ_2 id_finally() {
      if (this.id_extends == null) {
         rrEm_1 var1 = this.id_catch();
         if (var1 != null) {
            this.id_extends = var1.id_else()
               .id_class(this.id_implements.id_break, this.id_implements.id_byte, roN_2.id_volatile, false)
               .thenApply(var0 -> (roJ_2)var0.map(var0x -> (roJ_2)var0x, var0x -> null));
         }

         if (this.id_extends == null) {
            this.id_extends = CompletableFuture.completedFuture(this.id_extends());
         }
      }

      return this.id_extends.getNow(null);
   }

   private rrEm_1 id_catch() {
      rng_3 var1 = this.id_throws.id_this();
      return var1 != null ? var1.id_class(((gm_3)this.id_throws.id_class[56]).E()) : null;
   }

   private roJ_2 id_extends() {
      if (this.id_finally == null) {
         this.id_finally = ((gm_3)this.id_throws.id_class[56]).id_throws(this.id_implements.id_break, this.id_implements.id_byte);
      }

      return this.id_finally;
   }

   protected List<String> id_case() {
      long var1 = Runtime.getRuntime().maxMemory();
      long var3 = Runtime.getRuntime().totalMemory();
      long var5 = Runtime.getRuntime().freeMemory();
      long var7 = var3 - var5;
      ArrayList var9 = Lists.newArrayList(
         new String[]{
            String.format("Java: %s %dbit", System.getProperty("java.version"), this.id_throws.id_strictfp() ? 64 : 32),
            String.format("Mem: % 2d%% %03d/%03dMB", var7 * 100L / var1, id_class(var7), id_class(var1)),
            String.format("Allocated: % 2d%% %03dMB", var3 * 100L / var1, id_class(var3)),
            "",
            String.format("CPU: %s", Oh_1.id_break()),
            "",
            String.format("Display: %dx%d (%s)", QY.id_instanceof().id_else().id_extends(), QY.id_instanceof().id_else().id_native(), Oh_1.id_class()),
            Oh_1.id_byte(),
            Oh_1.id_protected()
         }
      );
      long var10 = rrWe_1.id_class();
      long var12 = rrWe_1.id_break();
      long var14 = rrWe_1.id_byte();
      String var16 = "Native: " + id_class(var10) + "/" + id_class(var12) + "+" + id_class(var14) + "MB";
      var9.add(3, var16);
      var9.set(4, "Allocation: " + rrWU.id_case() + "MB/s");
      if (rrxr_3.id_byte.id_byte()) {
         var9.add("");

         for (String var18 : (Set)rrxr_3.id_private(rrxr_3.id_byte, true, false)) {
            if (!var18.startsWith("Minecraft ")) {
               var9.add(var18);
            }
         }
      }

      boolean var23 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new();
      if (!this.id_throws.E()) {
         if (this.id_catch.id_byte() == rjM_2.BLOCK) {
            rfH_2 var24 = var23 ? rfH_2.id_protected : ((rff_3)this.id_catch).id_class();
            xc_3 var19 = ((gm_3)this.id_throws.id_class[56]).id_byte(var24);
            var9.add("");
            var9.add(rgF_2.UNDERLINE + "Targeted Block: " + var24.b_() + ", " + var24.c_() + ", " + var24.d_());
            var9.add(String.valueOf(rVL.id_strictfp.id_break(var19.id_break())));
            UnmodifiableIterator var20 = var19.id_goto().entrySet().iterator();

            while (var20.hasNext()) {
               Entry var21 = (Entry)var20.next();
               var9.add(this.id_class(var21));
            }

            Collection var29;
            if (rrxr_3.X.id_byte()) {
               var29 = (Collection)rrxr_3.id_private(var19.id_break(), rrxr_3.X);
            } else {
               var29 = this.id_throws.id_void().id_extends().id_class().id_class(var19.id_break());
            }

            for (rqO_2 var22 : var29) {
               var9.add("#" + var22);
            }
         }

         if (this.id_private.id_byte() == rjM_2.BLOCK) {
            rfH_2 var25 = var23 ? rfH_2.id_protected : ((rff_3)this.id_private).id_class();
            rXE var27 = ((gm_3)this.id_throws.id_class[56]).id_break(var25);
            var9.add("");
            var9.add(rgF_2.UNDERLINE + "Targeted Fluid: " + var25.b_() + ", " + var25.c_() + ", " + var25.d_());
            var9.add(String.valueOf(rVL.id_default.id_break(var27.id_class())));
            UnmodifiableIterator var30 = var27.id_goto().entrySet().iterator();

            while (var30.hasNext()) {
               Entry var33 = (Entry)var30.next();
               var9.add(this.id_class(var33));
            }

            Collection var31;
            if (rrxr_3.U.id_byte()) {
               var31 = (Collection)rrxr_3.id_private(var27.id_class(), rrxr_3.U);
            } else {
               var31 = this.id_throws.id_void().id_extends().id_byte().id_class(var27.id_class());
            }

            for (rqO_2 var35 : var31) {
               var9.add("#" + var35);
            }
         }

         an_3 var26 = (an_3)this.id_throws.id_class[63];
         if (var26 != null) {
            this.id_new.add((Float)var26.id_throws[15]);
            this.id_continue.add((Float)var26.id_throws[16]);
            var9.add("");
            var9.add(rgF_2.UNDERLINE + "Targeted Entity");
            var9.add(String.valueOf(rVL.id_transient.id_break(var26.BC())));
            if (rrxr_3.w.id_byte()) {
               Collection var28 = (Collection)rrxr_3.id_private(var26.BC(), rrxr_3.w);
               var28.forEach(var1x -> var9.add("#" + var1x));
            }
         } else {
            this.id_new.clear();
            this.id_continue.clear();
         }
      }

      return var9;
   }

   private rYB id_implements() {
      return (rYB)DataFixUtils.orElse(
         Optional.ofNullable(this.id_throws.id_this()).flatMap(var1 -> Optional.ofNullable(var1.id_class(((gm_3)this.id_throws.id_class[56]).E()))),
         (gm_3)this.id_throws.id_class[56]
      );
   }

   protected List<String> id_protected() {
      if ((String)this.id_throws.id_class[79] != this.id_native) {
         StringBuffer var1 = new StringBuffer((String)this.id_throws.id_class[79]);
         int var2 = rrbb_3.rN();
         int var3 = ((String)this.id_throws.id_class[79]).indexOf("T: ");
         if (var3 >= 0) {
            var1.insert(var3, "(" + var2 + " chunk updates) ");
         }

         int var4 = ((String)this.id_throws.id_class[79]).indexOf(" fps ");
         if (var4 >= 0) {
            var1.replace(0, var4 + 4, rrbb_3.rk());
         }

         if (rrbb_3.rq()) {
            var1.append(" sf");
         }

         if (rrbb_3.rB()) {
            var1.append(" fr");
         }

         if (rrbb_3.p()) {
            var1.append(" af");
         }

         if (rrbb_3.T()) {
            var1.append(" aa");
         }

         if (rrbb_3.ry()) {
            var1.append(" reg");
         }

         if (rrbb_3.rs()) {
            var1.append(" sh");
         }

         QY var10000 = this.id_throws;
         String var11 = var1.toString();
         var10000.id_class[79] = var11;
         this.id_native = (String)this.id_throws.id_class[79];
      }

      List var12 = this.id_throws();
      StringBuilder var13 = new StringBuilder();
      fJ_2 var14 = rrbb_3.rF();
      var13.append(", A: ");
      if (rrMh_1.id_class()) {
         var13.append(var14.id_private() + rrMd_1.id_throws());
         var13.append("/");
      }

      var13.append(var14.id_catch() + rrMd_1.id_protected());
      String var15 = var13.toString();

      for (int var5 = 0; var5 < var12.size(); var5++) {
         String var6 = (String)var12.get(var5);
         if (var6 != null && var6.startsWith("P: ")) {
            var6 = var6 + var15;
            var12.set(var5, var6);
            break;
         }
      }

      return var12;
   }

   private String id_private() {
      rrEm_1 var1 = this.id_catch();
      return var1 != null ? var1.id_for() : null;
   }
}
