package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.awt.Dimension;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fJ_2 extends ff_3 implements fW_2 {
   private static final Logger id_finally = LogManager.getLogger();
   @Deprecated
   public static final rqO_2 id_class = rJT.id_class;
   @Deprecated
   public static final rqO_2 id_break = new rqO_2("textures/atlas/particles.png");
   private final List<fj_3> id_extends = Lists.newArrayList();
   private final Set<rqO_2> id_native = Sets.newHashSet();
   private final Map<rqO_2, fj_3> id_volatile = Maps.newHashMap();
   private final rqO_2 id_final;
   private final int id_package;
   private Map<rqO_2, fj_3> id_int = new LinkedHashMap<>();
   private Map<rqO_2, fj_3> id_new = new LinkedHashMap<>();
   private fj_3[] id_continue = null;
   private int id_super = -1;
   private int id_this = -1;
   private int id_else = -1;
   private double id_synchronized = -1.0;
   private double id_return = -1.0;
   private rrWd_1 id_public = new rrWd_1(0);
   public int id_byte = 0;
   public int id_protected = 0;
   public int id_throws = 0;
   private int id_goto;
   private int id_while;
   private boolean id_try;
   private boolean id_instanceof;
   private boolean id_throw;
   private rrdr_1 id_interface;

   private boolean id_byte(String var1) {
      String var2 = var1.toLowerCase();
      return var2.startsWith("optifine/");
   }

   public fj_3 id_byte(rqO_2 var1) {
      return this.id_int.get(var1);
   }

   @Override
   public void id_byte() {
      for (fj_3 var2 : this.id_volatile.values()) {
         var2.close();
      }

      if (this.id_throw) {
         for (fj_3 var4 : this.id_volatile.values()) {
            var4.id_else();
            if (var4.id_extends != null) {
               var4.id_extends.id_else();
            }

            if (var4.id_native != null) {
               var4.id_native.id_else();
            }
         }
      }

      this.id_volatile.clear();
      this.id_extends.clear();
   }

   private static int id_byte(fj_3 var0) {
      fj_3 var1 = var0.id_catch;
      if (var1 != null) {
         var0.id_this();
         var1.id_package();
         if (var1.id_super()) {
            return 1;
         }
      }

      return 0;
   }

   public boolean id_int() {
      return this.id_break(rrdn_1.SPECULAR);
   }

   public fJ_2(rqO_2 var1) {
      this.id_final = var1;
      this.id_package = RenderSystem.maxSupportedTextureSize();
      this.id_try = var1.equals(id_class);
      this.id_instanceof = rrbb_3.rs();
      this.id_throw = rrbb_3.w();
      if (this.id_try) {
         rrbb_3.id_class(this);
      }
   }

   @Override
   public String toString() {
      return this.id_final + "";
   }

   private static fV_2 id_class(fV_2 var0, int var1) {
      if (var0.id_break() >= var1 && var0.id_byte() >= var1) {
         return var0;
      } else {
         int var2 = Math.max(var0.id_break(), var1);
         int var3 = Math.max(var0.id_byte(), var1);
         return new fV_2(var0.id_class(), var2, var3, var0.id_protected());
      }
   }

   public fj_3 id_class(double var1, double var3) {
      if (this.id_continue == null) {
         return null;
      } else {
         int var5 = (int)(var1 / this.id_synchronized);
         int var6 = (int)(var3 / this.id_return);
         int var7 = var6 * this.id_this + var5;
         return var7 >= 0 && var7 <= this.id_continue.length ? this.id_continue[var7] : null;
      }
   }

   private void id_class(int var1, int var2) {
      this.id_this = -1;
      this.id_else = -1;
      this.id_continue = null;
      if (this.id_super > 0) {
         this.id_this = var1 / this.id_super;
         this.id_else = var2 / this.id_super;
         this.id_continue = new fj_3[this.id_this * this.id_else];
         this.id_synchronized = 1.0 / (double)this.id_this;
         this.id_return = 1.0 / (double)this.id_else;

         for (fj_3 var4 : this.id_volatile.values()) {
            double var5 = 0.5 / (double)var1;
            double var7 = 0.5 / (double)var2;
            double var9 = (double)Math.min(var4.id_case(), var4.id_catch()) + var5;
            double var11 = (double)Math.min(var4.id_private(), var4.id_implements()) + var7;
            double var13 = (double)Math.max(var4.id_case(), var4.id_catch()) - var5;
            double var15 = (double)Math.max(var4.id_private(), var4.id_implements()) - var7;
            int var17 = (int)(var9 / this.id_synchronized);
            int var18 = (int)(var11 / this.id_return);
            int var19 = (int)(var13 / this.id_synchronized);
            int var20 = (int)(var15 / this.id_return);

            for (int var21 = var17; var21 <= var19; var21++) {
               if (var21 >= 0 && var21 < this.id_this) {
                  for (int var22 = var18; var22 <= var20; var22++) {
                     if (var22 >= 0 && var22 < this.id_this) {
                        int var23 = var22 * this.id_this + var21;
                        this.id_continue[var23] = var4;
                     } else {
                        rrbb_3.id_protected("Invalid grid V: " + var22 + ", icon: " + var4.id_finally());
                     }
                  }
               } else {
                  rrbb_3.id_protected("Invalid grid U: " + var21 + ", icon: " + var4.id_finally());
               }
            }
         }
      }
   }

   public fx_3 id_class(rAL var1, Stream<rqO_2> var2, int var3) {
      this.id_try = this.id_final.equals(id_class);
      this.id_instanceof = rrbb_3.rs();
      this.id_throw = rrbb_3.w();
      this.id_interface = rrdr_1.id_byte();
      int var4 = var3;
      this.id_int.clear();
      this.id_new.clear();
      this.id_public.id_break();
      Set var5 = var2.peek(var0 -> {
         if (var0 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
         }
      }).collect(Collectors.toSet());
      rrbb_3.id_byte("Multitexture: " + rrbb_3.w());
      rrzJ_2.id_class(this);
      var5.addAll(this.id_int.keySet());
      Set var6 = id_class(var5, this.id_int.keySet());
      rrbY_2.id_class(this, var6);
      var5.addAll(this.id_int.keySet());
      if (var3 >= 4) {
         var4 = this.id_class(var5, var1);
         rrbb_3.id_case("Mipmap levels: " + var4);
      }

      int var7 = rrzJ_2.id_case();
      fT_2 var8 = new fT_2(var7, var7, var3);
      int var9 = Integer.MAX_VALUE;
      int var10 = id_class(var4);
      this.id_super = var10;
      int var11 = 1 << var3;
      rrxr_3.id_class(rrxr_3.rt, this, var5);

      for (fV_2 var13 : this.id_class(var1, var5)) {
         int var14 = var13.id_break();
         int var15 = var13.id_byte();
         if (var14 >= 1 && var15 >= 1) {
            if (var14 < var10 || var4 > 0) {
               int var16 = var4 > 0 ? rrzJ_2.id_class(var14, var10) : rrzJ_2.id_break(var14, var10);
               if (var16 != var14) {
                  if (!rrzJ_2.id_throws(var14)) {
                     rrbb_3.id_case("Scaled non power of 2: " + var13.id_class() + ", " + var14 + " -> " + var16);
                  } else {
                     rrbb_3.id_case("Scaled too small texture: " + var13.id_class() + ", " + var14 + " -> " + var16);
                  }

                  int var17 = var15 * var16 / var14;
                  var13.id_class(var16);
                  var13.id_break(var17);
                  var13.id_class((double)var16 * 1.0 / (double)var14);
               }
            }

            var9 = Math.min(var9, Math.min(var13.id_break(), var13.id_byte()));
            int var24 = Math.min(Integer.lowestOneBit(var13.id_break()), Integer.lowestOneBit(var13.id_byte()));
            if (var24 < var11) {
               id_finally.warn(
                  "Texture {} with size {}x{} limits mip level from {} to {}",
                  var13.id_class(),
                  var13.id_break(),
                  var13.id_byte(),
                  rfU_2.id_case(var11),
                  rfU_2.id_case(var24)
               );
               var11 = var24;
            }

            var8.id_class(var13);
         } else {
            rrbb_3.id_protected("Invalid sprite size: " + var13.id_class());
         }
      }

      int var20 = Math.min(var9, var11);
      int var21 = rfU_2.id_case(var20);
      if (var21 < 0) {
         var21 = 0;
      }

      int var22;
      if (var21 < var3) {
         id_finally.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.id_final, var3, var21, var20);
         var22 = var21;
      } else {
         var22 = var3;
      }

      fV_2 var23 = id_class(fQ_2.id_break(), var10);
      var8.id_class(var23);

      try {
         var8.id_byte();
      } catch (yG_2 var19) {
         KY var26 = KY.id_class(var19, "Stitching");
         Ko_1 var18 = var26.id_class("Stitcher");
         var18.id_class(
            "Sprites",
            var19.id_class()
               .stream()
               .map(var0 -> String.format("%s[%dx%d]", var0.id_class(), var0.id_break(), var0.id_byte()))
               .collect(Collectors.joining(","))
         );
         var18.id_class("Max Texture Size", var7);
         throw new KU(var26);
      }

      List var25 = this.id_class(var1, var8, var22);
      return new fx_3(var5, var8.id_class(), var8.id_break(), var22, var25);
   }

   private int id_class(Set<rqO_2> var1, rAL var2) {
      int var3 = this.id_class(var1, var2, 20);
      if (var3 < 16) {
         var3 = 16;
      }

      var3 = rfU_2.id_byte(var3);
      if (var3 > 16) {
         rrbb_3.id_case("Sprite size: " + var3);
      }

      int var4 = rfU_2.id_case(var3);
      if (var4 < 4) {
         var4 = 4;
      }

      return var4;
   }

   private int id_class(Set<rqO_2> var1, rAL var2, int var3) {
      HashMap var4 = new HashMap();

      for (rqO_2 var6 : var1) {
         rqO_2 var7 = this.id_class(var6);

         try {
            rAF var8 = var2.id_class(var7);
            if (var8 != null) {
               InputStream var9 = var8.id_break();
               if (var9 != null) {
                  Dimension var10 = rrzJ_2.id_class(var9, "png");
                  var9.close();
                  if (var10 != null) {
                     int var11 = var10.width;
                     int var12 = rfU_2.id_byte(var11);
                     if (!var4.containsKey(var12)) {
                        var4.put(var12, 1);
                     } else {
                        int var13 = (Integer)var4.get(var12);
                        var4.put(var12, var13 + 1);
                     }
                  }
               }
            }
         } catch (Exception var14) {
         }
      }

      int var15 = 0;
      Set var16 = var4.keySet();
      TreeSet var17 = new TreeSet(var16);

      for (int var20 : var17) {
         int var22 = (Integer)var4.get(var20);
         var15 += var22;
      }

      int var19 = 16;
      int var21 = 0;
      int var23 = var15 * var3 / 100;

      for (int var25 : var17) {
         int var26 = (Integer)var4.get(var25);
         var21 += var26;
         if (var25 > var19) {
            var19 = var25;
         }

         if (var21 > var23) {
            return var19;
         }
      }

      return var19;
   }

   public void id_class(fx_3 var1) {
      this.id_native.clear();
      this.id_native.addAll(var1.id_class);
      id_finally.info("Created: {}x{}x{} {}-atlas", var1.id_break, var1.id_byte, var1.id_protected, this.id_final);
      fo_3.id_class(this.id_new(), var1.id_protected, var1.id_break, var1.id_byte);
      this.id_byte = var1.id_break;
      this.id_protected = var1.id_byte;
      this.id_throws = var1.id_protected;
      if (this.id_instanceof) {
         rrdA.id_class(var1.id_protected, var1.id_break, var1.id_byte, this);
      }

      this.id_byte();

      for (fj_3 var3 : var1.id_throws) {
         this.id_volatile.put(var3.id_finally(), var3);

         try {
            var3.id_volatile();
         } catch (Throwable var7) {
            KY var5 = KY.id_class(var7, "Stitching texture atlas");
            Ko_1 var6 = var5.id_class("Texture being stitched together");
            var6.id_class("Atlas path", this.id_final);
            var6.id_class("Sprite", var3);
            throw new KU(var5);
         }

         if (var3.id_int()) {
            var3.id_class(this.id_extends.size());
            this.id_extends.add(var3);
         }
      }

      rrzJ_2.id_break(this);
      rrbb_3.id_case("Animated sprites: " + this.id_extends.size());
      if (rrbb_3.w()) {
         for (fj_3 var10 : var1.id_throws) {
            id_break(var10);
            if (var10.id_extends != null) {
               id_break(var10.id_extends);
            }

            if (var10.id_native != null) {
               id_break(var10.id_native);
            }
         }

         MT.id_super(this.id_new());
      }

      if (rrbb_3.rs()) {
         List var9 = var1.id_throws;
         if (rrdZ.SV) {
            MT.id_super(this.id_this().id_break);

            for (fj_3 var4 : var9) {
               fj_3 var14 = var4.id_extends;
               if (var14 != null) {
                  var14.id_volatile();
               }
            }
         }

         if (rrdZ.Sg) {
            MT.id_super(this.id_this().id_byte);

            for (fj_3 var13 : var9) {
               fj_3 var15 = var13.id_native;
               if (var15 != null) {
                  var15.id_volatile();
               }
            }
         }

         MT.id_super(this.id_new());
      }

      rrxr_3.id_class(rrxr_3.rw, this);
      this.id_class(var1.id_break, var1.id_byte);
      if (rrbb_3.id_class(System.getProperty("saveTextureMap"), "true")) {
         rrbb_3.id_byte("Exporting texture map: " + this.id_final);
         rrzJ_2.id_class("debug/" + this.id_final.id_break().replaceAll("/", "_"), this.id_new(), var1.id_protected, var1.id_break, var1.id_byte);
         if (this.id_instanceof) {
            if (rrdZ.SV) {
               rrzJ_2.id_class(
                  "debug/" + this.id_final.id_break().replaceAll("/", "_").replace(".png", "_n.png"),
                  this.id_implements.id_break,
                  var1.id_protected,
                  var1.id_break,
                  var1.id_byte
               );
            }

            if (rrdZ.Sg) {
               rrzJ_2.id_class(
                  "debug/" + this.id_final.id_break().replaceAll("/", "_").replace(".png", "_s.png"),
                  this.id_implements.id_byte,
                  var1.id_protected,
                  var1.id_break,
                  var1.id_byte
               );
            }

            MT.id_super(this.id_new());
         }
      }
   }

   private static int id_class(int var0) {
      int var1 = 1 << var0;
      if (var1 < 8) {
         var1 = 8;
      }

      return var1;
   }

   public rrko_1 id_class(rrdn_1 var1) {
      if (var1 == null) {
         return null;
      } else {
         return (rrko_1)(this.id_interface != null ? this.id_interface.id_class(var1) : new rrkg_1());
      }
   }

   private static <T> Set<T> id_class(Set<T> var0, Set<T> var1) {
      HashSet var2 = new HashSet();
      var2.addAll(var0);
      var2.addAll(var1);
      return var2;
   }

   private Collection<fV_2> id_class(rAL var1, Set<rqO_2> var2) {
      ArrayList var3 = Lists.newArrayList();
      ConcurrentLinkedQueue var4 = new ConcurrentLinkedQueue();

      for (rqO_2 var6 : var2) {
         if (!fQ_2.id_class().equals(var6)) {
            var3.add(CompletableFuture.runAsync(() -> {
               rqO_2 var4x = this.id_class(var6);

               fV_2 var5;
               try (rAF var6x = var1.id_class(var4x)) {
                  fF_2 var7 = new fF_2(var6x.toString(), var6x.id_break());
                  ji_3 var8 = var6x.id_class(ji_3.id_class);
                  if (var8 == null) {
                     var8 = ji_3.id_break;
                  }

                  Pair var9 = var8.id_class(var7.id_class, var7.id_break);
                  var5 = new fV_2(var6, (Integer)var9.getFirst(), (Integer)var9.getSecond(), var8);
               } catch (RuntimeException var12) {
                  id_finally.error("Unable to parse metadata from {} : {}", var4x, var12);
                  this.id_catch(var6);
                  return;
               } catch (IOException var13) {
                  id_finally.error("Using missing texture, unable to load {} : {}", var4x, var13);
                  this.id_catch(var6);
                  return;
               }

               var4.add(var5);
            }, rqR_2.id_case()));
         }
      }

      CompletableFuture.allOf(var3.toArray(new CompletableFuture[0])).join();
      return var4;
   }

   private fj_3 id_class(rAL var1, fV_2 var2, int var3, int var4, int var5, int var6, int var7) {
      rqO_2 var8 = this.id_class(var2.id_class());

      try {
         fj_3 var12;
         try (rAF var9 = var1.id_class(var8)) {
            fN_2 var10 = fN_2.id_class(var9.id_break());
            fj_3 var11 = new fj_3(this, var2, var5, var3, var4, var6, var7, var10);
            var11.id_class(var1);
            var12 = var11;
         }

         return var12;
      } catch (RuntimeException var15) {
         id_finally.error("Unable to parse metadata from {}", var8, var15);
         return null;
      } catch (IOException var16) {
         id_finally.error("Using missing texture, unable to load {}", var8, var16);
         return null;
      }
   }

   public fj_3 id_class(String var1) {
      rqO_2 var2 = new rqO_2(var1);
      return this.id_byte(var2);
   }

   private List<fj_3> id_class(rAL var1, fT_2 var2, int var3) {
      ConcurrentLinkedQueue var4 = new ConcurrentLinkedQueue();
      ArrayList var5 = Lists.newArrayList();
      var2.id_class((var5x, var6, var7, var8, var9) -> {
         if (var5x.id_class().equals(fQ_2.id_break().id_class())) {
            fQ_2 var10 = new fQ_2(this, var5x, var3, var6, var7, var8, var9);
            var10.id_class(var1);
            var4.add(var10);
         } else {
            var5.add(CompletableFuture.runAsync(() -> {
               fj_3 var9x = this.id_class(var1, var5x, var6, var7, var3, var8, var9);
               if (var9x != null) {
                  var4.add(var9x);
               }
            }, rqR_2.id_case()));
         }
      });
      CompletableFuture.allOf(var5.toArray(new CompletableFuture[0])).join();
      return Lists.newArrayList(var4);
   }

   @Override
   public void id_class() {
      boolean var1 = false;
      boolean var2 = false;
      if (!this.id_extends.isEmpty()) {
         this.id_super();
      }

      int var3 = 0;

      for (fj_3 var5 : this.id_extends) {
         if (this.id_class(var5)) {
            var5.id_package();
            if (var5.id_super()) {
               var3++;
            }

            if (var5.id_extends != null) {
               var1 = true;
            }

            if (var5.id_native != null) {
               var2 = true;
            }
         }
      }

      if (rrbb_3.rs()) {
         if (var1) {
            MT.id_super(this.id_this().id_break);

            for (fj_3 var10 : this.id_extends) {
               if (var10.id_extends != null && this.id_class(var10) && var10.id_super()) {
                  var10.id_extends.id_package();
                  if (var10.id_extends.id_super()) {
                     var3++;
                  }
               }
            }
         }

         if (var2) {
            MT.id_super(this.id_this().id_byte);

            for (fj_3 var11 : this.id_extends) {
               if (var11.id_native != null && this.id_class(var11) && var11.id_super()) {
                  var11.id_native.id_package();
                  if (var11.id_native.id_super()) {
                     var3++;
                  }
               }
            }
         }

         if (var1 || var2) {
            MT.id_super(this.id_new());
         }
      }

      if (rrbb_3.w()) {
         for (fj_3 var12 : this.id_extends) {
            if (this.id_class(var12) && var12.id_super()) {
               var3 += id_byte(var12);
               if (var12.id_extends != null) {
                  var3 += id_byte(var12.id_extends);
               }

               if (var12.id_native != null) {
                  var3 += id_byte(var12.id_native);
               }
            }
         }

         MT.id_super(this.id_new());
      }

      if (this.id_try) {
         int var9 = ((yX_2)rrbb_3.X().id_class[8]).id_public();
         if (var9 != this.id_while) {
            this.id_goto = var3;
            this.id_while = var9;
         }

         if (rrMh_1.id_class()) {
            rrMh_1.id_class(this);
         }
      }
   }

   private boolean id_class(fj_3 var1) {
      if (!this.id_try) {
         return true;
      } else if (var1 == rrzJ_2.id_private || var1 == rrzJ_2.id_implements) {
         return rrbb_3.id_default();
      } else if (var1 == rrzJ_2.id_finally || var1 == rrzJ_2.id_extends) {
         return rrbb_3.id_boolean();
      } else if (var1 == rrzJ_2.id_native || var1 == rrzJ_2.id_volatile) {
         return rrbb_3.id_for();
      } else if (var1 == rrzJ_2.id_final || var1 == rrzJ_2.id_package) {
         return rrbb_3.id_for();
      } else if (var1 == rrzJ_2.id_int || var1 == rrzJ_2.id_new) {
         return rrbb_3.id_for();
      } else if (var1 != rrzJ_2.id_continue && var1 != rrzJ_2.id_super) {
         return var1 == rrzJ_2.id_this ? rrbb_3.id_strictfp() : rrbb_3.j();
      } else {
         return rrbb_3.id_for();
      }
   }

   public rqO_2 id_class(rqO_2 var1) {
      return this.id_case(var1)
         ? new rqO_2(var1.id_byte(), var1.id_break() + ".png")
         : new rqO_2(var1.id_byte(), String.format("textures/%s%s", var1.id_break(), ".png"));
   }

   public boolean id_break(rrdn_1 var1) {
      if (var1 == null) {
         return true;
      } else {
         return this.id_interface != null ? this.id_interface.id_break(var1) : true;
      }
   }

   public void id_break(fx_3 var1) {
      this.id_class(false, var1.id_protected > 0);
   }

   private static void id_break(fj_3 var0) {
      fj_3 var1 = var0.id_catch;
      if (var1 != null) {
         var1.id_class(var0.id_continue());
         var0.id_this();

         try {
            var1.id_volatile();
         } catch (Exception var3) {
            rrbb_3.id_byte("Error uploading sprite single: " + var1 + ", parent: " + var0);
            var3.printStackTrace();
         }
      }
   }

   public fj_3 id_break(rqO_2 var1) {
      fj_3 var2 = this.id_volatile.get(var1);
      return var2 == null ? this.id_volatile.get(fQ_2.id_class()) : var2;
   }

   @Override
   public void id_break() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(this::id_class);
      } else {
         this.id_class();
      }
   }

   public fj_3 id_break(String var1) {
      rqO_2 var2 = new rqO_2(var1);
      return this.id_protected(var2);
   }

   public fj_3 id_throws(rqO_2 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Location cannot be null!");
      } else {
         fj_3 var2 = this.id_int.get(var1);
         if (var2 != null) {
            return var2;
         } else {
            this.id_native.add(var1);
            var2 = new fj_3(var1);
            this.id_int.put(var1, var2);
            var2.id_class(this.id_public);
            return var2;
         }
      }
   }

   public int id_throws() {
      return this.id_public.id_byte();
   }

   public boolean id_finally() {
      return this.id_try;
   }

   private void id_catch(rqO_2 var1) {
      fj_3 var2 = this.id_int.get(var1);
      if (var2 != null) {
         this.id_new.put(var1, var2);
      }
   }

   public int id_catch() {
      return this.id_extends.size();
   }

   public rrWd_1 id_extends() {
      return this.id_public;
   }

   public boolean id_case() {
      int var1 = MT.S();
      int var2 = this.id_new();
      return var1 == var2;
   }

   private boolean id_case(rqO_2 var1) {
      String var2 = var1.id_break();
      return this.id_byte(var2);
   }

   public Collection<fj_3> id_implements() {
      return Collections.unmodifiableCollection(this.id_int.values());
   }

   public boolean id_package() {
      return this.id_break(rrdn_1.NORMAL);
   }

   public fj_3 id_protected(rqO_2 var1) {
      return this.id_volatile.get(var1);
   }

   public rqO_2 id_protected() {
      return this.id_final;
   }

   public int id_private() {
      return this.id_goto;
   }

   public rrdr_1 id_final() {
      return this.id_interface;
   }

   public boolean id_volatile() {
      return this.id_throws > 0;
   }

   public int id_native() {
      return this.id_throws;
   }

   @Override
   public void a_(rAL var1) throws IOException {
   }
}
