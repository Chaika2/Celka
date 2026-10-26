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
   private static final Logger id_class = LogManager.getLogger();
   private static final ThreadFactory id_break = new ThreadFactoryBuilder().setDaemon(true).build();
   private final ImmutableSet<rqM_2<rYB>> id_byte;
   private final boolean id_protected;
   private final rrGk_1 id_throws;
   private final Thread id_case;
   private final DataFixer id_catch;
   private volatile boolean id_private = true;
   private volatile boolean id_implements;
   private volatile float id_finally;
   private volatile int id_extends;
   private volatile int id_native;
   private volatile int id_volatile;
   private final Object2FloatMap<rqM_2<rYB>> id_final = Object2FloatMaps.synchronize(new Object2FloatOpenCustomHashMap(rqR_2.id_extends()));
   private volatile rgP_2 id_package = new rgn_3("optimizeWorld.stage.counting");
   private static final Pattern id_int = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   private final rrEi_1 id_new;

   public ImmutableSet<rqM_2<rYB>> id_byte() {
      return this.id_byte;
   }

   public rTM(rrGk_1 var1, DataFixer var2, ImmutableSet<rqM_2<rYB>> var3, boolean var4) {
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_catch = var2;
      this.id_throws = var1;
      this.id_new = new rrEi_1(new File(this.id_throws.id_class(rYB.id_byte), "data"), var2);
      this.id_case = id_break.newThread(this::id_implements);
      this.id_case.setUncaughtExceptionHandler((var1x, var2x) -> {
         id_class.error("Error upgrading world", var2x);
         this.id_package = new rgn_3("optimizeWorld.stage.failed");
         this.id_implements = true;
      });
      this.id_case.start();
   }

   public void id_class() {
      this.id_private = false;

      try {
         this.id_case.join();
      } catch (InterruptedException var2) {
      }
   }

   public float id_class(rqM_2<rYB> var1) {
      return this.id_final.getFloat(var1);
   }

   private List<rfj_3> id_break(rqM_2<rYB> var1) {
      File var2 = this.id_throws.id_class(var1);
      File var3 = new File(var2, "region");
      File[] var4 = var3.listFiles((var0, var1x) -> var1x.endsWith(".mca"));
      if (var4 == null) {
         return ImmutableList.of();
      } else {
         ArrayList var5 = Lists.newArrayList();

         for (File var9 : var4) {
            Matcher var10 = id_int.matcher(var9.getName());
            if (var10.matches()) {
               int var11 = Integer.parseInt(var10.group(1)) << 5;
               int var12 = Integer.parseInt(var10.group(2)) << 5;

               try (roe_3 var13 = new roe_3(var9, var3, true)) {
                  for (int var14 = 0; var14 < 32; var14++) {
                     for (int var15 = 0; var15 < 32; var15++) {
                        rfj_3 var16 = new rfj_3(var14 + var11, var15 + var12);
                        if (var13.id_break(var16)) {
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

   public boolean id_break() {
      return this.id_implements;
   }

   public int id_throws() {
      return this.id_extends;
   }

   public int id_catch() {
      return this.id_volatile;
   }

   public int id_case() {
      return this.id_native;
   }

   private void id_implements() {
      this.id_extends = 0;
      Builder var1 = ImmutableMap.builder();
      UnmodifiableIterator var2 = this.id_byte.iterator();

      while (var2.hasNext()) {
         rqM_2 var3 = (rqM_2)var2.next();
         List var4 = this.id_break(var3);
         var1.put(var3, var4.listIterator());
         this.id_extends = this.id_extends + var4.size();
      }

      if (this.id_extends == 0) {
         this.id_implements = true;
      } else {
         float var25 = (float)this.id_extends;
         ImmutableMap var26 = var1.build();
         Builder var27 = ImmutableMap.builder();
         UnmodifiableIterator var5 = this.id_byte.iterator();

         while (var5.hasNext()) {
            rqM_2 var6 = (rqM_2)var5.next();
            File var7 = this.id_throws.id_class(var6);
            var27.put(var6, new roj_3(new File(var7, "region"), this.id_catch, true));
         }

         ImmutableMap var28 = var27.build();
         long var29 = rqR_2.id_break();
         this.id_package = new rgn_3("optimizeWorld.stage.upgrading");

         while (this.id_private) {
            boolean var8 = false;
            float var9 = 0.0F;
            UnmodifiableIterator var10 = this.id_byte.iterator();

            while (var10.hasNext()) {
               rqM_2 var11 = (rqM_2)var10.next();
               ListIterator var12 = (ListIterator)var26.get(var11);
               roj_3 var13 = (roj_3)var28.get(var11);
               if (var12.hasNext()) {
                  rfj_3 var14 = (rfj_3)var12.next();
                  boolean var15 = false;

                  try {
                     rcd_3 var16 = var13.id_class(var14);
                     if (var16 != null) {
                        int var34 = roj_3.id_class(var16);
                        rcd_3 var18 = var13.id_class(var11, () -> this.id_new, var16);
                        rcd_3 var19 = var18.id_int("Level");
                        rfj_3 var20 = new rfj_3(var19.id_private("xPos"), var19.id_private("zPos"));
                        if (!var20.equals(var14)) {
                           id_class.warn("Chunk {} has invalid position {}", var14, var20);
                        }

                        boolean var21 = var34 < rqu_3.id_class().getWorldVersion();
                        if (this.id_protected) {
                           var21 = var21 || var19.id_throws("Heightmaps");
                           var19.id_continue("Heightmaps");
                           var21 = var21 || var19.id_throws("isLightOn");
                           var19.id_continue("isLightOn");
                        }

                        if (var21) {
                           var13.id_class(var14, var18);
                           var15 = true;
                        }
                     }
                  } catch (KU var23) {
                     Throwable var17 = var23.getCause();
                     if (!(var17 instanceof IOException)) {
                        throw var23;
                     }

                     id_class.error("Error upgrading chunk {}", var14, var17);
                  } catch (IOException var24) {
                     id_class.error("Error upgrading chunk {}", var14, var24);
                  }

                  if (var15) {
                     this.id_native++;
                  } else {
                     this.id_volatile++;
                  }

                  var8 = true;
               }

               float var33 = (float)var12.nextIndex() / var25;
               this.id_final.put(var11, var33);
               var9 += var33;
            }

            this.id_finally = var9;
            if (!var8) {
               this.id_private = false;
            }
         }

         this.id_package = new rgn_3("optimizeWorld.stage.finished");
         UnmodifiableIterator var31 = var28.values().iterator();

         while (var31.hasNext()) {
            roj_3 var32 = (roj_3)var31.next();

            try {
               var32.close();
            } catch (IOException var22) {
               id_class.error("Error upgrading chunk", var22);
            }
         }

         this.id_new.id_class();
         var29 = rqR_2.id_break() - var29;
         id_class.info("World optimizaton finished after {} ms", var29);
         this.id_implements = true;
      }
   }

   public float id_protected() {
      return this.id_finally;
   }

   public rgP_2 id_private() {
      return this.id_package;
   }
}
