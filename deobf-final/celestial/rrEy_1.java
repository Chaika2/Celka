package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrEy_1 {
   private static final Logger class_ = LogManager.getLogger();
   private int break_ = 20;
   private final List<rTb_1> byte_ = Lists.newArrayList();
   private rTb_1 protected_ = new rTb_1();
   private double throws_;
   private double case_;
   private int catch_ = 200;
   private int private_ = 800;
   private int implements_ = 4;
   private an_3 finally_;
   private int extends_ = 6;
   private int native_ = 16;
   private int volatile_ = 4;

   public void byte_() {
      if (!this.private_()) {
         this.case_ = this.throws_;
      } else {
         rYB var1 = this.class_();
         rfH_2 var2 = this.break_();
         if (!(var1 instanceof rrEm_1)) {
            double var3 = (double)var2.b_() + var1.int_.nextDouble();
            double var5 = (double)var2.c_() + var1.int_.nextDouble();
            double var7 = (double)var2.d_() + var1.int_.nextDouble();
            var1.class_(rLQ.double_, var3, var5, var7, 0.0, 0.0, 0.0);
            var1.class_(rLQ.try_, var3, var5, var7, 0.0, 0.0, 0.0);
            if (this.break_ > 0) {
               this.break_--;
            }

            this.case_ = this.throws_;
            this.throws_ = (this.throws_ + (double)(1000.0F / ((float)this.break_ + 200.0F))) % 360.0;
         } else {
            if (this.break_ == -1) {
               this.implements_();
            }

            if (this.break_ > 0) {
               this.break_--;
               return;
            }

            boolean var19 = false;

            for (int var4 = 0; var4 < this.implements_; var4++) {
               rcd_3 var20 = this.protected_.break_();
               Optional var6 = aI_2.class_(var20);
               if (!var6.isPresent()) {
                  this.implements_();
                  return;
               }

               rcy_3 var21 = var20.protected_("Pos", 6);
               int var8 = var21.size();
               double var9 = var8 >= 1 ? var21.catch_(0) : (double)var2.b_() + (var1.int_.nextDouble() - var1.int_.nextDouble()) * (double)this.volatile_ + 0.5;
               double var11 = var8 >= 2 ? var21.catch_(1) : (double)(var2.c_() + var1.int_.nextInt(3) - 1);
               double var13 = var8 >= 3
                  ? var21.catch_(2)
                  : (double)var2.d_() + (var1.int_.nextDouble() - var1.int_.nextDouble()) * (double)this.volatile_ + 0.5;
               if (var1.break_(((aI_2)var6.get()).class_(var9, var11, var13))) {
                  rrEm_1 var15 = (rrEm_1)var1;
                  if (aq_3.class_((aI_2)var6.get(), var15, iO_2.SPAWNER, new rfH_2(var9, var11, var13), var1.long_())) {
                     an_3 var16 = aI_2.class_(var20, var1, var6x -> {
                        var6x.class_(var9, var11, var13, (Float)var6x.throws_[15], (Float)var6x.throws_[16]);
                        return var6x;
                     });
                     if (var16 == null) {
                        this.implements_();
                        return;
                     }

                     int var17 = var1.class_(
                           var16.getClass(),
                           new rfl_3(
                                 (double)var2.b_(),
                                 (double)var2.c_(),
                                 (double)var2.d_(),
                                 (double)(var2.b_() + 1),
                                 (double)(var2.c_() + 1),
                                 (double)(var2.d_() + 1)
                              )
                              .class_((double)this.volatile_)
                        )
                        .size();
                     if (var17 >= this.extends_) {
                        this.implements_();
                        return;
                     }

                     var16.class_(var16.rx(), var16.re(), var16.BO(), var1.int_.nextFloat() * 360.0F, 0.0F);
                     if (var16 instanceof is_3 var18) {
                        if (!var18.class_(var1, iO_2.SPAWNER) || !var18.class_(var1)) {
                           continue;
                        }

                        if (this.protected_.break_().throws_() == 1 && this.protected_.break_().byte_("id", 8)) {
                           ((is_3)var16).class_(var15, var1.throws_(var16.Bs()), iO_2.SPAWNER, (aU_2)null, (rcd_3)null);
                        }
                     }

                     if (!var15.implements_(var16)) {
                        this.implements_();
                        return;
                     }

                     var1.byte_(2004, var2, 0);
                     if (var16 instanceof is_3) {
                        ((is_3)var16).float_();
                     }

                     var19 = true;
                  }
               }
            }

            if (var19) {
               this.implements_();
            }
         }
      }
   }

   public abstract void class_(int var1);

   public abstract rYB class_();

   public void class_(rcd_3 var1) {
      this.break_ = var1.catch_("Delay");
      this.byte_.clear();
      if (var1.byte_("SpawnPotentials", 9)) {
         rcy_3 var2 = var1.protected_("SpawnPotentials", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            this.byte_.add(new rTb_1(var2.class_(var3)));
         }
      }

      if (var1.byte_("SpawnData", 10)) {
         this.class_(new rTb_1(1, var1.int_("SpawnData")));
      } else if (!this.byte_.isEmpty()) {
         this.class_(rTE.class_(this.class_().int_, this.byte_));
      }

      if (var1.byte_("MinSpawnDelay", 99)) {
         this.catch_ = var1.catch_("MinSpawnDelay");
         this.private_ = var1.catch_("MaxSpawnDelay");
         this.implements_ = var1.catch_("SpawnCount");
      }

      if (var1.byte_("MaxNearbyEntities", 99)) {
         this.extends_ = var1.catch_("MaxNearbyEntities");
         this.native_ = var1.catch_("RequiredPlayerRange");
      }

      if (var1.byte_("SpawnRange", 99)) {
         this.volatile_ = var1.catch_("SpawnRange");
      }

      if (this.class_() != null) {
         this.finally_ = null;
      }
   }

   public void class_(rTb_1 var1) {
      this.protected_ = var1;
   }

   public void class_(aI_2<?> var1) {
      this.protected_.break_().class_("id", rVL.transient_.break_(var1).toString());
   }

   public boolean break_(int var1) {
      if (var1 == 1 && this.class_().continue_) {
         this.break_ = this.catch_;
         return true;
      } else {
         return false;
      }
   }

   public abstract rfH_2 break_();

   public rcd_3 break_(rcd_3 var1) {
      rqO_2 var2 = this.catch_();
      if (var2 == null) {
         return var1;
      } else {
         var1.class_("Delay", (short)this.break_);
         var1.class_("MinSpawnDelay", (short)this.catch_);
         var1.class_("MaxSpawnDelay", (short)this.private_);
         var1.class_("SpawnCount", (short)this.implements_);
         var1.class_("MaxNearbyEntities", (short)this.extends_);
         var1.class_("RequiredPlayerRange", (short)this.native_);
         var1.class_("SpawnRange", (short)this.volatile_);
         var1.class_("SpawnData", this.protected_.break_().catch_());
         rcy_3 var3 = new rcy_3();
         if (this.byte_.isEmpty()) {
            var3.add(this.protected_.class_());
         } else {
            for (rTb_1 var5 : this.byte_) {
               var3.add(var5.class_());
            }
         }

         var1.class_("SpawnPotentials", var3);
         return var1;
      }
   }

   public double throws_() {
      return this.throws_;
   }

   private rqO_2 catch_() {
      String var1 = this.protected_.break_().native_("id");

      try {
         return rql_3.break_(var1) ? null : new rqO_2(var1);
      } catch (rqX_2 var4) {
         rfH_2 var3 = this.break_();
         class_.warn("Invalid entity id '{}' at spawner {}:[{},{},{}]", var1, this.class_().E().class_(), var3.b_(), var3.c_(), var3.d_());
         return null;
      }
   }

   public double case_() {
      return this.case_;
   }

   private void implements_() {
      if (this.private_ <= this.catch_) {
         this.break_ = this.catch_;
      } else {
         int var1 = this.private_ - this.catch_;
         this.break_ = this.catch_ + this.class_().int_.nextInt(var1);
      }

      if (!this.byte_.isEmpty()) {
         this.class_(rTE.class_(this.class_().int_, this.byte_));
      }

      this.class_(1);
   }

   public an_3 protected_() {
      if (this.finally_ == null) {
         this.finally_ = aI_2.class_(this.protected_.break_(), this.class_(), Function.identity());
         if (this.protected_.break_().throws_() == 1 && this.protected_.break_().byte_("id", 8) && this.finally_ instanceof is_3) {
         }
      }

      return this.finally_;
   }

   private boolean private_() {
      rfH_2 var1 = this.break_();
      return this.class_().class_((double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5, (double)this.native_);
   }
}
