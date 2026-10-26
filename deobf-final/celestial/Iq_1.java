package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Iq_1 {
   public float class_ = 64.0F;
   public float break_ = 32.0F;
   private int continue_;
   private int super_;
   public float byte_;
   public float protected_;
   public float throws_;
   public float case_;
   public float catch_;
   public float private_;
   public boolean implements_;
   public boolean finally_ = true;
   public final ObjectList<IT> extends_ = new ObjectArrayList();
   public final ObjectList<Iq_1> native_ = new ObjectArrayList();
   public List volatile_ = new ArrayList();
   public boolean final_ = false;
   public float package_ = 1.0F;
   public float int_ = 1.0F;
   public float new_ = 1.0F;
   private rqO_2 this_ = null;
   private String else_ = null;
   private rrXx_1 synchronized_;
   private final yX_2 return_ = rrbb_3.z();

   public String byte_() {
      return this.else_;
   }

   public Iq_1 byte_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         Iq_1 var2 = this.break_(var1);
         if (var2 != null) {
            return var2;
         } else {
            if (this.native_ != null) {
               for (int var3 = 0; var3 < this.native_.size(); var3++) {
                  Iq_1 var4 = (Iq_1)this.native_.get(var3);
                  Iq_1 var5 = var4.byte_(var1);
                  if (var5 != null) {
                     return var5;
                  }
               }
            }

            return null;
         }
      }
   }

   private Iq_1() {
   }

   public Iq_1(In_1 var1) {
      var1.a_(this);
      this.break_(var1.return_, var1.public_);
   }

   public Iq_1(In_1 var1, int var2, int var3) {
      this(var1.return_, var1.public_, var2, var3);
      var1.a_(this);
   }

   public Iq_1(int var1, int var2, int var3, int var4) {
      this.break_(var1, var2);
      this.class_(var3, var4);
   }

   @Override
   public String toString() {
      return "id: "
         + this.else_
         + ", boxes: "
         + (this.extends_ != null ? this.extends_.size() : null)
         + ", submodels: "
         + (this.native_ != null ? this.native_.size() : null);
   }

   public void class_(Iq_1 var1) {
      this.case_ = var1.case_;
      this.catch_ = var1.catch_;
      this.private_ = var1.private_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
   }

   public void class_(rqO_2 var1) {
      this.this_ = var1;
   }

   public void class_(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.volatile_.add(new rrJq_1(this, this.continue_, this.super_, var1, var2, var3, var4, var5, var6, var7));
   }

   public IT class_(Random var1) {
      return (IT)this.extends_.get(var1.nextInt(this.extends_.size()));
   }

   private void class_(MH var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      rjV_2 var9 = var1.class_();
      rjj_3 var10 = var1.break_();
      boolean var11 = rrbb_3.rs() && rrdZ.p && rrbb_3.final_();
      ObjectListIterator var12 = this.extends_.iterator();

      while (var12.hasNext()) {
         IT var13 = (IT)var12.next();
         rrxq_3[][] var14 = null;
         if (var11) {
            rrbD_2 var15 = rrME.class_();
            if (var15 != null) {
               var14 = var13.class_(var15.class_());
            }
         }

         int var30 = var13.catch_.length;

         for (int var16 = 0; var16 < var30; var16++) {
            Iw_1 var17 = var13.catch_[var16];
            if (var17 != null) {
               if (var14 != null) {
                  var2.class_(var14[var16]);
               }

               rje_3 var18 = var2.class_(var17.break_);
               var18.class_(var10);
               float var19 = var18.class_();
               float var20 = var18.break_();
               float var21 = var18.byte_();

               for (int var22 = 0; var22 < 4; var22++) {
                  It_1 var23 = var17.class_[var22];
                  float var24 = var23.class_.class_() / 16.0F;
                  float var25 = var23.class_.break_() / 16.0F;
                  float var26 = var23.class_.byte_() / 16.0F;
                  float var27 = var9.break_(var24, var25, var26, 1.0F);
                  float var28 = var9.byte_(var24, var25, var26, 1.0F);
                  float var29 = var9.protected_(var24, var25, var26, 1.0F);
                  var2.class_(var27, var28, var29, var5, var6, var7, var8, var23.break_, var23.byte_, var4, var3, var19, var20, var21);
               }
            }
         }
      }
   }

   public void class_(Ml_1 var1) {
      var1.class_((double)(this.byte_ / 16.0F), (double)(this.protected_ / 16.0F), (double)(this.throws_ / 16.0F));
      if (this.private_ != 0.0F) {
         var1.class_(rje_3.case_.break_(this.private_));
      }

      if (this.catch_ != 0.0F) {
         var1.class_(rje_3.protected_.break_(this.catch_));
      }

      if (this.case_ != 0.0F) {
         var1.class_(rje_3.break_.break_(this.case_));
      }
   }

   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5) {
      this.class_(var1, var2, var3, var4, 1.0F, 1.0F, 1.0F, var5);
   }

   public void class_(rrXx_1 var1) {
      this.synchronized_ = var1;
   }

   public Iq_1 class_() {
      Iq_1 var1 = new Iq_1();
      var1.class_(this);
      return var1;
   }

   public Iq_1 class_(int var1) {
      if (this.native_ == null) {
         return null;
      } else {
         return var1 >= 0 && var1 < this.native_.size() ? (Iq_1)this.native_.get(var1) : null;
      }
   }

   public void class_(int[][] var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.extends_.add(new IT(var1, var2, var3, var4, var5, var6, var7, var8, var8, var8, this.implements_, this.class_, this.break_));
   }

   public void class_(String var1) {
      this.else_ = var1;
   }

   public Iq_1 class_(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      this.class_(this.continue_, this.super_, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, false);
      return this;
   }

   public void class_(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.class_(this.continue_, this.super_, var1, var2, var3, var4, var5, var6, var7, var7, var7, this.implements_, false);
   }

   public void class_(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.class_(this.continue_, this.super_, var1, var2, var3, var4, var5, var6, var7, var8, var9, this.implements_, false);
   }

   public void class_(float var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8) {
      this.class_(this.continue_, this.super_, var1, var2, var3, var4, var5, var6, var7, var7, var7, var8, false);
   }

   public Iq_1 class_(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_(this.continue_, this.super_, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, this.implements_, false);
      return this;
   }

   public Iq_1 class_(String var1, float var2, float var3, float var4, int var5, int var6, int var7, float var8, int var9, int var10) {
      this.class_(var9, var10);
      this.class_(this.continue_, this.super_, var2, var3, var4, (float)var5, (float)var6, (float)var7, var8, var8, var8, this.implements_, false);
      return this;
   }

   public Iq_1 class_(int var1, int var2) {
      this.continue_ = var1;
      this.super_ = var2;
      return this;
   }

   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.finally_ && (!this.extends_.isEmpty() || !this.native_.isEmpty() || !this.volatile_.isEmpty())) {
         HU var9 = null;
         Hd_1 var10 = null;
         if (this.this_ != null) {
            if (this.return_.case_) {
               return;
            }

            var10 = var2.protected_();
            if (var10 != null) {
               Ok_1 var11 = var2.throws_();
               var9 = var10.byte_();
               var2 = var10.class_(this.this_, var2);
               if (var11 != null) {
                  var2 = OQ.class_(var11, var2);
               }
            }
         }

         if (this.synchronized_ != null) {
            this.synchronized_.class_();
         }

         var1.class_();
         this.class_(var1);
         this.class_(var1.byte_(), var2, var3, var4, var5, var6, var7, var8);
         int var15 = this.native_.size();

         for (int var12 = 0; var12 < var15; var12++) {
            Iq_1 var13 = (Iq_1)this.native_.get(var12);
            var13.class_(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         int var16 = this.volatile_.size();

         for (int var17 = 0; var17 < var16; var17++) {
            rrJq_1 var14 = (rrJq_1)this.volatile_.get(var17);
            var14.class_(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         var1.break_();
         if (var9 != null) {
            var10.getBuffer(var9);
         }
      }
   }

   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4) {
      this.class_(var1, var2, var3, var4, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void class_(float var1, float var2, float var3) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
   }

   private void class_(
      int var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13
   ) {
      this.extends_.add(new IT(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, this.class_, this.break_));
   }

   public Iq_1 break_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         if (this.native_ != null) {
            for (int var2 = 0; var2 < this.native_.size(); var2++) {
               Iq_1 var3 = (Iq_1)this.native_.get(var2);
               if (var1.equals(var3.byte_())) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public void break_(Iq_1 var1) {
      this.native_.add(var1);
   }

   public Iq_1 break_(int var1, int var2) {
      this.class_ = (float)var1;
      this.break_ = (float)var2;
      return this;
   }

   public rqO_2 break_() {
      return this.this_;
   }
}
