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
   private static final Logger id_class = LogManager.getLogger();
   private static final rut_3<Float> id_break = rmE_2.id_class(aZ_2.class, ruw_3.id_byte);
   private static final rut_3<Integer> id_protected = rmE_2.id_class(aZ_2.class, ruw_3.id_break);
   private static final rut_3<Boolean> id_catch = rmE_2.id_class(aZ_2.class, ruw_3.id_implements);
   private static final rut_3<rLx_1> id_private = rmE_2.id_class(aZ_2.class, ruw_3.id_finally);
   private rLi_1 id_implements = rAS.id_class;
   private final List<rLY> id_finally = Lists.newArrayList();
   private final Map<an_3, Integer> id_extends = Maps.newHashMap();
   private int id_native = 600;
   private int id_volatile = 20;
   private int id_final = 20;
   private boolean id_package;
   private int id_int;
   private float id_new;
   private float id_continue;
   private iB_2 id_super;
   private UUID id_this;

   public void id_byte(int var1) {
      this.id_volatile = var1;
   }

   public void id_byte(float var1) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.BQ().id_break(id_break, var1);
      }
   }

   public aZ_2(aI_2<? extends aZ_2> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[38] = var7;
      this.id_byte(3.0F);
   }

   public aZ_2(rYB var1, double var2, double var4, double var6) {
      this(aI_2.id_class, var1);
      this.id_new(var2, var4, var6);
   }

   @Override
   public void id_this() {
      super.id_this();
      boolean var1 = this.id_catch();
      float var2 = this.id_protected();
      if (((rYB)this.id_throws[7]).id_continue) {
         rLx_1 var3 = this.id_case();
         if (var1) {
            if (((Random)this.id_throws[40]).nextBoolean()) {
               for (int var4 = 0; var4 < 2; var4++) {
                  float var5 = ((Random)this.id_throws[40]).nextFloat() * (float) (Math.PI * 2);
                  float var6 = rfU_2.id_byte(((Random)this.id_throws[40]).nextFloat()) * 0.2F;
                  float var7 = rfU_2.id_break(var5) * var6;
                  float var8 = rfU_2.id_class(var5) * var6;
                  if (var3.id_protected() == rLQ.id_else) {
                     int var9 = ((Random)this.id_throws[40]).nextBoolean() ? 16777215 : this.id_throws();
                     int var10 = var9 >> 16 & 0xFF;
                     int var11 = var9 >> 8 & 0xFF;
                     int var12 = var9 & 0xFF;
                     ((rYB)this.id_throws[7])
                        .id_break(
                           var3,
                           this.rx() + (double)var7,
                           this.re(),
                           this.BO() + (double)var8,
                           (double)((float)var10 / 255.0F),
                           (double)((float)var11 / 255.0F),
                           (double)((float)var12 / 255.0F)
                        );
                  } else {
                     ((rYB)this.id_throws[7]).id_break(var3, this.rx() + (double)var7, this.re(), this.BO() + (double)var8, 0.0, 0.0, 0.0);
                  }
               }
            }
         } else {
            float var18 = (float) Math.PI * var2 * var2;

            for (int var20 = 0; (float)var20 < var18; var20++) {
               float var23 = ((Random)this.id_throws[40]).nextFloat() * (float) (Math.PI * 2);
               float var26 = rfU_2.id_byte(((Random)this.id_throws[40]).nextFloat()) * var2;
               float var29 = rfU_2.id_break(var23) * var26;
               float var31 = rfU_2.id_class(var23) * var26;
               if (var3.id_protected() == rLQ.id_else) {
                  int var33 = this.id_throws();
                  int var34 = var33 >> 16 & 0xFF;
                  int var36 = var33 >> 8 & 0xFF;
                  int var13 = var33 & 0xFF;
                  ((rYB)this.id_throws[7])
                     .id_break(
                        var3,
                        this.rx() + (double)var29,
                        this.re(),
                        this.BO() + (double)var31,
                        (double)((float)var34 / 255.0F),
                        (double)((float)var36 / 255.0F),
                        (double)((float)var13 / 255.0F)
                     );
               } else {
                  ((rYB)this.id_throws[7])
                     .id_break(
                        var3,
                        this.rx() + (double)var29,
                        this.re(),
                        this.BO() + (double)var31,
                        (0.5 - ((Random)this.id_throws[40]).nextDouble()) * 0.15,
                        0.01F,
                        (0.5 - ((Random)this.id_throws[40]).nextDouble()) * 0.15
                     );
               }
            }
         }
      } else {
         if ((Integer)this.id_throws[41] >= this.id_volatile + this.id_native) {
            this.PD();
            return;
         }

         boolean var17 = (Integer)this.id_throws[41] < this.id_volatile;
         if (var1 != var17) {
            this.id_class(var17);
         }

         if (var17) {
            return;
         }

         if (this.id_continue != 0.0F) {
            var2 += this.id_continue;
            if (var2 < 0.5F) {
               this.PD();
               return;
            }

            this.id_byte(var2);
         }

         if ((Integer)this.id_throws[41] % 5 == 0) {
            Iterator var19 = this.id_extends.entrySet().iterator();

            while (var19.hasNext()) {
               Entry var21 = (Entry)var19.next();
               if ((Integer)this.id_throws[41] >= (Integer)var21.getValue()) {
                  var19.remove();
               }
            }

            ArrayList var22 = Lists.newArrayList();

            for (rLY var27 : this.id_implements.id_class()) {
               var22.add(new rLY(var27.id_class(), var27.id_break() / 4, var27.id_byte(), var27.id_protected(), var27.id_throws()));
            }

            var22.addAll(this.id_finally);
            if (var22.isEmpty()) {
               this.id_extends.clear();
            } else {
               List var25 = ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN());
               if (!var25.isEmpty()) {
                  for (iB_2 var30 : var25) {
                     if (!this.id_extends.containsKey(var30) && var30.SL()) {
                        double var32 = var30.rx() - this.rx();
                        double var35 = var30.BO() - this.BO();
                        double var37 = var32 * var32 + var35 * var35;
                        if (var37 <= (double)(var2 * var2)) {
                           this.id_extends.put(var30, (Integer)this.id_throws[41] + this.id_final);

                           for (rLY var16 : var22) {
                              if (var16.id_class().id_class()) {
                                 var16.id_class().id_class(this, this.id_implements(), var30, var16.id_byte(), 0.5);
                              } else {
                                 var30.id_break(new rLY(var16));
                              }
                           }

                           if (this.id_new != 0.0F) {
                              var2 += this.id_new;
                              if (var2 < 0.5F) {
                                 this.PD();
                                 return;
                              }

                              this.id_byte(var2);
                           }

                           if (this.id_int != 0) {
                              this.id_native = this.id_native + this.id_int;
                              if (this.id_native <= 0) {
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

   protected void id_class(boolean var1) {
      this.BQ().id_break(id_catch, var1);
   }

   public void id_class(rLx_1 var1) {
      this.BQ().id_break(id_private, var1);
   }

   public void id_class(int var1) {
      this.id_package = true;
      this.BQ().id_break(id_protected, var1);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_break("Age", (Integer)this.id_throws[41]);
      var1.id_break("Duration", this.id_native);
      var1.id_break("WaitTime", this.id_volatile);
      var1.id_break("ReapplicationDelay", this.id_final);
      var1.id_break("DurationOnUse", this.id_int);
      var1.id_class("RadiusOnUse", this.id_new);
      var1.id_class("RadiusPerTick", this.id_continue);
      var1.id_class("Radius", this.id_protected());
      var1.id_class("Particle", this.id_case().id_byte());
      if (this.id_this != null) {
         var1.id_class("Owner", this.id_this);
      }

      if (this.id_package) {
         var1.id_break("Color", this.id_throws());
      }

      if (this.id_implements != rAS.id_class && this.id_implements != null) {
         var1.id_class("Potion", rVL.id_double.id_break(this.id_implements).toString());
      }

      if (!this.id_finally.isEmpty()) {
         rcy_3 var2 = new rcy_3();

         for (rLY var4 : this.id_finally) {
            var2.add(var4.id_class(new rcd_3()));
         }

         var1.id_class("Effects", var2);
      }
   }

   public void id_class(iB_2 var1) {
      this.id_super = var1;
      this.id_this = var1 == null ? null : var1.ro();
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_break.equals(var1)) {
         this.q_();
      }

      super.id_class(var1);
   }

   public void id_class(rLY var1) {
      this.id_finally.add(var1);
      if (!this.id_package) {
         this.id_final();
      }
   }

   public void id_class(rLi_1 var1) {
      this.id_implements = var1;
      if (!this.id_package) {
         this.id_final();
      }
   }

   public void id_break(int var1) {
      this.id_native = var1;
   }

   @Override
   protected void id_break(rcd_3 var1) {
      Integer var9 = var1.id_private("Age");
      this.id_throws[41] = var9;
      this.id_native = var1.id_private("Duration");
      this.id_volatile = var1.id_private("WaitTime");
      this.id_final = var1.id_private("ReapplicationDelay");
      this.id_int = var1.id_private("DurationOnUse");
      this.id_new = var1.id_finally("RadiusOnUse");
      this.id_continue = var1.id_finally("RadiusPerTick");
      this.id_byte(var1.id_finally("Radius"));
      if (var1.id_break("Owner")) {
         this.id_this = var1.id_class("Owner");
      }

      if (var1.id_byte("Particle", 8)) {
         try {
            this.id_class(Yc_1.id_break(new StringReader(var1.id_native("Particle"))));
         } catch (CommandSyntaxException var10) {
            id_class.warn("Couldn't load custom particle {}", var1.id_native("Particle"), var10);
         }
      }

      if (var1.id_byte("Color", 99)) {
         this.id_class(var1.id_private("Color"));
      }

      if (var1.id_byte("Potion", 8)) {
         this.id_class(rAB.id_byte(var1));
      }

      if (var1.id_byte("Effects", 9)) {
         rcy_3 var2 = var1.id_protected("Effects", 10);
         this.id_finally.clear();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rLY var4 = rLY.id_break(var2.id_class(var3));
            if (var4 != null) {
               this.id_class(var4);
            }
         }
      }
   }

   public int id_throws() {
      return this.BQ().id_class(id_protected);
   }

   public boolean id_catch() {
      return this.BQ().id_class(id_catch);
   }

   public void id_catch(float var1) {
      this.id_continue = var1;
   }

   public rLx_1 id_case() {
      return this.BQ().id_class(id_private);
   }

   public iB_2 id_implements() {
      if (this.id_super == null && this.id_this != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
         an_3 var1 = ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_this);
         if (var1 instanceof iB_2) {
            this.id_super = (iB_2)var1;
         }
      }

      return this.id_super;
   }

   public float id_protected() {
      return this.BQ().id_class(id_break);
   }

   public void id_protected(float var1) {
      this.id_new = var1;
   }

   public int id_private() {
      return this.id_native;
   }

   private void id_final() {
      if (this.id_implements == rAS.id_class && this.id_finally.isEmpty()) {
         this.BQ().id_break(id_protected, 0);
      } else {
         this.BQ().id_break(id_protected, rAB.id_class(rAB.id_class(this.id_implements, this.id_finally)));
      }
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return ap_3.id_break(this.id_protected() * 2.0F, 0.5F);
   }

   @Override
   protected void m_() {
      this.BQ().id_class(id_protected, 0);
      this.BQ().id_class(id_break, 0.5F);
      this.BQ().id_class(id_catch, false);
      this.BQ().id_class(id_private, rLQ.id_else);
   }

   @Override
   public void q_() {
      double var1 = this.rx();
      double var3 = this.re();
      double var5 = this.BO();
      super.q_();
      this.id_new(var1, var3, var5);
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
