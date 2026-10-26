package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aZ_2 extends an_3 {
   private static final Logger class_ = LogManager.getLogger();
   private static final rut_3<Float> break_ = rmE_2.class_(aZ_2.class, ruw_3.byte_);
   private static final rut_3<Integer> protected_ = rmE_2.class_(aZ_2.class, ruw_3.break_);
   private static final rut_3<Boolean> catch_ = rmE_2.class_(aZ_2.class, ruw_3.implements_);
   private static final rut_3<rLx_1> private_ = rmE_2.class_(aZ_2.class, ruw_3.finally_);
   private rLi_1 implements_ = rAS.class_;
   private final List<rLY> finally_ = Lists.newArrayList();
   private final Map<an_3, Integer> extends_ = Maps.newHashMap();
   private int native_ = 600;
   private int volatile_ = 20;
   private int final_ = 20;
   private boolean package_;
   private int int_;
   private float new_;
   private float continue_;
   private iB_2 super_;
   private UUID this_;

   public void byte_(int var1) {
      this.volatile_ = var1;
   }

   public void byte_(float var1) {
      if (!((rYB)this.throws_[7]).continue_) {
         this.BQ().break_(break_, var1);
      }
   }

   public aZ_2(aI_2<? extends aZ_2> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[38] = var7;
      this.byte_(3.0F);
   }

   public aZ_2(rYB var1, double var2, double var4, double var6) {
      this(aI_2.class_, var1);
      this.new_(var2, var4, var6);
   }

   @Override
   public void this_() {
      super.this_();
      boolean var1 = this.catch_();
      float var2 = this.protected_();
      if (((rYB)this.throws_[7]).continue_) {
         rLx_1 var3 = this.case_();
         if (var1) {
            if (((Random)this.throws_[40]).nextBoolean()) {
               for (int var4 = 0; var4 < 2; var4++) {
                  float var5 = ((Random)this.throws_[40]).nextFloat() * (float) (Math.PI * 2);
                  float var6 = rfU_2.byte_(((Random)this.throws_[40]).nextFloat()) * 0.2F;
                  float var7 = rfU_2.break_(var5) * var6;
                  float var8 = rfU_2.class_(var5) * var6;
                  if (var3.protected_() == rLQ.else_) {
                     int var9 = ((Random)this.throws_[40]).nextBoolean() ? 16777215 : this.throws_();
                     int var10 = var9 >> 16 & 0xFF;
                     int var11 = var9 >> 8 & 0xFF;
                     int var12 = var9 & 0xFF;
                     ((rYB)this.throws_[7])
                        .break_(
                           var3,
                           this.rx() + (double)var7,
                           this.re(),
                           this.BO() + (double)var8,
                           (double)((float)var10 / 255.0F),
                           (double)((float)var11 / 255.0F),
                           (double)((float)var12 / 255.0F)
                        );
                  } else {
                     ((rYB)this.throws_[7]).break_(var3, this.rx() + (double)var7, this.re(), this.BO() + (double)var8, 0.0, 0.0, 0.0);
                  }
               }
            }
         } else {
            float var18 = (float) Math.PI * var2 * var2;

            for (int var20 = 0; (float)var20 < var18; var20++) {
               float var23 = ((Random)this.throws_[40]).nextFloat() * (float) (Math.PI * 2);
               float var26 = rfU_2.byte_(((Random)this.throws_[40]).nextFloat()) * var2;
               float var29 = rfU_2.break_(var23) * var26;
               float var31 = rfU_2.class_(var23) * var26;
               if (var3.protected_() == rLQ.else_) {
                  int var33 = this.throws_();
                  int var34 = var33 >> 16 & 0xFF;
                  int var36 = var33 >> 8 & 0xFF;
                  int var13 = var33 & 0xFF;
                  ((rYB)this.throws_[7])
                     .break_(
                        var3,
                        this.rx() + (double)var29,
                        this.re(),
                        this.BO() + (double)var31,
                        (double)((float)var34 / 255.0F),
                        (double)((float)var36 / 255.0F),
                        (double)((float)var13 / 255.0F)
                     );
               } else {
                  ((rYB)this.throws_[7])
                     .break_(
                        var3,
                        this.rx() + (double)var29,
                        this.re(),
                        this.BO() + (double)var31,
                        (0.5 - ((Random)this.throws_[40]).nextDouble()) * 0.15,
                        0.01F,
                        (0.5 - ((Random)this.throws_[40]).nextDouble()) * 0.15
                     );
               }
            }
         }
      } else {
         if ((Integer)this.throws_[41] >= this.volatile_ + this.native_) {
            this.PD();
            return;
         }

         boolean var17 = (Integer)this.throws_[41] < this.volatile_;
         if (var1 != var17) {
            this.class_(var17);
         }

         if (var17) {
            return;
         }

         if (this.continue_ != 0.0F) {
            var2 += this.continue_;
            if (var2 < 0.5F) {
               this.PD();
               return;
            }

            this.byte_(var2);
         }

         if ((Integer)this.throws_[41] % 5 == 0) {
            Iterator var19 = this.extends_.entrySet().iterator();

            while (var19.hasNext()) {
               Entry var21 = (Entry)var19.next();
               if ((Integer)this.throws_[41] >= (Integer)var21.getValue()) {
                  var19.remove();
               }
            }

            ArrayList var22 = Lists.newArrayList();

            for (rLY var27 : this.implements_.class_()) {
               var22.add(new rLY(var27.class_(), var27.break_() / 4, var27.byte_(), var27.protected_(), var27.throws_()));
            }

            var22.addAll(this.finally_);
            if (var22.isEmpty()) {
               this.extends_.clear();
            } else {
               List var25 = ((rYB)this.throws_[7]).class_(iB_2.class, this.rN());
               if (!var25.isEmpty()) {
                  for (iB_2 var30 : var25) {
                     if (!this.extends_.containsKey(var30) && var30.SL()) {
                        double var32 = var30.rx() - this.rx();
                        double var35 = var30.BO() - this.BO();
                        double var37 = var32 * var32 + var35 * var35;
                        if (var37 <= (double)(var2 * var2)) {
                           this.extends_.put(var30, (Integer)this.throws_[41] + this.final_);

                           for (rLY var16 : var22) {
                              if (var16.class_().class_()) {
                                 var16.class_().class_(this, this.implements_(), var30, var16.byte_(), 0.5);
                              } else {
                                 var30.break_(new rLY(var16));
                              }
                           }

                           if (this.new_ != 0.0F) {
                              var2 += this.new_;
                              if (var2 < 0.5F) {
                                 this.PD();
                                 return;
                              }

                              this.byte_(var2);
                           }

                           if (this.int_ != 0) {
                              this.native_ = this.native_ + this.int_;
                              if (this.native_ <= 0) {
                                 this.PD();
                                 return;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   protected void class_(boolean var1) {
      this.BQ().break_(catch_, var1);
   }

   public void class_(rLx_1 var1) {
      this.BQ().break_(private_, var1);
   }

   public void class_(int var1) {
      this.package_ = true;
      this.BQ().break_(protected_, var1);
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.break_("Age", (Integer)this.throws_[41]);
      var1.break_("Duration", this.native_);
      var1.break_("WaitTime", this.volatile_);
      var1.break_("ReapplicationDelay", this.final_);
      var1.break_("DurationOnUse", this.int_);
      var1.class_("RadiusOnUse", this.new_);
      var1.class_("RadiusPerTick", this.continue_);
      var1.class_("Radius", this.protected_());
      var1.class_("Particle", this.case_().byte_());
      if (this.this_ != null) {
         var1.class_("Owner", this.this_);
      }

      if (this.package_) {
         var1.break_("Color", this.throws_());
      }

      if (this.implements_ != rAS.class_ && this.implements_ != null) {
         var1.class_("Potion", rVL.double_.break_(this.implements_).toString());
      }

      if (!this.finally_.isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (rLY var4 : this.finally_) {
            var2.add(var4.class_(new rcd_3()));
         }

         var1.class_("Effects", var2);
      }
   }

   public void class_(iB_2 var1) {
      this.super_ = var1;
      this.this_ = var1 == null ? null : var1.ro();
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (break_.equals(var1)) {
         this.q_();
      }

      super.class_(var1);
   }

   public void class_(rLY var1) {
      this.finally_.add(var1);
      if (!this.package_) {
         this.final_();
      }
   }

   public void class_(rLi_1 var1) {
      this.implements_ = var1;
      if (!this.package_) {
         this.final_();
      }
   }

   public void break_(int var1) {
      this.native_ = var1;
   }

   @Override
   protected void break_(rcd_3 var1) {
      Integer var9 = var1.private_("Age");
      this.throws_[41] = var9;
      this.native_ = var1.private_("Duration");
      this.volatile_ = var1.private_("WaitTime");
      this.final_ = var1.private_("ReapplicationDelay");
      this.int_ = var1.private_("DurationOnUse");
      this.new_ = var1.finally_("RadiusOnUse");
      this.continue_ = var1.finally_("RadiusPerTick");
      this.byte_(var1.finally_("Radius"));
      if (var1.break_("Owner")) {
         this.this_ = var1.class_("Owner");
      }

      if (var1.byte_("Particle", 8)) {
         try {
            this.class_(Yc_1.break_(new StringReader(var1.native_("Particle"))));
         } catch (CommandSyntaxException var10) {
            class_.warn("Couldn't load custom particle {}", var1.native_("Particle"), var10);
         }
      }

      if (var1.byte_("Color", 99)) {
         this.class_(var1.private_("Color"));
      }

      if (var1.byte_("Potion", 8)) {
         this.class_(rAB.byte_(var1));
      }

      if (var1.byte_("Effects", 9)) {
         rcy_3 var2 = var1.protected_("Effects", 10);
         this.finally_.clear();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rLY var4 = rLY.break_(var2.class_(var3));
            if (var4 != null) {
               this.class_(var4);
            }
         }
      }
   }

   public int throws_() {
      return this.BQ().class_(protected_);
   }

   public boolean catch_() {
      return this.BQ().class_(catch_);
   }

   public void catch_(float var1) {
      this.continue_ = var1;
   }

   public rLx_1 case_() {
      return this.BQ().class_(private_);
   }

   public iB_2 implements_() {
      if (this.super_ == null && this.this_ != null && (rYB)this.throws_[7] instanceof rrEm_1) {
         an_3 var1 = ((rrEm_1)((rYB)this.throws_[7])).break_(this.this_);
         if (var1 instanceof iB_2) {
            this.super_ = (iB_2)var1;
         }
      }

      return this.super_;
   }

   public float protected_() {
      return this.BQ().class_(break_);
   }

   public void protected_(float var1) {
      this.new_ = var1;
   }

   public int private_() {
      return this.native_;
   }

   private void final_() {
      if (this.implements_ == rAS.class_ && this.finally_.isEmpty()) {
         this.BQ().break_(protected_, 0);
      } else {
         this.BQ().break_(protected_, rAB.class_(rAB.class_(this.implements_, this.finally_)));
      }
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return ap_3.break_(this.protected_() * 2.0F, 0.5F);
   }

   @Override
   protected void m_() {
      this.BQ().class_(protected_, 0);
      this.BQ().class_(break_, 0.5F);
      this.BQ().class_(catch_, false);
      this.BQ().class_(private_, rLQ.else_);
   }

   @Override
   public void q_() {
      double var1 = this.rx();
      double var3 = this.re();
      double var5 = this.BO();
      super.q_();
      this.new_(var1, var3, var5);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }

   @Override
   public Qs_1 r_() {
      return Qs_1.IGNORE;
   }
}
