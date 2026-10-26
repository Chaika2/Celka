package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrEy_1 {
   private static final Logger id_class = LogManager.getLogger();
   private int id_break = 20;
   private final List<rTb_1> id_byte = Lists.newArrayList();
   private rTb_1 id_protected = new rTb_1();
   private double id_throws;
   private double id_case;
   private int id_catch = 200;
   private int id_private = 800;
   private int id_implements = 4;
   private an_3 id_finally;
   private int id_extends = 6;
   private int id_native = 16;
   private int id_volatile = 4;

   public void id_byte() {
      if (!this.id_private()) {
         this.id_case = this.id_throws;
      } else {
         rYB var1 = this.id_class();
         rfH_2 var2 = this.id_break();
         if (!(var1 instanceof rrEm_1)) {
            double var3 = (double)var2.b_() + var1.id_int.nextDouble();
            double var5 = (double)var2.c_() + var1.id_int.nextDouble();
            double var7 = (double)var2.d_() + var1.id_int.nextDouble();
            var1.id_class(rLQ.id_double, var3, var5, var7, 0.0, 0.0, 0.0);
            var1.id_class(rLQ.id_try, var3, var5, var7, 0.0, 0.0, 0.0);
            if (this.id_break > 0) {
               this.id_break--;
            }

            this.id_case = this.id_throws;
            this.id_throws = (this.id_throws + (double)(1000.0F / ((float)this.id_break + 200.0F))) % 360.0;
         } else {
            if (this.id_break == -1) {
               this.id_implements();
            }

            if (this.id_break > 0) {
               this.id_break--;
               return;
            }

            boolean var19 = false;

            for (int var4 = 0; var4 < this.id_implements; var4++) {
               rcd_3 var20 = this.id_protected.id_break();
               Optional var6 = aI_2.id_class(var20);
               if (!var6.isPresent()) {
                  this.id_implements();
                  return;
               }

               rcy_3 var21 = var20.id_protected("Pos", 6);
               int var8 = var21.size();
               double var9 = var8 >= 1
                  ? var21.id_catch(0)
                  : (double)var2.b_() + (var1.id_int.nextDouble() - var1.id_int.nextDouble()) * (double)this.id_volatile + 0.5;
               double var11 = var8 >= 2 ? var21.id_catch(1) : (double)(var2.c_() + var1.id_int.nextInt(3) - 1);
               double var13 = var8 >= 3
                  ? var21.id_catch(2)
                  : (double)var2.d_() + (var1.id_int.nextDouble() - var1.id_int.nextDouble()) * (double)this.id_volatile + 0.5;
               if (var1.id_break(((aI_2)var6.get()).id_class(var9, var11, var13))) {
                  rrEm_1 var15 = (rrEm_1)var1;
                  if (aq_3.id_class((aI_2)var6.get(), var15, iO_2.SPAWNER, new rfH_2(var9, var11, var13), var1.id_long())) {
                     an_3 var16 = aI_2.id_class(var20, var1, var6x -> {
                        var6x.id_class(var9, var11, var13, (Float)var6x.id_throws[15], (Float)var6x.id_throws[16]);
                        return var6x;
                     });
                     if (var16 == null) {
                        this.id_implements();
                        return;
                     }

                     int var17 = var1.id_class(
                           var16.getClass(),
                           new rfl_3(
                                 (double)var2.b_(),
                                 (double)var2.c_(),
                                 (double)var2.d_(),
                                 (double)(var2.b_() + 1),
                                 (double)(var2.c_() + 1),
                                 (double)(var2.d_() + 1)
                              )
                              .id_class((double)this.id_volatile)
                        )
                        .size();
                     if (var17 >= this.id_extends) {
                        this.id_implements();
                        return;
                     }

                     var16.id_class(var16.rx(), var16.re(), var16.BO(), var1.id_int.nextFloat() * 360.0F, 0.0F);
                     if (var16 instanceof is_3 var18) {
                        if (!var18.id_class(var1, iO_2.SPAWNER) || !var18.id_class(var1)) {
                           continue;
                        }

                        if (this.id_protected.id_break().id_throws() == 1 && this.id_protected.id_break().id_byte("id", 8)) {
                           ((is_3)var16).id_class(var15, var1.id_throws(var16.Bs()), iO_2.SPAWNER, (aU_2)null, (rcd_3)null);
                        }
                     }

                     if (!var15.id_implements(var16)) {
                        this.id_implements();
                        return;
                     }

                     var1.id_byte(2004, var2, 0);
                     if (var16 instanceof is_3) {
                        ((is_3)var16).id_float();
                     }

                     var19 = true;
                  }
               }
            }

            if (var19) {
               this.id_implements();
            }
         }
      }
   }

   public abstract void id_class(int var1);

   public abstract rYB id_class();

   public void id_class(rcd_3 var1) {
      this.id_break = var1.id_catch("Delay");
      this.id_byte.clear();
      if (var1.id_byte("SpawnPotentials", 9)) {
         rcy_3 var2 = var1.id_protected("SpawnPotentials", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            this.id_byte.add(new rTb_1(var2.id_class(var3)));
         }
      }

      if (var1.id_byte("SpawnData", 10)) {
         this.id_class(new rTb_1(1, var1.id_int("SpawnData")));
      } else if (!this.id_byte.isEmpty()) {
         this.id_class(rTE.id_class(this.id_class().id_int, this.id_byte));
      }

      if (var1.id_byte("MinSpawnDelay", 99)) {
         this.id_catch = var1.id_catch("MinSpawnDelay");
         this.id_private = var1.id_catch("MaxSpawnDelay");
         this.id_implements = var1.id_catch("SpawnCount");
      }

      if (var1.id_byte("MaxNearbyEntities", 99)) {
         this.id_extends = var1.id_catch("MaxNearbyEntities");
         this.id_native = var1.id_catch("RequiredPlayerRange");
      }

      if (var1.id_byte("SpawnRange", 99)) {
         this.id_volatile = var1.id_catch("SpawnRange");
      }

      if (this.id_class() != null) {
         this.id_finally = null;
      }
   }

   public void id_class(rTb_1 var1) {
      this.id_protected = var1;
   }

   public void id_class(aI_2<?> var1) {
      this.id_protected.id_break().id_class("id", rVL.id_transient.id_break(var1).toString());
   }

   public boolean id_break(int var1) {
      if (var1 == 1 && this.id_class().id_continue) {
         this.id_break = this.id_catch;
         return true;
      } else {
         return false;
      }
   }

   public abstract rfH_2 id_break();

   public rcd_3 id_break(rcd_3 var1) {
      rqO_2 var2 = this.id_catch();
      if (var2 == null) {
         return var1;
      } else {
         var1.id_class("Delay", (short)this.id_break);
         var1.id_class("MinSpawnDelay", (short)this.id_catch);
         var1.id_class("MaxSpawnDelay", (short)this.id_private);
         var1.id_class("SpawnCount", (short)this.id_implements);
         var1.id_class("MaxNearbyEntities", (short)this.id_extends);
         var1.id_class("RequiredPlayerRange", (short)this.id_native);
         var1.id_class("SpawnRange", (short)this.id_volatile);
         var1.id_class("SpawnData", this.id_protected.id_break().id_catch());
         rcy_3 var3 = new rcy_3();
         if (this.id_byte.isEmpty()) {
            var3.add(this.id_protected.id_class());
         } else {
            for (rTb_1 var5 : this.id_byte) {
               var3.add(var5.id_class());
            }
         }

         var1.id_class("SpawnPotentials", var3);
         return var1;
      }
   }

   public double id_throws() {
      return this.id_throws;
   }

   private rqO_2 id_catch() {
      String var1 = this.id_protected.id_break().id_native("id");

      try {
         return rql_3.id_break(var1) ? null : new rqO_2(var1);
      } catch (rqX_2 var4) {
         rfH_2 var3 = this.id_break();
         id_class.warn("Invalid entity id '{}' at spawner {}:[{},{},{}]", var1, this.id_class().E().id_class(), var3.b_(), var3.c_(), var3.d_());
         return null;
      }
   }

   public double id_case() {
      return this.id_case;
   }

   private void id_implements() {
      if (this.id_private <= this.id_catch) {
         this.id_break = this.id_catch;
      } else {
         int var1 = this.id_private - this.id_catch;
         this.id_break = this.id_catch + this.id_class().id_int.nextInt(var1);
      }

      if (!this.id_byte.isEmpty()) {
         this.id_class(rTE.id_class(this.id_class().id_int, this.id_byte));
      }

      this.id_class(1);
   }

   public an_3 id_protected() {
      if (this.id_finally == null) {
         this.id_finally = aI_2.id_class(this.id_protected.id_break(), this.id_class(), Function.identity());
         if (this.id_protected.id_break().id_throws() == 1 && this.id_protected.id_break().id_byte("id", 8) && this.id_finally instanceof is_3) {
         }
      }

      return this.id_finally;
   }

   private boolean id_private() {
      rfH_2 var1 = this.id_break();
      return this.id_class().id_class((double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5, (double)this.id_native);
   }
}
