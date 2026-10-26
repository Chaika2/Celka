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
   private static final Logger finally_ = LogManager.getLogger();
   @Deprecated
   public static final rqO_2 class_ = rJT.class_;
   @Deprecated
   public static final rqO_2 break_ = new rqO_2("textures/atlas/particles.png");
   private final List<fj_3> extends_ = Lists.newArrayList();
   private final Set<rqO_2> native_ = Sets.newHashSet();
   private final Map<rqO_2, fj_3> volatile_ = Maps.newHashMap();
   private final rqO_2 final_;
   private final int package_;
   private Map<rqO_2, fj_3> int_ = new LinkedHashMap<>();
   private Map<rqO_2, fj_3> new_ = new LinkedHashMap<>();
   private fj_3[] continue_ = null;
   private int super_ = -1;
   private int this_ = -1;
   private int else_ = -1;
   private double synchronized_ = -1.0;
   private double return_ = -1.0;
   private rrWd_1 public_ = new rrWd_1(0);
   public int byte_ = 0;
   public int protected_ = 0;
   public int throws_ = 0;
   private int goto_;
   private int while_;
   private boolean try_;
   private boolean instanceof_;
   private boolean throw_;
   private rrdr_1 interface_;

   private boolean byte_(String var1) {
      String var2 = var1.toLowerCase();
      return var2.startsWith("optifine/");
   }

   public fj_3 byte_(rqO_2 var1) {
      return this.int_.get(var1);
   }

   @Override
   public void byte_() {
      for (fj_3 var2 : this.volatile_.values()) {
         var2.close();
      }

      if (this.throw_) {
         for (fj_3 var4 : this.volatile_.values()) {
            var4.else_();
            if (var4.extends_ != null) {
               var4.extends_.else_();
            }

            if (var4.native_ != null) {
               var4.native_.else_();
            }
         }
      }

      this.volatile_.clear();
      this.extends_.clear();
   }

   private static int byte_(fj_3 var0) {
      fj_3 var1 = var0.catch_;
      if (var1 != null) {
         var0.this_();
         var1.package_();
         if (var1.super_()) {
            return 1;
         }
      }

      return 0;
   }

   public boolean int_() {
      return this.break_(rrdn_1.SPECULAR);
   }

   public fJ_2(rqO_2 var1) {
      this.final_ = var1;
      this.package_ = RenderSystem.maxSupportedTextureSize();
      this.try_ = var1.equals(class_);
      this.instanceof_ = rrbb_3.rs();
      this.throw_ = rrbb_3.w();
      if (this.try_) {
         rrbb_3.class_(this);
      }
   }

   @Override
   public String toString() {
      return this.final_ + "";
   }

   private static fV_2 class_(fV_2 var0, int var1) {
      if (var0.break_() >= var1 && var0.byte_() >= var1) {
         return var0;
      } else {
         int var2 = Math.max(var0.break_(), var1);
         int var3 = Math.max(var0.byte_(), var1);
         return new fV_2(var0.class_(), var2, var3, var0.protected_());
      }
   }

   public fj_3 class_(double var1, double var3) {
      if (this.continue_ == null) {
         return null;
      } else {
         int var5 = (int)(var1 / this.synchronized_);
         int var6 = (int)(var3 / this.return_);
         int var7 = var6 * this.this_ + var5;
         return var7 >= 0 && var7 <= this.continue_.length ? this.continue_[var7] : null;
      }
   }

   private void class_(int var1, int var2) {
      this.this_ = -1;
      this.else_ = -1;
      this.continue_ = null;
      if (this.super_ > 0) {
         this.this_ = var1 / this.super_;
         this.else_ = var2 / this.super_;
         this.continue_ = new fj_3[this.this_ * this.else_];
         this.synchronized_ = 1.0 / (double)this.this_;
         this.return_ = 1.0 / (double)this.else_;

         for (fj_3 var4 : this.volatile_.values()) {
            double var5 = 0.5 / (double)var1;
            double var7 = 0.5 / (double)var2;
            double var9 = (double)Math.min(var4.case_(), var4.catch_()) + var5;
            double var11 = (double)Math.min(var4.private_(), var4.implements_()) + var7;
            double var13 = (double)Math.max(var4.case_(), var4.catch_()) - var5;
            double var15 = (double)Math.max(var4.private_(), var4.implements_()) - var7;
            int var17 = (int)(var9 / this.synchronized_);
            int var18 = (int)(var11 / this.return_);
            int var19 = (int)(var13 / this.synchronized_);
            int var20 = (int)(var15 / this.return_);

            for (int var21 = var17; var21 <= var19; var21++) {
               if (var21 >= 0 && var21 < this.this_) {
                  for (int var22 = var18; var22 <= var20; var22++) {
                     if (var22 >= 0 && var22 < this.this_) {
                        int var23 = var22 * this.this_ + var21;
                        this.continue_[var23] = var4;
                     } else {
                        rrbb_3.protected_("Invalid grid V: " + var22 + ", icon: " + var4.finally_());
                     }
                  }
               } else {
                  rrbb_3.protected_("Invalid grid U: " + var21 + ", icon: " + var4.finally_());
               }
            }
         }
      }
   }

   public fx_3 class_(rAL var1, Stream<rqO_2> var2, int var3) {
      this.try_ = this.final_.equals(class_);
      this.instanceof_ = rrbb_3.rs();
      this.throw_ = rrbb_3.w();
      this.interface_ = rrdr_1.byte_();
      int var4 = var3;
      this.int_.clear();
      this.new_.clear();
      this.public_.break_();
      Set var5 = var2.peek(var0 -> {
         if (var0 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
         }
      }).collect(Collectors.toSet());
      rrbb_3.byte_("Multitexture: " + rrbb_3.w());
      rrzJ_2.class_(this);
      var5.addAll(this.int_.keySet());
      Set var6 = class_(var5, this.int_.keySet());
      rrbY_2.class_(this, var6);
      var5.addAll(this.int_.keySet());
      if (var3 >= 4) {
         var4 = this.class_(var5, var1);
         rrbb_3.case_("Mipmap levels: " + var4);
      }

      int var7 = rrzJ_2.case_();
      fT_2 var8 = new fT_2(var7, var7, var3);
      int var9 = Integer.MAX_VALUE;
      int var10 = class_(var4);
      this.super_ = var10;
      int var11 = 1 << var3;
      rrxr_3.class_(rrxr_3.rt, this, var5);

      for (fV_2 var13 : this.class_(var1, var5)) {
         int var14 = var13.break_();
         int var15 = var13.byte_();
         if (var14 >= 1 && var15 >= 1) {
            if (var14 < var10 || var4 > 0) {
               int var16 = var4 > 0 ? rrzJ_2.class_(var14, var10) : rrzJ_2.break_(var14, var10);
               if (var16 != var14) {
                  if (!rrzJ_2.throws_(var14)) {
                     rrbb_3.case_("Scaled non power of 2: " + var13.class_() + ", " + var14 + " -> " + var16);
                  } else {
                     rrbb_3.case_("Scaled too small texture: " + var13.class_() + ", " + var14 + " -> " + var16);
                  }

                  int var17 = var15 * var16 / var14;
                  var13.class_(var16);
                  var13.break_(var17);
                  var13.class_((double)var16 * 1.0 / (double)var14);
               }
            }

            var9 = Math.min(var9, Math.min(var13.break_(), var13.byte_()));
            int var24 = Math.min(Integer.lowestOneBit(var13.break_()), Integer.lowestOneBit(var13.byte_()));
            if (var24 < var11) {
               finally_.warn(
                  "Texture {} with size {}x{} limits mip level from {} to {}",
                  var13.class_(),
                  var13.break_(),
                  var13.byte_(),
                  rfU_2.case_(var11),
                  rfU_2.case_(var24)
               );
               var11 = var24;
            }

            var8.class_(var13);
         } else {
            rrbb_3.protected_("Invalid sprite size: " + var13.class_());
         }
      }

      int var20 = Math.min(var9, var11);
      int var21 = rfU_2.case_(var20);
      if (var21 < 0) {
         var21 = 0;
      }

      int var22;
      if (var21 < var3) {
         finally_.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.final_, var3, var21, var20);
         var22 = var21;
      } else {
         var22 = var3;
      }

      fV_2 var23 = class_(fQ_2.break_(), var10);
      var8.class_(var23);

      try {
         var8.byte_();
      } catch (yG_2 var19) {
         KY var26 = KY.class_(var19, "Stitching");
         Ko_1 var18 = var26.class_("Stitcher");
         var18.class_(
            "Sprites",
            var19.class_().stream().map(var0 -> String.format("%s[%dx%d]", var0.class_(), var0.break_(), var0.byte_())).collect(Collectors.joining(","))
         );
         var18.class_("Max Texture Size", var7);
         throw new KU(var26);
      }

      List var25 = this.class_(var1, var8, var22);
      return new fx_3(var5, var8.class_(), var8.break_(), var22, var25);
   }

   private int class_(Set<rqO_2> var1, rAL var2) {
      int var3 = this.class_(var1, var2, 20);
      if (var3 < 16) {
         var3 = 16;
      }

      var3 = rfU_2.byte_(var3);
      if (var3 > 16) {
         rrbb_3.case_("Sprite size: " + var3);
      }

      int var4 = rfU_2.case_(var3);
      if (var4 < 4) {
         var4 = 4;
      }

      return var4;
   }

   private int class_(Set<rqO_2> var1, rAL var2, int var3) {
      HashMap var4 = new HashMap();

      for (rqO_2 var6 : var1) {
         rqO_2 var7 = this.class_(var6);

         try {
            rAF var8 = var2.class_(var7);
            if (var8 != null) {
               InputStream var9 = var8.break_();
               if (var9 != null) {
                  Dimension var10 = rrzJ_2.class_(var9, "png");
                  var9.close();
                  if (var10 != null) {
                     int var11 = var10.width;
                     int var12 = rfU_2.byte_(var11);
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

   public void class_(fx_3 var1) {
      this.native_.clear();
      this.native_.addAll(var1.class_);
      finally_.info("Created: {}x{}x{} {}-atlas", var1.break_, var1.byte_, var1.protected_, this.final_);
      fo_3.class_(this.new_(), var1.protected_, var1.break_, var1.byte_);
      this.byte_ = var1.break_;
      this.protected_ = var1.byte_;
      this.throws_ = var1.protected_;
      if (this.instanceof_) {
         rrdA.class_(var1.protected_, var1.break_, var1.byte_, this);
      }

      this.byte_();

      for (fj_3 var3 : var1.throws_) {
         this.volatile_.put(var3.finally_(), var3);

         try {
            var3.volatile_();
         } catch (Throwable var7) {
            KY var5 = KY.class_(var7, "Stitching texture atlas");
            Ko_1 var6 = var5.class_("Texture being stitched together");
            var6.class_("Atlas path", this.final_);
            var6.class_("Sprite", var3);
            throw new KU(var5);
         }

         if (var3.int_()) {
            var3.class_(this.extends_.size());
            this.extends_.add(var3);
         }
      }

      rrzJ_2.break_(this);
      rrbb_3.case_("Animated sprites: " + this.extends_.size());
      if (rrbb_3.w()) {
         for (fj_3 var10 : var1.throws_) {
            break_(var10);
            if (var10.extends_ != null) {
               break_(var10.extends_);
            }

            if (var10.native_ != null) {
               break_(var10.native_);
            }
         }

         MT.super_(this.new_());
      }

      if (rrbb_3.rs()) {
         List var9 = var1.throws_;
         if (rrdZ.SV) {
            MT.super_(this.this_().break_);

            for (fj_3 var4 : var9) {
               fj_3 var14 = var4.extends_;
               if (var14 != null) {
                  var14.volatile_();
               }
            }
         }

         if (rrdZ.Sg) {
            MT.super_(this.this_().byte_);

            for (fj_3 var13 : var9) {
               fj_3 var15 = var13.native_;
               if (var15 != null) {
                  var15.volatile_();
               }
            }
         }

         MT.super_(this.new_());
      }

      rrxr_3.class_(rrxr_3.rw, this);
      this.class_(var1.break_, var1.byte_);
      if (rrbb_3.class_(System.getProperty("saveTextureMap"), "true")) {
         rrbb_3.byte_("Exporting texture map: " + this.final_);
         rrzJ_2.class_("debug/" + this.final_.break_().replaceAll("/", "_"), this.new_(), var1.protected_, var1.break_, var1.byte_);
         if (this.instanceof_) {
            if (rrdZ.SV) {
               rrzJ_2.class_(
                  "debug/" + this.final_.break_().replaceAll("/", "_").replace(".png", "_n.png"),
                  this.implements_.break_,
                  var1.protected_,
                  var1.break_,
                  var1.byte_
               );
            }

            if (rrdZ.Sg) {
               rrzJ_2.class_(
                  "debug/" + this.final_.break_().replaceAll("/", "_").replace(".png", "_s.png"),
                  this.implements_.byte_,
                  var1.protected_,
                  var1.break_,
                  var1.byte_
               );
            }

            MT.super_(this.new_());
         }
      }
   }

   private static int class_(int var0) {
      int var1 = 1 << var0;
      if (var1 < 8) {
         var1 = 8;
      }

      return var1;
   }

   public rrko_1 class_(rrdn_1 var1) {
      if (var1 == null) {
         return null;
      } else {
         return (rrko_1)(this.interface_ != null ? this.interface_.class_(var1) : new rrkg_1());
      }
   }

   private static <T> Set<T> class_(Set<T> var0, Set<T> var1) {
      HashSet var2 = new HashSet();
      var2.addAll(var0);
      var2.addAll(var1);
      return var2;
   }

   private Collection<fV_2> class_(rAL var1, Set<rqO_2> var2) {
      ArrayList var3 = Lists.newArrayList();
      ConcurrentLinkedQueue var4 = new ConcurrentLinkedQueue();

      for (rqO_2 var6 : var2) {
         if (!fQ_2.class_().equals(var6)) {
            var3.add(CompletableFuture.runAsync(() -> {
               rqO_2 var4x = this.class_(var6);

               fV_2 var5;
               try (rAF var6x = var1.class_(var4x)) {
                  fF_2 var7 = new fF_2(var6x.toString(), var6x.break_());
                  ji_3 var8 = var6x.class_(ji_3.class_);
                  if (var8 == null) {
                     var8 = ji_3.break_;
                  }

                  Pair var9 = var8.class_(var7.class_, var7.break_);
                  var5 = new fV_2(var6, (Integer)var9.getFirst(), (Integer)var9.getSecond(), var8);
               } catch (RuntimeException var12) {
                  finally_.error("Unable to parse metadata from {} : {}", var4x, var12);
                  this.catch_(var6);
                  return;
               } catch (IOException var13) {
                  finally_.error("Using missing texture, unable to load {} : {}", var4x, var13);
                  this.catch_(var6);
                  return;
               }

               var4.add(var5);
            }, rqR_2.case_()));
         }
      }

      CompletableFuture.allOf(var3.toArray(new CompletableFuture[0])).join();
      return var4;
   }

   private fj_3 class_(rAL var1, fV_2 var2, int var3, int var4, int var5, int var6, int var7) {
      rqO_2 var8 = this.class_(var2.class_());

      try {
         fj_3 var12;
         try (rAF var9 = var1.class_(var8)) {
            fN_2 var10 = fN_2.class_(var9.break_());
            fj_3 var11 = new fj_3(this, var2, var5, var3, var4, var6, var7, var10);
            var11.class_(var1);
            var12 = var11;
         }

         return var12;
      } catch (RuntimeException var15) {
         finally_.error("Unable to parse metadata from {}", var8, var15);
         return null;
      } catch (IOException var16) {
         finally_.error("Using missing texture, unable to load {}", var8, var16);
         return null;
      }
   }

   public fj_3 class_(String var1) {
      rqO_2 var2 = new rqO_2(var1);
      return this.byte_(var2);
   }

   private List<fj_3> class_(rAL var1, fT_2 var2, int var3) {
      ConcurrentLinkedQueue var4 = new ConcurrentLinkedQueue();
      ArrayList var5 = Lists.newArrayList();
      var2.class_((var5x, var6, var7, var8, var9) -> {
         if (var5x.class_().equals(fQ_2.break_().class_())) {
            fQ_2 var10 = new fQ_2(this, var5x, var3, var6, var7, var8, var9);
            var10.class_(var1);
            var4.add(var10);
         } else {
            var5.add(CompletableFuture.runAsync(() -> {
               fj_3 var9x = this.class_(var1, var5x, var6, var7, var3, var8, var9);
               if (var9x != null) {
                  var4.add(var9x);
               }
            }, rqR_2.case_()));
         }
      });
      CompletableFuture.allOf(var5.toArray(new CompletableFuture[0])).join();
      return Lists.newArrayList(var4);
   }

   @Override
   public void class_() {
      boolean var1 = false;
      boolean var2 = false;
      if (!this.extends_.isEmpty()) {
         this.super_();
      }

      int var3 = 0;

      for (fj_3 var5 : this.extends_) {
         if (this.class_(var5)) {
            var5.package_();
            if (var5.super_()) {
               var3++;
            }

            if (var5.extends_ != null) {
               var1 = true;
            }

            if (var5.native_ != null) {
               var2 = true;
            }
         }
      }

      if (rrbb_3.rs()) {
         if (var1) {
            MT.super_(this.this_().break_);

            for (fj_3 var10 : this.extends_) {
               if (var10.extends_ != null && this.class_(var10) && var10.super_()) {
                  var10.extends_.package_();
                  if (var10.extends_.super_()) {
                     var3++;
                  }
               }
            }
         }

         if (var2) {
            MT.super_(this.this_().byte_);

            for (fj_3 var11 : this.extends_) {
               if (var11.native_ != null && this.class_(var11) && var11.super_()) {
                  var11.native_.package_();
                  if (var11.native_.super_()) {
                     var3++;
                  }
               }
            }
         }

         if (var1 || var2) {
            MT.super_(this.new_());
         }
      }

      if (rrbb_3.w()) {
         for (fj_3 var12 : this.extends_) {
            if (this.class_(var12) && var12.super_()) {
               var3 += byte_(var12);
               if (var12.extends_ != null) {
                  var3 += byte_(var12.extends_);
               }

               if (var12.native_ != null) {
                  var3 += byte_(var12.native_);
               }
            }
         }

         MT.super_(this.new_());
      }

      if (this.try_) {
         int var9 = ((yX_2)rrbb_3.X().class_[8]).public_();
         if (var9 != this.while_) {
            this.goto_ = var3;
            this.while_ = var9;
         }

         if (rrMh_1.class_()) {
            rrMh_1.class_(this);
         }
      }
   }

   private boolean class_(fj_3 var1) {
      if (!this.try_) {
         return true;
      } else if (var1 == rrzJ_2.private_ || var1 == rrzJ_2.implements_) {
         return rrbb_3.default_();
      } else if (var1 == rrzJ_2.finally_ || var1 == rrzJ_2.extends_) {
         return rrbb_3.boolean_();
      } else if (var1 == rrzJ_2.native_ || var1 == rrzJ_2.volatile_) {
         return rrbb_3.for_();
      } else if (var1 == rrzJ_2.final_ || var1 == rrzJ_2.package_) {
         return rrbb_3.for_();
      } else if (var1 == rrzJ_2.int_ || var1 == rrzJ_2.new_) {
         return rrbb_3.for_();
      } else if (var1 != rrzJ_2.continue_ && var1 != rrzJ_2.super_) {
         return var1 == rrzJ_2.this_ ? rrbb_3.strictfp_() : rrbb_3.j();
      } else {
         return rrbb_3.for_();
      }
   }

   public rqO_2 class_(rqO_2 var1) {
      return this.case_(var1)
         ? new rqO_2(var1.byte_(), var1.break_() + ".png")
         : new rqO_2(var1.byte_(), String.format("textures/%s%s", var1.break_(), ".png"));
   }

   public boolean break_(rrdn_1 var1) {
      if (var1 == null) {
         return true;
      } else {
         return this.interface_ != null ? this.interface_.break_(var1) : true;
      }
   }

   public void break_(fx_3 var1) {
      this.class_(false, var1.protected_ > 0);
   }

   private static void break_(fj_3 var0) {
      fj_3 var1 = var0.catch_;
      if (var1 != null) {
         var1.class_(var0.continue_());
         var0.this_();

         try {
            var1.volatile_();
         } catch (Exception var3) {
            rrbb_3.byte_("Error uploading sprite single: " + var1 + ", parent: " + var0);
            var3.printStackTrace();
         }
      }
   }

   public fj_3 break_(rqO_2 var1) {
      fj_3 var2 = this.volatile_.get(var1);
      return var2 == null ? this.volatile_.get(fQ_2.class_()) : var2;
   }

   @Override
   public void break_() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(this::class_);
      } else {
         this.class_();
      }
   }

   public fj_3 break_(String var1) {
      rqO_2 var2 = new rqO_2(var1);
      return this.protected_(var2);
   }

   public fj_3 throws_(rqO_2 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Location cannot be null!");
      } else {
         fj_3 var2 = this.int_.get(var1);
         if (var2 != null) {
            return var2;
         } else {
            this.native_.add(var1);
            var2 = new fj_3(var1);
            this.int_.put(var1, var2);
            var2.class_(this.public_);
            return var2;
         }
      }
   }

   public int throws_() {
      return this.public_.byte_();
   }

   public boolean finally_() {
      return this.try_;
   }

   private void catch_(rqO_2 var1) {
      fj_3 var2 = this.int_.get(var1);
      if (var2 != null) {
         this.new_.put(var1, var2);
      }
   }

   public int catch_() {
      return this.extends_.size();
   }

   public rrWd_1 extends_() {
      return this.public_;
   }

   public boolean case_() {
      int var1 = MT.S();
      int var2 = this.new_();
      return var1 == var2;
   }

   private boolean case_(rqO_2 var1) {
      String var2 = var1.break_();
      return this.byte_(var2);
   }

   public Collection<fj_3> implements_() {
      return Collections.unmodifiableCollection(this.int_.values());
   }

   public boolean package_() {
      return this.break_(rrdn_1.NORMAL);
   }

   public fj_3 protected_(rqO_2 var1) {
      return this.volatile_.get(var1);
   }

   public rqO_2 protected_() {
      return this.final_;
   }

   public int private_() {
      return this.goto_;
   }

   public rrdr_1 final_() {
      return this.interface_;
   }

   public boolean volatile_() {
      return this.throws_ > 0;
   }

   public int native_() {
      return this.throws_;
   }

   @Override
   public void a_(rAL var1) throws IOException {
   }
}
