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
   private static final Marker id_class = MarkerManager.getMarker("SOUNDS");
   private static final Logger id_break = LogManager.getLogger();
   private static final Set<rqO_2> id_byte = Sets.newHashSet();
   private final Nf_1 id_protected;
   private final Qw_1 id_throws;
   private boolean id_case;
   private final ND id_catch = new ND();
   private final NZ id_private = this.id_catch.id_byte();
   private final NB id_implements;
   private final Nw_1 id_finally = new Nw_1();
   private final NX id_extends = new NX(this.id_catch, this.id_finally);
   private int id_native;
   private final Map<NQ, NJ> id_volatile = Maps.newHashMap();
   private final Multimap<rqL_2, NQ> id_final = HashMultimap.create();
   private final List<Nm_1> id_package = Lists.newArrayList();
   private final Map<NQ, Integer> id_int = Maps.newHashMap();
   private final Map<NQ, Integer> id_new = Maps.newHashMap();
   private final List<Nu_1> id_continue = Lists.newArrayList();
   private final List<Nm_1> id_super = Lists.newArrayList();
   private final List<Nq_1> id_this = Lists.newArrayList();

   public void id_byte() {
      if (this.id_case) {
         this.id_finally.id_break();
         this.id_volatile.values().forEach(var0 -> var0.id_class(NK::id_case));
         this.id_volatile.clear();
         this.id_extends.id_break();
         this.id_int.clear();
         this.id_package.clear();
         this.id_final.clear();
         this.id_new.clear();
         this.id_super.clear();
      }
   }

   public void id_byte(NQ var1) {
      if (this.id_case && var1.id_throws()) {
         NI var2 = var1.id_class(this.id_protected);
         rqO_2 var3 = var1.id_case();
         if (var2 == null) {
            if (id_byte.add(var3)) {
               id_break.warn(id_class, "Unable to play unknown soundEvent: {}", var3);
            }
         } else {
            Nq_1 var4 = var1.id_catch();
            if (var4 == Nf_1.id_class) {
               if (id_byte.add(var3)) {
                  id_break.warn(id_class, "Unable to play empty soundEvent: {}", var3);
               }
            } else {
               float var5 = var1.id_native();
               float var6 = Math.max(var5, 1.0F) * (float)var4.id_extends();
               rqL_2 var7 = var1.id_private();
               float var8 = this.id_private(var1);
               float var9 = this.id_catch(var1);
               NN var10 = var1.id_new();
               boolean var11 = var1.id_finally();
               if (var8 == 0.0F && !var1.id_protected()) {
                  id_break.debug(id_class, "Skipped playing sound {}, volume was zero.", var4.id_byte());
               } else {
                  rjU_2 var12 = new rjU_2(var1.id_final(), var1.id_package(), var1.id_int());
                  if (!this.id_continue.isEmpty()) {
                     boolean var13 = var11 || var10 == NN.NONE || this.id_private.id_class().id_implements(var12) < (double)(var6 * var6);
                     if (var13) {
                        for (Nu_1 var15 : this.id_continue) {
                           var15.id_class(var1, var2);
                        }
                     } else {
                        id_break.debug(id_class, "Did not notify listeners of soundEvent: {}, it is too far away to hear", var3);
                     }
                  }

                  if (this.id_private.id_break() <= 0.0F) {
                     id_break.debug(id_class, "Skipped playing soundEvent: {}, master volume was zero", var3);
                  } else {
                     boolean var17 = id_case(var1);
                     boolean var18 = var4.id_implements();
                     CompletableFuture var19 = this.id_extends.id_class(var4.id_implements() ? Ni_1.STREAMING : Ni_1.STATIC);
                     NJ var16 = (NJ)var19.join();
                     if (var16 != null) {
                        id_break.debug(id_class, "Playing sound {} for event {}", var4.id_byte(), var3);
                        this.id_new.put(var1, this.id_native + 20);
                        this.id_volatile.put(var1, var16);
                        this.id_final.put(var7, var1);
                        var16.id_class(var8x -> {
                           var8x.id_class(var9);
                           var8x.id_break(var8);
                           if (var10 == NN.LINEAR) {
                              var8x.id_byte(var6);
                           } else {
                              var8x.id_private();
                           }

                           var8x.id_class(var17 && !var18);
                           var8x.id_class(var12);
                           var8x.id_break(var11);
                        });
                        if (!var18) {
                           this.id_implements.id_class(var4.id_protected()).thenAccept(var1x -> var16.id_class(var1xx -> {
                                 var1xx.id_class(var1x);
                                 var1xx.id_byte();
                              }));
                        } else {
                           this.id_implements.id_class(var4.id_protected(), var17).thenAccept(var1x -> var16.id_class(var1xx -> {
                                 var1xx.id_class(var1x);
                                 var1xx.id_byte();
                              }));
                        }

                        if (var1 instanceof Nm_1) {
                           this.id_package.add((Nm_1)var1);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public Nt_1(Nf_1 var1, Qw_1 var2, rAL var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_implements = new NB(var3);
   }

   public void id_class() {
      id_byte.clear();

      for (rqA_2 var2 : rVL.id_short) {
         rqO_2 var3 = var2.id_class();
         if (this.id_protected.id_class(var3) == null) {
            id_break.warn("Missing sound for event: {}", rVL.id_short.id_break(var2));
            id_byte.add(var3);
         }
      }

      this.id_break();
      this.id_catch();
   }

   public void id_class(Nq_1 var1) {
      this.id_this.add(var1);
   }

   public void id_class(Nm_1 var1) {
      this.id_super.add(var1);
   }

   public void id_class(rqO_2 var1, rqL_2 var2) {
      if (var2 != null) {
         for (NQ var4 : this.id_final.get(var2)) {
            if (var1 == null || var4.id_case().equals(var1)) {
               this.id_class(var4);
            }
         }
      } else if (var1 == null) {
         this.id_byte();
      } else {
         for (NQ var6 : this.id_volatile.keySet()) {
            if (var6.id_case().equals(var1)) {
               this.id_class(var6);
            }
         }
      }
   }

   public void id_class(ly_3 var1) {
      if (this.id_case && var1.id_private()) {
         rjU_2 var2 = var1.id_break();
         rje_3 var3 = var1.id_volatile();
         rje_3 var4 = var1.id_final();
         this.id_finally.execute(() -> {
            this.id_private.id_class(var2);
            this.id_private.id_class(var3, var4);
         });
      }
   }

   public void id_class(NQ var1, int var2) {
      this.id_int.put(var1, this.id_native + var2);
   }

   public void id_class(NQ var1) {
      if (this.id_case) {
         NJ var2 = this.id_volatile.get(var1);
         if (var2 != null) {
            var2.id_class(NK::id_case);
         }
      }
   }

   public void id_class(rqL_2 var1, float var2) {
      if (this.id_case) {
         if (var1 == rqL_2.MASTER) {
            this.id_private.id_class(var2);
         } else {
            this.id_volatile.forEach((var1x, var2x) -> {
               float var3 = this.id_private(var1x);
               var2x.id_class(var1xx -> {
                  if (var3 <= 0.0F) {
                     var1xx.id_case();
                  } else {
                     var1xx.id_break(var3);
                  }
               });
            });
         }
      }
   }

   public void id_class(Nu_1 var1) {
      this.id_continue.add(var1);
   }

   private float id_class(rqL_2 var1) {
      return var1 != null && var1 != rqL_2.MASTER ? this.id_throws.id_class(var1) : 1.0F;
   }

   public void id_class(boolean var1) {
      if (!var1) {
         this.id_private();
      }

      this.id_extends.id_class();
   }

   public void id_break() {
      if (this.id_case) {
         this.id_byte();
         this.id_implements.id_class();
         this.id_catch.id_break();
         this.id_case = false;
      }
   }

   public void id_break(Nu_1 var1) {
      this.id_continue.remove(var1);
   }

   public boolean id_break(NQ var1) {
      if (!this.id_case) {
         return false;
      } else {
         return this.id_new.containsKey(var1) && this.id_new.get(var1) <= this.id_native ? true : this.id_volatile.containsKey(var1);
      }
   }

   private static boolean id_throws(NQ var0) {
      return var0.id_implements() && id_protected(var0);
   }

   public void id_throws() {
      if (this.id_case) {
         this.id_extends.id_class(var0 -> var0.forEach(NK::id_throws));
      }
   }

   private float id_catch(NQ var1) {
      return rfU_2.id_class(var1.id_volatile(), 0.5F, 2.0F);
   }

   private synchronized void id_catch() {
      if (!this.id_case) {
         try {
            this.id_catch.id_class();
            this.id_private.id_byte();
            this.id_private.id_class(this.id_throws.id_class(rqL_2.MASTER));
            this.id_implements.id_class(this.id_this).thenRun(this.id_this::clear);
            this.id_case = true;
            id_break.info(id_class, "Sound engine started");
         } catch (RuntimeException var2) {
            id_break.error(id_class, "Error starting SoundSystem. Turning off sounds & music", var2);
         }
      }
   }

   private static boolean id_case(NQ var0) {
      return var0.id_implements() && !id_protected(var0);
   }

   public String id_case() {
      return this.id_catch.id_protected();
   }

   private static boolean id_protected(NQ var0) {
      return var0.id_extends() > 0;
   }

   public void id_protected() {
      if (this.id_case) {
         this.id_extends.id_class(var0 -> var0.forEach(NK::id_protected));
      }
   }

   private void id_private() {
      this.id_native++;
      this.id_super.stream().filter(NQ::id_throws).forEach(this::id_byte);
      this.id_super.clear();

      for (Nm_1 var2 : this.id_package) {
         if (!var2.id_throws()) {
            this.id_class((NQ)var2);
         }

         var2.id_byte();
         if (var2.id_continue()) {
            this.id_class((NQ)var2);
         } else {
            float var3 = this.id_private(var2);
            float var4 = this.id_catch(var2);
            rjU_2 var5 = new rjU_2(var2.id_final(), var2.id_package(), var2.id_int());
            NJ var6 = this.id_volatile.get(var2);
            if (var6 != null) {
               var6.id_class(var3x -> {
                  var3x.id_break(var3);
                  var3x.id_class(var4);
                  var3x.id_class(var5);
               });
            }
         }
      }

      Iterator var9 = this.id_volatile.entrySet().iterator();

      while (var9.hasNext()) {
         Entry var10 = (Entry)var9.next();
         NJ var12 = (NJ)var10.getValue();
         NQ var14 = (NQ)var10.getKey();
         float var16 = this.id_throws.id_class(var14.id_private());
         if (var16 <= 0.0F) {
            var12.id_class(NK::id_case);
            var9.remove();
         } else if (var12.id_class()) {
            int var17 = this.id_new.get(var14);
            if (var17 <= this.id_native) {
               if (id_throws(var14)) {
                  this.id_int.put(var14, this.id_native + var14.id_extends());
               }

               var9.remove();
               id_break.debug(id_class, "Removed channel {} because it's not playing anymore", var12);
               this.id_new.remove(var14);

               try {
                  this.id_final.remove(var14.id_private(), var14);
               } catch (RuntimeException var8) {
               }

               if (var14 instanceof Nm_1) {
                  this.id_package.remove(var14);
               }
            }
         }
      }

      Iterator var11 = this.id_int.entrySet().iterator();

      while (var11.hasNext()) {
         Entry var13 = (Entry)var11.next();
         if (this.id_native >= (Integer)var13.getValue()) {
            NQ var15 = (NQ)var13.getKey();
            if (var15 instanceof Nm_1) {
               ((Nm_1)var15).id_byte();
            }

            this.id_byte(var15);
            var11.remove();
         }
      }
   }

   private float id_private(NQ var1) {
      return rfU_2.id_class(var1.id_native() * this.id_class(var1.id_private()), 0.0F, 1.0F);
   }
}
