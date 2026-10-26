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
   private static final Map<rKv_1, String> class_ = rqR_2.class_(new EnumMap<>(rKv_1.class), var0 -> {
      var0.put(rKv_1.WORLD_SURFACE_WG, "SW");
      var0.put(rKv_1.WORLD_SURFACE, "S");
      var0.put(rKv_1.OCEAN_FLOOR_WG, "OW");
      var0.put(rKv_1.OCEAN_FLOOR, "O");
      var0.put(rKv_1.MOTION_BLOCKING, "M");
      var0.put(rKv_1.MOTION_BLOCKING_NO_LEAVES, "ML");
   });
   private final QY throws_;
   private final cm_3 case_;
   private rjG_2 catch_;
   private rjG_2 private_;
   private rfj_3 implements_;
   private roJ_2 finally_;
   private CompletableFuture<roJ_2> extends_;
   private String native_ = null;
   private List<String> volatile_ = null;
   private List<String> final_ = null;
   private long package_ = 0L;
   private long int_ = 0L;
   private final List<Float> new_ = new ArrayList<>();
   private final List<Float> continue_ = new ArrayList<>();

   protected void byte_(Ml_1 var1) {
      List var2 = this.final_;
      if (var2 == null || System.currentTimeMillis() > this.int_) {
         var2 = this.case_();
         this.final_ = var2;
         this.int_ = System.currentTimeMillis() + 100L;
      }

      rrWn_1[] var3 = new rrWn_1[var2.size()];
      rrWC[] var4 = new rrWC[var2.size()];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         String var6 = (String)var2.get(var5);
         if (!Strings.isNullOrEmpty(var6)) {
            byte var7 = 9;
            int var8 = this.case_.break_(var6);
            int var9 = this.throws_.else_().super_() - 2 - var8;
            int var10 = 2 + var7 * var5;
            var4[var5] = new rrWC(var9 - 1, var10 - 1, var9 + var8 + 1, var10 + var7 - 1);
            var3[var5] = new rrWn_1(var9, var10);
         }
      }

      rrWl_1.class_(var1.byte_().class_(), var4, -1873784752);
      this.case_.class_(var2, var3, 14737632, var1.byte_().class_(), false, this.case_.class_());
   }

   public uV_2(QY var1) {
      this.throws_ = var1;
      this.case_ = (cm_3)var1.class_[15];
   }

   private static long class_(long var0) {
      return var0 / 1024L / 1024L;
   }

   private int class_(int var1, int var2, float var3) {
      int var4 = var1 >> 24 & 0xFF;
      int var5 = var1 >> 16 & 0xFF;
      int var6 = var1 >> 8 & 0xFF;
      int var7 = var1 & 0xFF;
      int var8 = var2 >> 24 & 0xFF;
      int var9 = var2 >> 16 & 0xFF;
      int var10 = var2 >> 8 & 0xFF;
      int var11 = var2 & 0xFF;
      int var12 = rfU_2.class_((int)rfU_2.catch_(var3, (float)var4, (float)var8), 0, 255);
      int var13 = rfU_2.class_((int)rfU_2.catch_(var3, (float)var5, (float)var9), 0, 255);
      int var14 = rfU_2.class_((int)rfU_2.catch_(var3, (float)var6, (float)var10), 0, 255);
      int var15 = rfU_2.class_((int)rfU_2.catch_(var3, (float)var7, (float)var11), 0, 255);
      return var12 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   private String class_(Entry<rCZ<?>, Comparable<?>> var1) {
      rCZ var2 = (rCZ)var1.getKey();
      Comparable var3 = (Comparable)var1.getValue();
      Object var4 = rqR_2.class_(var2, var3);
      if (Boolean.TRUE.equals(var3)) {
         var4 = rgF_2.GREEN + var4;
      } else if (Boolean.FALSE.equals(var3)) {
         var4 = rgF_2.RED + var4;
      }

      return var2.throws_() + ": " + var4;
   }

   public void class_() {
      this.extends_ = null;
      this.finally_ = null;
   }

   public void class_(Ml_1 var1) {
      RenderSystem.pushMatrix();
      an_3 var2 = this.throws_.catch_();
      this.catch_ = var2.break_(20.0, 0.0F, false);
      this.private_ = var2.break_(20.0, 0.0F, true);
      this.break_(var1);
      this.byte_(var1);
      RenderSystem.popMatrix();
      if (((Qw_1)this.throws_.class_[20]).o) {
         int var3 = this.throws_.else_().super_();
         this.class_(var1, this.throws_.k(), 0, var3 / 2, true);
         rng_3 var4 = this.throws_.this_();
         if (var4 != null) {
            this.class_(var1, var4.i(), var3 - Math.min(var3 / 2, 240), var3 / 2, false);
         }
      }
   }

   private void class_(Ml_1 var1, rpN_2 var2, int var3, int var4, boolean var5) {
      if (!var5) {
         int var6 = (int)(512.0 / this.throws_.else_().return_());
         var3 = Math.max(var3, var6);
         var4 = this.throws_.else_().super_() - var3;
         RenderSystem.disableDepthTest();
         int var7 = var2.class_();
         int var8 = var2.break_();
         long[] var9 = var2.byte_();
         int var10 = var3;
         int var11 = Math.max(0, var9.length - var4);
         int var12 = var9.length - var11;
         int var13 = var2.class_(var7 + var11);
         long var14 = 0L;
         int var16 = Integer.MAX_VALUE;
         int var17 = Integer.MIN_VALUE;

         for (int var18 = 0; var18 < var12; var18++) {
            int var19 = (int)(var9[var2.class_(var13 + var18)] / 1000000L);
            var16 = Math.min(var16, var19);
            var17 = Math.max(var17, var19);
            var14 += (long)var19;
         }

         int var30 = this.throws_.else_().this_();
         class_(var1, var3, var30 - 60, var3 + var12, var30, -1873784752);
         lD_2 var31 = yb_3.class_().byte_();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         var31.class_(7, ju_3.this_);

         for (rjV_2 var20 = rjo_3.class_().byte_(); var13 != var8; var13 = var2.class_(var13 + 1)) {
            int var21 = var2.class_(var9[var13], var5 ? 30 : 60, var5 ? 60 : 20);
            int var22 = var5 ? 100 : 60;
            int var23 = this.break_(rfU_2.class_(var21, 0, var22), 0, var22 / 2, var22);
            int var24 = var23 >> 24 & 0xFF;
            int var25 = var23 >> 16 & 0xFF;
            int var26 = var23 >> 8 & 0xFF;
            int var27 = var23 & 0xFF;
            var31.class_(var20, (float)(var10 + 1), (float)var30, 0.0F).break_(var25, var26, var27, var24).class_();
            var31.class_(var20, (float)(var10 + 1), (float)(var30 - var21 + 1), 0.0F).break_(var25, var26, var27, var24).class_();
            var31.class_(var20, (float)var10, (float)(var30 - var21 + 1), 0.0F).break_(var25, var26, var27, var24).class_();
            var31.class_(var20, (float)var10, (float)var30, 0.0F).break_(var25, var26, var27, var24).class_();
            var10++;
         }

         var31.finally_();
         yk_3.class_(var31);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         if (var5) {
            class_(var1, var3 + 1, var30 - 30 + 1, var3 + 14, var30 - 30 + 10, -1873784752);
            this.case_.break_(var1, "60 FPS", (float)(var3 + 2), (float)(var30 - 30 + 2), 14737632);
            this.class_(var1, var3, var3 + var12 - 1, var30 - 30, -1);
            class_(var1, var3 + 1, var30 - 60 + 1, var3 + 14, var30 - 60 + 10, -1873784752);
            this.case_.break_(var1, "30 FPS", (float)(var3 + 2), (float)(var30 - 60 + 2), 14737632);
            this.class_(var1, var3, var3 + var12 - 1, var30 - 60, -1);
         } else {
            class_(var1, var3 + 1, var30 - 60 + 1, var3 + 14, var30 - 60 + 10, -1873784752);
            this.case_.break_(var1, "20 TPS", (float)(var3 + 2), (float)(var30 - 60 + 2), 14737632);
            this.class_(var1, var3, var3 + var12 - 1, var30 - 60, -1);
         }

         this.class_(var1, var3, var3 + var12 - 1, var30 - 1, -1);
         this.break_(var1, var3, var30 - 60, var30, -1);
         this.break_(var1, var3 + var12 - 1, var30 - 60, var30, -1);
         if (var5 && ((Qw_1)this.throws_.class_[20]).protected_ > 0 && ((Qw_1)this.throws_.class_[20]).protected_ <= 250) {
            this.class_(var1, var3, var3 + var12 - 1, var30 - 1 - (int)(1800.0 / (double)((Qw_1)this.throws_.class_[20]).protected_), -16711681);
         }

         String var32 = var16 + " ms min";
         String var33 = var14 / (long)var12 + " ms avg";
         String var34 = var17 + " ms max";
         this.case_.class_(var1, var32, (float)(var3 + 2), (float)(var30 - 60 - 9), 14737632);
         this.case_.class_(var1, var33, (float)(var3 + var12 / 2 - this.case_.break_(var33) / 2), (float)(var30 - 60 - 9), 14737632);
         this.case_.class_(var1, var34, (float)(var3 + var12 - this.case_.break_(var34)), (float)(var30 - 60 - 9), 14737632);
         RenderSystem.enableDepthTest();
      }
   }

   protected void break_(Ml_1 var1) {
      List var2 = this.volatile_;
      if (var2 == null || System.currentTimeMillis() > this.package_) {
         var2 = this.protected_();
         var2.add("");
         boolean var3 = this.throws_.this_() != null;
         var2.add(
            "Debug: Pie [shift]: "
               + (((Qw_1)this.throws_.class_[20]).Y ? "visible" : "hidden")
               + (var3 ? " FPS + TPS" : " FPS")
               + " [alt]: "
               + (((Qw_1)this.throws_.class_[20]).o ? "visible" : "hidden")
         );
         var2.add("For help: press F3 + Q");
         this.volatile_ = var2;
         this.package_ = System.currentTimeMillis() + 100L;
      }

      rrWn_1[] var11 = new rrWn_1[var2.size()];
      rrWC[] var4 = new rrWC[var2.size()];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         String var6 = (String)var2.get(var5);
         if (!Strings.isNullOrEmpty(var6)) {
            byte var7 = 9;
            int var8 = this.case_.break_(var6);
            byte var9 = 2;
            int var10 = 2 + var7 * var5;
            var4[var5] = new rrWC(1, var10 - 1, 2 + var8 + 1, var10 + var7 - 1);
            var11[var5] = new rrWn_1(2, var10);
         }
      }

      rrWl_1.class_(var1.byte_().class_(), var4, -1873784752);
      this.case_.class_(var2, var11, 14737632, var1.byte_().class_(), false, this.case_.class_());
   }

   private int break_(int var1, int var2, int var3, int var4) {
      return var1 < var3 ? this.class_(-16711936, -256, (float)var1 / (float)var3) : this.class_(-256, -65536, (float)(var1 - var3) / (float)(var4 - var3));
   }

   protected List<String> throws_() {
      rng_3 var1 = this.throws_.this_();
      rud_3 var2 = this.throws_.void_().class_();
      float var3 = 0.0F;
      float var4 = 0.0F;
      String var5;
      if (var1 != null) {
         var5 = String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", var1.a(), var3, var4);
      } else {
         var5 = String.format("\"%s\" server, %.0f tx, %.0f rx", ((cb_3)this.throws_.class_[57]).short_(), var3, var4);
      }

      boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().new_();
      rfH_2 var7 = this.throws_.catch_().Bs();
      if (var6) {
         var7 = rfH_2.protected_;
      }

      if (this.throws_.E()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + rqu_3.class_().getName() + " (" + this.throws_.class_() + "/" + Qn_1.class_() + ")",
               (String)this.throws_.class_[79],
               var5,
               ((yX_2)this.throws_.class_[8]).catch_(),
               ((yX_2)this.throws_.class_[8]).implements_(),
               "P: " + ((Cy_1)this.throws_.class_[12]).protected_() + ". T: " + ((gm_3)this.throws_.class_[56]).case_(),
               ((gm_3)this.throws_.class_[56]).for_(),
               "",
               String.format("Chunk-relative: %d %d %d", var7.b_() & 15, var7.c_() & 15, var7.d_() & 15)
            }
         );
      } else {
         cb_3 var8 = (cb_3)this.throws_.class_[57];
         PX var9 = var8.switch_();
         rpr_3 var10 = var8.int_(var9.throws_());

         String var11 = switch (var10) {
            case NORTH -> "Towards negative Z";
            case SOUTH -> "Towards positive Z";
            case WEST -> "Towards negative X";
            case EAST -> "Towards positive X";
            default -> "Invalid";
         };
         rfj_3 var12 = new rfj_3(var7);
         if (!Objects.equals(this.implements_, var12)) {
            this.implements_ = var12;
            this.class_();
         }

         rYB var13 = this.implements_();
         Object var14 = var13 instanceof rrEm_1 ? ((rrEm_1)var13).x() : LongSets.EMPTY_SET;
         ArrayList var15 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + rqu_3.class_().getName()
                  + " ("
                  + this.throws_.class_()
                  + "/"
                  + Qn_1.class_()
                  + ("release".equalsIgnoreCase(this.throws_.Q()) ? "" : "/" + this.throws_.Q())
                  + ")",
               (String)this.throws_.class_[79],
               var5,
               ((yX_2)this.throws_.class_[8]).catch_(),
               ((yX_2)this.throws_.class_[8]).implements_(),
               "P: " + ((Cy_1)this.throws_.class_[12]).protected_() + ". T: " + ((gm_3)this.throws_.class_[56]).case_(),
               ((gm_3)this.throws_.class_[56]).for_()
            }
         );
         String var16 = this.private_();
         if (var16 != null) {
            var15.add(var16);
         }

         var15.add(((gm_3)this.throws_.class_[56]).E().class_() + " FC: " + var14.size());
         var15.add("");
         double var17 = this.throws_.catch_().rx();
         double var19 = this.throws_.catch_().re();
         double var21 = this.throws_.catch_().BO();
         if (var6) {
            var17 = 0.0;
            var19 = 0.0;
            var21 = 0.0;
         }

         var15.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", var17, var19, var21));
         var15.add(String.format("Block: %d %d %d", var7.b_(), var7.c_(), var7.d_()));
         var15.add(String.format("Chunk: %d %d %d in %d %d %d", var7.b_() & 15, var7.c_() & 15, var7.d_() & 15, var7.b_() >> 4, var7.c_() >> 4, var7.d_() >> 4));
         var15.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", var10, var11, rfU_2.catch_(var9.throws_()), rfU_2.catch_(var9.protected_())));
         if ((gm_3)this.throws_.class_[56] != null) {
            if (((gm_3)this.throws_.class_[56]).int_(var7)) {
               roJ_2 var23 = this.extends_();
               if (var23.catch_()) {
                  var15.add("Waiting for chunk...");
               } else {
                  int var24 = ((gm_3)this.throws_.class_[56]).native_().class_().break_(var7, 0);
                  int var25 = ((gm_3)this.throws_.class_[56]).class_(rRo_1.SKY, var7);
                  int var26 = ((gm_3)this.throws_.class_[56]).class_(rRo_1.BLOCK, var7);
                  var15.add("Client Light: " + var24 + " (" + var25 + " sky, " + var26 + " block)");
                  roJ_2 var27 = this.finally_();
                  if (var27 != null) {
                     rrse_3 var28 = var13.goto_().class_();
                     var15.add("Server Light: (" + var28.class_(rRo_1.SKY).class_(var7) + " sky, " + var28.class_(rRo_1.BLOCK).class_(var7) + " block)");
                  } else {
                     var15.add("Server Light: (?? sky, ?? block)");
                  }

                  StringBuilder var38 = new StringBuilder("CH");

                  for (rKv_1 var32 : rKv_1.values()) {
                     if (var32.byte_()) {
                        var38.append(" ").append(class_.get(var32)).append(": ").append(var23.class_(var32, var7.b_(), var7.d_()));
                     }
                  }

                  var15.add(var38.toString());
                  var38.setLength(0);
                  var38.append("SH");

                  for (rKv_1 var44 : rKv_1.values()) {
                     if (var44.protected_()) {
                        var38.append(" ").append(class_.get(var44)).append(": ");
                        if (var27 != null) {
                           var38.append(var27.class_(var44, var7.b_(), var7.d_()));
                        } else {
                           var38.append("??");
                        }
                     }
                  }

                  var15.add(var38.toString());
                  if (var7.c_() >= 0 && var7.c_() < 256) {
                     var15.add("Biome: " + ((gm_3)this.throws_.class_[56]).new_().break_(rVL.n).break_(((gm_3)this.throws_.class_[56]).implements_(var7)));
                     long var40 = 0L;
                     float var43 = 0.0F;
                     if (var27 != null) {
                        var43 = var13.interface_();
                        var40 = var27.this_();
                     }

                     rRh_1 var45 = new rRh_1(var13.abstract_(), var13.P(), var40, var43);
                     var15.add(
                        String.format(
                           Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", var45.break_(), var45.byte_(), ((gm_3)this.throws_.class_[56]).P() / 24000L
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

         rrEm_1 var33 = this.catch_();
         if (var33 != null) {
            rrEg_1 var34 = var33.else_().volatile_();
            if (var34 != null) {
               Object2IntMap var36 = var34.break_();
               int var37 = var34.class_();
               var15.add(
                  "SC: "
                     + var37
                     + ", "
                     + Stream.of(aH_2.values())
                        .map(var1x -> Character.toUpperCase(var1x.break_().charAt(0)) + ": " + var36.getInt(var1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               var15.add("SC: N/A");
            }
         }

         Vq_1 var35 = ((Hh_1)this.throws_.class_[16]).throws_();
         if (var35 != null) {
            var15.add("Shader: " + var35.class_());
         }

         var15.add(this.throws_.c().case_() + String.format(" (Mood %d%%)", Math.round(((cb_3)this.throws_.class_[57]).double_() * 100.0F)));
         return var15;
      }
   }

   private roJ_2 finally_() {
      if (this.extends_ == null) {
         rrEm_1 var1 = this.catch_();
         if (var1 != null) {
            this.extends_ = var1.else_()
               .class_(this.implements_.break_, this.implements_.byte_, roN_2.volatile_, false)
               .thenApply(var0 -> (roJ_2)var0.map(var0x -> (roJ_2)var0x, var0x -> null));
         }

         if (this.extends_ == null) {
            this.extends_ = CompletableFuture.completedFuture(this.extends_());
         }
      }

      return this.extends_.getNow(null);
   }

   private rrEm_1 catch_() {
      rng_3 var1 = this.throws_.this_();
      return var1 != null ? var1.class_(((gm_3)this.throws_.class_[56]).E()) : null;
   }

   private roJ_2 extends_() {
      if (this.finally_ == null) {
         this.finally_ = ((gm_3)this.throws_.class_[56]).throws_(this.implements_.break_, this.implements_.byte_);
      }

      return this.finally_;
   }

   protected List<String> case_() {
      long var1 = Runtime.getRuntime().maxMemory();
      long var3 = Runtime.getRuntime().totalMemory();
      long var5 = Runtime.getRuntime().freeMemory();
      long var7 = var3 - var5;
      ArrayList var9 = Lists.newArrayList(
         new String[]{
            String.format("Java: %s %dbit", System.getProperty("java.version"), this.throws_.strictfp_() ? 64 : 32),
            String.format("Mem: % 2d%% %03d/%03dMB", var7 * 100L / var1, class_(var7), class_(var1)),
            String.format("Allocated: % 2d%% %03dMB", var3 * 100L / var1, class_(var3)),
            "",
            String.format("CPU: %s", Oh_1.break_()),
            "",
            String.format("Display: %dx%d (%s)", QY.instanceof_().else_().extends_(), QY.instanceof_().else_().native_(), Oh_1.class_()),
            Oh_1.byte_(),
            Oh_1.protected_()
         }
      );
      long var10 = rrWe_1.class_();
      long var12 = rrWe_1.break_();
      long var14 = rrWe_1.byte_();
      String var16 = "Native: " + class_(var10) + "/" + class_(var12) + "+" + class_(var14) + "MB";
      var9.add(3, var16);
      var9.set(4, "Allocation: " + rrWU.case_() + "MB/s");
      if (rrxr_3.byte_.byte_()) {
         var9.add("");

         for (String var18 : (Set)rrxr_3.private_(rrxr_3.byte_, true, false)) {
            if (!var18.startsWith("Minecraft ")) {
               var9.add(var18);
            }
         }
      }

      boolean var23 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().new_();
      if (!this.throws_.E()) {
         if (this.catch_.byte_() == rjM_2.BLOCK) {
            rfH_2 var24 = var23 ? rfH_2.protected_ : ((rff_3)this.catch_).class_();
            xc_3 var19 = ((gm_3)this.throws_.class_[56]).byte_(var24);
            var9.add("");
            var9.add(rgF_2.UNDERLINE + "Targeted Block: " + var24.b_() + ", " + var24.c_() + ", " + var24.d_());
            var9.add(String.valueOf(rVL.strictfp_.break_(var19.break_())));
            UnmodifiableIterator var20 = var19.goto_().entrySet().iterator();

            while (var20.hasNext()) {
               Entry var21 = (Entry)var20.next();
               var9.add(this.class_(var21));
            }

            Collection var29;
            if (rrxr_3.X.byte_()) {
               var29 = (Collection)rrxr_3.private_(var19.break_(), rrxr_3.X);
            } else {
               var29 = this.throws_.void_().extends_().class_().class_(var19.break_());
            }

            for (rqO_2 var22 : var29) {
               var9.add("#" + var22);
            }
         }

         if (this.private_.byte_() == rjM_2.BLOCK) {
            rfH_2 var25 = var23 ? rfH_2.protected_ : ((rff_3)this.private_).class_();
            rXE var27 = ((gm_3)this.throws_.class_[56]).break_(var25);
            var9.add("");
            var9.add(rgF_2.UNDERLINE + "Targeted Fluid: " + var25.b_() + ", " + var25.c_() + ", " + var25.d_());
            var9.add(String.valueOf(rVL.default_.break_(var27.class_())));
            UnmodifiableIterator var30 = var27.goto_().entrySet().iterator();

            while (var30.hasNext()) {
               Entry var33 = (Entry)var30.next();
               var9.add(this.class_(var33));
            }

            Collection var31;
            if (rrxr_3.U.byte_()) {
               var31 = (Collection)rrxr_3.private_(var27.class_(), rrxr_3.U);
            } else {
               var31 = this.throws_.void_().extends_().byte_().class_(var27.class_());
            }

            for (rqO_2 var35 : var31) {
               var9.add("#" + var35);
            }
         }

         an_3 var26 = (an_3)this.throws_.class_[63];
         if (var26 != null) {
            this.new_.add((Float)var26.throws_[15]);
            this.continue_.add((Float)var26.throws_[16]);
            var9.add("");
            var9.add(rgF_2.UNDERLINE + "Targeted Entity");
            var9.add(String.valueOf(rVL.transient_.break_(var26.BC())));
            if (rrxr_3.w.byte_()) {
               Collection var28 = (Collection)rrxr_3.private_(var26.BC(), rrxr_3.w);
               var28.forEach(var1x -> var9.add("#" + var1x));
            }
         } else {
            this.new_.clear();
            this.continue_.clear();
         }
      }

      return var9;
   }

   private rYB implements_() {
      return (rYB)DataFixUtils.orElse(
         Optional.ofNullable(this.throws_.this_()).flatMap(var1 -> Optional.ofNullable(var1.class_(((gm_3)this.throws_.class_[56]).E()))),
         (gm_3)this.throws_.class_[56]
      );
   }

   protected List<String> protected_() {
      if ((String)this.throws_.class_[79] != this.native_) {
         StringBuffer var1 = new StringBuffer((String)this.throws_.class_[79]);
         int var2 = rrbb_3.rN();
         int var3 = ((String)this.throws_.class_[79]).indexOf("T: ");
         if (var3 >= 0) {
            var1.insert(var3, "(" + var2 + " chunk updates) ");
         }

         int var4 = ((String)this.throws_.class_[79]).indexOf(" fps ");
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

         QY var10000 = this.throws_;
         String var11 = var1.toString();
         var10000.class_[79] = var11;
         this.native_ = (String)this.throws_.class_[79];
      }

      List var12 = this.throws_();
      StringBuilder var13 = new StringBuilder();
      fJ_2 var14 = rrbb_3.rF();
      var13.append(", A: ");
      if (rrMh_1.class_()) {
         var13.append(var14.private_() + rrMd_1.throws_());
         var13.append("/");
      }

      var13.append(var14.catch_() + rrMd_1.protected_());
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

   private String private_() {
      rrEm_1 var1 = this.catch_();
      return var1 != null ? var1.for_() : null;
   }
}
