package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rTM {
   private static final Logger class_ = LogManager.getLogger();
   private static final ThreadFactory break_ = new ThreadFactoryBuilder().setDaemon(true).build();
   private final ImmutableSet<rqM_2<rYB>> byte_;
   private final boolean protected_;
   private final rrGk_1 throws_;
   private final Thread case_;
   private final DataFixer catch_;
   private volatile boolean private_ = true;
   private volatile boolean implements_;
   private volatile float finally_;
   private volatile int extends_;
   private volatile int native_;
   private volatile int volatile_;
   private final Object2FloatMap<rqM_2<rYB>> final_ = Object2FloatMaps.synchronize(new Object2FloatOpenCustomHashMap(rqR_2.extends_()));
   private volatile rgP_2 package_ = new rgn_3("optimizeWorld.stage.counting");
   private static final Pattern int_ = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   private final rrEi_1 new_;

   public ImmutableSet<rqM_2<rYB>> byte_() {
      return this.byte_;
   }

   public rTM(rrGk_1 var1, DataFixer var2, ImmutableSet<rqM_2<rYB>> var3, boolean var4) {
      this.byte_ = var3;
      this.protected_ = var4;
      this.catch_ = var2;
      this.throws_ = var1;
      this.new_ = new rrEi_1(new File(this.throws_.class_(rYB.byte_), "data"), var2);
      this.case_ = break_.newThread(this::implements_);
      this.case_.setUncaughtExceptionHandler((var1x, var2x) -> {
         class_.error("Error upgrading world", var2x);
         this.package_ = new rgn_3("optimizeWorld.stage.failed");
         this.implements_ = true;
      });
      this.case_.start();
   }

   public void class_() {
      this.private_ = false;

      try {
         this.case_.join();
      } catch (InterruptedException var2) {
      }
   }

   public float class_(rqM_2<rYB> var1) {
      return this.final_.getFloat(var1);
   }

   private List<rfj_3> break_(rqM_2<rYB> var1) {
      File var2 = this.throws_.class_(var1);
      File var3 = new File(var2, "region");
      File[] var4 = var3.listFiles((var0, var1x) -> var1x.endsWith(".mca"));
      if (var4 == null) {
         return ImmutableList.of();
      } else {
         ArrayList var5 = Lists.newArrayList();

         for (File var9 : var4) {
            Matcher var10 = int_.matcher(var9.getName());
            if (var10.matches()) {
               int var11 = Integer.parseInt(var10.group(1)) << 5;
               int var12 = Integer.parseInt(var10.group(2)) << 5;

               try (roe_3 var13 = new roe_3(var9, var3, true)) {
                  for (int var14 = 0; var14 < 32; var14++) {
                     for (int var15 = 0; var15 < 32; var15++) {
                        rfj_3 var16 = new rfj_3(var14 + var11, var15 + var12);
                        if (var13.break_(var16)) {
                           var5.add(var16);
                        }
                     }
                  }
               } catch (Throwable var19) {
               }
            }
         }

         return var5;
      }
   }

   public boolean break_() {
      return this.implements_;
   }

   public int throws_() {
      return this.extends_;
   }

   public int catch_() {
      return this.volatile_;
   }

   public int case_() {
      return this.native_;
   }

   private void implements_() {
      this.extends_ = 0;
      Builder var1 = ImmutableMap.builder();
      UnmodifiableIterator var2 = this.byte_.iterator();

      while (var2.hasNext()) {
         rqM_2 var3 = (rqM_2)var2.next();
         List var4 = this.break_(var3);
         var1.put(var3, var4.listIterator());
         this.extends_ = this.extends_ + var4.size();
      }

      if (this.extends_ == 0) {
         this.implements_ = true;
      } else {
         float var25 = (float)this.extends_;
         ImmutableMap var26 = var1.build();
         Builder var27 = ImmutableMap.builder();
         UnmodifiableIterator var5 = this.byte_.iterator();

         while (var5.hasNext()) {
            rqM_2 var6 = (rqM_2)var5.next();
            File var7 = this.throws_.class_(var6);
            var27.put(var6, new roj_3(new File(var7, "region"), this.catch_, true));
         }

         ImmutableMap var28 = var27.build();
         long var29 = rqR_2.break_();
         this.package_ = new rgn_3("optimizeWorld.stage.upgrading");

         while (this.private_) {
            boolean var8 = false;
            float var9 = 0.0F;
            UnmodifiableIterator var10 = this.byte_.iterator();

            while (var10.hasNext()) {
               rqM_2 var11 = (rqM_2)var10.next();
               ListIterator var12 = (ListIterator)var26.get(var11);
               roj_3 var13 = (roj_3)var28.get(var11);
               if (var12.hasNext()) {
                  rfj_3 var14 = (rfj_3)var12.next();
                  boolean var15 = false;

                  try {
                     rcd_3 var16 = var13.class_(var14);
                     if (var16 != null) {
                        int var34 = roj_3.class_(var16);
                        rcd_3 var18 = var13.class_(var11, () -> this.new_, var16);
                        rcd_3 var19 = var18.int_("Level");
                        rfj_3 var20 = new rfj_3(var19.private_("xPos"), var19.private_("zPos"));
                        if (!var20.equals(var14)) {
                           class_.warn("Chunk {} has invalid position {}", var14, var20);
                        }

                        boolean var21 = var34 < rqu_3.class_().getWorldVersion();
                        if (this.protected_) {
                           var21 = var21 || var19.throws_("Heightmaps");
                           var19.continue_("Heightmaps");
                           var21 = var21 || var19.throws_("isLightOn");
                           var19.continue_("isLightOn");
                        }

                        if (var21) {
                           var13.class_(var14, var18);
                           var15 = true;
                        }
                     }
                  } catch (KU var23) {
                     Throwable var17 = var23.getCause();
                     if (!(var17 instanceof IOException)) {
                        throw var23;
                     }

                     class_.error("Error upgrading chunk {}", var14, var17);
                  } catch (IOException var24) {
                     class_.error("Error upgrading chunk {}", var14, var24);
                  }

                  if (var15) {
                     this.native_++;
                  } else {
                     this.volatile_++;
                  }

                  var8 = true;
               }

               float var33 = (float)var12.nextIndex() / var25;
               this.final_.put(var11, var33);
               var9 += var33;
            }

            this.finally_ = var9;
            if (!var8) {
               this.private_ = false;
            }
         }

         this.package_ = new rgn_3("optimizeWorld.stage.finished");
         UnmodifiableIterator var31 = var28.values().iterator();

         while (var31.hasNext()) {
            roj_3 var32 = (roj_3)var31.next();

            try {
               var32.close();
            } catch (IOException var22) {
               class_.error("Error upgrading chunk", var22);
            }
         }

         this.new_.class_();
         var29 = rqR_2.break_() - var29;
         class_.info("World optimizaton finished after {} ms", var29);
         this.implements_ = true;
      }
   }

   public float protected_() {
      return this.finally_;
   }

   public rgP_2 private_() {
      return this.package_;
   }
}
