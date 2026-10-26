package celestial;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Nt_1 {
   private static final Marker class_ = MarkerManager.getMarker("SOUNDS");
   private static final Logger break_ = LogManager.getLogger();
   private static final Set<rqO_2> byte_ = Sets.newHashSet();
   private final Nf_1 protected_;
   private final Qw_1 throws_;
   private boolean case_;
   private final ND catch_ = new ND();
   private final NZ private_ = this.catch_.byte_();
   private final NB implements_;
   private final Nw_1 finally_ = new Nw_1();
   private final NX extends_ = new NX(this.catch_, this.finally_);
   private int native_;
   private final Map<NQ, NJ> volatile_ = Maps.newHashMap();
   private final Multimap<rqL_2, NQ> final_ = HashMultimap.create();
   private final List<Nm_1> package_ = Lists.newArrayList();
   private final Map<NQ, Integer> int_ = Maps.newHashMap();
   private final Map<NQ, Integer> new_ = Maps.newHashMap();
   private final List<Nu_1> continue_ = Lists.newArrayList();
   private final List<Nm_1> super_ = Lists.newArrayList();
   private final List<Nq_1> this_ = Lists.newArrayList();

   public void byte_() {
      if (this.case_) {
         this.finally_.break_();
         this.volatile_.values().forEach(var0 -> var0.class_(NK::case_));
         this.volatile_.clear();
         this.extends_.break_();
         this.int_.clear();
         this.package_.clear();
         this.final_.clear();
         this.new_.clear();
         this.super_.clear();
      }
   }

   public void byte_(NQ var1) {
      if (this.case_ && var1.throws_()) {
         NI var2 = var1.class_(this.protected_);
         rqO_2 var3 = var1.case_();
         if (var2 == null) {
            if (byte_.add(var3)) {
               break_.warn(class_, "Unable to play unknown soundEvent: {}", var3);
            }
         } else {
            Nq_1 var4 = var1.catch_();
            if (var4 == Nf_1.class_) {
               if (byte_.add(var3)) {
                  break_.warn(class_, "Unable to play empty soundEvent: {}", var3);
               }
            } else {
               float var5 = var1.native_();
               float var6 = Math.max(var5, 1.0F) * (float)var4.extends_();
               rqL_2 var7 = var1.private_();
               float var8 = this.private_(var1);
               float var9 = this.catch_(var1);
               NN var10 = var1.new_();
               boolean var11 = var1.finally_();
               if (var8 == 0.0F && !var1.protected_()) {
                  break_.debug(class_, "Skipped playing sound {}, volume was zero.", var4.byte_());
               } else {
                  rjU_2 var12 = new rjU_2(var1.final_(), var1.package_(), var1.int_());
                  if (!this.continue_.isEmpty()) {
                     boolean var13 = var11 || var10 == NN.NONE || this.private_.class_().implements_(var12) < (double)(var6 * var6);
                     if (var13) {
                        for (Nu_1 var15 : this.continue_) {
                           var15.class_(var1, var2);
                        }
                     } else {
                        break_.debug(class_, "Did not notify listeners of soundEvent: {}, it is too far away to hear", var3);
                     }
                  }

                  if (this.private_.break_() <= 0.0F) {
                     break_.debug(class_, "Skipped playing soundEvent: {}, master volume was zero", var3);
                  } else {
                     boolean var17 = case_(var1);
                     boolean var18 = var4.implements_();
                     CompletableFuture var19 = this.extends_.class_(var4.implements_() ? Ni_1.STREAMING : Ni_1.STATIC);
                     NJ var16 = (NJ)var19.join();
                     if (var16 != null) {
                        break_.debug(class_, "Playing sound {} for event {}", var4.byte_(), var3);
                        this.new_.put(var1, this.native_ + 20);
                        this.volatile_.put(var1, var16);
                        this.final_.put(var7, var1);
                        var16.class_(var8x -> {
                           var8x.class_(var9);
                           var8x.break_(var8);
                           if (var10 == NN.LINEAR) {
                              var8x.byte_(var6);
                           } else {
                              var8x.private_();
                           }

                           var8x.class_(var17 && !var18);
                           var8x.class_(var12);
                           var8x.break_(var11);
                        });
                        if (!var18) {
                           this.implements_.class_(var4.protected_()).thenAccept(var1x -> var16.class_(var1xx -> {
                                 var1xx.class_(var1x);
                                 var1xx.byte_();
                              }));
                        } else {
                           this.implements_.class_(var4.protected_(), var17).thenAccept(var1x -> var16.class_(var1xx -> {
                                 var1xx.class_(var1x);
                                 var1xx.byte_();
                              }));
                        }

                        if (var1 instanceof Nm_1) {
                           this.package_.add((Nm_1)var1);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public Nt_1(Nf_1 var1, Qw_1 var2, rAL var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.implements_ = new NB(var3);
   }

   public void class_() {
      byte_.clear();

      for (rqA_2 var2 : rVL.short_) {
         rqO_2 var3 = var2.class_();
         if (this.protected_.class_(var3) == null) {
            break_.warn("Missing sound for event: {}", rVL.short_.break_(var2));
            byte_.add(var3);
         }
      }

      this.break_();
      this.catch_();
   }

   public void class_(Nq_1 var1) {
      this.this_.add(var1);
   }

   public void class_(Nm_1 var1) {
      this.super_.add(var1);
   }

   public void class_(rqO_2 var1, rqL_2 var2) {
      if (var2 != null) {
         for (NQ var4 : this.final_.get(var2)) {
            if (var1 == null || var4.case_().equals(var1)) {
               this.class_(var4);
            }
         }
      } else if (var1 == null) {
         this.byte_();
      } else {
         for (NQ var6 : this.volatile_.keySet()) {
            if (var6.case_().equals(var1)) {
               this.class_(var6);
            }
         }
      }
   }

   public void class_(ly_3 var1) {
      if (this.case_ && var1.private_()) {
         rjU_2 var2 = var1.break_();
         rje_3 var3 = var1.volatile_();
         rje_3 var4 = var1.final_();
         this.finally_.execute(() -> {
            this.private_.class_(var2);
            this.private_.class_(var3, var4);
         });
      }
   }

   public void class_(NQ var1, int var2) {
      this.int_.put(var1, this.native_ + var2);
   }

   public void class_(NQ var1) {
      if (this.case_) {
         NJ var2 = this.volatile_.get(var1);
         if (var2 != null) {
            var2.class_(NK::case_);
         }
      }
   }

   public void class_(rqL_2 var1, float var2) {
      if (this.case_) {
         if (var1 == rqL_2.MASTER) {
            this.private_.class_(var2);
         } else {
            this.volatile_.forEach((var1x, var2x) -> {
               float var3 = this.private_(var1x);
               var2x.class_(var1xx -> {
                  if (var3 <= 0.0F) {
                     var1xx.case_();
                  } else {
                     var1xx.break_(var3);
                  }
               });
            });
         }
      }
   }

   public void class_(Nu_1 var1) {
      this.continue_.add(var1);
   }

   private float class_(rqL_2 var1) {
      return var1 != null && var1 != rqL_2.MASTER ? this.throws_.class_(var1) : 1.0F;
   }

   public void class_(boolean var1) {
      if (!var1) {
         this.private_();
      }

      this.extends_.class_();
   }

   public void break_() {
      if (this.case_) {
         this.byte_();
         this.implements_.class_();
         this.catch_.break_();
         this.case_ = false;
      }
   }

   public void break_(Nu_1 var1) {
      this.continue_.remove(var1);
   }

   public boolean break_(NQ var1) {
      if (!this.case_) {
         return false;
      } else {
         return this.new_.containsKey(var1) && this.new_.get(var1) <= this.native_ ? true : this.volatile_.containsKey(var1);
      }
   }

   private static boolean throws_(NQ var0) {
      return var0.implements_() && protected_(var0);
   }

   public void throws_() {
      if (this.case_) {
         this.extends_.class_(var0 -> var0.forEach(NK::throws_));
      }
   }

   private float catch_(NQ var1) {
      return rfU_2.class_(var1.volatile_(), 0.5F, 2.0F);
   }

   private synchronized void catch_() {
      if (!this.case_) {
         try {
            this.catch_.class_();
            this.private_.byte_();
            this.private_.class_(this.throws_.class_(rqL_2.MASTER));
            this.implements_.class_(this.this_).thenRun(this.this_::clear);
            this.case_ = true;
            break_.info(class_, "Sound engine started");
         } catch (RuntimeException var2) {
            break_.error(class_, "Error starting SoundSystem. Turning off sounds & music", var2);
         }
      }
   }

   private static boolean case_(NQ var0) {
      return var0.implements_() && !protected_(var0);
   }

   public String case_() {
      return this.catch_.protected_();
   }

   private static boolean protected_(NQ var0) {
      return var0.extends_() > 0;
   }

   public void protected_() {
      if (this.case_) {
         this.extends_.class_(var0 -> var0.forEach(NK::protected_));
      }
   }

   private void private_() {
      this.native_++;
      this.super_.stream().filter(NQ::throws_).forEach(this::byte_);
      this.super_.clear();

      for (Nm_1 var2 : this.package_) {
         if (!var2.throws_()) {
            this.class_((NQ)var2);
         }

         var2.byte_();
         if (var2.continue_()) {
            this.class_((NQ)var2);
         } else {
            float var3 = this.private_(var2);
            float var4 = this.catch_(var2);
            rjU_2 var5 = new rjU_2(var2.final_(), var2.package_(), var2.int_());
            NJ var6 = this.volatile_.get(var2);
            if (var6 != null) {
               var6.class_(var3x -> {
                  var3x.break_(var3);
                  var3x.class_(var4);
                  var3x.class_(var5);
               });
            }
         }
      }

      Iterator var9 = this.volatile_.entrySet().iterator();

      while (var9.hasNext()) {
         Entry var10 = (Entry)var9.next();
         NJ var12 = (NJ)var10.getValue();
         NQ var14 = (NQ)var10.getKey();
         float var16 = this.throws_.class_(var14.private_());
         if (var16 <= 0.0F) {
            var12.class_(NK::case_);
            var9.remove();
         } else if (var12.class_()) {
            int var17 = this.new_.get(var14);
            if (var17 <= this.native_) {
               if (throws_(var14)) {
                  this.int_.put(var14, this.native_ + var14.extends_());
               }

               var9.remove();
               break_.debug(class_, "Removed channel {} because it's not playing anymore", var12);
               this.new_.remove(var14);

               try {
                  this.final_.remove(var14.private_(), var14);
               } catch (RuntimeException var8) {
               }

               if (var14 instanceof Nm_1) {
                  this.package_.remove(var14);
               }
            }
         }
      }

      Iterator var11 = this.int_.entrySet().iterator();

      while (var11.hasNext()) {
         Entry var13 = (Entry)var11.next();
         if (this.native_ >= (Integer)var13.getValue()) {
            NQ var15 = (NQ)var13.getKey();
            if (var15 instanceof Nm_1) {
               ((Nm_1)var15).byte_();
            }

            this.byte_(var15);
            var11.remove();
         }
      }
   }

   private float private_(NQ var1) {
      return rfU_2.class_(var1.native_() * this.class_(var1.private_()), 0.0F, 1.0F);
   }
}
